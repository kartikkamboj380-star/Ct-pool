package a0;

import Z.j;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.r;
import w5.k;
import w5.l;

/* JADX INFO: renamed from: a0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497c implements Z.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f4670n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f4671o = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f4672p = new String[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SQLiteDatabase f4673m;

    /* JADX INFO: renamed from: a0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: a0.c$b */
    static final class b extends l implements r {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ j f4674m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f4674m = jVar;
        }

        @Override // v5.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor j(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f4674m;
            k.c(sQLiteQuery);
            jVar.a(new C0501g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C0497c(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "delegate");
        this.f4673m = sQLiteDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        k.f(rVar, "$tmp0");
        return (Cursor) rVar.j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor f(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        k.f(jVar, "$query");
        k.c(sQLiteQuery);
        jVar.a(new C0501g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // Z.g
    public Z.k E(String str) {
        k.f(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f4673m.compileStatement(str);
        k.e(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // Z.g
    public String F0() {
        return this.f4673m.getPath();
    }

    @Override // Z.g
    public Cursor I(final j jVar, CancellationSignal cancellationSignal) {
        k.f(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f4673m;
        String strB = jVar.b();
        String[] strArr = f4672p;
        k.c(cancellationSignal);
        return Z.b.c(sQLiteDatabase, strB, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: a0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C0497c.f(jVar, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // Z.g
    public boolean I0() {
        return this.f4673m.inTransaction();
    }

    @Override // Z.g
    public boolean N0() {
        return Z.b.b(this.f4673m);
    }

    @Override // Z.g
    public Cursor Q(j jVar) {
        k.f(jVar, "query");
        final b bVar = new b(jVar);
        Cursor cursorRawQueryWithFactory = this.f4673m.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: a0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return C0497c.e(bVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, jVar.b(), f4672p, null);
        k.e(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4673m.close();
    }

    public final boolean d(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "sqLiteDatabase");
        return k.b(this.f4673m, sQLiteDatabase);
    }

    @Override // Z.g
    public void d0() {
        this.f4673m.setTransactionSuccessful();
    }

    @Override // Z.g
    public void e0(String str, Object[] objArr) {
        k.f(str, "sql");
        k.f(objArr, "bindArgs");
        this.f4673m.execSQL(str, objArr);
    }

    @Override // Z.g
    public void f0() {
        this.f4673m.beginTransactionNonExclusive();
    }

    @Override // Z.g
    public int g0(String str, int i7, ContentValues contentValues, String str2, Object[] objArr) {
        k.f(str, "table");
        k.f(contentValues, "values");
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(f4671o[i7]);
        sb.append(str);
        sb.append(" SET ");
        int i8 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i8 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i8] = contentValues.get(str3);
            sb.append("=?");
            i8++;
        }
        if (objArr != null) {
            for (int i9 = size; i9 < length; i9++) {
                objArr2[i9] = objArr[i9 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        String string = sb.toString();
        k.e(string, "StringBuilder().apply(builderAction).toString()");
        Z.k kVarE = E(string);
        Z.a.f4609o.b(kVarE, objArr2);
        return kVarE.D();
    }

    @Override // Z.g
    public boolean isOpen() {
        return this.f4673m.isOpen();
    }

    @Override // Z.g
    public Cursor o0(String str) {
        k.f(str, "query");
        return Q(new Z.a(str));
    }

    @Override // Z.g
    public void q() {
        this.f4673m.beginTransaction();
    }

    @Override // Z.g
    public List s() {
        return this.f4673m.getAttachedDbs();
    }

    @Override // Z.g
    public void s0() {
        this.f4673m.endTransaction();
    }

    @Override // Z.g
    public void u(String str) {
        k.f(str, "sql");
        this.f4673m.execSQL(str);
    }
}
