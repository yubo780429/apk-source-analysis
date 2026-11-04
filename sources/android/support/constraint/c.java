package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f422c;
    protected Context d;
    protected android.support.constraint.n.k.h e;
    protected boolean f;
    protected String g;
    protected String h;
    private HashMap<Integer, String> i;

    public c(Context context) {
        super(context);
        this.f421b = new int[32];
        this.f = false;
        this.i = new HashMap<>();
        this.d = context;
        a((AttributeSet) null);
    }

    private int a(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void a(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f422c + 1;
        int[] iArr = this.f421b;
        if (i2 > iArr.length) {
            this.f421b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f421b;
        int i3 = this.f422c;
        iArr2[i3] = i;
        this.f422c = i3 + 1;
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iC = c(strTrim);
        if (iC != 0) {
            this.i.put(Integer.valueOf(iC), strTrim);
            a(iC);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    a(childAt.getId());
                }
            }
        }
    }

    private int c(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iA = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objA = constraintLayout.a(0, str);
            if (objA instanceof Integer) {
                iA = ((Integer) objA).intValue();
            }
        }
        if (iA == 0 && constraintLayout != null) {
            iA = a(constraintLayout, str);
        }
        if (iA == 0) {
            try {
                iA = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iA == 0 ? this.d.getResources().getIdentifier(str, "id", this.d.getPackageName()) : iA;
    }

    protected void a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        a((ConstraintLayout) parent);
    }

    protected void a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f422c; i++) {
            View viewA = constraintLayout.a(this.f421b[i]);
            if (viewA != null) {
                viewA.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void a(android.support.constraint.n.k.e eVar, boolean z) {
    }

    protected void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == k.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                } else if (index == k.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).m0 = (android.support.constraint.n.k.e) this.e;
        }
    }

    public void b(ConstraintLayout constraintLayout) {
    }

    public void c(ConstraintLayout constraintLayout) {
    }

    public void d(ConstraintLayout constraintLayout) {
    }

    public void e(ConstraintLayout constraintLayout) {
        String str;
        int iA;
        if (isInEditMode()) {
            setIds(this.g);
        }
        android.support.constraint.n.k.h hVar = this.e;
        if (hVar == null) {
            return;
        }
        hVar.a();
        for (int i = 0; i < this.f422c; i++) {
            int i2 = this.f421b[i];
            View viewA = constraintLayout.a(i2);
            if (viewA == null && (iA = a(constraintLayout, (str = this.i.get(Integer.valueOf(i2))))) != 0) {
                this.f421b[i] = iA;
                this.i.put(Integer.valueOf(iA), str);
                viewA = constraintLayout.a(iA);
            }
            if (viewA != null) {
                this.e.a(constraintLayout.a(viewA));
            }
        }
        this.e.a(constraintLayout.d);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f421b, this.f422c);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f422c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f422c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.g = null;
        this.f422c = 0;
        for (int i : iArr) {
            a(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.g == null) {
            a(i);
        }
    }
}
