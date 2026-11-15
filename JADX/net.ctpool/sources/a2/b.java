package a2;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import e2.C1619a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f4711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue f4713c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f4714d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f4715e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4716f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4717g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4718h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4719i = 0;

    public interface a {
        void a(List list);

        void b();

        void c(List list);
    }

    public b(c cVar, a aVar) {
        this.f4711a = cVar;
        this.f4712b = aVar;
    }

    private boolean e() {
        boolean zIsIgnorable;
        Throwable runtimeException;
        if (this.f4717g == 0) {
            this.f4718h = 0L;
        }
        this.f4719i = SystemClock.uptimeMillis();
        List<com.facebook.react.fabric.mounting.mountitems.b> listK = k();
        List<MountItem> listI = i();
        if (listI == null && listK == null) {
            return false;
        }
        this.f4712b.a(listI);
        if (listK != null) {
            P2.a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            for (com.facebook.react.fabric.mounting.mountitems.b bVar : listK) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    o(bVar, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    h(bVar);
                } catch (RetryableMountingLayerException e7) {
                    if (bVar.b() == 0) {
                        bVar.c();
                        c(bVar);
                    } else {
                        runtimeException = new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + bVar.toString(), e7);
                        ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", runtimeException);
                    }
                } catch (Throwable th) {
                    runtimeException = new RuntimeException("Caught exception executing ViewCommand: " + bVar.toString(), th);
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", runtimeException);
                }
            }
            P2.a.g(0L);
        }
        Collection<MountItem> collectionJ = j();
        if (collectionJ != null) {
            P2.a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : collectionJ) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    o(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                h(mountItem);
            }
            P2.a.g(0L);
        }
        if (listI != null) {
            P2.a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (MountItem mountItem2 : listI) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    o(mountItem2, "dispatchMountItems: Executing mountItem");
                }
                try {
                    h(mountItem2);
                } finally {
                    if (zIsIgnorable) {
                    }
                }
            }
            this.f4718h += SystemClock.uptimeMillis() - jUptimeMillis;
            P2.a.g(0L);
        }
        this.f4712b.c(listI);
        return true;
    }

    private static List g(ConcurrentLinkedQueue concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            MountItem mountItem = (MountItem) concurrentLinkedQueue.poll();
            if (mountItem != null) {
                arrayList.add(mountItem);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void h(MountItem mountItem) {
        if (!this.f4711a.j(mountItem.getSurfaceId())) {
            mountItem.execute(this.f4711a);
            return;
        }
        if (FabricUIManager.ENABLE_FABRIC_LOGS) {
            P0.a.l("MountItemDispatcher", "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.getSurfaceId()));
        }
        this.f4711a.e(mountItem.getSurfaceId()).J(mountItem);
    }

    private List i() {
        return g(this.f4714d);
    }

    private Collection j() {
        return g(this.f4715e);
    }

    private List k() {
        return g(this.f4713c);
    }

    private static boolean n(long j7) {
        return 16 - ((System.nanoTime() - j7) / 1000000) < 8;
    }

    private static void o(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            P0.a.j("MountItemDispatcher", str + ": " + str2);
        }
    }

    public void a(MountItem mountItem) {
        this.f4714d.add(mountItem);
    }

    public void b(MountItem mountItem) {
        if (this.f4711a.r(mountItem.getSurfaceId())) {
            return;
        }
        this.f4715e.add(mountItem);
    }

    public void c(com.facebook.react.fabric.mounting.mountitems.b bVar) {
        this.f4713c.add(bVar);
    }

    public void d(Queue queue) {
        while (!queue.isEmpty()) {
            MountItem mountItem = (MountItem) queue.poll();
            try {
                mountItem.execute(this.f4711a);
            } catch (RetryableMountingLayerException e7) {
                if (mountItem instanceof com.facebook.react.fabric.mounting.mountitems.b) {
                    com.facebook.react.fabric.mounting.mountitems.b bVar = (com.facebook.react.fabric.mounting.mountitems.b) mountItem;
                    if (bVar.b() == 0) {
                        bVar.c();
                        c(bVar);
                    }
                } else {
                    o(mountItem, "dispatchExternalMountItems: mounting failed with " + e7.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void f(long j7) {
        MountItem mountItem;
        if (this.f4715e.isEmpty()) {
            return;
        }
        P2.a.c(0L, "MountItemDispatcher::premountViews");
        this.f4716f = true;
        while (!n(j7) && (mountItem = (MountItem) this.f4715e.poll()) != null) {
            try {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    o(mountItem, "dispatchPreMountItems");
                }
                h(mountItem);
            } catch (Throwable th) {
                this.f4716f = false;
                throw th;
            }
        }
        this.f4716f = false;
        P2.a.g(0L);
    }

    public long l() {
        return this.f4718h;
    }

    public long m() {
        return this.f4719i;
    }

    public void p() {
        if (this.f4716f) {
            return;
        }
        boolean zE = true;
        if (C1619a.b()) {
            this.f4716f = true;
            while (zE) {
                try {
                    zE = e();
                } finally {
                }
            }
            return;
        }
        try {
            boolean zE2 = e();
            this.f4716f = false;
            this.f4712b.b();
            int i7 = this.f4717g;
            if (i7 < 10 && zE2) {
                if (i7 > 2) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Re-dispatched " + this.f4717g + " times. This indicates setState (?) is likely being called too many times during mounting."));
                }
                this.f4717g++;
                p();
            }
            this.f4717g = 0;
        } catch (Throwable th) {
            try {
                this.f4717g = 0;
                throw th;
            } finally {
            }
        }
    }
}
