package q0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l0.C1844b;
import l0.EnumC1843a;
import q0.u;

/* JADX INFO: loaded from: classes.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.h f21819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.A f21820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.room.A f21821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.room.A f21822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.room.A f21823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.room.A f21824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.room.A f21825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.room.A f21826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.room.A f21827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.room.A f21828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.room.A f21829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.room.A f21830n;

    class a extends androidx.room.A {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class b extends androidx.room.A {
        b(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class c extends androidx.room.A {
        c(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class d extends androidx.room.A {
        d(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class e extends androidx.room.i {
        e(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(Z.k kVar, u uVar) throws Throwable {
            String str = uVar.f21795a;
            if (str == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, str);
            }
            C1984B c1984b = C1984B.f21753a;
            kVar.b0(2, C1984B.j(uVar.f21796b));
            String str2 = uVar.f21797c;
            if (str2 == null) {
                kVar.A0(3);
            } else {
                kVar.v(3, str2);
            }
            String str3 = uVar.f21798d;
            if (str3 == null) {
                kVar.A0(4);
            } else {
                kVar.v(4, str3);
            }
            byte[] bArrO = androidx.work.b.o(uVar.f21799e);
            if (bArrO == null) {
                kVar.A0(5);
            } else {
                kVar.i0(5, bArrO);
            }
            byte[] bArrO2 = androidx.work.b.o(uVar.f21800f);
            if (bArrO2 == null) {
                kVar.A0(6);
            } else {
                kVar.i0(6, bArrO2);
            }
            kVar.b0(7, uVar.f21801g);
            kVar.b0(8, uVar.f21802h);
            kVar.b0(9, uVar.f21803i);
            kVar.b0(10, uVar.f21805k);
            kVar.b0(11, C1984B.a(uVar.f21806l));
            kVar.b0(12, uVar.f21807m);
            kVar.b0(13, uVar.f21808n);
            kVar.b0(14, uVar.f21809o);
            kVar.b0(15, uVar.f21810p);
            kVar.b0(16, uVar.f21811q ? 1L : 0L);
            kVar.b0(17, C1984B.h(uVar.f21812r));
            kVar.b0(18, uVar.g());
            kVar.b0(19, uVar.f());
            C1844b c1844b = uVar.f21804j;
            if (c1844b != null) {
                kVar.b0(20, C1984B.g(c1844b.d()));
                kVar.b0(21, c1844b.g() ? 1L : 0L);
                kVar.b0(22, c1844b.h() ? 1L : 0L);
                kVar.b0(23, c1844b.f() ? 1L : 0L);
                kVar.b0(24, c1844b.i() ? 1L : 0L);
                kVar.b0(25, c1844b.b());
                kVar.b0(26, c1844b.a());
                byte[] bArrI = C1984B.i(c1844b.c());
                if (bArrI != null) {
                    kVar.i0(27, bArrI);
                    return;
                }
            } else {
                kVar.A0(20);
                kVar.A0(21);
                kVar.A0(22);
                kVar.A0(23);
                kVar.A0(24);
                kVar.A0(25);
                kVar.A0(26);
            }
            kVar.A0(27);
        }
    }

    class f extends androidx.room.h {
        f(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
        @Override // androidx.room.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(Z.k kVar, u uVar) throws Throwable {
            String str;
            String str2 = uVar.f21795a;
            if (str2 == null) {
                kVar.A0(1);
            } else {
                kVar.v(1, str2);
            }
            C1984B c1984b = C1984B.f21753a;
            kVar.b0(2, C1984B.j(uVar.f21796b));
            String str3 = uVar.f21797c;
            if (str3 == null) {
                kVar.A0(3);
            } else {
                kVar.v(3, str3);
            }
            String str4 = uVar.f21798d;
            if (str4 == null) {
                kVar.A0(4);
            } else {
                kVar.v(4, str4);
            }
            byte[] bArrO = androidx.work.b.o(uVar.f21799e);
            if (bArrO == null) {
                kVar.A0(5);
            } else {
                kVar.i0(5, bArrO);
            }
            byte[] bArrO2 = androidx.work.b.o(uVar.f21800f);
            if (bArrO2 == null) {
                kVar.A0(6);
            } else {
                kVar.i0(6, bArrO2);
            }
            kVar.b0(7, uVar.f21801g);
            kVar.b0(8, uVar.f21802h);
            kVar.b0(9, uVar.f21803i);
            kVar.b0(10, uVar.f21805k);
            kVar.b0(11, C1984B.a(uVar.f21806l));
            kVar.b0(12, uVar.f21807m);
            kVar.b0(13, uVar.f21808n);
            kVar.b0(14, uVar.f21809o);
            kVar.b0(15, uVar.f21810p);
            kVar.b0(16, uVar.f21811q ? 1L : 0L);
            kVar.b0(17, C1984B.h(uVar.f21812r));
            kVar.b0(18, uVar.g());
            kVar.b0(19, uVar.f());
            C1844b c1844b = uVar.f21804j;
            if (c1844b != null) {
                kVar.b0(20, C1984B.g(c1844b.d()));
                kVar.b0(21, c1844b.g() ? 1L : 0L);
                kVar.b0(22, c1844b.h() ? 1L : 0L);
                kVar.b0(23, c1844b.f() ? 1L : 0L);
                kVar.b0(24, c1844b.i() ? 1L : 0L);
                kVar.b0(25, c1844b.b());
                kVar.b0(26, c1844b.a());
                byte[] bArrI = C1984B.i(c1844b.c());
                if (bArrI != null) {
                    kVar.i0(27, bArrI);
                }
                str = uVar.f21795a;
                if (str != null) {
                    kVar.A0(28);
                    return;
                } else {
                    kVar.v(28, str);
                    return;
                }
            }
            kVar.A0(20);
            kVar.A0(21);
            kVar.A0(22);
            kVar.A0(23);
            kVar.A0(24);
            kVar.A0(25);
            kVar.A0(26);
            kVar.A0(27);
            str = uVar.f21795a;
            if (str != null) {
            }
        }
    }

    class g extends androidx.room.A {
        g(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class h extends androidx.room.A {
        h(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class i extends androidx.room.A {
        i(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class j extends androidx.room.A {
        j(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class k extends androidx.room.A {
        k(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class l extends androidx.room.A {
        l(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class m extends androidx.room.A {
        m(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(androidx.room.u uVar) {
        this.f21817a = uVar;
        this.f21818b = new e(uVar);
        this.f21819c = new f(uVar);
        this.f21820d = new g(uVar);
        this.f21821e = new h(uVar);
        this.f21822f = new i(uVar);
        this.f21823g = new j(uVar);
        this.f21824h = new k(uVar);
        this.f21825i = new l(uVar);
        this.f21826j = new m(uVar);
        this.f21827k = new a(uVar);
        this.f21828l = new b(uVar);
        this.f21829m = new c(uVar);
        this.f21830n = new d(uVar);
    }

    public static List y() {
        return Collections.emptyList();
    }

    @Override // q0.v
    public void a(String str) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21820d.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21817a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
            this.f21820d.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public void b(u uVar) {
        this.f21817a.assertNotSuspendingTransaction();
        this.f21817a.beginTransaction();
        try {
            this.f21818b.insert(uVar);
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
        }
    }

    @Override // q0.v
    public void c() {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21829m.acquire();
        this.f21817a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
            this.f21829m.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public void d(String str) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21822f.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21817a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
            this.f21822f.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public int e(String str, long j7) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21827k.acquire();
        kVarAcquire.b0(1, j7);
        if (str == null) {
            kVarAcquire.A0(2);
        } else {
            kVarAcquire.v(2, str);
        }
        this.f21817a.beginTransaction();
        try {
            int iD = kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
            return iD;
        } finally {
            this.f21817a.endTransaction();
            this.f21827k.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public List f(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new u.b(cursorB.isNull(0) ? null : cursorB.getString(0), C1984B.f(cursorB.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.v
    public List g(long j7) throws Throwable {
        androidx.room.x xVar;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        xVarD.b0(1, j7);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "state");
            int iE3 = X.a.e(cursorB, "worker_class_name");
            int iE4 = X.a.e(cursorB, "input_merger_class_name");
            int iE5 = X.a.e(cursorB, "input");
            int iE6 = X.a.e(cursorB, "output");
            int iE7 = X.a.e(cursorB, "initial_delay");
            int iE8 = X.a.e(cursorB, "interval_duration");
            int iE9 = X.a.e(cursorB, "flex_duration");
            int iE10 = X.a.e(cursorB, "run_attempt_count");
            int iE11 = X.a.e(cursorB, "backoff_policy");
            int iE12 = X.a.e(cursorB, "backoff_delay_duration");
            int iE13 = X.a.e(cursorB, "last_enqueue_time");
            int iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
            try {
                int iE15 = X.a.e(cursorB, "schedule_requested_at");
                int iE16 = X.a.e(cursorB, "run_in_foreground");
                int iE17 = X.a.e(cursorB, "out_of_quota_policy");
                int iE18 = X.a.e(cursorB, "period_count");
                int iE19 = X.a.e(cursorB, "generation");
                int iE20 = X.a.e(cursorB, "required_network_type");
                int iE21 = X.a.e(cursorB, "requires_charging");
                int iE22 = X.a.e(cursorB, "requires_device_idle");
                int iE23 = X.a.e(cursorB, "requires_battery_not_low");
                int iE24 = X.a.e(cursorB, "requires_storage_not_low");
                int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
                int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
                int iE27 = X.a.e(cursorB, "content_uri_triggers");
                int i12 = iE14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                    String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                    String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                    androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                    androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                    long j8 = cursorB.getLong(iE7);
                    long j9 = cursorB.getLong(iE8);
                    long j10 = cursorB.getLong(iE9);
                    int i13 = cursorB.getInt(iE10);
                    EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                    long j11 = cursorB.getLong(iE12);
                    long j12 = cursorB.getLong(iE13);
                    int i14 = i12;
                    long j13 = cursorB.getLong(i14);
                    int i15 = iE;
                    int i16 = iE15;
                    long j14 = cursorB.getLong(i16);
                    iE15 = i16;
                    int i17 = iE16;
                    if (cursorB.getInt(i17) != 0) {
                        iE16 = i17;
                        i7 = iE17;
                        z6 = true;
                    } else {
                        iE16 = i17;
                        i7 = iE17;
                        z6 = false;
                    }
                    l0.m mVarE = C1984B.e(cursorB.getInt(i7));
                    iE17 = i7;
                    int i18 = iE18;
                    int i19 = cursorB.getInt(i18);
                    iE18 = i18;
                    int i20 = iE19;
                    int i21 = cursorB.getInt(i20);
                    iE19 = i20;
                    int i22 = iE20;
                    l0.j jVarD = C1984B.d(cursorB.getInt(i22));
                    iE20 = i22;
                    int i23 = iE21;
                    if (cursorB.getInt(i23) != 0) {
                        iE21 = i23;
                        i8 = iE22;
                        z7 = true;
                    } else {
                        iE21 = i23;
                        i8 = iE22;
                        z7 = false;
                    }
                    if (cursorB.getInt(i8) != 0) {
                        iE22 = i8;
                        i9 = iE23;
                        z8 = true;
                    } else {
                        iE22 = i8;
                        i9 = iE23;
                        z8 = false;
                    }
                    if (cursorB.getInt(i9) != 0) {
                        iE23 = i9;
                        i10 = iE24;
                        z9 = true;
                    } else {
                        iE23 = i9;
                        i10 = iE24;
                        z9 = false;
                    }
                    if (cursorB.getInt(i10) != 0) {
                        iE24 = i10;
                        i11 = iE25;
                        z10 = true;
                    } else {
                        iE24 = i10;
                        i11 = iE25;
                        z10 = false;
                    }
                    long j15 = cursorB.getLong(i11);
                    iE25 = i11;
                    int i24 = iE26;
                    long j16 = cursorB.getLong(i24);
                    iE26 = i24;
                    int i25 = iE27;
                    iE27 = i25;
                    arrayList.add(new u(string, sVarF, string2, string3, bVarH, bVarH2, j8, j9, j10, new C1844b(jVarD, z7, z8, z9, z10, j15, j16, C1984B.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i13, enumC1843aC, j11, j12, j13, j14, z6, mVarE, i19, i21));
                    iE = i15;
                    i12 = i14;
                }
                cursorB.close();
                xVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                xVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = xVarD;
        }
    }

    @Override // q0.v
    public void h(u uVar) {
        this.f21817a.assertNotSuspendingTransaction();
        this.f21817a.beginTransaction();
        try {
            this.f21819c.handle(uVar);
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
        }
    }

    @Override // q0.v
    public List i(int i7) throws Throwable {
        androidx.room.x xVar;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        xVarD.b0(1, i7);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "state");
            int iE3 = X.a.e(cursorB, "worker_class_name");
            int iE4 = X.a.e(cursorB, "input_merger_class_name");
            int iE5 = X.a.e(cursorB, "input");
            int iE6 = X.a.e(cursorB, "output");
            int iE7 = X.a.e(cursorB, "initial_delay");
            int iE8 = X.a.e(cursorB, "interval_duration");
            int iE9 = X.a.e(cursorB, "flex_duration");
            int iE10 = X.a.e(cursorB, "run_attempt_count");
            int iE11 = X.a.e(cursorB, "backoff_policy");
            int iE12 = X.a.e(cursorB, "backoff_delay_duration");
            int iE13 = X.a.e(cursorB, "last_enqueue_time");
            int iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
            try {
                int iE15 = X.a.e(cursorB, "schedule_requested_at");
                int iE16 = X.a.e(cursorB, "run_in_foreground");
                int iE17 = X.a.e(cursorB, "out_of_quota_policy");
                int iE18 = X.a.e(cursorB, "period_count");
                int iE19 = X.a.e(cursorB, "generation");
                int iE20 = X.a.e(cursorB, "required_network_type");
                int iE21 = X.a.e(cursorB, "requires_charging");
                int iE22 = X.a.e(cursorB, "requires_device_idle");
                int iE23 = X.a.e(cursorB, "requires_battery_not_low");
                int iE24 = X.a.e(cursorB, "requires_storage_not_low");
                int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
                int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
                int iE27 = X.a.e(cursorB, "content_uri_triggers");
                int i13 = iE14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                    String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                    String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                    androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                    androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                    long j7 = cursorB.getLong(iE7);
                    long j8 = cursorB.getLong(iE8);
                    long j9 = cursorB.getLong(iE9);
                    int i14 = cursorB.getInt(iE10);
                    EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                    long j10 = cursorB.getLong(iE12);
                    long j11 = cursorB.getLong(iE13);
                    int i15 = i13;
                    long j12 = cursorB.getLong(i15);
                    int i16 = iE;
                    int i17 = iE15;
                    long j13 = cursorB.getLong(i17);
                    iE15 = i17;
                    int i18 = iE16;
                    if (cursorB.getInt(i18) != 0) {
                        iE16 = i18;
                        i8 = iE17;
                        z6 = true;
                    } else {
                        iE16 = i18;
                        i8 = iE17;
                        z6 = false;
                    }
                    l0.m mVarE = C1984B.e(cursorB.getInt(i8));
                    iE17 = i8;
                    int i19 = iE18;
                    int i20 = cursorB.getInt(i19);
                    iE18 = i19;
                    int i21 = iE19;
                    int i22 = cursorB.getInt(i21);
                    iE19 = i21;
                    int i23 = iE20;
                    l0.j jVarD = C1984B.d(cursorB.getInt(i23));
                    iE20 = i23;
                    int i24 = iE21;
                    if (cursorB.getInt(i24) != 0) {
                        iE21 = i24;
                        i9 = iE22;
                        z7 = true;
                    } else {
                        iE21 = i24;
                        i9 = iE22;
                        z7 = false;
                    }
                    if (cursorB.getInt(i9) != 0) {
                        iE22 = i9;
                        i10 = iE23;
                        z8 = true;
                    } else {
                        iE22 = i9;
                        i10 = iE23;
                        z8 = false;
                    }
                    if (cursorB.getInt(i10) != 0) {
                        iE23 = i10;
                        i11 = iE24;
                        z9 = true;
                    } else {
                        iE23 = i10;
                        i11 = iE24;
                        z9 = false;
                    }
                    if (cursorB.getInt(i11) != 0) {
                        iE24 = i11;
                        i12 = iE25;
                        z10 = true;
                    } else {
                        iE24 = i11;
                        i12 = iE25;
                        z10 = false;
                    }
                    long j14 = cursorB.getLong(i12);
                    iE25 = i12;
                    int i25 = iE26;
                    long j15 = cursorB.getLong(i25);
                    iE26 = i25;
                    int i26 = iE27;
                    iE27 = i26;
                    arrayList.add(new u(string, sVarF, string2, string3, bVarH, bVarH2, j7, j8, j9, new C1844b(jVarD, z7, z8, z9, z10, j14, j15, C1984B.b(cursorB.isNull(i26) ? null : cursorB.getBlob(i26))), i14, enumC1843aC, j10, j11, j12, j13, z6, mVarE, i20, i22));
                    iE = i16;
                    i13 = i15;
                }
                cursorB.close();
                xVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                xVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = xVarD;
        }
    }

    @Override // q0.v
    public List j() throws Throwable {
        androidx.room.x xVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            iE = X.a.e(cursorB, "id");
            iE2 = X.a.e(cursorB, "state");
            iE3 = X.a.e(cursorB, "worker_class_name");
            iE4 = X.a.e(cursorB, "input_merger_class_name");
            iE5 = X.a.e(cursorB, "input");
            iE6 = X.a.e(cursorB, "output");
            iE7 = X.a.e(cursorB, "initial_delay");
            iE8 = X.a.e(cursorB, "interval_duration");
            iE9 = X.a.e(cursorB, "flex_duration");
            iE10 = X.a.e(cursorB, "run_attempt_count");
            iE11 = X.a.e(cursorB, "backoff_policy");
            iE12 = X.a.e(cursorB, "backoff_delay_duration");
            iE13 = X.a.e(cursorB, "last_enqueue_time");
            iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
        } catch (Throwable th) {
            th = th;
            xVar = xVarD;
        }
        try {
            int iE15 = X.a.e(cursorB, "schedule_requested_at");
            int iE16 = X.a.e(cursorB, "run_in_foreground");
            int iE17 = X.a.e(cursorB, "out_of_quota_policy");
            int iE18 = X.a.e(cursorB, "period_count");
            int iE19 = X.a.e(cursorB, "generation");
            int iE20 = X.a.e(cursorB, "required_network_type");
            int iE21 = X.a.e(cursorB, "requires_charging");
            int iE22 = X.a.e(cursorB, "requires_device_idle");
            int iE23 = X.a.e(cursorB, "requires_battery_not_low");
            int iE24 = X.a.e(cursorB, "requires_storage_not_low");
            int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = X.a.e(cursorB, "content_uri_triggers");
            int i12 = iE14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j7 = cursorB.getLong(iE7);
                long j8 = cursorB.getLong(iE8);
                long j9 = cursorB.getLong(iE9);
                int i13 = cursorB.getInt(iE10);
                EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                long j10 = cursorB.getLong(iE12);
                long j11 = cursorB.getLong(iE13);
                int i14 = i12;
                long j12 = cursorB.getLong(i14);
                int i15 = iE;
                int i16 = iE15;
                long j13 = cursorB.getLong(i16);
                iE15 = i16;
                int i17 = iE16;
                if (cursorB.getInt(i17) != 0) {
                    iE16 = i17;
                    i7 = iE17;
                    z6 = true;
                } else {
                    iE16 = i17;
                    i7 = iE17;
                    z6 = false;
                }
                l0.m mVarE = C1984B.e(cursorB.getInt(i7));
                iE17 = i7;
                int i18 = iE18;
                int i19 = cursorB.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorB.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                l0.j jVarD = C1984B.d(cursorB.getInt(i22));
                iE20 = i22;
                int i23 = iE21;
                if (cursorB.getInt(i23) != 0) {
                    iE21 = i23;
                    i8 = iE22;
                    z7 = true;
                } else {
                    iE21 = i23;
                    i8 = iE22;
                    z7 = false;
                }
                if (cursorB.getInt(i8) != 0) {
                    iE22 = i8;
                    i9 = iE23;
                    z8 = true;
                } else {
                    iE22 = i8;
                    i9 = iE23;
                    z8 = false;
                }
                if (cursorB.getInt(i9) != 0) {
                    iE23 = i9;
                    i10 = iE24;
                    z9 = true;
                } else {
                    iE23 = i9;
                    i10 = iE24;
                    z9 = false;
                }
                if (cursorB.getInt(i10) != 0) {
                    iE24 = i10;
                    i11 = iE25;
                    z10 = true;
                } else {
                    iE24 = i10;
                    i11 = iE25;
                    z10 = false;
                }
                long j14 = cursorB.getLong(i11);
                iE25 = i11;
                int i24 = iE26;
                long j15 = cursorB.getLong(i24);
                iE26 = i24;
                int i25 = iE27;
                iE27 = i25;
                arrayList.add(new u(string, sVarF, string2, string3, bVarH, bVarH2, j7, j8, j9, new C1844b(jVarD, z7, z8, z9, z10, j14, j15, C1984B.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i13, enumC1843aC, j10, j11, j12, j13, z6, mVarE, i19, i21));
                iE = i15;
                i12 = i14;
            }
            cursorB.close();
            xVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            xVar.release();
            throw th;
        }
    }

    @Override // q0.v
    public void k(String str, androidx.work.b bVar) throws Throwable {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21823g.acquire();
        byte[] bArrO = androidx.work.b.o(bVar);
        if (bArrO == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.i0(1, bArrO);
        }
        if (str == null) {
            kVarAcquire.A0(2);
        } else {
            kVarAcquire.v(2, str);
        }
        this.f21817a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
            this.f21823g.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public int l(l0.s sVar, String str) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21821e.acquire();
        kVarAcquire.b0(1, C1984B.j(sVar));
        if (str == null) {
            kVarAcquire.A0(2);
        } else {
            kVarAcquire.v(2, str);
        }
        this.f21817a.beginTransaction();
        try {
            int iD = kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
            return iD;
        } finally {
            this.f21817a.endTransaction();
            this.f21821e.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public List m() throws Throwable {
        androidx.room.x xVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE state=1", 0);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            iE = X.a.e(cursorB, "id");
            iE2 = X.a.e(cursorB, "state");
            iE3 = X.a.e(cursorB, "worker_class_name");
            iE4 = X.a.e(cursorB, "input_merger_class_name");
            iE5 = X.a.e(cursorB, "input");
            iE6 = X.a.e(cursorB, "output");
            iE7 = X.a.e(cursorB, "initial_delay");
            iE8 = X.a.e(cursorB, "interval_duration");
            iE9 = X.a.e(cursorB, "flex_duration");
            iE10 = X.a.e(cursorB, "run_attempt_count");
            iE11 = X.a.e(cursorB, "backoff_policy");
            iE12 = X.a.e(cursorB, "backoff_delay_duration");
            iE13 = X.a.e(cursorB, "last_enqueue_time");
            iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
        } catch (Throwable th) {
            th = th;
            xVar = xVarD;
        }
        try {
            int iE15 = X.a.e(cursorB, "schedule_requested_at");
            int iE16 = X.a.e(cursorB, "run_in_foreground");
            int iE17 = X.a.e(cursorB, "out_of_quota_policy");
            int iE18 = X.a.e(cursorB, "period_count");
            int iE19 = X.a.e(cursorB, "generation");
            int iE20 = X.a.e(cursorB, "required_network_type");
            int iE21 = X.a.e(cursorB, "requires_charging");
            int iE22 = X.a.e(cursorB, "requires_device_idle");
            int iE23 = X.a.e(cursorB, "requires_battery_not_low");
            int iE24 = X.a.e(cursorB, "requires_storage_not_low");
            int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = X.a.e(cursorB, "content_uri_triggers");
            int i12 = iE14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j7 = cursorB.getLong(iE7);
                long j8 = cursorB.getLong(iE8);
                long j9 = cursorB.getLong(iE9);
                int i13 = cursorB.getInt(iE10);
                EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                long j10 = cursorB.getLong(iE12);
                long j11 = cursorB.getLong(iE13);
                int i14 = i12;
                long j12 = cursorB.getLong(i14);
                int i15 = iE;
                int i16 = iE15;
                long j13 = cursorB.getLong(i16);
                iE15 = i16;
                int i17 = iE16;
                if (cursorB.getInt(i17) != 0) {
                    iE16 = i17;
                    i7 = iE17;
                    z6 = true;
                } else {
                    iE16 = i17;
                    i7 = iE17;
                    z6 = false;
                }
                l0.m mVarE = C1984B.e(cursorB.getInt(i7));
                iE17 = i7;
                int i18 = iE18;
                int i19 = cursorB.getInt(i18);
                iE18 = i18;
                int i20 = iE19;
                int i21 = cursorB.getInt(i20);
                iE19 = i20;
                int i22 = iE20;
                l0.j jVarD = C1984B.d(cursorB.getInt(i22));
                iE20 = i22;
                int i23 = iE21;
                if (cursorB.getInt(i23) != 0) {
                    iE21 = i23;
                    i8 = iE22;
                    z7 = true;
                } else {
                    iE21 = i23;
                    i8 = iE22;
                    z7 = false;
                }
                if (cursorB.getInt(i8) != 0) {
                    iE22 = i8;
                    i9 = iE23;
                    z8 = true;
                } else {
                    iE22 = i8;
                    i9 = iE23;
                    z8 = false;
                }
                if (cursorB.getInt(i9) != 0) {
                    iE23 = i9;
                    i10 = iE24;
                    z9 = true;
                } else {
                    iE23 = i9;
                    i10 = iE24;
                    z9 = false;
                }
                if (cursorB.getInt(i10) != 0) {
                    iE24 = i10;
                    i11 = iE25;
                    z10 = true;
                } else {
                    iE24 = i10;
                    i11 = iE25;
                    z10 = false;
                }
                long j14 = cursorB.getLong(i11);
                iE25 = i11;
                int i24 = iE26;
                long j15 = cursorB.getLong(i24);
                iE26 = i24;
                int i25 = iE27;
                iE27 = i25;
                arrayList.add(new u(string, sVarF, string2, string3, bVarH, bVarH2, j7, j8, j9, new C1844b(jVarD, z7, z8, z9, z10, j14, j15, C1984B.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i13, enumC1843aC, j10, j11, j12, j13, z6, mVarE, i19, i21));
                iE = i15;
                i12 = i14;
            }
            cursorB.close();
            xVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            xVar.release();
            throw th;
        }
    }

    @Override // q0.v
    public boolean n() {
        boolean z6 = false;
        androidx.room.x xVarD = androidx.room.x.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.v
    public List o(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
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

    @Override // q0.v
    public l0.s p(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        l0.s sVarF = null;
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                Integer numValueOf = cursorB.isNull(0) ? null : Integer.valueOf(cursorB.getInt(0));
                if (numValueOf != null) {
                    C1984B c1984b = C1984B.f21753a;
                    sVarF = C1984B.f(numValueOf.intValue());
                }
            }
            return sVarF;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.v
    public u q(String str) throws Throwable {
        androidx.room.x xVar;
        int iE;
        int iE2;
        int iE3;
        int iE4;
        int iE5;
        int iE6;
        int iE7;
        int iE8;
        int iE9;
        int iE10;
        int iE11;
        int iE12;
        int iE13;
        int iE14;
        u uVar;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            iE = X.a.e(cursorB, "id");
            iE2 = X.a.e(cursorB, "state");
            iE3 = X.a.e(cursorB, "worker_class_name");
            iE4 = X.a.e(cursorB, "input_merger_class_name");
            iE5 = X.a.e(cursorB, "input");
            iE6 = X.a.e(cursorB, "output");
            iE7 = X.a.e(cursorB, "initial_delay");
            iE8 = X.a.e(cursorB, "interval_duration");
            iE9 = X.a.e(cursorB, "flex_duration");
            iE10 = X.a.e(cursorB, "run_attempt_count");
            iE11 = X.a.e(cursorB, "backoff_policy");
            iE12 = X.a.e(cursorB, "backoff_delay_duration");
            iE13 = X.a.e(cursorB, "last_enqueue_time");
            iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
        } catch (Throwable th) {
            th = th;
            xVar = xVarD;
        }
        try {
            int iE15 = X.a.e(cursorB, "schedule_requested_at");
            int iE16 = X.a.e(cursorB, "run_in_foreground");
            int iE17 = X.a.e(cursorB, "out_of_quota_policy");
            int iE18 = X.a.e(cursorB, "period_count");
            int iE19 = X.a.e(cursorB, "generation");
            int iE20 = X.a.e(cursorB, "required_network_type");
            int iE21 = X.a.e(cursorB, "requires_charging");
            int iE22 = X.a.e(cursorB, "requires_device_idle");
            int iE23 = X.a.e(cursorB, "requires_battery_not_low");
            int iE24 = X.a.e(cursorB, "requires_storage_not_low");
            int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
            int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
            int iE27 = X.a.e(cursorB, "content_uri_triggers");
            if (cursorB.moveToFirst()) {
                String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                long j7 = cursorB.getLong(iE7);
                long j8 = cursorB.getLong(iE8);
                long j9 = cursorB.getLong(iE9);
                int i12 = cursorB.getInt(iE10);
                EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                long j10 = cursorB.getLong(iE12);
                long j11 = cursorB.getLong(iE13);
                long j12 = cursorB.getLong(iE14);
                long j13 = cursorB.getLong(iE15);
                if (cursorB.getInt(iE16) != 0) {
                    i7 = iE17;
                    z6 = true;
                } else {
                    i7 = iE17;
                    z6 = false;
                }
                l0.m mVarE = C1984B.e(cursorB.getInt(i7));
                int i13 = cursorB.getInt(iE18);
                int i14 = cursorB.getInt(iE19);
                l0.j jVarD = C1984B.d(cursorB.getInt(iE20));
                if (cursorB.getInt(iE21) != 0) {
                    i8 = iE22;
                    z7 = true;
                } else {
                    i8 = iE22;
                    z7 = false;
                }
                if (cursorB.getInt(i8) != 0) {
                    i9 = iE23;
                    z8 = true;
                } else {
                    i9 = iE23;
                    z8 = false;
                }
                if (cursorB.getInt(i9) != 0) {
                    i10 = iE24;
                    z9 = true;
                } else {
                    i10 = iE24;
                    z9 = false;
                }
                if (cursorB.getInt(i10) != 0) {
                    i11 = iE25;
                    z10 = true;
                } else {
                    i11 = iE25;
                    z10 = false;
                }
                uVar = new u(string, sVarF, string2, string3, bVarH, bVarH2, j7, j8, j9, new C1844b(jVarD, z7, z8, z9, z10, cursorB.getLong(i11), cursorB.getLong(iE26), C1984B.b(cursorB.isNull(iE27) ? null : cursorB.getBlob(iE27))), i12, enumC1843aC, j10, j11, j12, j13, z6, mVarE, i13, i14);
            } else {
                uVar = null;
            }
            cursorB.close();
            xVar.release();
            return uVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            xVar.release();
            throw th;
        }
    }

    @Override // q0.v
    public int r(String str) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21826j.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21817a.beginTransaction();
        try {
            int iD = kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
            return iD;
        } finally {
            this.f21817a.endTransaction();
            this.f21826j.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public void s(String str, long j7) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21824h.acquire();
        kVarAcquire.b0(1, j7);
        if (str == null) {
            kVarAcquire.A0(2);
        } else {
            kVarAcquire.v(2, str);
        }
        this.f21817a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
        } finally {
            this.f21817a.endTransaction();
            this.f21824h.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public List t(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
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

    @Override // q0.v
    public List u(String str) {
        androidx.room.x xVarD = androidx.room.x.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.h(cursorB.isNull(0) ? null : cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // q0.v
    public int v(String str) {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21825i.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21817a.beginTransaction();
        try {
            int iD = kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
            return iD;
        } finally {
            this.f21817a.endTransaction();
            this.f21825i.release(kVarAcquire);
        }
    }

    @Override // q0.v
    public List w(int i7) throws Throwable {
        androidx.room.x xVar;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        int i12;
        boolean z10;
        androidx.room.x xVarD = androidx.room.x.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        xVarD.b0(1, i7);
        this.f21817a.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.f21817a, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "state");
            int iE3 = X.a.e(cursorB, "worker_class_name");
            int iE4 = X.a.e(cursorB, "input_merger_class_name");
            int iE5 = X.a.e(cursorB, "input");
            int iE6 = X.a.e(cursorB, "output");
            int iE7 = X.a.e(cursorB, "initial_delay");
            int iE8 = X.a.e(cursorB, "interval_duration");
            int iE9 = X.a.e(cursorB, "flex_duration");
            int iE10 = X.a.e(cursorB, "run_attempt_count");
            int iE11 = X.a.e(cursorB, "backoff_policy");
            int iE12 = X.a.e(cursorB, "backoff_delay_duration");
            int iE13 = X.a.e(cursorB, "last_enqueue_time");
            int iE14 = X.a.e(cursorB, "minimum_retention_duration");
            xVar = xVarD;
            try {
                int iE15 = X.a.e(cursorB, "schedule_requested_at");
                int iE16 = X.a.e(cursorB, "run_in_foreground");
                int iE17 = X.a.e(cursorB, "out_of_quota_policy");
                int iE18 = X.a.e(cursorB, "period_count");
                int iE19 = X.a.e(cursorB, "generation");
                int iE20 = X.a.e(cursorB, "required_network_type");
                int iE21 = X.a.e(cursorB, "requires_charging");
                int iE22 = X.a.e(cursorB, "requires_device_idle");
                int iE23 = X.a.e(cursorB, "requires_battery_not_low");
                int iE24 = X.a.e(cursorB, "requires_storage_not_low");
                int iE25 = X.a.e(cursorB, "trigger_content_update_delay");
                int iE26 = X.a.e(cursorB, "trigger_max_content_delay");
                int iE27 = X.a.e(cursorB, "content_uri_triggers");
                int i13 = iE14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iE) ? null : cursorB.getString(iE);
                    l0.s sVarF = C1984B.f(cursorB.getInt(iE2));
                    String string2 = cursorB.isNull(iE3) ? null : cursorB.getString(iE3);
                    String string3 = cursorB.isNull(iE4) ? null : cursorB.getString(iE4);
                    androidx.work.b bVarH = androidx.work.b.h(cursorB.isNull(iE5) ? null : cursorB.getBlob(iE5));
                    androidx.work.b bVarH2 = androidx.work.b.h(cursorB.isNull(iE6) ? null : cursorB.getBlob(iE6));
                    long j7 = cursorB.getLong(iE7);
                    long j8 = cursorB.getLong(iE8);
                    long j9 = cursorB.getLong(iE9);
                    int i14 = cursorB.getInt(iE10);
                    EnumC1843a enumC1843aC = C1984B.c(cursorB.getInt(iE11));
                    long j10 = cursorB.getLong(iE12);
                    long j11 = cursorB.getLong(iE13);
                    int i15 = i13;
                    long j12 = cursorB.getLong(i15);
                    int i16 = iE;
                    int i17 = iE15;
                    long j13 = cursorB.getLong(i17);
                    iE15 = i17;
                    int i18 = iE16;
                    if (cursorB.getInt(i18) != 0) {
                        iE16 = i18;
                        i8 = iE17;
                        z6 = true;
                    } else {
                        iE16 = i18;
                        i8 = iE17;
                        z6 = false;
                    }
                    l0.m mVarE = C1984B.e(cursorB.getInt(i8));
                    iE17 = i8;
                    int i19 = iE18;
                    int i20 = cursorB.getInt(i19);
                    iE18 = i19;
                    int i21 = iE19;
                    int i22 = cursorB.getInt(i21);
                    iE19 = i21;
                    int i23 = iE20;
                    l0.j jVarD = C1984B.d(cursorB.getInt(i23));
                    iE20 = i23;
                    int i24 = iE21;
                    if (cursorB.getInt(i24) != 0) {
                        iE21 = i24;
                        i9 = iE22;
                        z7 = true;
                    } else {
                        iE21 = i24;
                        i9 = iE22;
                        z7 = false;
                    }
                    if (cursorB.getInt(i9) != 0) {
                        iE22 = i9;
                        i10 = iE23;
                        z8 = true;
                    } else {
                        iE22 = i9;
                        i10 = iE23;
                        z8 = false;
                    }
                    if (cursorB.getInt(i10) != 0) {
                        iE23 = i10;
                        i11 = iE24;
                        z9 = true;
                    } else {
                        iE23 = i10;
                        i11 = iE24;
                        z9 = false;
                    }
                    if (cursorB.getInt(i11) != 0) {
                        iE24 = i11;
                        i12 = iE25;
                        z10 = true;
                    } else {
                        iE24 = i11;
                        i12 = iE25;
                        z10 = false;
                    }
                    long j14 = cursorB.getLong(i12);
                    iE25 = i12;
                    int i25 = iE26;
                    long j15 = cursorB.getLong(i25);
                    iE26 = i25;
                    int i26 = iE27;
                    iE27 = i26;
                    arrayList.add(new u(string, sVarF, string2, string3, bVarH, bVarH2, j7, j8, j9, new C1844b(jVarD, z7, z8, z9, z10, j14, j15, C1984B.b(cursorB.isNull(i26) ? null : cursorB.getBlob(i26))), i14, enumC1843aC, j10, j11, j12, j13, z6, mVarE, i20, i22));
                    iE = i16;
                    i13 = i15;
                }
                cursorB.close();
                xVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                xVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = xVarD;
        }
    }

    @Override // q0.v
    public int x() {
        this.f21817a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21828l.acquire();
        this.f21817a.beginTransaction();
        try {
            int iD = kVarAcquire.D();
            this.f21817a.setTransactionSuccessful();
            return iD;
        } finally {
            this.f21817a.endTransaction();
            this.f21828l.release(kVarAcquire);
        }
    }
}
