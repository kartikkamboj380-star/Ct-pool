package q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1986b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21761b;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, C1985a c1985a) {
            if (c1985a.b() == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, c1985a.b());
            }
            if (c1985a.a() == null) {
                kVar.A0(2);
            } else {
                kVar.v(2, c1985a.a());
            }
        }
    }

    public c(androidx.room.u uVar) {
        this.f21760a = uVar;
        this.f21761b = new a(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // q0.InterfaceC1986b
    public void a(C1985a c1985a) {
        this.f21760a.assertNotSuspendingTransaction();
        this.f21760a.beginTransaction();
        try {
            this.f21761b.insert(c1985a);
            this.f21760a.setTransactionSuccessful();
        } finally {
            this.f21760a.endTransaction();
        }
    }

    @Override // q0.InterfaceC1986b
    public List b(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21760a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21760a, xVarD, false, null);
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

    @Override // q0.InterfaceC1986b
    public boolean c(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21760a.assertNotSuspendingTransaction();
        boolean z6 = false;
        Cursor cursorB = X.b.b(this.f21760a, xVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z6 = cursorB.getInt(0) != 0;
            }
            return z6;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.InterfaceC1986b
    public boolean d(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21760a.assertNotSuspendingTransaction();
        boolean z6 = false;
        Cursor cursorB = X.b.b(this.f21760a, xVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z6 = cursorB.getInt(0) != 0;
            }
            return z6;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }
}
