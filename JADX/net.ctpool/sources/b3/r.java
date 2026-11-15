package b3;

import V2.g;
import X2.c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c3.AbstractC0724k;
import c3.InterfaceC0716c;
import c3.InterfaceC0717d;
import d3.C1605a;
import d3.b;
import e3.InterfaceC1622a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V2.e f9624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0717d f9625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f9626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f9627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d3.b f9628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1622a f9629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1622a f9630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0716c f9631i;

    public r(Context context, V2.e eVar, InterfaceC0717d interfaceC0717d, x xVar, Executor executor, d3.b bVar, InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, InterfaceC0716c interfaceC0716c) {
        this.f9623a = context;
        this.f9624b = eVar;
        this.f9625c = interfaceC0717d;
        this.f9626d = xVar;
        this.f9627e = executor;
        this.f9628f = bVar;
        this.f9629g = interfaceC1622a;
        this.f9630h = interfaceC1622a2;
        this.f9631i = interfaceC0716c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(U2.p pVar) {
        return Boolean.valueOf(this.f9625c.U0(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(U2.p pVar) {
        return this.f9625c.N(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, U2.p pVar, long j7) {
        this.f9625c.V0(iterable);
        this.f9625c.E0(pVar, this.f9629g.a() + j7);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f9625c.r(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f9631i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f9631i.e(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(U2.p pVar, long j7) {
        this.f9625c.E0(pVar, this.f9629g.a() + j7);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(U2.p pVar, int i7) {
        this.f9626d.b(pVar, i7 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final U2.p pVar, final int i7, Runnable runnable) {
        try {
            try {
                d3.b bVar = this.f9628f;
                final InterfaceC0717d interfaceC0717d = this.f9625c;
                Objects.requireNonNull(interfaceC0717d);
                bVar.b(new b.a() { // from class: b3.i
                    @Override // d3.b.a
                    public final Object f() {
                        return Integer.valueOf(interfaceC0717d.c());
                    }
                });
                if (k()) {
                    u(pVar, i7);
                } else {
                    this.f9628f.b(new b.a() { // from class: b3.j
                        @Override // d3.b.a
                        public final Object f() {
                            return this.f9604a.s(pVar, i7);
                        }
                    });
                }
            } catch (C1605a unused) {
                this.f9626d.b(pVar, i7 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public U2.i j(V2.m mVar) {
        d3.b bVar = this.f9628f;
        final InterfaceC0716c interfaceC0716c = this.f9631i;
        Objects.requireNonNull(interfaceC0716c);
        return mVar.a(U2.i.a().i(this.f9629g.a()).o(this.f9630h.a()).n("GDT_CLIENT_METRICS").h(new U2.h(S2.c.b("proto"), ((X2.a) bVar.b(new b.a() { // from class: b3.h
            @Override // d3.b.a
            public final Object f() {
                return interfaceC0716c.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f9623a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public V2.g u(final U2.p pVar, int i7) {
        V2.g gVarB;
        V2.m mVarA = this.f9624b.a(pVar.b());
        long jMax = 0;
        V2.g gVarE = V2.g.e(0L);
        while (true) {
            final long j7 = jMax;
            while (((Boolean) this.f9628f.b(new b.a() { // from class: b3.k
                @Override // d3.b.a
                public final Object f() {
                    return this.f9607a.l(pVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f9628f.b(new b.a() { // from class: b3.l
                    @Override // d3.b.a
                    public final Object f() {
                        return this.f9609a.m(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    Y2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVarB = V2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC0724k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarB = mVarA.b(V2.f.a().b(arrayList).c(pVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f9628f.b(new b.a() { // from class: b3.m
                        @Override // d3.b.a
                        public final Object f() {
                            return this.f9611a.n(iterable, pVar, j7);
                        }
                    });
                    this.f9626d.a(pVar, i7 + 1, true);
                    return gVarE;
                }
                this.f9628f.b(new b.a() { // from class: b3.n
                    @Override // d3.b.a
                    public final Object f() {
                        return this.f9615a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j7, gVarE.b());
                    if (pVar.e()) {
                        this.f9628f.b(new b.a() { // from class: b3.o
                            @Override // d3.b.a
                            public final Object f() {
                                return this.f9617a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strN = ((AbstractC0724k) it2.next()).b().n();
                        map.put(strN, !map.containsKey(strN) ? 1 : Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    }
                    this.f9628f.b(new b.a() { // from class: b3.p
                        @Override // d3.b.a
                        public final Object f() {
                            return this.f9618a.q(map);
                        }
                    });
                }
            }
            this.f9628f.b(new b.a() { // from class: b3.q
                @Override // d3.b.a
                public final Object f() {
                    return this.f9620a.r(pVar, j7);
                }
            });
            return gVarE;
        }
    }

    public void v(final U2.p pVar, final int i7, final Runnable runnable) {
        this.f9627e.execute(new Runnable() { // from class: b3.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f9598m.t(pVar, i7, runnable);
            }
        });
    }
}
