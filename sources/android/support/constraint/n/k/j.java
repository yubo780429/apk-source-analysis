package android.support.constraint.n.k;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f498a = new boolean[3];

    static void a(f fVar, android.support.constraint.n.d dVar, e eVar) {
        eVar.l = -1;
        eVar.m = -1;
        if (fVar.Q[0] != e.b.WRAP_CONTENT && eVar.Q[0] == e.b.MATCH_PARENT) {
            int i = eVar.F.g;
            int iC = fVar.C() - eVar.H.g;
            d dVar2 = eVar.F;
            dVar2.i = dVar.a(dVar2);
            d dVar3 = eVar.H;
            dVar3.i = dVar.a(dVar3);
            dVar.a(eVar.F.i, i);
            dVar.a(eVar.H.i, iC);
            eVar.l = 2;
            eVar.c(i, iC);
        }
        if (fVar.Q[1] == e.b.WRAP_CONTENT || eVar.Q[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i2 = eVar.G.g;
        int iK = fVar.k() - eVar.I.g;
        d dVar4 = eVar.G;
        dVar4.i = dVar.a(dVar4);
        d dVar5 = eVar.I;
        dVar5.i = dVar.a(dVar5);
        dVar.a(eVar.G.i, i2);
        dVar.a(eVar.I.i, iK);
        if (eVar.Y > 0 || eVar.B() == 8) {
            d dVar6 = eVar.J;
            dVar6.i = dVar.a(dVar6);
            dVar.a(eVar.J.i, eVar.Y + i2);
        }
        eVar.m = 2;
        eVar.f(i2, iK);
    }

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }
}
