package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class c extends o implements k.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k f536a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f538c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    String j;
    boolean k;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList<String> q;
    ArrayList<String> r;
    ArrayList<Runnable> t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<a> f537b = new ArrayList<>();
    int l = -1;
    boolean s = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f541c;
        int d;
        int e;
        int f;

        a() {
        }

        a(int i, e eVar) {
            this.f539a = i;
            this.f540b = eVar;
        }
    }

    public c(k kVar) {
        this.f536a = kVar;
    }

    private static boolean b(a aVar) {
        e eVar = aVar.f540b;
        return (eVar == null || !eVar.l || eVar.J == null || eVar.C || eVar.B || !eVar.D()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    e a(ArrayList<e> arrayList, e eVar) {
        e eVar2 = eVar;
        int i = 0;
        while (i < this.f537b.size()) {
            a aVar = this.f537b.get(i);
            int i2 = aVar.f539a;
            if (i2 == 1) {
                arrayList.add(aVar.f540b);
            } else if (i2 == 2) {
                e eVar3 = aVar.f540b;
                int i3 = eVar3.z;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e eVar4 = arrayList.get(size);
                    if (eVar4.z == i3) {
                        if (eVar4 == eVar3) {
                            z = true;
                        } else {
                            if (eVar4 == eVar2) {
                                this.f537b.add(i, new a(9, eVar4));
                                i++;
                                eVar2 = null;
                            }
                            a aVar2 = new a(3, eVar4);
                            aVar2.f541c = aVar.f541c;
                            aVar2.e = aVar.e;
                            aVar2.d = aVar.d;
                            aVar2.f = aVar.f;
                            this.f537b.add(i, aVar2);
                            arrayList.remove(eVar4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f537b.remove(i);
                    i--;
                } else {
                    aVar.f539a = 1;
                    arrayList.add(eVar3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(aVar.f540b);
                e eVar5 = aVar.f540b;
                if (eVar5 == eVar2) {
                    this.f537b.add(i, new a(9, eVar5));
                    i++;
                    eVar2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(aVar.f540b);
            } else if (i2 == 8) {
                this.f537b.add(i, new a(9, eVar2));
                i++;
                eVar2 = aVar.f540b;
            }
            i++;
        }
        return eVar2;
    }

    void a() {
        int size = this.f537b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f537b.get(i);
            e eVar = aVar.f540b;
            if (eVar != null) {
                eVar.a(this.g, this.h);
            }
            switch (aVar.f539a) {
                case 1:
                    eVar.a(aVar.f541c);
                    this.f536a.a(eVar, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f539a);
                case 3:
                    eVar.a(aVar.d);
                    this.f536a.k(eVar);
                    break;
                case 4:
                    eVar.a(aVar.d);
                    this.f536a.e(eVar);
                    break;
                case 5:
                    eVar.a(aVar.f541c);
                    this.f536a.o(eVar);
                    break;
                case 6:
                    eVar.a(aVar.d);
                    this.f536a.c(eVar);
                    break;
                case 7:
                    eVar.a(aVar.f541c);
                    this.f536a.a(eVar);
                    break;
                case 8:
                    this.f536a.n(eVar);
                    break;
                case 9:
                    this.f536a.n(null);
                    break;
            }
            if (!this.s && aVar.f539a != 1 && eVar != null) {
                this.f536a.h(eVar);
            }
        }
        if (this.s) {
            return;
        }
        k kVar = this.f536a;
        kVar.a(kVar.m, true);
    }

    void a(int i) {
        if (this.i) {
            if (k.F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f537b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f537b.get(i2);
                e eVar = aVar.f540b;
                if (eVar != null) {
                    eVar.r += i;
                    if (k.F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f540b + " to " + aVar.f540b.r);
                    }
                }
            }
        }
    }

    void a(a aVar) {
        this.f537b.add(aVar);
        aVar.f541c = this.f538c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
    }

    void a(e.f fVar) {
        for (int i = 0; i < this.f537b.size(); i++) {
            a aVar = this.f537b.get(i);
            if (b(aVar)) {
                aVar.f540b.a(fVar);
            }
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.k);
            if (this.g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.f538c != 0 || this.d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f538c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.d));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (this.f537b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.f537b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f537b.get(i);
            switch (aVar.f539a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    str2 = "cmd=" + aVar.f539a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f540b);
            if (z) {
                if (aVar.f541c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f541c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    void a(boolean z) {
        for (int size = this.f537b.size() - 1; size >= 0; size--) {
            a aVar = this.f537b.get(size);
            e eVar = aVar.f540b;
            if (eVar != null) {
                eVar.a(k.e(this.g), this.h);
            }
            switch (aVar.f539a) {
                case 1:
                    eVar.a(aVar.f);
                    this.f536a.k(eVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f539a);
                case 3:
                    eVar.a(aVar.e);
                    this.f536a.a(eVar, false);
                    break;
                case 4:
                    eVar.a(aVar.e);
                    this.f536a.o(eVar);
                    break;
                case 5:
                    eVar.a(aVar.f);
                    this.f536a.e(eVar);
                    break;
                case 6:
                    eVar.a(aVar.e);
                    this.f536a.a(eVar);
                    break;
                case 7:
                    eVar.a(aVar.f);
                    this.f536a.c(eVar);
                    break;
                case 8:
                    this.f536a.n(null);
                    break;
                case 9:
                    this.f536a.n(eVar);
                    break;
            }
            if (!this.s && aVar.f539a != 3 && eVar != null) {
                this.f536a.h(eVar);
            }
        }
        if (this.s || !z) {
            return;
        }
        k kVar = this.f536a;
        kVar.a(kVar.m, true);
    }

    boolean a(ArrayList<c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f537b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.f537b.get(i4).f540b;
            int i5 = eVar != null ? eVar.z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    c cVar = arrayList.get(i6);
                    int size2 = cVar.f537b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        e eVar2 = cVar.f537b.get(i7).f540b;
                        if ((eVar2 != null ? eVar2.z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // android.support.v4.app.k.l
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (k.F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.i) {
            return true;
        }
        this.f536a.a(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    e b(ArrayList<e> arrayList, e eVar) {
        for (int i = 0; i < this.f537b.size(); i++) {
            a aVar = this.f537b.get(i);
            int i2 = aVar.f539a;
            if (i2 == 1) {
                arrayList.remove(aVar.f540b);
            } else if (i2 != 3) {
                switch (i2) {
                    case 6:
                        arrayList.add(aVar.f540b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f540b);
                        break;
                    case 8:
                        eVar = null;
                        break;
                    case 9:
                        eVar = aVar.f540b;
                        break;
                }
            } else {
                arrayList.add(aVar.f540b);
            }
        }
        return eVar;
    }

    public String b() {
        return this.j;
    }

    boolean b(int i) {
        int size = this.f537b.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.f537b.get(i2).f540b;
            int i3 = eVar != null ? eVar.z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    boolean c() {
        for (int i = 0; i < this.f537b.size(); i++) {
            if (b(this.f537b.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        ArrayList<Runnable> arrayList = this.t;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.t.get(i).run();
            }
            this.t = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.l >= 0) {
            sb.append(" #");
            sb.append(this.l);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }
}
