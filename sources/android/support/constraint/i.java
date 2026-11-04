package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f451c;
    private int d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f451c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f451c.getLayoutParams();
        bVar2.m0.s(0);
        if (bVar.m0.n() != android.support.constraint.n.k.e.b.FIXED) {
            bVar.m0.t(bVar2.m0.C());
        }
        if (bVar.m0.z() != android.support.constraint.n.k.e.b.FIXED) {
            bVar.m0.l(bVar2.m0.k());
        }
        bVar2.m0.s(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f450b == -1 && !isInEditMode()) {
            setVisibility(this.d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f450b);
        this.f451c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).a0 = true;
            this.f451c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f451c;
    }

    public int getEmptyVisibility() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f450b == i) {
            return;
        }
        View view = this.f451c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f451c.getLayoutParams()).a0 = false;
            this.f451c = null;
        }
        this.f450b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.d = i;
    }
}
