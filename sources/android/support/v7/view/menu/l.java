package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class l extends k {

    class a extends k.a implements ActionProvider.VisibilityListener {
        b.b.c.g.c.b d;

        public a(l lVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // b.b.c.g.c
        public View a(MenuItem menuItem) {
            return this.f772b.onCreateActionView(menuItem);
        }

        @Override // b.b.c.g.c
        public void a(b.b.c.g.c.b bVar) {
            this.d = bVar;
            ActionProvider actionProvider = this.f772b;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // b.b.c.g.c
        public boolean b() {
            return this.f772b.isVisible();
        }

        @Override // b.b.c.g.c
        public boolean e() {
            return this.f772b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            b.b.c.g.c.b bVar = this.d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    l(Context context, b.b.c.c.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.support.v7.view.menu.k
    k.a a(ActionProvider actionProvider) {
        return new a(this, this.f745b, actionProvider);
    }
}
