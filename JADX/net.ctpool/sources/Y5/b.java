package Y5;

import T5.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4508d;

    public b(List list) {
        w5.k.f(list, "connectionSpecs");
        this.f4508d = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f4508d.size();
        for (int i7 = this.f4505a; i7 < size; i7++) {
            if (((l) this.f4508d.get(i7)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        l lVar;
        w5.k.f(sSLSocket, "sslSocket");
        int i7 = this.f4505a;
        int size = this.f4508d.size();
        while (true) {
            if (i7 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f4508d.get(i7);
            i7++;
            if (lVar.e(sSLSocket)) {
                this.f4505a = i7;
                break;
            }
        }
        if (lVar != null) {
            this.f4506b = c(sSLSocket);
            lVar.c(sSLSocket, this.f4507c);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f4507c);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.f4508d);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        w5.k.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        w5.k.e(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException iOException) {
        w5.k.f(iOException, "e");
        this.f4507c = true;
        return (!this.f4506b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
