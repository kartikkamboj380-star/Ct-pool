package q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.j;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.A f21773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.A f21774d;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, i iVar) {
            String str = iVar.f21768a;
            if (str == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, str);
            }
            kVar.b0(2, iVar.a());
            kVar.b0(3, iVar.f21770c);
        }
    }

    class b extends androidx.room.A {
        b(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends androidx.room.A {
        c(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(androidx.room.u uVar) {
        this.f21771a = uVar;
        this.f21772b = new a(uVar);
        this.f21773c = new b(uVar);
        this.f21774d = new c(uVar);
    }

    public static List h() {
        return Collections.emptyList();
    }

    @Override // q0.j
    public List a() {
        androidx.room.x xVarD = androidx.room.x.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f21771a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21771a, xVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.j
    public void b(i iVar) {
        this.f21771a.assertNotSuspendingTransaction();
        this.f21771a.beginTransaction();
        try {
            this.f21772b.insert(iVar);
            this.f21771a.setTransactionSuccessful();
        } finally {
            this.f21771a.endTransaction();
        }
    }

    @Override // q0.j
    public void c(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // q0.j
    public void d(String str, int i7) {
        this.f21771a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21773c.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        kVarAcquire.b0(2, i7);
        this.f21771a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21771a.setTransactionSuccessful();
        } finally {
            this.f21771a.endTransaction();
            this.f21773c.release(kVarAcquire);
        }
    }

    @Override // q0.j
    public i e(m mVar) {
        return j.a.a(this, mVar);
    }

    @Override // q0.j
    public void f(String str) {
        this.f21771a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21774d.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21771a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21771a.setTransactionSuccessful();
        } finally {
            this.f21771a.endTransaction();
            this.f21774d.release(kVarAcquire);
        }
    }

    @Override // q0.j
    public i g(String str, int i7) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        xVarD.b0(2, i7);
        this.f21771a.assertNotSuspendingTransaction();
        i iVar = null;
        String string = null;
        Cursor cursorB = X.b.b(this.f21771a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "work_spec_id");
            int iE2 = X.a.e(cursorB, "generation");
            int iE3 = X.a.e(cursorB, "system_id");
            if (cursorB.moveToFirst()) {
                if (!cursorB.isNull(iE)) {
                    string = cursorB.getString(iE);
                }
                iVar = new i(string, cursorB.getInt(iE2), cursorB.getInt(iE3));
            }
            return iVar;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }
}
