package N4;

import O4.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import w4.InterfaceC2196a;
import y4.C2248d;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f2270a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC2196a f2271b;

    static {
        InterfaceC2196a interfaceC2196aI = new C2248d().j(C0441c.f2330a).k(true).i();
        w5.k.e(interfaceC2196aI, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f2271b = interfaceC2196aI;
    }

    private A() {
    }

    private final EnumC0442d d(O4.b bVar) {
        return bVar == null ? EnumC0442d.COLLECTION_SDK_NOT_INSTALLED : bVar.b() ? EnumC0442d.COLLECTION_ENABLED : EnumC0442d.COLLECTION_DISABLED;
    }

    public final z a(Y3.f fVar, y yVar, P4.f fVar2, Map map, String str, String str2) {
        w5.k.f(fVar, "firebaseApp");
        w5.k.f(yVar, "sessionDetails");
        w5.k.f(fVar2, "sessionsSettings");
        w5.k.f(map, "subscribers");
        w5.k.f(str, "firebaseInstallationId");
        w5.k.f(str2, "firebaseAuthenticationToken");
        return new z(EnumC0447i.SESSION_START, new C(yVar.b(), yVar.a(), yVar.c(), yVar.d(), new C0443e(d((O4.b) map.get(b.a.PERFORMANCE)), d((O4.b) map.get(b.a.CRASHLYTICS)), fVar2.b()), str, str2), b(fVar));
    }

    public final C0440b b(Y3.f fVar) throws PackageManager.NameNotFoundException {
        w5.k.f(fVar, "firebaseApp");
        Context contextM = fVar.m();
        w5.k.e(contextM, "firebaseApp.applicationContext");
        String packageName = contextM.getPackageName();
        PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = fVar.r().c();
        w5.k.e(strC, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        w5.k.e(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        w5.k.e(str2, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        w5.k.e(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? strValueOf : str3;
        String str5 = Build.MANUFACTURER;
        w5.k.e(str5, "MANUFACTURER");
        v vVar = v.f2409a;
        Context contextM2 = fVar.m();
        w5.k.e(contextM2, "firebaseApp.applicationContext");
        u uVarD = vVar.d(contextM2);
        Context contextM3 = fVar.m();
        w5.k.e(contextM3, "firebaseApp.applicationContext");
        return new C0440b(strC, str, "2.0.6", str2, tVar, new C0439a(packageName, str4, strValueOf, str5, uVarD, vVar.c(contextM3)));
    }

    public final InterfaceC2196a c() {
        return f2271b;
    }
}
