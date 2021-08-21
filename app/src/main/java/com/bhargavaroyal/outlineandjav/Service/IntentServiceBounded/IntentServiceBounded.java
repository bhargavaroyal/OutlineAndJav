package com.bhargavaroyal.outlineandjav.Service.IntentServiceBounded;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.bhargavaroyal.outlineandjav.R;

import java.util.Random;

public class IntentServiceBounded extends IntentService {


    private int mRandomNumber;
    private boolean mIsRandomGeneratorOn;

    private final int MIN = 0;
    private final int MAX = 100;

    public IntentServiceBounded() {
        super(IntentServiceBounded.class.getSimpleName());
    }

    class MyIntentServiceBinder extends Binder {
        public IntentServiceBounded getService() {
            return IntentServiceBounded.this;
        }
    }

    private IBinder mBinder = new MyIntentServiceBinder();

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(getString(R.string.service_demo_tag), "In OnBind");
        return mBinder;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.i(getString(R.string.service_demo_tag), "Service Started");
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.i(getString(R.string.service_demo_tag), "In OnReBind");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        mIsRandomGeneratorOn = true;
        startRandomNumberGenerator();
    }

    private void startRandomNumberGenerator() {
        while (mIsRandomGeneratorOn) {
            try {
                Thread.sleep(1000);
                if (mIsRandomGeneratorOn) {
                    mRandomNumber = new Random().nextInt(MAX) + MIN;
                    Log.i(getString(R.string.service_demo_tag), "Thread id: " + Thread.currentThread().getId() + ", Random Number: " + mRandomNumber);
                }
            } catch (InterruptedException e) {
                Log.i(getString(R.string.service_demo_tag), "Thread Interrupted");
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mIsRandomGeneratorOn = false;
        Log.i(getString(R.string.service_demo_tag), "Service Destroyed");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(getString(R.string.service_demo_tag), "In onUnbind");
        return super.onUnbind(intent);
    }

    public int getRandomNumber() {
        return mRandomNumber;
    }
}