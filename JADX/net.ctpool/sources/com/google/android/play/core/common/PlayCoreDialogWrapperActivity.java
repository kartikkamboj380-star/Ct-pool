package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ResultReceiver f17332m;

    private final void a() {
        ResultReceiver resultReceiver = this.f17332m;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i9;
        super.onActivityResult(i7, i8, intent);
        if (i7 == 0 && (resultReceiver = this.f17332m) != null) {
            if (i8 == -1) {
                bundle = new Bundle();
                i9 = 1;
            } else if (i8 == 0) {
                bundle = new Bundle();
                i9 = 2;
            }
            resultReceiver.send(i9, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f17332m = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f17332m = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            a();
            finish();
        } else {
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f17332m);
    }
}
