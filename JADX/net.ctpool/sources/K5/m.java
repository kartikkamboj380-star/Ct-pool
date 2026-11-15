package K5;

import H5.InterfaceC0415q0;
import H5.u0;
import M5.F;
import i5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;

/* JADX INFO: loaded from: classes2.dex */
final class m extends L5.b implements k, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1918q = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1919p;

    static final class a extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f1920p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f1921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f1922r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f1923s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f1924t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f1925u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f1927w;

        a(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f1925u = obj;
            this.f1927w |= Integer.MIN_VALUE;
            return m.this.a(null, this);
        }
    }

    public m(Object obj) {
        this._state = obj;
    }

    private final boolean j(Object obj, Object obj2) {
        int i7;
        L5.d[] dVarArrG;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1918q;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !w5.k.b(obj3, obj)) {
                return false;
            }
            if (w5.k.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f1919p;
            if ((i8 & 1) != 0) {
                this.f1919p = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f1919p = i9;
            L5.d[] dVarArrG2 = g();
            u uVar = u.f19985a;
            while (true) {
                o[] oVarArr = (o[]) dVarArrG2;
                if (oVarArr != null) {
                    for (o oVar : oVarArr) {
                        if (oVar != null) {
                            oVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f1919p;
                    if (i7 == i9) {
                        this.f1919p = i9 + 1;
                        return true;
                    }
                    dVarArrG = g();
                    u uVar2 = u.f19985a;
                }
                dVarArrG2 = dVarArrG;
                i9 = i7;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:33:0x009c, B:35:0x00a2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a2, B:33:0x009c], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0097, B:33:0x009c, B:43:0x00bd, B:45:0x00c3, B:35:0x00a2, B:39:0x00a9, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c1 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // K5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(c cVar, InterfaceC1885d interfaceC1885d) {
        a aVar;
        m mVar;
        o oVar;
        c cVar2;
        InterfaceC0415q0 interfaceC0415q0;
        Object obj;
        Object obj2;
        Object obj3;
        if (interfaceC1885d instanceof a) {
            aVar = (a) interfaceC1885d;
            int i7 = aVar.f1927w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f1927w = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1885d);
            }
        }
        Object obj4 = aVar.f1925u;
        Object objC = AbstractC1930b.c();
        int i8 = aVar.f1927w;
        try {
            if (i8 == 0) {
                i5.n.b(obj4);
                mVar = this;
                oVar = (o) c();
            } else if (i8 == 1) {
                oVar = (o) aVar.f1922r;
                cVar = (c) aVar.f1921q;
                mVar = (m) aVar.f1920p;
                i5.n.b(obj4);
            } else if (i8 == 2) {
                obj = aVar.f1924t;
                interfaceC0415q0 = (InterfaceC0415q0) aVar.f1923s;
                oVar = (o) aVar.f1922r;
                cVar2 = (c) aVar.f1921q;
                mVar = (m) aVar.f1920p;
                i5.n.b(obj4);
                if (!oVar.h()) {
                }
                obj2 = f1918q.get(mVar);
                if (interfaceC0415q0 != null) {
                }
                if (obj != null) {
                }
                if (obj2 != L5.h.f2002a) {
                }
                aVar.f1920p = mVar;
                aVar.f1921q = cVar2;
                aVar.f1922r = oVar;
                aVar.f1923s = interfaceC0415q0;
                aVar.f1924t = obj2;
                aVar.f1927w = 2;
                if (cVar2.b(obj3, aVar) != objC) {
                }
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f1924t;
                interfaceC0415q0 = (InterfaceC0415q0) aVar.f1923s;
                oVar = (o) aVar.f1922r;
                cVar2 = (c) aVar.f1921q;
                mVar = (m) aVar.f1920p;
                i5.n.b(obj4);
                obj2 = f1918q.get(mVar);
                if (interfaceC0415q0 != null) {
                    u0.d(interfaceC0415q0);
                }
                if (obj != null || !w5.k.b(obj, obj2)) {
                    obj3 = obj2 != L5.h.f2002a ? null : obj2;
                    aVar.f1920p = mVar;
                    aVar.f1921q = cVar2;
                    aVar.f1922r = oVar;
                    aVar.f1923s = interfaceC0415q0;
                    aVar.f1924t = obj2;
                    aVar.f1927w = 2;
                    if (cVar2.b(obj3, aVar) != objC) {
                        return objC;
                    }
                    obj = obj2;
                }
                if (!oVar.h()) {
                    aVar.f1920p = mVar;
                    aVar.f1921q = cVar2;
                    aVar.f1922r = oVar;
                    aVar.f1923s = interfaceC0415q0;
                    aVar.f1924t = obj;
                    aVar.f1927w = 3;
                    if (oVar.e(aVar) == objC) {
                        return objC;
                    }
                }
                obj2 = f1918q.get(mVar);
                if (interfaceC0415q0 != null) {
                }
                if (obj != null) {
                }
                if (obj2 != L5.h.f2002a) {
                }
                aVar.f1920p = mVar;
                aVar.f1921q = cVar2;
                aVar.f1922r = oVar;
                aVar.f1923s = interfaceC0415q0;
                aVar.f1924t = obj2;
                aVar.f1927w = 2;
                if (cVar2.b(obj3, aVar) != objC) {
                }
            }
            cVar2 = cVar;
            interfaceC0415q0 = (InterfaceC0415q0) aVar.a().b(InterfaceC0415q0.f1444b);
            obj = null;
            obj2 = f1918q.get(mVar);
            if (interfaceC0415q0 != null) {
            }
            if (obj != null) {
            }
            if (obj2 != L5.h.f2002a) {
            }
            aVar.f1920p = mVar;
            aVar.f1921q = cVar2;
            aVar.f1922r = oVar;
            aVar.f1923s = interfaceC0415q0;
            aVar.f1924t = obj2;
            aVar.f1927w = 2;
            if (cVar2.b(obj3, aVar) != objC) {
            }
        } catch (Throwable th) {
            mVar.f(oVar);
            throw th;
        }
    }

    @Override // K5.c
    public Object b(Object obj, InterfaceC1885d interfaceC1885d) {
        setValue(obj);
        return u.f19985a;
    }

    @Override // K5.k
    public Object getValue() {
        F f7 = L5.h.f2002a;
        Object obj = f1918q.get(this);
        if (obj == f7) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // L5.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o d() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // L5.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o[] e(int i7) {
        return new o[i7];
    }

    @Override // K5.k
    public void setValue(Object obj) {
        if (obj == null) {
            obj = L5.h.f2002a;
        }
        j(null, obj);
    }
}
