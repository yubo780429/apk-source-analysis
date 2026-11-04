package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f795b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0 t0VarA = t0.a(context, attributeSet, f795b);
        setBackgroundDrawable(t0VarA.b(0));
        t0VarA.a();
    }
}
