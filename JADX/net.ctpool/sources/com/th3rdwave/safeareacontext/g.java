package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar, a aVar, c cVar) {
        Context context = fVar.getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id = fVar.getId();
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, id);
        if (eVarC != null) {
            eVarC.c(new b(r.b(reactContext), id, aVar, cVar));
        }
    }
}
