package i6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f20040a = Logger.getLogger("okio.Okio");

    public static final A b(File file) {
        w5.k.f(file, "$this$appendingSink");
        return q.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        w5.k.f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? F5.g.G(message, "getsockname failed", false, 2, null) : false;
    }

    public static final A d(File file, boolean z6) {
        w5.k.f(file, "$this$sink");
        return q.h(new FileOutputStream(file, z6));
    }

    public static final A e(OutputStream outputStream) {
        w5.k.f(outputStream, "$this$sink");
        return new u(outputStream, new D());
    }

    public static final A f(Socket socket) throws IOException {
        w5.k.f(socket, "$this$sink");
        B b7 = new B(socket);
        OutputStream outputStream = socket.getOutputStream();
        w5.k.e(outputStream, "getOutputStream()");
        return b7.v(new u(outputStream, b7));
    }

    public static /* synthetic */ A g(File file, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return q.g(file, z6);
    }

    public static final C h(File file) {
        w5.k.f(file, "$this$source");
        return q.l(new FileInputStream(file));
    }

    public static final C i(InputStream inputStream) {
        w5.k.f(inputStream, "$this$source");
        return new p(inputStream, new D());
    }

    public static final C j(Socket socket) throws IOException {
        w5.k.f(socket, "$this$source");
        B b7 = new B(socket);
        InputStream inputStream = socket.getInputStream();
        w5.k.e(inputStream, "getInputStream()");
        return b7.w(new p(inputStream, b7));
    }
}
