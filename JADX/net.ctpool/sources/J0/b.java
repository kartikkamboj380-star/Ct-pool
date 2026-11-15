package J0;

import I0.a;
import J0.i;
import N0.c;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f1560f = b.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final long f1561g = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f1562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f1564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0.a f1565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V0.a f1566e;

    /* JADX INFO: renamed from: J0.b$b, reason: collision with other inner class name */
    static class C0029b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final H0.b f1570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f1572d;

        private C0029b(String str, File file) {
            O0.l.g(file);
            this.f1569a = (String) O0.l.g(str);
            this.f1570b = H0.b.b(file);
            this.f1571c = -1L;
            this.f1572d = -1L;
        }

        @Override // J0.i.a
        public long a() {
            if (this.f1572d < 0) {
                this.f1572d = this.f1570b.d().lastModified();
            }
            return this.f1572d;
        }

        public H0.b b() {
            return this.f1570b;
        }

        @Override // J0.i.a
        public String getId() {
            return this.f1569a;
        }

        @Override // J0.i.a
        public long n() {
            if (this.f1571c < 0) {
                this.f1571c = this.f1570b.size();
            }
            return this.f1571c;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1574b;

        private c(String str, String str2) {
            this.f1573a = str;
            this.f1574b = str2;
        }

        public static c b(File file) {
            String strT;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strT = b.t(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strT.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new c(strT, strSubstring);
        }

        public File a(File file) {
            return File.createTempFile(this.f1574b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f1574b + this.f1573a;
        }

        public String toString() {
            return this.f1573a + "(" + this.f1574b + ")";
        }
    }

    private static class d extends IOException {
        public d(long j7, long j8) {
            super("File was not written completely. Expected: " + j7 + ", found: " + j8);
        }
    }

    class e implements i.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File f1576b;

        public e(String str, File file) {
            this.f1575a = str;
            this.f1576b = file;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public H0.a a(Object obj, long j7) throws c.d {
            a.EnumC0026a enumC0026a;
            File fileR = b.this.r(this.f1575a);
            try {
                N0.c.b(this.f1576b, fileR);
                if (fileR.exists()) {
                    fileR.setLastModified(j7);
                }
                return H0.b.b(fileR);
            } catch (c.d e7) {
                Throwable cause = e7.getCause();
                if (cause == null) {
                    enumC0026a = a.EnumC0026a.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof c.C0041c) {
                    enumC0026a = a.EnumC0026a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    enumC0026a = a.EnumC0026a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                }
                b.this.f1565d.a(enumC0026a, b.f1560f, "commit", e7);
                throw e7;
            }
        }

        @Override // J0.i.b
        public boolean c() {
            return !this.f1576b.exists() || this.f1576b.delete();
        }

        @Override // J0.i.b
        public H0.a d(Object obj) {
            return a(obj, b.this.f1566e.now());
        }

        @Override // J0.i.b
        public void e(I0.j jVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f1576b);
                try {
                    O0.c cVar = new O0.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long jA = cVar.a();
                    fileOutputStream.close();
                    if (this.f1576b.length() != jA) {
                        throw new d(jA, this.f1576b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                b.this.f1565d.a(a.EnumC0026a.WRITE_UPDATE_FILE_NOT_FOUND, b.f1560f, "updateResource", e7);
                throw e7;
            }
        }
    }

    private class f implements N0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1578a;

        private f() {
        }

        private boolean d(File file) {
            c cVarV = b.this.v(file);
            if (cVarV == null) {
                return false;
            }
            String str = cVarV.f1573a;
            if (str == ".tmp") {
                return e(file);
            }
            O0.l.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > b.this.f1566e.now() - b.f1561g;
        }

        @Override // N0.b
        public void a(File file) {
            if (this.f1578a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // N0.b
        public void b(File file) {
            if (this.f1578a || !file.equals(b.this.f1564c)) {
                return;
            }
            this.f1578a = true;
        }

        @Override // N0.b
        public void c(File file) {
            if (!b.this.f1562a.equals(file) && !this.f1578a) {
                file.delete();
            }
            if (this.f1578a && file.equals(b.this.f1564c)) {
                this.f1578a = false;
            }
        }
    }

    public b(File file, int i7, I0.a aVar) {
        O0.l.g(file);
        this.f1562a = file;
        this.f1563b = z(file, aVar);
        this.f1564c = new File(file, y(i7));
        this.f1565d = aVar;
        C();
        this.f1566e = V0.d.a();
    }

    private void A(File file, String str) throws c.a {
        try {
            N0.c.a(file);
        } catch (c.a e7) {
            this.f1565d.a(a.EnumC0026a.WRITE_CREATE_DIR, f1560f, str, e7);
            throw e7;
        }
    }

    private boolean B(String str, boolean z6) {
        File fileR = r(str);
        boolean zExists = fileR.exists();
        if (z6 && zExists) {
            fileR.setLastModified(this.f1566e.now());
        }
        return zExists;
    }

    private void C() {
        if (this.f1562a.exists()) {
            if (this.f1564c.exists()) {
                return;
            } else {
                N0.a.b(this.f1562a);
            }
        }
        try {
            N0.c.a(this.f1564c);
        } catch (c.a unused) {
            this.f1565d.a(a.EnumC0026a.WRITE_CREATE_DIR, f1560f, "version directory could not be created: " + this.f1564c, null);
        }
    }

    private long q(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String u(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(x(cVar.f1574b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c v(File file) {
        c cVarB = c.b(file);
        if (cVarB != null && w(cVarB.f1574b).equals(file.getParentFile())) {
            return cVarB;
        }
        return null;
    }

    private File w(String str) {
        return new File(x(str));
    }

    private String x(String str) {
        return this.f1564c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String y(int i7) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i7));
    }

    private static boolean z(File file, I0.a aVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException e7) {
                e = e7;
                canonicalPath = null;
            }
            try {
                return canonicalPath.contains(string);
            } catch (IOException e8) {
                e = e8;
                aVar.a(a.EnumC0026a.OTHER, f1560f, "failed to read folder to check if external: " + canonicalPath, e);
                return false;
            }
        } catch (Exception e9) {
            aVar.a(a.EnumC0026a.OTHER, f1560f, "failed to get the external storage directory!", e9);
            return false;
        }
    }

    @Override // J0.i
    public void a() {
        N0.a.a(this.f1562a);
    }

    @Override // J0.i
    public boolean b() {
        return this.f1563b;
    }

    @Override // J0.i
    public void c() {
        N0.a.c(this.f1562a, new f());
    }

    @Override // J0.i
    public i.b d(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str);
        File fileW = w(cVar.f1574b);
        if (!fileW.exists()) {
            A(fileW, "insert");
        }
        try {
            return new e(str, cVar.a(fileW));
        } catch (IOException e7) {
            this.f1565d.a(a.EnumC0026a.WRITE_CREATE_TEMPFILE, f1560f, "insert", e7);
            throw e7;
        }
    }

    @Override // J0.i
    public boolean e(String str, Object obj) {
        return B(str, true);
    }

    @Override // J0.i
    public boolean f(String str, Object obj) {
        return B(str, false);
    }

    @Override // J0.i
    public H0.a g(String str, Object obj) {
        File fileR = r(str);
        if (!fileR.exists()) {
            return null;
        }
        fileR.setLastModified(this.f1566e.now());
        return H0.b.c(fileR);
    }

    @Override // J0.i
    public long i(i.a aVar) {
        return q(((C0029b) aVar).b().d());
    }

    File r(String str) {
        return new File(u(str));
    }

    @Override // J0.i
    public long remove(String str) {
        return q(r(str));
    }

    @Override // J0.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public List h() {
        a aVar = new a();
        N0.a.c(this.f1564c, aVar);
        return aVar.d();
    }

    private class a implements N0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f1567a;

        private a() {
            this.f1567a = new ArrayList();
        }

        @Override // N0.b
        public void a(File file) {
            c cVarV = b.this.v(file);
            if (cVarV == null || cVarV.f1573a != ".cnt") {
                return;
            }
            this.f1567a.add(new C0029b(cVarV.f1574b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f1567a);
        }

        @Override // N0.b
        public void b(File file) {
        }

        @Override // N0.b
        public void c(File file) {
        }
    }
}
