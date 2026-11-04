package a.a.a.i.j;

import a.a.a.i.i;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f362a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(i.c());
        String str = File.separator;
        sb.append(str);
        sb.append("locModel");
        sb.append(str);
        sb.append("traffic");
        sb.append(str);
        sb.append("Traffic_Recognition_Model.m");
        sb.toString();
        f362a = i.c() + str + "locModel" + str + "traffic" + str;
    }
}
