package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static j h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, b.b.c.f.l<ColorStateList>> f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b.b.c.f.a<String, d> f874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.b.c.f.l<String> f875c;
    private final WeakHashMap<Context, b.b.c.f.f<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    private static final c i = new c(6);
    private static final int[] j = {b.b.d.a.e.abc_textfield_search_default_mtrl_alpha, b.b.d.a.e.abc_textfield_default_mtrl_alpha, b.b.d.a.e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] k = {b.b.d.a.e.abc_ic_commit_search_api_mtrl_alpha, b.b.d.a.e.abc_seekbar_tick_mark_material, b.b.d.a.e.abc_ic_menu_share_mtrl_alpha, b.b.d.a.e.abc_ic_menu_copy_mtrl_am_alpha, b.b.d.a.e.abc_ic_menu_cut_mtrl_alpha, b.b.d.a.e.abc_ic_menu_selectall_mtrl_alpha, b.b.d.a.e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] l = {b.b.d.a.e.abc_textfield_activated_mtrl_alpha, b.b.d.a.e.abc_textfield_search_activated_mtrl_alpha, b.b.d.a.e.abc_cab_background_top_mtrl_alpha, b.b.d.a.e.abc_text_cursor_material, b.b.d.a.e.abc_text_select_handle_left_mtrl_dark, b.b.d.a.e.abc_text_select_handle_middle_mtrl_dark, b.b.d.a.e.abc_text_select_handle_right_mtrl_dark, b.b.d.a.e.abc_text_select_handle_left_mtrl_light, b.b.d.a.e.abc_text_select_handle_middle_mtrl_light, b.b.d.a.e.abc_text_select_handle_right_mtrl_light};
    private static final int[] m = {b.b.d.a.e.abc_popup_background_mtrl_mult, b.b.d.a.e.abc_cab_background_internal_bg, b.b.d.a.e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] n = {b.b.d.a.e.abc_tab_indicator_material, b.b.d.a.e.abc_textfield_search_material};
    private static final int[] o = {b.b.d.a.e.abc_btn_check_material, b.b.d.a.e.abc_btn_radio_material};

    static class a implements d {
        a() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.b.d.c.a.a.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    private static class b implements d {
        b() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.b.b.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private static class c extends b.b.c.f.g<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return b(Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return a(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }
    }

    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    private static class e implements d {
        e() {
        }

        @Override // android.support.v7.widget.j.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.b.b.a.i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    static PorterDuff.Mode a(int i2) {
        if (i2 == b.b.d.a.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterA;
        porterDuffColorFilterA = i.a(i2, mode);
        if (porterDuffColorFilterA == null) {
            porterDuffColorFilterA = new PorterDuffColorFilter(i2, mode);
            i.a(i2, mode, porterDuffColorFilterA);
        }
        return porterDuffColorFilterA;
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable drawableFindDrawableByLayerId;
        int i3;
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableG = android.support.v4.graphics.drawable.a.g(drawable);
            android.support.v4.graphics.drawable.a.a(drawableG, colorStateListB);
            PorterDuff.Mode modeA = a(i2);
            if (modeA == null) {
                return drawableG;
            }
            android.support.v4.graphics.drawable.a.a(drawableG, modeA);
            return drawableG;
        }
        if (i2 == b.b.d.a.e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), o0.b(context, b.b.d.a.a.colorControlNormal), g);
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i3 = b.b.d.a.a.colorControlNormal;
        } else {
            if (i2 != b.b.d.a.e.abc_ratingbar_material && i2 != b.b.d.a.e.abc_ratingbar_indicator_material && i2 != b.b.d.a.e.abc_ratingbar_small_material) {
                if (a(context, i2, drawable) || !z) {
                    return drawable;
                }
                return null;
            }
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), o0.a(context, b.b.d.a.a.colorControlNormal), g);
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
            i3 = b.b.d.a.a.colorControlActivated;
        }
        a(drawableFindDrawableByLayerId, o0.b(context, i3), g);
        a(layerDrawable.findDrawableByLayerId(R.id.progress), o0.b(context, b.b.d.a.a.colorControlActivated), g);
        return drawable;
    }

    private synchronized Drawable a(Context context, long j2) {
        b.b.c.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceB = fVar.b(j2);
        if (weakReferenceB != null) {
            Drawable.ConstantState constantState = weakReferenceB.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.a(j2);
        }
        return null;
    }

    public static synchronized j a() {
        if (h == null) {
            j jVar = new j();
            h = jVar;
            a(jVar);
        }
        return h;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.f873a == null) {
            this.f873a = new WeakHashMap<>();
        }
        b.b.c.f.l<ColorStateList> lVar = this.f873a.get(context);
        if (lVar == null) {
            lVar = new b.b.c.f.l<>();
            this.f873a.put(context, lVar);
        }
        lVar.a(i2, colorStateList);
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = g;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    static void a(Drawable drawable, r0 r0Var, int[] iArr) {
        if (c0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (r0Var.d || r0Var.f915c) {
            drawable.setColorFilter(a(r0Var.d ? r0Var.f913a : null, r0Var.f915c ? r0Var.f914b : g, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    private static void a(j jVar) {
        if (Build.VERSION.SDK_INT < 24) {
            jVar.a("vector", new e());
            jVar.a("animated-vector", new b());
            jVar.a("animated-selector", new a());
        }
    }

    private void a(String str, d dVar) {
        if (this.f874b == null) {
            this.f874b = new b.b.c.f.a<>();
        }
        this.f874b.put(str, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f A[RETURN] */
    static boolean a(Context context, int i2, Drawable drawable) {
        int iRound;
        boolean z;
        PorterDuff.Mode mode = g;
        boolean zA = a(j, i2);
        int i3 = R.attr.colorBackground;
        if (zA) {
            i3 = b.b.d.a.a.colorControlNormal;
        } else if (a(l, i2)) {
            i3 = b.b.d.a.a.colorControlActivated;
        } else {
            if (!a(m, i2)) {
                if (i2 == b.b.d.a.e.abc_list_divider_mtrl_alpha) {
                    i3 = R.attr.colorForeground;
                    iRound = Math.round(40.8f);
                    z = true;
                } else if (i2 != b.b.d.a.e.abc_dialog_material_background) {
                    iRound = -1;
                    z = false;
                    i3 = 0;
                }
                if (z) {
                    return false;
                }
                if (c0.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(a(o0.b(context, i3), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
        }
        iRound = -1;
        z = true;
        if (z) {
            return false;
        }
        if (c0.a(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(o0.b(context, i3), mode));
        if (iRound != -1) {
            drawable.setAlpha(iRound);
        }
        return true;
    }

    private synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            b.b.c.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
            if (fVar == null) {
                fVar = new b.b.c.f.f<>();
                this.d.put(context, fVar);
            }
            fVar.c(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof b.b.b.a.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void b(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableA = a(context, b.b.d.a.e.abc_vector_test);
        if (drawableA == null || !a(drawableA)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList c(Context context) {
        return c(context, 0);
    }

    private ColorStateList c(Context context, int i2) {
        int iB = o0.b(context, b.b.d.a.a.colorControlHighlight);
        return new ColorStateList(new int[][]{o0.f901b, o0.d, o0.f902c, o0.f}, new int[]{o0.a(context, b.b.d.a.a.colorButtonNormal), b.b.c.b.a.b(iB, i2), b.b.c.b.a.b(iB, i2), i2});
    }

    private ColorStateList d(Context context) {
        return c(context, o0.b(context, b.b.d.a.a.colorAccent));
    }

    private Drawable d(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        if (i2 == b.b.d.a.e.abc_cab_background_top_material) {
            drawableA = new LayerDrawable(new Drawable[]{a(context, b.b.d.a.e.abc_cab_background_internal_bg), a(context, b.b.d.a.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jA, drawableA);
        }
        return drawableA;
    }

    private ColorStateList e(Context context) {
        return c(context, o0.b(context, b.b.d.a.a.colorButtonNormal));
    }

    private ColorStateList e(Context context, int i2) {
        b.b.c.f.l<ColorStateList> lVar;
        WeakHashMap<Context, b.b.c.f.l<ColorStateList>> weakHashMap = this.f873a;
        if (weakHashMap == null || (lVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return lVar.b(i2);
    }

    private ColorStateList f(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListC = o0.c(context, b.b.d.a.a.colorSwitchThumbNormal);
        if (colorStateListC == null || !colorStateListC.isStateful()) {
            iArr[0] = o0.f901b;
            iArr2[0] = o0.a(context, b.b.d.a.a.colorSwitchThumbNormal);
            iArr[1] = o0.e;
            iArr2[1] = o0.b(context, b.b.d.a.a.colorControlActivated);
            iArr[2] = o0.f;
            iArr2[2] = o0.b(context, b.b.d.a.a.colorSwitchThumbNormal);
        } else {
            iArr[0] = o0.f901b;
            iArr2[0] = colorStateListC.getColorForState(iArr[0], 0);
            iArr[1] = o0.e;
            iArr2[1] = o0.b(context, b.b.d.a.a.colorControlActivated);
            iArr[2] = o0.f;
            iArr2[2] = colorStateListC.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private Drawable f(Context context, int i2) {
        int next;
        b.b.c.f.a<String, d> aVar = this.f874b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        b.b.c.f.l<String> lVar = this.f875c;
        if (lVar != null) {
            String strB = lVar.b(i2);
            if ("appcompat_skip_skip".equals(strB) || (strB != null && this.f874b.get(strB) == null)) {
                return null;
            }
        } else {
            this.f875c = new b.b.c.f.l<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f875c.a(i2, name);
                d dVar = this.f874b.get(name);
                if (dVar != null) {
                    drawableA = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableA != null) {
                    drawableA.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jA, drawableA);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (drawableA == null) {
            this.f875c.a(i2, "appcompat_skip_skip");
        }
        return drawableA;
    }

    public synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable drawableF;
        b(context);
        drawableF = f(context, i2);
        if (drawableF == null) {
            drawableF = d(context, i2);
        }
        if (drawableF == null) {
            drawableF = b.b.c.a.a.b(context, i2);
        }
        if (drawableF != null) {
            drawableF = a(context, i2, z, drawableF);
        }
        if (drawableF != null) {
            c0.b(drawableF);
        }
        return drawableF;
    }

    synchronized Drawable a(Context context, y0 y0Var, int i2) {
        Drawable drawableF = f(context, i2);
        if (drawableF == null) {
            drawableF = y0Var.a(i2);
        }
        if (drawableF == null) {
            return null;
        }
        return a(context, i2, false, drawableF);
    }

    public synchronized void a(Context context) {
        b.b.c.f.f<WeakReference<Drawable.ConstantState>> fVar = this.d.get(context);
        if (fVar != null) {
            fVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0078 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x000d, B:43:0x0078, B:9:0x0013, B:11:0x0017, B:12:0x001a, B:14:0x001e, B:15:0x0023, B:17:0x0027, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:23:0x0039, B:24:0x003e, B:26:0x0042, B:29:0x0047, B:31:0x004f, B:32:0x0056, B:34:0x005e, B:35:0x0061, B:37:0x0069, B:38:0x006c, B:40:0x0070, B:41:0x0073), top: B:49:0x0001 }] */
    synchronized ColorStateList b(Context context, int i2) {
        ColorStateList colorStateListE;
        int i3;
        colorStateListE = e(context, i2);
        if (colorStateListE == null) {
            if (i2 == b.b.d.a.e.abc_edit_text_material) {
                i3 = b.b.d.a.c.abc_tint_edittext;
            } else if (i2 == b.b.d.a.e.abc_switch_track_mtrl_alpha) {
                i3 = b.b.d.a.c.abc_tint_switch_track;
            } else {
                if (i2 == b.b.d.a.e.abc_switch_thumb_material) {
                    colorStateListE = f(context);
                } else if (i2 == b.b.d.a.e.abc_btn_default_mtrl_shape) {
                    colorStateListE = e(context);
                } else if (i2 == b.b.d.a.e.abc_btn_borderless_material) {
                    colorStateListE = c(context);
                } else if (i2 == b.b.d.a.e.abc_btn_colored_material) {
                    colorStateListE = d(context);
                } else if (i2 == b.b.d.a.e.abc_spinner_mtrl_am_alpha || i2 == b.b.d.a.e.abc_spinner_textfield_background_material) {
                    i3 = b.b.d.a.c.abc_tint_spinner;
                } else if (a(k, i2)) {
                    colorStateListE = o0.c(context, b.b.d.a.a.colorControlNormal);
                } else if (a(n, i2)) {
                    i3 = b.b.d.a.c.abc_tint_default;
                } else if (a(o, i2)) {
                    i3 = b.b.d.a.c.abc_tint_btn_checkable;
                } else if (i2 == b.b.d.a.e.abc_seekbar_thumb_material) {
                    i3 = b.b.d.a.c.abc_tint_seek_thumb;
                }
                if (colorStateListE != null) {
                    a(context, i2, colorStateListE);
                }
            }
            colorStateListE = b.b.d.b.a.a.b(context, i3);
            if (colorStateListE != null) {
                a(context, i2, colorStateListE);
            }
        }
        return colorStateListE;
    }
}
