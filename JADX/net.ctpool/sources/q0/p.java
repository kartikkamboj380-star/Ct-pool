package q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21783b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.A0(2);
            } else {
                kVar.v(2, nVar.b());
            }
        }
    }

    public p(androidx.room.u uVar) {
        this.f21782a = uVar;
        this.f21783b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // q0.o
    public void a(n nVar) {
        this.f21782a.assertNotSuspendingTransaction();
        this.f21782a.beginTransaction();
        try {
            this.f21783b.insert(nVar);
            this.f21782a.setTransactionSuccessful();
        } finally {
            this.f21782a.endTransaction();
        }
    }

    @Override // q0.o
    public List b(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21782a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21782a, xVarD, false, null);
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
}
