package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0224b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0224b c0224b = new DynamiteModule.b.C0224b();
        int iA = aVar.a(context, str, false);
        c0224b.f13773b = iA;
        c0224b.f13774c = iA != 0 ? 1 : 0;
        return c0224b;
    }
}
