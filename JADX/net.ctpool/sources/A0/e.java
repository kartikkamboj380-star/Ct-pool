package A0;

import A0.f;
import i5.u;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class a extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f48m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(1);
            this.f48m = dVar;
        }

        public final void a(f fVar) {
            k.f(fVar, "result");
            if (fVar instanceof f.c) {
                f.c cVar = (f.c) fVar;
                this.f48m.c(cVar.a(), cVar.b(), cVar.c(), cVar.d());
            } else if (fVar instanceof f.b) {
                this.f48m.b(((f.b) fVar).a());
            } else if (fVar instanceof f.a) {
                this.f48m.a();
            }
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((f) obj);
            return u.f19985a;
        }
    }

    public static final v5.l a(d dVar) {
        k.f(dVar, "<this>");
        return new a(dVar);
    }
}
