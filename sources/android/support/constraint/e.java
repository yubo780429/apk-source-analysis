package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final int[] d = {0, 4, 8};
    private static SparseIntArray e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, android.support.constraint.b> f431a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f432b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, a> f433c = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f435b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f436c = new c();
        public final b d = new b();
        public final C0024e e = new C0024e();
        public HashMap<String, android.support.constraint.b> f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, ConstraintLayout.b bVar) {
            this.f434a = i;
            b bVar2 = this.d;
            bVar2.h = bVar.d;
            bVar2.i = bVar.e;
            bVar2.j = bVar.f;
            bVar2.k = bVar.g;
            bVar2.l = bVar.h;
            bVar2.m = bVar.i;
            bVar2.n = bVar.j;
            bVar2.o = bVar.k;
            bVar2.p = bVar.l;
            bVar2.q = bVar.p;
            bVar2.r = bVar.q;
            bVar2.s = bVar.r;
            bVar2.t = bVar.s;
            bVar2.u = bVar.z;
            bVar2.v = bVar.A;
            bVar2.w = bVar.B;
            bVar2.x = bVar.m;
            bVar2.y = bVar.n;
            bVar2.z = bVar.o;
            bVar2.A = bVar.P;
            bVar2.B = bVar.Q;
            bVar2.C = bVar.R;
            bVar2.g = bVar.f410c;
            bVar2.e = bVar.f408a;
            bVar2.f = bVar.f409b;
            bVar2.f439c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.E;
            bVar2.Q = bVar.D;
            bVar2.S = bVar.G;
            bVar2.R = bVar.F;
            bVar2.h0 = bVar.S;
            bVar2.i0 = bVar.T;
            bVar2.T = bVar.H;
            bVar2.U = bVar.I;
            bVar2.V = bVar.L;
            bVar2.W = bVar.M;
            bVar2.X = bVar.J;
            bVar2.Y = bVar.K;
            bVar2.Z = bVar.N;
            bVar2.a0 = bVar.O;
            bVar2.g0 = bVar.U;
            bVar2.K = bVar.u;
            bVar2.M = bVar.w;
            bVar2.J = bVar.t;
            bVar2.L = bVar.v;
            bVar2.O = bVar.x;
            bVar2.N = bVar.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.H = bVar.getMarginEnd();
                this.d.I = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, f.a aVar) {
            a(i, (ConstraintLayout.b) aVar);
            this.f435b.d = aVar.o0;
            C0024e c0024e = this.e;
            c0024e.f447b = aVar.r0;
            c0024e.f448c = aVar.s0;
            c0024e.d = aVar.t0;
            c0024e.e = aVar.u0;
            c0024e.f = aVar.v0;
            c0024e.g = aVar.w0;
            c0024e.h = aVar.x0;
            c0024e.i = aVar.y0;
            c0024e.j = aVar.z0;
            c0024e.k = aVar.A0;
            c0024e.m = aVar.q0;
            c0024e.l = aVar.p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(android.support.constraint.c cVar, int i, f.a aVar) {
            a(i, aVar);
            if (cVar instanceof android.support.constraint.a) {
                b bVar = this.d;
                bVar.d0 = 1;
                android.support.constraint.a aVar2 = (android.support.constraint.a) cVar;
                bVar.b0 = aVar2.getType();
                this.d.e0 = aVar2.getReferencedIds();
                this.d.c0 = aVar2.getMargin();
            }
        }

        public void a(ConstraintLayout.b bVar) {
            b bVar2 = this.d;
            bVar.d = bVar2.h;
            bVar.e = bVar2.i;
            bVar.f = bVar2.j;
            bVar.g = bVar2.k;
            bVar.h = bVar2.l;
            bVar.i = bVar2.m;
            bVar.j = bVar2.n;
            bVar.k = bVar2.o;
            bVar.l = bVar2.p;
            bVar.p = bVar2.q;
            bVar.q = bVar2.r;
            bVar.r = bVar2.s;
            bVar.s = bVar2.t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.x = bVar2.O;
            bVar.y = bVar2.N;
            bVar.u = bVar2.K;
            bVar.w = bVar2.M;
            bVar.z = bVar2.u;
            bVar.A = bVar2.v;
            bVar.m = bVar2.x;
            bVar.n = bVar2.y;
            bVar.o = bVar2.z;
            bVar.B = bVar2.w;
            bVar.P = bVar2.A;
            bVar.Q = bVar2.B;
            bVar.E = bVar2.P;
            bVar.D = bVar2.Q;
            bVar.G = bVar2.S;
            bVar.F = bVar2.R;
            bVar.S = bVar2.h0;
            bVar.T = bVar2.i0;
            bVar.H = bVar2.T;
            bVar.I = bVar2.U;
            bVar.L = bVar2.V;
            bVar.M = bVar2.W;
            bVar.J = bVar2.X;
            bVar.K = bVar2.Y;
            bVar.N = bVar2.Z;
            bVar.O = bVar2.a0;
            bVar.R = bVar2.C;
            bVar.f410c = bVar2.g;
            bVar.f408a = bVar2.e;
            bVar.f409b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f439c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.d;
            String str = bVar2.g0;
            if (str != null) {
                bVar.U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.d.I);
                bVar.setMarginEnd(this.d.H);
            }
            bVar.a();
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public a m0clone() {
            a aVar = new a();
            aVar.d.a(this.d);
            aVar.f436c.a(this.f436c);
            aVar.f435b.a(this.f435b);
            aVar.e.a(this.e);
            aVar.f434a = this.f434a;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f439c;
        public int d;
        public int[] e0;
        public String f0;
        public String g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f437a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f438b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public float a0 = 1.0f;
        public int b0 = -1;
        public int c0 = 0;
        public int d0 = -1;
        public boolean h0 = false;
        public boolean i0 = false;
        public boolean j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
            k0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
            k0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
            k0.append(k.Layout_layout_constraintRight_toRightOf, 29);
            k0.append(k.Layout_layout_constraintTop_toTopOf, 35);
            k0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
            k0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
            k0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
            k0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
            k0.append(k.Layout_layout_editor_absoluteX, 6);
            k0.append(k.Layout_layout_editor_absoluteY, 7);
            k0.append(k.Layout_layout_constraintGuide_begin, 17);
            k0.append(k.Layout_layout_constraintGuide_end, 18);
            k0.append(k.Layout_layout_constraintGuide_percent, 19);
            k0.append(k.Layout_android_orientation, 26);
            k0.append(k.Layout_layout_constraintStart_toEndOf, 31);
            k0.append(k.Layout_layout_constraintStart_toStartOf, 32);
            k0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
            k0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
            k0.append(k.Layout_layout_goneMarginLeft, 13);
            k0.append(k.Layout_layout_goneMarginTop, 16);
            k0.append(k.Layout_layout_goneMarginRight, 14);
            k0.append(k.Layout_layout_goneMarginBottom, 11);
            k0.append(k.Layout_layout_goneMarginStart, 15);
            k0.append(k.Layout_layout_goneMarginEnd, 12);
            k0.append(k.Layout_layout_constraintVertical_weight, 38);
            k0.append(k.Layout_layout_constraintHorizontal_weight, 37);
            k0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
            k0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
            k0.append(k.Layout_layout_constraintHorizontal_bias, 20);
            k0.append(k.Layout_layout_constraintVertical_bias, 36);
            k0.append(k.Layout_layout_constraintDimensionRatio, 5);
            k0.append(k.Layout_layout_constraintLeft_creator, 76);
            k0.append(k.Layout_layout_constraintTop_creator, 76);
            k0.append(k.Layout_layout_constraintRight_creator, 76);
            k0.append(k.Layout_layout_constraintBottom_creator, 76);
            k0.append(k.Layout_layout_constraintBaseline_creator, 76);
            k0.append(k.Layout_android_layout_marginLeft, 23);
            k0.append(k.Layout_android_layout_marginRight, 27);
            k0.append(k.Layout_android_layout_marginStart, 30);
            k0.append(k.Layout_android_layout_marginEnd, 8);
            k0.append(k.Layout_android_layout_marginTop, 33);
            k0.append(k.Layout_android_layout_marginBottom, 2);
            k0.append(k.Layout_android_layout_width, 22);
            k0.append(k.Layout_android_layout_height, 21);
            k0.append(k.Layout_layout_constraintCircle, 61);
            k0.append(k.Layout_layout_constraintCircleRadius, 62);
            k0.append(k.Layout_layout_constraintCircleAngle, 63);
            k0.append(k.Layout_layout_constraintWidth_percent, 69);
            k0.append(k.Layout_layout_constraintHeight_percent, 70);
            k0.append(k.Layout_chainUseRtl, 71);
            k0.append(k.Layout_barrierDirection, 72);
            k0.append(k.Layout_barrierMargin, 73);
            k0.append(k.Layout_constraint_referenced_ids, 74);
            k0.append(k.Layout_barrierAllowsGoneWidgets, 75);
        }

        void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Layout);
            this.f438b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = k0.get(index);
                if (i2 == 80) {
                    this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.p = e.b(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.o = e.b(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 4:
                            this.n = e.b(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 5:
                            this.w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            }
                            break;
                        case 9:
                            this.t = e.b(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 10:
                            this.s = e.b(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case 18:
                            this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 19:
                            this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                            break;
                        case 20:
                            this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                            break;
                        case 21:
                            this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 22:
                            this.f439c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f439c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.h = e.b(typedArrayObtainStyledAttributes, index, this.h);
                            break;
                        case 25:
                            this.i = e.b(typedArrayObtainStyledAttributes, index, this.i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.j = e.b(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case 29:
                            this.k = e.b(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            }
                            break;
                        case 31:
                            this.q = e.b(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 32:
                            this.r = e.b(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 33:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.m = e.b(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 35:
                            this.l = e.b(typedArrayObtainStyledAttributes, index, this.l);
                            break;
                        case 36:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 37:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.x = e.b(typedArrayObtainStyledAttributes, index, this.x);
                                            break;
                                        case 62:
                                            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            break;
                                        case 63:
                                            this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.b0 = typedArrayObtainStyledAttributes.getInt(index, this.b0);
                                                    continue;
                                                case 73:
                                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    continue;
                                                case 74:
                                                    this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f437a = bVar.f437a;
            this.f439c = bVar.f439c;
            this.f438b = bVar.f438b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.g0 = bVar.g0;
            int[] iArr = bVar.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = bVar.f0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
        }
    }

    public static class c {
        private static SparseIntArray h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f440a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f441b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f442c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(k.Motion_motionPathRotate, 1);
            h.append(k.Motion_pathMotionArc, 2);
            h.append(k.Motion_transitionEasing, 3);
            h.append(k.Motion_drawPath, 4);
            h.append(k.Motion_animate_relativeTo, 5);
            h.append(k.Motion_motionStagger, 6);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Motion);
            this.f440a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        this.f442c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : android.support.constraint.m.b.a.f452b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f441b = e.b(typedArrayObtainStyledAttributes, index, this.f441b);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(c cVar) {
            this.f440a = cVar.f440a;
            this.f441b = cVar.f441b;
            this.f442c = cVar.f442c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.g = cVar.g;
            this.f = cVar.f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f443a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f444b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f445c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.PropertySet);
            this.f443a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.PropertySet_android_alpha) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == k.PropertySet_android_visibility) {
                    this.f444b = typedArrayObtainStyledAttributes.getInt(index, this.f444b);
                    this.f444b = e.d[this.f444b];
                } else if (index == k.PropertySet_visibilityMode) {
                    this.f445c = typedArrayObtainStyledAttributes.getInt(index, this.f445c);
                } else if (index == k.PropertySet_motionProgress) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(d dVar) {
            this.f443a = dVar.f443a;
            this.f444b = dVar.f444b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f445c = dVar.f445c;
        }
    }

    /* JADX INFO: renamed from: android.support.constraint.e$e, reason: collision with other inner class name */
    public static class C0024e {
        private static SparseIntArray n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f446a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f447b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f448c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(k.Transform_android_rotation, 1);
            n.append(k.Transform_android_rotationX, 2);
            n.append(k.Transform_android_rotationY, 3);
            n.append(k.Transform_android_scaleX, 4);
            n.append(k.Transform_android_scaleY, 5);
            n.append(k.Transform_android_transformPivotX, 6);
            n.append(k.Transform_android_transformPivotY, 7);
            n.append(k.Transform_android_translationX, 8);
            n.append(k.Transform_android_translationY, 9);
            n.append(k.Transform_android_translationZ, 10);
            n.append(k.Transform_android_elevation, 11);
        }

        void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Transform);
            this.f446a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.f447b = typedArrayObtainStyledAttributes.getFloat(index, this.f447b);
                        break;
                    case 2:
                        this.f448c = typedArrayObtainStyledAttributes.getFloat(index, this.f448c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        }
                        break;
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.l = true;
                            this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(C0024e c0024e) {
            this.f446a = c0024e.f446a;
            this.f447b = c0024e.f447b;
            this.f448c = c0024e.f448c;
            this.d = c0024e.d;
            this.e = c0024e.e;
            this.f = c0024e.f;
            this.g = c0024e.g;
            this.h = c0024e.h;
            this.i = c0024e.i;
            this.j = c0024e.j;
            this.k = c0024e.k;
            this.l = c0024e.l;
            this.m = c0024e.m;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
        e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
        e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
        e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
        e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
        e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
        e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
        e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
        e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        e.append(k.Constraint_layout_editor_absoluteX, 6);
        e.append(k.Constraint_layout_editor_absoluteY, 7);
        e.append(k.Constraint_layout_constraintGuide_begin, 17);
        e.append(k.Constraint_layout_constraintGuide_end, 18);
        e.append(k.Constraint_layout_constraintGuide_percent, 19);
        e.append(k.Constraint_android_orientation, 27);
        e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
        e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
        e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
        e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
        e.append(k.Constraint_layout_goneMarginLeft, 13);
        e.append(k.Constraint_layout_goneMarginTop, 16);
        e.append(k.Constraint_layout_goneMarginRight, 14);
        e.append(k.Constraint_layout_goneMarginBottom, 11);
        e.append(k.Constraint_layout_goneMarginStart, 15);
        e.append(k.Constraint_layout_goneMarginEnd, 12);
        e.append(k.Constraint_layout_constraintVertical_weight, 40);
        e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
        e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
        e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
        e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
        e.append(k.Constraint_layout_constraintVertical_bias, 37);
        e.append(k.Constraint_layout_constraintDimensionRatio, 5);
        e.append(k.Constraint_layout_constraintLeft_creator, 82);
        e.append(k.Constraint_layout_constraintTop_creator, 82);
        e.append(k.Constraint_layout_constraintRight_creator, 82);
        e.append(k.Constraint_layout_constraintBottom_creator, 82);
        e.append(k.Constraint_layout_constraintBaseline_creator, 82);
        e.append(k.Constraint_android_layout_marginLeft, 24);
        e.append(k.Constraint_android_layout_marginRight, 28);
        e.append(k.Constraint_android_layout_marginStart, 31);
        e.append(k.Constraint_android_layout_marginEnd, 8);
        e.append(k.Constraint_android_layout_marginTop, 34);
        e.append(k.Constraint_android_layout_marginBottom, 2);
        e.append(k.Constraint_android_layout_width, 23);
        e.append(k.Constraint_android_layout_height, 21);
        e.append(k.Constraint_android_visibility, 22);
        e.append(k.Constraint_android_alpha, 43);
        e.append(k.Constraint_android_elevation, 44);
        e.append(k.Constraint_android_rotationX, 45);
        e.append(k.Constraint_android_rotationY, 46);
        e.append(k.Constraint_android_rotation, 60);
        e.append(k.Constraint_android_scaleX, 47);
        e.append(k.Constraint_android_scaleY, 48);
        e.append(k.Constraint_android_transformPivotX, 49);
        e.append(k.Constraint_android_transformPivotY, 50);
        e.append(k.Constraint_android_translationX, 51);
        e.append(k.Constraint_android_translationY, 52);
        e.append(k.Constraint_android_translationZ, 53);
        e.append(k.Constraint_layout_constraintWidth_default, 54);
        e.append(k.Constraint_layout_constraintHeight_default, 55);
        e.append(k.Constraint_layout_constraintWidth_max, 56);
        e.append(k.Constraint_layout_constraintHeight_max, 57);
        e.append(k.Constraint_layout_constraintWidth_min, 58);
        e.append(k.Constraint_layout_constraintHeight_min, 59);
        e.append(k.Constraint_layout_constraintCircle, 61);
        e.append(k.Constraint_layout_constraintCircleRadius, 62);
        e.append(k.Constraint_layout_constraintCircleAngle, 63);
        e.append(k.Constraint_animate_relativeTo, 64);
        e.append(k.Constraint_transitionEasing, 65);
        e.append(k.Constraint_drawPath, 66);
        e.append(k.Constraint_transitionPathRotate, 67);
        e.append(k.Constraint_motionStagger, 79);
        e.append(k.Constraint_android_id, 38);
        e.append(k.Constraint_motionProgress, 68);
        e.append(k.Constraint_layout_constraintWidth_percent, 69);
        e.append(k.Constraint_layout_constraintHeight_percent, 70);
        e.append(k.Constraint_chainUseRtl, 71);
        e.append(k.Constraint_barrierDirection, 72);
        e.append(k.Constraint_barrierMargin, 73);
        e.append(k.Constraint_constraint_referenced_ids, 74);
        e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
        e.append(k.Constraint_pathMotionArc, 76);
        e.append(k.Constraint_layout_constraintTag, 77);
        e.append(k.Constraint_visibilityMode, 78);
        e.append(k.Constraint_layout_constrainedWidth, 80);
        e.append(k.Constraint_layout_constrainedHeight, 81);
    }

    private a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Constraint);
        a(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private void a(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != k.Constraint_android_id && k.Constraint_android_layout_marginStart != index && k.Constraint_android_layout_marginEnd != index) {
                aVar.f436c.f440a = true;
                aVar.d.f438b = true;
                aVar.f435b.f443a = true;
                aVar.e.f446a = true;
            }
            switch (e.get(index)) {
                case 1:
                    b bVar = aVar.d;
                    bVar.p = b(typedArray, index, bVar.p);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.d;
                    bVar3.o = b(typedArray, index, bVar3.o);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.d;
                    bVar4.n = b(typedArray, index, bVar4.n);
                    continue;
                    break;
                case 5:
                    aVar.d.w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.d;
                        bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    b bVar8 = aVar.d;
                    bVar8.t = b(typedArray, index, bVar8.t);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.d;
                    bVar9.s = b(typedArray, index, bVar9.s);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.d;
                    bVar16.e = typedArray.getDimensionPixelOffset(index, bVar16.e);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.d;
                    bVar17.f = typedArray.getDimensionPixelOffset(index, bVar17.f);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.d;
                    bVar18.g = typedArray.getFloat(index, bVar18.g);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.d;
                    bVar19.u = typedArray.getFloat(index, bVar19.u);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.d;
                    bVar20.d = typedArray.getLayoutDimension(index, bVar20.d);
                    continue;
                    break;
                case 22:
                    d dVar = aVar.f435b;
                    dVar.f444b = typedArray.getInt(index, dVar.f444b);
                    d dVar2 = aVar.f435b;
                    dVar2.f444b = d[dVar2.f444b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.d;
                    bVar21.f439c = typedArray.getLayoutDimension(index, bVar21.f439c);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.d;
                    bVar23.h = b(typedArray, index, bVar23.h);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.d;
                    bVar24.i = b(typedArray, index, bVar24.i);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.d;
                    bVar27.j = b(typedArray, index, bVar27.j);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.d;
                    bVar28.k = b(typedArray, index, bVar28.k);
                    continue;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.d;
                        bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    } else {
                        continue;
                    }
                    break;
                case 32:
                    b bVar30 = aVar.d;
                    bVar30.q = b(typedArray, index, bVar30.q);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.d;
                    bVar31.r = b(typedArray, index, bVar31.r);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.d;
                    bVar33.m = b(typedArray, index, bVar33.m);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.d;
                    bVar34.l = b(typedArray, index, bVar34.l);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.d;
                    bVar35.v = typedArray.getFloat(index, bVar35.v);
                    continue;
                    break;
                case 38:
                    aVar.f434a = typedArray.getResourceId(index, aVar.f434a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                    break;
                case 43:
                    d dVar3 = aVar.f435b;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    continue;
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0024e c0024e = aVar.e;
                        c0024e.l = true;
                        c0024e.m = typedArray.getDimension(index, c0024e.m);
                    } else {
                        continue;
                    }
                    break;
                case 45:
                    C0024e c0024e2 = aVar.e;
                    c0024e2.f448c = typedArray.getFloat(index, c0024e2.f448c);
                    continue;
                    break;
                case 46:
                    C0024e c0024e3 = aVar.e;
                    c0024e3.d = typedArray.getFloat(index, c0024e3.d);
                    continue;
                    break;
                case 47:
                    C0024e c0024e4 = aVar.e;
                    c0024e4.e = typedArray.getFloat(index, c0024e4.e);
                    continue;
                    break;
                case 48:
                    C0024e c0024e5 = aVar.e;
                    c0024e5.f = typedArray.getFloat(index, c0024e5.f);
                    continue;
                    break;
                case 49:
                    C0024e c0024e6 = aVar.e;
                    c0024e6.g = typedArray.getDimension(index, c0024e6.g);
                    continue;
                    break;
                case 50:
                    C0024e c0024e7 = aVar.e;
                    c0024e7.h = typedArray.getDimension(index, c0024e7.h);
                    continue;
                    break;
                case 51:
                    C0024e c0024e8 = aVar.e;
                    c0024e8.i = typedArray.getDimension(index, c0024e8.i);
                    continue;
                    break;
                case 52:
                    C0024e c0024e9 = aVar.e;
                    c0024e9.j = typedArray.getDimension(index, c0024e9.j);
                    continue;
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0024e c0024e10 = aVar.e;
                        c0024e10.k = typedArray.getDimension(index, c0024e10.k);
                    } else {
                        continue;
                    }
                    break;
                case 54:
                    b bVar40 = aVar.d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                    break;
                case 60:
                    C0024e c0024e11 = aVar.e;
                    c0024e11.f447b = typedArray.getFloat(index, c0024e11.f447b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.d;
                    bVar46.x = b(typedArray, index, bVar46.x);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.d;
                    bVar47.y = typedArray.getDimensionPixelSize(index, bVar47.y);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.d;
                    bVar48.z = typedArray.getFloat(index, bVar48.z);
                    continue;
                    break;
                case 64:
                    c cVar2 = aVar.f436c;
                    cVar2.f441b = b(typedArray, index, cVar2.f441b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f436c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f436c;
                        string = android.support.constraint.m.b.a.f452b[typedArray.getInteger(index, 0)];
                    }
                    cVar.f442c = string;
                    continue;
                    break;
                case 66:
                    aVar.f436c.e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar3 = aVar.f436c;
                    cVar3.g = typedArray.getFloat(index, cVar3.g);
                    continue;
                    break;
                case 68:
                    d dVar4 = aVar.f435b;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    continue;
                    break;
                case 69:
                    aVar.d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.d.a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.d;
                    bVar49.b0 = typedArray.getInt(index, bVar49.b0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.d;
                    bVar50.c0 = typedArray.getDimensionPixelSize(index, bVar50.c0);
                    continue;
                    break;
                case 74:
                    aVar.d.f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.d;
                    bVar51.j0 = typedArray.getBoolean(index, bVar51.j0);
                    continue;
                    break;
                case 76:
                    c cVar4 = aVar.f436c;
                    cVar4.d = typedArray.getInt(index, cVar4.d);
                    continue;
                    break;
                case 77:
                    aVar.d.g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    d dVar5 = aVar.f435b;
                    dVar5.f445c = typedArray.getInt(index, dVar5.f445c);
                    continue;
                    break;
                case 79:
                    c cVar5 = aVar.f436c;
                    cVar5.f = typedArray.getFloat(index, cVar5.f);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.d;
                    bVar52.h0 = typedArray.getBoolean(index, bVar52.h0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.d;
                    bVar53.i0 = typedArray.getBoolean(index, bVar53.i0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    private int[] a(View view, String str) {
        int iIntValue;
        Object objA;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = j.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objA = ((ConstraintLayout) view.getParent()).a(0, strTrim)) != null && (objA instanceof Integer)) {
                iIntValue = ((Integer) objA).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public void a(Context context, int i) {
        a((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    public void a(Context context, XmlPullParser xmlPullParser) {
        a aVarA;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarA = a(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                aVarA = a(context, Xml.asAttributeSet(xmlPullParser));
                                aVarA.d.f437a = true;
                                aVarA.d.f438b = true;
                                break;
                            case "Barrier":
                                aVarA = a(context, Xml.asAttributeSet(xmlPullParser));
                                aVarA.d.d0 = 1;
                                break;
                            case "PropertySet":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f435b.a(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Transform":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.e.a(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Layout":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.d.a(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Motion":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVar.f436c.a(context, Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "CustomAttribute":
                                if (aVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                android.support.constraint.b.a(context, xmlPullParser, aVar.f);
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
                        aVar = aVarA;
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f433c.put(Integer.valueOf(aVar.f434a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f433c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f432b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f433c.containsKey(Integer.valueOf(id))) {
                this.f433c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f433c.get(Integer.valueOf(id));
            aVar.f = android.support.constraint.b.a(this.f431a, childAt);
            aVar.a(id, bVar);
            aVar.f435b.f444b = childAt.getVisibility();
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.f435b.d = childAt.getAlpha();
                aVar.e.f447b = childAt.getRotation();
                aVar.e.f448c = childAt.getRotationX();
                aVar.e.d = childAt.getRotationY();
                aVar.e.e = childAt.getScaleX();
                aVar.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0024e c0024e = aVar.e;
                    c0024e.g = pivotX;
                    c0024e.h = pivotY;
                }
                aVar.e.i = childAt.getTranslationX();
                aVar.e.j = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar.e.k = childAt.getTranslationZ();
                    C0024e c0024e2 = aVar.e;
                    if (c0024e2.l) {
                        c0024e2.m = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof android.support.constraint.a) {
                android.support.constraint.a aVar2 = (android.support.constraint.a) childAt;
                aVar.d.j0 = aVar2.c();
                aVar.d.e0 = aVar2.getReferencedIds();
                aVar.d.b0 = aVar2.getType();
                aVar.d.c0 = aVar2.getMargin();
            }
        }
    }

    void a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f433c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f433c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + android.support.constraint.m.a.a(childAt));
            } else {
                if (this.f432b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f433c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f433c.get(Integer.valueOf(id));
                        if (childAt instanceof android.support.constraint.a) {
                            aVar.d.d0 = 1;
                        }
                        int i2 = aVar.d.d0;
                        if (i2 != -1 && i2 == 1) {
                            android.support.constraint.a aVar2 = (android.support.constraint.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.d.b0);
                            aVar2.setMargin(aVar.d.c0);
                            aVar2.setAllowsGoneWidget(aVar.d.j0);
                            b bVar = aVar.d;
                            int[] iArr = bVar.e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f0;
                                if (str != null) {
                                    bVar.e0 = a(aVar2, str);
                                    aVar2.setReferencedIds(aVar.d.e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        if (z) {
                            android.support.constraint.b.a(childAt, aVar.f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f435b;
                        if (dVar.f445c == 0) {
                            childAt.setVisibility(dVar.f444b);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(aVar.f435b.d);
                            childAt.setRotation(aVar.e.f447b);
                            childAt.setRotationX(aVar.e.f448c);
                            childAt.setRotationY(aVar.e.d);
                            childAt.setScaleX(aVar.e.e);
                            childAt.setScaleY(aVar.e.f);
                            if (!Float.isNaN(aVar.e.g)) {
                                childAt.setPivotX(aVar.e.g);
                            }
                            if (!Float.isNaN(aVar.e.h)) {
                                childAt.setPivotY(aVar.e.h);
                            }
                            childAt.setTranslationX(aVar.e.i);
                            childAt.setTranslationY(aVar.e.j);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(aVar.e.k);
                                C0024e c0024e = aVar.e;
                                if (c0024e.l) {
                                    childAt.setElevation(c0024e.m);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = this.f433c.get(num);
            int i3 = aVar3.d.d0;
            if (i3 != -1 && i3 == 1) {
                android.support.constraint.a aVar4 = new android.support.constraint.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.d;
                int[] iArr2 = bVar3.e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f0;
                    if (str2 != null) {
                        bVar3.e0 = a(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.d.e0);
                    }
                }
                aVar4.setType(aVar3.d.b0);
                aVar4.setMargin(aVar3.d.c0);
                ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.b();
                aVar3.a(bVarGenerateDefaultLayoutParams);
                constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
            }
            if (aVar3.d.f437a) {
                View hVar = new h(constraintLayout.getContext());
                hVar.setId(num.intValue());
                ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.a(bVarGenerateDefaultLayoutParams2);
                constraintLayout.addView(hVar, bVarGenerateDefaultLayoutParams2);
            }
        }
    }

    public void a(f fVar) {
        int childCount = fVar.getChildCount();
        this.f433c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = fVar.getChildAt(i);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f432b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f433c.containsKey(Integer.valueOf(id))) {
                this.f433c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f433c.get(Integer.valueOf(id));
            if (childAt instanceof android.support.constraint.c) {
                aVar2.a((android.support.constraint.c) childAt, id, aVar);
            }
            aVar2.a(id, aVar);
        }
    }

    public void b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarA = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarA.d.f437a = true;
                    }
                    this.f433c.put(Integer.valueOf(aVarA.f434a), aVarA);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
