package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    n[] f589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f590c;
    d[] d;
    int e;
    int f;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public m() {
        this.e = -1;
    }

    public m(Parcel parcel) {
        this.e = -1;
        this.f589b = (n[]) parcel.createTypedArray(n.CREATOR);
        this.f590c = parcel.createIntArray();
        this.d = (d[]) parcel.createTypedArray(d.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f589b, i);
        parcel.writeIntArray(this.f590c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
