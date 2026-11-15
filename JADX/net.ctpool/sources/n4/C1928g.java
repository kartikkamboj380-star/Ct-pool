package n4;

import android.content.Context;
import e4.C1629g;
import e4.j;
import h4.AbstractC1721j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1928g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f21426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f21427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f21428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f21429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f21430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f21431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f21432g;

    public C1928g(Context context) {
        String str;
        String strD = j.f19211a.e(context).d();
        this.f21426a = strD;
        File filesDir = context.getFilesDir();
        this.f21427b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileT = t(new File(filesDir, str));
        this.f21428c = fileT;
        this.f21429d = t(new File(fileT, "open-sessions"));
        this.f21430e = t(new File(fileT, "reports"));
        this.f21431f = t(new File(fileT, "priority-reports"));
        this.f21432g = t(new File(fileT, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f21427b, str);
        if (file.exists() && v(file)) {
            C1629g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f21427b.exists() || (list = this.f21427b.list(new FilenameFilter() { // from class: n4.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return C1928g.s(str, file, str2);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return u(new File(this.f21429d, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean s(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    private static synchronized File t(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C1629g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                C1629g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                v(file2);
            }
        }
        return file.delete();
    }

    private static List w(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    static String x(String str) {
        return str.length() > 40 ? AbstractC1721j.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f21426a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f21429d, str));
    }

    public List f() {
        return w(this.f21429d.list());
    }

    public File g(String str) {
        return new File(this.f21428c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return w(this.f21428c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f21432g, str);
    }

    public List j() {
        return w(this.f21432g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f21431f, str);
    }

    public List m() {
        return w(this.f21431f.listFiles());
    }

    public File n(String str) {
        return new File(this.f21430e, str);
    }

    public List o() {
        return w(this.f21430e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
