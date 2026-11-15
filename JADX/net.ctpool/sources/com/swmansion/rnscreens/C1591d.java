package com.swmansion.rnscreens;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: com.swmansion.rnscreens.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1591d extends Toolbar {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final x f18387j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591d(Context context, x xVar) {
        super(context);
        w5.k.f(context, "context");
        w5.k.f(xVar, "config");
        this.f18387j0 = xVar;
    }

    public final x getConfig() {
        return this.f18387j0;
    }
}
