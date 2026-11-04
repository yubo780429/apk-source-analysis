package android.support.constraint.n.k;

import android.support.constraint.n.k.m.n;
import android.support.constraint.n.k.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float o0 = 0.5f;
    private boolean B;
    public d M;
    public d[] N;
    protected ArrayList<d> O;
    private boolean[] P;
    public b[] Q;
    public e R;
    int S;
    int T;
    public float U;
    protected int V;
    protected int W;
    protected int X;
    int Y;
    protected int Z;
    protected int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.constraint.n.k.m.c f491b;
    float b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.support.constraint.n.k.m.c f492c;
    float c0;
    private Object d0;
    private int e0;
    private String f0;
    private String g0;
    int h0;
    int i0;
    public float[] j0;
    protected e[] k0;
    protected e[] l0;
    public int m0;
    public int n0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f490a = false;
    public android.support.constraint.n.k.m.l d = null;
    public n e = null;
    public boolean[] f = {true, true};
    private boolean g = true;
    private boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private boolean k = false;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public int o = 0;
    public int[] p = new int[2];
    public int q = 0;
    public int r = 0;
    public float s = 1.0f;
    public int t = 0;
    public int u = 0;
    public float v = 1.0f;
    int w = -1;
    float x = 1.0f;
    private int[] y = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float z = 0.0f;
    private boolean A = false;
    private boolean C = false;
    private int D = 0;
    private int E = 0;
    public d F = new d(this, d.b.LEFT);
    public d G = new d(this, d.b.TOP);
    public d H = new d(this, d.b.RIGHT);
    public d I = new d(this, d.b.BOTTOM);
    public d J = new d(this, d.b.BASELINE);
    d K = new d(this, d.b.CENTER_X);
    d L = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f494b;

        static {
            int[] iArr = new int[b.values().length];
            f494b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f494b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f494b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f494b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f493a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f493a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f493a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f493a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f493a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f493a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f493a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f493a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f493a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.M = dVar;
        this.N = new d[]{this.F, this.H, this.G, this.I, this.J, dVar};
        this.O = new ArrayList<>();
        this.P = new boolean[2];
        b bVar = b.FIXED;
        this.Q = new b[]{bVar, bVar};
        this.R = null;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f = o0;
        this.b0 = f;
        this.c0 = f;
        this.e0 = 0;
        this.f0 = null;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new e[]{null, null};
        this.l0 = new e[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        R();
    }

    private void R() {
        this.O.add(this.F);
        this.O.add(this.G);
        this.O.add(this.H);
        this.O.add(this.I);
        this.O.add(this.K);
        this.O.add(this.L);
        this.O.add(this.M);
        this.O.add(this.J);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:230:0x0409  */
    /* JADX WARN: Code duplicated, block: B:235:0x0414  */
    /* JADX WARN: Code duplicated, block: B:236:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x042a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0442  */
    /* JADX WARN: Code duplicated, block: B:250:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x0457  */
    /* JADX WARN: Code duplicated, block: B:258:0x045d  */
    /* JADX WARN: Code duplicated, block: B:259:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x048b  */
    /* JADX WARN: Code duplicated, block: B:282:0x048f  */
    /* JADX WARN: Code duplicated, block: B:284:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x049d  */
    /* JADX WARN: Code duplicated, block: B:291:0x04af  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:294:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:296:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:298:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:305:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:327:0x050e A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:329:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:348:0x054f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x0119  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0134  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:85:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:92:0x014f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168  */
    /* JADX WARN: Code duplicated, block: B:98:0x0170  */
    private void a(android.support.constraint.n.d dVar, boolean z, boolean z2, boolean z3, boolean z4, android.support.constraint.n.i iVar, android.support.constraint.n.i iVar2, b bVar, boolean z5, d dVar2, d dVar3, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int iMin;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z13;
        int i14;
        android.support.constraint.n.i iVarA;
        e eVar;
        d.b bVar2;
        boolean z14;
        int i15;
        char c2;
        int i16;
        d dVar4;
        boolean z15;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        int i18;
        boolean z19;
        android.support.constraint.n.i iVar3;
        int i19;
        boolean z20;
        boolean z21;
        android.support.constraint.n.i iVar4;
        e eVar2;
        android.support.constraint.n.i iVar5;
        int i20;
        int iMax;
        int iC;
        e eVar3;
        int iMin2;
        int i21;
        boolean z22;
        int i22;
        int i23;
        boolean z23;
        boolean z24;
        int i24;
        e eVar4;
        e eVar5;
        int i25 = i7;
        int i26 = i8;
        android.support.constraint.n.i iVarA2 = dVar.a(dVar2);
        android.support.constraint.n.i iVarA3 = dVar.a(dVar3);
        android.support.constraint.n.i iVarA4 = dVar.a(dVar2.g());
        android.support.constraint.n.i iVarA5 = dVar.a(dVar3.g());
        if (android.support.constraint.n.d.h() != null) {
            android.support.constraint.n.d.h().w++;
        }
        boolean zL = dVar2.l();
        boolean zL2 = dVar3.l();
        boolean zL3 = this.M.l();
        int i27 = zL ? 1 : 0;
        if (zL2) {
            i27++;
        }
        if (zL3) {
            i27++;
        }
        int i28 = i27;
        int i29 = z6 ? 3 : i5;
        int i30 = a.f494b[bVar.ordinal()];
        if (i30 != 1 && i30 != 2 && i30 != 3 && i30 == 4) {
            i9 = i29;
            z12 = i9 != 4;
            if (this.e0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i2;
            }
            if (!z11) {
                if (zL && !zL2 && !zL3) {
                    dVar.a(iVarA2, i);
                } else if (zL && !zL2) {
                    i10 = 8;
                    dVar.a(iVarA2, iVarA4, dVar2.c(), 8);
                }
                i10 = 8;
            } else {
                i10 = 8;
            }
            if (!z12) {
                i11 = i28;
                if (i11 != 2 || z6 || (i9 != 1 && i9 != 0)) {
                    if (i25 == -2) {
                        i25 = iMin;
                    }
                    if (i26 == -2) {
                        i12 = iMin;
                    } else {
                        i12 = i26;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i25 > 0) {
                        dVar.b(iVarA3, iVarA2, i25, 8);
                        iMin = Math.max(iMin, i25);
                    }
                    if (i12 > 0) {
                        if (z2 || i9 != 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i13 = 8;
                            dVar.c(iVarA3, iVarA2, i12, 8);
                        } else {
                            i13 = 8;
                        }
                        iMin = Math.min(iMin, i12);
                    } else {
                        i13 = 8;
                    }
                    if (i9 == 1) {
                        if (z2) {
                            dVar.a(iVarA3, iVarA2, iMin, i13);
                        } else {
                            dVar.a(iVarA3, iVarA2, iMin, 5);
                            dVar.c(iVarA3, iVarA2, iMin, i13);
                        }
                        i26 = i12;
                        z13 = z12;
                        i14 = i25;
                    } else if (i9 == 2) {
                        if (dVar2.h() != d.b.TOP || dVar2.h() == d.b.BOTTOM) {
                            iVarA = dVar.a(this.R.a(d.b.TOP));
                            eVar = this.R;
                            bVar2 = d.b.BOTTOM;
                        } else {
                            iVarA = dVar.a(this.R.a(d.b.LEFT));
                            eVar = this.R;
                            bVar2 = d.b.RIGHT;
                        }
                        android.support.constraint.n.i iVarA6 = dVar.a(eVar.a(bVar2));
                        android.support.constraint.n.i iVar6 = iVarA;
                        android.support.constraint.n.b bVarB = dVar.b();
                        i11 = i11;
                        bVarB.a(iVarA3, iVarA2, iVarA6, iVar6, f2);
                        dVar.a(bVarB);
                        i26 = i12;
                        i14 = i25;
                        z13 = false;
                    } else {
                        i9 = i9;
                        iVarA3 = iVarA3;
                        iVarA5 = iVarA5;
                        i11 = i11;
                        iVarA4 = iVarA4;
                        i26 = i12;
                        z13 = z12;
                        i14 = i25;
                        z4 = true;
                    }
                    if (z11 || z8) {
                        i15 = 2;
                        c2 = 1;
                        i16 = 8;
                        if (i11 >= i15 && z2 && z4) {
                            dVar.b(iVarA2, iVar, 0, i16);
                            char c3 = (z || this.J.f == null) ? c2 : (char) 0;
                            if (!z && (dVar4 = this.J.f) != null) {
                                e eVar6 = dVar4.d;
                                if (eVar6.U != 0.0f) {
                                    b[] bVarArr = eVar6.Q;
                                    b bVar3 = bVarArr[0];
                                    b bVar4 = b.MATCH_CONSTRAINT;
                                    if (bVar3 == bVar4 && bVarArr[c2] == bVar4) {
                                        c3 = c2;
                                    } else {
                                        c3 = 0;
                                    }
                                } else {
                                    c3 = 0;
                                }
                            }
                            if (c3 != 0) {
                                dVar.b(iVar2, iVarA3, 0, i16);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if ((zL || zL2 || zL3) && (!zL || zL2)) {
                        if (!zL && zL2) {
                            dVar.a(iVarA3, iVarA5, -dVar3.c(), 8);
                            if (z2) {
                                if (this.h && iVarA2.g && (eVar4 = this.R) != null) {
                                    f fVar = (f) eVar4;
                                    if (z) {
                                        fVar.b(dVar2);
                                    } else {
                                        fVar.d(dVar2);
                                    }
                                } else {
                                    dVar.b(iVarA2, iVar, 0, 5);
                                }
                            }
                        } else if (zL && zL2) {
                            e eVar7 = dVar2.f.d;
                            e eVar8 = dVar3.f.d;
                            e eVarV = v();
                            int i31 = 6;
                            int i32 = i9;
                            if (z13) {
                                if (i32 == 0) {
                                    if (i26 != 0 || i14 != 0) {
                                        z23 = true;
                                        z24 = false;
                                        z16 = true;
                                        i17 = 5;
                                        i24 = 5;
                                    } else if (iVarA4.g && iVarA5.g) {
                                        dVar.a(iVarA2, iVarA4, dVar2.c(), 8);
                                        dVar.a(iVarA3, iVarA5, -dVar3.c(), 8);
                                        return;
                                    } else {
                                        i17 = 8;
                                        i24 = 8;
                                        z23 = false;
                                        z24 = true;
                                        z16 = false;
                                    }
                                    if ((eVar7 instanceof android.support.constraint.n.k.a) || (eVar8 instanceof android.support.constraint.n.k.a)) {
                                        i18 = 4;
                                        z15 = true;
                                    } else {
                                        i18 = i24;
                                        z15 = true;
                                    }
                                    z18 = z24;
                                    z17 = z23;
                                } else {
                                    if (i32 == 1) {
                                        iVar2 = iVar2;
                                        i18 = 4;
                                        i31 = 6;
                                        z15 = true;
                                        z16 = true;
                                        z17 = true;
                                        z18 = false;
                                        i17 = 8;
                                    } else {
                                        if (i32 == 3) {
                                            if (this.w == -1) {
                                                iVar2 = iVar2;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                i17 = 8;
                                                if (z9) {
                                                    i31 = z2 ? 5 : 4;
                                                } else {
                                                    i31 = 8;
                                                }
                                            } else if (z6) {
                                                if (i6 != 2) {
                                                    z15 = true;
                                                    if (i6 != 1) {
                                                        z22 = false;
                                                    }
                                                    if (z22) {
                                                        i22 = 5;
                                                        i23 = 4;
                                                    } else {
                                                        i22 = 8;
                                                        i23 = 5;
                                                    }
                                                    i17 = i22;
                                                    i18 = i23;
                                                    z16 = z15;
                                                    z17 = z16;
                                                    z18 = z17;
                                                    i31 = 6;
                                                } else {
                                                    z15 = true;
                                                }
                                                z22 = z15;
                                                if (z22) {
                                                    i22 = 8;
                                                    i23 = 5;
                                                } else {
                                                    i22 = 5;
                                                    i23 = 4;
                                                }
                                                i17 = i22;
                                                i18 = i23;
                                                z16 = z15;
                                                z17 = z16;
                                                z18 = z17;
                                                i31 = 6;
                                            } else {
                                                z15 = true;
                                                if (i26 > 0) {
                                                    iVar2 = iVar2;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i31 = 6;
                                                    i17 = 5;
                                                } else if (i26 != 0 || i14 != 0) {
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                } else if (z9) {
                                                    iVar2 = iVar2;
                                                    i17 = (eVar7 == eVarV || eVar8 == eVarV) ? 5 : 4;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i31 = 6;
                                                } else {
                                                    iVar2 = iVar2;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i31 = 6;
                                                    i17 = 5;
                                                    i18 = 8;
                                                }
                                            }
                                            i18 = 5;
                                        } else {
                                            z15 = true;
                                            z16 = false;
                                            z17 = false;
                                            z18 = false;
                                        }
                                        i17 = 5;
                                    }
                                    if (z16 || iVarA4 != iVarA5 || eVar7 == eVarV) {
                                        z19 = z15;
                                    } else {
                                        z16 = false;
                                        z19 = false;
                                    }
                                    if (z17) {
                                        if (z13 && !z7 && !z9 && iVarA4 == iVar && iVarA5 == iVar2) {
                                            z20 = false;
                                            i17 = 8;
                                            i31 = 8;
                                            z19 = false;
                                        } else {
                                            z20 = z2;
                                        }
                                        iVar3 = iVarA4;
                                        i19 = 8;
                                        dVar.a(iVarA2, iVar3, dVar2.c(), f, iVarA5, iVarA3, dVar3.c(), i31);
                                    } else {
                                        iVar3 = iVarA4;
                                        i19 = 8;
                                        z20 = z2;
                                    }
                                    z21 = z19;
                                    if (this.e0 != i19 && !dVar3.j()) {
                                        return;
                                    }
                                    iVar4 = iVar3;
                                    if (z16) {
                                        if (z20 || iVar4 == iVarA5 || z13) {
                                            eVar2 = eVar8;
                                        } else {
                                            if (eVar7 instanceof android.support.constraint.n.k.a) {
                                                eVar2 = eVar8;
                                            } else {
                                                eVar2 = eVar8;
                                                if (eVar2 instanceof android.support.constraint.n.k.a) {
                                                }
                                                iVar5 = iVarA2;
                                                dVar.b(iVar5, iVar4, dVar2.c(), i21);
                                                dVar.c(iVarA3, iVarA5, -dVar3.c(), i21);
                                                i17 = i21;
                                            }
                                            i21 = 6;
                                            iVar5 = iVarA2;
                                            dVar.b(iVar5, iVar4, dVar2.c(), i21);
                                            dVar.c(iVarA3, iVarA5, -dVar3.c(), i21);
                                            i17 = i21;
                                        }
                                        i21 = i17;
                                        iVar5 = iVarA2;
                                        dVar.b(iVar5, iVar4, dVar2.c(), i21);
                                        dVar.c(iVarA3, iVarA5, -dVar3.c(), i21);
                                        i17 = i21;
                                    } else {
                                        eVar2 = eVar8;
                                        iVar5 = iVarA2;
                                    }
                                    if (z20 || !z10 || (eVar7 instanceof android.support.constraint.n.k.a) || (eVar2 instanceof android.support.constraint.n.k.a)) {
                                        i20 = i17;
                                        iMax = i18;
                                    } else {
                                        i20 = 6;
                                        iMax = 6;
                                        z21 = true;
                                    }
                                    if (z21) {
                                        if (z18 || (z9 && !z3)) {
                                            eVar3 = eVarV;
                                        } else {
                                            eVar3 = eVarV;
                                            if (eVar7 != eVar3 && eVar2 != eVar3) {
                                                i31 = iMax;
                                            }
                                            if ((eVar7 instanceof g) || (eVar2 instanceof g)) {
                                                i31 = 5;
                                            }
                                            if ((eVar7 instanceof android.support.constraint.n.k.a) || (eVar2 instanceof android.support.constraint.n.k.a)) {
                                                i31 = 5;
                                            }
                                            iMax = Math.max(z9 ? 5 : i31, iMax);
                                        }
                                        if (z20) {
                                            iMin2 = Math.min(i20, iMax);
                                            if (z6 || z9 || !(eVar7 == eVar3 || eVar2 == eVar3)) {
                                                iMax = iMin2;
                                            } else {
                                                iMax = 4;
                                            }
                                        }
                                        dVar.a(iVar5, iVar4, dVar2.c(), iMax);
                                        dVar.a(iVarA3, iVarA5, -dVar3.c(), iMax);
                                    }
                                    if (z20) {
                                        if (iVar == iVar4) {
                                            iC = dVar2.c();
                                        } else {
                                            iC = 0;
                                        }
                                        if (iVar4 != iVar) {
                                            dVar.b(iVar5, iVar, iC, 5);
                                        }
                                    }
                                    if (z20 && z13 && i3 == 0 && i14 == 0) {
                                        if (z13 || i32 != 3) {
                                            dVar.b(iVarA3, iVar5, 0, 5);
                                        } else {
                                            dVar.b(iVarA3, iVar5, 0, i19);
                                        }
                                    }
                                }
                                iVar2 = iVar2;
                                if (z16) {
                                    z19 = z15;
                                } else {
                                    z19 = z15;
                                }
                                if (z17) {
                                    if (z13) {
                                        z20 = z2;
                                    } else {
                                        z20 = z2;
                                    }
                                    iVar3 = iVarA4;
                                    i19 = 8;
                                    dVar.a(iVarA2, iVar3, dVar2.c(), f, iVarA5, iVarA3, dVar3.c(), i31);
                                } else {
                                    iVar3 = iVarA4;
                                    i19 = 8;
                                    z20 = z2;
                                }
                                z21 = z19;
                                if (this.e0 != i19) {
                                }
                                iVar4 = iVar3;
                                if (z16) {
                                    if (z20) {
                                        eVar2 = eVar8;
                                        i21 = i17;
                                    } else {
                                        eVar2 = eVar8;
                                        i21 = i17;
                                    }
                                    iVar5 = iVarA2;
                                    dVar.b(iVar5, iVar4, dVar2.c(), i21);
                                    dVar.c(iVarA3, iVarA5, -dVar3.c(), i21);
                                    i17 = i21;
                                } else {
                                    eVar2 = eVar8;
                                    iVar5 = iVarA2;
                                }
                                if (z20) {
                                    i20 = i17;
                                    iMax = i18;
                                } else {
                                    i20 = i17;
                                    iMax = i18;
                                }
                                if (z21) {
                                    if (z18) {
                                        eVar3 = eVarV;
                                    } else {
                                        eVar3 = eVarV;
                                    }
                                    if (z20) {
                                        iMin2 = Math.min(i20, iMax);
                                        if (z6) {
                                            iMax = iMin2;
                                        } else {
                                            iMax = iMin2;
                                        }
                                    }
                                    dVar.a(iVar5, iVar4, dVar2.c(), iMax);
                                    dVar.a(iVarA3, iVarA5, -dVar3.c(), iMax);
                                }
                                if (z20) {
                                    if (iVar == iVar4) {
                                        iC = dVar2.c();
                                    } else {
                                        iC = 0;
                                    }
                                    if (iVar4 != iVar) {
                                        dVar.b(iVar5, iVar, iC, 5);
                                    }
                                }
                                if (z20) {
                                    if (z13) {
                                        dVar.b(iVarA3, iVar5, 0, 5);
                                    } else {
                                        dVar.b(iVarA3, iVar5, 0, 5);
                                    }
                                }
                            } else {
                                z15 = true;
                                if (iVarA4.g && iVarA5.g) {
                                    dVar.a(iVarA2, iVarA4, dVar2.c(), f, iVarA5, iVarA3, dVar3.c(), 8);
                                    if (z2 && z4) {
                                        int iC2 = dVar3.f != null ? dVar3.c() : 0;
                                        if (iVarA5 != iVar2) {
                                            dVar.b(iVar2, iVarA3, iC2, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                iVar2 = iVar2;
                                i17 = 5;
                                z16 = true;
                                z17 = true;
                                i31 = 6;
                                z18 = false;
                            }
                            i18 = 4;
                            if (z16) {
                                z19 = z15;
                            } else {
                                z19 = z15;
                            }
                            if (z17) {
                                if (z13) {
                                    z20 = z2;
                                } else {
                                    z20 = z2;
                                }
                                iVar3 = iVarA4;
                                i19 = 8;
                                dVar.a(iVarA2, iVar3, dVar2.c(), f, iVarA5, iVarA3, dVar3.c(), i31);
                            } else {
                                iVar3 = iVarA4;
                                i19 = 8;
                                z20 = z2;
                            }
                            z21 = z19;
                            if (this.e0 != i19) {
                            }
                            iVar4 = iVar3;
                            if (z16) {
                                if (z20) {
                                    eVar2 = eVar8;
                                    i21 = i17;
                                } else {
                                    eVar2 = eVar8;
                                    i21 = i17;
                                }
                                iVar5 = iVarA2;
                                dVar.b(iVar5, iVar4, dVar2.c(), i21);
                                dVar.c(iVarA3, iVarA5, -dVar3.c(), i21);
                                i17 = i21;
                            } else {
                                eVar2 = eVar8;
                                iVar5 = iVarA2;
                            }
                            if (z20) {
                                i20 = i17;
                                iMax = i18;
                            } else {
                                i20 = i17;
                                iMax = i18;
                            }
                            if (z21) {
                                if (z18) {
                                    eVar3 = eVarV;
                                } else {
                                    eVar3 = eVarV;
                                }
                                if (z20) {
                                    iMin2 = Math.min(i20, iMax);
                                    if (z6) {
                                        iMax = iMin2;
                                    } else {
                                        iMax = iMin2;
                                    }
                                }
                                dVar.a(iVar5, iVar4, dVar2.c(), iMax);
                                dVar.a(iVarA3, iVarA5, -dVar3.c(), iMax);
                            }
                            if (z20) {
                                if (iVar == iVar4) {
                                    iC = dVar2.c();
                                } else {
                                    iC = 0;
                                }
                                if (iVar4 != iVar) {
                                    dVar.b(iVar5, iVar, iC, 5);
                                }
                            }
                            if (z20) {
                                if (z13) {
                                    dVar.b(iVarA3, iVar5, 0, 5);
                                } else {
                                    dVar.b(iVarA3, iVar5, 0, 5);
                                }
                            }
                        }
                        z20 = z2;
                    } else {
                        z20 = z2;
                    }
                    if (z20 && z4) {
                        int iC3 = dVar3.f != null ? dVar3.c() : 0;
                        if (iVarA5 != iVar2) {
                            if (!this.h || !iVarA3.g || (eVar5 = this.R) == null) {
                                dVar.b(iVar2, iVarA3, iC3, 5);
                                return;
                            }
                            f fVar2 = (f) eVar5;
                            if (z) {
                                fVar2.a(dVar3);
                                return;
                            } else {
                                fVar2.c(dVar3);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                int iMax2 = Math.max(i25, iMin);
                if (i26 > 0) {
                    iMax2 = Math.min(i26, iMax2);
                }
                dVar.a(iVarA3, iVarA2, iMax2, 8);
                i14 = i25;
                z13 = false;
                iVarA4 = iVarA4;
                if (z11) {
                    i15 = 2;
                    c2 = 1;
                    i16 = 8;
                } else {
                    i15 = 2;
                    c2 = 1;
                    i16 = 8;
                }
                if (i11 >= i15) {
                }
            }
            if (z5) {
                dVar.a(iVarA3, iVarA2, 0, 3);
                if (i3 > 0) {
                    dVar.b(iVarA3, iVarA2, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    dVar.c(iVarA3, iVarA2, i4, 8);
                }
            } else {
                dVar.a(iVarA3, iVarA2, iMin, i10);
            }
            z13 = z12;
            i14 = i25;
            i11 = i28;
            z4 = z4;
            if (z11) {
                i15 = 2;
                c2 = 1;
                i16 = 8;
            } else {
                i15 = 2;
                c2 = 1;
                i16 = 8;
            }
            if (i11 >= i15) {
            }
        }
        i9 = i29;
        if (this.e0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i2;
        }
        if (!z11) {
            i10 = 8;
        } else if (zL) {
            if (zL) {
                i10 = 8;
            } else {
                i10 = 8;
            }
        } else if (zL) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (!z12) {
            i11 = i28;
            if (i11 != 2) {
                if (i25 == -2) {
                    i25 = iMin;
                }
                if (i26 == -2) {
                    i12 = iMin;
                } else {
                    i12 = i26;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i25 > 0) {
                    dVar.b(iVarA3, iVarA2, i25, 8);
                    iMin = Math.max(iMin, i25);
                }
                if (i12 > 0) {
                    if (z2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        i13 = 8;
                        dVar.c(iVarA3, iVarA2, i12, 8);
                    } else {
                        i13 = 8;
                    }
                    iMin = Math.min(iMin, i12);
                } else {
                    i13 = 8;
                }
                if (i9 == 1) {
                    if (z2) {
                        dVar.a(iVarA3, iVarA2, iMin, i13);
                    } else {
                        dVar.a(iVarA3, iVarA2, iMin, 5);
                        dVar.c(iVarA3, iVarA2, iMin, i13);
                    }
                    i26 = i12;
                    z13 = z12;
                    i14 = i25;
                    iVarA4 = iVarA4;
                } else if (i9 == 2) {
                    if (dVar2.h() != d.b.TOP) {
                        iVarA = dVar.a(this.R.a(d.b.TOP));
                        eVar = this.R;
                        bVar2 = d.b.BOTTOM;
                    } else {
                        iVarA = dVar.a(this.R.a(d.b.TOP));
                        eVar = this.R;
                        bVar2 = d.b.BOTTOM;
                    }
                    android.support.constraint.n.i iVarA7 = dVar.a(eVar.a(bVar2));
                    android.support.constraint.n.i iVar7 = iVarA;
                    android.support.constraint.n.b bVarB2 = dVar.b();
                    i11 = i11;
                    bVarB2.a(iVarA3, iVarA2, iVarA7, iVar7, f2);
                    dVar.a(bVarB2);
                    i26 = i12;
                    i14 = i25;
                    z13 = false;
                } else {
                    i9 = i9;
                    iVarA3 = iVarA3;
                    iVarA5 = iVarA5;
                    i11 = i11;
                    iVarA4 = iVarA4;
                    i26 = i12;
                    z13 = z12;
                    i14 = i25;
                    z4 = true;
                }
            } else {
                if (i25 == -2) {
                    i25 = iMin;
                }
                if (i26 == -2) {
                    i12 = iMin;
                } else {
                    i12 = i26;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i25 > 0) {
                    dVar.b(iVarA3, iVarA2, i25, 8);
                    iMin = Math.max(iMin, i25);
                }
                if (i12 > 0) {
                    if (z2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        i13 = 8;
                        dVar.c(iVarA3, iVarA2, i12, 8);
                    } else {
                        i13 = 8;
                    }
                    iMin = Math.min(iMin, i12);
                } else {
                    i13 = 8;
                }
                if (i9 == 1) {
                    if (z2) {
                        dVar.a(iVarA3, iVarA2, iMin, i13);
                    } else {
                        dVar.a(iVarA3, iVarA2, iMin, 5);
                        dVar.c(iVarA3, iVarA2, iMin, i13);
                    }
                    i26 = i12;
                    z13 = z12;
                    i14 = i25;
                    iVarA4 = iVarA4;
                } else if (i9 == 2) {
                    if (dVar2.h() != d.b.TOP) {
                        iVarA = dVar.a(this.R.a(d.b.TOP));
                        eVar = this.R;
                        bVar2 = d.b.BOTTOM;
                    } else {
                        iVarA = dVar.a(this.R.a(d.b.TOP));
                        eVar = this.R;
                        bVar2 = d.b.BOTTOM;
                    }
                    android.support.constraint.n.i iVarA8 = dVar.a(eVar.a(bVar2));
                    android.support.constraint.n.i iVar8 = iVarA;
                    android.support.constraint.n.b bVarB3 = dVar.b();
                    i11 = i11;
                    bVarB3.a(iVarA3, iVarA2, iVarA8, iVar8, f2);
                    dVar.a(bVarB3);
                    i26 = i12;
                    i14 = i25;
                    z13 = false;
                } else {
                    i9 = i9;
                    iVarA3 = iVarA3;
                    iVarA5 = iVarA5;
                    i11 = i11;
                    iVarA4 = iVarA4;
                    i26 = i12;
                    z13 = z12;
                    i14 = i25;
                    z4 = true;
                }
            }
            if (z11) {
                i15 = 2;
                c2 = 1;
                i16 = 8;
            } else {
                i15 = 2;
                c2 = 1;
                i16 = 8;
            }
            if (i11 >= i15) {
            }
        }
        if (z5) {
            dVar.a(iVarA3, iVarA2, 0, 3);
            if (i3 > 0) {
                dVar.b(iVarA3, iVarA2, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                dVar.c(iVarA3, iVarA2, i4, 8);
            }
        } else {
            dVar.a(iVarA3, iVarA2, iMin, i10);
        }
        z13 = z12;
        i14 = i25;
        i11 = i28;
        z4 = z4;
        if (z11) {
            i15 = 2;
            c2 = 1;
            i16 = 8;
        } else {
            i15 = 2;
            c2 = 1;
            i16 = 8;
        }
        if (i11 >= i15) {
        }
    }

    private boolean w(int i) {
        int i2 = i * 2;
        d[] dVarArr = this.N;
        if (dVarArr[i2].f != null && dVarArr[i2].f.f != dVarArr[i2]) {
            int i3 = i2 + 1;
            if (dVarArr[i3].f != null && dVarArr[i3].f.f == dVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public int A() {
        int i = this.F != null ? 0 + this.G.g : 0;
        return this.H != null ? i + this.I.g : i;
    }

    public int B() {
        return this.e0;
    }

    public int C() {
        if (this.e0 == 8) {
            return 0;
        }
        return this.S;
    }

    public int D() {
        e eVar = this.R;
        return (eVar == null || !(eVar instanceof f)) ? this.W : ((f) eVar).w0 + this.W;
    }

    public int E() {
        e eVar = this.R;
        return (eVar == null || !(eVar instanceof f)) ? this.X : ((f) eVar).x0 + this.X;
    }

    public boolean F() {
        return this.A;
    }

    public boolean G() {
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            if (this.O.get(i).j()) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        d dVar = this.F;
        d dVar2 = dVar.f;
        if (dVar2 != null && dVar2.f == dVar) {
            return true;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f;
        return dVar4 != null && dVar4.f == dVar3;
    }

    public boolean I() {
        return this.B;
    }

    public boolean J() {
        d dVar = this.G;
        d dVar2 = dVar.f;
        if (dVar2 != null && dVar2.f == dVar) {
            return true;
        }
        d dVar3 = this.I;
        d dVar4 = dVar3.f;
        return dVar4 != null && dVar4.f == dVar3;
    }

    public boolean K() {
        return this.C;
    }

    public boolean L() {
        return this.g && this.e0 != 8;
    }

    public boolean M() {
        return this.j || (this.F.k() && this.H.k());
    }

    public boolean N() {
        return this.k || (this.G.k() && this.I.k());
    }

    public boolean O() {
        b[] bVarArr = this.Q;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void P() {
        this.F.m();
        this.G.m();
        this.H.m();
        this.I.m();
        this.J.m();
        this.K.m();
        this.L.m();
        this.M.m();
        this.R = null;
        this.z = 0.0f;
        this.S = 0;
        this.T = 0;
        this.U = 0.0f;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        float f = o0;
        this.b0 = f;
        this.c0 = f;
        b[] bVarArr = this.Q;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.d0 = null;
        this.e0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.l = -1;
        this.m = -1;
        int[] iArr = this.y;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.n = 0;
        this.o = 0;
        this.s = 1.0f;
        this.v = 1.0f;
        this.r = Integer.MAX_VALUE;
        this.u = Integer.MAX_VALUE;
        this.q = 0;
        this.t = 0;
        this.w = -1;
        this.x = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.C = false;
        boolean[] zArr2 = this.P;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
    }

    public void Q() {
        this.j = false;
        this.k = false;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            this.O.get(i).n();
        }
    }

    public float a(int i) {
        if (i == 0) {
            return this.b0;
        }
        if (i == 1) {
            return this.c0;
        }
        return -1.0f;
    }

    public d a(d.b bVar) {
        switch (a.f493a[bVar.ordinal()]) {
            case 1:
                return this.F;
            case 2:
                return this.G;
            case 3:
                return this.H;
            case 4:
                return this.I;
            case 5:
                return this.J;
            case 6:
                return this.M;
            case 7:
                return this.K;
            case 8:
                return this.L;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void a(float f) {
        this.b0 = f;
    }

    public void a(int i, int i2) {
        this.F.a(i);
        this.H.a(i2);
        this.W = i;
        this.S = i2 - i;
        this.j = true;
    }

    public void a(int i, int i2, int i3, float f) {
        this.n = i;
        this.q = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.r = i3;
        this.s = f;
        if (f <= 0.0f || f >= 1.0f || this.n != 0) {
            return;
        }
        this.n = 2;
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.W = i;
        this.X = i2;
        if (this.e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        if (this.Q[0] == b.FIXED && i7 < (i6 = this.S)) {
            i7 = i6;
        }
        if (this.Q[1] == b.FIXED && i8 < (i5 = this.T)) {
            i8 = i5;
        }
        this.S = i7;
        this.T = i8;
        int i9 = this.a0;
        if (i8 < i9) {
            this.T = i9;
        }
        int i10 = this.S;
        int i11 = this.Z;
        if (i10 < i11) {
            this.S = i11;
        }
    }

    protected void a(int i, boolean z) {
        this.P[i] = z;
    }

    public void a(android.support.constraint.n.c cVar) {
        this.F.a(cVar);
        this.G.a(cVar);
        this.H.a(cVar);
        this.I.a(cVar);
        this.J.a(cVar);
        this.M.a(cVar);
        this.K.a(cVar);
        this.L.a(cVar);
    }

    public void a(android.support.constraint.n.d dVar) {
        dVar.a(this.F);
        dVar.a(this.G);
        dVar.a(this.H);
        dVar.a(this.I);
        if (this.Y > 0) {
            dVar.a(this.J);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void a(android.support.constraint.n.d r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.n.k.e.a(android.support.constraint.n.d, boolean):void");
    }

    public void a(d.b bVar, e eVar, d.b bVar2, int i, int i2) {
        a(bVar).a(eVar.a(bVar2), i, i2, true);
    }

    public void a(b bVar) {
        this.Q[0] = bVar;
    }

    public void a(e eVar, float f, int i) {
        d.b bVar = d.b.CENTER;
        a(bVar, eVar, bVar, i, 0);
        this.z = f;
    }

    public void a(f fVar, android.support.constraint.n.d dVar, HashSet<e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            a(dVar, fVar.w(64));
        }
        if (i == 0) {
            HashSet<d> hashSetA = this.F.a();
            if (hashSetA != null) {
                Iterator<d> it = hashSetA.iterator();
                while (it.hasNext()) {
                    it.next().d.a(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<d> hashSetA2 = this.H.a();
            if (hashSetA2 != null) {
                Iterator<d> it2 = hashSetA2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.a(fVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetA3 = this.G.a();
        if (hashSetA3 != null) {
            Iterator<d> it3 = hashSetA3.iterator();
            while (it3.hasNext()) {
                it3.next().d.a(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSetA4 = this.I.a();
        if (hashSetA4 != null) {
            Iterator<d> it4 = hashSetA4.iterator();
            while (it4.hasNext()) {
                it4.next().d.a(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSetA5 = this.J.a();
        if (hashSetA5 != null) {
            Iterator<d> it5 = hashSetA5.iterator();
            while (it5.hasNext()) {
                it5.next().d.a(fVar, dVar, hashSet, i, true);
            }
        }
    }

    public void a(Object obj) {
        this.d0 = obj;
    }

    public void a(String str) {
        this.f0 = str;
    }

    public void a(boolean z) {
        this.A = z;
    }

    public void a(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zE = z & this.d.e();
        boolean zE2 = z2 & this.e.e();
        android.support.constraint.n.k.m.l lVar = this.d;
        int i3 = lVar.h.g;
        n nVar = this.e;
        int i4 = nVar.h.g;
        int i5 = lVar.i.g;
        int i6 = nVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zE) {
            this.W = i3;
        }
        if (zE2) {
            this.X = i4;
        }
        if (this.e0 == 8) {
            this.S = 0;
            this.T = 0;
            return;
        }
        if (zE) {
            if (this.Q[0] == b.FIXED && i8 < (i2 = this.S)) {
                i8 = i2;
            }
            this.S = i8;
            int i10 = this.Z;
            if (i8 < i10) {
                this.S = i10;
            }
        }
        if (zE2) {
            if (this.Q[1] == b.FIXED && i9 < (i = this.T)) {
                i9 = i;
            }
            this.T = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.T = i11;
            }
        }
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.w == -1) {
            if (z3 && !z4) {
                this.w = 0;
            } else if (!z3 && z4) {
                this.w = 1;
                if (this.V == -1) {
                    this.x = 1.0f / this.x;
                }
            }
        }
        if (this.w == 0 && (!this.G.l() || !this.I.l())) {
            this.w = 1;
        } else if (this.w == 1 && (!this.F.l() || !this.H.l())) {
            this.w = 0;
        }
        if (this.w == -1 && (!this.G.l() || !this.I.l() || !this.F.l() || !this.H.l())) {
            if (this.G.l() && this.I.l()) {
                this.w = 0;
            } else if (this.F.l() && this.H.l()) {
                this.x = 1.0f / this.x;
                this.w = 1;
            }
        }
        if (this.w == -1) {
            if (this.q > 0 && this.t == 0) {
                this.w = 0;
            } else {
                if (this.q != 0 || this.t <= 0) {
                    return;
                }
                this.x = 1.0f / this.x;
                this.w = 1;
            }
        }
    }

    public b b(int i) {
        if (i == 0) {
            return n();
        }
        if (i == 1) {
            return z();
        }
        return null;
    }

    public void b(float f) {
        this.j0[0] = f;
    }

    public void b(int i, int i2) {
        this.G.a(i);
        this.I.a(i2);
        this.X = i;
        this.T = i2 - i;
        if (this.A) {
            this.J.a(i + this.Y);
        }
        this.k = true;
    }

    public void b(int i, int i2, int i3, float f) {
        this.o = i;
        this.t = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.u = i3;
        this.v = f;
        if (f <= 0.0f || f >= 1.0f || this.o != 0) {
            return;
        }
        this.o = 2;
    }

    public void b(android.support.constraint.n.d dVar, boolean z) {
        n nVar;
        android.support.constraint.n.k.m.l lVar;
        int iB = dVar.b(this.F);
        int iB2 = dVar.b(this.G);
        int iB3 = dVar.b(this.H);
        int iB4 = dVar.b(this.I);
        if (z && (lVar = this.d) != null) {
            android.support.constraint.n.k.m.f fVar = lVar.h;
            if (fVar.j) {
                android.support.constraint.n.k.m.f fVar2 = lVar.i;
                if (fVar2.j) {
                    iB = fVar.g;
                    iB3 = fVar2.g;
                }
            }
        }
        if (z && (nVar = this.e) != null) {
            android.support.constraint.n.k.m.f fVar3 = nVar.h;
            if (fVar3.j) {
                android.support.constraint.n.k.m.f fVar4 = nVar.i;
                if (fVar4.j) {
                    iB2 = fVar3.g;
                    iB4 = fVar4.g;
                }
            }
        }
        int i = iB4 - iB2;
        if (iB3 - iB < 0 || i < 0 || iB == Integer.MIN_VALUE || iB == Integer.MAX_VALUE || iB2 == Integer.MIN_VALUE || iB2 == Integer.MAX_VALUE || iB3 == Integer.MIN_VALUE || iB3 == Integer.MAX_VALUE || iB4 == Integer.MIN_VALUE || iB4 == Integer.MAX_VALUE) {
            iB4 = 0;
            iB = 0;
            iB2 = 0;
            iB3 = 0;
        }
        a(iB, iB2, iB3, iB4);
    }

    public void b(b bVar) {
        this.Q[1] = bVar;
    }

    public void b(e eVar) {
        this.R = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void b(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.U = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i3);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i3, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.U = fAbs;
            this.V = i2;
        }
    }

    public void b(boolean z) {
        this.B = z;
    }

    boolean b() {
        return (this instanceof k) || (this instanceof g);
    }

    public int c(int i) {
        if (i == 0) {
            return C();
        }
        if (i == 1) {
            return k();
        }
        return 0;
    }

    public void c(float f) {
        this.c0 = f;
    }

    public void c(int i, int i2) {
        this.W = i;
        int i3 = i2 - i;
        this.S = i3;
        int i4 = this.Z;
        if (i3 < i4) {
            this.S = i4;
        }
    }

    public void c(boolean z) {
        this.C = z;
    }

    public boolean c() {
        return this.e0 != 8;
    }

    public e d(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.I).f) != null && dVar2.f == dVar) {
                return dVar2.d;
            }
            return null;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f;
        if (dVar4 == null || dVar4.f != dVar3) {
            return null;
        }
        return dVar4.d;
    }

    public void d() {
        if (this.d == null) {
            this.d = new android.support.constraint.n.k.m.l(this);
        }
        if (this.e == null) {
            this.e = new n(this);
        }
    }

    public void d(float f) {
        this.j0[1] = f;
    }

    public void d(int i, int i2) {
        this.D = i;
        this.E = i2;
        d(false);
    }

    public void d(boolean z) {
        this.g = z;
    }

    public int e() {
        return this.Y;
    }

    public e e(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.G).f) != null && dVar2.f == dVar) {
                return dVar2.d;
            }
            return null;
        }
        d dVar3 = this.F;
        d dVar4 = dVar3.f;
        if (dVar4 == null || dVar4.f != dVar3) {
            return null;
        }
        return dVar4.d;
    }

    public void e(int i, int i2) {
        this.W = i;
        this.X = i2;
    }

    public int f() {
        return E() + this.T;
    }

    public p f(int i) {
        if (i == 0) {
            return this.d;
        }
        if (i == 1) {
            return this.e;
        }
        return null;
    }

    public void f(int i, int i2) {
        this.X = i;
        int i3 = i2 - i;
        this.T = i3;
        int i4 = this.a0;
        if (i3 < i4) {
            this.T = i4;
        }
    }

    public Object g() {
        return this.d0;
    }

    public boolean g(int i) {
        if (i == 0) {
            return (this.F.f != null ? 1 : 0) + (this.H.f != null ? 1 : 0) < 2;
        }
        return ((this.G.f != null ? 1 : 0) + (this.I.f != null ? 1 : 0)) + (this.J.f != null ? 1 : 0) < 2;
    }

    public String h() {
        return this.f0;
    }

    public void h(int i) {
        this.Y = i;
        this.A = i > 0;
    }

    public float i() {
        return this.U;
    }

    public void i(int i) {
        if (this.A) {
            int i2 = i - this.Y;
            int i3 = this.T + i2;
            this.X = i2;
            this.G.a(i2);
            this.I.a(i3);
            this.J.a(i);
            this.k = true;
        }
    }

    public int j() {
        return this.V;
    }

    public void j(int i) {
        this.F.a(i);
        this.W = i;
    }

    public int k() {
        if (this.e0 == 8) {
            return 0;
        }
        return this.T;
    }

    public void k(int i) {
        this.G.a(i);
        this.X = i;
    }

    public float l() {
        return this.b0;
    }

    public void l(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public int m() {
        return this.h0;
    }

    public void m(int i) {
        this.h0 = i;
    }

    public b n() {
        return this.Q[0];
    }

    public void n(int i) {
        this.y[1] = i;
    }

    public int o() {
        d dVar = this.F;
        int i = dVar != null ? 0 + dVar.g : 0;
        d dVar2 = this.H;
        return dVar2 != null ? i + dVar2.g : i;
    }

    public void o(int i) {
        this.y[0] = i;
    }

    public int p() {
        return this.D;
    }

    public void p(int i) {
        if (i < 0) {
            i = 0;
        }
        this.a0 = i;
    }

    public int q() {
        return this.E;
    }

    public void q(int i) {
        if (i < 0) {
            i = 0;
        }
        this.Z = i;
    }

    public int r() {
        return this.y[1];
    }

    public void r(int i) {
        this.i0 = i;
    }

    public int s() {
        return this.y[0];
    }

    public void s(int i) {
        this.e0 = i;
    }

    public int t() {
        return this.a0;
    }

    public void t(int i) {
        this.S = i;
        int i2 = this.Z;
        if (i < i2) {
            this.S = i2;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.g0 != null) {
            str = "type: " + this.g0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f0 != null) {
            str2 = "id: " + this.f0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.W);
        sb.append(", ");
        sb.append(this.X);
        sb.append(") - (");
        sb.append(this.S);
        sb.append(" x ");
        sb.append(this.T);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.Z;
    }

    public void u(int i) {
        this.W = i;
    }

    public e v() {
        return this.R;
    }

    public void v(int i) {
        this.X = i;
    }

    public int w() {
        return D() + this.S;
    }

    public float x() {
        return this.c0;
    }

    public int y() {
        return this.i0;
    }

    public b z() {
        return this.Q[1];
    }
}
