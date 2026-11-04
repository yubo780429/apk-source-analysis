package c.a.c.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class n extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f1306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(b bVar, Looper looper) {
        super(looper);
        this.f1306a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        d.a("handleMessage !!");
        if (message.what == 0) {
            this.f1306a.a((JSONObject) message.obj);
        }
        c cVar = (c) b.l.get(message.getData().getString("listenerKey"));
        d.a("handleMessage listener = " + cVar);
        if (cVar != null) {
            cVar.a(message.what, message.obj.toString());
        }
    }
}
