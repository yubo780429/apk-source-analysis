package b.b.d.d;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import b.b.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1158a;

    private a(Context context) {
        this.f1158a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1158a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int b() {
        return this.f1158a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.f1158a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int d() {
        return this.f1158a.getResources().getDimensionPixelSize(b.b.d.a.d.abc_action_bar_stacked_tab_max_width);
    }

    public int e() {
        TypedArray typedArrayObtainStyledAttributes = this.f1158a.obtainStyledAttributes(null, j.ActionBar, b.b.d.a.a.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = this.f1158a.getResources();
        if (!f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(b.b.d.a.d.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean f() {
        return this.f1158a.getResources().getBoolean(b.b.d.a.b.abc_action_bar_embed_tabs);
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f1158a).hasPermanentMenuKey();
    }
}
