package b.b.c.g;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcelable f1100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1099c = new C0047a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: b.b.c.g.a$a, reason: collision with other inner class name */
    static class C0047a extends a {
        C0047a() {
            super((C0047a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f1099c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    private a() {
        this.f1100b = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1100b = parcelable == null ? f1099c : parcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1100b = parcelable == f1099c ? null : parcelable;
    }

    /* synthetic */ a(C0047a c0047a) {
        this();
    }

    public final Parcelable a() {
        return this.f1100b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1100b, i);
    }
}
