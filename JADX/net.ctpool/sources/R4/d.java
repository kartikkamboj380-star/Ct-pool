package R4;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final R4.c f2851A = R4.b.f2843m;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final p f2852B = o.f2897m;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final p f2853C = o.f2898n;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final String f2854z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f2855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f2856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T4.c f2857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U4.e f2858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List f2859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final T4.d f2860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final R4.c f2861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f2862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f2863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f2864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f2865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f2866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f2867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f2868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f2869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f2870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f2871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f2872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f2873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final m f2874t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List f2875u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List f2876v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final p f2877w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final p f2878x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List f2879y;

    class a extends q {
        a() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Double.valueOf(aVar.W());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
                return;
            }
            double dDoubleValue = number.doubleValue();
            d.d(dDoubleValue);
            cVar.M0(dDoubleValue);
        }
    }

    class b extends q {
        b() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Float.valueOf((float) aVar.W());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
                return;
            }
            float fFloatValue = number.floatValue();
            d.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.b1(number);
        }
    }

    class c extends q {
        c() {
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(Y4.a aVar) throws IOException {
            if (aVar.R0() != Y4.b.NULL) {
                return Long.valueOf(aVar.h0());
            }
            aVar.B0();
            return null;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.J();
            } else {
                cVar.f1(number.toString());
            }
        }
    }

    /* JADX INFO: renamed from: R4.d$d, reason: collision with other inner class name */
    class C0063d extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f2882a;

        C0063d(q qVar) {
            this.f2882a = qVar;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(Y4.a aVar) {
            return new AtomicLong(((Number) this.f2882a.b(aVar)).longValue());
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, AtomicLong atomicLong) {
            this.f2882a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f2883a;

        e(q qVar) {
            this.f2883a = qVar;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(Y4.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.w()) {
                arrayList.add(Long.valueOf(((Number) this.f2883a.b(aVar)).longValue()));
            }
            aVar.g();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i7 = 0; i7 < size; i7++) {
                atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
            }
            return atomicLongArray;
        }

        @Override // R4.q
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(Y4.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                this.f2883a.d(cVar, Long.valueOf(atomicLongArray.get(i7)));
            }
            cVar.g();
        }
    }

    static class f extends U4.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f2884a = null;

        f() {
        }

        private q f() {
            q qVar = this.f2884a;
            if (qVar != null) {
                return qVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // R4.q
        public Object b(Y4.a aVar) {
            return f().b(aVar);
        }

        @Override // R4.q
        public void d(Y4.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // U4.k
        public q e() {
            return f();
        }

        public void g(q qVar) {
            if (this.f2884a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f2884a = qVar;
        }
    }

    public d() {
        this(T4.d.f3231s, f2851A, Collections.emptyMap(), false, false, false, true, false, false, false, true, m.f2889m, f2854z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f2852B, f2853C, Collections.emptyList());
    }

    private static void a(Object obj, Y4.a aVar) {
        if (obj != null) {
            try {
                if (aVar.R0() == Y4.b.END_DOCUMENT) {
                } else {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (Y4.d e7) {
                throw new l(e7);
            } catch (IOException e8) {
                throw new g(e8);
            }
        }
    }

    private static q b(q qVar) {
        return new C0063d(qVar).a();
    }

    private static q c(q qVar) {
        return new e(qVar).a();
    }

    static void d(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7)) {
            throw new IllegalArgumentException(d7 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private q e(boolean z6) {
        return z6 ? U4.m.f3960v : new a();
    }

    private q f(boolean z6) {
        return z6 ? U4.m.f3959u : new b();
    }

    private static q n(m mVar) {
        return mVar == m.f2889m ? U4.m.f3958t : new c();
    }

    public Object g(Y4.a aVar, TypeToken typeToken) {
        boolean z6 = aVar.z();
        boolean z7 = true;
        aVar.i1(true);
        try {
            try {
                try {
                    aVar.R0();
                    z7 = false;
                    return k(typeToken).b(aVar);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
                } catch (IllegalStateException e8) {
                    throw new l(e8);
                }
            } catch (EOFException e9) {
                if (!z7) {
                    throw new l(e9);
                }
                aVar.i1(z6);
                return null;
            } catch (IOException e10) {
                throw new l(e10);
            }
        } finally {
            aVar.i1(z6);
        }
    }

    public Object h(Reader reader, TypeToken typeToken) {
        Y4.a aVarO = o(reader);
        Object objG = g(aVarO, typeToken);
        a(objG, aVarO);
        return objG;
    }

    public Object i(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), typeToken);
    }

    public Object j(String str, Type type) {
        return i(str, TypeToken.get(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.g(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q k(TypeToken typeToken) {
        boolean z6;
        Objects.requireNonNull(typeToken, "type must not be null");
        q qVar = (q) this.f2856b.get(typeToken);
        if (qVar != null) {
            return qVar;
        }
        Map map = (Map) this.f2855a.get();
        if (map == null) {
            map = new HashMap();
            this.f2855a.set(map);
            z6 = true;
        } else {
            q qVar2 = (q) map.get(typeToken);
            if (qVar2 != null) {
                return qVar2;
            }
            z6 = false;
        }
        try {
            f fVar = new f();
            map.put(typeToken, fVar);
            Iterator it = this.f2859e.iterator();
            q qVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qVarA = ((r) it.next()).a(this, typeToken);
                if (qVarA != null) {
                    break;
                }
            }
            if (qVarA != null) {
                if (z6) {
                    this.f2856b.putAll(map);
                }
                return qVarA;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } finally {
            if (z6) {
                this.f2855a.remove();
            }
        }
    }

    public q l(Class cls) {
        return k(TypeToken.get(cls));
    }

    public q m(r rVar, TypeToken typeToken) {
        if (!this.f2859e.contains(rVar)) {
            rVar = this.f2858d;
        }
        boolean z6 = false;
        for (r rVar2 : this.f2859e) {
            if (z6) {
                q qVarA = rVar2.a(this, typeToken);
                if (qVarA != null) {
                    return qVarA;
                }
            } else if (rVar2 == rVar) {
                z6 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public Y4.a o(Reader reader) {
        Y4.a aVar = new Y4.a(reader);
        aVar.i1(this.f2868n);
        return aVar;
    }

    public Y4.c p(Writer writer) throws IOException {
        if (this.f2865k) {
            writer.write(")]}'\n");
        }
        Y4.c cVar = new Y4.c(writer);
        if (this.f2867m) {
            cVar.n0("  ");
        }
        cVar.j0(this.f2866l);
        cVar.B0(this.f2868n);
        cVar.D0(this.f2863i);
        return cVar;
    }

    public String q(R4.f fVar) {
        StringWriter stringWriter = new StringWriter();
        u(fVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        return obj == null ? q(h.f2886m) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(R4.f fVar, Y4.c cVar) {
        boolean zO = cVar.o();
        cVar.B0(true);
        boolean zN = cVar.n();
        cVar.j0(this.f2866l);
        boolean zL = cVar.l();
        cVar.D0(this.f2863i);
        try {
            try {
                T4.m.a(fVar, cVar);
            } catch (IOException e7) {
                throw new g(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e8.getMessage(), e8);
            }
        } finally {
            cVar.B0(zO);
            cVar.j0(zN);
            cVar.D0(zL);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f2863i + ",factories:" + this.f2859e + ",instanceCreators:" + this.f2857c + "}";
    }

    public void u(R4.f fVar, Appendable appendable) {
        try {
            t(fVar, p(T4.m.b(appendable)));
        } catch (IOException e7) {
            throw new g(e7);
        }
    }

    public void v(Object obj, Type type, Y4.c cVar) {
        q qVarK = k(TypeToken.get(type));
        boolean zO = cVar.o();
        cVar.B0(true);
        boolean zN = cVar.n();
        cVar.j0(this.f2866l);
        boolean zL = cVar.l();
        cVar.D0(this.f2863i);
        try {
            try {
                qVarK.d(cVar, obj);
            } catch (IOException e7) {
                throw new g(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e8.getMessage(), e8);
            }
        } finally {
            cVar.B0(zO);
            cVar.j0(zN);
            cVar.D0(zL);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, p(T4.m.b(appendable)));
        } catch (IOException e7) {
            throw new g(e7);
        }
    }

    d(T4.d dVar, R4.c cVar, Map map, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, m mVar, String str, int i7, int i8, List list, List list2, List list3, p pVar, p pVar2, List list4) {
        this.f2855a = new ThreadLocal();
        this.f2856b = new ConcurrentHashMap();
        this.f2860f = dVar;
        this.f2861g = cVar;
        this.f2862h = map;
        T4.c cVar2 = new T4.c(map, z13, list4);
        this.f2857c = cVar2;
        this.f2863i = z6;
        this.f2864j = z7;
        this.f2865k = z8;
        this.f2866l = z9;
        this.f2867m = z10;
        this.f2868n = z11;
        this.f2869o = z12;
        this.f2870p = z13;
        this.f2874t = mVar;
        this.f2871q = str;
        this.f2872r = i7;
        this.f2873s = i8;
        this.f2875u = list;
        this.f2876v = list2;
        this.f2877w = pVar;
        this.f2878x = pVar2;
        this.f2879y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(U4.m.f3937W);
        arrayList.add(U4.i.e(pVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(U4.m.f3917C);
        arrayList.add(U4.m.f3951m);
        arrayList.add(U4.m.f3945g);
        arrayList.add(U4.m.f3947i);
        arrayList.add(U4.m.f3949k);
        q qVarN = n(mVar);
        arrayList.add(U4.m.b(Long.TYPE, Long.class, qVarN));
        arrayList.add(U4.m.b(Double.TYPE, Double.class, e(z12)));
        arrayList.add(U4.m.b(Float.TYPE, Float.class, f(z12)));
        arrayList.add(U4.h.e(pVar2));
        arrayList.add(U4.m.f3953o);
        arrayList.add(U4.m.f3955q);
        arrayList.add(U4.m.a(AtomicLong.class, b(qVarN)));
        arrayList.add(U4.m.a(AtomicLongArray.class, c(qVarN)));
        arrayList.add(U4.m.f3957s);
        arrayList.add(U4.m.f3962x);
        arrayList.add(U4.m.f3919E);
        arrayList.add(U4.m.f3921G);
        arrayList.add(U4.m.a(BigDecimal.class, U4.m.f3964z));
        arrayList.add(U4.m.a(BigInteger.class, U4.m.f3915A));
        arrayList.add(U4.m.a(T4.g.class, U4.m.f3916B));
        arrayList.add(U4.m.f3923I);
        arrayList.add(U4.m.f3925K);
        arrayList.add(U4.m.f3929O);
        arrayList.add(U4.m.f3931Q);
        arrayList.add(U4.m.f3935U);
        arrayList.add(U4.m.f3927M);
        arrayList.add(U4.m.f3942d);
        arrayList.add(U4.c.f3862b);
        arrayList.add(U4.m.f3933S);
        if (X4.d.f4348a) {
            arrayList.add(X4.d.f4352e);
            arrayList.add(X4.d.f4351d);
            arrayList.add(X4.d.f4353f);
        }
        arrayList.add(U4.a.f3856c);
        arrayList.add(U4.m.f3940b);
        arrayList.add(new U4.b(cVar2));
        arrayList.add(new U4.g(cVar2, z7));
        U4.e eVar = new U4.e(cVar2);
        this.f2858d = eVar;
        arrayList.add(eVar);
        arrayList.add(U4.m.f3938X);
        arrayList.add(new U4.j(cVar2, cVar, dVar, eVar, list4));
        this.f2859e = Collections.unmodifiableList(arrayList);
    }
}
