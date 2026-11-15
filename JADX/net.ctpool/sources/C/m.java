package C;

import H5.AbstractC0394g;
import H5.AbstractC0420w;
import H5.I;
import H5.InterfaceC0418u;
import i5.AbstractC1744a;
import i5.m;
import i5.u;
import j5.AbstractC1809n;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1947b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;
import t5.AbstractC2070a;
import v5.InterfaceC2171a;
import w5.s;
import w5.v;

/* JADX INFO: loaded from: classes.dex */
public final class m implements C.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f802k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set f803l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f804m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2171a f805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.k f806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.b f807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K5.b f809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final K5.k f812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C.l f814j;

    public static final class a {
        private a() {
        }

        public final Set a() {
            return m.f803l;
        }

        public final Object b() {
            return m.f804m;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C.n f815a;

            public a(C.n nVar) {
                super(null);
                this.f815a = nVar;
            }

            public C.n a() {
                return this.f815a;
            }
        }

        /* JADX INFO: renamed from: C.m$b$b, reason: collision with other inner class name */
        public static final class C0008b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final v5.p f816a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final InterfaceC0418u f817b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final C.n f818c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final InterfaceC1888g f819d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008b(v5.p pVar, InterfaceC0418u interfaceC0418u, C.n nVar, InterfaceC1888g interfaceC1888g) {
                super(null);
                w5.k.f(pVar, "transform");
                w5.k.f(interfaceC0418u, "ack");
                w5.k.f(interfaceC1888g, "callerContext");
                this.f816a = pVar;
                this.f817b = interfaceC0418u;
                this.f818c = nVar;
                this.f819d = interfaceC1888g;
            }

            public final InterfaceC0418u a() {
                return this.f817b;
            }

            public final InterfaceC1888g b() {
                return this.f819d;
            }

            public C.n c() {
                return this.f818c;
            }

            public final v5.p d() {
                return this.f816a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class c extends OutputStream {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final FileOutputStream f820m;

        public c(FileOutputStream fileOutputStream) {
            w5.k.f(fileOutputStream, "fileOutputStream");
            this.f820m = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f820m.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i7) throws IOException {
            this.f820m.write(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            w5.k.f(bArr, "b");
            this.f820m.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) throws IOException {
            w5.k.f(bArr, "bytes");
            this.f820m.write(bArr, i7, i8);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    static final class d extends w5.l implements v5.l {
        d() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                m.this.f812h.setValue(new C.h(th));
            }
            a aVar = m.f802k;
            Object objB = aVar.b();
            m mVar = m.this;
            synchronized (objB) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                u uVar = u.f19985a;
            }
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u.f19985a;
        }
    }

    static final class e extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final e f822m = new e();

        e() {
            super(2);
        }

        public final void a(b bVar, Throwable th) {
            w5.k.f(bVar, "msg");
            if (bVar instanceof b.C0008b) {
                InterfaceC0418u interfaceC0418uA = ((b.C0008b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                interfaceC0418uA.a0(th);
            }
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return u.f19985a;
        }
    }

    static final class f extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f823q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f824r;

        f(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            f fVar = m.this.new f(interfaceC1885d);
            fVar.f824r = obj;
            return fVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f823q;
            if (i7 == 0) {
                i5.n.b(obj);
                b bVar = (b) this.f824r;
                if (bVar instanceof b.a) {
                    this.f823q = 1;
                    if (m.this.r((b.a) bVar, this) == objC) {
                        return objC;
                    }
                } else if (bVar instanceof b.C0008b) {
                    this.f823q = 2;
                    if (m.this.s((b.C0008b) bVar, this) == objC) {
                        return objC;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(b bVar, InterfaceC1885d interfaceC1885d) {
            return ((f) d(bVar, interfaceC1885d)).s(u.f19985a);
        }
    }

    static final class g extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f826q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f827r;

        static final class a extends AbstractC1956k implements v5.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f829q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f830r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ C.n f831s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C.n nVar, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f831s = nVar;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                a aVar = new a(this.f831s, interfaceC1885d);
                aVar.f830r = obj;
                return aVar;
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                AbstractC1930b.c();
                if (this.f829q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
                C.n nVar = (C.n) this.f830r;
                C.n nVar2 = this.f831s;
                boolean z6 = false;
                if (!(nVar2 instanceof C.c) && !(nVar2 instanceof C.h) && nVar == nVar2) {
                    z6 = true;
                }
                return AbstractC1947b.a(z6);
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(C.n nVar, InterfaceC1885d interfaceC1885d) {
                return ((a) d(nVar, interfaceC1885d)).s(u.f19985a);
            }
        }

        public static final class b implements K5.b {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ K5.b f832m;

            public static final class a implements K5.c {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                final /* synthetic */ K5.c f833m;

                /* JADX INFO: renamed from: C.m$g$b$a$a, reason: collision with other inner class name */
                public static final class C0009a extends AbstractC1949d {

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    /* synthetic */ Object f834p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f835q;

                    public C0009a(InterfaceC1885d interfaceC1885d) {
                        super(interfaceC1885d);
                    }

                    @Override // o5.AbstractC1946a
                    public final Object s(Object obj) {
                        this.f834p = obj;
                        this.f835q |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(K5.c cVar) {
                    this.f833m = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // K5.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object b(Object obj, InterfaceC1885d interfaceC1885d) throws Throwable {
                    C0009a c0009a;
                    if (interfaceC1885d instanceof C0009a) {
                        c0009a = (C0009a) interfaceC1885d;
                        int i7 = c0009a.f835q;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            c0009a.f835q = i7 - Integer.MIN_VALUE;
                        } else {
                            c0009a = new C0009a(interfaceC1885d);
                        }
                    }
                    Object obj2 = c0009a.f834p;
                    Object objC = AbstractC1930b.c();
                    int i8 = c0009a.f835q;
                    if (i8 == 0) {
                        i5.n.b(obj2);
                        K5.c cVar = this.f833m;
                        C.n nVar = (C.n) obj;
                        if (nVar instanceof C.j) {
                            throw ((C.j) nVar).a();
                        }
                        if (nVar instanceof C.h) {
                            throw ((C.h) nVar).a();
                        }
                        if (!(nVar instanceof C.c)) {
                            if (nVar instanceof C.o) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                            }
                            throw new i5.k();
                        }
                        Object objB = ((C.c) nVar).b();
                        c0009a.f835q = 1;
                        if (cVar.b(objB, c0009a) == objC) {
                            return objC;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5.n.b(obj2);
                    }
                    return u.f19985a;
                }
            }

            public b(K5.b bVar) {
                this.f832m = bVar;
            }

            @Override // K5.b
            public Object a(K5.c cVar, InterfaceC1885d interfaceC1885d) {
                Object objA = this.f832m.a(new a(cVar), interfaceC1885d);
                return objA == AbstractC1930b.c() ? objA : u.f19985a;
            }
        }

        g(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            g gVar = m.this.new g(interfaceC1885d);
            gVar.f827r = obj;
            return gVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) throws Throwable {
            Object objC = AbstractC1930b.c();
            int i7 = this.f826q;
            if (i7 == 0) {
                i5.n.b(obj);
                K5.c cVar = (K5.c) this.f827r;
                C.n nVar = (C.n) m.this.f812h.getValue();
                if (!(nVar instanceof C.c)) {
                    m.this.f814j.e(new b.a(nVar));
                }
                b bVar = new b(K5.d.c(m.this.f812h, new a(nVar, null)));
                this.f826q = 1;
                if (K5.d.d(cVar, bVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(K5.c cVar, InterfaceC1885d interfaceC1885d) {
            return ((g) d(cVar, interfaceC1885d)).s(u.f19985a);
        }
    }

    static final class h extends w5.l implements InterfaceC2171a {
        h() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) m.this.f805a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f802k;
            synchronized (aVar.b()) {
                if (!(!aVar.a().contains(absolutePath))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set setA = aVar.a();
                w5.k.e(absolutePath, "it");
                setA.add(absolutePath);
            }
            return file;
        }
    }

    static final class i extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f838p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f840r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f841s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f843u;

        i(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f841s = obj;
            this.f843u |= Integer.MIN_VALUE;
            return m.this.s(null, this);
        }
    }

    static final class j extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f844p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f845q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f846r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f847s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f848t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f849u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f850v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f852x;

        j(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f850v = obj;
            this.f852x |= Integer.MIN_VALUE;
            return m.this.t(this);
        }
    }

    public static final class k implements C.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q5.a f853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f856d;

        static final class a extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f857p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f858q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f859r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f860s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f861t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f862u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            int f864w;

            a(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f862u = obj;
                this.f864w |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(Q5.a aVar, s sVar, v vVar, m mVar) {
            this.f853a = aVar;
            this.f854b = sVar;
            this.f855c = vVar;
            this.f856d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // C.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(v5.p pVar, InterfaceC1885d interfaceC1885d) throws Throwable {
            a aVar;
            Q5.a aVar2;
            m mVar;
            s sVar;
            v vVar;
            Q5.a aVar3;
            Q5.a aVar4;
            m mVar2;
            Object obj;
            v vVar2;
            if (interfaceC1885d instanceof a) {
                aVar = (a) interfaceC1885d;
                int i7 = aVar.f864w;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f864w = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1885d);
                }
            }
            Object obj2 = aVar.f862u;
            Object objC = AbstractC1930b.c();
            int i8 = aVar.f864w;
            try {
                if (i8 == 0) {
                    i5.n.b(obj2);
                    aVar2 = this.f853a;
                    s sVar2 = this.f854b;
                    v vVar3 = this.f855c;
                    mVar = this.f856d;
                    aVar.f857p = pVar;
                    aVar.f858q = aVar2;
                    aVar.f859r = sVar2;
                    aVar.f860s = vVar3;
                    aVar.f861t = mVar;
                    aVar.f864w = 1;
                    if (aVar2.a(null, aVar) == objC) {
                        return objC;
                    }
                    sVar = sVar2;
                    vVar = vVar3;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = aVar.f859r;
                            vVar2 = (v) aVar.f858q;
                            aVar3 = (Q5.a) aVar.f857p;
                            try {
                                i5.n.b(obj2);
                                vVar2.f22740m = obj;
                                vVar = vVar2;
                                Object obj3 = vVar.f22740m;
                                aVar3.c(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                aVar3.c(null);
                                throw th;
                            }
                        }
                        mVar2 = (m) aVar.f859r;
                        vVar = (v) aVar.f858q;
                        aVar4 = (Q5.a) aVar.f857p;
                        try {
                            i5.n.b(obj2);
                            if (!w5.k.b(obj2, vVar.f22740m)) {
                                aVar3 = aVar4;
                                Object obj32 = vVar.f22740m;
                                aVar3.c(null);
                                return obj32;
                            }
                            aVar.f857p = aVar4;
                            aVar.f858q = vVar;
                            aVar.f859r = obj2;
                            aVar.f864w = 3;
                            if (mVar2.z(obj2, aVar) == objC) {
                                return objC;
                            }
                            obj = obj2;
                            vVar2 = vVar;
                            aVar3 = aVar4;
                            vVar2.f22740m = obj;
                            vVar = vVar2;
                            Object obj322 = vVar.f22740m;
                            aVar3.c(null);
                            return obj322;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3 = aVar4;
                            aVar3.c(null);
                            throw th;
                        }
                    }
                    m mVar3 = (m) aVar.f861t;
                    vVar = (v) aVar.f860s;
                    sVar = (s) aVar.f859r;
                    Q5.a aVar5 = (Q5.a) aVar.f858q;
                    v5.p pVar2 = (v5.p) aVar.f857p;
                    i5.n.b(obj2);
                    aVar2 = aVar5;
                    mVar = mVar3;
                    pVar = pVar2;
                }
                if (sVar.f22737m) {
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
                Object obj4 = vVar.f22740m;
                aVar.f857p = aVar2;
                aVar.f858q = vVar;
                aVar.f859r = mVar;
                aVar.f860s = null;
                aVar.f861t = null;
                aVar.f864w = 2;
                Object objM = pVar.m(obj4, aVar);
                if (objM == objC) {
                    return objC;
                }
                aVar4 = aVar2;
                obj2 = objM;
                mVar2 = mVar;
                if (!w5.k.b(obj2, vVar.f22740m)) {
                }
            } catch (Throwable th3) {
                th = th3;
                aVar3 = aVar2;
                aVar3.c(null);
                throw th;
            }
        }
    }

    static final class l extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f865p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f866q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f868s;

        l(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f866q = obj;
            this.f868s |= Integer.MIN_VALUE;
            return m.this.u(this);
        }
    }

    /* JADX INFO: renamed from: C.m$m, reason: collision with other inner class name */
    static final class C0010m extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f869p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f870q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f872s;

        C0010m(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f870q = obj;
            this.f872s |= Integer.MIN_VALUE;
            return m.this.v(this);
        }
    }

    static final class n extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f873p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f874q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f875r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f876s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f878u;

        n(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f876s = obj;
            this.f878u |= Integer.MIN_VALUE;
            return m.this.w(this);
        }
    }

    static final class o extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f879p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f880q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f881r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f883t;

        o(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f881r = obj;
            this.f883t |= Integer.MIN_VALUE;
            return m.this.x(this);
        }
    }

    static final class p extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f884p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f885q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f886r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f887s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f889u;

        p(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f887s = obj;
            this.f889u |= Integer.MIN_VALUE;
            return m.this.y(null, null, this);
        }
    }

    static final class q extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f890q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ v5.p f891r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f892s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(v5.p pVar, Object obj, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f891r = pVar;
            this.f892s = obj;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return new q(this.f891r, this.f892s, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f890q;
            if (i7 == 0) {
                i5.n.b(obj);
                v5.p pVar = this.f891r;
                Object obj2 = this.f892s;
                this.f890q = 1;
                obj = pVar.m(obj2, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            return obj;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
            return ((q) d(i7, interfaceC1885d)).s(u.f19985a);
        }
    }

    static final class r extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f893p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f894q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f895r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f896s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f897t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f898u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f900w;

        r(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f898u = obj;
            this.f900w |= Integer.MIN_VALUE;
            return m.this.z(null, this);
        }
    }

    public m(InterfaceC2171a interfaceC2171a, C.k kVar, List list, C.b bVar, I i7) {
        w5.k.f(interfaceC2171a, "produceFile");
        w5.k.f(kVar, "serializer");
        w5.k.f(list, "initTasksList");
        w5.k.f(bVar, "corruptionHandler");
        w5.k.f(i7, "scope");
        this.f805a = interfaceC2171a;
        this.f806b = kVar;
        this.f807c = bVar;
        this.f808d = i7;
        this.f809e = K5.d.g(new g(null));
        this.f810f = ".tmp";
        this.f811g = i5.g.b(new h());
        this.f812h = K5.n.a(C.o.f901a);
        this.f813i = AbstractC1809n.b0(list);
        this.f814j = new C.l(i7, new d(), e.f822m, new f(null));
    }

    private final void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(w5.k.m("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f811g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a aVar, InterfaceC1885d interfaceC1885d) {
        C.n nVar = (C.n) this.f812h.getValue();
        if (!(nVar instanceof C.c)) {
            if (nVar instanceof C.j) {
                if (nVar == aVar.a()) {
                    Object objV = v(interfaceC1885d);
                    return objV == AbstractC1930b.c() ? objV : u.f19985a;
                }
            } else {
                if (w5.k.b(nVar, C.o.f901a)) {
                    Object objV2 = v(interfaceC1885d);
                    return objV2 == AbstractC1930b.c() ? objV2 : u.f19985a;
                }
                if (nVar instanceof C.h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return u.f19985a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [C.m$b$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [C.m$b$b] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [H5.u] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(b.C0008b c0008b, InterfaceC1885d interfaceC1885d) {
        i iVar;
        Object objA;
        ?? r9;
        InterfaceC0418u interfaceC0418uA;
        C.n nVar;
        m mVar;
        Object objY;
        ?? r92;
        InterfaceC0418u interfaceC0418u;
        if (interfaceC1885d instanceof i) {
            iVar = (i) interfaceC1885d;
            int i7 = iVar.f843u;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iVar.f843u = i7 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC1885d);
            }
        }
        Object obj = iVar.f841s;
        Object objC = AbstractC1930b.c();
        int i8 = iVar.f843u;
        boolean z6 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                interfaceC0418u = (InterfaceC0418u) iVar.f838p;
            } else if (i8 == 2) {
                InterfaceC0418u interfaceC0418u2 = (InterfaceC0418u) iVar.f840r;
                mVar = (m) iVar.f839q;
                b.C0008b c0008b2 = (b.C0008b) iVar.f838p;
                i5.n.b(obj);
                interfaceC0418uA = interfaceC0418u2;
                r92 = c0008b2;
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0418u = (InterfaceC0418u) iVar.f838p;
            }
            i5.n.b(obj);
            c0008b = interfaceC0418u;
            objA = i5.m.a(obj);
            r9 = c0008b;
            AbstractC0420w.c(r9, objA);
            return u.f19985a;
        }
        i5.n.b(obj);
        interfaceC0418uA = c0008b.a();
        try {
            m.a aVar = i5.m.f19973m;
            nVar = (C.n) this.f812h.getValue();
        } catch (Throwable th2) {
            th = th2;
            c0008b = interfaceC0418uA;
            m.a aVar2 = i5.m.f19973m;
            objA = i5.m.a(i5.n.a(th));
            r9 = c0008b;
        }
        if (nVar instanceof C.c) {
            v5.p pVarD = c0008b.d();
            InterfaceC1888g interfaceC1888gB = c0008b.b();
            iVar.f838p = interfaceC0418uA;
            iVar.f843u = 1;
            objY = y(pVarD, interfaceC1888gB, iVar);
            if (objY == objC) {
                return objC;
            }
            InterfaceC0418u interfaceC0418u3 = interfaceC0418uA;
            obj = objY;
            c0008b = interfaceC0418u3;
            objA = i5.m.a(obj);
            r9 = c0008b;
            AbstractC0420w.c(r9, objA);
            return u.f19985a;
        }
        if (!(nVar instanceof C.j)) {
            z6 = nVar instanceof C.o;
        }
        if (!z6) {
            if (nVar instanceof C.h) {
                throw ((C.h) nVar).a();
            }
            throw new i5.k();
        }
        if (nVar != c0008b.c()) {
            throw ((C.j) nVar).a();
        }
        iVar.f838p = c0008b;
        iVar.f839q = this;
        iVar.f840r = interfaceC0418uA;
        iVar.f843u = 2;
        if (u(iVar) == objC) {
            return objC;
        }
        mVar = this;
        r92 = c0008b;
        v5.p pVarD2 = r92.d();
        InterfaceC1888g interfaceC1888gB2 = r92.b();
        iVar.f838p = interfaceC0418uA;
        iVar.f839q = null;
        iVar.f840r = null;
        iVar.f843u = 3;
        objY = mVar.y(pVarD2, interfaceC1888gB2, iVar);
        if (objY == objC) {
            return objC;
        }
        InterfaceC0418u interfaceC0418u32 = interfaceC0418uA;
        obj = objY;
        c0008b = interfaceC0418u32;
        objA = i5.m.a(obj);
        r9 = c0008b;
        AbstractC0420w.c(r9, objA);
        return u.f19985a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(InterfaceC1885d interfaceC1885d) throws IOException {
        j jVar;
        Q5.a aVarB;
        v vVar;
        m mVar;
        v vVar2;
        m mVar2;
        v vVar3;
        k kVar;
        Iterator it;
        Q5.a aVar;
        s sVar;
        s sVar2;
        j jVar2;
        m mVar3;
        v vVar4;
        Q5.a aVar2;
        if (interfaceC1885d instanceof j) {
            jVar = (j) interfaceC1885d;
            int i7 = jVar.f852x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                jVar.f852x = i7 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC1885d);
            }
        }
        Object objX = jVar.f850v;
        Object objC = AbstractC1930b.c();
        int i8 = jVar.f852x;
        if (i8 == 0) {
            i5.n.b(objX);
            if (!(w5.k.b(this.f812h.getValue(), C.o.f901a) || (this.f812h.getValue() instanceof C.j))) {
                throw new IllegalStateException("Check failed.".toString());
            }
            aVarB = Q5.c.b(false, 1, null);
            vVar = new v();
            jVar.f844p = this;
            jVar.f845q = aVarB;
            jVar.f846r = vVar;
            jVar.f847s = vVar;
            jVar.f852x = 1;
            objX = x(jVar);
            if (objX == objC) {
                return objC;
            }
            mVar = this;
            vVar2 = vVar;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (Q5.a) jVar.f847s;
                    sVar2 = (s) jVar.f846r;
                    vVar4 = (v) jVar.f845q;
                    mVar3 = (m) jVar.f844p;
                    i5.n.b(objX);
                    try {
                        sVar2.f22737m = true;
                        u uVar = u.f19985a;
                        aVar2.c(null);
                        K5.k kVar2 = mVar3.f812h;
                        Object obj = vVar4.f22740m;
                        kVar2.setValue(new C.c(obj, obj != null ? obj.hashCode() : 0));
                        return u.f19985a;
                    } catch (Throwable th) {
                        aVar2.c(null);
                        throw th;
                    }
                }
                it = (Iterator) jVar.f849u;
                kVar = (k) jVar.f848t;
                sVar = (s) jVar.f847s;
                vVar3 = (v) jVar.f846r;
                aVar = (Q5.a) jVar.f845q;
                mVar2 = (m) jVar.f844p;
                i5.n.b(objX);
                while (it.hasNext()) {
                    v5.p pVar = (v5.p) it.next();
                    jVar.f844p = mVar2;
                    jVar.f845q = aVar;
                    jVar.f846r = vVar3;
                    jVar.f847s = sVar;
                    jVar.f848t = kVar;
                    jVar.f849u = it;
                    jVar.f852x = 2;
                    if (pVar.m(kVar, jVar) == objC) {
                        return objC;
                    }
                }
                jVar2 = jVar;
                sVar2 = sVar;
                vVar2 = vVar3;
                aVarB = aVar;
                mVar3 = mVar2;
                mVar3.f813i = null;
                jVar2.f844p = mVar3;
                jVar2.f845q = vVar2;
                jVar2.f846r = sVar2;
                jVar2.f847s = aVarB;
                jVar2.f848t = null;
                jVar2.f849u = null;
                jVar2.f852x = 3;
                if (aVarB.a(null, jVar2) == objC) {
                    return objC;
                }
                vVar4 = vVar2;
                aVar2 = aVarB;
                sVar2.f22737m = true;
                u uVar2 = u.f19985a;
                aVar2.c(null);
                K5.k kVar22 = mVar3.f812h;
                Object obj2 = vVar4.f22740m;
                kVar22.setValue(new C.c(obj2, obj2 != null ? obj2.hashCode() : 0));
                return u.f19985a;
            }
            vVar = (v) jVar.f847s;
            vVar2 = (v) jVar.f846r;
            aVarB = (Q5.a) jVar.f845q;
            mVar = (m) jVar.f844p;
            i5.n.b(objX);
        }
        vVar.f22740m = objX;
        s sVar3 = new s();
        k kVar3 = new k(aVarB, sVar3, vVar2, mVar);
        List list = mVar.f813i;
        if (list == null) {
            sVar2 = sVar3;
            jVar2 = jVar;
            mVar3 = mVar;
            mVar3.f813i = null;
            jVar2.f844p = mVar3;
            jVar2.f845q = vVar2;
            jVar2.f846r = sVar2;
            jVar2.f847s = aVarB;
            jVar2.f848t = null;
            jVar2.f849u = null;
            jVar2.f852x = 3;
            if (aVarB.a(null, jVar2) == objC) {
            }
        } else {
            mVar2 = mVar;
            vVar3 = vVar2;
            kVar = kVar3;
            it = list.iterator();
            aVar = aVarB;
            sVar = sVar3;
            while (it.hasNext()) {
            }
            jVar2 = jVar;
            sVar2 = sVar;
            vVar2 = vVar3;
            aVarB = aVar;
            mVar3 = mVar2;
            mVar3.f813i = null;
            jVar2.f844p = mVar3;
            jVar2.f845q = vVar2;
            jVar2.f846r = sVar2;
            jVar2.f847s = aVarB;
            jVar2.f848t = null;
            jVar2.f849u = null;
            jVar2.f852x = 3;
            if (aVarB.a(null, jVar2) == objC) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(InterfaceC1885d interfaceC1885d) throws Throwable {
        l lVar;
        m mVar;
        if (interfaceC1885d instanceof l) {
            lVar = (l) interfaceC1885d;
            int i7 = lVar.f868s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f868s = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC1885d);
            }
        }
        Object obj = lVar.f866q;
        Object objC = AbstractC1930b.c();
        int i8 = lVar.f868s;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) lVar.f865p;
            try {
                i5.n.b(obj);
                return u.f19985a;
            } catch (Throwable th) {
                th = th;
                mVar.f812h.setValue(new C.j(th));
                throw th;
            }
        }
        i5.n.b(obj);
        try {
            lVar.f865p = this;
            lVar.f868s = 1;
            if (t(lVar) == objC) {
                return objC;
            }
            return u.f19985a;
        } catch (Throwable th2) {
            th = th2;
            mVar = this;
            mVar.f812h.setValue(new C.j(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(InterfaceC1885d interfaceC1885d) {
        C0010m c0010m;
        m mVar;
        if (interfaceC1885d instanceof C0010m) {
            c0010m = (C0010m) interfaceC1885d;
            int i7 = c0010m.f872s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0010m.f872s = i7 - Integer.MIN_VALUE;
            } else {
                c0010m = new C0010m(interfaceC1885d);
            }
        }
        Object obj = c0010m.f870q;
        Object objC = AbstractC1930b.c();
        int i8 = c0010m.f872s;
        if (i8 == 0) {
            i5.n.b(obj);
            try {
                c0010m.f869p = this;
                c0010m.f872s = 1;
                if (t(c0010m) == objC) {
                    return objC;
                }
            } catch (Throwable th) {
                th = th;
                mVar = this;
                mVar.f812h.setValue(new C.j(th));
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) c0010m.f869p;
            try {
                i5.n.b(obj);
            } catch (Throwable th2) {
                th = th2;
                mVar.f812h.setValue(new C.j(th));
            }
        }
        return u.f19985a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [C.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [C.m$n, m5.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [C.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [C.k] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(InterfaceC1885d interfaceC1885d) throws IOException {
        ?? nVar;
        ?? fileInputStream;
        Throwable th;
        ?? r22;
        if (interfaceC1885d instanceof n) {
            n nVar2 = (n) interfaceC1885d;
            int i7 = nVar2.f878u;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                nVar2.f878u = i7 - Integer.MIN_VALUE;
                nVar = nVar2;
            } else {
                nVar = new n(interfaceC1885d);
            }
        }
        Object objA = nVar.f876s;
        Object objC = AbstractC1930b.c();
        int i8 = nVar.f878u;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) nVar.f875r;
                fileInputStream = (Closeable) nVar.f874q;
                nVar = (m) nVar.f873p;
                try {
                    i5.n.b(objA);
                    r22 = fileInputStream;
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } finally {
                        AbstractC2070a.a(fileInputStream, th);
                    }
                }
            }
            i5.n.b(objA);
            try {
                fileInputStream = new FileInputStream(q());
                try {
                    ?? r6 = this.f806b;
                    nVar.f873p = this;
                    nVar.f874q = fileInputStream;
                    nVar.f875r = null;
                    nVar.f878u = 1;
                    objA = r6.a(fileInputStream, nVar);
                    if (objA == objC) {
                        return objC;
                    }
                    th = null;
                    r22 = fileInputStream;
                    return objA;
                } catch (Throwable th3) {
                    th = th3;
                    nVar = this;
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
                nVar = this;
                if (nVar.q().exists()) {
                    throw e;
                }
                return nVar.f806b.b();
            }
        } catch (FileNotFoundException e8) {
            e = e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(InterfaceC1885d interfaceC1885d) throws IOException {
        o oVar;
        m mVar;
        Object objA;
        C.a aVar;
        m mVar2;
        C.a aVar2;
        if (interfaceC1885d instanceof o) {
            oVar = (o) interfaceC1885d;
            int i7 = oVar.f883t;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                oVar.f883t = i7 - Integer.MIN_VALUE;
            } else {
                oVar = new o(interfaceC1885d);
            }
        }
        Object objW = oVar.f881r;
        Object objC = AbstractC1930b.c();
        int i8 = oVar.f883t;
        if (i8 == 0) {
            i5.n.b(objW);
            try {
                oVar.f879p = this;
                oVar.f883t = 1;
                objW = w(oVar);
                return objW == objC ? objC : objW;
            } catch (C.a e7) {
                e = e7;
                mVar = this;
                C.b bVar = mVar.f807c;
                oVar.f879p = mVar;
                oVar.f880q = e;
                oVar.f883t = 2;
                objA = bVar.a(e, oVar);
                if (objA != objC) {
                }
            }
        } else if (i8 == 1) {
            mVar = (m) oVar.f879p;
            try {
                i5.n.b(objW);
            } catch (C.a e8) {
                e = e8;
                C.b bVar2 = mVar.f807c;
                oVar.f879p = mVar;
                oVar.f880q = e;
                oVar.f883t = 2;
                objA = bVar2.a(e, oVar);
                if (objA != objC) {
                    return objC;
                }
                m mVar3 = mVar;
                aVar = e;
                objW = objA;
                mVar2 = mVar3;
                oVar.f879p = aVar;
                oVar.f880q = objW;
                oVar.f883t = 3;
                if (mVar2.z(objW, oVar) != objC) {
                }
            }
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = oVar.f880q;
                aVar2 = (C.a) oVar.f879p;
                try {
                    i5.n.b(objW);
                    return obj;
                } catch (IOException e9) {
                    e = e9;
                    AbstractC1744a.a(aVar2, e);
                    throw aVar2;
                }
            }
            aVar = (C.a) oVar.f880q;
            mVar2 = (m) oVar.f879p;
            i5.n.b(objW);
        }
        try {
            oVar.f879p = aVar;
            oVar.f880q = objW;
            oVar.f883t = 3;
            return mVar2.z(objW, oVar) != objC ? objC : objW;
        } catch (IOException e10) {
            e = e10;
            aVar2 = aVar;
            AbstractC1744a.a(aVar2, e);
            throw aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(v5.p pVar, InterfaceC1888g interfaceC1888g, InterfaceC1885d interfaceC1885d) {
        p pVar2;
        C.c cVar;
        Object obj;
        m mVar;
        m mVar2;
        if (interfaceC1885d instanceof p) {
            pVar2 = (p) interfaceC1885d;
            int i7 = pVar2.f889u;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                pVar2.f889u = i7 - Integer.MIN_VALUE;
            } else {
                pVar2 = new p(interfaceC1885d);
            }
        }
        Object obj2 = pVar2.f887s;
        Object objC = AbstractC1930b.c();
        int i8 = pVar2.f889u;
        if (i8 == 0) {
            i5.n.b(obj2);
            C.c cVar2 = (C.c) this.f812h.getValue();
            cVar2.a();
            Object objB = cVar2.b();
            q qVar = new q(pVar, objB, null);
            pVar2.f884p = this;
            pVar2.f885q = cVar2;
            pVar2.f886r = objB;
            pVar2.f889u = 1;
            Object objG = AbstractC0394g.g(interfaceC1888g, qVar, pVar2);
            if (objG == objC) {
                return objC;
            }
            cVar = cVar2;
            obj2 = objG;
            obj = objB;
            mVar = this;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = pVar2.f885q;
                mVar2 = (m) pVar2.f884p;
                i5.n.b(obj2);
                mVar2.f812h.setValue(new C.c(obj, obj == null ? obj.hashCode() : 0));
                return obj;
            }
            obj = pVar2.f886r;
            cVar = (C.c) pVar2.f885q;
            mVar = (m) pVar2.f884p;
            i5.n.b(obj2);
        }
        cVar.a();
        if (!w5.k.b(obj, obj2)) {
            pVar2.f884p = mVar;
            pVar2.f885q = obj2;
            pVar2.f886r = null;
            pVar2.f889u = 2;
            if (mVar.z(obj2, pVar2) == objC) {
                return objC;
            }
            obj = obj2;
            mVar2 = mVar;
            mVar2.f812h.setValue(new C.c(obj, obj == null ? obj.hashCode() : 0));
        }
        return obj;
    }

    @Override // C.f
    public Object a(v5.p pVar, InterfaceC1885d interfaceC1885d) throws Throwable {
        InterfaceC0418u interfaceC0418uB = AbstractC0420w.b(null, 1, null);
        this.f814j.e(new b.C0008b(pVar, interfaceC0418uB, (C.n) this.f812h.getValue(), interfaceC1885d.a()));
        return interfaceC0418uB.f(interfaceC1885d);
    }

    @Override // C.f
    public K5.b getData() {
        return this.f809e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(Object obj, InterfaceC1885d interfaceC1885d) throws IOException {
        r rVar;
        ?? file;
        ?? fileOutputStream;
        m mVar;
        ?? r8;
        Throwable th;
        if (interfaceC1885d instanceof r) {
            rVar = (r) interfaceC1885d;
            int i7 = rVar.f900w;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                rVar.f900w = i7 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC1885d);
            }
        }
        Object obj2 = rVar.f898u;
        Object objC = AbstractC1930b.c();
        int i8 = rVar.f900w;
        ?? r32 = 1;
        try {
            if (i8 == 0) {
                i5.n.b(obj2);
                p(q());
                file = new File(w5.k.m(q().getAbsolutePath(), this.f810f));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        C.k kVar = this.f806b;
                        c cVar = new c(fileOutputStream);
                        rVar.f893p = this;
                        rVar.f894q = file;
                        rVar.f895r = fileOutputStream;
                        rVar.f896s = null;
                        rVar.f897t = fileOutputStream;
                        rVar.f900w = 1;
                        if (kVar.c(obj, cVar, rVar) == objC) {
                            return objC;
                        }
                        mVar = this;
                        r32 = file;
                        r8 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r32 = file;
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) rVar.f897t;
                th = (Throwable) rVar.f896s;
                fileOutputStream = (Closeable) rVar.f895r;
                r32 = (File) rVar.f894q;
                mVar = (m) rVar.f893p;
                try {
                    i5.n.b(obj2);
                    fileOutputStream = fileOutputStream;
                    r32 = r32;
                    r8 = fileOutputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        AbstractC2070a.a(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            r8.getFD().sync();
            u uVar = u.f19985a;
            AbstractC2070a.a(fileOutputStream, th);
            if (r32.renameTo(mVar.q())) {
                return u.f19985a;
            }
            throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e8) {
            e = e8;
            file = r32;
            if (file.exists()) {
            }
            throw e;
        }
    }
}
