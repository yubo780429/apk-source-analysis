package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class o extends ImageView implements b.b.c.g.p, android.support.v4.widget.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f899c;

    public o(Context context) {
        this(context, null);
    }

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        super(q0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f898b = eVar;
        eVar.a(attributeSet, i);
        n nVar = new n(this);
        this.f899c = nVar;
        nVar.a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f898b;
        if (eVar != null) {
            eVar.a();
        }
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // b.b.c.g.p
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f898b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // b.b.c.g.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f898b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.support.v4.widget.n
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f899c;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    @Override // android.support.v4.widget.n
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f899c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f899c.d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f898b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f898b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f898b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // b.b.c.g.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f898b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.support.v4.widget.n
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.n
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f899c;
        if (nVar != null) {
            nVar.a(mode);
        }
    }
}
