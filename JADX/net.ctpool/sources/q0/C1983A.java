package q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import q0.z;

/* JADX INFO: renamed from: q0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1983A implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.A f21750c;

    /* JADX INFO: renamed from: q0.A$a */
    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.A0(2);
            } else {
                kVar.v(2, yVar.b());
            }
        }
    }

    /* JADX INFO: renamed from: q0.A$b */
    class b extends androidx.room.A {
        b(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C1983A(androidx.room.u uVar) {
        this.f21748a = uVar;
        this.f21749b = new a(uVar);
        this.f21750c = new b(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // q0.z
    public void a(y yVar) {
        this.f21748a.assertNotSuspendingTransaction();
        this.f21748a.beginTransaction();
        try {
            this.f21749b.insert(yVar);
            this.f21748a.setTransactionSuccessful();
        } finally {
            this.f21748a.endTransaction();
        }
    }

    @Override // q0.z
    public List b(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21748a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21748a, xVarD, false, null);
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

    @Override // q0.z
    public void c(String str, Set set) {
        z.a.a(this, str, set);
    }

    @Override // q0.z
    public void d(String str) {
        this.f21748a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21750c.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21748a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21748a.setTransactionSuccessful();
        } finally {
            this.f21748a.endTransaction();
            this.f21750c.release(kVarAcquire);
        }
    }
}
