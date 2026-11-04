package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f624a = aVar.a(iconCompat.f624a, 1);
        iconCompat.f626c = aVar.a(iconCompat.f626c, 2);
        iconCompat.d = aVar.a(iconCompat.d, 3);
        iconCompat.e = aVar.a(iconCompat.e, 4);
        iconCompat.f = aVar.a(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.a(iconCompat.g, 6);
        iconCompat.i = aVar.a(iconCompat.i, 7);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.a(true, true);
        iconCompat.a(aVar.c());
        aVar.b(iconCompat.f624a, 1);
        aVar.b(iconCompat.f626c, 2);
        aVar.b(iconCompat.d, 3);
        aVar.b(iconCompat.e, 4);
        aVar.b(iconCompat.f, 5);
        aVar.b(iconCompat.g, 6);
        aVar.b(iconCompat.i, 7);
    }
}
