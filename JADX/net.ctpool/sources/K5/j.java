package K5;

import java.util.NoSuchElementException;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class j {

    public static final class a implements c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ v f1912m;

        public a(v vVar) {
            this.f1912m = vVar;
        }

        @Override // K5.c
        public Object b(Object obj, InterfaceC1885d interfaceC1885d) {
            this.f1912m.f22740m = obj;
            throw new L5.a(this);
        }
    }

    static final class b extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f1913p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f1914q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f1915r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1916s;

        b(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f1915r = obj;
            this.f1916s |= Integer.MIN_VALUE;
            return d.f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(K5.b bVar, InterfaceC1885d interfaceC1885d) {
        b bVar2;
        v vVar;
        L5.a e7;
        c cVar;
        if (interfaceC1885d instanceof b) {
            bVar2 = (b) interfaceC1885d;
            int i7 = bVar2.f1916s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar2.f1916s = i7 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(interfaceC1885d);
            }
        }
        Object obj = bVar2.f1915r;
        Object objC = AbstractC1930b.c();
        int i8 = bVar2.f1916s;
        if (i8 == 0) {
            i5.n.b(obj);
            v vVar2 = new v();
            vVar2.f22740m = L5.h.f2002a;
            c aVar = new a(vVar2);
            try {
                bVar2.f1913p = vVar2;
                bVar2.f1914q = aVar;
                bVar2.f1916s = 1;
                if (bVar.a(aVar, bVar2) == objC) {
                    return objC;
                }
                vVar = vVar2;
            } catch (L5.a e8) {
                vVar = vVar2;
                e7 = e8;
                cVar = aVar;
                L5.f.a(e7, cVar);
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (a) bVar2.f1914q;
            vVar = (v) bVar2.f1913p;
            try {
                i5.n.b(obj);
            } catch (L5.a e9) {
                e7 = e9;
                L5.f.a(e7, cVar);
            }
        }
        Object obj2 = vVar.f22740m;
        if (obj2 != L5.h.f2002a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
