package a.a.a.i.j;

import a.a.a.i.i;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f359a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(i.c());
        String str = File.separator;
        sb.append(str);
        sb.append("locModel");
        sb.append(str);
        sb.append("vdrModel");
        sb.append(str);
        sb.append("mobilenet_opt.nb");
        sb.toString();
        f359a = i.c() + str + "locModel" + str + "vdrModel" + str;
    }
}
