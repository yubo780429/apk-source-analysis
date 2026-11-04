package c.a.c.a;

import android.text.TextUtils;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes.dex */
class l extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1305a;

    l(k kVar) {
        this.f1305a = kVar;
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (!TextUtils.isEmpty(this.f1305a.g) && !TextUtils.isEmpty(this.f1305a.h)) {
            return new PasswordAuthentication(this.f1305a.g, this.f1305a.h.toCharArray());
        }
        d.a("Proxy Username or Password is null");
        return null;
    }
}
