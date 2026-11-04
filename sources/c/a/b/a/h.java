package c.a.b.a;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
final class h extends g {
    private a d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class f1197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f1199c;

        private a() {
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(Object obj) throws e.a {
            try {
                return ((Long) this.f1199c.invoke(obj, new Object[0])).longValue();
            } catch (Exception unused) {
                throw new e.a("");
            }
        }

        private void a() {
            try {
                this.f1197a = Class.forName(e.a(d.a()), true, Object.class.getClassLoader());
                this.f1198b = e.a(this.f1197a, e.a(d.b()), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});
                this.f1199c = e.a(this.f1197a, e.a(d.c()), null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, byte[] bArr, int i, int i2) throws e.a {
            try {
                this.f1198b.invoke(obj, bArr, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception unused) {
                throw new e.a("");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b() {
            return this.f1197a.newInstance();
        }
    }

    public h(int i, int i2) {
        this.f1194a = 32;
        this.f1195b = i;
        this.f1196c = i2;
        this.d = new a();
    }

    @Override // c.a.b.a.g
    public b a(byte[] bArr, int i, int i2) {
        long jA;
        try {
            Object objB = this.d.b();
            this.d.a(objB, bArr, i, i2);
            jA = this.d.a(objB);
        } catch (Exception unused) {
            jA = 4294967295L;
        }
        return b.a(new long[]{jA});
    }
}
