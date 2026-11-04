package c.a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f1214a = new HashMap();

    public interface a {
        List a();
    }

    public c(a aVar) {
        for (c.a.b.c.a aVar2 : aVar.a()) {
            this.f1214a.put(aVar2.a(), aVar2);
        }
    }

    public List a() {
        return new ArrayList(this.f1214a.values());
    }
}
