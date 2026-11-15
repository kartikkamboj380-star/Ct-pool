package N4;

import H5.AbstractC0398i;
import N4.s;
import android.util.Log;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1947b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;

/* JADX INFO: loaded from: classes.dex */
public final class B implements com.google.firebase.sessions.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2272g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double f2273h = Math.random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y3.f f2274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E4.e f2275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P4.f f2276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0446h f2277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1888g f2278f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2280r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f2281s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2282t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f2283u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f2284v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f2285w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ y f2287y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2287y = yVar;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return B.this.new b(this.f2287y, interfaceC1885d);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        @Override // o5.AbstractC1946a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object s(Object obj) {
            s sVar;
            Object objC;
            A a7;
            B b7;
            P4.f fVar;
            Y3.f fVar2;
            y yVar;
            Object objC2 = AbstractC1930b.c();
            int i7 = this.f2285w;
            if (i7 == 0) {
                i5.n.b(obj);
                B b8 = B.this;
                this.f2285w = 1;
                obj = b8.i(this);
                if (obj == objC2) {
                    return objC2;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        P4.f fVar3 = (P4.f) this.f2284v;
                        y yVar2 = (y) this.f2283u;
                        Y3.f fVar4 = (Y3.f) this.f2282t;
                        A a8 = (A) this.f2281s;
                        B b9 = (B) this.f2280r;
                        sVar = (s) this.f2279q;
                        i5.n.b(obj);
                        b7 = b9;
                        fVar = fVar3;
                        a7 = a8;
                        yVar = yVar2;
                        fVar2 = fVar4;
                        b7.g(a7.a(fVar2, yVar, fVar, (Map) obj, sVar.b(), sVar.a()));
                        return i5.u.f19985a;
                    }
                    i5.n.b(obj);
                    sVar = (s) obj;
                    B b10 = B.this;
                    A a9 = A.f2270a;
                    Y3.f fVar5 = b10.f2274b;
                    y yVar3 = this.f2287y;
                    P4.f fVar6 = B.this.f2276d;
                    O4.a aVar = O4.a.f2476a;
                    this.f2279q = sVar;
                    this.f2280r = b10;
                    this.f2281s = a9;
                    this.f2282t = fVar5;
                    this.f2283u = yVar3;
                    this.f2284v = fVar6;
                    this.f2285w = 3;
                    objC = aVar.c(this);
                    if (objC != objC2) {
                        return objC2;
                    }
                    a7 = a9;
                    b7 = b10;
                    fVar = fVar6;
                    fVar2 = fVar5;
                    obj = objC;
                    yVar = yVar3;
                    b7.g(a7.a(fVar2, yVar, fVar, (Map) obj, sVar.b(), sVar.a()));
                    return i5.u.f19985a;
                }
                i5.n.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                s.a aVar2 = s.f2392c;
                E4.e eVar = B.this.f2275c;
                this.f2285w = 2;
                obj = aVar2.a(eVar, this);
                if (obj == objC2) {
                    return objC2;
                }
                sVar = (s) obj;
                B b102 = B.this;
                A a92 = A.f2270a;
                Y3.f fVar52 = b102.f2274b;
                y yVar32 = this.f2287y;
                P4.f fVar62 = B.this.f2276d;
                O4.a aVar3 = O4.a.f2476a;
                this.f2279q = sVar;
                this.f2280r = b102;
                this.f2281s = a92;
                this.f2282t = fVar52;
                this.f2283u = yVar32;
                this.f2284v = fVar62;
                this.f2285w = 3;
                objC = aVar3.c(this);
                if (objC != objC2) {
                }
            }
            return i5.u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
            return ((b) d(i7, interfaceC1885d)).s(i5.u.f19985a);
        }
    }

    static final class c extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f2288p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f2289q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2291s;

        c(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f2289q = obj;
            this.f2291s |= Integer.MIN_VALUE;
            return B.this.i(this);
        }
    }

    public B(Y3.f fVar, E4.e eVar, P4.f fVar2, InterfaceC0446h interfaceC0446h, InterfaceC1888g interfaceC1888g) {
        w5.k.f(fVar, "firebaseApp");
        w5.k.f(eVar, "firebaseInstallations");
        w5.k.f(fVar2, "sessionSettings");
        w5.k.f(interfaceC0446h, "eventGDTLogger");
        w5.k.f(interfaceC1888g, "backgroundDispatcher");
        this.f2274b = fVar;
        this.f2275c = eVar;
        this.f2276d = fVar2;
        this.f2277e = interfaceC0446h;
        this.f2278f = interfaceC1888g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f2277e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + zVar.c().f());
        } catch (RuntimeException e7) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e7);
        }
    }

    private final boolean h() {
        return f2273h <= this.f2276d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(InterfaceC1885d interfaceC1885d) {
        c cVar;
        B b7;
        String str;
        if (interfaceC1885d instanceof c) {
            cVar = (c) interfaceC1885d;
            int i7 = cVar.f2291s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.f2291s = i7 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC1885d);
            }
        }
        Object obj = cVar.f2289q;
        Object objC = AbstractC1930b.c();
        int i8 = cVar.f2291s;
        if (i8 == 0) {
            i5.n.b(obj);
            Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
            P4.f fVar = this.f2276d;
            cVar.f2288p = this;
            cVar.f2291s = 1;
            if (fVar.g(cVar) == objC) {
                return objC;
            }
            b7 = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b7 = (B) cVar.f2288p;
            i5.n.b(obj);
        }
        if (!b7.f2276d.d()) {
            str = "Sessions SDK disabled. Events will not be sent.";
        } else {
            if (b7.h()) {
                return AbstractC1947b.a(true);
            }
            str = "Sessions SDK has dropped this session due to sampling.";
        }
        Log.d("SessionFirelogPublisher", str);
        return AbstractC1947b.a(false);
    }

    @Override // com.google.firebase.sessions.b
    public void a(y yVar) {
        w5.k.f(yVar, "sessionDetails");
        AbstractC0398i.d(H5.J.a(this.f2278f), null, null, new b(yVar, null), 3, null);
    }
}
