package u0;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import androidx.concurrent.futures.c;
import androidx.core.app.AbstractC0559k;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.b;
import androidx.work.c;
import app.notifee.core.ForegroundService;
import app.notifee.core.Logger;
import app.notifee.core.ReceiverService;
import app.notifee.core.Worker;
import app.notifee.core.event.NotificationEvent;
import app.notifee.core.interfaces.MethodCallResult;
import app.notifee.core.model.NotificationAndroidActionModel;
import app.notifee.core.model.NotificationAndroidModel;
import app.notifee.core.model.NotificationAndroidPressActionModel;
import app.notifee.core.model.NotificationAndroidStyleModel;
import app.notifee.core.model.NotificationModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.EnumC1845c;
import l0.k;
import l0.n;
import w0.C2177d;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2263c;
import z3.InterfaceC2266f;
import z3.InterfaceC2268h;

/* JADX INFO: loaded from: classes.dex */
public abstract class R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f22440a = Executors.newCachedThreadPool();

    public static AbstractC0559k.e a(NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel) {
        Boolean bool = Boolean.FALSE;
        AbstractC0559k.e eVar = new AbstractC0559k.e(S5.e.f2956a, notificationAndroidModel.getChannelId());
        Bundle bundle = notificationModel.f9562a.getBundle("data");
        eVar.t(bundle != null ? (Bundle) bundle.clone() : new Bundle());
        eVar.s(ReceiverService.a("app.notifee.core.ReceiverService.DELETE_INTENT", new String[]{"notification"}, notificationModel.toBundle()));
        eVar.o((S5.e.f2956a.getApplicationInfo().targetSdkVersion < 31 || Build.VERSION.SDK_INT < 31) ? ReceiverService.a("app.notifee.core.ReceiverService.PRESS_INTENT", new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidModel.getPressAction()) : S5.k.a(notificationModel.b().intValue(), notificationAndroidModel.getPressAction(), 1, new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidModel.getPressAction()));
        if (notificationModel.f9562a.getString("title") != null) {
            eVar.q(androidx.core.text.b.a(notificationModel.f9562a.getString("title"), 0));
        }
        if (notificationModel.f9562a.getString("subtitle") != null) {
            eVar.P(androidx.core.text.b.a(notificationModel.f9562a.getString("subtitle"), 0));
        }
        if (notificationModel.f9562a.getString("body") != null) {
            eVar.p(androidx.core.text.b.a(notificationModel.f9562a.getString("body"), 0));
        }
        if (notificationAndroidModel.getBadgeIconType() != null) {
            eVar.i(notificationAndroidModel.getBadgeIconType().intValue());
        }
        if (notificationAndroidModel.getCategory() != null) {
            eVar.j(notificationAndroidModel.getCategory());
        }
        if (notificationAndroidModel.getColor() != null) {
            eVar.m(notificationAndroidModel.getColor().intValue());
        }
        eVar.n(notificationAndroidModel.getColorized().booleanValue());
        eVar.l(notificationAndroidModel.getChronometerCountDown().booleanValue());
        if (notificationAndroidModel.getGroup() != null) {
            eVar.w(notificationAndroidModel.getGroup());
        }
        eVar.x(notificationAndroidModel.getGroupAlertBehaviour());
        eVar.y(notificationAndroidModel.getGroupSummary().booleanValue());
        if (notificationAndroidModel.getInputHistory() != null) {
            eVar.H(notificationAndroidModel.getInputHistory());
        }
        if (notificationAndroidModel.getLights() != null) {
            ArrayList<Integer> lights = notificationAndroidModel.getLights();
            eVar.A(lights.get(0).intValue(), lights.get(1).intValue(), lights.get(2).intValue());
        }
        eVar.B(notificationAndroidModel.getLocalOnly().booleanValue());
        if (notificationAndroidModel.getNumber() != null) {
            eVar.C(notificationAndroidModel.getNumber().intValue());
        }
        if (notificationAndroidModel.getSound() != null) {
            Uri uriE = S5.o.e(notificationAndroidModel.getSound());
            if (uriE != null) {
                bool = Boolean.TRUE;
                eVar.N(uriE);
            } else {
                Logger.w("NotificationManager", "Unable to retrieve sound for notification, sound was specified as: " + notificationAndroidModel.getSound());
            }
        }
        eVar.r(notificationAndroidModel.getDefaults(bool).intValue());
        eVar.D(notificationAndroidModel.getOngoing().booleanValue());
        eVar.E(notificationAndroidModel.getOnlyAlertOnce().booleanValue());
        eVar.F(notificationAndroidModel.getPriority());
        NotificationAndroidModel.a progress = notificationAndroidModel.getProgress();
        if (progress != null) {
            eVar.G(progress.f9559a, progress.f9560b, progress.f9561c);
        }
        if (notificationAndroidModel.getShortcutId() != null) {
            eVar.I(notificationAndroidModel.getShortcutId());
        }
        eVar.J(notificationAndroidModel.getShowTimestamp().booleanValue());
        Integer smallIcon = notificationAndroidModel.getSmallIcon();
        if (smallIcon != null) {
            Integer smallIconLevel = notificationAndroidModel.getSmallIconLevel();
            int iIntValue = smallIcon.intValue();
            if (smallIconLevel != null) {
                eVar.L(iIntValue, smallIconLevel.intValue());
            } else {
                eVar.K(iIntValue);
            }
        }
        if (notificationAndroidModel.getSortKey() != null) {
            eVar.M(notificationAndroidModel.getSortKey());
        }
        if (notificationAndroidModel.getTicker() != null) {
            eVar.Q(notificationAndroidModel.getTicker());
        }
        if (notificationAndroidModel.getTimeoutAfter() != null) {
            eVar.R(notificationAndroidModel.getTimeoutAfter().longValue());
        }
        eVar.S(notificationAndroidModel.getShowChronometer().booleanValue());
        long[] vibrationPattern = notificationAndroidModel.getVibrationPattern();
        if (vibrationPattern.length > 0) {
            eVar.T(vibrationPattern);
        }
        eVar.U(notificationAndroidModel.getVisibility());
        long timestamp = notificationAndroidModel.getTimestamp();
        if (timestamp > -1) {
            eVar.V(timestamp);
        }
        eVar.h(notificationAndroidModel.getAutoCancel().booleanValue());
        return eVar;
    }

    public static AbstractC0559k.e b(NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel, AbstractC2272l abstractC2272l) {
        AbstractC0559k.e eVar = (AbstractC0559k.e) abstractC2272l.l();
        if (notificationAndroidModel.hasFullScreenAction().booleanValue()) {
            NotificationAndroidPressActionModel fullScreenAction = notificationAndroidModel.getFullScreenAction();
            String launchActivity = fullScreenAction.getLaunchActivity();
            Class clsA = S5.i.a(launchActivity);
            if (clsA == null) {
                Logger.e("NotificationManager", String.format("Launch Activity for full-screen action does not exist ('%s').", launchActivity));
                return eVar;
            }
            Intent intent = new Intent(S5.e.f2956a, (Class<?>) clsA);
            if (fullScreenAction.getLaunchActivityFlags() != -1) {
                intent.addFlags(fullScreenAction.getLaunchActivityFlags());
            }
            if (fullScreenAction.getMainComponent() != null) {
                intent.putExtra("mainComponent", fullScreenAction.getMainComponent());
                intent.putExtra("notification", notificationModel.toBundle());
                S5.f.b(new S5.j(fullScreenAction.getMainComponent()));
            }
            eVar.v(PendingIntent.getActivity(S5.e.f2956a, notificationModel.b().intValue(), intent, 167772160), true);
        }
        return eVar;
    }

    public static AbstractC0559k.e c(NotificationAndroidModel notificationAndroidModel, AbstractC2272l abstractC2272l) {
        StringBuilder sb;
        String str;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        Rect rect;
        float f7;
        Rect rect2;
        AbstractC0559k.e eVar = (AbstractC0559k.e) abstractC2272l.l();
        if (notificationAndroidModel.hasLargeIcon().booleanValue()) {
            String largeIcon = notificationAndroidModel.getLargeIcon();
            try {
                bitmap = (Bitmap) AbstractC2275o.b(S5.o.c(largeIcon), 10L, TimeUnit.SECONDS);
            } catch (TimeoutException e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Timeout occurred whilst trying to retrieve a largeIcon image: ";
                sb.append(str);
                sb.append(largeIcon);
                Logger.e("NotificationManager", sb.toString(), e);
                bitmap = null;
            } catch (Exception e8) {
                e = e8;
                sb = new StringBuilder();
                str = "An error occurred whilst trying to retrieve a largeIcon image: ";
                sb.append(str);
                sb.append(largeIcon);
                Logger.e("NotificationManager", sb.toString(), e);
                bitmap = null;
            }
            if (bitmap != null) {
                if (notificationAndroidModel.getCircularLargeIcon().booleanValue()) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    if (width > height) {
                        bitmapCreateBitmap = Bitmap.createBitmap(height, height, config);
                        int i7 = (width - height) / 2;
                        rect = new Rect(i7, 0, i7 + height, height);
                        rect2 = new Rect(0, 0, height, height);
                        f7 = height / 2;
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap(width, width, config);
                        int i8 = (height - width) / 2;
                        rect = new Rect(0, i8, width, i8 + width);
                        f7 = width / 2;
                        rect2 = new Rect(0, 0, width, width);
                    }
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-65536);
                    canvas.drawCircle(f7, f7, f7, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect2, paint);
                    bitmap = bitmapCreateBitmap;
                }
                eVar.z(bitmap);
            }
        }
        return eVar;
    }

    public static Object d(List list, int i7, String str) {
        l0.t tVarH = l0.t.h(S5.e.f2956a);
        androidx.core.app.T tI = androidx.core.app.T.i(S5.e.f2956a);
        Iterator it = list.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it.hasNext()) {
                return null;
            }
            String str2 = (String) it.next();
            Logger.i("NotificationManager", "Removing notification with id " + str2);
            if (i7 != 2) {
                if (str != null && str2.equals("0")) {
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(str2));
                    } catch (Exception unused) {
                        Logger.e("NotificationManager", "cancelAllNotificationsWithIds -> Failed to parse id as integer  " + str2);
                    }
                    if (numValueOf != null) {
                        tI.c(str, numValueOf.intValue());
                    }
                }
                tI.c(str, str2.hashCode());
            }
            if (i7 != 1) {
                Logger.i("NotificationManager", "Removing notification with id " + str2);
                tVarH.b("trigger:" + str2);
                tVarH.j();
                PendingIntent pendingIntentB = w0.b(str2);
                AlarmManager alarmManagerA = S5.a.a();
                if (pendingIntentB != null) {
                    alarmManagerA.cancel(pendingIntentB);
                }
            }
        }
    }

    public static Object e(AbstractC2272l abstractC2272l) {
        v0.i.i(S5.e.f2956a).k();
        return null;
    }

    public static Void f(int i7, List list, AbstractC2272l abstractC2272l) {
        if (i7 == 1) {
            return null;
        }
        v0.i.i(S5.e.f2956a).n(list);
        return null;
    }

    public static /* synthetic */ Void g(int i7, AbstractC2272l abstractC2272l) {
        if (i7 != 2 && i7 != 0) {
            return null;
        }
        abstractC2272l.i(w0.d()).g(new InterfaceC2268h() { // from class: u0.A0
            @Override // z3.InterfaceC2268h
            public final void b(Object obj) {
                ((AbstractC2272l) obj).i(new InterfaceC2263c() { // from class: u0.G0
                    @Override // z3.InterfaceC2263c
                    public final Object a(AbstractC2272l abstractC2272l2) {
                        return R0.e(abstractC2272l2);
                    }
                });
            }
        });
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Void h(Bundle bundle, NotificationModel notificationModel) {
        TimeUnit timeUnit;
        TimeUnit timeUnitValueOf;
        int iA = S5.m.a(bundle.get("type"));
        if (iA == 0) {
            C2177d c2177d = new C2177d(bundle);
            String str = "trigger:" + notificationModel.c();
            long jRound = 0;
            if (c2177d.f22588a.containsKey("timestamp")) {
                if (S5.m.d(c2177d.f22588a.get("timestamp")) > 0) {
                    jRound = Math.round((r11 - System.currentTimeMillis()) / 1000);
                }
            }
            int i7 = c2177d.f22589b;
            b.a aVarG = new b.a().g("workType", "app.notifee.core.NotificationManager.TRIGGER").g("id", notificationModel.c());
            Boolean bool = c2177d.f22591d;
            v0.i.i(S5.e.f2956a);
            v0.i.f22575b.l(new S5.r(notificationModel.c(), S5.m.c(notificationModel.toBundle()), S5.m.c(bundle), bool));
            if (bool.booleanValue()) {
                w0.h(notificationModel, c2177d);
            } else {
                l0.t tVarH = l0.t.h(S5.e.f2956a);
                if (i7 == -1) {
                    k.a aVar = new k.a(Worker.class);
                    aVar.a("app.notifee.core.NotificationManager.TRIGGER");
                    aVar.a(str);
                    aVarG.g("workRequestType", "OneTime");
                    aVar.k(aVarG.a());
                    aVar.j(jRound, TimeUnit.SECONDS);
                    tVarH.g(str, l0.d.REPLACE, (l0.k) aVar.b());
                } else {
                    n.a aVar2 = new n.a(Worker.class, c2177d.f22589b, c2177d.f22590c);
                    aVar2.a("app.notifee.core.NotificationManager.TRIGGER");
                    aVar2.a(str);
                    aVar2.j(jRound, TimeUnit.SECONDS);
                    aVarG.g("workRequestType", "Periodic");
                    aVar2.k(aVarG.a());
                    tVarH.e(str, EnumC1845c.UPDATE, (l0.n) aVar2.b());
                }
            }
        } else if (iA == 1) {
            String str2 = "trigger:" + notificationModel.c();
            l0.t tVarH2 = l0.t.h(S5.e.f2956a);
            b.a aVarG2 = new b.a().g("workType", "app.notifee.core.NotificationManager.TRIGGER").g("workRequestType", "Periodic").g("id", notificationModel.c());
            v0.i.i(S5.e.f2956a);
            v0.i.f22575b.l(new S5.r(notificationModel.c(), S5.m.c(notificationModel.toBundle()), S5.m.c(bundle), Boolean.FALSE));
            long jA = bundle.containsKey("interval") ? S5.m.a(bundle.get("interval")) : -1;
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            if (bundle.containsKey("timeUnit")) {
                String string = bundle.getString("timeUnit");
                try {
                    timeUnitValueOf = TimeUnit.valueOf(string);
                } catch (IllegalArgumentException e7) {
                    timeUnit = timeUnit2;
                    Logger.e("IntervalTriggerModel", "An error occurred whilst trying to convert interval time unit: " + string, (Exception) e7);
                    timeUnitValueOf = timeUnit;
                }
                n.a aVar3 = new n.a(Worker.class, jA, timeUnitValueOf);
                TimeUnit timeUnitValueOf2 = TimeUnit.SECONDS;
                if (bundle.containsKey("timeUnit")) {
                    String string2 = bundle.getString("timeUnit");
                    try {
                        timeUnitValueOf2 = TimeUnit.valueOf(string2);
                    } catch (IllegalArgumentException e8) {
                        Logger.e("IntervalTriggerModel", "An error occurred whilst trying to convert interval time unit: " + string2, (Exception) e8);
                    }
                }
                n.a aVar4 = (n.a) aVar3.j(jA, timeUnitValueOf2);
                aVar4.a("app.notifee.core.NotificationManager.TRIGGER");
                aVar4.a(str2);
                aVar4.k(aVarG2.a());
                tVarH2.e(str2, EnumC1845c.UPDATE, (l0.n) aVar4.b());
            } else {
                timeUnit = timeUnit2;
            }
            timeUnitValueOf = timeUnit;
            n.a aVar32 = new n.a(Worker.class, jA, timeUnitValueOf);
            TimeUnit timeUnitValueOf22 = TimeUnit.SECONDS;
            if (bundle.containsKey("timeUnit")) {
            }
            n.a aVar42 = (n.a) aVar32.j(jA, timeUnitValueOf22);
            aVar42.a("app.notifee.core.NotificationManager.TRIGGER");
            aVar42.a(str2);
            aVar42.k(aVarG2.a());
            tVarH2.e(str2, EnumC1845c.UPDATE, (l0.n) aVar42.b());
        }
        S5.f.a(new NotificationEvent(7, notificationModel));
        return null;
    }

    public static Void i(NotificationModel notificationModel, Bundle bundle, AbstractC2272l abstractC2272l) {
        AbstractC0559k.e eVar = (AbstractC0559k.e) abstractC2272l.l();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("notifee.notification", notificationModel.toBundle());
        if (bundle != null) {
            bundle2.putBundle("notifee.trigger", bundle);
        }
        eVar.c(bundle2);
        Notification notificationD = eVar.d();
        int iIntValue = notificationModel.b().intValue();
        NotificationAndroidModel notificationAndroidModelA = notificationModel.a();
        if (notificationAndroidModelA.getLoopSound().booleanValue()) {
            notificationD.flags |= 4;
        }
        if (notificationAndroidModelA.getFlags() != null && notificationAndroidModelA.getFlags().length > 0) {
            for (int i7 : notificationAndroidModelA.getFlags()) {
                notificationD.flags = i7 | notificationD.flags;
            }
        }
        if (notificationAndroidModelA.getLightUpScreen().booleanValue()) {
            PowerManager powerManager = (PowerManager) S5.e.f2956a.getSystemService("power");
            if (!powerManager.isInteractive()) {
                powerManager.newWakeLock(805306394, "Notifee:lock").acquire();
                powerManager.newWakeLock(1, "Notifee:cpuLock").acquire();
            }
        }
        if (notificationAndroidModelA.getAsForegroundService().booleanValue()) {
            Bundle bundle3 = notificationModel.toBundle();
            String str = ForegroundService.f9532m;
            Intent intent = new Intent(S5.e.f2956a, (Class<?>) ForegroundService.class);
            intent.setAction("app.notifee.core.ForegroundService.START");
            intent.putExtra("hashCode", iIntValue);
            intent.putExtra("notification", notificationD);
            intent.putExtra("notificationBundle", bundle3);
            if (Build.VERSION.SDK_INT >= 26) {
                S5.e.f2956a.startForegroundService(intent);
            } else {
                S5.e.f2956a.startService(intent);
            }
        } else {
            androidx.core.app.T.i(S5.e.f2956a).p(notificationAndroidModelA.getTag(), iIntValue, notificationD);
        }
        S5.f.a(new NotificationEvent(3, notificationModel));
        return null;
    }

    public static AbstractC2272l j() {
        return AbstractC2275o.c(new Callable() { // from class: u0.N0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return R0.w();
            }
        });
    }

    public static AbstractC2272l k(final int i7) {
        return AbstractC2275o.c(new Callable() { // from class: u0.Q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return R0.v(i7);
            }
        }).h(f22440a, new InterfaceC2263c() { // from class: u0.z0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.g(i7, abstractC2272l);
            }
        });
    }

    public static AbstractC2272l l(final int i7, final List list, final String str) {
        return AbstractC2275o.c(new Callable() { // from class: u0.L0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return R0.d(list, i7, str);
            }
        }).i(new InterfaceC2263c() { // from class: u0.M0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.f(i7, list, abstractC2272l);
            }
        });
    }

    public static AbstractC2272l m(androidx.work.b bVar, c.a aVar, AbstractC2272l abstractC2272l) {
        byte[] bArrJ;
        S5.r rVar = (S5.r) abstractC2272l.l();
        if (rVar == null || (bArrJ = rVar.f2974b) == null) {
            bArrJ = bVar.j("notification");
            if (bArrJ == null) {
                Logger.w("NotificationManager", "Attempted to handle doScheduledWork but no notification data was found.");
                aVar.b(c.a.c());
                return null;
            }
            Logger.w("NotificationManager", "The trigger notification was created using an older version, please consider recreating the notification.");
        }
        NotificationModel notificationModel = new NotificationModel(S5.m.b(bArrJ));
        byte[] bArr = rVar.f2975c;
        return x(notificationModel, bArr != null ? S5.m.b(bArr) : null);
    }

    public static AbstractC2272l n(final NotificationModel notificationModel) {
        final NotificationAndroidModel notificationAndroidModelA = notificationModel.a();
        Callable callable = new Callable() { // from class: u0.B0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return R0.a(notificationAndroidModelA, notificationModel);
            }
        };
        InterfaceC2263c interfaceC2263c = new InterfaceC2263c() { // from class: u0.C0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.c(notificationAndroidModelA, abstractC2272l);
            }
        };
        InterfaceC2263c interfaceC2263c2 = new InterfaceC2263c() { // from class: u0.D0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.b(notificationAndroidModelA, notificationModel, abstractC2272l);
            }
        };
        InterfaceC2263c interfaceC2263c3 = new InterfaceC2263c() { // from class: u0.E0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.t(notificationAndroidModelA, notificationModel, abstractC2272l);
            }
        };
        InterfaceC2263c interfaceC2263c4 = new InterfaceC2263c() { // from class: u0.F0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.u(notificationAndroidModelA, abstractC2272l);
            }
        };
        ExecutorService executorService = f22440a;
        return AbstractC2275o.d(executorService, callable).h(executorService, interfaceC2263c).h(executorService, interfaceC2263c3).h(executorService, interfaceC2263c4).h(executorService, interfaceC2263c2);
    }

    public static AbstractC2272l o(final NotificationModel notificationModel, final Bundle bundle) {
        return AbstractC2275o.d(f22440a, new Callable() { // from class: u0.O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return R0.h(bundle, notificationModel);
            }
        });
    }

    public static void p(c.a aVar, androidx.work.b bVar, String str, AbstractC2272l abstractC2272l) {
        aVar.b(c.a.c());
        if (!abstractC2272l.p()) {
            Logger.e("NotificationManager", "Failed to display notification", abstractC2272l.k());
            return;
        }
        String strM = bVar.m("workRequestType");
        if (strM == null || !strM.equals("OneTime")) {
            return;
        }
        v0.i.i(S5.e.f2956a).m(str);
    }

    public static void q(final androidx.work.b bVar, final c.a aVar) {
        final String strM = bVar.m("id");
        v0.i iVar = new v0.i(S5.e.f2956a);
        iVar.q(strM).j(f22440a, new InterfaceC2263c() { // from class: u0.H0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.m(bVar, aVar, abstractC2272l);
            }
        }).c(new InterfaceC2266f() { // from class: u0.I0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                R0.p(aVar, bVar, strM, abstractC2272l);
            }
        });
    }

    public static void r(final MethodCallResult methodCallResult) {
        new v0.i(S5.e.f2956a).p().c(new InterfaceC2266f() { // from class: u0.K0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                R0.s(methodCallResult, abstractC2272l);
            }
        });
    }

    public static void s(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        ArrayList arrayList = new ArrayList();
        if (!abstractC2272l.p()) {
            methodCallResult.onComplete(abstractC2272l.k(), null);
            return;
        }
        Iterator it = ((List) abstractC2272l.l()).iterator();
        while (it.hasNext()) {
            arrayList.add(((S5.r) it.next()).f2973a);
        }
        methodCallResult.onComplete(null, arrayList);
    }

    public static AbstractC0559k.e t(NotificationAndroidModel notificationAndroidModel, NotificationModel notificationModel, AbstractC2272l abstractC2272l) {
        StringBuilder sb;
        String str;
        Bitmap bitmap;
        AbstractC0559k.e eVar = (AbstractC0559k.e) abstractC2272l.l();
        ArrayList<NotificationAndroidActionModel> actions = notificationAndroidModel.getActions();
        if (actions == null) {
            return eVar;
        }
        for (NotificationAndroidActionModel notificationAndroidActionModel : actions) {
            PendingIntent pendingIntentA = (S5.e.f2956a.getApplicationInfo().targetSdkVersion < 31 || Build.VERSION.SDK_INT < 31) ? ReceiverService.a("app.notifee.core.ReceiverService.ACTION_PRESS_INTENT", new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidActionModel.getPressAction().toBundle()) : S5.k.a(notificationModel.b().intValue(), notificationAndroidActionModel.getPressAction().toBundle(), 2, new String[]{"notification", "pressAction"}, notificationModel.toBundle(), notificationAndroidActionModel.getPressAction().toBundle());
            String icon = notificationAndroidActionModel.getIcon();
            if (icon != null) {
                try {
                    bitmap = (Bitmap) AbstractC2275o.b(S5.o.c(notificationAndroidActionModel.getIcon()), 10L, TimeUnit.SECONDS);
                } catch (TimeoutException e7) {
                    e = e7;
                    sb = new StringBuilder();
                    str = "Timeout occurred whilst trying to retrieve an action icon: ";
                    sb.append(str);
                    sb.append(icon);
                    Logger.e("NotificationManager", sb.toString(), e);
                    bitmap = null;
                } catch (Exception e8) {
                    e = e8;
                    sb = new StringBuilder();
                    str = "An error occurred whilst trying to retrieve an action icon: ";
                    sb.append(str);
                    sb.append(icon);
                    Logger.e("NotificationManager", sb.toString(), e);
                    bitmap = null;
                }
            } else {
                bitmap = null;
            }
            AbstractC0559k.a.C0132a c0132a = new AbstractC0559k.a.C0132a(bitmap != null ? IconCompat.c(bitmap) : null, androidx.core.text.b.a(notificationAndroidActionModel.getTitle(), 0), pendingIntentA);
            androidx.core.app.Y remoteInput = notificationAndroidActionModel.getRemoteInput(c0132a);
            if (remoteInput != null) {
                c0132a.a(remoteInput);
            }
            eVar.b(c0132a.b());
        }
        return eVar;
    }

    public static /* synthetic */ AbstractC0559k.e u(NotificationAndroidModel notificationAndroidModel, AbstractC2272l abstractC2272l) {
        AbstractC2272l styleTask;
        AbstractC0559k.h hVar;
        AbstractC0559k.e eVar = (AbstractC0559k.e) abstractC2272l.l();
        NotificationAndroidStyleModel style = notificationAndroidModel.getStyle();
        if (style != null && (styleTask = style.getStyleTask(f22440a)) != null && (hVar = (AbstractC0559k.h) AbstractC2275o.a(styleTask)) != null) {
            eVar.O(hVar);
        }
        return eVar;
    }

    public static Object v(int i7) {
        androidx.core.app.T tI = androidx.core.app.T.i(S5.e.f2956a);
        if (i7 == 1 || i7 == 0) {
            tI.d();
        }
        if (i7 != 2 && i7 != 0) {
            return null;
        }
        l0.t tVarH = l0.t.h(S5.e.f2956a);
        tVarH.a("app.notifee.core.NotificationManager.TRIGGER");
        tVarH.j();
        return null;
    }

    public static List w() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : ((NotificationManager) S5.e.f2956a.getSystemService("notification")).getActiveNotifications()) {
            Notification notification = statusBarNotification.getNotification();
            Bundle bundle = notification.extras;
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = bundle.getBundle("notifee.notification");
            Bundle bundle4 = bundle.getBundle("notifee.trigger");
            if (bundle3 == null) {
                bundle3 = new Bundle();
                bundle3.putString("id", "" + statusBarNotification.getId());
                Object obj = bundle.get("android.title");
                if (obj != null) {
                    bundle3.putString("title", obj.toString());
                }
                Object obj2 = bundle.get("android.text");
                if (obj2 != null) {
                    bundle3.putString("body", obj2.toString());
                }
                Object obj3 = bundle.get("android.subText");
                if (obj3 != null) {
                    bundle3.putString("subtitle", obj3.toString());
                }
                Bundle bundle5 = new Bundle();
                if (Build.VERSION.SDK_INT >= 26) {
                    bundle5.putString("channelId", notification.getChannelId());
                }
                bundle5.putString("tag", statusBarNotification.getTag());
                bundle5.putString("group", notification.getGroup());
                bundle3.putBundle("android", bundle5);
                sb = new StringBuilder();
                sb.append("");
                sb.append(statusBarNotification.getId());
            } else {
                sb = new StringBuilder();
                sb.append("");
                sb.append(bundle3.get("id"));
            }
            bundle2.putString("id", sb.toString());
            if (bundle4 != null) {
                bundle2.putBundle("trigger", bundle4);
            }
            bundle2.putBundle("notification", bundle3);
            bundle2.putString("date", "" + statusBarNotification.getPostTime());
            arrayList.add(bundle2);
        }
        return arrayList;
    }

    public static AbstractC2272l x(final NotificationModel notificationModel, final Bundle bundle) {
        return n(notificationModel).h(f22440a, new InterfaceC2263c() { // from class: u0.P0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return R0.i(notificationModel, bundle, abstractC2272l);
            }
        });
    }

    public static void y(final MethodCallResult methodCallResult) {
        new v0.i(S5.e.f2956a).p().c(new InterfaceC2266f() { // from class: u0.J0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                R0.z(methodCallResult, abstractC2272l);
            }
        });
    }

    public static void z(MethodCallResult methodCallResult, AbstractC2272l abstractC2272l) {
        Exception excK;
        ArrayList arrayList = new ArrayList();
        if (abstractC2272l.p()) {
            for (S5.r rVar : (List) abstractC2272l.l()) {
                Bundle bundle = new Bundle();
                bundle.putBundle("notification", S5.m.b(rVar.f2974b));
                bundle.putBundle("trigger", S5.m.b(rVar.f2975c));
                arrayList.add(bundle);
            }
            excK = null;
        } else {
            excK = abstractC2272l.k();
        }
        methodCallResult.onComplete(excK, arrayList);
    }
}
