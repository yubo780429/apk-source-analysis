package b.b.c.d;

import android.util.Base64;
import b.b.c.f.j;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1038c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        j.a(str);
        this.f1036a = str;
        j.a(str2);
        this.f1037b = str2;
        j.a(str3);
        this.f1038c = str3;
        j.a(list);
        this.d = list;
        this.e = 0;
        this.f = this.f1036a + "-" + this.f1037b + "-" + this.f1038c;
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.f1036a;
    }

    public String e() {
        return this.f1037b;
    }

    public String f() {
        return this.f1038c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1036a + ", mProviderPackage: " + this.f1037b + ", mQuery: " + this.f1038c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
