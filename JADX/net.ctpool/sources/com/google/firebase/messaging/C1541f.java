package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.AbstractC0559k;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.AbstractC1539d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z3.AbstractC2275o;

/* JADX INFO: renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1541f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f17634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f17635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M f17636c;

    public C1541f(Context context, M m7, ExecutorService executorService) {
        this.f17634a = executorService;
        this.f17635b = context;
        this.f17636c = m7;
    }

    private boolean b() {
        if (((KeyguardManager) this.f17635b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f17635b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    private void c(AbstractC1539d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f17635b.getSystemService("notification")).notify(aVar.f17621b, aVar.f17622c, aVar.f17620a.d());
    }

    private I d() {
        I iE = I.e(this.f17636c.p("gcm.n.image"));
        if (iE != null) {
            iE.j(this.f17634a);
        }
        return iE;
    }

    private void e(AbstractC0559k.e eVar, I i7) {
        if (i7 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC2275o.b(i7.f(), 5L, TimeUnit.SECONDS);
            eVar.z(bitmap);
            eVar.O(new AbstractC0559k.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            i7.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e7) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e7.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            i7.close();
        }
    }

    boolean a() {
        if (this.f17636c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        I iD = d();
        AbstractC1539d.a aVarE = AbstractC1539d.e(this.f17635b, this.f17636c);
        e(aVarE.f17620a, iD);
        c(aVarE);
        return true;
    }
}
