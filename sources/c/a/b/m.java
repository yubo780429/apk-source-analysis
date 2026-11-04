package c.a.b;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import c.a.b.e.a.g;
import c.a.b.g.a;
import c.a.b.k.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f1279b;

    public m(Context context, f fVar) {
        this.f1278a = context;
        this.f1279b = fVar;
    }

    private l a() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            return l.b(c.a(file));
        }
        return null;
    }

    private l a(Context context) {
        List<d> listB = this.f1279b.b(context);
        l lVarB = null;
        if (listB != null) {
            String name = "files";
            File filesDir = context.getFilesDir();
            if (!"files".equals(filesDir.getName())) {
                Log.e("CuidV266Manager", "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                name = filesDir.getName();
            }
            for (d dVar : listB) {
                if (!dVar.d) {
                    File file = new File(new File(dVar.f1231a.dataDir, name), "libcuid.so");
                    if (file.exists() && (lVarB = l.b(c.a(file))) != null) {
                        break;
                    }
                }
            }
        }
        return lVarB;
    }

    private l b() {
        return l.a(c("com.baidu.deviceid"), c("bd_setting_i"));
    }

    private boolean b(String str) {
        return this.f1278a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private String c(String str) {
        try {
            return Settings.System.getString(this.f1278a.getContentResolver(), str);
        } catch (Exception e) {
            c.a(e);
            return null;
        }
    }

    private String d(String str) {
        return "0";
    }

    private l e(String str) {
        String str2;
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] bArrA = g.a();
            String[] strArrSplit = new String(c.a.b.e.a.c.a(bArrA, bArrA, a.a(sb.toString().getBytes()))).split("=");
            if (strArrSplit == null || strArrSplit.length != 2) {
                str2 = "";
            } else {
                str2 = strArrSplit[0];
                try {
                    str3 = strArrSplit[1];
                } catch (FileNotFoundException | IOException | Exception unused) {
                }
            }
        } catch (FileNotFoundException | IOException | Exception unused2) {
        }
        return l.a(str3, str2);
    }

    public l a(String str) {
        l lVarA = a(this.f1278a);
        if (lVarA == null) {
            lVarA = l.b(c("com.baidu.deviceid.v2"));
        }
        boolean zB = b("android.permission.READ_EXTERNAL_STORAGE");
        if (lVarA == null && zB) {
            lVarA = a();
        }
        if (lVarA == null) {
            lVarA = b();
        }
        boolean z = false;
        if (lVarA == null && zB) {
            z = true;
            lVarA = e(d(""));
        }
        if (!z) {
            d("");
        }
        if (lVarA != null) {
            lVarA.c();
        }
        return lVarA;
    }
}
