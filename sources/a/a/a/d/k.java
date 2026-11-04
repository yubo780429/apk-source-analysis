package a.a.a.d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f179c;
    public Sensor d;
    public Sensor e;
    public long l;
    public SensorEventListener m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<c> f177a = Collections.synchronizedSet(new HashSet());
    public boolean f = true;
    public float[] g = new float[3];
    public float[] h = new float[9];
    public float i = -1.0f;
    public int j = 0;
    public String k = null;

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String strA;
            int type = sensorEvent.sensor.getType();
            if (type != 1) {
                if (type != 11) {
                    return;
                }
                SensorManager.getRotationMatrixFromVector(k.this.h, (float[]) sensorEvent.values.clone());
                SensorManager.getOrientation(k.this.h, k.this.g);
                float[] fArr = new float[3];
                double degrees = Math.toDegrees(k.this.g[0]);
                if (degrees < 0.0d) {
                    fArr[2] = ((float) (degrees + 360.0d)) % 360.0f;
                } else {
                    fArr[2] = (float) degrees;
                }
                k.this.i = fArr[2];
                fArr[0] = (float) Math.toDegrees(k.this.g[1]);
                fArr[1] = (float) Math.toDegrees(k.this.g[2]);
                if (k.this.f && a.a.a.d.m.a.a()) {
                    a.a.a.d.m.a.a(5, fArr, System.currentTimeMillis());
                    return;
                }
                return;
            }
            float[] fArr2 = (float[]) sensorEvent.values.clone();
            k.this.l = System.currentTimeMillis();
            if (!k.this.f || !a.a.a.d.m.a.a() || (strA = a.a.a.d.m.a.a(1, fArr2, System.currentTimeMillis())) == null || strA.length() <= 1) {
                return;
            }
            float fB = a.a.a.d.m.a.b();
            if (fB > 0.01f) {
                k.b(k.this);
            }
            try {
                synchronized (k.this.f177a) {
                    Iterator it = k.this.f177a.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(fB, k.this.i, k.this.i, System.currentTimeMillis(), strA);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static k f181a = new k();
    }

    public interface c {
        void a(double d, double d2, double d3, long j, String str);
    }

    public k() {
        new ArrayList();
        this.m = new a();
        a(com.baidu.location.f.c(), 1);
    }

    public static /* synthetic */ int b(k kVar) {
        int i = kVar.j;
        kVar.j = i + 1;
        return i;
    }

    public static k e() {
        return b.f181a;
    }

    public double a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(c cVar) {
        Sensor sensor;
        synchronized (this.f177a) {
            if (!this.f177a.contains(cVar)) {
                this.f177a.add(cVar);
            }
            if (this.f177a.size() == 1) {
                Sensor sensor2 = this.d;
                if (sensor2 != null) {
                    try {
                        this.f178b.registerListener(this.m, sensor2, this.f179c);
                    } catch (Exception unused) {
                        this.f = false;
                    }
                    if (a.a.a.d.m.a.a()) {
                        a.a.a.d.m.a.c();
                    }
                    sensor = this.e;
                    if (sensor != null) {
                        try {
                            this.f178b.registerListener(this.m, sensor, this.f179c);
                        } catch (Exception unused2) {
                            this.f = false;
                        }
                    }
                } else {
                    sensor = this.e;
                    if (sensor != null) {
                        this.f178b.registerListener(this.m, sensor, this.f179c);
                    }
                }
                throw th;
            }
        }
    }

    public final void a(Context context, int i) {
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.f178b = sensorManager;
            this.f179c = i;
            this.d = sensorManager.getDefaultSensor(1);
            this.e = this.f178b.getDefaultSensor(11);
            b();
        } catch (Exception unused) {
        }
    }

    public final void b() {
        int iIntValue;
        try {
            List<Sensor> sensorList = this.f178b.getSensorList(-1);
            HashMap map = new HashMap();
            map.put(1, 0);
            map.put(10, 1);
            map.put(9, 2);
            map.put(4, 3);
            map.put(2, 4);
            map.put(11, 5);
            map.put(6, 6);
            if (Build.VERSION.SDK_INT >= 18) {
                map.put(14, 7);
                map.put(16, 8);
            }
            int size = map.size();
            char[] cArr = new char[size];
            for (int i = 0; i < size; i++) {
                cArr[i] = '0';
            }
            Iterator<Sensor> it = sensorList.iterator();
            while (it.hasNext()) {
                int type = it.next().getType();
                if (map.get(Integer.valueOf(type)) != null && (iIntValue = ((Integer) map.get(Integer.valueOf(type))).intValue()) < size) {
                    cArr[iIntValue] = '1';
                }
            }
            this.k = new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(c cVar) {
        synchronized (this.f177a) {
            if (this.f177a.contains(cVar)) {
                this.f177a.remove(cVar);
            }
            if (this.f177a.size() == 0) {
                try {
                    this.f178b.unregisterListener(this.m);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (a.a.a.d.m.a.a()) {
                    a.a.a.d.m.a.d();
                }
            }
        }
    }

    public String c() {
        return this.k;
    }

    public synchronized int d() {
        return this.j;
    }
}
