package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static B f5032d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f5034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f5035c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f5037b;

        a() {
        }
    }

    B(Context context, LocationManager locationManager) {
        this.f5033a = context;
        this.f5034b = locationManager;
    }

    static B a(Context context) {
        if (f5032d == null) {
            Context applicationContext = context.getApplicationContext();
            f5032d = new B(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f5032d;
    }

    private Location b() {
        Location locationC = androidx.core.content.f.b(this.f5033a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.f.b(this.f5033a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f5034b.isProviderEnabled(str)) {
                return this.f5034b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e7) {
            Log.d("TwilightManager", "Failed to get last known location", e7);
            return null;
        }
    }

    private boolean e() {
        return this.f5035c.f5037b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j7;
        a aVar = this.f5035c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        A aB = A.b();
        aB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        aB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z6 = aB.f4929c == 1;
        long j8 = aB.f4928b;
        long j9 = aB.f4927a;
        aB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j10 = aB.f4928b;
        if (j8 == -1 || j9 == -1) {
            j7 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j9) {
                j10 = jCurrentTimeMillis > j8 ? j9 : j8;
            }
            j7 = j10 + 60000;
        }
        aVar.f5036a = z6;
        aVar.f5037b = j7;
    }

    boolean d() {
        a aVar = this.f5035c;
        if (e()) {
            return aVar.f5036a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f5036a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i7 = Calendar.getInstance().get(11);
        return i7 < 6 || i7 >= 22;
    }
}
