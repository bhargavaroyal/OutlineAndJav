package com.bhargavaroyal.outlineandjav.Service.JobScheduler;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bhargavaroyal.outlineandjav.R;

public class BasicJobSchedulerActivity  extends Activity implements View.OnClickListener {

    private static final String TAG = BasicJobSchedulerActivity.class.getSimpleName();

    private Button buttonStart, buttonStop;
    private TextView textViewthreadCount;
    int count = 0;

    private BasicJobSchedulerService myService;
    private boolean isServiceBound;
    private ServiceConnection serviceConnection;

    JobScheduler jobScheduler;
    int jobId=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_scheduler);

        jobScheduler = (JobScheduler)getSystemService(JOB_SCHEDULER_SERVICE);

        Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId());

        buttonStart = (Button) findViewById(R.id.buttonThreadStarter);
        buttonStop = (Button) findViewById(R.id.buttonStopthread);

        textViewthreadCount = (TextView) findViewById(R.id.textViewthreadCount);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonThreadStarter:
                startJob();
                break;
            case R.id.buttonStopthread:
                stopJob();
                break;
        }
    }

    private void startJob(){
        ComponentName componentName = new ComponentName(this, BasicJobSchedulerService.class);
        JobInfo jobInfo = new JobInfo.Builder(101,componentName)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_CELLULAR)
                .setPeriodic(15*60*1000)
                .setRequiresCharging(false)
                .setPersisted(true)
                .build();

        if(jobScheduler.schedule(jobInfo)==JobScheduler.RESULT_SUCCESS){
            Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId()+", job successfully scheduled");
        }else {
            Log.i(getString(R.string.service_demo_tag), "MainActivity thread id: " + Thread.currentThread().getId()+", job could not be scheduled");
        }
    }

    private void stopJob(){
        jobScheduler.cancel(101);
    }
}

