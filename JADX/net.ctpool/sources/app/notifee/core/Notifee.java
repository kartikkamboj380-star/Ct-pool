package app.notifee.core;

import S5.a;
import S5.b;
import S5.c;
import S5.e;
import S5.f;
import S5.g;
import S5.i;
import S5.j;
import S5.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.core.app.T;
import app.notifee.core.Notifee;
import app.notifee.core.interfaces.EventListener;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import u0.AbstractC2113p0;
import u0.R0;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Notifee {

    @KeepForSdk
    public static final int REQUEST_CODE_NOTIFICATION_PERMISSION = 11111;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Notifee f9534b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9535c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodCallResult f9536a;

    public static /* synthetic */ void b(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void c(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void d(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void e(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void f(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void g(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Void) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    @KeepForSdk
    public static Context getContext() {
        return e.f2956a;
    }

    @KeepForSdk
    public static Notifee getInstance() {
        if (!f9535c) {
            Logger.w("API", "getInstance() accessed before event listener is initialized");
            f9534b = new Notifee();
        }
        return f9534b;
    }

    public static /* synthetic */ void h(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, null);
        } else {
            Logger.e("API", "createTriggerNotification", abstractC2272l.k());
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void i(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, null);
        } else {
            Logger.e("API", "displayNotification", abstractC2272l.k());
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    @KeepForSdk
    public static void initialize(EventListener eventListener) {
        synchronized (Notifee.class) {
            try {
                if (f9535c) {
                    return;
                }
                if (f9534b == null) {
                    f9534b = new Notifee();
                }
                if (eventListener != null) {
                    EventSubscriber.register(eventListener);
                }
                f9535c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void j(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Bundle) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void k(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Bundle) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void l(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (List) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void m(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (List) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void n(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (List) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void o(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Boolean) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    public static /* synthetic */ void p(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            methodCallResult.onComplete(null, (Boolean) abstractC2272l.l());
        } else {
            methodCallResult.onComplete(abstractC2272l.k(), null);
        }
    }

    @KeepForSdk
    public void cancelAllNotifications(int i7, final MethodCallResult<Void> methodCallResult) {
        R0.k(i7).c(new InterfaceC2266f() { // from class: u0.i
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.b(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void cancelAllNotificationsWithIds(int i7, List<String> list, String str, final MethodCallResult<Void> methodCallResult) {
        R0.l(i7, list, str).c(new InterfaceC2266f() { // from class: u0.k
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.c(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void createChannel(Bundle bundle, final MethodCallResult<Void> methodCallResult) {
        AbstractC2113p0.e(new c(bundle)).c(new InterfaceC2266f() { // from class: u0.r
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.d(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void createChannelGroup(Bundle bundle, final MethodCallResult<Void> methodCallResult) {
        AbstractC2113p0.d(new b(bundle)).c(new InterfaceC2266f() { // from class: u0.u
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.e(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void createChannelGroups(List<Bundle> list, final MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(it.next()));
        }
        AbstractC2113p0.g(arrayList).c(new InterfaceC2266f() { // from class: u0.t
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.f(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void createChannels(List<Bundle> list, final MethodCallResult<Void> methodCallResult) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Bundle> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c(it.next()));
        }
        AbstractC2113p0.l(arrayList).c(new InterfaceC2266f() { // from class: u0.v
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.g(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void createTriggerNotification(Bundle bundle, Bundle bundle2, final MethodCallResult<Void> methodCallResult) {
        R0.o(new NotificationModel(bundle), bundle2).c(new InterfaceC2266f() { // from class: u0.m
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.h(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void deleteChannel(String str, MethodCallResult<Void> methodCallResult) {
        ExecutorService executorService = AbstractC2113p0.f22466a;
        T.i(e.f2956a).g(str);
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void deleteChannelGroup(String str, MethodCallResult<Void> methodCallResult) {
        ExecutorService executorService = AbstractC2113p0.f22466a;
        T.i(e.f2956a).h(str);
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void displayNotification(Bundle bundle, final MethodCallResult<Void> methodCallResult) {
        R0.x(new NotificationModel(bundle), null).c(new InterfaceC2266f() { // from class: u0.q
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.i(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getChannel(String str, final MethodCallResult<Bundle> methodCallResult) {
        AbstractC2113p0.f(str).c(new InterfaceC2266f() { // from class: u0.o
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.j(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getChannelGroup(String str, final MethodCallResult<Bundle> methodCallResult) {
        AbstractC2113p0.k(str).c(new InterfaceC2266f() { // from class: u0.g
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.k(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getChannelGroups(final MethodCallResult<List<Bundle>> methodCallResult) {
        AbstractC2113p0.c().c(new InterfaceC2266f() { // from class: u0.h
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.l(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getChannels(final MethodCallResult<List<Bundle>> methodCallResult) {
        AbstractC2113p0.j().c(new InterfaceC2266f() { // from class: u0.p
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.m(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getDisplayedNotifications(final MethodCallResult<List<Bundle>> methodCallResult) {
        R0.j().c(new InterfaceC2266f() { // from class: u0.n
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.n(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void getInitialNotification(Activity activity, MethodCallResult<Bundle> methodCallResult) {
        g gVar = (g) f.f2957b.f2958a.q(g.class);
        Bundle bundle = new Bundle();
        if (gVar != null) {
            bundle.putAll(gVar.f2960b);
            bundle.putBundle("notification", gVar.f2959a.toBundle());
            methodCallResult.onComplete(null, bundle);
            return;
        }
        if (activity != null) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null && intent.getExtras() != null && intent.hasExtra("notification")) {
                    bundle.putBundle("notification", intent.getBundleExtra("notification"));
                    methodCallResult.onComplete(null, bundle);
                    return;
                }
            } catch (Exception e7) {
                Logger.e("API", "getInitialNotification", e7);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public String getMainComponent(String str) {
        j jVar = (j) f.f2957b.f2958a.q(j.class);
        return jVar == null ? str : jVar.f2963a;
    }

    @KeepForSdk
    public void getNotificationSettings(MethodCallResult<Bundle> methodCallResult) {
        boolean zA = T.i(e.f2956a).a();
        Bundle bundle = new Bundle();
        if (zA) {
            bundle.putInt("authorizationStatus", 1);
        } else {
            bundle.putInt("authorizationStatus", 0);
        }
        boolean zCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? a.a().canScheduleExactAlarms() : true;
        Bundle bundle2 = new Bundle();
        if (zCanScheduleExactAlarms) {
            bundle2.putInt("alarm", 1);
        } else {
            bundle2.putInt("alarm", 0);
        }
        bundle.putBundle("android", bundle2);
        methodCallResult.onComplete(null, bundle);
    }

    @KeepForSdk
    public void getPowerManagerInfo(MethodCallResult<Bundle> methodCallResult) {
        String strB = i.b(n.a(e.f2956a));
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        Bundle bundle = new Bundle();
        bundle.putString("manufacturer", str);
        bundle.putString("model", str2);
        bundle.putString("version", str3);
        bundle.putString("activity", strB);
        methodCallResult.onComplete(null, bundle);
    }

    @KeepForSdk
    public void getTriggerNotificationIds(MethodCallResult<List<String>> methodCallResult) {
        R0.r(methodCallResult);
    }

    @KeepForSdk
    public void getTriggerNotifications(MethodCallResult<List<Bundle>> methodCallResult) {
        R0.y(methodCallResult);
    }

    @KeepForSdk
    public void isBatteryOptimizationEnabled(MethodCallResult<Boolean> methodCallResult) {
        Context context = e.f2956a;
        methodCallResult.onComplete(null, Boolean.valueOf(!((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())));
    }

    @KeepForSdk
    public void isChannelBlocked(String str, final MethodCallResult<Boolean> methodCallResult) {
        AbstractC2113p0.o(str).c(new InterfaceC2266f() { // from class: u0.s
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.o(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public void isChannelCreated(String str, final MethodCallResult<Boolean> methodCallResult) {
        AbstractC2113p0.r(str).c(new InterfaceC2266f() { // from class: u0.l
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                Notifee.p(methodCallResult, abstractC2272l);
            }
        });
    }

    @KeepForSdk
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        MethodCallResult<Bundle> methodCallResult;
        if (i7 != 11111 || (methodCallResult = this.f9536a) == null) {
            return false;
        }
        getNotificationSettings(methodCallResult);
        return true;
    }

    @KeepForSdk
    public void openAlarmPermissionSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + e.f2956a.getPackageName()));
                i.c(activity, intent);
            } catch (Exception e7) {
                Logger.e("AlarmUtils", "An error occurred whilst trying to open alarm permission settings", e7);
            }
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openBatteryOptimizationSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
            intent.setFlags(268435456);
            if (activity != null) {
                if (i.d(e.f2956a, intent)) {
                    i.c(activity, intent);
                } else {
                    Logger.d("PowerManagerUtils", "battery optimization settings is not available on device");
                }
            }
        } catch (Exception e7) {
            Logger.e("PowerManagerUtils", "An error occurred whilst trying to open battery optimization settings", e7);
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openNotificationSettings(String str, Activity activity, MethodCallResult<Void> methodCallResult) {
        final Intent intent;
        if (getContext() == null || activity == null) {
            Logger.d("openNotificationSettings", "attempted to start activity but no current activity or context was available.");
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                if (str != null) {
                    intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.CHANNEL_ID", str);
                } else {
                    intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                }
                intent.putExtra("android.provider.extra.APP_PACKAGE", getContext().getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_SETTINGS");
            }
            intent.setFlags(268435456);
            activity.runOnUiThread(new Runnable() { // from class: u0.j
                @Override // java.lang.Runnable
                public final void run() {
                    Notifee.getContext().startActivity(intent);
                }
            });
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void openPowerManagerSettings(Activity activity, MethodCallResult<Void> methodCallResult) {
        Intent intentA;
        synchronized (n.class) {
            intentA = n.f2964a;
        }
        if (intentA == null) {
            intentA = n.a(e.f2956a);
        }
        if (intentA != null) {
            try {
                intentA.setFlags(268435456);
                i.c(activity, intentA);
            } catch (Exception e7) {
                Logger.e("PowerManagerUtils", "Unable to start activity: " + i.b(intentA), e7);
            }
        } else {
            Logger.w("PowerManagerUtils", "Unable to find an activity to open the device's power manager");
        }
        methodCallResult.onComplete(null, null);
    }

    @KeepForSdk
    public void setRequestPermissionCallback(MethodCallResult<Bundle> methodCallResult) {
        this.f9536a = methodCallResult;
    }

    @KeepForSdk
    public void stopForegroundService(MethodCallResult<Void> methodCallResult) {
        String str = ForegroundService.f9532m;
        Intent intent = new Intent(e.f2956a, (Class<?>) ForegroundService.class);
        intent.setAction("app.notifee.core.ForegroundService.STOP");
        try {
            e.f2956a.startService(intent);
        } catch (IllegalStateException unused) {
            e.f2956a.stopService(intent);
        } catch (Exception e7) {
            Logger.e("ForegroundService", "Unable to stop foreground service", e7);
        }
        methodCallResult.onComplete(null, null);
    }
}
