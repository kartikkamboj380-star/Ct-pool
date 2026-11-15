package Z;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0107a f4617b = new C0107a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4618a;

        /* JADX INFO: renamed from: Z.h$a$a, reason: collision with other inner class name */
        public static final class C0107a {
            private C0107a() {
            }

            public /* synthetic */ C0107a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(int i7) {
            this.f4618a = i7;
        }

        private final void a(String str) {
            if (F5.g.p(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i7 = 0;
            boolean z6 = false;
            while (i7 <= length) {
                boolean z7 = w5.k.g(str.charAt(!z6 ? i7 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z7) {
                    i7++;
                } else {
                    z6 = true;
                }
            }
            if (str.subSequence(i7, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                Z.b.a(new File(str));
            } catch (Exception e7) {
                Log.w("SupportSQLite", "delete failed: ", e7);
            }
        }

        public void b(g gVar) {
            w5.k.f(gVar, "db");
        }

        public void c(g gVar) {
            w5.k.f(gVar, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar + ".path");
            if (!gVar.isOpen()) {
                String strF0 = gVar.F0();
                if (strF0 != null) {
                    a(strF0);
                    return;
                }
                return;
            }
            List listS = null;
            try {
                try {
                    listS = gVar.s();
                } catch (SQLiteException unused) {
                }
                try {
                    gVar.close();
                } catch (IOException unused2) {
                }
                if (listS != null) {
                    return;
                }
            } finally {
                if (listS != null) {
                    Iterator it = listS.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        w5.k.e(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String strF02 = gVar.F0();
                    if (strF02 != null) {
                        a(strF02);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i7, int i8);

        public void f(g gVar) {
            w5.k.f(gVar, "db");
        }

        public abstract void g(g gVar, int i7, int i8);
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0108b f4619f = new C0108b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f4622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f4624e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f4625a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f4626b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f4627c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f4628d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f4629e;

            public a(Context context) {
                w5.k.f(context, "context");
                this.f4625a = context;
            }

            public a a(boolean z6) {
                this.f4629e = z6;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f4627c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.f4628d && ((str = this.f4626b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new b(this.f4625a, this.f4626b, aVar, this.f4628d, this.f4629e);
            }

            public a c(a aVar) {
                w5.k.f(aVar, "callback");
                this.f4627c = aVar;
                return this;
            }

            public a d(String str) {
                this.f4626b = str;
                return this;
            }

            public a e(boolean z6) {
                this.f4628d = z6;
                return this;
            }
        }

        /* JADX INFO: renamed from: Z.h$b$b, reason: collision with other inner class name */
        public static final class C0108b {
            private C0108b() {
            }

            public final a a(Context context) {
                w5.k.f(context, "context");
                return new a(context);
            }

            public /* synthetic */ C0108b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(Context context, String str, a aVar, boolean z6, boolean z7) {
            w5.k.f(context, "context");
            w5.k.f(aVar, "callback");
            this.f4620a = context;
            this.f4621b = str;
            this.f4622c = aVar;
            this.f4623d = z6;
            this.f4624e = z7;
        }

        public static final a a(Context context) {
            return f4619f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    g l0();

    void setWriteAheadLoggingEnabled(boolean z6);
}
