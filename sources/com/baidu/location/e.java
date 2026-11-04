package com.baidu.location;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f1357a = Double.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f1358b = Double.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1359c = 0.0f;
    public String d = null;
    public double e = Double.MIN_VALUE;
    public double f = Double.MIN_VALUE;
    public int g = 0;
    public boolean h;
    public a.a.a.e.a i;

    public void a(c cVar, float f) {
        Log.d("baidu_location_service", "new location, not far from the destination..." + f);
    }
}
