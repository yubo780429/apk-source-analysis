package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1380c;
    private final String d;
    private final String e;
    private final String f;

    public static class a implements Parcelable.Creator<j> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    public j(String str, String str2, double d, String str3, String str4) {
        this.f1380c = str;
        this.d = str2;
        this.f1379b = d;
        this.e = str3;
        this.f = str4;
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.f1380c;
    }

    public String c() {
        return this.d;
    }

    public double d() {
        return this.f1379b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1380c);
        parcel.writeString(this.d);
        parcel.writeDouble(this.f1379b);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
