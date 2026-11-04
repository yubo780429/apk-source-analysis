package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    private int j;
    private int k;
    private android.support.constraint.n.k.a l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    private void a(android.support.constraint.n.k.e eVar, int i, boolean z) {
        this.k = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 0;
            } else if (i2 == 6) {
                this.k = 1;
            }
        } else {
            int i3 = this.j;
            if (z) {
                if (i3 == 5) {
                    this.k = 1;
                } else if (i3 == 6) {
                    this.k = 0;
                }
            } else if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (eVar instanceof android.support.constraint.n.k.a) {
            ((android.support.constraint.n.k.a) eVar).x(this.k);
        }
    }

    @Override // android.support.constraint.c
    public void a(android.support.constraint.n.k.e eVar, boolean z) {
        a(eVar, this.j, z);
    }

    @Override // android.support.constraint.c
    protected void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.l = new android.support.constraint.n.k.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == k.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.l.e(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.ConstraintLayout_Layout_barrierMargin) {
                    this.l.y(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.e = this.l;
        b();
    }

    public boolean c() {
        return this.l.S();
    }

    public int getMargin() {
        return this.l.U();
    }

    public int getType() {
        return this.j;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.e(z);
    }

    public void setDpMargin(int i) {
        this.l.y((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.y(i);
    }

    public void setType(int i) {
        this.j = i;
    }
}
