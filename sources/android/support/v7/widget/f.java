package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class f extends Button implements b.b.c.g.p, android.support.v4.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f849c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f848b = eVar;
        eVar.a(attributeSet, i);
        x xVar = new x(this);
        this.f849c = xVar;
        xVar.a(attributeSet, i);
        this.f849c.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f848b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f849c;
        if (xVar != null) {
            return xVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f849c;
        if (xVar != null) {
            return xVar.d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f849c;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f849c;
        return xVar != null ? xVar.f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f849c;
        if (xVar != null) {
            return xVar.g();
        }
        return 0;
    }

    @Override // b.b.c.g.p
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f848b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // b.b.c.g.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f848b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        x xVar = this.f849c;
        if (xVar == null || android.support.v4.widget.b.f644a || !xVar.h()) {
            return;
        }
        this.f849c.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (android.support.v4.widget.b.f644a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (android.support.v4.widget.b.f644a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (android.support.v4.widget.b.f644a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f848b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f848b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.a(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(z);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f848b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f848b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (android.support.v4.widget.b.f644a) {
            super.setTextSize(i, f);
            return;
        }
        x xVar = this.f849c;
        if (xVar != null) {
            xVar.a(i, f);
        }
    }
}
