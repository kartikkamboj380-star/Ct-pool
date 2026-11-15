package P3;

import Q3.AbstractC0454c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Q3.p f2623e = new Q3.p("AppUpdateService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Intent f2624f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Q3.A f2625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f2627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f2628d;

    u(Context context, w wVar) {
        this.f2626b = context.getPackageName();
        this.f2627c = context;
        this.f2628d = wVar;
        if (AbstractC0454c.a(context)) {
            this.f2625a = new Q3.A(Q3.C.a(context), f2623e, "AppUpdateService", f2624f, q.f2614a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(u uVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(uVar.f2627c.getPackageManager().getPackageInfo(uVar.f2627c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f2623e.a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ C0449a d(u uVar, Bundle bundle, String str) {
        int i7 = bundle.getInt("version.code", -1);
        int i8 = bundle.getInt("update.availability");
        int i9 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i10 = bundle.getInt("in.app.update.priority", 0);
        long j7 = bundle.getLong("bytes.downloaded");
        long j8 = bundle.getLong("total.bytes.to.download");
        long j9 = bundle.getLong("additional.size.required");
        long jA = uVar.f2628d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C0449a.d(str, i7, i8, i9, numValueOf, i10, j7, j8, j9, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Bundle g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = Q3.n.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static AbstractC2272l h() {
        f2623e.a("onError(%d)", -9);
        return AbstractC2275o.e(new S3.a(-9));
    }

    private static HashSet i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final AbstractC2272l c(String str) {
        if (this.f2625a == null) {
            return h();
        }
        f2623e.c("requestUpdateInfo(%s)", str);
        C2273m c2273m = new C2273m();
        this.f2625a.s(new r(this, c2273m, str, c2273m), c2273m);
        return c2273m.a();
    }
}
