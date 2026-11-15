package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.activity.result.c f10185E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.activity.result.c f10186F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ResultReceiver f10187G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ResultReceiver f10188H;

    final void J(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.A.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f10187G;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    final void K(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.A.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.f10188H;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.A.i("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10185E = H(new d.d(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.H
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f10160a.J((androidx.activity.result.a) obj);
            }
        });
        this.f10186F = H(new d.d(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.I
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f10161a.K((androidx.activity.result.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f10187G = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f10188H = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.A.h("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f10187G = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f10185E.a(new e.b(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f10188H = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f10186F.a(new e.b(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f10187G;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f10188H;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
