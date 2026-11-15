package androidx.room;

import Z.h;
import a0.C0500f;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import j.C1767a;
import j5.AbstractC1787F;
import j5.AbstractC1794M;
import j5.AbstractC1809n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final c Companion = new c(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private C0660c autoCloser;
    private final Map<String, Object> backingFieldMap;
    private Z.h internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    protected List<? extends b> mCallbacks;
    protected volatile Z.g mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final o invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends W.a>, W.a> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f9023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f9025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f9026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f9027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f9028g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Executor f9029h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h.c f9030i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f9031j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f9032k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Intent f9033l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f9034m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f9035n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f9036o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private TimeUnit f9037p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final e f9038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Set f9039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Set f9040s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f9041t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private File f9042u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Callable f9043v;

        public a(Context context, Class cls, String str) {
            w5.k.f(context, "context");
            w5.k.f(cls, "klass");
            this.f9022a = context;
            this.f9023b = cls;
            this.f9024c = str;
            this.f9025d = new ArrayList();
            this.f9026e = new ArrayList();
            this.f9027f = new ArrayList();
            this.f9032k = d.AUTOMATIC;
            this.f9034m = true;
            this.f9036o = -1L;
            this.f9038q = new e();
            this.f9039r = new LinkedHashSet();
        }

        public a a(b bVar) {
            w5.k.f(bVar, "callback");
            this.f9025d.add(bVar);
            return this;
        }

        public a b(W.b... bVarArr) {
            w5.k.f(bVarArr, "migrations");
            if (this.f9040s == null) {
                this.f9040s = new HashSet();
            }
            for (W.b bVar : bVarArr) {
                Set set = this.f9040s;
                w5.k.c(set);
                set.add(Integer.valueOf(bVar.f4155a));
                Set set2 = this.f9040s;
                w5.k.c(set2);
                set2.add(Integer.valueOf(bVar.f4156b));
            }
            this.f9038q.b((W.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a c() {
            this.f9031j = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public u d() {
            Executor executorD;
            Set set;
            h.c zVar;
            h.c cVar;
            Executor executor = this.f9028g;
            if (executor != null || this.f9029h != null) {
                if (executor != null && this.f9029h == null) {
                    this.f9029h = executor;
                } else if (executor == null) {
                    executorD = this.f9029h;
                }
                set = this.f9040s;
                if (set != null) {
                    w5.k.c(set);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (!(!this.f9039r.contains(Integer.valueOf(iIntValue)))) {
                            throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                        }
                    }
                }
                zVar = this.f9030i;
                if (zVar == null) {
                    zVar = new C0500f();
                }
                if (zVar == null) {
                    if (this.f9036o > 0) {
                        if (this.f9024c == null) {
                            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                        }
                        long j7 = this.f9036o;
                        TimeUnit timeUnit = this.f9037p;
                        if (timeUnit == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        Executor executor2 = this.f9028g;
                        if (executor2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        zVar = new androidx.room.e(zVar, new C0660c(j7, timeUnit, executor2));
                    }
                    String str = this.f9041t;
                    if (str != null || this.f9042u != null || this.f9043v != null) {
                        if (this.f9024c == null) {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                        }
                        int i7 = str == null ? 0 : 1;
                        File file = this.f9042u;
                        int i8 = file == null ? 0 : 1;
                        Callable callable = this.f9043v;
                        if (i7 + i8 + (callable != null ? 1 : 0) != 1) {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                        zVar = new z(str, file, callable, zVar);
                    }
                } else {
                    zVar = null;
                }
                cVar = zVar;
                if (cVar != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                Context context = this.f9022a;
                String str2 = this.f9024c;
                e eVar = this.f9038q;
                List list = this.f9025d;
                boolean z6 = this.f9031j;
                d dVarJ = this.f9032k.j(context);
                Executor executor3 = this.f9028g;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                Executor executor4 = this.f9029h;
                if (executor4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                androidx.room.f fVar = new androidx.room.f(context, str2, cVar, eVar, list, z6, dVarJ, executor3, executor4, this.f9033l, this.f9034m, this.f9035n, this.f9039r, this.f9041t, this.f9042u, this.f9043v, null, this.f9026e, this.f9027f);
                u uVar = (u) t.b(this.f9023b, "_Impl");
                uVar.init(fVar);
                return uVar;
            }
            executorD = C1767a.d();
            this.f9029h = executorD;
            this.f9028g = executorD;
            set = this.f9040s;
            if (set != null) {
            }
            zVar = this.f9030i;
            if (zVar == null) {
            }
            if (zVar == null) {
            }
            cVar = zVar;
            if (cVar != null) {
            }
        }

        public a e() {
            this.f9034m = false;
            this.f9035n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f9030i = cVar;
            return this;
        }

        public a g(Executor executor) {
            w5.k.f(executor, "executor");
            this.f9028g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(Z.g gVar) {
            w5.k.f(gVar, "db");
        }

        public void b(Z.g gVar) {
            w5.k.f(gVar, "db");
        }

        public void c(Z.g gVar) {
            w5.k.f(gVar, "db");
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean h(ActivityManager activityManager) {
            return Z.c.b(activityManager);
        }

        public final d j(Context context) {
            w5.k.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            w5.k.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !h((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f9048a = new LinkedHashMap();

        private final void a(W.b bVar) {
            int i7 = bVar.f4155a;
            int i8 = bVar.f4156b;
            Map map = this.f9048a;
            Integer numValueOf = Integer.valueOf(i7);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i8))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i8)) + " with " + bVar);
            }
            treeMap2.put(Integer.valueOf(i8), bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List e(List list, boolean z6, int i7, int i8) {
            TreeMap treeMap;
            boolean z7;
            do {
                if (z6) {
                    if (i7 >= i8) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f9048a.get(Integer.valueOf(i7));
                    if (treeMap != null) {
                        return null;
                    }
                    for (Integer num : z6 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                        if (z6) {
                            int i9 = i7 + 1;
                            w5.k.e(num, "targetVersion");
                            int iIntValue = num.intValue();
                            if (i9 <= iIntValue && iIntValue <= i8) {
                                Object obj = treeMap.get(num);
                                w5.k.c(obj);
                                list.add(obj);
                                i7 = num.intValue();
                                z7 = true;
                                break;
                            }
                        } else {
                            w5.k.e(num, "targetVersion");
                            int iIntValue2 = num.intValue();
                            if (i8 <= iIntValue2 && iIntValue2 < i7) {
                                Object obj2 = treeMap.get(num);
                                w5.k.c(obj2);
                                list.add(obj2);
                                i7 = num.intValue();
                                z7 = true;
                                break;
                                break;
                            }
                        }
                    }
                    z7 = false;
                } else {
                    if (i7 <= i8) {
                        return list;
                    }
                    treeMap = (TreeMap) this.f9048a.get(Integer.valueOf(i7));
                    if (treeMap != null) {
                    }
                }
            } while (z7);
            return null;
        }

        public void b(W.b... bVarArr) {
            w5.k.f(bVarArr, "migrations");
            for (W.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public final boolean c(int i7, int i8) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i7))) {
                return false;
            }
            Map mapG = (Map) mapF.get(Integer.valueOf(i7));
            if (mapG == null) {
                mapG = AbstractC1787F.g();
            }
            return mapG.containsKey(Integer.valueOf(i8));
        }

        public List d(int i7, int i8) {
            if (i7 == i8) {
                return AbstractC1809n.i();
            }
            return e(new ArrayList(), i8 > i7, i7, i8);
        }

        public Map f() {
            return this.f9048a;
        }
    }

    public static abstract class f {
    }

    static final class g extends w5.l implements v5.l {
        g() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(Z.g gVar) {
            w5.k.f(gVar, "it");
            u.this.a();
            return null;
        }
    }

    static final class h extends w5.l implements v5.l {
        h() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(Z.g gVar) {
            w5.k.f(gVar, "it");
            u.this.b();
            return null;
        }
    }

    public u() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        w5.k.e(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = mapSynchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        assertNotMainThread();
        Z.g gVarL0 = getOpenHelper().l0();
        getInvalidationTracker().v(gVarL0);
        if (gVarL0.N0()) {
            gVarL0.f0();
        } else {
            gVarL0.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        getOpenHelper().l0().s0();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().m();
    }

    private final Object c(Class cls, Z.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof androidx.room.g) {
            return c(cls, ((androidx.room.g) hVar).a());
        }
        return null;
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(u uVar, Z.j jVar, CancellationSignal cancellationSignal, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i7 & 2) != 0) {
            cancellationSignal = null;
        }
        return uVar.query(jVar, cancellationSignal);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        C0660c c0660c = this.autoCloser;
        if (c0660c == null) {
            a();
        } else {
            c0660c.g(new g());
        }
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            w5.k.e(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().s();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public Z.k compileStatement(String str) {
        w5.k.f(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().l0().E(str);
    }

    protected abstract o createInvalidationTracker();

    protected abstract Z.h createOpenHelper(androidx.room.f fVar);

    public void endTransaction() {
        C0660c c0660c = this.autoCloser;
        if (c0660c == null) {
            b();
        } else {
            c0660c.g(new h());
        }
    }

    protected final Map<Class<? extends W.a>, W.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List<W.b> getAutoMigrations(Map<Class<? extends W.a>, W.a> map) {
        w5.k.f(map, "autoMigrationSpecs");
        return AbstractC1809n.i();
    }

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock lock = this.readWriteLock.readLock();
        w5.k.e(lock, "readWriteLock.readLock()");
        return lock;
    }

    public o getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public Z.h getOpenHelper() {
        Z.h hVar = this.internalOpenHelper;
        if (hVar != null) {
            return hVar;
        }
        w5.k.t("internalOpenHelper");
        return null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        w5.k.t("internalQueryExecutor");
        return null;
    }

    public Set<Class<? extends W.a>> getRequiredAutoMigrationSpecs() {
        return AbstractC1794M.d();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return AbstractC1787F.g();
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        w5.k.t("internalTransactionExecutor");
        return null;
    }

    public <T> T getTypeConverter(Class<T> cls) {
        w5.k.f(cls, "klass");
        return (T) this.typeConverters.get(cls);
    }

    public boolean inTransaction() {
        return getOpenHelper().l0().I0();
    }

    public void init(androidx.room.f fVar) {
        w5.k.f(fVar, "configuration");
        this.internalOpenHelper = createOpenHelper(fVar);
        Set<Class<? extends W.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends W.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i7 = -1;
            if (it.hasNext()) {
                Class<? extends W.a> next = it.next();
                int size = fVar.f8963r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i8 = size - 1;
                        if (next.isAssignableFrom(fVar.f8963r.get(size).getClass())) {
                            bitSet.set(size);
                            i7 = size;
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size = i8;
                        }
                    }
                }
                if (i7 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, (W.a) fVar.f8963r.get(i7));
            } else {
                int size2 = fVar.f8963r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i9 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i9 < 0) {
                            break;
                        } else {
                            size2 = i9;
                        }
                    }
                }
                for (W.b bVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!fVar.f8949d.c(bVar.f4155a, bVar.f4156b)) {
                        fVar.f8949d.b(bVar);
                    }
                }
                y yVar = (y) c(y.class, getOpenHelper());
                if (yVar != null) {
                    yVar.e(fVar);
                }
                androidx.room.d dVar = (androidx.room.d) c(androidx.room.d.class, getOpenHelper());
                if (dVar != null) {
                    this.autoCloser = dVar.f8919n;
                    getInvalidationTracker().p(dVar.f8919n);
                }
                boolean z6 = fVar.f8952g == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z6);
                this.mCallbacks = fVar.f8950e;
                this.internalQueryExecutor = fVar.f8953h;
                this.internalTransactionExecutor = new C(fVar.f8954i);
                this.allowMainThreadQueries = fVar.f8951f;
                this.writeAheadLoggingEnabled = z6;
                if (fVar.f8955j != null) {
                    if (fVar.f8947b == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().q(fVar.f8946a, fVar.f8947b, fVar.f8955j);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = fVar.f8962q.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i10 = size3 - 1;
                                if (cls.isAssignableFrom(fVar.f8962q.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i10 < 0) {
                                    break;
                                } else {
                                    size3 = i10;
                                }
                            }
                            size3 = -1;
                        } else {
                            size3 = -1;
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, fVar.f8962q.get(size3));
                    }
                }
                int size4 = fVar.f8962q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i11 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + fVar.f8962q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i11 < 0) {
                        return;
                    } else {
                        size4 = i11;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(Z.g gVar) {
        w5.k.f(gVar, "db");
        getInvalidationTracker().j(gVar);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean boolValueOf;
        boolean zIsOpen;
        C0660c c0660c = this.autoCloser;
        if (c0660c != null) {
            zIsOpen = c0660c.l();
        } else {
            Z.g gVar = this.mDatabase;
            if (gVar == null) {
                boolValueOf = null;
                return w5.k.b(boolValueOf, Boolean.TRUE);
            }
            zIsOpen = gVar.isOpen();
        }
        boolValueOf = Boolean.valueOf(zIsOpen);
        return w5.k.b(boolValueOf, Boolean.TRUE);
    }

    public final boolean isOpenInternal() {
        Z.g gVar = this.mDatabase;
        return gVar != null && gVar.isOpen();
    }

    public final Cursor query(Z.j jVar) {
        w5.k.f(jVar, "query");
        return query$default(this, jVar, null, 2, null);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        w5.k.f(callable, "body");
        beginTransaction();
        try {
            V vCall = callable.call();
            setTransactionSuccessful();
            return vCall;
        } finally {
            endTransaction();
        }
    }

    protected final void setAutoMigrationSpecs(Map<Class<? extends W.a>, W.a> map) {
        w5.k.f(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    public void setTransactionSuccessful() {
        getOpenHelper().l0().d0();
    }

    public Cursor query(Z.j jVar, CancellationSignal cancellationSignal) {
        w5.k.f(jVar, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().l0().I(jVar, cancellationSignal) : getOpenHelper().l0().Q(jVar);
    }

    public void runInTransaction(Runnable runnable) {
        w5.k.f(runnable, "body");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public Cursor query(String str, Object[] objArr) {
        w5.k.f(str, "query");
        return getOpenHelper().l0().Q(new Z.a(str, objArr));
    }
}
