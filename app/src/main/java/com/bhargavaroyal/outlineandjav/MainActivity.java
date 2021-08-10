package com.bhargavaroyal.outlineandjav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bhargavaroyal.outlineandjav.Service.AsyncTaskService.StartServiceActivity;
import com.bhargavaroyal.outlineandjav.Service.CustomHandlerService.StartCustomHandlerServiceActivity;
import com.bhargavaroyal.outlineandjav.Service.CustomLooperHandler.CustomLooperServiceActivity;
import com.bhargavaroyal.outlineandjav.Service.HandlerService.StartHandlerServiceActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button asyncServiceButton,serviceHandlerButton,serviceCustomHandlerButton,serviceCustomLooperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asyncServiceButton = findViewById(R.id.button_start_async_service);
        serviceHandlerButton = findViewById(R.id.button_service_handler);
        serviceCustomHandlerButton = findViewById(R.id.button_service_custom_handler);
        serviceCustomLooperButton = findViewById(R.id.button_service_custom_looper);
        asyncServiceButton.setOnClickListener(this);
        serviceHandlerButton.setOnClickListener(this);
        serviceCustomHandlerButton.setOnClickListener(this);
        serviceCustomLooperButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case   R.id.button_start_async_service:
                Intent startASyncService = new Intent(this, StartServiceActivity.class);
                startActivity(startASyncService);
            break;
            case   R.id.button_service_handler:
                Intent startHandlerService = new Intent(this, StartHandlerServiceActivity.class);
                startActivity(startHandlerService);
                break;
            case   R.id.button_service_custom_handler:
                Intent startCustomHandlerService = new Intent(this, StartCustomHandlerServiceActivity.class);
                startActivity(startCustomHandlerService);
                break;
            case   R.id.button_service_custom_looper:
                Intent startLooperService = new Intent(this, CustomLooperServiceActivity.class);
                startActivity(startLooperService);
                break;
        }

    }
}