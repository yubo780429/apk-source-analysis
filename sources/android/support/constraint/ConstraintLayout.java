package android.support.constraint;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SparseArray<View> f405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<android.support.constraint.c> f406c;
    protected android.support.constraint.n.k.f d;
    private int e;
    private int f;
    private int g;
    private int h;
    protected boolean i;
    private int j;
    private e k;
    protected d l;
    private int m;
    private HashMap<String, Integer> n;
    private int o;
    private int p;
    private SparseArray<android.support.constraint.n.k.e> q;
    c r;
    private int s;
    private int t;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f407a;

        static {
            int[] iArr = new int[android.support.constraint.n.k.e.b.values().length];
            f407a = iArr;
            try {
                iArr[android.support.constraint.n.k.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f407a[android.support.constraint.n.k.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f407a[android.support.constraint.n.k.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f407a[android.support.constraint.n.k.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        boolean V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f408a;
        boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f409b;
        boolean b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f410c;
        int c0;
        public int d;
        int d0;
        public int e;
        int e0;
        public int f;
        int f0;
        public int g;
        int g0;
        public int h;
        int h0;
        public int i;
        float i0;
        public int j;
        int j0;
        public int k;
        int k0;
        public int l;
        float l0;
        public int m;
        android.support.constraint.n.k.e m0;
        public int n;
        public boolean n0;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f411a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f411a = sparseIntArray;
                sparseIntArray.append(k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f411a.append(k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f411a.append(k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f411a.append(k.ConstraintLayout_Layout_android_orientation, 1);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f411a.append(k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f411a.append(k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f411a.append(k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f411a.append(k.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public b(int i, int i2) {
            super(i, i2);
            this.f408a = -1;
            this.f409b = -1;
            this.f410c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new android.support.constraint.n.k.e();
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            int i;
            super(context, attributeSet);
            this.f408a = -1;
            this.f409b = -1;
            this.f410c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new android.support.constraint.n.k.e();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f411a.get(index);
                switch (i3) {
                    case 1:
                        this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f408a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f408a);
                        continue;
                        break;
                    case 6:
                        this.f409b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f409b);
                        continue;
                        break;
                    case 7:
                        this.f410c = typedArrayObtainStyledAttributes.getFloat(index, this.f410c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                        break;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                        break;
                    case 24:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                        break;
                    case 27:
                        this.S = typedArrayObtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                        break;
                    case 28:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                        break;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        continue;
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 35:
                        this.N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 38:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(f3 / f2);
                                                    } else {
                                                        Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 51:
                                this.U = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f408a = -1;
            this.f409b = -1;
            this.f410c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = 0.5f;
            this.m0 = new android.support.constraint.n.k.e();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == 0 || i == -1) {
                this.V = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f410c == -1.0f && this.f408a == -1 && this.f409b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.m0 instanceof android.support.constraint.n.k.g)) {
                this.m0 = new android.support.constraint.n.k.g();
            }
            ((android.support.constraint.n.k.g) this.m0).z(this.R);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:25:0x0060  */
        /* JADX WARN: Code duplicated, block: B:28:0x0066  */
        /* JADX WARN: Code duplicated, block: B:31:0x006c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082  */
        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        /* JADX WARN: Code duplicated, block: B:41:0x008e  */
        /* JADX WARN: Code duplicated, block: B:43:0x0095  */
        /* JADX WARN: Code duplicated, block: B:45:0x0099  */
        /* JADX WARN: Code duplicated, block: B:77:0x00de  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            float f;
            int i6;
            int i7;
            int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            boolean z2 = false;
            if (Build.VERSION.SDK_INT >= 17) {
                super.resolveLayoutDirection(i);
                if (1 == getLayoutDirection()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.e0 = -1;
            this.f0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.g0 = this.t;
            this.h0 = this.v;
            this.i0 = this.z;
            this.j0 = this.f408a;
            this.k0 = this.f409b;
            this.l0 = this.f410c;
            if (z) {
                int i10 = this.p;
                if (i10 != -1) {
                    this.e0 = i10;
                } else {
                    int i11 = this.q;
                    if (i11 != -1) {
                        this.f0 = i11;
                    } else {
                        i2 = this.r;
                        if (i2 != -1) {
                            this.d0 = i2;
                            z2 = true;
                        }
                        i3 = this.s;
                        if (i3 != -1) {
                            this.c0 = i3;
                            z2 = true;
                        }
                        i4 = this.x;
                        if (i4 != -1) {
                            this.h0 = i4;
                        }
                        i5 = this.y;
                        if (i5 != -1) {
                            this.g0 = i5;
                        }
                        if (z2) {
                            this.i0 = 1.0f - this.z;
                        }
                        if (this.Y && this.R == 1) {
                            f = this.f410c;
                            if (f != -1.0f) {
                                this.l0 = 1.0f - f;
                                this.j0 = -1;
                                this.k0 = -1;
                            } else {
                                i6 = this.f408a;
                                if (i6 != -1) {
                                    this.k0 = i6;
                                    this.j0 = -1;
                                } else {
                                    i7 = this.f409b;
                                    if (i7 != -1) {
                                        this.j0 = i7;
                                        this.k0 = -1;
                                    }
                                }
                                this.l0 = -1.0f;
                            }
                        }
                    }
                }
                z2 = true;
                i2 = this.r;
                if (i2 != -1) {
                    this.d0 = i2;
                    z2 = true;
                }
                i3 = this.s;
                if (i3 != -1) {
                    this.c0 = i3;
                    z2 = true;
                }
                i4 = this.x;
                if (i4 != -1) {
                    this.h0 = i4;
                }
                i5 = this.y;
                if (i5 != -1) {
                    this.g0 = i5;
                }
                if (z2) {
                    this.i0 = 1.0f - this.z;
                }
                if (this.Y) {
                    f = this.f410c;
                    if (f != -1.0f) {
                        this.l0 = 1.0f - f;
                        this.j0 = -1;
                        this.k0 = -1;
                    } else {
                        i6 = this.f408a;
                        if (i6 != -1) {
                            this.k0 = i6;
                            this.j0 = -1;
                        } else {
                            i7 = this.f409b;
                            if (i7 != -1) {
                                this.j0 = i7;
                                this.k0 = -1;
                            }
                        }
                        this.l0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.p;
                if (i12 != -1) {
                    this.d0 = i12;
                }
                int i13 = this.q;
                if (i13 != -1) {
                    this.c0 = i13;
                }
                int i14 = this.r;
                if (i14 != -1) {
                    this.e0 = i14;
                }
                int i15 = this.s;
                if (i15 != -1) {
                    this.f0 = i15;
                }
                int i16 = this.x;
                if (i16 != -1) {
                    this.g0 = i16;
                }
                int i17 = this.y;
                if (i17 != -1) {
                    this.h0 = i17;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int i18 = this.f;
                if (i18 != -1) {
                    this.e0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                    }
                } else {
                    int i19 = this.g;
                    if (i19 != -1) {
                        this.f0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                        }
                    }
                }
                int i20 = this.d;
                if (i20 != -1) {
                    this.c0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                } else {
                    int i21 = this.e;
                    if (i21 == -1) {
                        return;
                    }
                    this.d0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }

    class c implements android.support.constraint.n.k.m.b.InterfaceC0025b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f414c;
        int d;
        int e;
        int f;
        int g;

        public c(ConstraintLayout constraintLayout) {
            this.f412a = constraintLayout;
        }

        private boolean a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // android.support.constraint.n.k.m.b.InterfaceC0025b
        public final void a() {
            int childCount = this.f412a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f412a.getChildAt(i);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.f412a);
                }
            }
            int size = this.f412a.f406c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((android.support.constraint.c) this.f412a.f406c.get(i2)).c(this.f412a);
                }
            }
        }

        public void a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f413b = i3;
            this.f414c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        @Override // android.support.constraint.n.k.m.b.InterfaceC0025b
        @SuppressLint({"WrongCall"})
        public final void a(android.support.constraint.n.k.e eVar, android.support.constraint.n.k.m.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i;
            if (eVar == null) {
                return;
            }
            if (eVar.B() == 8 && !eVar.I()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (eVar.v() == null) {
                return;
            }
            android.support.constraint.n.k.e.b bVar = aVar.f502a;
            android.support.constraint.n.k.e.b bVar2 = aVar.f503b;
            int iC = aVar.f504c;
            int i2 = aVar.d;
            int i3 = this.f413b + this.f414c;
            int i4 = this.d;
            View view = (View) eVar.g();
            int i5 = a.f407a[bVar.ordinal()];
            if (i5 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iC, 1073741824);
            } else if (i5 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i4, -2);
            } else if (i5 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i4 + eVar.o(), -1);
            } else if (i5 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i4, -2);
                boolean z = eVar.n == 1;
                int i6 = aVar.j;
                if (i6 == android.support.constraint.n.k.m.b.a.l || i6 == android.support.constraint.n.k.m.b.a.m) {
                    if (aVar.j == android.support.constraint.n.k.m.b.a.m || !z || (z && (view.getMeasuredHeight() == eVar.k())) || (view instanceof i) || eVar.M()) {
                        iC = eVar.C();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iC, 1073741824);
                    }
                }
            }
            int i7 = a.f407a[bVar2.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i3, -2);
            } else if (i7 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i3 + eVar.A(), -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i3, -2);
                boolean z2 = eVar.o == 1;
                int i8 = aVar.j;
                if (i8 == android.support.constraint.n.k.m.b.a.l || i8 == android.support.constraint.n.k.m.b.a.m) {
                    if (aVar.j == android.support.constraint.n.k.m.b.a.m || !z2 || (z2 && (view.getMeasuredWidth() == eVar.C())) || (view instanceof i) || eVar.N()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                    }
                }
            }
            android.support.constraint.n.k.f fVar = (android.support.constraint.n.k.f) eVar.v();
            if (fVar != null && android.support.constraint.n.k.j.a(ConstraintLayout.this.j, 256) && view.getMeasuredWidth() == eVar.C() && view.getMeasuredWidth() < fVar.C() && view.getMeasuredHeight() == eVar.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == eVar.e() && !eVar.L()) {
                if (a(eVar.p(), iMakeMeasureSpec, eVar.C()) && a(eVar.q(), iMakeMeasureSpec2, eVar.k())) {
                    aVar.e = eVar.C();
                    aVar.f = eVar.k();
                    aVar.g = eVar.e();
                    return;
                }
            }
            boolean z3 = bVar == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
            boolean z4 = bVar2 == android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
            boolean z5 = bVar2 == android.support.constraint.n.k.e.b.MATCH_PARENT || bVar2 == android.support.constraint.n.k.e.b.FIXED;
            boolean z6 = bVar == android.support.constraint.n.k.e.b.MATCH_PARENT || bVar == android.support.constraint.n.k.e.b.FIXED;
            boolean z7 = z3 && eVar.U > 0.0f;
            boolean z8 = z4 && eVar.U > 0.0f;
            if (view == null) {
                return;
            }
            b bVar3 = (b) view.getLayoutParams();
            int i9 = aVar.j;
            if (i9 != android.support.constraint.n.k.m.b.a.l && i9 != android.support.constraint.n.k.m.b.a.m && z3 && eVar.n == 0 && z4 && eVar.o == 0) {
                i = -1;
                baseline = 0;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof l) && (eVar instanceof android.support.constraint.n.k.k)) {
                    ((l) view).a((android.support.constraint.n.k.k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.d(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i10 = eVar.q;
                iMax = i10 > 0 ? Math.max(i10, measuredWidth) : measuredWidth;
                int i11 = eVar.r;
                if (i11 > 0) {
                    iMax = Math.min(i11, iMax);
                }
                int i12 = eVar.t;
                iMax2 = i12 > 0 ? Math.max(i12, measuredHeight) : measuredHeight;
                int i13 = eVar.u;
                if (i13 > 0) {
                    iMax2 = Math.min(i13, iMax2);
                }
                if (!android.support.constraint.n.k.j.a(ConstraintLayout.this.j, 1)) {
                    if (z7 && z5) {
                        iMax = (int) ((iMax2 * eVar.U) + 0.5f);
                    } else if (z8 && z6) {
                        iMax2 = (int) ((iMax / eVar.U) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : iMakeMeasureSpec2;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    eVar.d(iMakeMeasureSpec, iMakeMeasureSpec3);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z9 = baseline != i;
            aVar.i = (iMax == aVar.f504c && iMax2 == aVar.d) ? false : true;
            if (bVar3.X) {
                z9 = true;
            }
            if (z9 && baseline != -1 && eVar.e() != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = iMax2;
            aVar.h = z9;
            aVar.g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f405b = new SparseArray<>();
        this.f406c = new ArrayList<>(4);
        this.d = new android.support.constraint.n.k.f();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        a((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f405b = new SparseArray<>();
        this.f406c = new ArrayList<>(4);
        this.d = new android.support.constraint.n.k.f();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f405b = new SparseArray<>();
        this.f406c = new ArrayList<>(4);
        this.d = new android.support.constraint.n.k.f();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        a(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f405b = new SparseArray<>();
        this.f406c = new ArrayList<>(4);
        this.d = new android.support.constraint.n.k.f();
        this.e = 0;
        this.f = 0;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = true;
        this.j = 257;
        this.k = null;
        this.l = null;
        this.m = -1;
        this.n = new HashMap<>();
        this.o = -1;
        this.p = -1;
        this.q = new SparseArray<>();
        this.r = new c(this);
        this.s = 0;
        this.t = 0;
        a(attributeSet, i, i2);
    }

    private void a(AttributeSet attributeSet, int i, int i2) {
        this.d.a(this);
        this.d.a((android.support.constraint.n.k.m.b.InterfaceC0025b) this.r);
        this.f405b.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == k.ConstraintLayout_Layout_android_minWidth) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == k.ConstraintLayout_Layout_android_minHeight) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == k.ConstraintLayout_Layout_android_maxWidth) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == k.ConstraintLayout_Layout_android_maxHeight) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == k.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.j = typedArrayObtainStyledAttributes.getInt(index, this.j);
                } else if (index == k.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            b(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.l = null;
                        }
                    }
                } else if (index == k.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.k = eVar;
                        eVar.b(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.k = null;
                    }
                    this.m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d.x(this.j);
    }

    private void b() {
        this.i = true;
        this.o = -1;
        this.p = -1;
    }

    private final android.support.constraint.n.k.e c(int i) {
        if (i == 0) {
            return this.d;
        }
        View viewFindViewById = this.f405b.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).m0;
    }

    private void c() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.support.constraint.n.k.e eVarA = a(getChildAt(i));
            if (eVarA != null) {
                eVarA.P();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    a(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    c(childAt.getId()).a(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.m != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.m && (childAt2 instanceof f)) {
                    this.k = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.k;
        if (eVar != null) {
            eVar.a(this, true);
        }
        this.d.T();
        int size = this.f406c.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f406c.get(i4).e(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.q.clear();
        this.q.put(0, this.d);
        this.q.put(getId(), this.d);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.q.put(childAt4.getId(), a(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            android.support.constraint.n.k.e eVarA2 = a(childAt5);
            if (eVarA2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.d.a(eVarA2);
                a(zIsInEditMode, childAt5, eVarA2, bVar, this.q);
            }
        }
    }

    private boolean d() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            c();
        }
        return z;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd()) : 0;
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final android.support.constraint.n.k.e a(View view) {
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).m0;
    }

    public View a(int i) {
        return this.f405b.get(i);
    }

    public Object a(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.n.get(str);
    }

    protected void a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.r;
        int i5 = cVar.e;
        int i6 = i3 + cVar.d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i6, i7);
            this.o = i6;
            this.p = i7;
            return;
        }
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215;
        int iMin = Math.min(this.g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.h, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.o = iMin;
        this.p = iMin2;
    }

    public void a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void a(android.support.constraint.n.k.f fVar, int i, int i2, int i3) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i4 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.r.a(i2, i3, iMax2, iMax3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int iMax4 = Math.max(0, getPaddingStart());
            int iMax5 = Math.max(0, getPaddingEnd());
            if (iMax4 <= 0 && iMax5 <= 0) {
                iMax4 = Math.max(0, getPaddingLeft());
            } else if (a()) {
                iMax4 = iMax5;
            }
            iMax = iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        a(fVar, mode, i5, mode2, i6);
        fVar.a(i, mode, i5, mode2, i6, this.o, this.p, iMax, iMax2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r9
  0x002c: PHI (r9v2 android.support.constraint.n.k.e$b) = (r9v1 android.support.constraint.n.k.e$b), (r9v6 android.support.constraint.n.k.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v2 android.support.constraint.n.k.e$b) = (r2v1 android.support.constraint.n.k.e$b), (r2v4 android.support.constraint.n.k.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    protected void a(android.support.constraint.n.k.f fVar, int i, int i2, int i3, int i4) {
        android.support.constraint.n.k.e.b bVar;
        c cVar = this.r;
        int i5 = cVar.e;
        int i6 = cVar.d;
        android.support.constraint.n.k.e.b bVar2 = android.support.constraint.n.k.e.b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.e);
                }
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.g - i6, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = android.support.constraint.n.k.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.e);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.h - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = android.support.constraint.n.k.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f);
            }
        }
        if (i2 != fVar.C() || i4 != fVar.k()) {
            fVar.Y();
        }
        fVar.u(0);
        fVar.v(0);
        fVar.o(this.g - i6);
        fVar.n(this.h - i5);
        fVar.q(0);
        fVar.p(0);
        fVar.a(bVar);
        fVar.t(i2);
        fVar.b(bVar2);
        fVar.l(i4);
        fVar.q(this.e - i6);
        fVar.p(this.f - i5);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:112:0x0209  */
    /* JADX WARN: Code duplicated, block: B:114:0x020d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0211  */
    /* JADX WARN: Code duplicated, block: B:117:0x0214  */
    /* JADX WARN: Code duplicated, block: B:119:0x022e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0237  */
    /* JADX WARN: Code duplicated, block: B:122:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0252  */
    /* JADX WARN: Code duplicated, block: B:129:0x0256  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:133:0x027c  */
    /* JADX WARN: Code duplicated, block: B:135:0x028a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX WARN: Code duplicated, block: B:83:0x0169  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174  */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    protected void a(boolean z, View view, android.support.constraint.n.k.e eVar, b bVar, SparseArray<android.support.constraint.n.k.e> sparseArray) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        float f2;
        android.support.constraint.n.k.e eVar2;
        android.support.constraint.n.k.d.b bVar2;
        android.support.constraint.n.k.d.b bVar3;
        int i5;
        android.support.constraint.n.k.e eVar3;
        android.support.constraint.n.k.d.b bVar4;
        int i6;
        android.support.constraint.n.k.d.b bVar5;
        int i7;
        int i8;
        android.support.constraint.n.k.e eVar4;
        android.support.constraint.n.k.d.b bVar6;
        android.support.constraint.n.k.d.b bVar7;
        int i9;
        int i10;
        int i11;
        int i12;
        android.support.constraint.n.k.e eVar5;
        android.support.constraint.n.k.d.b bVar8;
        int i13;
        int i14;
        android.support.constraint.n.k.d.b bVar9;
        int i15;
        float f3;
        float f4;
        View view2;
        android.support.constraint.n.k.e eVar6;
        android.support.constraint.n.k.e.b bVar10;
        android.support.constraint.n.k.e.b bVar11;
        android.support.constraint.n.k.e eVar7;
        bVar.a();
        bVar.n0 = false;
        eVar.s(view.getVisibility());
        if (bVar.a0) {
            eVar.b(true);
            eVar.s(8);
        }
        eVar.a(view);
        if (view instanceof android.support.constraint.c) {
            ((android.support.constraint.c) view).a(eVar, this.d.a0());
        }
        if (bVar.Y) {
            android.support.constraint.n.k.g gVar = (android.support.constraint.n.k.g) eVar;
            int i16 = bVar.j0;
            int i17 = bVar.k0;
            float f5 = bVar.l0;
            if (Build.VERSION.SDK_INT < 17) {
                i16 = bVar.f408a;
                i17 = bVar.f409b;
                f5 = bVar.f410c;
            }
            if (f5 != -1.0f) {
                gVar.e(f5);
                return;
            } else if (i16 != -1) {
                gVar.x(i16);
                return;
            } else {
                if (i17 != -1) {
                    gVar.y(i17);
                    return;
                }
                return;
            }
        }
        int i18 = bVar.c0;
        int i19 = bVar.d0;
        int i20 = bVar.e0;
        int i21 = bVar.f0;
        int i22 = bVar.g0;
        int i23 = bVar.h0;
        float f6 = bVar.i0;
        if (Build.VERSION.SDK_INT < 17) {
            i18 = bVar.d;
            int i24 = bVar.e;
            int i25 = bVar.f;
            i21 = bVar.g;
            int i26 = bVar.t;
            int i27 = bVar.v;
            f6 = bVar.z;
            if (i18 == -1 && i24 == -1) {
                int i28 = bVar.q;
                if (i28 != -1) {
                    i18 = i28;
                } else {
                    int i29 = bVar.p;
                    if (i29 != -1) {
                        i24 = i29;
                    }
                }
            }
            if (i25 == -1 && i21 == -1) {
                i2 = bVar.r;
                if (i2 == -1) {
                    int i30 = bVar.s;
                    if (i30 != -1) {
                        i = i27;
                        f = f6;
                        i22 = i26;
                        i3 = i30;
                        i19 = i24;
                        i2 = i25;
                    } else {
                        i2 = i25;
                        i = i27;
                        i22 = i26;
                        i19 = i24;
                    }
                } else {
                    i = i27;
                    i22 = i26;
                    i19 = i24;
                }
            } else {
                i2 = i25;
                i = i27;
                i22 = i26;
                i19 = i24;
            }
            i4 = bVar.m;
            if (i4 != -1) {
                eVar7 = sparseArray.get(i4);
                if (eVar7 != null) {
                    eVar.a(eVar7, bVar.o, bVar.n);
                }
            } else {
                if (i18 != -1) {
                    eVar2 = sparseArray.get(i18);
                    if (eVar2 != null) {
                        bVar3 = android.support.constraint.n.k.d.b.LEFT;
                        bVar2 = bVar3;
                        f2 = f;
                        i5 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        eVar.a(bVar2, eVar2, bVar3, i5, i22);
                    } else {
                        f2 = f;
                    }
                } else {
                    f2 = f;
                    if (i19 == -1 && (eVar2 = sparseArray.get(i19)) != null) {
                        bVar2 = android.support.constraint.n.k.d.b.LEFT;
                        bVar3 = android.support.constraint.n.k.d.b.RIGHT;
                        i5 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        eVar.a(bVar2, eVar2, bVar3, i5, i22);
                    }
                }
                if (i2 != -1) {
                    eVar3 = sparseArray.get(i2);
                    if (eVar3 != null) {
                        bVar5 = android.support.constraint.n.k.d.b.RIGHT;
                        bVar4 = android.support.constraint.n.k.d.b.LEFT;
                        i6 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        eVar.a(bVar5, eVar3, bVar4, i6, i);
                    }
                } else if (i3 == -1 && (eVar3 = sparseArray.get(i3)) != null) {
                    bVar4 = android.support.constraint.n.k.d.b.RIGHT;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    bVar5 = bVar4;
                    eVar.a(bVar5, eVar3, bVar4, i6, i);
                }
                i7 = bVar.h;
                if (i7 != -1) {
                    eVar4 = sparseArray.get(i7);
                    if (eVar4 != null) {
                        bVar7 = android.support.constraint.n.k.d.b.TOP;
                        i9 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        i10 = bVar.u;
                        bVar6 = bVar7;
                        eVar.a(bVar6, eVar4, bVar7, i9, i10);
                    }
                } else {
                    i8 = bVar.i;
                    if (i8 == -1 && (eVar4 = sparseArray.get(i8)) != null) {
                        bVar6 = android.support.constraint.n.k.d.b.TOP;
                        bVar7 = android.support.constraint.n.k.d.b.BOTTOM;
                        i9 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        i10 = bVar.u;
                        eVar.a(bVar6, eVar4, bVar7, i9, i10);
                    }
                }
                i11 = bVar.j;
                if (i11 != -1) {
                    eVar5 = sparseArray.get(i11);
                    if (eVar5 != null) {
                        bVar9 = android.support.constraint.n.k.d.b.BOTTOM;
                        bVar8 = android.support.constraint.n.k.d.b.TOP;
                        i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                        i14 = bVar.w;
                        eVar.a(bVar9, eVar5, bVar8, i13, i14);
                    }
                } else {
                    i12 = bVar.k;
                    if (i12 == -1 && (eVar5 = sparseArray.get(i12)) != null) {
                        bVar8 = android.support.constraint.n.k.d.b.BOTTOM;
                        i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                        i14 = bVar.w;
                        bVar9 = bVar8;
                        eVar.a(bVar9, eVar5, bVar8, i13, i14);
                    }
                }
                i15 = bVar.l;
                if (i15 != -1) {
                    view2 = this.f405b.get(i15);
                    eVar6 = sparseArray.get(bVar.l);
                    if (eVar6 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                        b bVar12 = (b) view2.getLayoutParams();
                        bVar.X = true;
                        bVar12.X = true;
                        eVar.a(android.support.constraint.n.k.d.b.BASELINE).a(eVar6.a(android.support.constraint.n.k.d.b.BASELINE), 0, -1, true);
                        eVar.a(true);
                        bVar12.m0.a(true);
                        eVar.a(android.support.constraint.n.k.d.b.TOP).m();
                        eVar.a(android.support.constraint.n.k.d.b.BOTTOM).m();
                    }
                }
                f3 = f2;
                if (f3 >= 0.0f) {
                    eVar.a(f3);
                }
                f4 = bVar.A;
                if (f4 >= 0.0f) {
                    eVar.c(f4);
                }
            }
            if (z && (bVar.P != -1 || bVar.Q != -1)) {
                eVar.e(bVar.P, bVar.Q);
            }
            if (!bVar.V) {
                eVar.a(android.support.constraint.n.k.e.b.FIXED);
                eVar.t(((ViewGroup.MarginLayoutParams) bVar).width);
                if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                    eVar.a(android.support.constraint.n.k.e.b.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.S) {
                    bVar11 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                } else {
                    bVar11 = android.support.constraint.n.k.e.b.MATCH_PARENT;
                }
                eVar.a(bVar11);
                eVar.a(android.support.constraint.n.k.d.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.a(android.support.constraint.n.k.d.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.a(android.support.constraint.n.k.e.b.MATCH_CONSTRAINT);
                eVar.t(0);
            }
            if (!bVar.W) {
                eVar.b(android.support.constraint.n.k.e.b.FIXED);
                eVar.l(((ViewGroup.MarginLayoutParams) bVar).height);
                if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                    eVar.b(android.support.constraint.n.k.e.b.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.T) {
                    bVar10 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
                } else {
                    bVar10 = android.support.constraint.n.k.e.b.MATCH_PARENT;
                }
                eVar.b(bVar10);
                eVar.a(android.support.constraint.n.k.d.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.a(android.support.constraint.n.k.d.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.b(android.support.constraint.n.k.e.b.MATCH_CONSTRAINT);
                eVar.l(0);
            }
            eVar.b(bVar.B);
            eVar.b(bVar.D);
            eVar.d(bVar.E);
            eVar.m(bVar.F);
            eVar.r(bVar.G);
            eVar.a(bVar.H, bVar.J, bVar.L, bVar.N);
            eVar.b(bVar.I, bVar.K, bVar.M, bVar.O);
        }
        i = i23;
        i2 = i20;
        float f7 = f6;
        i3 = i21;
        f = f7;
        i4 = bVar.m;
        if (i4 != -1) {
            eVar7 = sparseArray.get(i4);
            if (eVar7 != null) {
                eVar.a(eVar7, bVar.o, bVar.n);
            }
        } else {
            if (i18 != -1) {
                eVar2 = sparseArray.get(i18);
                if (eVar2 != null) {
                    bVar3 = android.support.constraint.n.k.d.b.LEFT;
                    bVar2 = bVar3;
                    f2 = f;
                    i5 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    eVar.a(bVar2, eVar2, bVar3, i5, i22);
                } else {
                    f2 = f;
                }
            } else {
                f2 = f;
                if (i19 == -1) {
                }
            }
            if (i2 != -1) {
                eVar3 = sparseArray.get(i2);
                if (eVar3 != null) {
                    bVar5 = android.support.constraint.n.k.d.b.RIGHT;
                    bVar4 = android.support.constraint.n.k.d.b.LEFT;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    eVar.a(bVar5, eVar3, bVar4, i6, i);
                }
            } else if (i3 == -1) {
            }
            i7 = bVar.h;
            if (i7 != -1) {
                eVar4 = sparseArray.get(i7);
                if (eVar4 != null) {
                    bVar7 = android.support.constraint.n.k.d.b.TOP;
                    i9 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i10 = bVar.u;
                    bVar6 = bVar7;
                    eVar.a(bVar6, eVar4, bVar7, i9, i10);
                }
            } else {
                i8 = bVar.i;
                if (i8 == -1) {
                }
            }
            i11 = bVar.j;
            if (i11 != -1) {
                eVar5 = sparseArray.get(i11);
                if (eVar5 != null) {
                    bVar9 = android.support.constraint.n.k.d.b.BOTTOM;
                    bVar8 = android.support.constraint.n.k.d.b.TOP;
                    i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i14 = bVar.w;
                    eVar.a(bVar9, eVar5, bVar8, i13, i14);
                }
            } else {
                i12 = bVar.k;
                if (i12 == -1) {
                }
            }
            i15 = bVar.l;
            if (i15 != -1) {
                view2 = this.f405b.get(i15);
                eVar6 = sparseArray.get(bVar.l);
                if (eVar6 != null) {
                    b bVar13 = (b) view2.getLayoutParams();
                    bVar.X = true;
                    bVar13.X = true;
                    eVar.a(android.support.constraint.n.k.d.b.BASELINE).a(eVar6.a(android.support.constraint.n.k.d.b.BASELINE), 0, -1, true);
                    eVar.a(true);
                    bVar13.m0.a(true);
                    eVar.a(android.support.constraint.n.k.d.b.TOP).m();
                    eVar.a(android.support.constraint.n.k.d.b.BOTTOM).m();
                }
            }
            f3 = f2;
            if (f3 >= 0.0f) {
                eVar.a(f3);
            }
            f4 = bVar.A;
            if (f4 >= 0.0f) {
                eVar.c(f4);
            }
        }
        if (z) {
            eVar.e(bVar.P, bVar.Q);
        }
        if (!bVar.V) {
            eVar.a(android.support.constraint.n.k.e.b.FIXED);
            eVar.t(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.a(android.support.constraint.n.k.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.S) {
                bVar11 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
            } else {
                bVar11 = android.support.constraint.n.k.e.b.MATCH_PARENT;
            }
            eVar.a(bVar11);
            eVar.a(android.support.constraint.n.k.d.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.a(android.support.constraint.n.k.d.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.a(android.support.constraint.n.k.e.b.MATCH_CONSTRAINT);
            eVar.t(0);
        }
        if (!bVar.W) {
            eVar.b(android.support.constraint.n.k.e.b.FIXED);
            eVar.l(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.b(android.support.constraint.n.k.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.T) {
                bVar10 = android.support.constraint.n.k.e.b.MATCH_CONSTRAINT;
            } else {
                bVar10 = android.support.constraint.n.k.e.b.MATCH_PARENT;
            }
            eVar.b(bVar10);
            eVar.a(android.support.constraint.n.k.d.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.a(android.support.constraint.n.k.d.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.b(android.support.constraint.n.k.e.b.MATCH_CONSTRAINT);
            eVar.l(0);
        }
        eVar.b(bVar.B);
        eVar.b(bVar.D);
        eVar.d(bVar.E);
        eVar.m(bVar.F);
        eVar.r(bVar.G);
        eVar.a(bVar.H, bVar.J, bVar.L, bVar.N);
        eVar.b(bVar.I, bVar.K, bVar.M, bVar.O);
    }

    protected boolean a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    protected void b(int i) {
        this.l = new d(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<android.support.constraint.c> arrayList = this.f406c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f406c.get(i).d(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        b();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.g;
    }

    public int getMinHeight() {
        return this.f;
    }

    public int getMinWidth() {
        return this.e;
    }

    public int getOptimizationLevel() {
        return this.d.V();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            android.support.constraint.n.k.e eVar = bVar.m0;
            if ((childAt.getVisibility() != 8 || bVar.Y || bVar.Z || bVar.b0 || zIsInEditMode) && !bVar.a0) {
                int iD = eVar.D();
                int iE = eVar.E();
                int iC = eVar.C() + iD;
                int iK = eVar.k() + iE;
                childAt.layout(iD, iE, iC, iK);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iD, iE, iC, iK);
                }
            }
        }
        int size = this.f406c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f406c.get(i6).b(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.i) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.i = true;
                    break;
                }
            }
        }
        if (this.i) {
            this.s = i;
            this.t = i2;
            this.d.g(a());
            if (this.i) {
                this.i = false;
                if (d()) {
                    this.d.c0();
                }
            }
            a(this.d, this.j, i, i2);
        } else if (this.s != i || this.t != i2) {
            if (this.s == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.t) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.d.k()) {
                this.s = i;
                this.t = i2;
            } else {
                this.s = i;
                this.t = i2;
                this.d.g(a());
                if (this.i) {
                    this.i = false;
                    if (d()) {
                        this.d.c0();
                    }
                }
                a(this.d, this.j, i, i2);
            }
        }
        a(i, i2, this.d.C(), this.d.k(), this.d.b0(), this.d.Z());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        android.support.constraint.n.k.e eVarA = a(view);
        if ((view instanceof h) && !(eVarA instanceof android.support.constraint.n.k.g)) {
            b bVar = (b) view.getLayoutParams();
            android.support.constraint.n.k.g gVar = new android.support.constraint.n.k.g();
            bVar.m0 = gVar;
            bVar.Y = true;
            gVar.z(bVar.R);
        }
        if (view instanceof android.support.constraint.c) {
            android.support.constraint.c cVar = (android.support.constraint.c) view;
            cVar.b();
            ((b) view.getLayoutParams()).Z = true;
            if (!this.f406c.contains(cVar)) {
                this.f406c.add(cVar);
            }
        }
        this.f405b.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f405b.remove(view.getId());
        this.d.c(a(view));
        this.f406c.remove(view);
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        b();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.k = eVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f405b.remove(getId());
        super.setId(i);
        this.f405b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.j = i;
        this.d.x(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
