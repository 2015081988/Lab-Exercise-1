package com.ong.labactivity1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {

    public MyService() {
        super(MyService.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        for (int i = 1; i <= 10; i++){
            Log.d("MyService", "Turn " + i);
        }
    }
}
