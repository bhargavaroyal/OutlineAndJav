package com.bhargavaroyal.outlineandjav.Service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;


import java.util.Random;

public class MyService extends Service {
    private static final String TAG = "MyService" ;
    private int mRandomNumber;
    private boolean mIsRandomGeneratorOn;

    private final int MIN=0;
    private final int MAX=100;

    public static final int GET_COUNT=0;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "In onStartCommend, thread id: "+Thread.currentThread().getId());
        mIsRandomGeneratorOn =true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                startRandomNumberGenerator();
            }
        }).start();
        return START_STICKY;
    }

    class MyServiceBinder extends Binder {
        public MyService getService(){
            return MyService.this;
        }
    }

    private IBinder mBinder=new MyServiceBinder();


    private class RandomNumberRequestHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            Log.i(TAG,"Message intercepted");
            switch (msg.what){
                case GET_COUNT: Message  messageSendRandomNumber= Message.obtain(null,GET_COUNT);
                    messageSendRandomNumber.arg1=getRandomNumber();
                    try{
                        Log.i(TAG,"Replaying with random number to requester");
                        msg.replyTo.send(messageSendRandomNumber);
                    }catch (RemoteException e){
                        Log.i(TAG,""+e.getMessage());
                    }
            }
            super.handleMessage(msg);
        }
    }
    private Messenger randomNumberMessenger=new Messenger(new RandomNumberRequestHandler());
    public int getRandomNumber(){
        return mRandomNumber;
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind() called with: intent = [" + intent + "]");
        Log.i(TAG,"In OnBind");
        if(intent.getPackage()=="com.example.remotebindclientapp"){
            return randomNumberMessenger.getBinder();
        }else{
            return mBinder; 
        }
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG,"In onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
        stopRandomNumberGenerator();
        Log.i(TAG,"Service Destroyed");
    }
    private void startRandomNumberGenerator(){
        Log.d(TAG, "startRandomNumberGenerator() called");
        while (mIsRandomGeneratorOn){
            try{
                Thread.sleep(1000);
                if(mIsRandomGeneratorOn){
                    mRandomNumber =new Random().nextInt(MAX)+MIN;
                    Log.d(TAG, "startRandomNumberGenerator() calledThread id: "+Thread.currentThread().getId()+
                            " Random Number: "+ mRandomNumber);
                }
            }catch (InterruptedException e){
                Log.d(TAG, "Thread Interrupted");
            }

        }
    }

    private void stopRandomNumberGenerator(){
        mIsRandomGeneratorOn =false;
    }

}
