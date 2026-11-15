package q0;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21766b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.A0(2);
            } else {
                kVar.b0(2, dVar.b().longValue());
            }
        }
    }

    public f(androidx.room.u uVar) {
        this.f21765a = uVar;
        this.f21766b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // q0.e
    public Long a(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21765a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorB = X.b.b(this.f21765a, xVarD, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.e
    public void b(d dVar) {
        this.f21765a.assertNotSuspendingTransaction();
        this.f21765a.beginTransaction();
        try {
            this.f21766b.insert(dVar);
            this.f21765a.setTransactionSuccessful();
        } finally {
            this.f21765a.endTransaction();
        }
    }
}
