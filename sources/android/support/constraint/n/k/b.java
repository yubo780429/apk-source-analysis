package android.support.constraint.n.k;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x0172  */
    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:106:0x019c  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:192:0x032b  */
    /* JADX WARN: Code duplicated, block: B:193:0x033d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0345  */
    /* JADX WARN: Code duplicated, block: B:196:0x0348  */
    /* JADX WARN: Code duplicated, block: B:199:0x0352  */
    /* JADX WARN: Code duplicated, block: B:201:0x0359  */
    /* JADX WARN: Code duplicated, block: B:258:0x041f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0428  */
    /* JADX WARN: Code duplicated, block: B:264:0x0434  */
    /* JADX WARN: Code duplicated, block: B:265:0x0437  */
    /* JADX WARN: Code duplicated, block: B:271:0x0457  */
    /* JADX WARN: Code duplicated, block: B:29:0x004a A[PHI: r8 r14
  0x004a: PHI (r8v4 boolean) = (r8v2 boolean), (r8v50 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r14v4 boolean) = (r14v2 boolean), (r14v36 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[PHI: r8 r14
  0x004c: PHI (r8v47 boolean) = (r8v2 boolean), (r8v50 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r14v33 boolean) = (r14v2 boolean), (r14v36 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v0, types: [android.support.constraint.n.d] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [android.support.constraint.n.i] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.support.constraint.n.k.e] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    static void a(f fVar, android.support.constraint.n.d dVar, int i, int i2, c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        d dVar2;
        android.support.constraint.n.i iVar;
        d dVar3;
        android.support.constraint.n.i iVar2;
        int i5;
        d dVar4;
        int iC;
        int i6;
        int iC2;
        d dVar5;
        android.support.constraint.n.i iVar3;
        android.support.constraint.n.i iVar4;
        ?? r5;
        int size;
        d dVar6;
        int i7;
        e eVar = cVar.f481a;
        e eVar2 = cVar.f483c;
        e eVar3 = cVar.f482b;
        e eVar4 = cVar.d;
        e eVar5 = cVar.e;
        float f = cVar.k;
        e eVar6 = cVar.f;
        e eVar7 = cVar.g;
        boolean z4 = fVar.Q[i] == e.b.WRAP_CONTENT;
        if (i == 0) {
            z = eVar5.h0 == 0;
            z2 = eVar5.h0 == 1;
            if (eVar5.h0 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z = eVar5.i0 == 0;
            z2 = eVar5.i0 == 1;
            if (eVar5.i0 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r7 = eVar;
        boolean z5 = z2;
        boolean z6 = z;
        boolean z7 = false;
        while (true) {
            Object obj = null;
            if (z7) {
                break;
            }
            d dVar7 = r7.N[i2];
            int i8 = z3 ? 1 : 4;
            int iC3 = dVar7.c();
            float f2 = f;
            boolean z8 = z7;
            boolean z9 = r7.Q[i] == e.b.MATCH_CONSTRAINT && r7.p[i] == 0;
            d dVar8 = dVar7.f;
            if (dVar8 != null && r7 != eVar) {
                iC3 += dVar8.c();
            }
            int i9 = iC3;
            if (z3 && r7 != eVar && r7 != eVar3) {
                i8 = 8;
            }
            d dVar9 = dVar7.f;
            if (dVar9 != null) {
                if (r7 == eVar3) {
                    dVar.b(dVar7.i, dVar9.i, i9, 6);
                } else {
                    dVar.b(dVar7.i, dVar9.i, i9, 8);
                }
                dVar.a(dVar7.i, dVar7.f.i, i9, (!z9 || z3) ? i8 : 5);
            } else {
                eVar5 = eVar5;
                z6 = z6;
            }
            if (z4) {
                if (r7.B() == 8 || r7.Q[i] != e.b.MATCH_CONSTRAINT) {
                    i7 = 0;
                } else {
                    d[] dVarArr = r7.N;
                    i7 = 0;
                    dVar.b(dVarArr[i2 + 1].i, dVarArr[i2].i, 0, 5);
                }
                dVar.b(r7.N[i2].i, fVar.N[i2].i, i7, 8);
            }
            d dVar10 = r7.N[i2 + 1].f;
            if (dVar10 != null) {
                e eVar8 = dVar10.d;
                d[] dVarArr2 = eVar8.N;
                if (dVarArr2[i2].f != null && dVarArr2[i2].f.d == r7) {
                    obj = eVar8;
                }
            }
            if (obj != null) {
                r7 = obj;
                z7 = z8;
            } else {
                z7 = true;
            }
            z5 = z5;
            f = f2;
            z6 = z6;
            eVar5 = eVar5;
            r7 = r7;
        }
        e eVar9 = eVar5;
        float f3 = f;
        boolean z10 = z6;
        boolean z11 = z5;
        if (eVar4 != null) {
            int i10 = i2 + 1;
            if (eVar2.N[i10].f != null) {
                d dVar11 = eVar4.N[i10];
                if ((eVar4.Q[i] == e.b.MATCH_CONSTRAINT && eVar4.p[i] == 0) && !z3) {
                    d dVar12 = dVar11.f;
                    if (dVar12.d == fVar) {
                        dVar.a(dVar11.i, dVar12.i, -dVar11.c(), 5);
                    } else if (z3) {
                        dVar6 = dVar11.f;
                        if (dVar6.d == fVar) {
                            dVar.a(dVar11.i, dVar6.i, -dVar11.c(), 4);
                        }
                    }
                } else if (z3) {
                    dVar6 = dVar11.f;
                    if (dVar6.d == fVar) {
                        dVar.a(dVar11.i, dVar6.i, -dVar11.c(), 4);
                    }
                }
                dVar.c(dVar11.i, eVar2.N[i10].f.i, -dVar11.c(), 6);
            }
        }
        if (z4) {
            int i11 = i2 + 1;
            android.support.constraint.n.i iVar5 = fVar.N[i11].i;
            d[] dVarArr3 = eVar2.N;
            dVar.b(iVar5, dVarArr3[i11].i, dVarArr3[i11].c(), 8);
        }
        ArrayList<e> arrayList = cVar.h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f4 = (!cVar.q || cVar.s) ? f3 : cVar.j;
            float f5 = 0.0f;
            float f6 = 0.0f;
            e eVar10 = null;
            int i12 = 0;
            while (i12 < size) {
                e eVar11 = arrayList.get(i12);
                float f7 = eVar11.j0[i];
                if (f7 < f5) {
                    if (cVar.s) {
                        d[] dVarArr4 = eVar11.N;
                        dVar.a(dVarArr4[i2 + 1].i, dVarArr4[i2].i, 0, 4);
                    } else {
                        f7 = 1.0f;
                        f5 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i12++;
                    size = size;
                    arrayList = arrayList;
                    f5 = 0.0f;
                }
                if (f7 == f5) {
                    d[] dVarArr5 = eVar11.N;
                    dVar.a(dVarArr5[i2 + 1].i, dVarArr5[i2].i, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (eVar10 != null) {
                        d[] dVarArr6 = eVar10.N;
                        android.support.constraint.n.i iVar6 = dVarArr6[i2].i;
                        int i13 = i2 + 1;
                        android.support.constraint.n.i iVar7 = dVarArr6[i13].i;
                        d[] dVarArr7 = eVar11.N;
                        android.support.constraint.n.i iVar8 = dVarArr7[i2].i;
                        android.support.constraint.n.i iVar9 = dVarArr7[i13].i;
                        android.support.constraint.n.b bVarB = dVar.b();
                        bVarB.a(f6, f4, f7, iVar6, iVar7, iVar8, iVar9);
                        dVar.a(bVarB);
                    }
                    f6 = f7;
                    eVar10 = eVar11;
                }
                i12++;
                size = size;
                arrayList = arrayList;
                f5 = 0.0f;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z3)) {
            d dVar13 = eVar.N[i2];
            int i14 = i2 + 1;
            d dVar14 = eVar2.N[i14];
            d dVar15 = dVar13.f;
            android.support.constraint.n.i iVar10 = dVar15 != null ? dVar15.i : null;
            d dVar16 = dVar14.f;
            android.support.constraint.n.i iVar11 = dVar16 != null ? dVar16.i : null;
            d dVar17 = eVar3.N[i2];
            d dVar18 = eVar4.N[i14];
            if (iVar10 != null && iVar11 != null) {
                dVar.a(dVar17.i, iVar10, dVar17.c(), i == 0 ? eVar9.b0 : eVar9.c0, iVar11, dVar18.i, dVar18.c(), 7);
            }
        } else if (!z10 || eVar3 == null) {
            int i15 = 8;
            if (z11 && eVar3 != null) {
                int i16 = cVar.j;
                boolean z12 = i16 > 0 && cVar.i == i16;
                e eVar12 = eVar3;
                e eVar13 = eVar12;
                while (eVar12 != null) {
                    e eVar14 = eVar12.l0[i];
                    while (eVar14 != null && eVar14.B() == i15) {
                        eVar14 = eVar14.l0[i];
                    }
                    if (eVar12 == eVar3 || eVar12 == eVar4 || eVar14 == null) {
                        eVar13 = eVar13;
                        i4 = i15;
                    } else {
                        e eVar15 = eVar14 == eVar4 ? null : eVar14;
                        d dVar19 = eVar12.N[i2];
                        android.support.constraint.n.i iVar12 = dVar19.i;
                        d dVar20 = dVar19.f;
                        if (dVar20 != null) {
                            android.support.constraint.n.i iVar13 = dVar20.i;
                        }
                        int i17 = i2 + 1;
                        android.support.constraint.n.i iVar14 = eVar13.N[i17].i;
                        int iC4 = dVar19.c();
                        int iC5 = eVar12.N[i17].c();
                        if (eVar15 != null) {
                            dVar2 = eVar15.N[i2];
                            iVar = dVar2.i;
                            dVar3 = dVar2.f;
                            if (dVar3 == null) {
                                iVar2 = null;
                            }
                            if (dVar2 != null) {
                                iC5 += dVar2.c();
                            }
                            int i18 = iC5;
                            if (eVar13 != null) {
                                iC4 += eVar13.N[i17].c();
                            }
                            int i19 = iC4;
                            if (z12) {
                                i5 = 8;
                            } else {
                                i5 = 4;
                            }
                            if (iVar12 != null || iVar14 == null || iVar == null || iVar2 == null) {
                                i4 = 8;
                            } else {
                                i4 = 8;
                                dVar.a(iVar12, iVar14, i19, 0.5f, iVar, iVar2, i18, i5);
                            }
                            eVar14 = eVar15;
                        } else {
                            dVar2 = eVar4.N[i2];
                            iVar = dVar2 != null ? dVar2.i : null;
                            dVar3 = eVar12.N[i17];
                        }
                        iVar2 = dVar3.i;
                        if (dVar2 != null) {
                            iC5 += dVar2.c();
                        }
                        int i110 = iC5;
                        if (eVar13 != null) {
                            iC4 += eVar13.N[i17].c();
                        }
                        int i111 = iC4;
                        if (z12) {
                            i5 = 8;
                        } else {
                            i5 = 4;
                        }
                        if (iVar12 != null) {
                            i4 = 8;
                        } else {
                            i4 = 8;
                        }
                        eVar14 = eVar15;
                    }
                    if (eVar12.B() == i4) {
                        eVar12 = eVar13;
                    }
                    i15 = i4;
                    eVar13 = eVar12;
                    eVar12 = eVar14;
                }
                d dVar21 = eVar3.N[i2];
                d dVar22 = eVar.N[i2].f;
                int i20 = i2 + 1;
                d dVar23 = eVar4.N[i20];
                d dVar24 = eVar2.N[i20].f;
                if (dVar22 == null) {
                    i3 = 5;
                } else if (eVar3 != eVar4) {
                    i3 = 5;
                    dVar.a(dVar21.i, dVar22.i, dVar21.c(), 5);
                } else {
                    i3 = 5;
                    if (dVar24 != null) {
                        dVar.a(dVar21.i, dVar22.i, dVar21.c(), 0.5f, dVar23.i, dVar24.i, dVar23.c(), 5);
                    }
                }
                if (dVar24 != null && eVar3 != eVar4) {
                    dVar.a(dVar23.i, dVar24.i, -dVar23.c(), i3);
                }
            }
        } else {
            int i21 = cVar.j;
            boolean z13 = i21 > 0 && cVar.i == i21;
            e eVar16 = eVar3;
            e eVar17 = eVar16;
            while (eVar16 != null) {
                e eVar18 = eVar16.l0[i];
                while (eVar18 != null && eVar18.B() == 8) {
                    eVar18 = eVar18.l0[i];
                }
                if (eVar18 != null || eVar16 == eVar4) {
                    d dVar25 = eVar16.N[i2];
                    android.support.constraint.n.i iVar15 = dVar25.i;
                    d dVar26 = dVar25.f;
                    android.support.constraint.n.i iVar16 = dVar26 != null ? dVar26.i : null;
                    if (eVar17 != eVar16) {
                        dVar4 = eVar17.N[i2 + 1];
                    } else {
                        if (eVar16 == eVar3 && eVar17 == eVar16) {
                            d[] dVarArr8 = eVar.N;
                            if (dVarArr8[i2].f != null) {
                                dVar4 = dVarArr8[i2].f;
                            } else {
                                iVar16 = null;
                            }
                        }
                        iC = dVar25.c();
                        i6 = i2 + 1;
                        iC2 = eVar16.N[i6].c();
                        if (eVar18 != null) {
                            dVar5 = eVar18.N[i2];
                            android.support.constraint.n.i iVar17 = dVar5.i;
                            iVar4 = eVar16.N[i6].i;
                            iVar3 = iVar17;
                        } else {
                            dVar5 = eVar2.N[i6].f;
                            if (dVar5 != null) {
                                iVar3 = dVar5.i;
                            } else {
                                iVar3 = null;
                            }
                            iVar4 = eVar16.N[i6].i;
                        }
                        if (dVar5 != null) {
                            iC2 += dVar5.c();
                        }
                        if (eVar17 != null) {
                            iC += eVar17.N[i6].c();
                        }
                        if (iVar15 == null && iVar16 != null && iVar3 != null && iVar4 != null) {
                            if (eVar16 == eVar3) {
                                iC = eVar3.N[i2].c();
                            }
                            dVar.a(iVar15, iVar16, iC, 0.5f, iVar3, iVar4, eVar16 == eVar4 ? eVar4.N[i6].c() : iC2, z13 ? 8 : 5);
                        }
                    }
                    iVar16 = dVar4.i;
                    iC = dVar25.c();
                    i6 = i2 + 1;
                    iC2 = eVar16.N[i6].c();
                    if (eVar18 != null) {
                        dVar5 = eVar18.N[i2];
                        android.support.constraint.n.i iVar18 = dVar5.i;
                        iVar4 = eVar16.N[i6].i;
                        iVar3 = iVar18;
                    } else {
                        dVar5 = eVar2.N[i6].f;
                        if (dVar5 != null) {
                            iVar3 = dVar5.i;
                        } else {
                            iVar3 = null;
                        }
                        iVar4 = eVar16.N[i6].i;
                    }
                    if (dVar5 != null) {
                        iC2 += dVar5.c();
                    }
                    if (eVar17 != null) {
                        iC += eVar17.N[i6].c();
                    }
                    if (iVar15 == null) {
                    }
                }
                if (eVar16.B() != 8) {
                    eVar17 = eVar16;
                }
                eVar16 = eVar18;
            }
        }
        if ((!z10 && !z11) || eVar3 == null || eVar3 == eVar4) {
            return;
        }
        d dVar27 = eVar3.N[i2];
        int i22 = i2 + 1;
        d dVar28 = eVar4.N[i22];
        d dVar29 = dVar27.f;
        android.support.constraint.n.i iVar19 = dVar29 != null ? dVar29.i : null;
        d dVar30 = dVar28.f;
        android.support.constraint.n.i iVar20 = dVar30 != null ? dVar30.i : null;
        if (eVar2 != eVar4) {
            d dVar31 = eVar2.N[i22].f;
            r5 = dVar31 != null ? dVar31.i : null;
        } else {
            r5 = iVar20;
        }
        if (eVar3 == eVar4) {
            d[] dVarArr9 = eVar3.N;
            d dVar32 = dVarArr9[i2];
            dVar28 = dVarArr9[i22];
            dVar27 = dVar32;
        }
        if (iVar19 == null || r5 == 0) {
            return;
        }
        int iC6 = dVar27.c();
        if (eVar4 != null) {
            eVar2 = eVar4;
        }
        dVar.a(dVar27.i, iVar19, iC6, 0.5f, r5, dVar28.i, eVar2.N[i22].c(), 5);
    }

    public static void a(f fVar, android.support.constraint.n.d dVar, ArrayList<e> arrayList, int i) {
        c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = fVar.y0;
            cVarArr = fVar.B0;
            i2 = 0;
        } else {
            int i4 = fVar.z0;
            cVarArr = fVar.A0;
            i2 = 2;
            i3 = i4;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            cVar.a();
            if (arrayList == null || (arrayList != null && arrayList.contains(cVar.f481a))) {
                a(fVar, dVar, i, i2, cVar);
            }
        }
    }
}
