package a.a.a.b;

import android.util.Base64;
import com.baidu.location.Jni;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f53b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static n f54a = new n();
    }

    public n() {
        this.f52a = false;
        this.f53b = null;
        try {
            String strA = Jni.a();
            if (strA == null || !strA.contains("|")) {
                return;
            }
            String[] strArrSplit = strA.split("\\|");
            this.f53b = strArrSplit;
            if (strArrSplit == null || strArrSplit.length != 2) {
                return;
            }
            this.f52a = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static n b() {
        return b.f54a;
    }

    public synchronized String a(String str) {
        if (!this.f52a) {
            return null;
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f53b[1].getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f53b[0].getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean a() {
        return this.f52a;
    }

    public synchronized String b(String str) {
        if (this.f52a) {
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f53b[1].getBytes("UTF-8"));
                SecretKeySpec secretKeySpec = new SecretKeySpec(this.f53b[0].getBytes("UTF-8"), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
