package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: classes.dex */
public class s extends RadioButton implements android.support.v4.widget.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f917c;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.radioButtonStyle);
    }

    public s(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        i iVar = new i(this);
        this.f916b = iVar;
        iVar.a(attributeSet, i);
        x xVar = new x(this);
        this.f917c = xVar;
        xVar.a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f916b;
        return iVar != null ? iVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f916b;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f916b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(b.b.d.b.a.a.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f916b;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f916b;
        if (iVar != null) {
            iVar.a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f916b;
        if (iVar != null) {
            iVar.a(mode);
        }
    }
}
