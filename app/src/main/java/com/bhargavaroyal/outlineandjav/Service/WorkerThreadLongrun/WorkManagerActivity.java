package com.bhargavaroyal.outlineandjav.Service.WorkerThreadLongrun;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import com.bhargavaroyal.outlineandjav.R;

import java.util.concurrent.TimeUnit;

public class WorkManagerActivity /*extends Activity implements View.OnClickListener*/{
/*

private static final String TAG=WorkManagerActivity.class.getSimpleName();

private Button buttonStart,buttonStop;
private TextView textViewthreadCount;
        int count=0;

private WorkManagerService myService;
private boolean isServiceBound;
private ServiceConnection serviceConnection;

        WorkManager workManager;

*/
/*Handler handler;*//*

private Intent serviceIntent;

private boolean mStopLoop;
private WorkRequest workRequest;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(getString(R.string.service_demo_tag),"MainActivity thread id: "+Thread.currentThread().getId());

        buttonStart=(Button)findViewById(R.id.buttonThreadStarter);
        buttonStop=(Button)findViewById(R.id.buttonStopthread);

        textViewthreadCount=(TextView)findViewById(R.id.textViewthreadCount);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

        workManager=WorkManager.getInstance(getApplicationContext());

        //workRequest = OneTimeWorkRequest.from(RandomNumberGeneratorWorker.class);

        workRequest=new PeriodicWorkRequest.Builder(RandomNumberGeneratorWorker.class,15, TimeUnit.MINUTES).build();
        }

@Override
public void onClick(View view){
        switch(view.getId()){
        case R.id.buttonThreadStarter:
        mStopLoop=true;
        workManager.enqueue(workRequest);
        break;
        case R.id.buttonStopthread:
        workManager.cancelWorkById(workRequest.getId());
        break;
        }
        }
*/
        }

