package android.support.constraint.n.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(android.support.constraint.n.k.e eVar, int i, ArrayList<o> arrayList, o oVar) {
        android.support.constraint.n.k.d dVar;
        int iW;
        int i2 = i == 0 ? eVar.m0 : eVar.n0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f520b)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                o oVar2 = arrayList.get(i3);
                if (oVar2.a() == i2) {
                    if (oVar != null) {
                        oVar.a(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof android.support.constraint.n.k.i) && (iW = ((android.support.constraint.n.k.i) eVar).w(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    o oVar3 = arrayList.get(i4);
                    if (oVar3.a() == iW) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof android.support.constraint.n.k.g) {
                android.support.constraint.n.k.g gVar = (android.support.constraint.n.k.g) eVar;
                gVar.R().a(gVar.S() == 0 ? 1 : 0, arrayList, oVar);
            }
            int iA = oVar.a();
            if (i == 0) {
                eVar.m0 = iA;
                eVar.F.a(i, arrayList, oVar);
                dVar = eVar.H;
            } else {
                eVar.n0 = iA;
                eVar.G.a(i, arrayList, oVar);
                eVar.J.a(i, arrayList, oVar);
                dVar = eVar.I;
            }
            dVar.a(i, arrayList, oVar);
            eVar.M.a(i, arrayList, oVar);
        }
        return oVar;
    }

    private static o a(ArrayList<o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = arrayList.get(i2);
            if (i == oVar.f520b) {
                return oVar;
            }
        }
        return null;
    }

    public static boolean a(android.support.constraint.n.k.e.b bVar, android.support.constraint.n.k.e.b bVar2, android.support.constraint.n.k.e.b bVar3, android.support.constraint.n.k.e.b bVar4) {
        return (bVar3 == android.support.constraint.n.k.e.b.FIXED || bVar3 == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVar3 == android.support.constraint.n.k.e.b.MATCH_PARENT && bVar != android.support.constraint.n.k.e.b.WRAP_CONTENT)) || (bVar4 == android.support.constraint.n.k.e.b.FIXED || bVar4 == android.support.constraint.n.k.e.b.WRAP_CONTENT || (bVar4 == android.support.constraint.n.k.e.b.MATCH_PARENT && bVar2 != android.support.constraint.n.k.e.b.WRAP_CONTENT));
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0340  */
    public static boolean a(android.support.constraint.n.k.f fVar, b.InterfaceC0025b interfaceC0025b) {
        o oVar;
        boolean z;
        o oVar2;
        Object obj;
        ArrayList<android.support.constraint.n.k.e> arrayListR = fVar.R();
        int size = arrayListR.size();
        for (int i = 0; i < size; i++) {
            android.support.constraint.n.k.e eVar = arrayListR.get(i);
            if (!a(fVar.n(), fVar.z(), eVar.n(), eVar.z())) {
                return false;
            }
        }
        android.support.constraint.n.e eVar2 = fVar.u0;
        if (eVar2 != null) {
            eVar2.A++;
        }
        ArrayList arrayList = null;
        ArrayList<android.support.constraint.n.k.i> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<android.support.constraint.n.k.i> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        for (int i2 = 0; i2 < size; i2++) {
            android.support.constraint.n.k.e eVar3 = arrayListR.get(i2);
            if (!a(fVar.n(), fVar.z(), eVar3.n(), eVar3.z())) {
                android.support.constraint.n.k.f.a(eVar3, interfaceC0025b, fVar.J0, b.a.k);
            }
            boolean z2 = eVar3 instanceof android.support.constraint.n.k.g;
            if (z2) {
                android.support.constraint.n.k.g gVar = (android.support.constraint.n.k.g) eVar3;
                if (gVar.S() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(gVar);
                }
                if (gVar.S() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (eVar3 instanceof android.support.constraint.n.k.i) {
                if (eVar3 instanceof android.support.constraint.n.k.a) {
                    android.support.constraint.n.k.a aVar = (android.support.constraint.n.k.a) eVar3;
                    if (aVar.V() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    int iV = aVar.V();
                    obj = aVar;
                    if (iV == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            obj = aVar;
                        }
                    }
                } else {
                    android.support.constraint.n.k.i iVar = (android.support.constraint.n.k.i) eVar3;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                    obj = iVar;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        obj = iVar;
                    }
                }
                arrayList4.add(obj);
            }
            if (eVar3.F.f == null && eVar3.H.f == null && !z2 && !(eVar3 instanceof android.support.constraint.n.k.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar3);
            }
            if (eVar3.G.f == null && eVar3.I.f == null && eVar3.J.f == null && !z2 && !(eVar3 instanceof android.support.constraint.n.k.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar3);
            }
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((android.support.constraint.n.k.g) it.next(), 0, arrayList7, (o) null);
            }
        }
        int i3 = 0;
        o oVar3 = null;
        if (arrayList2 != null) {
            for (android.support.constraint.n.k.i iVar2 : arrayList2) {
                o oVarA = a(iVar2, i3, arrayList7, oVar3);
                iVar2.a(arrayList7, i3, oVarA);
                oVarA.a(arrayList7);
                i3 = 0;
                oVar3 = null;
            }
        }
        android.support.constraint.n.k.d dVarA = fVar.a(android.support.constraint.n.k.d.b.LEFT);
        if (dVarA.a() != null) {
            Iterator<android.support.constraint.n.k.d> it2 = dVarA.a().iterator();
            while (it2.hasNext()) {
                a(it2.next().d, 0, arrayList7, (o) null);
            }
        }
        android.support.constraint.n.k.d dVarA2 = fVar.a(android.support.constraint.n.k.d.b.RIGHT);
        if (dVarA2.a() != null) {
            Iterator<android.support.constraint.n.k.d> it3 = dVarA2.a().iterator();
            while (it3.hasNext()) {
                a(it3.next().d, 0, arrayList7, (o) null);
            }
        }
        android.support.constraint.n.k.d dVarA3 = fVar.a(android.support.constraint.n.k.d.b.CENTER);
        if (dVarA3.a() != null) {
            Iterator<android.support.constraint.n.k.d> it4 = dVarA3.a().iterator();
            while (it4.hasNext()) {
                a(it4.next().d, 0, arrayList7, (o) null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((android.support.constraint.n.k.e) it5.next(), 0, arrayList7, (o) null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((android.support.constraint.n.k.g) it6.next(), 1, arrayList7, (o) null);
            }
        }
        if (arrayList4 != null) {
            for (android.support.constraint.n.k.i iVar3 : arrayList4) {
                o oVarA2 = a(iVar3, 1, arrayList7, oVar4);
                iVar3.a(arrayList7, 1, oVarA2);
                oVarA2.a(arrayList7);
                oVar4 = null;
            }
        }
        android.support.constraint.n.k.d dVarA4 = fVar.a(android.support.constraint.n.k.d.b.TOP);
        if (dVarA4.a() != null) {
            Iterator<android.support.constraint.n.k.d> it7 = dVarA4.a().iterator();
            while (it7.hasNext()) {
                a(it7.next().d, 1, arrayList7, (o) null);
            }
        }
        android.support.constraint.n.k.d dVarA5 = fVar.a(android.support.constraint.n.k.d.b.BASELINE);
        if (dVarA5.a() != null) {
            Iterator<android.support.constraint.n.k.d> it8 = dVarA5.a().iterator();
            while (it8.hasNext()) {
                a(it8.next().d, 1, arrayList7, (o) null);
            }
        }
        android.support.constraint.n.k.d dVarA6 = fVar.a(android.support.constraint.n.k.d.b.BOTTOM);
        if (dVarA6.a() != null) {
            Iterator<android.support.constraint.n.k.d> it9 = dVarA6.a().iterator();
            while (it9.hasNext()) {
                a(it9.next().d, 1, arrayList7, (o) null);
            }
        }
        android.support.constraint.n.k.d dVarA7 = fVar.a(android.support.constraint.n.k.d.b.CENTER);
        if (dVarA7.a() != null) {
            Iterator<android.support.constraint.n.k.d> it10 = dVarA7.a().iterator();
            while (it10.hasNext()) {
                a(it10.next().d, 1, arrayList7, (o) null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((android.support.constraint.n.k.e) it11.next(), 1, arrayList7, (o) null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            android.support.constraint.n.k.e eVar4 = arrayListR.get(i4);
            if (eVar4.O()) {
                o oVarA3 = a(arrayList7, eVar4.m0);
                o oVarA4 = a(arrayList7, eVar4.n0);
                if (oVarA3 != null && oVarA4 != null) {
                    oVarA3.a(0, oVarA4);
                    oVarA4.a(2);
                    arrayList7.remove(oVarA3);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.n() == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
            oVar = null;
            int i5 = 0;
            for (o oVar5 : arrayList7) {
                if (oVar5.b() != 1) {
                    oVar5.a(false);
                    int iA = oVar5.a(fVar.W(), 0);
                    if (iA > i5) {
                        oVar = oVar5;
                        i5 = iA;
                    }
                }
            }
            if (oVar != null) {
                fVar.a(android.support.constraint.n.k.e.b.FIXED);
                fVar.t(i5);
                oVar.a(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.z() == android.support.constraint.n.k.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i6 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.b() != 0) {
                    oVar7.a(false);
                    int iA2 = oVar7.a(fVar.W(), 1);
                    if (iA2 > i6) {
                        oVar6 = oVar7;
                        i6 = iA2;
                    }
                }
            }
            z = false;
            if (oVar6 != null) {
                fVar.b(android.support.constraint.n.k.e.b.FIXED);
                fVar.l(i6);
                oVar6.a(true);
                oVar2 = oVar6;
            }
            if (oVar == null || oVar2 != null) {
                return true;
            }
            return z;
        }
        z = false;
        oVar2 = null;
        if (oVar == null) {
        }
        return true;
    }
}
