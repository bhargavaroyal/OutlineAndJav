package com.bhargavaroyal.outlineandjav.Service.IntentServiceBounded;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class IntentServiceBoundedActivity extends Activity implements View.OnClickListener {

    private static final String TAG = IntentServiceBoundedActivity.class.getSimpleName();

    private Button buttonStart, buttonStop, buttonBind, buttonUnBind, buttonGetRandomNumber;
    private TextView textViewthreadCount;
    int count = 0;

    private IntentServiceBounded myService;
    private boolean isServiceBound;
    private ServiceConnection serviceConnection;

    /*Handler handler;*/


    private Intent serviceIntent;

    private boolean mStopLoop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service_bounded);

        Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);
        buttonBind = (Button) findViewById(R.id.buttonBindService);
        buttonUnBind = (Button) findViewById(R.id.buttonUnBindService);
        buttonGetRandomNumber = (Button) findViewById(R.id.buttonGetRandomNumber);


        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonBind.setOnClickListener(this);
        buttonUnBind.setOnClickListener(this);
        buttonGetRandomNumber.setOnClickListener(this);
        /*handler=new Handler(getApplicationContext().getMainLooper());*/

        serviceIntent = new Intent(getApplicationContext(), IntentServiceBounded.class);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                mStopLoop = true;
                startService(serviceIntent);
                break;
            case R.id.buttonStopthread:
                stopService(serviceIntent);
                break;
            case R.id.buttonBindService:
                bindService();
                break;
            case R.id.buttonUnBindService:
                unbindService();
                break;
            case R.id.buttonGetRandomNumber:
                setRandomNumber();
                break;

        }
    }

    private void bindService() {
        if (serviceConnection == null) {
            serviceConnection = new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IntentServiceBounded.MyIntentServiceBinder myServiceBinder = (IntentServiceBounded.MyIntentServiceBinder) iBinder;
                    myService = myServiceBinder.getService();
                    isServiceBound = true;
                }

                @Override
                public void onServiceDisconnected(ComponentName componentName) {
                    isServiceBound = false;
                }
            };
        }

        bindService(serviceIntent, serviceConnection, Context.BIND_AUTO_CREATE);

    }

    private void unbindService() {
        if (isServiceBound) {
            unbindService(serviceConnection);
            isServiceBound = false;
        }
    }

    private void setRandomNumber() {
        if (isServiceBound) {
            textViewthreadCount.setText("Random number: " + myService.getRandomNumber());
        } else {
            textViewthreadCount.setText("Service not bound");
        }
    }

}
