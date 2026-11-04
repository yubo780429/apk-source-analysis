package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class f extends x implements android.arch.lifecycle.q, android.support.v4.app.a.b, android.support.v4.app.a.d {
    private android.arch.lifecycle.p e;
    boolean f;
    boolean g;
    boolean i;
    boolean j;
    boolean k;
    int l;
    b.b.c.f.l<String> m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f552c = new a();
    final h d = h.a(new b());
    boolean h = true;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
            } else {
                f.this.e();
                f.this.d.i();
            }
        }
    }

    class b extends i<f> {
        public b() {
            super(f.this);
        }

        @Override // android.support.v4.app.g
        public View a(int i) {
            return f.this.findViewById(i);
        }

        @Override // android.support.v4.app.i
        public void a(e eVar) {
            f.this.a(eVar);
        }

        @Override // android.support.v4.app.i
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            f.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.g
        public boolean a() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.support.v4.app.i
        public boolean b(e eVar) {
            return !f.this.isFinishing();
        }

        @Override // android.support.v4.app.i
        public LayoutInflater f() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        @Override // android.support.v4.app.i
        public int g() {
            Window window = f.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.i
        public boolean h() {
            return f.this.getWindow() != null;
        }

        @Override // android.support.v4.app.i
        public void i() {
            f.this.g();
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.arch.lifecycle.p f554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        l f555b;

        c() {
        }
    }

    private static boolean a(j jVar, android.arch.lifecycle.c.b bVar) {
        boolean zA = false;
        for (e eVar : jVar.a()) {
            if (eVar != null) {
                if (eVar.a().a().a(android.arch.lifecycle.c.b.STARTED)) {
                    eVar.T.a(bVar);
                    zA = true;
                }
                j jVarO = eVar.O();
                if (jVarO != null) {
                    zA |= a(jVarO, bVar);
                }
            }
        }
        return zA;
    }

    static void b(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void h() {
        while (a(d(), android.arch.lifecycle.c.b.CREATED)) {
        }
    }

    @Override // android.support.v4.app.x, android.arch.lifecycle.e
    public android.arch.lifecycle.c a() {
        return super.a();
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.d.a(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.a.d
    public final void a(int i) {
        if (this.i || i == -1) {
            return;
        }
        b(i);
    }

    public void a(e eVar) {
    }

    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.arch.lifecycle.q
    public android.arch.lifecycle.p b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.e == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.e = cVar.f554a;
            }
            if (this.e == null) {
                this.e = new android.arch.lifecycle.p();
            }
        }
        return this.e;
    }

    public j d() {
        return this.d.j();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f);
        printWriter.print(" mResumed=");
        printWriter.print(this.g);
        printWriter.print(" mStopped=");
        printWriter.print(this.h);
        if (getApplication() != null) {
            s.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.d.j().a(str, fileDescriptor, printWriter, strArr);
    }

    protected void e() {
        this.d.f();
    }

    public Object f() {
        return null;
    }

    @Deprecated
    public void g() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.d.k();
        int i3 = i >> 16;
        if (i3 == 0) {
            android.support.v4.app.a.c cVarA = android.support.v4.app.a.a();
            if (cVarA == null || !cVarA.a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String strB = this.m.b(i4);
        this.m.d(i4);
        if (strB == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        e eVarA = this.d.a(strB);
        if (eVarA != null) {
            eVarA.a(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strB);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        j jVarJ = this.d.j();
        boolean zB = jVarJ.b();
        if (!zB || Build.VERSION.SDK_INT > 25) {
            if (zB || !jVarJ.c()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.k();
        this.d.a(configuration);
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onCreate(Bundle bundle) {
        android.arch.lifecycle.p pVar;
        this.d.a((e) null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null && (pVar = cVar.f554a) != null && this.e == null) {
            this.e = pVar;
        }
        if (bundle != null) {
            this.d.a(bundle.getParcelable("android:support:fragments"), cVar != null ? cVar.f555b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.m = new b.b.c.f.l<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.m.c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.m == null) {
            this.m = new b.b.c.f.l<>();
            this.l = 0;
        }
        this.d.b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return this.d.a(menu, getMenuInflater()) | super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewA = a(view, str, context, attributeSet);
        return viewA == null ? super.onCreateView(view, str, context, attributeSet) : viewA;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewA = a(null, str, context, attributeSet);
        return viewA == null ? super.onCreateView(str, context, attributeSet) : viewA;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.e != null && !isChangingConfigurations()) {
            this.e.a();
        }
        this.d.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.d.d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.d.b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.d.a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.d.a(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.d.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.d.a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.g = false;
        if (this.f552c.hasMessages(2)) {
            this.f552c.removeMessages(2);
            e();
        }
        this.d.e();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.d.b(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f552c.removeMessages(2);
        e();
        this.d.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return this.d.b(menu) | a(view, menu);
    }

    @Override // android.app.Activity, android.support.v4.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.d.k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strB = this.m.b(i3);
            this.m.d(i3);
            if (strB == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            e eVarA = this.d.a(strB);
            if (eVarA != null) {
                eVarA.a(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strB);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f552c.sendEmptyMessage(2);
        this.g = true;
        this.d.i();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object objF = f();
        l lVarL = this.d.l();
        if (lVarL == null && this.e == null && objF == null) {
            return null;
        }
        c cVar = new c();
        cVar.f554a = this.e;
        cVar.f555b = lVarL;
        return cVar;
    }

    @Override // android.support.v4.app.x, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        h();
        Parcelable parcelableM = this.d.m();
        if (parcelableM != null) {
            bundle.putParcelable("android:support:fragments", parcelableM);
        }
        if (this.m.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] iArr = new int[this.m.b()];
            String[] strArr = new String[this.m.b()];
            for (int i = 0; i < this.m.b(); i++) {
                iArr[i] = this.m.c(i);
                strArr[i] = this.m.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.h = false;
        if (!this.f) {
            this.f = true;
            this.d.a();
        }
        this.d.k();
        this.d.i();
        this.d.g();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.d.k();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.h = true;
        h();
        this.d.h();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.k && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.k && i != -1) {
            b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.j && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.j && i != -1) {
            b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
