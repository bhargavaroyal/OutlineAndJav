package com.bhargavaroyal.outlineandjav.Service.HandlerService;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class StartHandlerServiceActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "StartHandlerServiceActivity";
    private Button buttonStart, buttonStop;
    private TextView textViewthreadCount;
    int count = 0;
    Handler handler;
    private boolean mStopLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_service);

        Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);
        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        handler=new Handler();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                mStopLoop = true;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (mStopLoop){
                            try{
                                Thread.sleep(1000);
                                count++;
                            }catch (InterruptedException e){
                                Log.i(TAG,e.getMessage());
                            }
                            Log.i(TAG,"Thread id in while loop: "+Thread.currentThread().getId()+", Count : "+count);
                            textViewthreadCount.post(new Runnable() {
                                @Override
                                public void run() {
                                    textViewthreadCount.setText(" "+count);
                                }
                            });
                        }
                    }
                }).start();
                break;
            case R.id.buttonStopthread:
                mStopLoop = false;
                break;
        }
    }
}
