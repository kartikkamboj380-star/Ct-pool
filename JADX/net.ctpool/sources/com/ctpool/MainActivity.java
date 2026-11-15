package com.ctpool;

import F0.b;
import W1.a;
import android.os.Bundle;
import com.facebook.react.AbstractC0862u;
import com.facebook.react.ReactActivity;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends ReactActivity {
    @Override // com.facebook.react.ReactActivity
    protected AbstractC0862u m0() {
        return new a(this, n0(), com.facebook.react.defaults.a.a());
    }

    protected String n0() {
        return "ctpool";
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.zoontek.rnbootsplash.a.a(this, b.f1069a);
        super.onCreate(null);
    }
}
