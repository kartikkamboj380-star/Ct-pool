package y1;

import J0.j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f22909a;

    public c(d dVar) {
        this.f22909a = dVar;
    }

    public static J0.j b(J0.g gVar, J0.i iVar) {
        return c(gVar, iVar, Executors.newSingleThreadExecutor());
    }

    public static J0.j c(J0.g gVar, J0.i iVar, Executor executor) {
        return new J0.j(iVar, gVar.h(), new j.c(gVar.k(), gVar.j(), gVar.f()), gVar.e(), gVar.d(), gVar.g(), executor, gVar.i());
    }

    @Override // y1.h
    public J0.n a(J0.g gVar) {
        return b(gVar, this.f22909a.a(gVar));
    }
}
