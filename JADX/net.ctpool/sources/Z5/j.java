package Z5;

import T5.B;
import T5.C;
import T5.D;
import T5.F;
import T5.u;
import T5.v;
import T5.z;
import com.google.android.gms.common.api.Api;
import j5.AbstractC1809n;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4661b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f4662a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(z zVar) {
        w5.k.f(zVar, "client");
        this.f4662a = zVar;
    }

    private final B b(D d7, String str) {
        String strO;
        u uVarO;
        C cA = null;
        if (!this.f4662a.t() || (strO = D.o(d7, "Location", null, 2, null)) == null || (uVarO = d7.j0().l().o(strO)) == null) {
            return null;
        }
        if (!w5.k.b(uVarO.p(), d7.j0().l().p()) && !this.f4662a.u()) {
            return null;
        }
        B.a aVarI = d7.j0().i();
        if (f.b(str)) {
            int iF = d7.f();
            f fVar = f.f4647a;
            boolean z6 = fVar.d(str) || iF == 308 || iF == 307;
            if (fVar.c(str) && iF != 308 && iF != 307) {
                str = "GET";
            } else if (z6) {
                cA = d7.j0().a();
            }
            aVarI.g(str, cA);
            if (!z6) {
                aVarI.i("Transfer-Encoding");
                aVarI.i("Content-Length");
                aVarI.i("Content-Type");
            }
        }
        if (!U5.c.g(d7.j0().l(), uVarO)) {
            aVarI.i("Authorization");
        }
        return aVarI.l(uVarO).b();
    }

    private final B c(D d7, Y5.c cVar) throws ProtocolException {
        Y5.f fVarH;
        F fA = (cVar == null || (fVarH = cVar.h()) == null) ? null : fVarH.A();
        int iF = d7.f();
        String strH = d7.j0().h();
        if (iF != 307 && iF != 308) {
            if (iF == 401) {
                return this.f4662a.e().a(fA, d7);
            }
            if (iF == 421) {
                C cA = d7.j0().a();
                if ((cA != null && cA.g()) || cVar == null || !cVar.k()) {
                    return null;
                }
                cVar.h().y();
                return d7.j0();
            }
            if (iF == 503) {
                D dW = d7.W();
                if ((dW == null || dW.f() != 503) && g(d7, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return d7.j0();
                }
                return null;
            }
            if (iF == 407) {
                w5.k.c(fA);
                if (fA.b().type() == Proxy.Type.HTTP) {
                    return this.f4662a.G().a(fA, d7);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iF == 408) {
                if (!this.f4662a.J()) {
                    return null;
                }
                C cA2 = d7.j0().a();
                if (cA2 != null && cA2.g()) {
                    return null;
                }
                D dW2 = d7.W();
                if ((dW2 == null || dW2.f() != 408) && g(d7, 0) <= 0) {
                    return d7.j0();
                }
                return null;
            }
            switch (iF) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(d7, strH);
    }

    private final boolean d(IOException iOException, boolean z6) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z6 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, Y5.e eVar, B b7, boolean z6) {
        if (this.f4662a.J()) {
            return !(z6 && f(iOException, b7)) && d(iOException, z6) && eVar.z();
        }
        return false;
    }

    private final boolean f(IOException iOException, B b7) {
        C cA = b7.a();
        return (cA != null && cA.g()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(D d7, int i7) {
        String strO = D.o(d7, "Retry-After", null, 2, null);
        if (strO == null) {
            return i7;
        }
        if (!new F5.f("\\d+").a(strO)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strO);
        w5.k.e(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.q();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.l() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.g() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        U5.c.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.U().o(r7.U().b(null).c()).c();
     */
    @Override // T5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D a(v.a aVar) {
        List list;
        B bC;
        w5.k.f(aVar, "chain");
        g gVar = (g) aVar;
        B bH = gVar.h();
        Y5.e eVarD = gVar.d();
        List listI = AbstractC1809n.i();
        int i7 = 0;
        D d7 = null;
        while (true) {
            boolean z6 = true;
            while (true) {
                eVarD.i(bH, z6);
                try {
                    if (eVarD.n0()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        D dA = gVar.a(bH);
                        break;
                    } catch (Y5.j e7) {
                        if (!e(e7.c(), eVarD, bH, false)) {
                            throw U5.c.X(e7.b(), listI);
                        }
                        list = listI;
                        e = e7.b();
                        listI = AbstractC1809n.S(list, e);
                        eVarD.j(true);
                        z6 = false;
                    } catch (IOException e8) {
                        e = e8;
                        if (!e(e, eVarD, bH, !(e instanceof b6.a))) {
                            throw U5.c.X(e, listI);
                        }
                        list = listI;
                        listI = AbstractC1809n.S(list, e);
                        eVarD.j(true);
                        z6 = false;
                    }
                    eVarD.j(true);
                    z6 = false;
                } catch (Throwable th) {
                    eVarD.j(true);
                    throw th;
                }
            }
            eVarD.j(true);
            bH = bC;
        }
    }
}
