package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Class f18161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Class f18162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class f18163h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f18165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f18166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f18167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f18168e;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements InvocationHandler {

        /* JADX INFO: renamed from: com.learnium.RNDeviceInfo.g$a$a, reason: collision with other inner class name */
        class RunnableC0241a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f18170m;

            RunnableC0241a(int i7) {
                this.f18170m = i7;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f18170m);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) g.f18163h.getMethod("getInstallReferrer", null).invoke(g.f18161f.getMethod("getInstallReferrer", null).invoke(g.this.f18165b, null), null);
                SharedPreferences.Editor editorEdit = g.this.f18164a.edit();
                editorEdit.putString("installReferrer", str);
                editorEdit.apply();
                g.f18161f.getMethod("endConnection", null).invoke(g.this.f18165b, null);
            } catch (Exception e7) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e7.getMessage());
                e7.printStackTrace(printStream);
            }
        }

        public void c() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void d(int i7) {
            String str;
            if (i7 == 0) {
                g.this.f18167d.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18160m.b();
                    }
                });
                return;
            }
            if (i7 == 1) {
                str = "SERVICE_UNAVAILABLE";
            } else if (i7 != 2) {
                return;
            } else {
                str = "FEATURE_NOT_SUPPORTED";
            }
            Log.d("InstallReferrerState", str);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        g.this.f18168e.post(new RunnableC0241a(((Integer) obj2).intValue()));
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                g.this.f18168e.post(new b());
                return null;
            } catch (Exception e7) {
                throw new RuntimeException("unexpected invocation exception: " + e7.getMessage());
            }
        }
    }

    static {
        try {
            f18161f = InstallReferrerClient.class;
            f18162g = InstallReferrerStateListener.class;
            f18163h = ReferrerDetails.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    g(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f18167d = executorServiceNewSingleThreadExecutor;
        this.f18168e = new Handler(Looper.getMainLooper());
        this.f18164a = context.getSharedPreferences("react-native-device-info", 0);
        if (f18161f == null || f18162g == null || f18163h == null) {
            return;
        }
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f18158m.h(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        try {
            Object objInvoke = f18161f.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f18165b = objInvoke.getClass().getMethod("build", null).invoke(objInvoke, null);
            this.f18166c = Proxy.newProxyInstance(f18162g.getClassLoader(), new Class[]{f18162g}, new a());
            f18161f.getMethod("startConnection", f18162g).invoke(this.f18165b, this.f18166c);
        } catch (Exception e7) {
            PrintStream printStream = System.err;
            printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e7.getMessage());
            e7.printStackTrace(printStream);
        }
    }
}
