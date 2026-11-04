package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f592c;
    final boolean d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final Bundle j;
    final boolean k;
    Bundle l;
    e m;

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    n(Parcel parcel) {
        this.f591b = parcel.readString();
        this.f592c = parcel.readInt();
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readBundle();
    }

    n(e eVar) {
        this.f591b = eVar.getClass().getName();
        this.f592c = eVar.f;
        this.d = eVar.n;
        this.e = eVar.y;
        this.f = eVar.z;
        this.g = eVar.A;
        this.h = eVar.D;
        this.i = eVar.C;
        this.j = eVar.h;
        this.k = eVar.B;
    }

    public e a(i iVar, g gVar, e eVar, l lVar, android.arch.lifecycle.p pVar) {
        if (this.m == null) {
            Context contextC = iVar.c();
            Bundle bundle = this.j;
            if (bundle != null) {
                bundle.setClassLoader(contextC.getClassLoader());
            }
            this.m = gVar != null ? gVar.a(contextC, this.f591b, this.j) : e.a(contextC, this.f591b, this.j);
            Bundle bundle2 = this.l;
            if (bundle2 != null) {
                bundle2.setClassLoader(contextC.getClassLoader());
                this.m.f545c = this.l;
            }
            this.m.a(this.f592c, eVar);
            e eVar2 = this.m;
            eVar2.n = this.d;
            eVar2.p = true;
            eVar2.y = this.e;
            eVar2.z = this.f;
            eVar2.A = this.g;
            eVar2.D = this.h;
            eVar2.C = this.i;
            eVar2.B = this.k;
            eVar2.s = iVar.d;
            if (k.F) {
                Log.v("FragmentManager", "Instantiated fragment " + this.m);
            }
        }
        e eVar3 = this.m;
        eVar3.v = lVar;
        eVar3.w = pVar;
        return eVar3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f591b);
        parcel.writeInt(this.f592c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.l);
    }
}
