package com.baidu.location;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1351c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: com.baidu.location.a$a, reason: collision with other inner class name */
    public static class C0056a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1352a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1353b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1354c = null;
        private String d = null;
        private String e = null;
        private String f = null;
        private String g = null;
        private String h = null;
        private String i = null;
        private String j = null;
        private String k = null;

        public C0056a a(String str) {
            this.j = str;
            return this;
        }

        public a a() {
            String str;
            StringBuffer stringBuffer = new StringBuffer();
            String str2 = this.f1352a;
            if (str2 != null) {
                stringBuffer.append(str2);
            }
            String str3 = this.f1354c;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            String str4 = this.f1354c;
            if (str4 != null && (str = this.d) != null && !str4.equals(str)) {
                stringBuffer.append(this.d);
            }
            String str5 = this.f;
            if (str5 != null) {
                String str6 = this.d;
                if (str6 == null) {
                    stringBuffer.append(str5);
                } else if (!str6.equals(str5)) {
                    str5 = this.f;
                    stringBuffer.append(str5);
                }
            }
            String str7 = this.k;
            if (str7 != null) {
                stringBuffer.append(str7);
            }
            String str8 = this.g;
            if (str8 != null) {
                stringBuffer.append(str8);
            }
            String str9 = this.h;
            if (str9 != null) {
                stringBuffer.append(str9);
            }
            if (stringBuffer.length() > 0) {
                this.i = stringBuffer.toString();
            }
            return new a(this);
        }

        public C0056a b(String str) {
            this.d = str;
            return this;
        }

        public C0056a c(String str) {
            this.e = str;
            return this;
        }

        public C0056a d(String str) {
            this.f1352a = str;
            return this;
        }

        public C0056a e(String str) {
            this.f1353b = str;
            return this;
        }

        public C0056a f(String str) {
            this.f = str;
            return this;
        }

        public C0056a g(String str) {
            this.f1354c = str;
            return this;
        }

        public C0056a h(String str) {
            this.g = str;
            return this;
        }

        public C0056a i(String str) {
            this.h = str;
            return this;
        }

        public C0056a j(String str) {
            this.k = str;
            return this;
        }
    }

    private a(C0056a c0056a) {
        this.f1349a = c0056a.f1352a;
        this.f1350b = c0056a.f1353b;
        this.f1351c = c0056a.f1354c;
        this.d = c0056a.d;
        this.e = c0056a.e;
        this.f = c0056a.f;
        this.g = c0056a.g;
        this.h = c0056a.h;
        this.i = c0056a.i;
        this.j = c0056a.j;
        this.k = c0056a.k;
    }
}
