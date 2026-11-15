package i6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class B extends C1752d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Socket f19988m;

    public B(Socket socket) {
        w5.k.f(socket, "socket");
        this.f19988m = socket;
    }

    @Override // i6.C1752d
    protected IOException t(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // i6.C1752d
    protected void x() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Throwable th;
        try {
            this.f19988m.close();
        } catch (AssertionError e7) {
            if (!q.e(e7)) {
                throw e7;
            }
            Logger logger2 = r.f20040a;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e7;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f19988m);
            logger.log(level, sb.toString(), th);
        } catch (Exception e8) {
            Logger logger3 = r.f20040a;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e8;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.f19988m);
            logger.log(level, sb.toString(), th);
        }
    }
}
