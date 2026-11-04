package c.a.c.a;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static KeyPair f1315a;

    public static String a(String str) {
        if (!TextUtils.isEmpty(str) && f1315a != null) {
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, f1315a.getPrivate());
                return e.a(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8.name());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, new SecureRandom());
            if (f1315a == null) {
                f1315a = keyPairGenerator.generateKeyPair();
            }
            return f1315a;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b() {
        PublicKey publicKey;
        KeyPair keyPair = f1315a;
        if (keyPair == null || (publicKey = keyPair.getPublic()) == null) {
            return null;
        }
        try {
            return e.a(publicKey.getEncoded(), StandardCharsets.UTF_8.name());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str) {
        if (!TextUtils.isEmpty(str) && f1315a != null) {
            try {
                byte[] bArrA = e.a(str.getBytes(StandardCharsets.UTF_8));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, f1315a.getPrivate());
                return cipher.doFinal(bArrA);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
