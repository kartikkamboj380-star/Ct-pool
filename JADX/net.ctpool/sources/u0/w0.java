package u0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.AbstractC0553e;
import app.notifee.core.Logger;
import app.notifee.core.NotificationAlarmReceiver;
import app.notifee.core.model.NotificationModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w0.C2177d;
import z3.AbstractC2272l;
import z3.InterfaceC2263c;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f22480a = Executors.newCachedThreadPool();

    public static PendingIntent b(String str) {
        try {
            Context context = S5.e.f2956a;
            Intent intent = new Intent(context, (Class<?>) NotificationAlarmReceiver.class);
            intent.putExtra("notificationId", str);
            return PendingIntent.getBroadcast(context, str.hashCode(), intent, 167772160);
        } catch (Exception e7) {
            Logger.e("NotifeeAlarmManager", "Unable to create AlarmManager intent", e7);
            return null;
        }
    }

    public static Object c(AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            return null;
        }
        Iterator it = ((List) abstractC2272l.l()).iterator();
        while (it.hasNext()) {
            PendingIntent pendingIntentB = b(((S5.r) it.next()).f2973a);
            AlarmManager alarmManagerA = S5.a.a();
            if (pendingIntentB != null) {
                alarmManagerA.cancel(pendingIntentB);
            }
        }
        return null;
    }

    public static InterfaceC2263c d() {
        return new InterfaceC2263c() { // from class: u0.u0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return w0.i(abstractC2272l);
            }
        };
    }

    public static AbstractC2272l e(final String str, AbstractC2272l abstractC2272l) {
        byte[] bArr;
        final S5.r rVar = (S5.r) abstractC2272l.l();
        if (rVar == null || rVar.f2974b == null || (bArr = rVar.f2975c) == null) {
            Logger.w("NotifeeAlarmManager", "Attempted to handle doScheduledWork but no notification data was found.");
            return null;
        }
        final Bundle bundleB = S5.m.b(bArr);
        final NotificationModel notificationModel = new NotificationModel(S5.m.b(rVar.f2974b));
        return R0.x(notificationModel, bundleB).c(new InterfaceC2266f() { // from class: u0.t0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l2) {
                w0.g(bundleB, notificationModel, str, rVar, abstractC2272l2);
            }
        });
    }

    public static void f(Bundle bundle) {
        final String string;
        if (bundle == null || (string = bundle.getString("notificationId")) == null) {
            return;
        }
        new v0.i(S5.e.f2956a).q(string).j(f22480a, new InterfaceC2263c() { // from class: u0.r0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return w0.e(string, abstractC2272l);
            }
        }).c(new InterfaceC2266f() { // from class: u0.s0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                w0.k(abstractC2272l);
            }
        });
    }

    public static void g(Bundle bundle, NotificationModel notificationModel, String str, S5.r rVar, AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            Logger.e("NotifeeAlarmManager", "Failed to display notification", abstractC2272l.k());
            return;
        }
        if (!bundle.containsKey("repeatFrequency") || S5.m.a(bundle.get("repeatFrequency")) == -1) {
            v0.i.i(S5.e.f2956a).m(str);
            return;
        }
        C2177d c2177d = new C2177d(bundle);
        c2177d.a();
        h(notificationModel, c2177d);
        v0.i.i(S5.e.f2956a).y(new S5.r(str, rVar.f2974b, S5.m.c(bundle), Boolean.TRUE));
    }

    public static void h(NotificationModel notificationModel, C2177d c2177d) {
        PendingIntent pendingIntentB = b(notificationModel.c());
        AlarmManager alarmManagerA = S5.a.a();
        C2177d.a aVar = c2177d.f22592e;
        if (Build.VERSION.SDK_INT >= 31 && Arrays.asList(C2177d.a.SET_EXACT, C2177d.a.SET_EXACT_AND_ALLOW_WHILE_IDLE, C2177d.a.SET_ALARM_CLOCK).contains(aVar) && !alarmManagerA.canScheduleExactAlarms()) {
            System.err.println("Missing SCHEDULE_EXACT_ALARM permission. Trigger not scheduled. See: https://notifee.app/react-native/docs/triggers#android-12-limitations");
            return;
        }
        c2177d.a();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            alarmManagerA.set(1, c2177d.f22594g.longValue(), pendingIntentB);
            return;
        }
        if (iOrdinal == 1) {
            AbstractC0553e.b(alarmManagerA, 0, c2177d.f22594g.longValue(), pendingIntentB);
            return;
        }
        if (iOrdinal == 2) {
            AbstractC0553e.c(alarmManagerA, 0, c2177d.f22594g.longValue(), pendingIntentB);
            return;
        }
        if (iOrdinal == 3) {
            AbstractC0553e.d(alarmManagerA, 0, c2177d.f22594g.longValue(), pendingIntentB);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            Context context = S5.e.f2956a;
            AbstractC0553e.a(alarmManagerA, c2177d.f22594g.longValue(), PendingIntent.getActivity(context, notificationModel.c().hashCode(), context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 201326592), pendingIntentB);
        }
    }

    public static Object i(AbstractC2272l abstractC2272l) {
        return v0.i.i(S5.e.f2956a).j(Boolean.TRUE).i(new InterfaceC2263c() { // from class: u0.v0
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l2) {
                return w0.c(abstractC2272l2);
            }
        });
    }

    public static /* synthetic */ void k(AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            return;
        }
        Logger.e("NotifeeAlarmManager", "Failed to display notification", abstractC2272l.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(AbstractC2272l abstractC2272l) {
        byte[] bArr;
        for (S5.r rVar : (List) abstractC2272l.l()) {
            byte[] bArr2 = rVar.f2974b;
            if (bArr2 != null && (bArr = rVar.f2975c) != null) {
                Bundle bundleB = S5.m.b(bArr);
                NotificationModel notificationModel = new NotificationModel(S5.m.b(bArr2));
                if (S5.m.a(bundleB.get("type")) == 0) {
                    C2177d c2177d = new C2177d(bundleB);
                    if (c2177d.f22591d.booleanValue()) {
                        h(notificationModel, c2177d);
                    }
                }
            }
        }
    }

    public void j() {
        Logger.d("NotifeeAlarmManager", "Reschedule Notifications on reboot");
        new v0.i(S5.e.f2956a).j(Boolean.TRUE).c(new InterfaceC2266f() { // from class: u0.q0
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                this.f22468a.l(abstractC2272l);
            }
        });
    }
}
