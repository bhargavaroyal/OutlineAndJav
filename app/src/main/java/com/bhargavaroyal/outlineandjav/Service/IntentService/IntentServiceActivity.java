package com.bhargavaroyal.outlineandjav.Service.IntentService;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class IntentServiceActivity extends Activity implements View.OnClickListener {

    private static final String TAG = IntentServiceActivity.class.getSimpleName();

    private Button buttonStart, buttonStop, buttonBind, buttonUnBind, buttonGetRandomNumber;
    private TextView textViewthreadCount;
    int count = 0;
    /*Handler handler;*/
    private Intent serviceIntent;
    private boolean mStopLoop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service);
        Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId());
        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);
        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        serviceIntent = new Intent(getApplicationContext(), BasicIntentService.class);

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
        }
    }
}

