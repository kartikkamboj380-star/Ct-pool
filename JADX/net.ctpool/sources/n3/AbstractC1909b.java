package n3;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2266f;

/* JADX INFO: renamed from: n3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1909b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SoftReference f21369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SoftReference f21370b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (AbstractC1909b.class) {
            try {
                SoftReference softReference = f21369a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    s3.e.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                    f21369a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    protected abstract int b(Context context, C1908a c1908a);

    protected abstract void c(Context context, Bundle bundle);

    final /* synthetic */ void d(Intent intent, final Context context, boolean z6, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iE;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iE = e(context, intent2);
            } else if (intent.getExtras() == null) {
                iE = 500;
            } else {
                final C1908a c1908a = new C1908a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC1909b.class) {
                    try {
                        SoftReference softReference = f21370b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            s3.e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f21370b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } finally {
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: n3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2272l abstractC2272lC;
                        C1908a c1908a2 = c1908a;
                        if (TextUtils.isEmpty(c1908a2.a0())) {
                            abstractC2272lC = AbstractC2275o.f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c1908a2.a0());
                            Integer numN0 = c1908a2.n0();
                            if (numN0 != null) {
                                bundle.putInt("google.product_id", numN0.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            abstractC2272lC = C1903D.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        abstractC2272lC.b(new Executor() { // from class: n3.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC2266f() { // from class: n3.n
                            @Override // z3.InterfaceC2266f
                            public final void a(AbstractC2272l abstractC2272l) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iB = b(context, c1908a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e7) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e7.toString()));
                }
                iE = iB;
            }
            if (z6 && pendingResult != null) {
                pendingResult.setResultCode(iE);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: n3.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f21395m.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
