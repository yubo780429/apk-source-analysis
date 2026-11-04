package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class d extends AutoCompleteTextView implements b.b.c.g.p {
    private static final int[] d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f840c;

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.autoCompleteTextViewStyle);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        t0 t0VarA = t0.a(getContext(), attributeSet, d, i, 0);
        if (t0VarA.g(0)) {
            setDropDownBackgroundDrawable(t0VarA.b(0));
        }
        t0VarA.a();
        e eVar = new e(this);
        this.f839b = eVar;
        eVar.a(attributeSet, i);
        x xVar = new x(this);
        this.f840c = xVar;
        xVar.a(attributeSet, i);
        this.f840c.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f839b;
        if (eVar != null) {
            eVar.a();
        }
        x xVar = this.f840c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // b.b.c.g.p
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f839b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // b.b.c.g.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f839b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f839b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f839b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.widget.l.a(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.b.d.b.a.a.c(getContext(), i));
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f839b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f839b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        x xVar = this.f840c;
        if (xVar != null) {
            xVar.a(context, i);
        }
    }
}
