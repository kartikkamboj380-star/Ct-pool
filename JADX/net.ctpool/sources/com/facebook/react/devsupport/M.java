package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class M extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Activity activity, View view) {
        super(activity, com.facebook.react.r.f12041a);
        w5.k.f(activity, "context");
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }
}
