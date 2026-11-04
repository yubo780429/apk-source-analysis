package android.support.constraint;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c {
    private boolean j;
    private boolean k;

    public void a(android.support.constraint.n.k.k kVar, int i, int i2) {
    }

    @Override // android.support.constraint.c
    protected void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.ConstraintLayout_Layout_android_visibility) {
                    this.j = true;
                } else if (index == k.ConstraintLayout_Layout_android_elevation) {
                    this.k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.support.constraint.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.j || this.k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f422c; i++) {
                View viewA = constraintLayout.a(this.f421b[i]);
                if (viewA != null) {
                    if (this.j) {
                        viewA.setVisibility(visibility);
                    }
                    if (this.k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        a();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        a();
    }
}
