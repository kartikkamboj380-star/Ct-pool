package z0;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f23242a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f23243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q f23244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Promise f23245d;

    public static void a(String str) {
        Promise promise = f23245d;
        if (promise != null) {
            promise.reject(str);
        }
        f23245d = null;
    }

    public static void b(Object obj) {
        Promise promise = f23245d;
        if (promise != null) {
            promise.resolve(obj);
        }
        f23245d = null;
    }

    public static IntentSender c(ReactContext reactContext) {
        synchronized (f23242a) {
            try {
                if (f23243b == null) {
                    f23243b = reactContext.getPackageName() + "/" + q.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                q qVar = f23244c;
                if (qVar != null) {
                    applicationContext.unregisterReceiver(qVar);
                }
                f23244c = new q();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f23244c, new IntentFilter(f23243b));
                } else {
                    applicationContext.registerReceiver(f23244c, new IntentFilter(f23243b), 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Intent intent = new Intent(f23243b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), q.class);
        intent.putExtra("receiver_token", f23244c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    public static boolean d() {
        return true;
    }

    public static void e(Promise promise) {
        f23245d = promise;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f23242a) {
            try {
                if (f23244c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(f23244c);
                f23244c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("success", true);
                    if (componentName != null) {
                        writableMapCreateMap.putString("message", componentName.flattenToString());
                    } else {
                        writableMapCreateMap.putString("message", "OK");
                    }
                    b(writableMapCreateMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
