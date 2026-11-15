package androidx.room;

import Z.h;
import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t5.AbstractC2070a;

/* JADX INFO: loaded from: classes.dex */
public class w extends h.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f9052g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f9053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f9054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9056f;

    public static final class a {
        private a() {
        }

        public final boolean a(Z.g gVar) throws IOException {
            w5.k.f(gVar, "db");
            Cursor cursorO0 = gVar.o0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z6 = false;
                if (cursorO0.moveToFirst()) {
                    if (cursorO0.getInt(0) == 0) {
                        z6 = true;
                    }
                }
                AbstractC2070a.a(cursorO0, null);
                return z6;
            } finally {
            }
        }

        public final boolean b(Z.g gVar) throws IOException {
            w5.k.f(gVar, "db");
            Cursor cursorO0 = gVar.o0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z6 = false;
                if (cursorO0.moveToFirst()) {
                    if (cursorO0.getInt(0) != 0) {
                        z6 = true;
                    }
                }
                AbstractC2070a.a(cursorO0, null);
                return z6;
            } finally {
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class b {
        public final int version;

        public b(int i7) {
            this.version = i7;
        }

        public abstract void createAllTables(Z.g gVar);

        public abstract void dropAllTables(Z.g gVar);

        public abstract void onCreate(Z.g gVar);

        public abstract void onOpen(Z.g gVar);

        public abstract void onPostMigrate(Z.g gVar);

        public abstract void onPreMigrate(Z.g gVar);

        public abstract c onValidateSchema(Z.g gVar);

        protected void validateMigration(Z.g gVar) {
            w5.k.f(gVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9058b;

        public c(boolean z6, String str) {
            this.f9057a = z6;
            this.f9058b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f fVar, b bVar, String str, String str2) {
        super(bVar.version);
        w5.k.f(fVar, "configuration");
        w5.k.f(bVar, "delegate");
        w5.k.f(str, "identityHash");
        w5.k.f(str2, "legacyHash");
        this.f9053c = fVar;
        this.f9054d = bVar;
        this.f9055e = str;
        this.f9056f = str2;
    }

    private final void h(Z.g gVar) throws IOException {
        if (!f9052g.b(gVar)) {
            c cVarOnValidateSchema = this.f9054d.onValidateSchema(gVar);
            if (cVarOnValidateSchema.f9057a) {
                this.f9054d.onPostMigrate(gVar);
                j(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f9058b);
            }
        }
        Cursor cursorQ = gVar.Q(new Z.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorQ.moveToFirst() ? cursorQ.getString(0) : null;
            AbstractC2070a.a(cursorQ, null);
            if (w5.k.b(this.f9055e, string) || w5.k.b(this.f9056f, string)) {
                return;
            }
            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f9055e + ", found: " + string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2070a.a(cursorQ, th);
                throw th2;
            }
        }
    }

    private final void i(Z.g gVar) {
        gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(Z.g gVar) {
        i(gVar);
        gVar.u(v.a(this.f9055e));
    }

    @Override // Z.h.a
    public void b(Z.g gVar) {
        w5.k.f(gVar, "db");
        super.b(gVar);
    }

    @Override // Z.h.a
    public void d(Z.g gVar) throws IOException {
        w5.k.f(gVar, "db");
        boolean zA = f9052g.a(gVar);
        this.f9054d.createAllTables(gVar);
        if (!zA) {
            c cVarOnValidateSchema = this.f9054d.onValidateSchema(gVar);
            if (!cVarOnValidateSchema.f9057a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + cVarOnValidateSchema.f9058b);
            }
        }
        j(gVar);
        this.f9054d.onCreate(gVar);
    }

    @Override // Z.h.a
    public void e(Z.g gVar, int i7, int i8) {
        w5.k.f(gVar, "db");
        g(gVar, i7, i8);
    }

    @Override // Z.h.a
    public void f(Z.g gVar) throws IOException {
        w5.k.f(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f9054d.onOpen(gVar);
        this.f9053c = null;
    }

    @Override // Z.h.a
    public void g(Z.g gVar, int i7, int i8) {
        List listD;
        w5.k.f(gVar, "db");
        f fVar = this.f9053c;
        if (fVar == null || (listD = fVar.f8949d.d(i7, i8)) == null) {
            f fVar2 = this.f9053c;
            if (fVar2 != null && !fVar2.a(i7, i8)) {
                this.f9054d.dropAllTables(gVar);
                this.f9054d.createAllTables(gVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f9054d.onPreMigrate(gVar);
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            ((W.b) it.next()).a(gVar);
        }
        c cVarOnValidateSchema = this.f9054d.onValidateSchema(gVar);
        if (cVarOnValidateSchema.f9057a) {
            this.f9054d.onPostMigrate(gVar);
            j(gVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + cVarOnValidateSchema.f9058b);
        }
    }
}
