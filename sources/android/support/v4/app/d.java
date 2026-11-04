package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f543c;
    final int d;
    final String e;
    final int f;
    final int g;
    final CharSequence h;
    final int i;
    final CharSequence j;
    final ArrayList<String> k;
    final ArrayList<String> l;
    final boolean m;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(Parcel parcel) {
        this.f542b = parcel.createIntArray();
        this.f543c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createStringArrayList();
        this.l = parcel.createStringArrayList();
        this.m = parcel.readInt() != 0;
    }

    public d(c cVar) {
        int size = cVar.f537b.size();
        this.f542b = new int[size * 6];
        if (!cVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c.a aVar = cVar.f537b.get(i2);
            int[] iArr = this.f542b;
            int i3 = i + 1;
            iArr[i] = aVar.f539a;
            int i4 = i3 + 1;
            e eVar = aVar.f540b;
            iArr[i3] = eVar != null ? eVar.f : -1;
            int[] iArr2 = this.f542b;
            int i5 = i4 + 1;
            iArr2[i4] = aVar.f541c;
            int i6 = i5 + 1;
            iArr2[i5] = aVar.d;
            int i7 = i6 + 1;
            iArr2[i6] = aVar.e;
            i = i7 + 1;
            iArr2[i7] = aVar.f;
        }
        this.f543c = cVar.g;
        this.d = cVar.h;
        this.e = cVar.j;
        this.f = cVar.l;
        this.g = cVar.m;
        this.h = cVar.n;
        this.i = cVar.o;
        this.j = cVar.p;
        this.k = cVar.q;
        this.l = cVar.r;
        this.m = cVar.s;
    }

    public c a(k kVar) {
        c cVar = new c(kVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f542b.length) {
            c.a aVar = new c.a();
            int i3 = i + 1;
            aVar.f539a = this.f542b[i];
            if (k.F) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i2 + " base fragment #" + this.f542b[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f542b[i3];
            aVar.f540b = i5 >= 0 ? kVar.f.get(i5) : null;
            int[] iArr = this.f542b;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar.f541c = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar.d = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar.e = i11;
            int i12 = iArr[i10];
            aVar.f = i12;
            cVar.f538c = i7;
            cVar.d = i9;
            cVar.e = i11;
            cVar.f = i12;
            cVar.a(aVar);
            i2++;
            i = i10 + 1;
        }
        cVar.g = this.f543c;
        cVar.h = this.d;
        cVar.j = this.e;
        cVar.l = this.f;
        cVar.i = true;
        cVar.m = this.g;
        cVar.n = this.h;
        cVar.o = this.i;
        cVar.p = this.j;
        cVar.q = this.k;
        cVar.r = this.l;
        cVar.s = this.m;
        cVar.a(1);
        return cVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f542b);
        parcel.writeInt(this.f543c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        TextUtils.writeToParcel(this.h, parcel, 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeStringList(this.k);
        parcel.writeStringList(this.l);
        parcel.writeInt(this.m ? 1 : 0);
    }
}
