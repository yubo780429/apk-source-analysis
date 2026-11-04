package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public class b extends g implements DialogInterface {
    final AlertController d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.f f690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f691b;

        public a(Context context) {
            this(context, b.a(context, 0));
        }

        public a(Context context, int i) {
            this.f690a = new AlertController.f(new ContextThemeWrapper(context, b.a(context, i)));
            this.f691b = i;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.f690a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.f690a.d = drawable;
            return this;
        }

        public a a(View view) {
            this.f690a.g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f690a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.f690a.f = charSequence;
            return this;
        }

        public b a() {
            b bVar = new b(this.f690a.f672a, this.f691b);
            this.f690a.a(bVar.d);
            bVar.setCancelable(this.f690a.r);
            if (this.f690a.r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f690a.s);
            bVar.setOnDismissListener(this.f690a.t);
            DialogInterface.OnKeyListener onKeyListener = this.f690a.u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f690a.f672a;
        }
    }

    protected b(Context context, int i) {
        super(context, a(context, i));
        this.d = new AlertController(getContext(), this, getWindow());
    }

    static int a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.b.d.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.d.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.d.b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.support.v7.app.g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.d.b(charSequence);
    }
}
