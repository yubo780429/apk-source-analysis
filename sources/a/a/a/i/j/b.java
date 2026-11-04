package a.a.a.i.j;

import a.a.a.i.i;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f358a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("indoor");
        String str = File.separator;
        sb.append(str);
        sb.append("poiData");
        f358a = i.c() + str + "locModel" + str + sb.toString() + str;
    }
}
