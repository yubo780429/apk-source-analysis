package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class t extends RatingBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f919b;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.ratingBarStyle);
    }

    public t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        r rVar = new r(this);
        this.f919b = rVar;
        rVar.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmapA = this.f919b.a();
        if (bitmapA != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapA.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
