package com.bhargavaroyal.outlineandjav.Service.CustomLooperHandler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class CustomLooperServiceActivity extends Activity implements View.OnClickListener {


    private static final String TAG = "CustomLooperServiceActivity" ;
    private Button buttonStart, buttonStop;
    private TextView textViewthreadCount;
    int count = 0;

    Handler handler;

    private boolean mStopLoop;
    LooperThread looperThread;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_looper_service);

        Log.i(TAG,"Thread id of Main thread: "+Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);

        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        looperThread=new LooperThread();
        looperThread.start();

        handler=new Handler(Looper.getMainLooper());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                mStopLoop = true;
                executeOnCustomLooper();
                break;
            case R.id.buttonStopthread: mStopLoop = false;
                break;

        }
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
                        looperThread.handler.sendMessage(message);
                    }catch (InterruptedException exception){
                        Log.i(TAG,"Thread for interrupted");
                    }
                }
            }
        }).start();

    }
}
