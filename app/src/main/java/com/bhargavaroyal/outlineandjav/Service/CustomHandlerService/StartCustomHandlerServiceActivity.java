package com.bhargavaroyal.outlineandjav.Service.CustomHandlerService;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class StartCustomHandlerServiceActivity extends Activity implements View.OnClickListener {

    private static final String TAG = StartCustomHandlerServiceActivity.class.getSimpleName();

    private Button buttonStart, buttonStop;
    private TextView textViewthreadCount;
    int count = 0;

    private boolean mStopLoop;

    LooperThread looperThread;
    CustomHandlerThread customHandlerThread;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_handler_service);

        Log.i(TAG,"Thread id of Main thread: "+Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);

        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        customHandlerThread = new CustomHandlerThread("CustomHandlerThread");
        customHandlerThread.start();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                mStopLoop = true;
                executeOnCustoLooperWithCustomHandler();
                break;
            case R.id.buttonStopthread: mStopLoop = false;
                break;

        }
    }

    public void executeOnCustoLooperWithCustomHandler(){

        customHandlerThread.mHandler.post(new Runnable() {
            @Override
            public void run() {
                while (mStopLoop){
                    try{
                        Thread.sleep(1000);
                        count++;
                        Log.i(TAG,"Thread id from where Runnable got posted: "+Thread.currentThread().getId());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.i(TAG,"Thread id of runOnUIThread: "+Thread.currentThread().getId()+", Count : "+count);
                                textViewthreadCount.setText(" "+count);
                            }
                        });
                    }catch (InterruptedException exception){
                        Log.i(TAG,"Thread for interrupted");
                    }

                }
            }
        });
    }

    public void executeOnCustomLooper(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mStopLoop){
                    try{
                        Log.i(TAG,"Thread id of thread that sends message: "+Thread.currentThread().getId());
                        Thread.sleep(1000);
                        count++;
                        Message message=new Message();
                        message.obj=""+count;
                        customHandlerThread.mHandler.sendMessage(message);
                    }catch (InterruptedException exception){
                        Log.i(TAG,"Thread for interrupted");
                    }

                }
            }
        }).start();

    }

    private Message getMessageWithCount(String count){
        Message message=new Message();
        message.obj=""+count;
        return message;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(looperThread!=null && looperThread.isAlive()){
            looperThread.handler.getLooper().quit();
        }

        if(customHandlerThread!=null){
            customHandlerThread.getLooper().quit();
        }
    }
}
