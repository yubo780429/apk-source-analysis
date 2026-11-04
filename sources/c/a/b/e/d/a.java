package c.a.b.e.d;

import java.security.InvalidKeyException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f1255a;

    private a() {
    }

    public static a a() throws NoSuchPaddingException {
        a aVar = new a();
        c cVar = new c();
        aVar.f1255a = cVar;
        cVar.a("PKCS1Padding");
        return aVar;
    }

    public void a(int i, d dVar) throws InvalidKeyException {
        this.f1255a.a(i, dVar, b.f1256a);
    }

    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            return this.f1255a.a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Null input buffer");
    }
}
