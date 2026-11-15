package N4;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class G implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f2312b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y3.f f2313a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public G(Y3.f fVar) {
        w5.k.f(fVar, "firebaseApp");
        this.f2313a = fVar;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return i5.u.f19985a;
        } catch (IllegalArgumentException e7) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e7));
        }
    }

    @Override // N4.F
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean zBindService;
        w5.k.f(messenger, "callback");
        w5.k.f(serviceConnection, "serviceConnection");
        Context applicationContext = this.f2313a.m().getApplicationContext();
        w5.k.e(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e7) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e7);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        b(applicationContext, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
