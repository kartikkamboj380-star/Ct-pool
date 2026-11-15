package F;

import H5.I;
import java.io.File;
import java.util.List;
import t5.AbstractC2071b;
import v5.InterfaceC2171a;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1060a = new c();

    static final class a extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2171a f1061m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2171a interfaceC2171a) {
            super(0);
            this.f1061m = interfaceC2171a;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f1061m.invoke();
            String strA = AbstractC2071b.a(file);
            h hVar = h.f1066a;
            if (k.b(strA, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final C.f a(D.b bVar, List list, I i7, InterfaceC2171a interfaceC2171a) {
        k.f(list, "migrations");
        k.f(i7, "scope");
        k.f(interfaceC2171a, "produceFile");
        return new b(C.g.f789a.a(h.f1066a, bVar, list, i7, new a(interfaceC2171a)));
    }
}
