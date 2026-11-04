package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcel f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f963c;
    private final int d;
    private final String e;
    private int f;
    private int g;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    b(Parcel parcel, int i, int i2, String str) {
        this.f961a = new SparseIntArray();
        this.f = -1;
        this.g = 0;
        this.f962b = parcel;
        this.f963c = i;
        this.d = i2;
        this.g = i;
        this.e = str;
    }

    private int d(int i) {
        int i2;
        do {
            int i3 = this.g;
            if (i3 >= this.d) {
                return -1;
            }
            this.f962b.setDataPosition(i3);
            int i4 = this.f962b.readInt();
            i2 = this.f962b.readInt();
            this.g += i4;
        } while (i2 != i);
        return this.f962b.dataPosition();
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.f;
        if (i >= 0) {
            int i2 = this.f961a.get(i);
            int iDataPosition = this.f962b.dataPosition();
            this.f962b.setDataPosition(i2);
            this.f962b.writeInt(iDataPosition - i2);
            this.f962b.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable parcelable) {
        this.f962b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String str) {
        this.f962b.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] bArr) {
        if (bArr == null) {
            this.f962b.writeInt(-1);
        } else {
            this.f962b.writeInt(bArr.length);
            this.f962b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int i) {
        int iD = d(i);
        if (iD == -1) {
            return false;
        }
        this.f962b.setDataPosition(iD);
        return true;
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f962b;
        int iDataPosition = parcel.dataPosition();
        int i = this.g;
        if (i == this.f963c) {
            i = this.d;
        }
        return new b(parcel, iDataPosition, i, this.e + "  ");
    }

    @Override // androidx.versionedparcelable.a
    public void b(int i) {
        a();
        this.f = i;
        this.f961a.put(i, this.f962b.dataPosition());
        c(0);
        c(i);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int i) {
        this.f962b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public byte[] d() {
        int i = this.f962b.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f962b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public int e() {
        return this.f962b.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T f() {
        return (T) this.f962b.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String g() {
        return this.f962b.readString();
    }
}
