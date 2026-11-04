package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public interface g {
    double a();

    void a(Context context);

    IBinder onBind(Intent intent);

    void onDestroy();

    int onStartCommand(Intent intent, int i, int i2);

    void onTaskRemoved(Intent intent);
}
