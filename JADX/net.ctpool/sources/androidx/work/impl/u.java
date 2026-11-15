package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f9473a = l0.i.i("Schedulers");

    static t a(Context context, E e7) {
        androidx.work.impl.background.systemjob.g gVar = new androidx.work.impl.background.systemjob.g(context, e7);
        r0.p.a(context, SystemJobService.class, true);
        l0.i.e().a(f9473a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q0.v vVarJ = workDatabase.j();
        workDatabase.beginTransaction();
        try {
            List listI = vVarJ.i(aVar.h());
            List listW = vVarJ.w(200);
            if (listI != null && listI.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listI.iterator();
                while (it.hasNext()) {
                    vVarJ.e(((q0.u) it.next()).f21795a, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (listI != null && listI.size() > 0) {
                q0.u[] uVarArr = (q0.u[]) listI.toArray(new q0.u[listI.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    t tVar = (t) it2.next();
                    if (tVar.c()) {
                        tVar.e(uVarArr);
                    }
                }
            }
            if (listW == null || listW.size() <= 0) {
                return;
            }
            q0.u[] uVarArr2 = (q0.u[]) listW.toArray(new q0.u[listW.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                t tVar2 = (t) it3.next();
                if (!tVar2.c()) {
                    tVar2.e(uVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
