package com.bhargavaroyal.outlineandjav.Service.ForegroundService;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.bhargavaroyal.outlineandjav.R;

public class ForeGroundServiceActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ForeGroundServiceActivity.class.getSimpleName();

    private Button buttonStart, buttonStop;
    private TextView textViewthreadCount;
    int count = 0;

    private ForeGroundMyIntentService myService;
    private boolean isServiceBound;
    private ServiceConnection  serviceConnection;

    /*Handler handler;*/


    private  Intent serviceIntent;

    private boolean mStopLoop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fore_ground);

        Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);

        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        serviceIntent=new Intent(getApplicationContext(),ForeGroundMyIntentService.class);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                mStopLoop = true;
                ContextCompat.startForegroundService(this,serviceIntent);
                break;
            case R.id.buttonStopthread:
                stopService(serviceIntent);
                break;
        }
    }
}
