package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckBox implements android.support.v4.widget.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f854b;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.checkboxStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        i iVar = new i(this);
        this.f854b = iVar;
        iVar.a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f854b;
        return iVar != null ? iVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f854b;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f854b;
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
        i iVar = this.f854b;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f854b;
        if (iVar != null) {
            iVar.a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f854b;
        if (iVar != null) {
            iVar.a(mode);
        }
    }
}
