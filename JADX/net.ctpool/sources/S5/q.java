package S5;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.u;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.room.i f2969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.room.h f2970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f2971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f2972e;

    public class a extends androidx.room.i {
        public a(q qVar, u uVar) {
            super(uVar);
        }

        @Override // androidx.room.i
        public void bind(Z.k kVar, Object obj) {
            r rVar = (r) obj;
            String str = rVar.f2973a;
            if (str == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, str);
            }
            byte[] bArr = rVar.f2974b;
            if (bArr == null) {
                kVar.A0(2);
            } else {
                kVar.i0(2, bArr);
            }
            byte[] bArr2 = rVar.f2975c;
            if (bArr2 == null) {
                kVar.A0(3);
            } else {
                kVar.i0(3, bArr2);
            }
            Boolean bool = rVar.f2976d;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                kVar.A0(4);
            } else {
                kVar.b0(4, r5.intValue());
            }
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `work_data` (`id`,`notification`,`trigger`,`with_alarm_manager`) VALUES (?,?,?,?)";
        }
    }

    public class b extends androidx.room.h {
        public b(q qVar, u uVar) {
            super(uVar);
        }

        @Override // androidx.room.h
        public void bind(Z.k kVar, Object obj) {
            r rVar = (r) obj;
            String str = rVar.f2973a;
            if (str == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, str);
            }
            byte[] bArr = rVar.f2974b;
            if (bArr == null) {
                kVar.A0(2);
            } else {
                kVar.i0(2, bArr);
            }
            byte[] bArr2 = rVar.f2975c;
            if (bArr2 == null) {
                kVar.A0(3);
            } else {
                kVar.i0(3, bArr2);
            }
            Boolean bool = rVar.f2976d;
            if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                kVar.A0(4);
            } else {
                kVar.b0(4, r0.intValue());
            }
            String str2 = rVar.f2973a;
            if (str2 == null) {
                kVar.A0(5);
            } else {
                kVar.v(5, str2);
            }
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE OR REPLACE `work_data` SET `id` = ?,`notification` = ?,`trigger` = ?,`with_alarm_manager` = ? WHERE `id` = ?";
        }
    }

    public class c extends A {
        public c(q qVar, u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM work_data";
        }
    }

    public class d extends A {
        public d(q qVar, u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM work_data WHERE id = ?";
        }
    }

    public q(u uVar) {
        this.f2968a = uVar;
        this.f2969b = new a(this, uVar);
        this.f2970c = new b(this, uVar);
        this.f2971d = new c(this, uVar);
        this.f2972e = new d(this, uVar);
    }

    @Override // S5.p
    public List a() {
        Boolean boolValueOf;
        x xVarD = x.d("SELECT * FROM work_data", 0);
        this.f2968a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f2968a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "notification");
            int iE3 = X.a.e(cursorB, "trigger");
            int iE4 = X.a.e(cursorB, "with_alarm_manager");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                arrayList.add(new r(string, blob, blob2, boolValueOf));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // S5.p
    public void b(List list) {
        this.f2968a.assertNotSuspendingTransaction();
        StringBuilder sbB = X.d.b();
        sbB.append("DELETE FROM work_data WHERE id in (");
        X.d.a(sbB, list.size());
        sbB.append(")");
        Z.k kVarCompileStatement = this.f2968a.compileStatement(sbB.toString());
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                kVarCompileStatement.A0(i7);
            } else {
                kVarCompileStatement.v(i7, str);
            }
            i7++;
        }
        this.f2968a.beginTransaction();
        try {
            kVarCompileStatement.D();
            this.f2968a.setTransactionSuccessful();
        } finally {
            this.f2968a.endTransaction();
        }
    }

    @Override // S5.p
    public void c(r rVar) {
        this.f2968a.assertNotSuspendingTransaction();
        this.f2968a.beginTransaction();
        try {
            this.f2970c.handle(rVar);
            this.f2968a.setTransactionSuccessful();
        } finally {
            this.f2968a.endTransaction();
        }
    }

    @Override // S5.p
    public void d() {
        this.f2968a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f2971d.acquire();
        this.f2968a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f2968a.setTransactionSuccessful();
        } finally {
            this.f2968a.endTransaction();
            this.f2971d.release(kVarAcquire);
        }
    }

    @Override // S5.p
    public void e(r rVar) {
        this.f2968a.assertNotSuspendingTransaction();
        this.f2968a.beginTransaction();
        try {
            this.f2969b.insert(rVar);
            this.f2968a.setTransactionSuccessful();
        } finally {
            this.f2968a.endTransaction();
        }
    }

    @Override // S5.p
    public r f(String str) {
        boolean z6 = true;
        x xVarD = x.d("SELECT * from work_data WHERE id = ?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f2968a.assertNotSuspendingTransaction();
        r rVar = null;
        Boolean boolValueOf = null;
        Cursor cursorB = X.b.b(this.f2968a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "notification");
            int iE3 = X.a.e(cursorB, "trigger");
            int iE4 = X.a.e(cursorB, "with_alarm_manager");
            if (cursorB.moveToFirst()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z6 = false;
                    }
                    boolValueOf = Boolean.valueOf(z6);
                }
                rVar = new r(string, blob, blob2, boolValueOf);
            }
            return rVar;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // S5.p
    public void g(String str) {
        this.f2968a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f2972e.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f2968a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f2968a.setTransactionSuccessful();
        } finally {
            this.f2968a.endTransaction();
            this.f2972e.release(kVarAcquire);
        }
    }

    @Override // S5.p
    public List h(Boolean bool) {
        Boolean boolValueOf;
        x xVarD = x.d("SELECT * FROM work_data WHERE with_alarm_manager = ?", 1);
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            xVarD.A0(1);
        } else {
            xVarD.b0(1, r15.intValue());
        }
        this.f2968a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f2968a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "notification");
            int iE3 = X.a.e(cursorB, "trigger");
            int iE4 = X.a.e(cursorB, "with_alarm_manager");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                byte[] blob = cursorB.isNull(iE2) ? null : cursorB.getBlob(iE2);
                byte[] blob2 = cursorB.isNull(iE3) ? null : cursorB.getBlob(iE3);
                Integer numValueOf = cursorB.isNull(iE4) ? null : Integer.valueOf(cursorB.getInt(iE4));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                arrayList.add(new r(string, blob, blob2, boolValueOf));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }
}
