package b.b.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class h {

    class a implements c<b.b.c.d.b.f> {
        a(h hVar) {
        }

        @Override // b.b.c.b.h.c
        public int a(b.b.c.d.b.f fVar) {
            return fVar.d();
        }

        @Override // b.b.c.b.h.c
        public boolean b(b.b.c.d.b.f fVar) {
            return fVar.e();
        }
    }

    class b implements c<b.b.c.a.d.c.C0039c> {
        b(h hVar) {
        }

        @Override // b.b.c.b.h.c
        public int a(b.b.c.a.d.c.C0039c c0039c) {
            return c0039c.e();
        }

        @Override // b.b.c.b.h.c
        public boolean b(b.b.c.a.d.c.C0039c c0039c) {
            return c0039c.f();
        }
    }

    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    h() {
    }

    private b.b.c.a.d.c.C0039c a(b.b.c.a.d.c.b bVar, int i) {
        return (b.b.c.a.d.c.C0039c) a(bVar.a(), i, new b(this));
    }

    private static <T> T a(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File fileA = i.a(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (i.a(fileA, resources, i)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.b.c.d.b.f[] fVarArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(a(fVarArr, i).c());
            try {
                Typeface typefaceA = a(context, inputStreamOpenInputStream);
                i.a(inputStreamOpenInputStream);
                return typefaceA;
            } catch (IOException unused) {
                i.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                i.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface a(Context context, b.b.c.a.d.c.b bVar, Resources resources, int i) {
        b.b.c.a.d.c.C0039c c0039cA = a(bVar, i);
        if (c0039cA == null) {
            return null;
        }
        return b.b.c.b.c.a(context, resources, c0039cA.b(), c0039cA.a(), i);
    }

    protected Typeface a(Context context, InputStream inputStream) {
        File fileA = i.a(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (i.a(fileA, inputStream)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    protected b.b.c.d.b.f a(b.b.c.d.b.f[] fVarArr, int i) {
        return (b.b.c.d.b.f) a(fVarArr, i, new a(this));
    }
}
