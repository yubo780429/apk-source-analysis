package b.b.c.a.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static abstract class a {

        /* JADX INFO: renamed from: b.b.c.a.d.f$a$a, reason: collision with other inner class name */
        class RunnableC0040a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Typeface f1020b;

            RunnableC0040a(Typeface typeface) {
                this.f1020b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f1020b);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1022b;

            b(int i) {
                this.f1022b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a(this.f1022b);
            }
        }

        public abstract void a(int i);

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public abstract void a(Typeface typeface);

        public final void a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0040a(typeface));
        }
    }

    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return a(context, i, typedValue, i2, aVar, null, true);
    }

    private static Typeface a(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceA = a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (typefaceA != null || aVar != null) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int i, int i2, a aVar, Handler handler, boolean z) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
        Typeface typefaceB = b.b.c.b.c.b(resources, i, i2);
        if (typefaceB != null) {
            if (aVar != null) {
                aVar.a(typefaceB, handler);
            }
            return typefaceB;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceA = b.b.c.b.c.a(context, resources, i, string, i2);
                if (aVar != null) {
                    if (typefaceA != null) {
                        aVar.a(typefaceA, handler);
                    } else {
                        aVar.a(-3, handler);
                    }
                }
                return typefaceA;
            }
            c.a aVarA = c.a(resources.getXml(i), resources);
            if (aVarA != null) {
                return b.b.c.b.c.a(context, aVarA, resources, i, i2, aVar, handler, z);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (IOException e) {
            e = e;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
    }

    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
