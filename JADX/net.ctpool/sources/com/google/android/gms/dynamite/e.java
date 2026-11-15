package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0224b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0224b c0224b = new DynamiteModule.b.C0224b();
        int iB = aVar.b(context, str);
        c0224b.f13772a = iB;
        if (iB != 0) {
            c0224b.f13774c = -1;
        } else {
            int iA = aVar.a(context, str, true);
            c0224b.f13773b = iA;
            if (iA != 0) {
                c0224b.f13774c = 1;
            }
        }
        return c0224b;
    }
}
