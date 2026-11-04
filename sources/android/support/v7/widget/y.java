package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class y extends TextView implements b.b.c.g.p, android.support.v4.widget.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f953c;
    private Future<b.b.c.e.a> d;

    public y(Context context) {
        this(context, null);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public y(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f952b = eVar;
        eVar.a(attributeSet, i);
        x xVar = new x(this);
        this.f953c = xVar;
        xVar.a(attributeSet, i);
        this.f953c.a();
    }

    private void d() {
        Future<b.b.c.e.a> future = this.d;
        if (future != null) {
            try {
                this.d = null;
                android.support.v4.widget.l.a(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f952b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f953c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f953c;
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
        x xVar = this.f953c;
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
        x xVar = this.f953c;
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
        x xVar = this.f953c;
        return xVar != null ? xVar.f() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (android.support.v4.widget.b.f644a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f953c;
        if (xVar != null) {
            return xVar.g();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return android.support.v4.widget.l.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return android.support.v4.widget.l.b(this);
    }

    @Override // b.b.c.g.p
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f952b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // b.b.c.g.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f952b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    public b.b.c.e.a.C0044a getTextMetricsParamsCompat() {
        return android.support.v4.widget.l.d(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x xVar = this.f953c;
        if (xVar != null) {
            xVar.a(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        x xVar = this.f953c;
        if (xVar == null || android.support.v4.widget.b.f644a || !xVar.h()) {
            return;
        }
        this.f953c.b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (android.support.v4.widget.b.f644a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        x xVar = this.f953c;
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
        x xVar = this.f953c;
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
        x xVar = this.f953c;
        if (xVar != null) {
            xVar.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f952b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f952b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.a(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            android.support.v4.widget.l.a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            android.support.v4.widget.l.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        android.support.v4.widget.l.c(this, i);
    }

    public void setPrecomputedText(b.b.c.e.a aVar) {
        android.support.v4.widget.l.a(this, aVar);
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f952b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f952b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x xVar = this.f953c;
        if (xVar != null) {
            xVar.a(context, i);
        }
    }

    public void setTextFuture(Future<b.b.c.e.a> future) {
        this.d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(b.b.c.e.a.C0044a c0044a) {
        android.support.v4.widget.l.a(this, c0044a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (android.support.v4.widget.b.f644a) {
            super.setTextSize(i, f);
            return;
        }
        x xVar = this.f953c;
        if (xVar != null) {
            xVar.a(i, f);
        }
    }
}
