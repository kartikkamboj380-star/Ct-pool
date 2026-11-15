package h4;

import e4.C1629g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import n4.C1928g;

/* JADX INFO: renamed from: h4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1724m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f19755d = new FilenameFilter() { // from class: h4.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1724m.d(file, str);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f19756e = new Comparator() { // from class: h4.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1724m.e((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1928g f19757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19758b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19759c = null;

    C1724m(C1928g c1928g) {
        this.f19757a = c1928g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(C1928g c1928g, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c1928g.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e7) {
            C1629g.f().l("Failed to persist App Quality Sessions session id.", e7);
        }
    }

    static String g(C1928g c1928g, String str) {
        List listR = c1928g.r(str, f19755d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f19756e)).getName().substring(4);
        }
        C1629g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f19758b, str)) {
            return this.f19759c;
        }
        return g(this.f19757a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f19759c, str)) {
            f(this.f19757a, this.f19758b, str);
            this.f19759c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f19758b, str)) {
            f(this.f19757a, str, this.f19759c);
            this.f19758b = str;
        }
    }
}
