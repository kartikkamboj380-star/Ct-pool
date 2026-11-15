package W5;

import d6.j;
import i5.C1747d;
import i5.u;
import i6.A;
import i6.C;
import i6.g;
import i6.h;
import i6.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f4209A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final X5.d f4210B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final e f4211C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final c6.a f4212D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final File f4213E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f4214F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f4215G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f4217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final File f4218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final File f4219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private g f4221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinkedHashMap f4222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f4223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f4228y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4229z;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final a f4208S = new a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f4197H = "journal";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f4198I = "journal.tmp";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f4199J = "journal.bkp";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f4200K = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f4201L = "1";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final long f4202M = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final F5.f f4203N = new F5.f("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f4204O = "CLEAN";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f4205P = "DIRTY";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f4206Q = "REMOVE";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f4207R = "READ";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean[] f4230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f4231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f4232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f4233d;

        static final class a extends l implements v5.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f4235n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i7) {
                super(1);
                this.f4235n = i7;
            }

            public final void a(IOException iOException) {
                k.f(iOException, "it");
                synchronized (b.this.f4233d) {
                    b.this.c();
                    u uVar = u.f19985a;
                }
            }

            @Override // v5.l
            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((IOException) obj);
                return u.f19985a;
            }
        }

        public b(d dVar, c cVar) {
            k.f(cVar, "entry");
            this.f4233d = dVar;
            this.f4232c = cVar;
            this.f4230a = cVar.g() ? null : new boolean[dVar.h0()];
        }

        public final void a() {
            synchronized (this.f4233d) {
                try {
                    if (!(!this.f4231b)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (k.b(this.f4232c.b(), this)) {
                        this.f4233d.o(this, false);
                    }
                    this.f4231b = true;
                    u uVar = u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.f4233d) {
                try {
                    if (!(!this.f4231b)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (k.b(this.f4232c.b(), this)) {
                        this.f4233d.o(this, true);
                    }
                    this.f4231b = true;
                    u uVar = u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (k.b(this.f4232c.b(), this)) {
                if (this.f4233d.f4225v) {
                    this.f4233d.o(this, false);
                } else {
                    this.f4232c.q(true);
                }
            }
        }

        public final c d() {
            return this.f4232c;
        }

        public final boolean[] e() {
            return this.f4230a;
        }

        public final A f(int i7) {
            synchronized (this.f4233d) {
                if (!(!this.f4231b)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!k.b(this.f4232c.b(), this)) {
                    return q.b();
                }
                if (!this.f4232c.g()) {
                    boolean[] zArr = this.f4230a;
                    k.c(zArr);
                    zArr[i7] = true;
                }
                try {
                    return new W5.e(this.f4233d.a0().b((File) this.f4232c.c().get(i7)), new a(i7));
                } catch (FileNotFoundException unused) {
                    return q.b();
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f4236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f4237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f4238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b f4241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f4243h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f4244i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f4245j;

        public static final class a extends i6.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private boolean f4246n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ C f4248p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C c7, C c8) {
                super(c8);
                this.f4248p = c7;
            }

            @Override // i6.l, i6.C, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f4246n) {
                    return;
                }
                this.f4246n = true;
                synchronized (c.this.f4245j) {
                    try {
                        c.this.n(r1.f() - 1);
                        if (c.this.f() == 0 && c.this.i()) {
                            c cVar = c.this;
                            cVar.f4245j.b1(cVar);
                        }
                        u uVar = u.f19985a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(d dVar, String str) {
            k.f(str, "key");
            this.f4245j = dVar;
            this.f4244i = str;
            this.f4236a = new long[dVar.h0()];
            this.f4237b = new ArrayList();
            this.f4238c = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int iH0 = dVar.h0();
            for (int i7 = 0; i7 < iH0; i7++) {
                sb.append(i7);
                this.f4237b.add(new File(dVar.W(), sb.toString()));
                sb.append(".tmp");
                this.f4238c.add(new File(dVar.W(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final C k(int i7) {
            C cA = this.f4245j.a0().a((File) this.f4237b.get(i7));
            if (this.f4245j.f4225v) {
                return cA;
            }
            this.f4242g++;
            return new a(cA, cA);
        }

        public final List a() {
            return this.f4237b;
        }

        public final b b() {
            return this.f4241f;
        }

        public final List c() {
            return this.f4238c;
        }

        public final String d() {
            return this.f4244i;
        }

        public final long[] e() {
            return this.f4236a;
        }

        public final int f() {
            return this.f4242g;
        }

        public final boolean g() {
            return this.f4239d;
        }

        public final long h() {
            return this.f4243h;
        }

        public final boolean i() {
            return this.f4240e;
        }

        public final void l(b bVar) {
            this.f4241f = bVar;
        }

        public final void m(List list) throws IOException {
            k.f(list, "strings");
            if (list.size() != this.f4245j.h0()) {
                j(list);
                throw new C1747d();
            }
            try {
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f4236a[i7] = Long.parseLong((String) list.get(i7));
                }
            } catch (NumberFormatException unused) {
                j(list);
                throw new C1747d();
            }
        }

        public final void n(int i7) {
            this.f4242g = i7;
        }

        public final void o(boolean z6) {
            this.f4239d = z6;
        }

        public final void p(long j7) {
            this.f4243h = j7;
        }

        public final void q(boolean z6) {
            this.f4240e = z6;
        }

        public final C0096d r() {
            d dVar = this.f4245j;
            if (U5.c.f3990h && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            }
            if (!this.f4239d) {
                return null;
            }
            if (!this.f4245j.f4225v && (this.f4241f != null || this.f4240e)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f4236a.clone();
            try {
                int iH0 = this.f4245j.h0();
                for (int i7 = 0; i7 < iH0; i7++) {
                    arrayList.add(k(i7));
                }
                return new C0096d(this.f4245j, this.f4244i, this.f4243h, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    U5.c.j((C) it.next());
                }
                try {
                    this.f4245j.b1(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(g gVar) {
            k.f(gVar, "writer");
            for (long j7 : this.f4236a) {
                gVar.P(32).X0(j7);
            }
        }
    }

    /* JADX INFO: renamed from: W5.d$d, reason: collision with other inner class name */
    public final class C0096d implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f4249m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f4250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final List f4251o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final long[] f4252p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f4253q;

        public C0096d(d dVar, String str, long j7, List list, long[] jArr) {
            k.f(str, "key");
            k.f(list, "sources");
            k.f(jArr, "lengths");
            this.f4253q = dVar;
            this.f4249m = str;
            this.f4250n = j7;
            this.f4251o = list;
            this.f4252p = jArr;
        }

        public final b a() {
            return this.f4253q.z(this.f4249m, this.f4250n);
        }

        public final C b(int i7) {
            return (C) this.f4251o.get(i7);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f4251o.iterator();
            while (it.hasNext()) {
                U5.c.j((C) it.next());
            }
        }
    }

    public static final class e extends X5.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // X5.a
        public long f() {
            synchronized (d.this) {
                if (!d.this.f4226w || d.this.U()) {
                    return -1L;
                }
                try {
                    d.this.h1();
                } catch (IOException unused) {
                    d.this.f4228y = true;
                }
                try {
                    if (d.this.n0()) {
                        d.this.R0();
                        d.this.f4223t = 0;
                    }
                } catch (IOException unused2) {
                    d.this.f4229z = true;
                    d.this.f4221r = q.c(q.b());
                }
                return -1L;
            }
        }
    }

    static final class f extends l implements v5.l {
        f() {
            super(1);
        }

        public final void a(IOException iOException) {
            k.f(iOException, "it");
            d dVar = d.this;
            if (!U5.c.f3990h || Thread.holdsLock(dVar)) {
                d.this.f4224u = true;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((IOException) obj);
            return u.f19985a;
        }
    }

    public d(c6.a aVar, File file, int i7, int i8, long j7, X5.e eVar) {
        k.f(aVar, "fileSystem");
        k.f(file, "directory");
        k.f(eVar, "taskRunner");
        this.f4212D = aVar;
        this.f4213E = file;
        this.f4214F = i7;
        this.f4215G = i8;
        this.f4216m = j7;
        this.f4222s = new LinkedHashMap(0, 0.75f, true);
        this.f4210B = eVar.i();
        this.f4211C = new e(U5.c.f3991i + " Cache");
        if (!(j7 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i8 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f4217n = new File(file, f4197H);
        this.f4218o = new File(file, f4198I);
        this.f4219p = new File(file, f4199J);
    }

    public static /* synthetic */ b B(d dVar, String str, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = f4202M;
        }
        return dVar.z(str, j7);
    }

    private final g B0() {
        return q.c(new W5.e(this.f4212D.g(this.f4217n), new f()));
    }

    private final void D0() {
        this.f4212D.f(this.f4218o);
        Iterator it = this.f4222s.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            k.e(next, "i.next()");
            c cVar = (c) next;
            int i7 = 0;
            if (cVar.b() == null) {
                int i8 = this.f4215G;
                while (i7 < i8) {
                    this.f4220q += cVar.e()[i7];
                    i7++;
                }
            } else {
                cVar.l(null);
                int i9 = this.f4215G;
                while (i7 < i9) {
                    this.f4212D.f((File) cVar.a().get(i7));
                    this.f4212D.f((File) cVar.c().get(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    private final void H0() throws IOException {
        h hVarD = q.d(this.f4212D.a(this.f4217n));
        try {
            String strC0 = hVarD.C0();
            String strC02 = hVarD.C0();
            String strC03 = hVarD.C0();
            String strC04 = hVarD.C0();
            String strC05 = hVarD.C0();
            if ((!k.b(f4200K, strC0)) || (!k.b(f4201L, strC02)) || (!k.b(String.valueOf(this.f4214F), strC03)) || (!k.b(String.valueOf(this.f4215G), strC04)) || strC05.length() > 0) {
                throw new IOException("unexpected journal header: [" + strC0 + ", " + strC02 + ", " + strC04 + ", " + strC05 + ']');
            }
            int i7 = 0;
            while (true) {
                try {
                    M0(hVarD.C0());
                    i7++;
                } catch (EOFException unused) {
                    this.f4223t = i7 - this.f4222s.size();
                    if (hVarD.O()) {
                        this.f4221r = B0();
                    } else {
                        R0();
                    }
                    u uVar = u.f19985a;
                    AbstractC2070a.a(hVarD, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void M0(String str) throws IOException {
        String strSubstring;
        int iQ = F5.g.Q(str, ' ', 0, false, 6, null);
        if (iQ == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i7 = iQ + 1;
        int iQ2 = F5.g.Q(str, ' ', i7, false, 4, null);
        if (iQ2 == -1) {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i7);
            k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = f4206Q;
            if (iQ == str2.length() && F5.g.B(str, str2, false, 2, null)) {
                this.f4222s.remove(strSubstring);
                return;
            }
        } else {
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str.substring(i7, iQ2);
            k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.f4222s.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f4222s.put(strSubstring, cVar);
        }
        if (iQ2 != -1) {
            String str3 = f4204O;
            if (iQ == str3.length() && F5.g.B(str, str3, false, 2, null)) {
                int i8 = iQ2 + 1;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String strSubstring2 = str.substring(i8);
                k.e(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List listP0 = F5.g.p0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listP0);
                return;
            }
        }
        if (iQ2 == -1) {
            String str4 = f4205P;
            if (iQ == str4.length() && F5.g.B(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iQ2 == -1) {
            String str5 = f4207R;
            if (iQ == str5.length() && F5.g.B(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean f1() {
        for (c cVar : this.f4222s.values()) {
            if (!cVar.i()) {
                k.e(cVar, "toEvict");
                b1(cVar);
                return true;
            }
        }
        return false;
    }

    private final void i1(String str) {
        if (f4203N.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    private final synchronized void n() {
        if (!(!this.f4227x)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n0() {
        int i7 = this.f4223t;
        return i7 >= 2000 && i7 >= this.f4222s.size();
    }

    public final synchronized C0096d J(String str) {
        k.f(str, "key");
        j0();
        n();
        i1(str);
        c cVar = (c) this.f4222s.get(str);
        if (cVar == null) {
            return null;
        }
        k.e(cVar, "lruEntries[key] ?: return null");
        C0096d c0096dR = cVar.r();
        if (c0096dR == null) {
            return null;
        }
        this.f4223t++;
        g gVar = this.f4221r;
        k.c(gVar);
        gVar.k0(f4207R).P(32).k0(str).P(10);
        if (n0()) {
            X5.d.j(this.f4210B, this.f4211C, 0L, 2, null);
        }
        return c0096dR;
    }

    public final synchronized void R0() {
        try {
            g gVar = this.f4221r;
            if (gVar != null) {
                gVar.close();
            }
            g gVarC = q.c(this.f4212D.b(this.f4218o));
            try {
                gVarC.k0(f4200K).P(10);
                gVarC.k0(f4201L).P(10);
                gVarC.X0(this.f4214F).P(10);
                gVarC.X0(this.f4215G).P(10);
                gVarC.P(10);
                for (c cVar : this.f4222s.values()) {
                    if (cVar.b() != null) {
                        gVarC.k0(f4205P).P(32);
                        gVarC.k0(cVar.d());
                    } else {
                        gVarC.k0(f4204O).P(32);
                        gVarC.k0(cVar.d());
                        cVar.s(gVarC);
                    }
                    gVarC.P(10);
                }
                u uVar = u.f19985a;
                AbstractC2070a.a(gVarC, null);
                if (this.f4212D.d(this.f4217n)) {
                    this.f4212D.e(this.f4217n, this.f4219p);
                }
                this.f4212D.e(this.f4218o, this.f4217n);
                this.f4212D.f(this.f4219p);
                this.f4221r = B0();
                this.f4224u = false;
                this.f4229z = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean S0(String str) {
        k.f(str, "key");
        j0();
        n();
        i1(str);
        c cVar = (c) this.f4222s.get(str);
        if (cVar == null) {
            return false;
        }
        k.e(cVar, "lruEntries[key] ?: return false");
        boolean zB1 = b1(cVar);
        if (zB1 && this.f4220q <= this.f4216m) {
            this.f4228y = false;
        }
        return zB1;
    }

    public final boolean U() {
        return this.f4227x;
    }

    public final File W() {
        return this.f4213E;
    }

    public final c6.a a0() {
        return this.f4212D;
    }

    public final boolean b1(c cVar) {
        g gVar;
        k.f(cVar, "entry");
        if (!this.f4225v) {
            if (cVar.f() > 0 && (gVar = this.f4221r) != null) {
                gVar.k0(f4205P);
                gVar.P(32);
                gVar.k0(cVar.d());
                gVar.P(10);
                gVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b bVarB = cVar.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i7 = this.f4215G;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f4212D.f((File) cVar.a().get(i8));
            this.f4220q -= cVar.e()[i8];
            cVar.e()[i8] = 0;
        }
        this.f4223t++;
        g gVar2 = this.f4221r;
        if (gVar2 != null) {
            gVar2.k0(f4206Q);
            gVar2.P(32);
            gVar2.k0(cVar.d());
            gVar2.P(10);
        }
        this.f4222s.remove(cVar.d());
        if (n0()) {
            X5.d.j(this.f4210B, this.f4211C, 0L, 2, null);
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f4226w && !this.f4227x) {
                Collection collectionValues = this.f4222s.values();
                k.e(collectionValues, "lruEntries.values");
                Object[] array = collectionValues.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (c cVar : (c[]) array) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                h1();
                g gVar = this.f4221r;
                k.c(gVar);
                gVar.close();
                this.f4221r = null;
                this.f4227x = true;
                return;
            }
            this.f4227x = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f4226w) {
            n();
            h1();
            g gVar = this.f4221r;
            k.c(gVar);
            gVar.flush();
        }
    }

    public final int h0() {
        return this.f4215G;
    }

    public final void h1() {
        while (this.f4220q > this.f4216m) {
            if (!f1()) {
                return;
            }
        }
        this.f4228y = false;
    }

    public final synchronized void j0() {
        try {
            if (U5.c.f3990h && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                k.e(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.f4226w) {
                return;
            }
            if (this.f4212D.d(this.f4219p)) {
                if (this.f4212D.d(this.f4217n)) {
                    this.f4212D.f(this.f4219p);
                } else {
                    this.f4212D.e(this.f4219p, this.f4217n);
                }
            }
            this.f4225v = U5.c.C(this.f4212D, this.f4219p);
            if (this.f4212D.d(this.f4217n)) {
                try {
                    H0();
                    D0();
                    this.f4226w = true;
                    return;
                } catch (IOException e7) {
                    j.f18715c.g().k("DiskLruCache " + this.f4213E + " is corrupt: " + e7.getMessage() + ", removing", 5, e7);
                    try {
                        w();
                        this.f4227x = false;
                        R0();
                        this.f4226w = true;
                    } catch (Throwable th) {
                        this.f4227x = false;
                        throw th;
                    }
                }
            }
            R0();
            this.f4226w = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void o(b bVar, boolean z6) {
        k.f(bVar, "editor");
        c cVarD = bVar.d();
        if (!k.b(cVarD.b(), bVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z6 && !cVarD.g()) {
            int i7 = this.f4215G;
            for (int i8 = 0; i8 < i7; i8++) {
                boolean[] zArrE = bVar.e();
                k.c(zArrE);
                if (!zArrE[i8]) {
                    bVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                }
                if (!this.f4212D.d((File) cVarD.c().get(i8))) {
                    bVar.a();
                    return;
                }
            }
        }
        int i9 = this.f4215G;
        for (int i10 = 0; i10 < i9; i10++) {
            File file = (File) cVarD.c().get(i10);
            if (!z6 || cVarD.i()) {
                this.f4212D.f(file);
            } else if (this.f4212D.d(file)) {
                File file2 = (File) cVarD.a().get(i10);
                this.f4212D.e(file, file2);
                long j7 = cVarD.e()[i10];
                long jH = this.f4212D.h(file2);
                cVarD.e()[i10] = jH;
                this.f4220q = (this.f4220q - j7) + jH;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            b1(cVarD);
            return;
        }
        this.f4223t++;
        g gVar = this.f4221r;
        k.c(gVar);
        if (cVarD.g() || z6) {
            cVarD.o(true);
            gVar.k0(f4204O).P(32);
            gVar.k0(cVarD.d());
            cVarD.s(gVar);
            gVar.P(10);
            if (z6) {
                long j8 = this.f4209A;
                this.f4209A = 1 + j8;
                cVarD.p(j8);
            }
        } else {
            this.f4222s.remove(cVarD.d());
            gVar.k0(f4206Q).P(32);
            gVar.k0(cVarD.d());
            gVar.P(10);
        }
        gVar.flush();
        if (this.f4220q > this.f4216m || n0()) {
            X5.d.j(this.f4210B, this.f4211C, 0L, 2, null);
        }
    }

    public final void w() {
        close();
        this.f4212D.c(this.f4213E);
    }

    public final synchronized b z(String str, long j7) {
        k.f(str, "key");
        j0();
        n();
        i1(str);
        c cVar = (c) this.f4222s.get(str);
        if (j7 != f4202M && (cVar == null || cVar.h() != j7)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f4228y && !this.f4229z) {
            g gVar = this.f4221r;
            k.c(gVar);
            gVar.k0(f4205P).P(32).k0(str).P(10);
            gVar.flush();
            if (this.f4224u) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str);
                this.f4222s.put(str, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        X5.d.j(this.f4210B, this.f4211C, 0L, 2, null);
        return null;
    }
}
