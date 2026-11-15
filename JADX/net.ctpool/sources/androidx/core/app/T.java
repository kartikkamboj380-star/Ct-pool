package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.InterfaceC0672a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f6890d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static c f6893g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f6895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6889c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f6891e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f6892f = new Object();

    private static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f6896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f6897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f6898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f6899d;

        a(String str, int i7, String str2, Notification notification) {
            this.f6896a = str;
            this.f6897b = i7;
            this.f6898c = str2;
            this.f6899d = notification;
        }

        @Override // androidx.core.app.T.d
        public void a(InterfaceC0672a interfaceC0672a) {
            interfaceC0672a.b0(this.f6896a, this.f6897b, this.f6898c, this.f6899d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f6896a + ", id:" + this.f6897b + ", tag:" + this.f6898c + "]";
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f6900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f6901b;

        b(ComponentName componentName, IBinder iBinder) {
            this.f6900a = componentName;
            this.f6901b = iBinder;
        }
    }

    private static class c implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f6903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f6904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f6905d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f6906e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f6907a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            InterfaceC0672a f6909c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f6908b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f6910d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f6911e = 0;

            a(ComponentName componentName) {
                this.f6907a = componentName;
            }
        }

        c(Context context) {
            this.f6902a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f6903b = handlerThread;
            handlerThread.start();
            this.f6904c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f6908b) {
                return true;
            }
            boolean zBindService = this.f6902a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f6907a), this, 33);
            aVar.f6908b = zBindService;
            if (zBindService) {
                aVar.f6911e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f6907a);
                this.f6902a.unbindService(this);
            }
            return aVar.f6908b;
        }

        private void b(a aVar) {
            if (aVar.f6908b) {
                this.f6902a.unbindService(this);
                aVar.f6908b = false;
            }
            aVar.f6909c = null;
        }

        private void c(d dVar) {
            j();
            for (a aVar : this.f6905d.values()) {
                aVar.f6910d.add(dVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f6905d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f6905d.get(componentName);
            if (aVar != null) {
                aVar.f6909c = InterfaceC0672a.AbstractBinderC0185a.i0(iBinder);
                aVar.f6911e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f6905d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f6907a + ", " + aVar.f6910d.size() + " queued tasks");
            }
            if (aVar.f6910d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f6909c == null) {
                i(aVar);
                return;
            }
            while (true) {
                d dVar = (d) aVar.f6910d.peek();
                if (dVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + dVar);
                    }
                    dVar.a(aVar.f6909c);
                    aVar.f6910d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f6907a);
                    }
                } catch (RemoteException e7) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f6907a, e7);
                }
            }
            if (aVar.f6910d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f6904c.hasMessages(3, aVar.f6907a)) {
                return;
            }
            int i7 = aVar.f6911e;
            int i8 = i7 + 1;
            aVar.f6911e = i8;
            if (i8 <= 6) {
                int i9 = (1 << i7) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
                }
                this.f6904c.sendMessageDelayed(this.f6904c.obtainMessage(3, aVar.f6907a), i9);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f6910d.size() + " tasks to " + aVar.f6907a + " after " + aVar.f6911e + " retries");
            aVar.f6910d.clear();
        }

        private void j() {
            Set setJ = T.j(this.f6902a);
            if (setJ.equals(this.f6906e)) {
                return;
            }
            this.f6906e = setJ;
            List<ResolveInfo> listQueryIntentServices = this.f6902a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setJ.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f6905d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f6905d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f6905d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(d dVar) {
            this.f6904c.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                c((d) message.obj);
                return true;
            }
            if (i7 == 1) {
                b bVar = (b) message.obj;
                e(bVar.f6900a, bVar.f6901b);
                return true;
            }
            if (i7 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i7 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f6904c.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f6904c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface d {
        void a(InterfaceC0672a interfaceC0672a);
    }

    private T(Context context) {
        this.f6894a = context;
        this.f6895b = (NotificationManager) context.getSystemService("notification");
    }

    public static T i(Context context) {
        return new T(context);
    }

    public static Set j(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f6889c) {
            if (string != null) {
                try {
                    if (!string.equals(f6890d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f6891e = hashSet;
                        f6890d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f6891e;
        }
        return set;
    }

    private void q(d dVar) {
        synchronized (f6892f) {
            try {
                if (f6893g == null) {
                    f6893g = new c(this.f6894a.getApplicationContext());
                }
                f6893g.h(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean r(Notification notification) {
        Bundle bundleA = AbstractC0559k.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return this.f6895b.areNotificationsEnabled();
    }

    public void b(int i7) {
        c(null, i7);
    }

    public void c(String str, int i7) {
        this.f6895b.cancel(str, i7);
    }

    public void d() {
        this.f6895b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6895b.createNotificationChannel(notificationChannel);
        }
    }

    public void f(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6895b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void g(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6895b.deleteNotificationChannel(str);
        }
    }

    public void h(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6895b.deleteNotificationChannelGroup(str);
        }
    }

    public NotificationChannel k(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f6895b.getNotificationChannel(str);
        }
        return null;
    }

    public NotificationChannelGroup l(String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return this.f6895b.getNotificationChannelGroup(str);
        }
        if (i7 >= 26) {
            Iterator it = m().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup notificationChannelGroupA = L.a(it.next());
                if (notificationChannelGroupA.getId().equals(str)) {
                    return notificationChannelGroupA;
                }
            }
        }
        return null;
    }

    public List m() {
        return Build.VERSION.SDK_INT >= 26 ? this.f6895b.getNotificationChannelGroups() : Collections.emptyList();
    }

    public List n() {
        return Build.VERSION.SDK_INT >= 26 ? this.f6895b.getNotificationChannels() : Collections.emptyList();
    }

    public void o(int i7, Notification notification) {
        p(null, i7, notification);
    }

    public void p(String str, int i7, Notification notification) {
        if (!r(notification)) {
            this.f6895b.notify(str, i7, notification);
        } else {
            q(new a(this.f6894a.getPackageName(), i7, str, notification));
            this.f6895b.cancel(str, i7);
        }
    }
}
