package E;

import H5.I;
import android.content.Context;
import java.io.File;
import java.util.List;
import v5.InterfaceC2171a;
import v5.l;
import w5.k;
import z5.InterfaceC2279a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC2279a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.b f1009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f1010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f1011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f1012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile C.f f1013f;

    static final class a extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f1014m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ c f1015n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f1014m = context;
            this.f1015n = cVar;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context context = this.f1014m;
            k.e(context, "applicationContext");
            return b.a(context, this.f1015n.f1008a);
        }
    }

    public c(String str, D.b bVar, l lVar, I i7) {
        k.f(str, "name");
        k.f(lVar, "produceMigrations");
        k.f(i7, "scope");
        this.f1008a = str;
        this.f1009b = bVar;
        this.f1010c = lVar;
        this.f1011d = i7;
        this.f1012e = new Object();
    }

    @Override // z5.InterfaceC2279a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C.f a(Context context, D5.g gVar) {
        C.f fVar;
        k.f(context, "thisRef");
        k.f(gVar, "property");
        C.f fVar2 = this.f1013f;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f1012e) {
            try {
                if (this.f1013f == null) {
                    Context applicationContext = context.getApplicationContext();
                    F.c cVar = F.c.f1060a;
                    D.b bVar = this.f1009b;
                    l lVar = this.f1010c;
                    k.e(applicationContext, "applicationContext");
                    this.f1013f = cVar.a(bVar, (List) lVar.i(applicationContext), this.f1011d, new a(applicationContext, this));
                }
                fVar = this.f1013f;
                k.c(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
