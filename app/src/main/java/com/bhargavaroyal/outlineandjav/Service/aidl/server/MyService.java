package com.bhargavaroyal.outlineandjav.Service.aidl.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyService extends Service {
 private MyImpl impl = new MyImpl();
    @Nullable
    @Override
   public IBinder onBind(Intent intent) {
        return impl;
    }

    private class MyImpl extends IMyAidlInterface.Stub{

        @Override
        public int calculate(int num1, int num2) throws RemoteException {
            return num1+num2;
        }
    }
}
