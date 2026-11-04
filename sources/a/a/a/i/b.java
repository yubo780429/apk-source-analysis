package a.a.a.i;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f321c;
    public String d;
    public boolean e;

    /* JADX INFO: renamed from: a.a.a.i.b$b, reason: collision with other inner class name */
    public static class C0020b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f322a = new b();
    }

    public b() {
        this.f319a = null;
        this.f320b = null;
        this.f321c = null;
        this.d = null;
        this.e = false;
        if (com.baidu.location.f.c() != null) {
            a(com.baidu.location.f.c());
        }
    }

    public static b e() {
        return C0020b.f322a;
    }

    public String a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer(200);
        if (this.f321c != null) {
            stringBuffer.append("&cu=");
            str = this.f321c;
        } else {
            stringBuffer.append("&im=");
            str = this.f319a;
        }
        stringBuffer.append(str);
        try {
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
        } catch (Exception unused) {
        }
        stringBuffer.append("&pack=");
        try {
            stringBuffer.append(f);
        } catch (Exception unused2) {
        }
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        return stringBuffer.toString();
    }

    public String a(boolean z) {
        return a(z, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    public String a(boolean z, String str) {
        String strSubstring;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        if (z) {
            if (i.d.equals("all")) {
                stringBuffer.append("&addr=allj2");
            }
            if (i.g) {
                stringBuffer.append("&adtp=n2");
            }
            if (i.f || i.i || i.j || i.h) {
                stringBuffer.append("&sema=");
                if (i.f) {
                    stringBuffer.append("aptag|");
                }
                if (i.h) {
                    stringBuffer.append("aptagd2|");
                }
                if (i.i) {
                    stringBuffer.append("poiregion|");
                }
                if (i.j) {
                    stringBuffer.append("regular");
                }
            }
        }
        if (z) {
            if (str == null) {
                str = "&coor=gcj02";
            } else {
                stringBuffer.append("&coor=");
            }
            stringBuffer.append(str);
            String strM = a.a.a.g.d.m();
            if (strM != null) {
                stringBuffer.append(strM);
            }
        }
        if (this.f321c != null) {
            stringBuffer.append("&cu=");
            stringBuffer.append(this.f321c);
            String str3 = this.f319a;
            str2 = (str3 == null || str3.equals("NULL") || this.f321c.contains(new StringBuffer(this.f319a).reverse().toString())) ? "&im=" : "&Aim=";
            if (this.f320b != null) {
                stringBuffer.append("&snd=");
                stringBuffer.append(this.f320b);
            }
            if (this.d != null) {
                stringBuffer.append("&Aid=");
                stringBuffer.append(this.d);
            }
            stringBuffer.append("&fw=");
            stringBuffer.append(com.baidu.location.f.a());
            stringBuffer.append("&lt=1");
            stringBuffer.append("&mb=");
            stringBuffer.append(Build.MODEL);
            stringBuffer.append("&resid=");
            stringBuffer.append("12");
            stringBuffer.append("&os=A");
            stringBuffer.append(Build.VERSION.SDK_INT);
            if (z) {
                stringBuffer.append("&sv=");
                strSubstring = Build.VERSION.RELEASE;
                if (strSubstring != null && strSubstring.length() > 6) {
                    strSubstring = strSubstring.substring(0, 6);
                }
                stringBuffer.append(strSubstring);
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(str2);
        stringBuffer.append(this.f319a);
        if (this.f320b != null) {
            stringBuffer.append("&snd=");
            stringBuffer.append(this.f320b);
        }
        if (this.d != null) {
            stringBuffer.append("&Aid=");
            stringBuffer.append(this.d);
        }
        stringBuffer.append("&fw=");
        stringBuffer.append(com.baidu.location.f.a());
        stringBuffer.append("&lt=1");
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK_INT);
        if (z) {
            stringBuffer.append("&sv=");
            strSubstring = Build.VERSION.RELEASE;
            if (strSubstring != null) {
                strSubstring = strSubstring.substring(0, 6);
            }
            stringBuffer.append(strSubstring);
        }
        return stringBuffer.toString();
    }

    public void a(Context context) {
        if (context == null || this.e) {
            return;
        }
        try {
            this.f321c = c.a.c.a.b.c(context).a();
        } catch (Exception unused) {
            this.f321c = null;
        }
        try {
            f = context.getPackageName();
        } catch (Exception unused2) {
            f = null;
        }
        try {
            j = i.f(context);
        } catch (Exception unused3) {
            j = null;
        }
        i.l = "" + this.f321c;
        this.e = true;
    }

    public void a(String str, String str2) {
        g = str;
        f = str2;
    }

    public String b() {
        return this.f321c;
    }

    public String c() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f321c == null) {
            stringBuffer.append("&im=");
            str = this.f319a;
        } else {
            stringBuffer.append("&cu=");
            str = this.f321c;
        }
        stringBuffer.append(str);
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&stp=1");
        stringBuffer.append("&os=A");
        stringBuffer.append(Build.VERSION.SDK);
        stringBuffer.append("&prod=");
        stringBuffer.append(g + ":" + f);
        stringBuffer.append(i.d(com.baidu.location.f.c()));
        stringBuffer.append("&resid=");
        stringBuffer.append("12");
        return stringBuffer.toString();
    }

    public String d() {
        StringBuilder sb;
        String str;
        if (this.f321c != null) {
            sb = new StringBuilder();
            sb.append("v9.521|");
            str = this.f321c;
        } else {
            sb = new StringBuilder();
            sb.append("v9.521|");
            str = this.f319a;
        }
        sb.append(str);
        sb.append("|");
        sb.append(Build.MODEL);
        return sb.toString();
    }
}
