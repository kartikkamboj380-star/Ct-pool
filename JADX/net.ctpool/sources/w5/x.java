package w5;

/* JADX INFO: loaded from: classes2.dex */
public class x {
    public D5.b b(Class cls) {
        return new C2201e(cls);
    }

    public D5.c c(Class cls, String str) {
        return new m(cls, str);
    }

    public String f(g gVar) {
        String string = gVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String g(l lVar) {
        return f(lVar);
    }

    public D5.d a(h hVar) {
        return hVar;
    }

    public D5.e d(n nVar) {
        return nVar;
    }

    public D5.f e(p pVar) {
        return pVar;
    }
}
