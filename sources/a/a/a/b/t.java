package a.a.a.b;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public class t implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SensorManager f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f79b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f80c;
    public boolean d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f81a = new t();
    }

    public t() {
        this.f80c = false;
        this.d = false;
    }

    public static t e() {
        return b.f81a;
    }

    public float a() {
        return this.f79b;
    }

    public void a(boolean z) {
    }

    public void b(boolean z) {
        this.f80c = z;
    }

    public boolean b() {
        return this.f80c;
    }

    public synchronized void c() {
        Sensor defaultSensor;
        if (this.d) {
            return;
        }
        if (this.f80c) {
            if (this.f78a == null) {
                this.f78a = (SensorManager) com.baidu.location.f.c().getSystemService("sensor");
            }
            SensorManager sensorManager = this.f78a;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(11)) != null && this.f80c) {
                this.f78a.registerListener(this, defaultSensor, 3);
            }
            this.d = true;
        }
    }

    public synchronized void d() {
        if (this.d) {
            SensorManager sensorManager = this.f78a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
                this.f78a = null;
            }
            this.d = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"NewApi"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 11 && (fArr = (float[]) sensorEvent.values.clone()) != null) {
            float[] fArr2 = new float[9];
            try {
                SensorManager.getRotationMatrixFromVector(fArr2, fArr);
                float[] fArr3 = new float[3];
                SensorManager.getOrientation(fArr2, fArr3);
                float degrees = (float) Math.toDegrees(fArr3[0]);
                this.f79b = degrees;
                if (degrees < 0.0f) {
                    degrees += 360.0f;
                }
                this.f79b = (float) Math.floor(degrees);
            } catch (Exception unused) {
                this.f79b = 0.0f;
            }
        }
    }
}
