package J0;

import I0.a;
import J0.i;
import N0.c;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class k implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f1633f = k.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.o f1635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0.a f1637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f1638e = new a(null, null);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f1639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f1640b;

        a(File file, i iVar) {
            this.f1639a = iVar;
            this.f1640b = file;
        }
    }

    public k(int i7, O0.o oVar, String str, I0.a aVar) {
        this.f1634a = i7;
        this.f1637d = aVar;
        this.f1635b = oVar;
        this.f1636c = str;
    }

    private void k() throws c.a {
        File file = new File((File) this.f1635b.get(), this.f1636c);
        j(file);
        this.f1638e = new a(file, new b(file, this.f1634a, this.f1637d));
    }

    private boolean n() {
        File file;
        a aVar = this.f1638e;
        return aVar.f1639a == null || (file = aVar.f1640b) == null || !file.exists();
    }

    @Override // J0.i
    public void a() {
        m().a();
    }

    @Override // J0.i
    public boolean b() {
        try {
            return m().b();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // J0.i
    public void c() {
        try {
            m().c();
        } catch (IOException e7) {
            P0.a.g(f1633f, "purgeUnexpectedResources", e7);
        }
    }

    @Override // J0.i
    public i.b d(String str, Object obj) {
        return m().d(str, obj);
    }

    @Override // J0.i
    public boolean e(String str, Object obj) {
        return m().e(str, obj);
    }

    @Override // J0.i
    public boolean f(String str, Object obj) {
        return m().f(str, obj);
    }

    @Override // J0.i
    public H0.a g(String str, Object obj) {
        return m().g(str, obj);
    }

    @Override // J0.i
    public Collection h() {
        return m().h();
    }

    @Override // J0.i
    public long i(i.a aVar) {
        return m().i(aVar);
    }

    void j(File file) throws c.a {
        try {
            N0.c.a(file);
            P0.a.a(f1633f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e7) {
            this.f1637d.a(a.EnumC0026a.WRITE_CREATE_DIR, f1633f, "createRootDirectoryIfNecessary", e7);
            throw e7;
        }
    }

    void l() {
        if (this.f1638e.f1639a == null || this.f1638e.f1640b == null) {
            return;
        }
        N0.a.b(this.f1638e.f1640b);
    }

    synchronized i m() {
        try {
            if (n()) {
                l();
                k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (i) O0.l.g(this.f1638e.f1639a);
    }

    @Override // J0.i
    public long remove(String str) {
        return m().remove(str);
    }
}
