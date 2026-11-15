package h4;

import android.app.ApplicationExitInfo;
import android.content.Context;
import app.notifee.core.event.LogEvent;
import e4.C1629g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import k4.F;
import n4.C1926e;
import n4.C1928g;
import o4.C1945b;
import r0.AbstractC2015f;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f19719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1926e f19720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1945b f19721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j4.e f19722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j4.n f19723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L f19724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i4.f f19725g;

    c0(C c7, C1926e c1926e, C1945b c1945b, j4.e eVar, j4.n nVar, L l7, i4.f fVar) {
        this.f19719a = c7;
        this.f19720b = c1926e;
        this.f19721c = c1945b;
        this.f19722d = eVar;
        this.f19723e = nVar;
        this.f19724f = l7;
        this.f19725g = fVar;
    }

    private F.e.d d(F.e.d dVar, j4.e eVar, j4.n nVar) {
        F.e.d.b bVarH = dVar.h();
        String strC = eVar.c();
        if (strC != null) {
            bVarH.d(F.e.d.AbstractC0291d.a().b(strC).a());
        } else {
            C1629g.f().i("No log data to include with this event.");
        }
        List listN = n(nVar.f());
        List listN2 = n(nVar.g());
        if (!listN.isEmpty() || !listN2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listN).g(listN2).a());
        }
        return bVarH.a();
    }

    private F.e.d e(F.e.d dVar) {
        return f(d(dVar, this.f19722d, this.f19723e), this.f19723e);
    }

    private F.e.d f(F.e.d dVar, j4.n nVar) {
        List listH = nVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        F.e.d.b bVarH = dVar.h();
        bVarH.e(F.e.d.f.a().b(listH).a());
        return bVarH.a();
    }

    private static F.a g(ApplicationExitInfo applicationExitInfo) {
        String strH = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strH = h(traceInputStream);
            }
        } catch (IOException e7) {
            C1629g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e7);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strH).a();
    }

    public static String h(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    public static c0 i(Context context, L l7, C1928g c1928g, C1713b c1713b, j4.e eVar, j4.n nVar, q4.d dVar, p4.j jVar, Q q6, C1725n c1725n, i4.f fVar) {
        return new c0(new C(context, l7, c1713b, dVar, jVar), new C1926e(c1928g, jVar, c1725n), C1945b.b(context, jVar, q6), eVar, nVar, l7, fVar);
    }

    private D j(D d7) {
        if (d7.b().h() != null && d7.b().g() != null) {
            return d7;
        }
        K kD = this.f19724f.d(true);
        return D.a(d7.b().t(kD.b()).s(kD.a()), d7.d(), d7.c());
    }

    private ApplicationExitInfo m(String str, List list) {
        long jQ = this.f19720b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = AbstractC2015f.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List n(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: h4.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c0.p((F.c) obj, (F.c) obj2);
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(F.c cVar, F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(F.e.d dVar, String str, boolean z6) {
        C1629g.f().b("disk worker: log non-fatal event to persistence");
        this.f19720b.y(dVar, str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            C1629g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC2272l.k());
            return false;
        }
        D d7 = (D) abstractC2272l.l();
        C1629g.f().b("Crashlytics report successfully enqueued to DataTransport: " + d7.d());
        File fileC = d7.c();
        if (fileC.delete()) {
            C1629g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        C1629g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void u(Throwable th, Thread thread, final String str, String str2, long j7, boolean z6) {
        final boolean zEquals = str2.equals("crash");
        final F.e.d dVarE = e(this.f19719a.d(th, thread, str2, j7, 4, 8, z6));
        if (z6) {
            this.f19720b.y(dVarE, str, zEquals);
        } else {
            this.f19725g.f19952b.f(new Runnable() { // from class: h4.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19704m.q(dVarE, str, zEquals);
                }
            });
        }
    }

    public AbstractC2272l A(Executor executor, String str) {
        List<D> listW = this.f19720b.w();
        ArrayList arrayList = new ArrayList();
        for (D d7 : listW) {
            if (str == null || str.equals(d7.d())) {
                arrayList.add(this.f19721c.c(j(d7), str != null).h(executor, new InterfaceC2263c() { // from class: h4.Z
                    @Override // z3.InterfaceC2263c
                    public final Object a(AbstractC2272l abstractC2272l) {
                        return Boolean.valueOf(this.f19703a.t(abstractC2272l));
                    }
                }));
            }
        }
        return AbstractC2275o.g(arrayList);
    }

    public void k(String str, List list, F.a aVar) {
        C1629g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b bVarC = ((O) it.next()).c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        this.f19720b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void l(long j7, String str) {
        this.f19720b.k(str, j7);
    }

    public boolean o() {
        return this.f19720b.r();
    }

    public SortedSet r() {
        return this.f19720b.p();
    }

    public void s(String str, long j7) {
        this.f19720b.z(this.f19719a.e(str, j7));
    }

    public void v(Throwable th, Thread thread, String str, long j7) {
        C1629g.f().i("Persisting fatal event for session " + str);
        u(th, thread, str, "crash", j7, true);
    }

    public void w(Throwable th, Thread thread, String str, long j7) {
        C1629g.f().i("Persisting non-fatal event for session " + str);
        u(th, thread, str, LogEvent.LEVEL_ERROR, j7, false);
    }

    public void x(String str, List list, j4.e eVar, j4.n nVar) {
        ApplicationExitInfo applicationExitInfoM = m(str, list);
        if (applicationExitInfoM == null) {
            C1629g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d dVarC = this.f19719a.c(g(applicationExitInfoM));
        C1629g.f().b("Persisting anr for session " + str);
        this.f19720b.y(f(d(dVarC, eVar, nVar), nVar), str, true);
    }

    public void y() {
        this.f19720b.i();
    }

    public AbstractC2272l z(Executor executor) {
        return A(executor, null);
    }
}
