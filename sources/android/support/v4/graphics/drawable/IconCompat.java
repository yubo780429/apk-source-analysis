package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f626c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i;

    private static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    private static String a(int i) {
        if (i == 1) {
            return "BITMAP";
        }
        if (i == 2) {
            return "RESOURCE";
        }
        if (i == 3) {
            return "DATA";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE";
        }
        return "URI";
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    public int a() {
        if (this.f624a == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.f625b);
        }
        if (this.f624a == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public void a(boolean z) {
        this.i = this.h.name();
        int i = this.f624a;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f626c = ((String) this.f625b).getBytes(Charset.forName("UTF-16"));
                    return;
                }
                if (i == 3) {
                    this.f626c = (byte[]) this.f625b;
                    return;
                } else if (i == 4) {
                    this.f626c = this.f625b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f625b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f626c = byteArrayOutputStream.toByteArray();
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.d = (Parcelable) this.f625b;
    }

    public String b() {
        if (this.f624a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f625b);
        }
        if (this.f624a == 2) {
            return ((String) this.f625b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void c() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        int i = this.f624a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f625b = this.f626c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f625b = new String(this.f626c, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.d;
            if (parcelable == null) {
                byte[] bArr = this.f626c;
                this.f625b = bArr;
                this.f624a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            }
        } else {
            parcelable = this.d;
            if (parcelable == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f625b = parcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r1 != 5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f624a
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.Object r4 = r4.f625b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f624a
            java.lang.String r1 = a(r1)
            r0.append(r1)
            int r1 = r4.f624a
            r2 = 1
            if (r1 == r2) goto L77
            r3 = 2
            if (r1 == r3) goto L4f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L77
            goto L97
        L2e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            r0.append(r1)
            goto L97
        L39:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.e
            r0.append(r1)
            int r1 = r4.f
            if (r1 == 0) goto L97
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f
            goto L94
        L4f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L97
        L77:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f625b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L94:
            r0.append(r1)
        L97:
            android.content.res.ColorStateList r1 = r4.g
            if (r1 == 0) goto La5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.g
            r0.append(r1)
        La5:
            android.graphics.PorterDuff$Mode r1 = r4.h
            android.graphics.PorterDuff$Mode r2 = android.support.v4.graphics.drawable.IconCompat.j
            if (r1 == r2) goto Lb5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r4 = r4.h
            r0.append(r4)
        Lb5:
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
