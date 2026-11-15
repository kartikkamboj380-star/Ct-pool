package C;

import H5.AbstractC0398i;
import H5.I;
import H5.InterfaceC0415q0;
import J5.f;
import com.google.android.gms.common.api.Api;
import i5.u;
import java.util.concurrent.atomic.AtomicInteger;
import m5.InterfaceC1885d;
import o5.AbstractC1956k;
import v5.p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J5.d f794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f795d;

    static final class a extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ v5.l f796m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ l f797n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f798o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v5.l lVar, l lVar2, p pVar) {
            super(1);
            this.f796m = lVar;
            this.f797n = lVar2;
            this.f798o = pVar;
        }

        public final void a(Throwable th) {
            u uVar;
            this.f796m.i(th);
            this.f797n.f794c.b(th);
            do {
                Object objD = J5.f.d(this.f797n.f794c.a());
                if (objD == null) {
                    uVar = null;
                } else {
                    this.f798o.m(objD, th);
                    uVar = u.f19985a;
                }
            } while (uVar != null);
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u.f19985a;
        }
    }

    static final class b extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f799q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f800r;

        b(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return l.this.new b(interfaceC1885d);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // o5.AbstractC1946a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object s(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = n5.AbstractC1930b.c()
                int r1 = r5.f800r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                i5.n.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f799q
                v5.p r1 = (v5.p) r1
                i5.n.b(r6)
                goto L56
            L22:
                i5.n.b(r6)
                C.l r6 = C.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = C.l.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                C.l r6 = C.l.this
                H5.I r6 = C.l.d(r6)
                H5.J.b(r6)
                C.l r6 = C.l.this
                v5.p r1 = C.l.a(r6)
                C.l r6 = C.l.this
                J5.d r6 = C.l.b(r6)
                r5.f799q = r1
                r5.f800r = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f799q = r4
                r5.f800r = r2
                java.lang.Object r6 = r1.m(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                C.l r6 = C.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = C.l.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                i5.u r6 = i5.u.f19985a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: C.l.b.s(java.lang.Object):java.lang.Object");
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
            return ((b) d(i7, interfaceC1885d)).s(u.f19985a);
        }
    }

    public l(I i7, v5.l lVar, p pVar, p pVar2) {
        w5.k.f(i7, "scope");
        w5.k.f(lVar, "onComplete");
        w5.k.f(pVar, "onUndeliveredElement");
        w5.k.f(pVar2, "consumeMessage");
        this.f792a = i7;
        this.f793b = pVar2;
        this.f794c = J5.e.b(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, null, 6, null);
        this.f795d = new AtomicInteger(0);
        InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) i7.i().b(InterfaceC0415q0.f1444b);
        if (interfaceC0415q0 == null) {
            return;
        }
        interfaceC0415q0.D0(new a(lVar, this, pVar));
    }

    public final void e(Object obj) throws Throwable {
        Object objD = this.f794c.d(obj);
        if (objD instanceof f.a) {
            Throwable thC = J5.f.c(objD);
            if (thC != null) {
                throw thC;
            }
            throw new J5.j("Channel was closed normally");
        }
        if (!J5.f.f(objD)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f795d.getAndIncrement() == 0) {
            AbstractC0398i.d(this.f792a, null, null, new b(null), 3, null);
        }
    }
}
