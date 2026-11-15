package U2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(S2.i iVar, S2.f fVar) {
        if (!(iVar instanceof s)) {
            Y2.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().u(((s) iVar).d().f(fVar), 1);
        }
    }
}
