package com.aptude.aidl.poc.cpserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class CalService extends Service {
    public CalService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new ICalService.Stub(){

            @Override
            public String getMessage(String name) throws RemoteException {
                return "Hello "+name+", Result is ";
            }

            @Override
            public int getResult(int val1, int val2) throws RemoteException {
                return val1*val2;
            }
        };
    }


}
