package com.google.firebase.sessions;

import P4.f;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f17724p = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HandlerThread f17725m = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f17726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Messenger f17727o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f17729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f17730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            k.f(looper, "looper");
            this.f17730c = new ArrayList();
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            c.b bVar = c.f17735f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            com.google.firebase.sessions.b.f17733a.a().a(bVar.a().c());
            for (Messenger messenger : new ArrayList(this.f17730c)) {
                k.e(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f17729b = message.getWhen();
        }

        private final void c(Message message) {
            this.f17730c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            k.e(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f17730c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (this.f17728a) {
                if (e(message.getWhen())) {
                    Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                }
                this.f17729b = message.getWhen();
            }
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.f17728a = true;
            g();
            this.f17729b = message.getWhen();
        }

        private final boolean e(long j7) {
            return j7 - this.f17729b > G5.a.r(f.f2672c.c().c());
        }

        private final void f(Messenger messenger) {
            String strA;
            if (this.f17728a) {
                strA = c.f17735f.a().c().b();
            } else {
                strA = com.google.firebase.sessions.a.f17731a.a().a();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + strA);
                if (strA == null) {
                    return;
                }
            }
            h(messenger, strA);
        }

        private final void g() {
            c.b bVar = c.f17735f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            com.google.firebase.sessions.a.f17731a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f17730c.remove(messenger);
            } catch (Exception e7) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e7);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            k.f(message, "msg");
            if (this.f17729b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f17729b + '.');
                return;
            }
            int i7 = message.what;
            if (i7 == 1) {
                d(message);
                return;
            }
            if (i7 == 2) {
                b(message);
                return;
            }
            if (i7 == 4) {
                c(message);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
        }
    }

    private final Messenger a(Intent intent) {
        return (Messenger) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerA = a(intent);
        if (messengerA != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerA;
            b bVar = this.f17726n;
            if (bVar != null) {
                bVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.f17727o;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f17725m.start();
        Looper looper = this.f17725m.getLooper();
        k.e(looper, "handlerThread.looper");
        this.f17726n = new b(looper);
        this.f17727o = new Messenger(this.f17726n);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f17725m.quit();
    }
}
