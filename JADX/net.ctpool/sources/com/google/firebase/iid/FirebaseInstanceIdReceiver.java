package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C1549n;
import com.google.firebase.messaging.K;
import java.util.concurrent.ExecutionException;
import n3.AbstractC1909b;
import n3.C1908a;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1909b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // n3.AbstractC1909b
    protected int b(Context context, C1908a c1908a) {
        try {
            return ((Integer) AbstractC2275o.a(new C1549n(context).k(c1908a.w()))).intValue();
        } catch (InterruptedException | ExecutionException e7) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
            return 500;
        }
    }

    @Override // n3.AbstractC1909b
    protected void c(Context context, Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (K.E(intentF)) {
            K.v(intentF);
        }
    }
}
