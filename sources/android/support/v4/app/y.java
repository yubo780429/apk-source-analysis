package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterable<Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f622b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f623c;

    public interface a {
        Intent c();
    }

    private y(Context context) {
        this.f623c = context;
    }

    public static y a(Context context) {
        return new y(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y a(Activity activity) {
        Intent intentC = activity instanceof a ? ((a) activity).c() : null;
        if (intentC == null) {
            intentC = t.a(activity);
        }
        if (intentC != null) {
            ComponentName component = intentC.getComponent();
            if (component == null) {
                component = intentC.resolveActivity(this.f623c.getPackageManager());
            }
            a(component);
            a(intentC);
        }
        return this;
    }

    public y a(ComponentName componentName) {
        int size = this.f622b.size();
        try {
            Context context = this.f623c;
            while (true) {
                Intent intentA = t.a(context, componentName);
                if (intentA == null) {
                    return this;
                }
                this.f622b.add(size, intentA);
                context = this.f623c;
                componentName = intentA.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public y a(Intent intent) {
        this.f622b.add(intent);
        return this;
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (this.f622b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f622b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b.b.c.a.a.a(this.f623c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f623c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f622b.iterator();
    }
}
