package c6;

import i6.A;
import i6.C;
import i6.q;
import i6.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0192a f10121b = new C0192a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10120a = new C0192a.C0193a();

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    public static final class C0192a {

        /* JADX INFO: renamed from: c6.a$a$a, reason: collision with other inner class name */
        private static final class C0193a implements a {
            @Override // c6.a
            public C a(File file) {
                k.f(file, "file");
                return q.k(file);
            }

            @Override // c6.a
            public A b(File file) {
                k.f(file, "file");
                try {
                    return r.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return r.g(file, false, 1, null);
                }
            }

            @Override // c6.a
            public void c(File file) throws IOException {
                k.f(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    k.e(file2, "file");
                    if (file2.isDirectory()) {
                        c(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // c6.a
            public boolean d(File file) {
                k.f(file, "file");
                return file.exists();
            }

            @Override // c6.a
            public void e(File file, File file2) throws IOException {
                k.f(file, "from");
                k.f(file2, "to");
                f(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // c6.a
            public void f(File file) throws IOException {
                k.f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // c6.a
            public A g(File file) {
                k.f(file, "file");
                try {
                    return q.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return q.a(file);
                }
            }

            @Override // c6.a
            public long h(File file) {
                k.f(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0192a() {
        }

        public /* synthetic */ C0192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    C a(File file);

    A b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    A g(File file);

    long h(File file);
}
