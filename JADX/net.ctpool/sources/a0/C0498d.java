package a0;

import Z.h;
import a0.C0498d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import b0.C0673a;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.k;
import w5.l;

/* JADX INFO: renamed from: a0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498d implements Z.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f4675t = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f4676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h.a f4678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f4679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f4680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f4681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f4682s;

    /* JADX INFO: renamed from: a0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0.d$b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C0497c f4683a;

        public b(C0497c c0497c) {
            this.f4683a = c0497c;
        }

        public final C0497c a() {
            return this.f4683a;
        }

        public final void b(C0497c c0497c) {
            this.f4683a = c0497c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0.d$c */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0110c f4684t = new C0110c(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Context f4685m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final b f4686n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final h.a f4687o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f4688p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f4689q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final C0673a f4690r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f4691s;

        /* JADX INFO: renamed from: a0.d$c$a */
        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final b f4692m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Throwable f4693n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th) {
                super(th);
                k.f(bVar, "callbackName");
                k.f(th, "cause");
                this.f4692m = bVar;
                this.f4693n = th;
            }

            public final b a() {
                return this.f4692m;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f4693n;
            }
        }

        /* JADX INFO: renamed from: a0.d$c$b */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: a0.d$c$c, reason: collision with other inner class name */
        public static final class C0110c {
            private C0110c() {
            }

            public final C0497c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                k.f(bVar, "refHolder");
                k.f(sQLiteDatabase, "sqLiteDatabase");
                C0497c c0497cA = bVar.a();
                if (c0497cA != null && c0497cA.d(sQLiteDatabase)) {
                    return c0497cA;
                }
                C0497c c0497c = new C0497c(sQLiteDatabase);
                bVar.b(c0497c);
                return c0497c;
            }

            public /* synthetic */ C0110c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: renamed from: a0.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0111d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4700a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f4700a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final h.a aVar, boolean z6) {
            super(context, str, null, aVar.f4618a, new DatabaseErrorHandler() { // from class: a0.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C0498d.c.b(aVar, bVar, sQLiteDatabase);
                }
            });
            k.f(context, "context");
            k.f(bVar, "dbRef");
            k.f(aVar, "callback");
            this.f4685m = context;
            this.f4686n = bVar;
            this.f4687o = aVar;
            this.f4688p = z6;
            if (str == null) {
                str = UUID.randomUUID().toString();
                k.e(str, "randomUUID().toString()");
            }
            this.f4690r = new C0673a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            k.f(aVar, "$callback");
            k.f(bVar, "$dbRef");
            C0110c c0110c = f4684t;
            k.e(sQLiteDatabase, "dbObj");
            aVar.c(c0110c.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase f(boolean z6) {
            SQLiteDatabase writableDatabase = z6 ? super.getWritableDatabase() : super.getReadableDatabase();
            k.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        private final SQLiteDatabase g(boolean z6) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z7 = this.f4691s;
            if (databaseName != null && !z7 && (parentFile = this.f4685m.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return f(z6);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return f(z6);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i7 = C0111d.f4700a[aVar.a().ordinal()];
                        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f4688p) {
                        throw th;
                    }
                    this.f4685m.deleteDatabase(databaseName);
                    try {
                        return f(z6);
                    } catch (a e7) {
                        throw e7.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C0673a.c(this.f4690r, false, 1, null);
                super.close();
                this.f4686n.b(null);
                this.f4691s = false;
            } finally {
                this.f4690r.d();
            }
        }

        public final Z.g d(boolean z6) {
            try {
                this.f4690r.b((this.f4691s || getDatabaseName() == null) ? false : true);
                this.f4689q = false;
                SQLiteDatabase sQLiteDatabaseG = g(z6);
                if (!this.f4689q) {
                    C0497c c0497cE = e(sQLiteDatabaseG);
                    this.f4690r.d();
                    return c0497cE;
                }
                close();
                Z.g gVarD = d(z6);
                this.f4690r.d();
                return gVarD;
            } catch (Throwable th) {
                this.f4690r.d();
                throw th;
            }
        }

        public final C0497c e(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            return f4684t.a(this.f4686n, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "db");
            if (!this.f4689q && this.f4687o.f4618a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f4687o.b(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f4687o.d(e(sQLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            k.f(sQLiteDatabase, "db");
            this.f4689q = true;
            try {
                this.f4687o.e(e(sQLiteDatabase), i7, i8);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            k.f(sQLiteDatabase, "db");
            if (!this.f4689q) {
                try {
                    this.f4687o.f(e(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f4691s = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
            k.f(sQLiteDatabase, "sqLiteDatabase");
            this.f4689q = true;
            try {
                this.f4687o.g(e(sQLiteDatabase), i7, i8);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: a0.d$d, reason: collision with other inner class name */
    static final class C0112d extends l implements InterfaceC2171a {
        C0112d() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (C0498d.this.f4677n == null || !C0498d.this.f4679p) {
                cVar = new c(C0498d.this.f4676m, C0498d.this.f4677n, new b(null), C0498d.this.f4678o, C0498d.this.f4680q);
            } else {
                cVar = new c(C0498d.this.f4676m, new File(Z.d.a(C0498d.this.f4676m), C0498d.this.f4677n).getAbsolutePath(), new b(null), C0498d.this.f4678o, C0498d.this.f4680q);
            }
            Z.b.d(cVar, C0498d.this.f4682s);
            return cVar;
        }
    }

    public C0498d(Context context, String str, h.a aVar, boolean z6, boolean z7) {
        k.f(context, "context");
        k.f(aVar, "callback");
        this.f4676m = context;
        this.f4677n = str;
        this.f4678o = aVar;
        this.f4679p = z6;
        this.f4680q = z7;
        this.f4681r = i5.g.b(new C0112d());
    }

    private final c j() {
        return (c) this.f4681r.getValue();
    }

    @Override // Z.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4681r.a()) {
            j().close();
        }
    }

    @Override // Z.h
    public String getDatabaseName() {
        return this.f4677n;
    }

    @Override // Z.h
    public Z.g l0() {
        return j().d(true);
    }

    @Override // Z.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        if (this.f4681r.a()) {
            Z.b.d(j(), z6);
        }
        this.f4682s = z6;
    }
}
