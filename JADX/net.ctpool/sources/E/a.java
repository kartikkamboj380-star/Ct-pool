package E;

import H5.I;
import H5.J;
import H5.J0;
import H5.W;
import android.content.Context;
import j5.AbstractC1809n;
import java.util.List;
import w5.k;
import w5.l;
import z5.InterfaceC2279a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: E.a$a, reason: collision with other inner class name */
    public static final class C0015a extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C0015a f1007m = new C0015a();

        C0015a() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List i(Context context) {
            k.f(context, "it");
            return AbstractC1809n.i();
        }
    }

    public static final InterfaceC2279a a(String str, D.b bVar, v5.l lVar, I i7) {
        k.f(str, "name");
        k.f(lVar, "produceMigrations");
        k.f(i7, "scope");
        return new c(str, bVar, lVar, i7);
    }

    public static /* synthetic */ InterfaceC2279a b(String str, D.b bVar, v5.l lVar, I i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        if ((i8 & 4) != 0) {
            lVar = C0015a.f1007m;
        }
        if ((i8 & 8) != 0) {
            i7 = J.a(W.b().o(J0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, i7);
    }
}
