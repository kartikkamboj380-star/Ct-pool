package i6;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static final A a(File file) {
        return r.b(file);
    }

    public static final A b() {
        return s.a();
    }

    public static final g c(A a7) {
        return s.b(a7);
    }

    public static final h d(C c7) {
        return s.c(c7);
    }

    public static final boolean e(AssertionError assertionError) {
        return r.c(assertionError);
    }

    public static final A f(File file) {
        return r.g(file, false, 1, null);
    }

    public static final A g(File file, boolean z6) {
        return r.d(file, z6);
    }

    public static final A h(OutputStream outputStream) {
        return r.e(outputStream);
    }

    public static final A i(Socket socket) {
        return r.f(socket);
    }

    public static final C k(File file) {
        return r.h(file);
    }

    public static final C l(InputStream inputStream) {
        return r.i(inputStream);
    }

    public static final C m(Socket socket) {
        return r.j(socket);
    }
}
