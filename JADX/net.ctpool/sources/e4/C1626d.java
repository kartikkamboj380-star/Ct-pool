package e4;

import D4.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import k4.F;
import k4.G;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1626d implements InterfaceC1623a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f19199c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.a f19200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f19201b = new AtomicReference(null);

    /* JADX INFO: renamed from: e4.d$b */
    private static final class b implements h {
        private b() {
        }

        @Override // e4.h
        public File a() {
            return null;
        }

        @Override // e4.h
        public File b() {
            return null;
        }

        @Override // e4.h
        public File c() {
            return null;
        }

        @Override // e4.h
        public F.a d() {
            return null;
        }

        @Override // e4.h
        public File e() {
            return null;
        }

        @Override // e4.h
        public File f() {
            return null;
        }

        @Override // e4.h
        public File g() {
            return null;
        }
    }

    public C1626d(D4.a aVar) {
        this.f19200a = aVar;
        aVar.a(new a.InterfaceC0014a() { // from class: e4.b
            @Override // D4.a.InterfaceC0014a
            public final void a(D4.b bVar) {
                this.f19194a.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(D4.b bVar) {
        C1629g.f().b("Crashlytics native component now available.");
        this.f19201b.set((InterfaceC1623a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j7, G g7, D4.b bVar) {
        ((InterfaceC1623a) bVar.get()).c(str, str2, j7, g7);
    }

    @Override // e4.InterfaceC1623a
    public h a(String str) {
        InterfaceC1623a interfaceC1623a = (InterfaceC1623a) this.f19201b.get();
        return interfaceC1623a == null ? f19199c : interfaceC1623a.a(str);
    }

    @Override // e4.InterfaceC1623a
    public boolean b() {
        InterfaceC1623a interfaceC1623a = (InterfaceC1623a) this.f19201b.get();
        return interfaceC1623a != null && interfaceC1623a.b();
    }

    @Override // e4.InterfaceC1623a
    public void c(final String str, final String str2, final long j7, final G g7) {
        C1629g.f().i("Deferring native open session: " + str);
        this.f19200a.a(new a.InterfaceC0014a() { // from class: e4.c
            @Override // D4.a.InterfaceC0014a
            public final void a(D4.b bVar) {
                C1626d.h(str, str2, j7, g7, bVar);
            }
        });
    }

    @Override // e4.InterfaceC1623a
    public boolean d(String str) {
        InterfaceC1623a interfaceC1623a = (InterfaceC1623a) this.f19201b.get();
        return interfaceC1623a != null && interfaceC1623a.d(str);
    }
}
