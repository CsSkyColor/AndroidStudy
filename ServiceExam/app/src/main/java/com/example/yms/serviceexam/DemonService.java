package com.example.yms.serviceexam;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by yms on 2017-04-11.
 */


//Service 를 이용하기 위해서는 manifest에서 서비스를 선언해줘야한다.
public class DemonService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Demon Service / onCreate() 생성", Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Demon Service / onStartCommand() 생성", Toast.LENGTH_LONG).show();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
