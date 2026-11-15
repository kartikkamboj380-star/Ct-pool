package K5;

import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: K5.a$a, reason: collision with other inner class name */
    static final class C0037a extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f1882p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f1883q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1885s;

        C0037a(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f1883q = obj;
            this.f1885s |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c cVar, InterfaceC1885d interfaceC1885d) throws Throwable {
        C0037a c0037a;
        Throwable th;
        L5.i iVar;
        if (interfaceC1885d instanceof C0037a) {
            c0037a = (C0037a) interfaceC1885d;
            int i7 = c0037a.f1885s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0037a.f1885s = i7 - Integer.MIN_VALUE;
            } else {
                c0037a = new C0037a(interfaceC1885d);
            }
        }
        Object obj = c0037a.f1883q;
        Object objC = AbstractC1930b.c();
        int i8 = c0037a.f1885s;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (L5.i) c0037a.f1882p;
            try {
                i5.n.b(obj);
                iVar.t();
                return u.f19985a;
            } catch (Throwable th2) {
                th = th2;
                iVar.t();
                throw th;
            }
        }
        i5.n.b(obj);
        L5.i iVar2 = new L5.i(cVar, c0037a.a());
        try {
            c0037a.f1882p = iVar2;
            c0037a.f1885s = 1;
            if (b(iVar2, c0037a) == objC) {
                return objC;
            }
            iVar = iVar2;
            iVar.t();
            return u.f19985a;
        } catch (Throwable th3) {
            th = th3;
            iVar = iVar2;
            iVar.t();
            throw th;
        }
    }

    public abstract Object b(c cVar, InterfaceC1885d interfaceC1885d);
}
