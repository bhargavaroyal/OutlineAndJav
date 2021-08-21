package com.bhargavaroyal.outlineandjav;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bhargavaroyal.outlineandjav.Service.BoundMsg.BoundServerSideActivity;
import com.bhargavaroyal.outlineandjav.Service.BoundServiceIbinder.LocalBoundActivity;
import com.bhargavaroyal.outlineandjav.Service.CustomHandlerService.StartCustomHandlerServiceActivity;
import com.bhargavaroyal.outlineandjav.Service.CustomLooperHandler.CustomLooperServiceActivity;
import com.bhargavaroyal.outlineandjav.Service.HandlerService.StartHandlerServiceActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button BoundServerServiceButton,serviceHandlerButton,serviceCustomHandlerButton,serviceCustomLooperButton;
    private Button serviceLocalboundButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoundServerServiceButton = findViewById(R.id.button_bound_server_side);
        serviceHandlerButton = findViewById(R.id.button_service_handler);
        serviceCustomHandlerButton = findViewById(R.id.button_service_custom_handler);
        serviceCustomLooperButton = findViewById(R.id.button_service_custom_looper);
        serviceLocalboundButton = findViewById(R.id.button_local_bind_service);
        BoundServerServiceButton.setOnClickListener(this);
        serviceHandlerButton.setOnClickListener(this);
        serviceCustomHandlerButton.setOnClickListener(this);
        serviceCustomLooperButton.setOnClickListener(this);
        serviceLocalboundButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case   R.id.button_bound_server_side:
                Intent boundserversideIntent = new Intent(this, BoundServerSideActivity.class);
                startActivity(boundserversideIntent);
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

            case   R.id.button_local_bind_service:
                Intent localbindIntent = new Intent(this, LocalBoundActivity.class);
                startActivity(localbindIntent);
                break;
        }

    }
}