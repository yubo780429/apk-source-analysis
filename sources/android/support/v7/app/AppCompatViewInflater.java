package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.m;
import android.support.v7.widget.o;
import android.support.v7.widget.p;
import android.support.v7.widget.q0;
import android.support.v7.widget.s;
import android.support.v7.widget.t;
import android.support.v7.widget.u;
import android.support.v7.widget.w;
import android.support.v7.widget.y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import b.b.c.g.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f684b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f685c = {R.attr.onClick};
    private static final String[] d = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> e = new b.b.c.f.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f686a = new Object[2];

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f688c;
        private Method d;
        private Context e;

        public a(View view, String str) {
            this.f687b = view;
            this.f688c = str;
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f688c, View.class)) != null) {
                        this.d = method;
                        this.e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f687b.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f687b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f688c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f687b.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.d == null) {
                a(this.f687b.getContext(), this.f688c);
            }
            try {
                this.d.invoke(this.e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private static Context a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.d.a.j.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b.b.d.a.j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof b.b.d.d.d) && ((b.b.d.d.d) context).a() == resourceId) ? context : new b.b.d.d.d(context, resourceId);
        }
        return context;
    }

    private View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = e.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f684b);
                e.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f686a);
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || q.h(view)) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f685c);
                String string = typedArrayObtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private void a(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    private View b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f686a[0] = context;
            this.f686a[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return a(context, str, (String) null);
            }
            for (int i = 0; i < d.length; i++) {
                View viewA = a(context, str, d[i]);
                if (viewA != null) {
                    return viewA;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr = this.f686a;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    protected android.support.v7.widget.d a(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.d(context, attributeSet);
    }

    protected View a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewM;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = q0.b(context2);
        }
        switch (str) {
            case "TextView":
                viewM = m(context2, attributeSet);
                a(viewM, str);
                break;
            case "ImageView":
                viewM = g(context2, attributeSet);
                a(viewM, str);
                break;
            case "Button":
                viewM = b(context2, attributeSet);
                a(viewM, str);
                break;
            case "EditText":
                viewM = e(context2, attributeSet);
                a(viewM, str);
                break;
            case "Spinner":
                viewM = l(context2, attributeSet);
                a(viewM, str);
                break;
            case "ImageButton":
                viewM = f(context2, attributeSet);
                a(viewM, str);
                break;
            case "CheckBox":
                viewM = c(context2, attributeSet);
                a(viewM, str);
                break;
            case "RadioButton":
                viewM = i(context2, attributeSet);
                a(viewM, str);
                break;
            case "CheckedTextView":
                viewM = d(context2, attributeSet);
                a(viewM, str);
                break;
            case "AutoCompleteTextView":
                viewM = a(context2, attributeSet);
                a(viewM, str);
                break;
            case "MultiAutoCompleteTextView":
                viewM = h(context2, attributeSet);
                a(viewM, str);
                break;
            case "RatingBar":
                viewM = j(context2, attributeSet);
                a(viewM, str);
                break;
            case "SeekBar":
                viewM = k(context2, attributeSet);
                a(viewM, str);
                break;
            default:
                viewM = a(context2, str, attributeSet);
                break;
        }
        if (viewM == null && context != context2) {
            viewM = b(context2, str, attributeSet);
        }
        if (viewM != null) {
            a(viewM, attributeSet);
        }
        return viewM;
    }

    protected android.support.v7.widget.f b(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.f(context, attributeSet);
    }

    protected android.support.v7.widget.g c(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.g(context, attributeSet);
    }

    protected android.support.v7.widget.h d(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.h(context, attributeSet);
    }

    protected android.support.v7.widget.k e(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.k(context, attributeSet);
    }

    protected m f(Context context, AttributeSet attributeSet) {
        return new m(context, attributeSet);
    }

    protected o g(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected p h(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected s i(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t j(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected u k(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected w l(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected y m(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }
}
