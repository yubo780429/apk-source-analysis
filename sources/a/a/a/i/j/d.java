package a.a.a.i.j;

import a.a.a.i.i;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f360a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("outdoor");
        String str = File.separator;
        sb.append(str);
        sb.append("poiData");
        f360a = i.c() + str + "locModel" + str + sb.toString() + str;
    }
}
