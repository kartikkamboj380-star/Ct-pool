package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.util.Checks;

/* JADX INFO: loaded from: classes.dex */
abstract class InstrumentationActivityInvoker {

    public static class BootstrapActivity extends Activity {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f9183o = "androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final BroadcastReceiver f9184m = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BootstrapActivity.this.finishActivity(0);
                BootstrapActivity.this.finish();
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f9185n;

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onActivityResult(int i7, int i8, Intent intent) {
            if (i7 == 0) {
                Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i8);
                if (intent != null) {
                    intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(intent2);
                finish();
            }
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.b(this, this.f9184m, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
            this.f9185n = bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false);
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f9184m);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            if (this.f9185n) {
                return;
            }
            this.f9185n = true;
            PendingIntent pendingIntent = (PendingIntent) Checks.a((PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"));
            Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
            try {
                if (bundleExtra != null) {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
                } else {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                }
            } catch (IntentSender.SendIntentException e7) {
                Log.e(f9183o, "Failed to start target activity.", e7);
                throw new RuntimeException(e7);
            }
        }

        @Override // android.app.Activity
        protected void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f9185n);
        }
    }

    public static class EmptyActivity extends Activity {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final BroadcastReceiver f9187m = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.b(this, this.f9187m, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f9187m);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
        }
    }

    public static class EmptyFloatingActivity extends Activity {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final BroadcastReceiver f9189m = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyFloatingActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.b(this, this.f9189m, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f9189m);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }
}
