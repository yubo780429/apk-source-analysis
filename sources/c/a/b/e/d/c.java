package c.a.b.e.d;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Locale;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1257a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f1259c;
    private byte[] d;
    private int e;
    private d f;
    private String g = "SHA-1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1258b = "PKCS1Padding";

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    private void a(int i, d dVar, SecureRandom secureRandom, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        boolean z;
        OAEPParameterSpec oAEPParameterSpec;
        if (i == 1) {
            z = true;
        } else {
            if (i != 2) {
                if (i == 3) {
                    z = true;
                } else if (i != 4) {
                    throw new InvalidKeyException("Unknown mode: " + i);
                }
            }
            z = false;
        }
        if (!(dVar instanceof d)) {
            throw new InvalidKeyException("only support helios key");
        }
        this.f1257a = z ? 1 : 4;
        this.f = dVar;
        int iA = b.a(dVar.a());
        this.e = 0;
        String str = this.f1258b;
        if (str == "NoPadding") {
            if (algorithmParameterSpec != null) {
                throw new InvalidAlgorithmParameterException("Parameters not supported");
            }
            this.f1259c = f.a(3, iA, secureRandom);
            this.d = new byte[iA];
            return;
        }
        if (str == "PKCS1Padding") {
            if (algorithmParameterSpec != null) {
                throw new InvalidAlgorithmParameterException("Parameters not supported");
            }
            f fVarA = f.a(this.f1257a > 2 ? 1 : 2, iA, secureRandom);
            this.f1259c = fVarA;
            if (z) {
                this.d = new byte[fVarA.a()];
                return;
            } else {
                this.d = new byte[iA];
                return;
            }
        }
        int i2 = this.f1257a;
        if (i2 == 3 || i2 == 4) {
            throw new InvalidKeyException("OAEP cannot be used to sign or verify signatures");
        }
        if (algorithmParameterSpec == null) {
            oAEPParameterSpec = new OAEPParameterSpec(this.g, "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        } else {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Wrong Parameters for OAEP Padding");
            }
            oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
        }
        f fVarA2 = f.a(4, iA, secureRandom, oAEPParameterSpec);
        this.f1259c = fVarA2;
        if (z) {
            this.d = new byte[fVarA2.a()];
        } else {
            this.d = new byte[iA];
        }
    }

    private byte[] a() throws IllegalBlockSizeException {
        int i = this.e;
        byte[] bArr = this.d;
        if (i > bArr.length) {
            throw new IllegalBlockSizeException("Data must not be longer than " + this.d.length + " bytes");
        }
        try {
            int i2 = this.f1257a;
            if (i2 == 1) {
                byte[] bArrA = b.a(this.f1259c.a(bArr, 0, i), this.f);
                this.e = 0;
                return bArrA;
            }
            if (i2 == 2) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i2 == 3) {
                throw new UnsupportedOperationException("only verify supported");
            }
            if (i2 != 4) {
                throw new AssertionError("Internal error");
            }
            byte[] bArrB = this.f1259c.b(b.a(b.a(bArr, 0, i), this.f));
            this.e = 0;
            return bArrB;
        } catch (Throwable th) {
            this.e = 0;
            throw th;
        }
    }

    private void b(byte[] bArr, int i, int i2) {
        int length;
        if (i2 == 0 || bArr == null) {
            return;
        }
        int i3 = this.e;
        int i4 = i3 + i2;
        byte[] bArr2 = this.d;
        if (i4 > bArr2.length) {
            length = bArr2.length + 1;
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            length = this.e + i2;
        }
        this.e = length;
    }

    public void a(int i, d dVar, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            a(i, dVar, secureRandom, null);
        } catch (InvalidAlgorithmParameterException e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException("Wrong parameters");
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    public void a(String str) throws NoSuchPaddingException {
        String str2 = "NoPadding";
        if (!str.equalsIgnoreCase("NoPadding")) {
            str2 = "PKCS1Padding";
            if (!str.equalsIgnoreCase("PKCS1Padding")) {
                String lowerCase = str.toLowerCase(Locale.ENGLISH);
                if (lowerCase.equals("oaeppadding")) {
                    this.f1258b = "OAEP";
                    return;
                }
                if (!lowerCase.startsWith("oaepwith") || !lowerCase.endsWith("andmgf1padding")) {
                    throw new NoSuchPaddingException("Padding " + str + " not supported");
                }
                this.f1258b = "OAEP";
                this.g = str.substring(8, str.length() - 14);
                throw new NoSuchPaddingException("MessageDigest not available for " + str);
            }
        }
        this.f1258b = str2;
    }

    public byte[] a(byte[] bArr, int i, int i2) {
        b(bArr, i, i2);
        return a();
    }
}
