package b.b.c.f;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class e extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f1079c = new StringBuilder(128);

    public e(String str) {
        this.f1078b = str;
    }

    private void a() {
        if (this.f1079c.length() > 0) {
            Log.d(this.f1078b, this.f1079c.toString());
            StringBuilder sb = this.f1079c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f1079c.append(c2);
            }
        }
    }
}
