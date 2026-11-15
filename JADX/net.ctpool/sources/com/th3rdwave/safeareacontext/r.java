package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        w5.k.f(view, "view");
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    public static final int b(Context context) {
        w5.k.f(context, "context");
        return -1;
    }
}
