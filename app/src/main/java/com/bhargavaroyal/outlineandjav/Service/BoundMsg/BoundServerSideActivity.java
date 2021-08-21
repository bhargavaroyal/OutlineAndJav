package com.bhargavaroyal.outlineandjav.Service.BoundMsg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.bhargavaroyal.outlineandjav.R;

public class BoundServerSideActivity extends Activity implements View.OnClickListener {

    private static final String TAG = BoundServerSideActivity.class.getSimpleName();

    private Button buttonStartService, buttonStopService;
    private Context mContext;

    private Intent serviceIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounded_server_side_activity);
        mContext = getApplicationContext();
        buttonStartService = (Button) findViewById(R.id.buttonStartService);
        buttonStopService = (Button) findViewById(R.id.buttonStopService);

        buttonStopService.setOnClickListener(this);
        buttonStartService.setOnClickListener(this);
        serviceIntent = new Intent(getApplicationContext(), BoundServerSideService.class);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonStartService:
                startService(serviceIntent);
                Toast.makeText(mContext, "Service Started", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonStopService:
                stopService(serviceIntent);
                Toast.makeText(mContext, "Service Stopped", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}