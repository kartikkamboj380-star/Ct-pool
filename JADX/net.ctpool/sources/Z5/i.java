package Z5;

import T5.B;
import T5.u;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f4660a = new i();

    private i() {
    }

    private final boolean b(B b7, Proxy.Type type) {
        return !b7.g() && type == Proxy.Type.HTTP;
    }

    public final String a(B b7, Proxy.Type type) {
        w5.k.f(b7, "request");
        w5.k.f(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b7.h());
        sb.append(' ');
        i iVar = f4660a;
        boolean zB = iVar.b(b7, type);
        u uVarL = b7.l();
        if (zB) {
            sb.append(uVarL);
        } else {
            sb.append(iVar.c(uVarL));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u uVar) {
        w5.k.f(uVar, ImagesContract.URL);
        String strD = uVar.d();
        String strF = uVar.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
