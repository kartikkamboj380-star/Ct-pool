package J0;

import I0.a;
import I0.c;
import J0.i;
import T0.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class j implements n, L0.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f1606r = j.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f1607s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f1608t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f1610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f1611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f1612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I0.c f1613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f1614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f1615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f1616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T0.a f1617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f1618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m f1619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final I0.a f1620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f1621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f1622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final V0.a f1623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f1624p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f1625q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (j.this.f1624p) {
                j.this.p();
            }
            j.this.f1625q = true;
            j.this.f1611c.countDown();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1627a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f1628b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f1629c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f1629c;
        }

        public synchronized long b() {
            return this.f1628b;
        }

        public synchronized void c(long j7, long j8) {
            if (this.f1627a) {
                this.f1628b += j7;
                this.f1629c += j8;
            }
        }

        public synchronized boolean d() {
            return this.f1627a;
        }

        public synchronized void e() {
            this.f1627a = false;
            this.f1629c = -1L;
            this.f1628b = -1L;
        }

        public synchronized void f(long j7, long j8) {
            this.f1629c = j8;
            this.f1628b = j7;
            this.f1627a = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f1632c;

        public c(long j7, long j8, long j9) {
            this.f1630a = j7;
            this.f1631b = j8;
            this.f1632c = j9;
        }
    }

    public j(i iVar, m mVar, c cVar, I0.c cVar2, I0.a aVar, L0.b bVar, Executor executor, boolean z6) {
        this.f1609a = cVar.f1631b;
        long j7 = cVar.f1632c;
        this.f1610b = j7;
        this.f1612d = j7;
        this.f1617i = T0.a.d();
        this.f1618j = iVar;
        this.f1619k = mVar;
        this.f1615g = -1L;
        this.f1613e = cVar2;
        this.f1616h = cVar.f1630a;
        this.f1620l = aVar;
        this.f1622n = new b();
        this.f1623o = V0.d.a();
        this.f1621m = z6;
        this.f1614f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z6) {
            this.f1611c = new CountDownLatch(0);
        } else {
            this.f1611c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private H0.a l(i.b bVar, I0.d dVar, String str) {
        H0.a aVarD;
        synchronized (this.f1624p) {
            aVarD = bVar.d(dVar);
            this.f1614f.add(str);
            this.f1622n.c(aVarD.size(), 1L);
        }
        return aVarD;
    }

    private void m(long j7, c.a aVar) throws IOException {
        try {
            Collection<i.a> collectionN = n(this.f1618j.h());
            long jB = this.f1622n.b();
            long j8 = jB - j7;
            int i7 = 0;
            long j9 = 0;
            for (i.a aVar2 : collectionN) {
                if (j9 > j8) {
                    break;
                }
                long jI = this.f1618j.i(aVar2);
                this.f1614f.remove(aVar2.getId());
                if (jI > 0) {
                    i7++;
                    j9 += jI;
                    o oVarE = o.a().j(aVar2.getId()).g(aVar).i(jI).f(jB - j9).e(j7);
                    this.f1613e.g(oVarE);
                    oVarE.b();
                }
            }
            this.f1622n.c(-j9, -i7);
            this.f1618j.c();
        } catch (IOException e7) {
            this.f1620l.a(a.EnumC0026a.EVICTION, f1606r, "evictAboveSize: " + e7.getMessage(), e7);
            throw e7;
        }
    }

    private Collection n(Collection collection) {
        long jNow = this.f1623o.now() + f1607s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i.a aVar = (i.a) it.next();
            if (aVar.a() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f1619k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f1624p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f1622n.b();
                if (jB > this.f1612d && !zP) {
                    this.f1622n.e();
                    p();
                }
                long j7 = this.f1612d;
                if (jB > j7) {
                    m((j7 * 9) / 10, c.a.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f1623o.now();
        if (this.f1622n.d()) {
            long j7 = this.f1615g;
            if (j7 != -1 && jNow - j7 <= f1608t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        long j7;
        long jNow = this.f1623o.now();
        long j8 = f1607s + jNow;
        Set hashSet = (this.f1621m && this.f1614f.isEmpty()) ? this.f1614f : this.f1621m ? new HashSet() : null;
        try {
            long jN = 0;
            long jMax = -1;
            int iN = 0;
            boolean z6 = false;
            int i7 = 0;
            int i8 = 0;
            for (i.a aVar : this.f1618j.h()) {
                i7++;
                jN += aVar.n();
                if (aVar.a() > j8) {
                    i8++;
                    iN = (int) (((long) iN) + aVar.n());
                    j7 = j8;
                    jMax = Math.max(aVar.a() - jNow, jMax);
                    z6 = true;
                } else {
                    j7 = j8;
                    if (this.f1621m) {
                        O0.l.g(hashSet);
                        hashSet.add(aVar.getId());
                    }
                }
                j8 = j7;
            }
            if (z6) {
                this.f1620l.a(a.EnumC0026a.READ_INVALID_ENTRY, f1606r, "Future timestamp found in " + i8 + " files , with a total size of " + iN + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j9 = i7;
            if (this.f1622n.a() != j9 || this.f1622n.b() != jN) {
                if (this.f1621m && this.f1614f != hashSet) {
                    O0.l.g(hashSet);
                    this.f1614f.clear();
                    this.f1614f.addAll(hashSet);
                }
                this.f1622n.f(jN, j9);
            }
            this.f1615g = jNow;
            return true;
        } catch (IOException e7) {
            this.f1620l.a(a.EnumC0026a.GENERIC_IO, f1606r, "calcFileCacheSize: " + e7.getMessage(), e7);
            return false;
        }
    }

    private i.b r(String str, I0.d dVar) {
        o();
        return this.f1618j.d(str, dVar);
    }

    private void s() {
        this.f1612d = this.f1617i.f(this.f1618j.b() ? a.EnumC0068a.EXTERNAL : a.EnumC0068a.INTERNAL, this.f1610b - this.f1622n.b()) ? this.f1609a : this.f1610b;
    }

    @Override // J0.n
    public void a() {
        synchronized (this.f1624p) {
            try {
                this.f1618j.a();
                this.f1614f.clear();
                this.f1613e.d();
            } catch (IOException | NullPointerException e7) {
                this.f1620l.a(a.EnumC0026a.EVICTION, f1606r, "clearAll: " + e7.getMessage(), e7);
            }
            this.f1622n.e();
        }
    }

    @Override // J0.n
    public void b(I0.d dVar) {
        synchronized (this.f1624p) {
            try {
                List listB = I0.e.b(dVar);
                for (int i7 = 0; i7 < listB.size(); i7++) {
                    String str = (String) listB.get(i7);
                    this.f1618j.remove(str);
                    this.f1614f.remove(str);
                }
            } catch (IOException e7) {
                this.f1620l.a(a.EnumC0026a.DELETE_FILE, f1606r, "delete: " + e7.getMessage(), e7);
            }
        }
    }

    @Override // J0.n
    public boolean c(I0.d dVar) {
        synchronized (this.f1624p) {
            try {
                List listB = I0.e.b(dVar);
                for (int i7 = 0; i7 < listB.size(); i7++) {
                    if (this.f1614f.contains((String) listB.get(i7))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J0.n
    public H0.a d(I0.d dVar, I0.j jVar) {
        String strA;
        o oVarD = o.a().d(dVar);
        this.f1613e.e(oVarD);
        synchronized (this.f1624p) {
            strA = I0.e.a(dVar);
        }
        oVarD.j(strA);
        try {
            try {
                i.b bVarR = r(strA, dVar);
                try {
                    bVarR.e(jVar, dVar);
                    H0.a aVarL = l(bVarR, dVar, strA);
                    oVarD.i(aVarL.size()).f(this.f1622n.b());
                    this.f1613e.b(oVarD);
                    return aVarL;
                } finally {
                    if (!bVarR.c()) {
                        P0.a.f(f1606r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e7) {
                oVarD.h(e7);
                this.f1613e.c(oVarD);
                P0.a.g(f1606r, "Failed inserting a file into the cache", e7);
                throw e7;
            }
        } finally {
            oVarD.b();
        }
    }

    @Override // J0.n
    public H0.a e(I0.d dVar) {
        H0.a aVarG;
        o oVarD = o.a().d(dVar);
        try {
            synchronized (this.f1624p) {
                try {
                    List listB = I0.e.b(dVar);
                    String str = null;
                    aVarG = null;
                    for (int i7 = 0; i7 < listB.size(); i7++) {
                        str = (String) listB.get(i7);
                        oVarD.j(str);
                        aVarG = this.f1618j.g(str, dVar);
                        if (aVarG != null) {
                            break;
                        }
                    }
                    if (aVarG == null) {
                        this.f1613e.f(oVarD);
                        this.f1614f.remove(str);
                    } else {
                        O0.l.g(str);
                        this.f1613e.h(oVarD);
                        this.f1614f.add(str);
                    }
                } finally {
                }
            }
            return aVarG;
        } catch (IOException e7) {
            this.f1620l.a(a.EnumC0026a.GENERIC_IO, f1606r, "getResource", e7);
            oVarD.h(e7);
            this.f1613e.a(oVarD);
            return null;
        } finally {
            oVarD.b();
        }
    }

    @Override // J0.n
    public boolean f(I0.d dVar) throws Throwable {
        String str;
        IOException e7;
        String str2 = null;
        try {
            try {
                synchronized (this.f1624p) {
                    try {
                        List listB = I0.e.b(dVar);
                        int i7 = 0;
                        while (i7 < listB.size()) {
                            String str3 = (String) listB.get(i7);
                            if (this.f1618j.e(str3, dVar)) {
                                this.f1614f.add(str3);
                                return true;
                            }
                            i7++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e8) {
                            e7 = e8;
                            o oVarH = o.a().d(dVar).j(str).h(e7);
                            this.f1613e.a(oVarH);
                            oVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            str = null;
            e7 = e9;
        }
    }

    @Override // J0.n
    public boolean g(I0.d dVar) {
        synchronized (this.f1624p) {
            if (c(dVar)) {
                return true;
            }
            try {
                List listB = I0.e.b(dVar);
                for (int i7 = 0; i7 < listB.size(); i7++) {
                    String str = (String) listB.get(i7);
                    if (this.f1618j.f(str, dVar)) {
                        this.f1614f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }
}
