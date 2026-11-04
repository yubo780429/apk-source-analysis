package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1382c;
    private final String d;

    public static class a implements Parcelable.Creator<k> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k(k kVar) {
        this.f1382c = kVar.b();
        this.f1381b = kVar.a();
        this.d = kVar.c();
    }

    public k(String str, String str2, String str3) {
        this.f1382c = str2;
        this.f1381b = str;
        this.d = str3;
    }

    public String a() {
        return this.f1381b;
    }

    public String b() {
        return this.f1382c;
    }

    public String c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1382c);
        parcel.writeString(this.f1381b);
        parcel.writeString(this.d);
    }
}
