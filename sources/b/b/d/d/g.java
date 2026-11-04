package b.b.d.d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.c0;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f1169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f1170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f1171c;
    private Object d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f1172c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f1173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1174b;

        public a(Object obj, String str) {
            this.f1173a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1174b = cls.getMethod(str, f1172c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1174b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1174b.invoke(this.f1173a, menuItem)).booleanValue();
                }
                this.f1174b.invoke(this.f1173a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class b {
        b.b.c.g.c A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f1175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1177c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f1175a = menu;
            d();
        }

        private char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.f1171c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (g.this.f1171c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.a(), this.z));
            }
            boolean z2 = menuItem instanceof j;
            if (z2) {
            }
            if (this.r >= 2) {
                if (z2) {
                    ((j) menuItem).c(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).a(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.e, g.this.f1169a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            b.b.c.g.c cVar = this.A;
            if (cVar != null) {
                b.b.c.g.h.a(menuItem, cVar);
            }
            b.b.c.g.h.a(menuItem, this.B);
            b.b.c.g.h.b(menuItem, this.C);
            b.b.c.g.h.a(menuItem, this.n, this.o);
            b.b.c.g.h.b(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                b.b.c.g.h.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                b.b.c.g.h.a(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            a(this.f1175a.add(this.f1176b, this.i, this.j, this.k));
        }

        public void a(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f1171c.obtainStyledAttributes(attributeSet, b.b.d.a.j.MenuGroup);
            this.f1176b = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.MenuGroup_android_id, 0);
            this.f1177c = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuGroup_android_menuCategory, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuGroup_android_orderInCategory, 0);
            this.e = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuGroup_android_visible, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.f1175a.addSubMenu(this.f1176b, this.i, this.j, this.k);
            a(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f1171c.obtainStyledAttributes(attributeSet, b.b.d.a.j.MenuItem);
            this.i = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.MenuItem_android_id, 0);
            this.j = (typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_android_menuCategory, this.f1177c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = typedArrayObtainStyledAttributes.getText(b.b.d.a.j.MenuItem_android_title);
            this.l = typedArrayObtainStyledAttributes.getText(b.b.d.a.j.MenuItem_android_titleCondensed);
            this.m = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.MenuItem_android_icon, 0);
            this.n = a(typedArrayObtainStyledAttributes.getString(b.b.d.a.j.MenuItem_android_alphabeticShortcut));
            this.o = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(typedArrayObtainStyledAttributes.getString(b.b.d.a.j.MenuItem_android_numericShortcut));
            this.q = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_numericModifiers, 4096);
            this.r = typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.MenuItem_android_checkable) ? typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuItem_android_checkable, false) : this.e;
            this.s = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuItem_android_checked, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuItem_android_visible, this.f);
            this.u = typedArrayObtainStyledAttributes.getBoolean(b.b.d.a.j.MenuItem_android_enabled, this.g);
            this.v = typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_showAsAction, -1);
            this.z = typedArrayObtainStyledAttributes.getString(b.b.d.a.j.MenuItem_android_onClick);
            this.w = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.MenuItem_actionLayout, 0);
            this.x = typedArrayObtainStyledAttributes.getString(b.b.d.a.j.MenuItem_actionViewClass);
            String string = typedArrayObtainStyledAttributes.getString(b.b.d.a.j.MenuItem_actionProviderClass);
            this.y = string;
            boolean z = string != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (b.b.c.g.c) a(this.y, g.f, g.this.f1170b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = typedArrayObtainStyledAttributes.getText(b.b.d.a.j.MenuItem_contentDescription);
            this.C = typedArrayObtainStyledAttributes.getText(b.b.d.a.j.MenuItem_tooltipText);
            if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.MenuItem_iconTintMode)) {
                this.E = c0.a(typedArrayObtainStyledAttributes.getInt(b.b.d.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (typedArrayObtainStyledAttributes.hasValue(b.b.d.a.j.MenuItem_iconTint)) {
                this.D = typedArrayObtainStyledAttributes.getColorStateList(b.b.d.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.h = false;
        }

        public boolean c() {
            return this.h;
        }

        public void d() {
            this.f1176b = 0;
            this.f1177c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f1171c = context;
        Object[] objArr = {context};
        this.f1169a = objArr;
        this.f1170b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.d();
                    } else if (name2.equals("item")) {
                        if (!bVar.c()) {
                            b.b.c.g.c cVar = bVar.A;
                            if (cVar == null || !cVar.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.a(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.b(attributeSet);
                } else if (name3.equals("menu")) {
                    a(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object a() {
        if (this.d == null) {
            this.d = a(this.f1171c);
        }
        return this.d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof b.b.c.c.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f1171c.getResources().getLayout(i);
                    a(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
