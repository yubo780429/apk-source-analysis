package android.support.constraint.n;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static int q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f474b;
    public float f;
    a j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f475c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    float[] h = new float[9];
    float[] i = new float[9];
    b[] k = new b[16];
    int l = 0;
    public int m = 0;
    boolean n = false;
    int o = -1;
    float p = 0.0f;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.j = aVar;
    }

    static void b() {
        q++;
    }

    public void a() {
        this.f474b = null;
        this.j = a.UNKNOWN;
        this.e = 0;
        this.f475c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.f473a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                b[] bVarArr = this.k;
                if (i2 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i3 = this.l;
                bVarArr2[i3] = bVar;
                this.l = i3 + 1;
                return;
            }
            if (this.k[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public void a(d dVar, float f) {
        this.f = f;
        this.g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].a(dVar, this, false);
        }
        this.l = 0;
    }

    public final void a(d dVar, b bVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].a(dVar, bVar, false);
        }
        this.l = 0;
    }

    public void a(a aVar, String str) {
        this.j = aVar;
    }

    public final void b(b bVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.k;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.f474b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f474b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f475c);
        }
        return sb.toString();
    }
}
