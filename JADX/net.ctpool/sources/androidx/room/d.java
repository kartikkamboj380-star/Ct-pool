package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Z.h, g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Z.h f8918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0660c f8919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f8920o;

    public static final class a implements Z.g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C0660c f8921m;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        static final class C0170a extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0170a f8922m = new C0170a();

            C0170a() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List i(Z.g gVar) {
                w5.k.f(gVar, "obj");
                return gVar.s();
            }
        }

        static final class b extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f8923m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f8923m = str;
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object i(Z.g gVar) {
                w5.k.f(gVar, "db");
                gVar.u(this.f8923m);
                return null;
            }
        }

        static final class c extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f8924m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Object[] f8925n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f8924m = str;
                this.f8925n = objArr;
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object i(Z.g gVar) {
                w5.k.f(gVar, "db");
                gVar.e0(this.f8924m, this.f8925n);
                return null;
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0171d extends w5.i implements v5.l {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final C0171d f8926v = new C0171d();

            C0171d() {
                super(1, Z.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public final Boolean i(Z.g gVar) {
                w5.k.f(gVar, "p0");
                return Boolean.valueOf(gVar.I0());
            }
        }

        static final class e extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final e f8927m = new e();

            e() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean i(Z.g gVar) {
                w5.k.f(gVar, "db");
                return Boolean.valueOf(gVar.N0());
            }
        }

        static final class f extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final f f8928m = new f();

            f() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String i(Z.g gVar) {
                w5.k.f(gVar, "obj");
                return gVar.F0();
            }
        }

        static final class g extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final g f8929m = new g();

            g() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object i(Z.g gVar) {
                w5.k.f(gVar, "it");
                return null;
            }
        }

        static final class h extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f8930m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f8931n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ ContentValues f8932o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f8933p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ Object[] f8934q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i7, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f8930m = str;
                this.f8931n = i7;
                this.f8932o = contentValues;
                this.f8933p = str2;
                this.f8934q = objArr;
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer i(Z.g gVar) {
                w5.k.f(gVar, "db");
                return Integer.valueOf(gVar.g0(this.f8930m, this.f8931n, this.f8932o, this.f8933p, this.f8934q));
            }
        }

        public a(C0660c c0660c) {
            w5.k.f(c0660c, "autoCloser");
            this.f8921m = c0660c;
        }

        @Override // Z.g
        public Z.k E(String str) {
            w5.k.f(str, "sql");
            return new b(str, this.f8921m);
        }

        @Override // Z.g
        public String F0() {
            return (String) this.f8921m.g(f.f8928m);
        }

        @Override // Z.g
        public Cursor I(Z.j jVar, CancellationSignal cancellationSignal) {
            w5.k.f(jVar, "query");
            try {
                return new c(this.f8921m.j().I(jVar, cancellationSignal), this.f8921m);
            } catch (Throwable th) {
                this.f8921m.e();
                throw th;
            }
        }

        @Override // Z.g
        public boolean I0() {
            if (this.f8921m.h() == null) {
                return false;
            }
            return ((Boolean) this.f8921m.g(C0171d.f8926v)).booleanValue();
        }

        @Override // Z.g
        public boolean N0() {
            return ((Boolean) this.f8921m.g(e.f8927m)).booleanValue();
        }

        @Override // Z.g
        public Cursor Q(Z.j jVar) {
            w5.k.f(jVar, "query");
            try {
                return new c(this.f8921m.j().Q(jVar), this.f8921m);
            } catch (Throwable th) {
                this.f8921m.e();
                throw th;
            }
        }

        public final void a() {
            this.f8921m.g(g.f8929m);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8921m.d();
        }

        @Override // Z.g
        public void d0() {
            i5.u uVar;
            Z.g gVarH = this.f8921m.h();
            if (gVarH != null) {
                gVarH.d0();
                uVar = i5.u.f19985a;
            } else {
                uVar = null;
            }
            if (uVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // Z.g
        public void e0(String str, Object[] objArr) {
            w5.k.f(str, "sql");
            w5.k.f(objArr, "bindArgs");
            this.f8921m.g(new c(str, objArr));
        }

        @Override // Z.g
        public void f0() {
            try {
                this.f8921m.j().f0();
            } catch (Throwable th) {
                this.f8921m.e();
                throw th;
            }
        }

        @Override // Z.g
        public int g0(String str, int i7, ContentValues contentValues, String str2, Object[] objArr) {
            w5.k.f(str, "table");
            w5.k.f(contentValues, "values");
            return ((Number) this.f8921m.g(new h(str, i7, contentValues, str2, objArr))).intValue();
        }

        @Override // Z.g
        public boolean isOpen() {
            Z.g gVarH = this.f8921m.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // Z.g
        public Cursor o0(String str) {
            w5.k.f(str, "query");
            try {
                return new c(this.f8921m.j().o0(str), this.f8921m);
            } catch (Throwable th) {
                this.f8921m.e();
                throw th;
            }
        }

        @Override // Z.g
        public void q() {
            try {
                this.f8921m.j().q();
            } catch (Throwable th) {
                this.f8921m.e();
                throw th;
            }
        }

        @Override // Z.g
        public List s() {
            return (List) this.f8921m.g(C0170a.f8922m);
        }

        @Override // Z.g
        public void s0() {
            if (this.f8921m.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                Z.g gVarH = this.f8921m.h();
                w5.k.c(gVarH);
                gVarH.s0();
            } finally {
                this.f8921m.e();
            }
        }

        @Override // Z.g
        public void u(String str) {
            w5.k.f(str, "sql");
            this.f8921m.g(new b(str));
        }
    }

    private static final class b implements Z.k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f8935m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C0660c f8936n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final ArrayList f8937o;

        static final class a extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final a f8938m = new a();

            a() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long i(Z.k kVar) {
                w5.k.f(kVar, "obj");
                return Long.valueOf(kVar.Y0());
            }
        }

        /* JADX INFO: renamed from: androidx.room.d$b$b, reason: collision with other inner class name */
        static final class C0172b extends w5.l implements v5.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ v5.l f8940n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172b(v5.l lVar) {
                super(1);
                this.f8940n = lVar;
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object i(Z.g gVar) {
                w5.k.f(gVar, "db");
                Z.k kVarE = gVar.E(b.this.f8935m);
                b.this.d(kVarE);
                return this.f8940n.i(kVarE);
            }
        }

        static final class c extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final c f8941m = new c();

            c() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer i(Z.k kVar) {
                w5.k.f(kVar, "obj");
                return Integer.valueOf(kVar.D());
            }
        }

        public b(String str, C0660c c0660c) {
            w5.k.f(str, "sql");
            w5.k.f(c0660c, "autoCloser");
            this.f8935m = str;
            this.f8936n = c0660c;
            this.f8937o = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(Z.k kVar) {
            Iterator it = this.f8937o.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    AbstractC1809n.p();
                }
                Object obj = this.f8937o.get(i7);
                if (obj == null) {
                    kVar.A0(i8);
                } else if (obj instanceof Long) {
                    kVar.b0(i8, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.L(i8, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.v(i8, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.i0(i8, (byte[]) obj);
                }
                i7 = i8;
            }
        }

        private final Object e(v5.l lVar) {
            return this.f8936n.g(new C0172b(lVar));
        }

        private final void f(int i7, Object obj) {
            int size;
            int i8 = i7 - 1;
            if (i8 >= this.f8937o.size() && (size = this.f8937o.size()) <= i8) {
                while (true) {
                    this.f8937o.add(null);
                    if (size == i8) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f8937o.set(i8, obj);
        }

        @Override // Z.i
        public void A0(int i7) {
            f(i7, null);
        }

        @Override // Z.k
        public int D() {
            return ((Number) e(c.f8941m)).intValue();
        }

        @Override // Z.i
        public void L(int i7, double d7) {
            f(i7, Double.valueOf(d7));
        }

        @Override // Z.k
        public long Y0() {
            return ((Number) e(a.f8938m)).longValue();
        }

        @Override // Z.i
        public void b0(int i7, long j7) {
            f(i7, Long.valueOf(j7));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // Z.i
        public void i0(int i7, byte[] bArr) {
            w5.k.f(bArr, "value");
            f(i7, bArr);
        }

        @Override // Z.i
        public void v(int i7, String str) {
            w5.k.f(str, "value");
            f(i7, str);
        }
    }

    private static final class c implements Cursor {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Cursor f8942m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C0660c f8943n;

        public c(Cursor cursor, C0660c c0660c) {
            w5.k.f(cursor, "delegate");
            w5.k.f(c0660c, "autoCloser");
            this.f8942m = cursor;
            this.f8943n = c0660c;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8942m.close();
            this.f8943n.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i7, CharArrayBuffer charArrayBuffer) {
            this.f8942m.copyStringToBuffer(i7, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f8942m.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i7) {
            return this.f8942m.getBlob(i7);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f8942m.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f8942m.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f8942m.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i7) {
            return this.f8942m.getColumnName(i7);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f8942m.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f8942m.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i7) {
            return this.f8942m.getDouble(i7);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f8942m.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i7) {
            return this.f8942m.getFloat(i7);
        }

        @Override // android.database.Cursor
        public int getInt(int i7) {
            return this.f8942m.getInt(i7);
        }

        @Override // android.database.Cursor
        public long getLong(int i7) {
            return this.f8942m.getLong(i7);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return Z.c.a(this.f8942m);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return Z.f.a(this.f8942m);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f8942m.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i7) {
            return this.f8942m.getShort(i7);
        }

        @Override // android.database.Cursor
        public String getString(int i7) {
            return this.f8942m.getString(i7);
        }

        @Override // android.database.Cursor
        public int getType(int i7) {
            return this.f8942m.getType(i7);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f8942m.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f8942m.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f8942m.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f8942m.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f8942m.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f8942m.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i7) {
            return this.f8942m.isNull(i7);
        }

        @Override // android.database.Cursor
        public boolean move(int i7) {
            return this.f8942m.move(i7);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f8942m.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f8942m.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f8942m.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i7) {
            return this.f8942m.moveToPosition(i7);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f8942m.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f8942m.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f8942m.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f8942m.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f8942m.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle bundle) {
            w5.k.f(bundle, "extras");
            Z.e.a(this.f8942m, bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f8942m.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver contentResolver, List list) {
            w5.k.f(contentResolver, "cr");
            w5.k.f(list, "uris");
            Z.f.b(this.f8942m, contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f8942m.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f8942m.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(Z.h hVar, C0660c c0660c) {
        w5.k.f(hVar, "delegate");
        w5.k.f(c0660c, "autoCloser");
        this.f8918m = hVar;
        this.f8919n = c0660c;
        c0660c.k(a());
        this.f8920o = new a(c0660c);
    }

    @Override // androidx.room.g
    public Z.h a() {
        return this.f8918m;
    }

    @Override // Z.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8920o.close();
    }

    @Override // Z.h
    public String getDatabaseName() {
        return this.f8918m.getDatabaseName();
    }

    @Override // Z.h
    public Z.g l0() {
        this.f8920o.a();
        return this.f8920o;
    }

    @Override // Z.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        this.f8918m.setWriteAheadLoggingEnabled(z6);
    }
}
