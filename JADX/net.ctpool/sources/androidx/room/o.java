package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j5.AbstractC1787F;
import j5.AbstractC1794M;
import j5.AbstractC1809n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import k.C1813b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f8973q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f8974r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f8975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f8979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0660c f8980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f8981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f8982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile Z.k f8983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f8984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final m f8985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1813b f8986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f8987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f8988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f8989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f8990p;

    public static final class a {
        private a() {
        }

        public final void a(Z.g gVar) {
            w5.k.f(gVar, "database");
            if (gVar.N0()) {
                gVar.f0();
            } else {
                gVar.q();
            }
        }

        public final String b(String str, String str2) {
            w5.k.f(str, "tableName");
            w5.k.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f8991e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f8992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f8993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f8994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8995d;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(int i7) {
            this.f8992a = new long[i7];
            this.f8993b = new boolean[i7];
            this.f8994c = new int[i7];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f8995d) {
                        return null;
                    }
                    long[] jArr = this.f8992a;
                    int length = jArr.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = i8 + 1;
                        int i10 = 1;
                        boolean z6 = jArr[i7] > 0;
                        boolean[] zArr = this.f8993b;
                        if (z6 != zArr[i8]) {
                            int[] iArr = this.f8994c;
                            if (!z6) {
                                i10 = 2;
                            }
                            iArr[i8] = i10;
                        } else {
                            this.f8994c[i8] = 0;
                        }
                        zArr[i8] = z6;
                        i7++;
                        i8 = i9;
                    }
                    this.f8995d = false;
                    return (int[]) this.f8994c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z6;
            w5.k.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z6 = false;
                    for (int i7 : iArr) {
                        long[] jArr = this.f8992a;
                        long j7 = jArr[i7];
                        jArr[i7] = 1 + j7;
                        if (j7 == 0) {
                            this.f8995d = true;
                            z6 = true;
                        }
                    }
                    i5.u uVar = i5.u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z6;
        }

        public final boolean c(int... iArr) {
            boolean z6;
            w5.k.f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z6 = false;
                    for (int i7 : iArr) {
                        long[] jArr = this.f8992a;
                        long j7 = jArr[i7];
                        jArr[i7] = j7 - 1;
                        if (j7 == 1) {
                            this.f8995d = true;
                            z6 = true;
                        }
                    }
                    i5.u uVar = i5.u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z6;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f8993b, false);
                this.f8995d = true;
                i5.u uVar = i5.u.f19985a;
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f8996a;

        public c(String[] strArr) {
            w5.k.f(strArr, "tables");
            this.f8996a = strArr;
        }

        public final String[] a() {
            return this.f8996a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f8997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f8998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f8999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f9000d;

        public d(c cVar, int[] iArr, String[] strArr) {
            w5.k.f(cVar, "observer");
            w5.k.f(iArr, "tableIds");
            w5.k.f(strArr, "tableNames");
            this.f8997a = cVar;
            this.f8998b = iArr;
            this.f8999c = strArr;
            this.f9000d = (strArr.length == 0) ^ true ? AbstractC1794M.c(strArr[0]) : AbstractC1794M.d();
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final int[] a() {
            return this.f8998b;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(Set set) {
            Set setD;
            w5.k.f(set, "invalidatedTablesIds");
            int[] iArr = this.f8998b;
            int length = iArr.length;
            if (length != 0) {
                int i7 = 0;
                if (length != 1) {
                    Set setB = AbstractC1794M.b();
                    int[] iArr2 = this.f8998b;
                    int length2 = iArr2.length;
                    int i8 = 0;
                    while (i7 < length2) {
                        int i9 = i8 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i7]))) {
                            setB.add(this.f8999c[i8]);
                        }
                        i7++;
                        i8 = i9;
                    }
                    setD = AbstractC1794M.a(setB);
                } else {
                    setD = set.contains(Integer.valueOf(iArr[0])) ? this.f9000d : AbstractC1794M.d();
                }
            }
            if (!setD.isEmpty()) {
                this.f8997a.c(setD);
            }
        }

        public final void c(String[] strArr) {
            Set setD;
            w5.k.f(strArr, "tables");
            int length = this.f8999c.length;
            if (length == 0) {
                setD = AbstractC1794M.d();
            } else if (length != 1) {
                Set setB = AbstractC1794M.b();
                for (String str : strArr) {
                    for (String str2 : this.f8999c) {
                        if (F5.g.p(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = AbstractC1794M.a(setB);
            } else {
                for (String str3 : strArr) {
                    if (F5.g.p(str3, this.f8999c[0], true)) {
                        setD = this.f9000d;
                        break;
                    }
                }
                setD = AbstractC1794M.d();
            }
            if (!setD.isEmpty()) {
                this.f8997a.c(setD);
            }
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        private final Set a() throws IOException {
            o oVar = o.this;
            Set setB = AbstractC1794M.b();
            Cursor cursorQuery$default = u.query$default(oVar.f(), new Z.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorQuery$default.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                } finally {
                }
            }
            i5.u uVar = i5.u.f19985a;
            AbstractC2070a.a(cursorQuery$default, null);
            Set setA = AbstractC1794M.a(setB);
            if (!setA.isEmpty()) {
                if (o.this.e() == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Z.k kVarE = o.this.e();
                if (kVarE == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                kVarE.D();
            }
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            C0660c c0660c;
            C0660c c0660c2;
            Lock closeLock$room_runtime_release = o.this.f().getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                try {
                } finally {
                    closeLock$room_runtime_release.unlock();
                    c0660c2 = o.this.f8980f;
                    if (c0660c2 != null) {
                        c0660c2.e();
                    }
                }
            } catch (SQLiteException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                setD = AbstractC1794M.d();
                closeLock$room_runtime_release.unlock();
                c0660c = o.this.f8980f;
                if (c0660c != null) {
                }
            } catch (IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                setD = AbstractC1794M.d();
                closeLock$room_runtime_release.unlock();
                c0660c = o.this.f8980f;
                if (c0660c != null) {
                }
            }
            if (!o.this.d()) {
                if (c0660c2 != null) {
                    return;
                } else {
                    return;
                }
            }
            if (!o.this.h().compareAndSet(true, false)) {
                closeLock$room_runtime_release.unlock();
                C0660c c0660c3 = o.this.f8980f;
                if (c0660c3 != null) {
                    c0660c3.e();
                    return;
                }
                return;
            }
            if (o.this.f().inTransaction()) {
                closeLock$room_runtime_release.unlock();
                C0660c c0660c4 = o.this.f8980f;
                if (c0660c4 != null) {
                    c0660c4.e();
                    return;
                }
                return;
            }
            Z.g gVarL0 = o.this.f().getOpenHelper().l0();
            gVarL0.f0();
            try {
                setD = a();
                gVarL0.d0();
                closeLock$room_runtime_release.unlock();
                c0660c = o.this.f8980f;
                if (c0660c != null) {
                    c0660c.e();
                }
                if (!setD.isEmpty()) {
                    C1813b c1813bG = o.this.g();
                    o oVar = o.this;
                    synchronized (c1813bG) {
                        try {
                            Iterator it = oVar.g().iterator();
                            while (it.hasNext()) {
                                ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                            }
                            i5.u uVar = i5.u.f19985a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                gVarL0.s0();
            }
        }
    }

    public o(u uVar, Map map, Map map2, String... strArr) {
        String lowerCase;
        w5.k.f(uVar, "database");
        w5.k.f(map, "shadowTablesMap");
        w5.k.f(map2, "viewTables");
        w5.k.f(strArr, "tableNames");
        this.f8975a = uVar;
        this.f8976b = map;
        this.f8977c = map2;
        this.f8981g = new AtomicBoolean(false);
        this.f8984j = new b(strArr.length);
        this.f8985k = new m(uVar);
        this.f8986l = new C1813b();
        this.f8988n = new Object();
        this.f8989o = new Object();
        this.f8978d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            w5.k.e(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            w5.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f8978d.put(lowerCase2, Integer.valueOf(i7));
            String str2 = (String) this.f8976b.get(strArr[i7]);
            if (str2 != null) {
                w5.k.e(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                w5.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i7] = lowerCase2;
        }
        this.f8979e = strArr2;
        for (Map.Entry entry : this.f8976b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            w5.k.e(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            w5.k.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f8978d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                w5.k.e(locale2, "US");
                String lowerCase4 = str4.toLowerCase(locale2);
                w5.k.e(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f8978d;
                map3.put(lowerCase4, AbstractC1787F.h(map3, lowerCase3));
            }
        }
        this.f8990p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f8989o) {
            this.f8982h = false;
            this.f8984j.d();
            Z.k kVar = this.f8983i;
            if (kVar != null) {
                kVar.close();
                i5.u uVar = i5.u.f19985a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = AbstractC1794M.b();
        for (String str : strArr) {
            Map map = this.f8977c;
            Locale locale = Locale.US;
            w5.k.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            w5.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f8977c;
                w5.k.e(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                w5.k.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                w5.k.c(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        Object[] array = AbstractC1794M.a(setB).toArray(new String[0]);
        w5.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void r(Z.g gVar, int i7) {
        gVar.u("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f8979e[i7];
        for (String str2 : f8974r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f8973q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i7 + " AND invalidated = 0; END";
            w5.k.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.u(str3);
        }
    }

    private final void t(Z.g gVar, int i7) {
        String str = this.f8979e[i7];
        for (String str2 : f8974r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f8973q.b(str, str2);
            w5.k.e(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.u(str3);
        }
    }

    public void c(c cVar) {
        d dVar;
        w5.k.f(cVar, "observer");
        String[] strArrO = o(cVar.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f8978d;
            Locale locale = Locale.US;
            w5.k.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            w5.k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrA0 = AbstractC1809n.a0(arrayList);
        d dVar2 = new d(cVar, iArrA0, strArrO);
        synchronized (this.f8986l) {
            dVar = (d) this.f8986l.m(cVar, dVar2);
        }
        if (dVar == null && this.f8984j.b(Arrays.copyOf(iArrA0, iArrA0.length))) {
            u();
        }
    }

    public final boolean d() {
        if (!this.f8975a.isOpenInternal()) {
            return false;
        }
        if (!this.f8982h) {
            this.f8975a.getOpenHelper().l0();
        }
        if (this.f8982h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final Z.k e() {
        return this.f8983i;
    }

    public final u f() {
        return this.f8975a;
    }

    public final C1813b g() {
        return this.f8986l;
    }

    public final AtomicBoolean h() {
        return this.f8981g;
    }

    public final Map i() {
        return this.f8978d;
    }

    public final void j(Z.g gVar) {
        w5.k.f(gVar, "database");
        synchronized (this.f8989o) {
            if (this.f8982h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.u("PRAGMA temp_store = MEMORY;");
            gVar.u("PRAGMA recursive_triggers='ON';");
            gVar.u("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            v(gVar);
            this.f8983i = gVar.E("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f8982h = true;
            i5.u uVar = i5.u.f19985a;
        }
    }

    public final void k(String... strArr) {
        w5.k.f(strArr, "tables");
        synchronized (this.f8986l) {
            try {
                for (Map.Entry entry : this.f8986l) {
                    w5.k.e(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.c(strArr);
                    }
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.f8981g.compareAndSet(false, true)) {
            C0660c c0660c = this.f8980f;
            if (c0660c != null) {
                c0660c.j();
            }
            this.f8975a.getQueryExecutor().execute(this.f8990p);
        }
    }

    public void n(c cVar) {
        d dVar;
        w5.k.f(cVar, "observer");
        synchronized (this.f8986l) {
            dVar = (d) this.f8986l.n(cVar);
        }
        if (dVar != null) {
            b bVar = this.f8984j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                u();
            }
        }
    }

    public final void p(C0660c c0660c) {
        w5.k.f(c0660c, "autoCloser");
        this.f8980f = c0660c;
        c0660c.m(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f8972m.l();
            }
        });
    }

    public final void q(Context context, String str, Intent intent) {
        w5.k.f(context, "context");
        w5.k.f(str, "name");
        w5.k.f(intent, "serviceIntent");
        this.f8987m = new r(context, str, intent, this, this.f8975a.getQueryExecutor());
    }

    public final void s() {
        r rVar = this.f8987m;
        if (rVar != null) {
            rVar.o();
        }
        this.f8987m = null;
    }

    public final void u() {
        if (this.f8975a.isOpenInternal()) {
            v(this.f8975a.getOpenHelper().l0());
        }
    }

    public final void v(Z.g gVar) {
        w5.k.f(gVar, "database");
        if (gVar.I0()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f8975a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f8988n) {
                    int[] iArrA = this.f8984j.a();
                    if (iArrA == null) {
                        return;
                    }
                    f8973q.a(gVar);
                    try {
                        int length = iArrA.length;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < length) {
                            int i9 = iArrA[i7];
                            int i10 = i8 + 1;
                            if (i9 == 1) {
                                r(gVar, i8);
                            } else if (i9 == 2) {
                                t(gVar, i8);
                            }
                            i7++;
                            i8 = i10;
                        }
                        gVar.d0();
                        gVar.s0();
                        i5.u uVar = i5.u.f19985a;
                    } catch (Throwable th) {
                        gVar.s0();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException | IllegalStateException e7) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
        }
    }
}
