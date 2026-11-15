package n3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f21410c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1903D f21413f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21408a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f21409b = new Messenger(new s3.f(Looper.getMainLooper(), new Handler.Callback() { // from class: n3.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i7 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i7);
            }
            x xVar = this.f21405a;
            synchronized (xVar) {
                try {
                    AbstractC1900A abstractC1900A = (AbstractC1900A) xVar.f21412e.get(i7);
                    if (abstractC1900A == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                        return true;
                    }
                    xVar.f21412e.remove(i7);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC1900A.c(new C1901B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC1900A.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f21411d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f21412e = new SparseArray();

    /* synthetic */ x(C1903D c1903d, w wVar) {
        this.f21413f = c1903d;
    }

    final synchronized void a(int i7, String str) {
        b(i7, str, null);
    }

    final synchronized void b(int i7, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i8 = this.f21408a;
            if (i8 == 0) {
                throw new IllegalStateException();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f21408a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f21408a = 4;
            ConnectionTracker.getInstance().unbindService(this.f21413f.f21357a, this);
            C1901B c1901b = new C1901B(i7, str, th);
            Iterator it = this.f21411d.iterator();
            while (it.hasNext()) {
                ((AbstractC1900A) it.next()).c(c1901b);
            }
            this.f21411d.clear();
            for (int i9 = 0; i9 < this.f21412e.size(); i9++) {
                ((AbstractC1900A) this.f21412e.valueAt(i9)).c(c1901b);
            }
            this.f21412e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        this.f21413f.f21358b.execute(new Runnable() { // from class: n3.r
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC1900A abstractC1900A;
                while (true) {
                    final x xVar = this.f21402m;
                    synchronized (xVar) {
                        try {
                            if (xVar.f21408a != 2) {
                                return;
                            }
                            if (xVar.f21411d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                abstractC1900A = (AbstractC1900A) xVar.f21411d.poll();
                                xVar.f21412e.put(abstractC1900A.f21352a, abstractC1900A);
                                xVar.f21413f.f21358b.schedule(new Runnable() { // from class: n3.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(abstractC1900A.f21352a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC1900A)));
                    }
                    C1903D c1903d = xVar.f21413f;
                    Messenger messenger = xVar.f21409b;
                    int i7 = abstractC1900A.f21354c;
                    Context context = c1903d.f21357a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i7;
                    messageObtain.arg1 = abstractC1900A.f21352a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC1900A.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC1900A.f21355d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f21410c.a(messageObtain);
                    } catch (RemoteException e7) {
                        xVar.a(2, e7.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f21408a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i7) {
        AbstractC1900A abstractC1900A = (AbstractC1900A) this.f21412e.get(i7);
        if (abstractC1900A != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i7);
            this.f21412e.remove(i7);
            abstractC1900A.c(new C1901B(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f21408a == 2 && this.f21411d.isEmpty() && this.f21412e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f21408a = 3;
                ConnectionTracker.getInstance().unbindService(this.f21413f.f21357a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(AbstractC1900A abstractC1900A) {
        int i7 = this.f21408a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f21411d.add(abstractC1900A);
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            this.f21411d.add(abstractC1900A);
            c();
            return true;
        }
        this.f21411d.add(abstractC1900A);
        Preconditions.checkState(this.f21408a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f21408a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(this.f21413f.f21357a, intent, this, 1)) {
                this.f21413f.f21358b.schedule(new Runnable() { // from class: n3.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21403m.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e7) {
            b(0, "Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f21413f.f21358b.execute(new Runnable() { // from class: n3.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f21400m;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f21410c = new y(iBinder2);
                        xVar.f21408a = 2;
                        xVar.c();
                    } catch (RemoteException e7) {
                        xVar.a(0, e7.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f21413f.f21358b.execute(new Runnable() { // from class: n3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f21404m.a(2, "Service disconnected");
            }
        });
    }
}
