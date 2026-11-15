package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C0751e;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ResultReceiver f10181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ResultReceiver f10182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10184p;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onActivityResult(int i7, int i8, Intent intent) {
        ResultReceiver resultReceiver;
        Intent intentB;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 100 || i7 == 110) {
            int iB = com.google.android.gms.internal.play_billing.A.d(intent, "ProxyBillingActivity").b();
            if (i8 != -1) {
                com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivity", "Activity finished with resultCode " + i8 + " and billing's responseCode: " + iB);
                resultReceiver = this.f10181m;
                if (resultReceiver != null) {
                    resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
                } else {
                    if (intent != null) {
                        if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                intentB = a(string);
                            } else {
                                intentB = b();
                                intentB.putExtras(intent.getExtras());
                            }
                        } else {
                            intentB = b();
                            com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivity", "Got null bundle!");
                            intentB.putExtra("RESPONSE_CODE", 6);
                            intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            C0751e.a aVarC = C0751e.c();
                            aVarC.c(6);
                            aVarC.b("An internal error occurred.");
                            intentB.putExtra("FAILURE_LOGGING_PAYLOAD", w.a(22, 2, aVarC.a()).f());
                        }
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentB = b();
                    }
                    if (i7 == 110) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentB);
                }
            } else if (iB != 0) {
                i8 = -1;
                com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivity", "Activity finished with resultCode " + i8 + " and billing's responseCode: " + iB);
                resultReceiver = this.f10181m;
                if (resultReceiver != null) {
                }
            } else {
                iB = 0;
                resultReceiver = this.f10181m;
                if (resultReceiver != null) {
                }
            }
        } else if (i7 == 101) {
            int iA = com.google.android.gms.internal.play_billing.A.a(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.f10182n;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iA, intent != null ? intent.getExtras() : null);
            }
        } else {
            com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i7 + "; skipping...");
        }
        this.f10183o = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i7;
        PendingIntent pendingIntent;
        int i8;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.A.h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f10183o = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f10181m = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f10182n = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f10184p = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        com.google.android.gms.internal.play_billing.A.h("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f10184p = true;
                i8 = 110;
                i7 = i8;
            }
            i7 = 100;
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f10181m = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            i7 = 100;
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f10182n = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i8 = 101;
            i7 = i8;
        } else {
            i7 = 100;
            pendingIntent = null;
        }
        try {
            this.f10183o = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i7, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e7) {
            com.google.android.gms.internal.play_billing.A.j("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e7);
            ResultReceiver resultReceiver = this.f10181m;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f10182n;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f10184p) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f10183o = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f10183o) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f10181m;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f10182n;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f10183o);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f10184p);
    }
}
