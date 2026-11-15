package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.InterfaceC0665e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.impl.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.i;
import q0.m;
import q0.u;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0665e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f9355q = i.i("CommandHandler");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f9356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f9357n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f9358o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final w f9359p;

    b(Context context, w wVar) {
        this.f9356m = context;
        this.f9359p = wVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent d(Context context, m mVar, boolean z6) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        return q(intent, mVar);
    }

    static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i7, g gVar) {
        i.e().a(f9355q, "Handling constraints changed " + intent);
        new c(this.f9356m, i7, gVar).a();
    }

    private void h(Intent intent, int i7, g gVar) {
        synchronized (this.f9358o) {
            try {
                m mVarP = p(intent);
                i iVarE = i.e();
                String str = f9355q;
                iVarE.a(str, "Handing delay met for " + mVarP);
                if (this.f9357n.containsKey(mVarP)) {
                    i.e().a(str, "WorkSpec " + mVarP + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    f fVar = new f(this.f9356m, i7, gVar, this.f9359p.d(mVarP));
                    this.f9357n.put(mVarP, fVar);
                    fVar.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i7) {
        m mVarP = p(intent);
        boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        i.e().a(f9355q, "Handling onExecutionCompleted " + intent + ", " + i7);
        l(mVarP, z6);
    }

    private void j(Intent intent, int i7, g gVar) {
        i.e().a(f9355q, "Handling reschedule " + intent + ", " + i7);
        gVar.g().z();
    }

    private void k(Intent intent, int i7, g gVar) {
        m mVarP = p(intent);
        i iVarE = i.e();
        String str = f9355q;
        iVarE.a(str, "Handling schedule work for " + mVarP);
        WorkDatabase workDatabaseV = gVar.g().v();
        workDatabaseV.beginTransaction();
        try {
            u uVarQ = workDatabaseV.j().q(mVarP.b());
            if (uVarQ == null) {
                i.e().k(str, "Skipping scheduling " + mVarP + " because it's no longer in the DB");
                return;
            }
            if (uVarQ.f21796b.h()) {
                i.e().k(str, "Skipping scheduling " + mVarP + "because it is finished.");
                return;
            }
            long jC = uVarQ.c();
            if (uVarQ.h()) {
                i.e().a(str, "Opportunistically setting an alarm for " + mVarP + "at " + jC);
                a.c(this.f9356m, workDatabaseV, mVarP, jC);
                gVar.f().a().execute(new g.b(gVar, b(this.f9356m), i7));
            } else {
                i.e().a(str, "Setting up Alarms for " + mVarP + "at " + jC);
                a.c(this.f9356m, workDatabaseV, mVarP, jC);
            }
            workDatabaseV.setTransactionSuccessful();
        } finally {
            workDatabaseV.endTransaction();
        }
    }

    private void l(Intent intent, g gVar) {
        List<v> listC;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i7 = extras.getInt("KEY_WORKSPEC_GENERATION");
            listC = new ArrayList(1);
            v vVarB = this.f9359p.b(new m(string, i7));
            if (vVarB != null) {
                listC.add(vVarB);
            }
        } else {
            listC = this.f9359p.c(string);
        }
        for (v vVar : listC) {
            i.e().a(f9355q, "Handing stopWork work for " + string);
            gVar.g().E(vVar);
            a.a(this.f9356m, gVar.g().v(), vVar.a());
            gVar.l(vVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC0665e
    /* JADX INFO: renamed from: a */
    public void l(m mVar, boolean z6) {
        synchronized (this.f9358o) {
            try {
                f fVar = (f) this.f9357n.remove(mVar);
                this.f9359p.b(mVar);
                if (fVar != null) {
                    fVar.h(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z6;
        synchronized (this.f9358o) {
            z6 = !this.f9357n.isEmpty();
        }
        return z6;
    }

    void o(Intent intent, int i7, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i7, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i7, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.e().c(f9355q, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i7, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i7, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i7);
            return;
        }
        i.e().k(f9355q, "Ignoring intent " + intent);
    }
}
