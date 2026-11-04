package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, o.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.support.v7.app.b f767c;
    f d;
    private o.a e;

    public i(h hVar) {
        this.f766b = hVar;
    }

    public void a() {
        android.support.v7.app.b bVar = this.f767c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        h hVar = this.f766b;
        android.support.v7.app.b.a aVar = new android.support.v7.app.b.a(hVar.e());
        f fVar = new f(aVar.b(), b.b.d.a.g.abc_list_menu_item_layout);
        this.d = fVar;
        fVar.a(this);
        this.f766b.a(this.d);
        aVar.a(this.d.a(), this);
        View viewI = hVar.i();
        if (viewI != null) {
            aVar.a(viewI);
        } else {
            aVar.a(hVar.g());
            aVar.a(hVar.h());
        }
        aVar.a(this);
        android.support.v7.app.b bVarA = aVar.a();
        this.f767c = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f767c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f767c.show();
    }

    @Override // android.support.v7.view.menu.o.a
    public void a(h hVar, boolean z) {
        if (z || hVar == this.f766b) {
            a();
        }
        o.a aVar = this.e;
        if (aVar != null) {
            aVar.a(hVar, z);
        }
    }

    @Override // android.support.v7.view.menu.o.a
    public boolean a(h hVar) {
        o.a aVar = this.e;
        if (aVar != null) {
            return aVar.a(hVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f766b.a((j) this.d.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.d.a(this.f766b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f767c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f767c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f766b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f766b.performShortcut(i, keyEvent, 0);
    }
}
