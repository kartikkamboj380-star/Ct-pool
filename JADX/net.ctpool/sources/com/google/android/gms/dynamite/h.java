package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0224b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0224b c0224b = new DynamiteModule.b.C0224b();
        int iB = aVar.b(context, str);
        c0224b.f13772a = iB;
        int i7 = 1;
        int i8 = 0;
        int iA = iB != 0 ? aVar.a(context, str, false) : aVar.a(context, str, true);
        c0224b.f13773b = iA;
        int i9 = c0224b.f13772a;
        if (i9 == 0) {
            if (iA == 0) {
                i7 = 0;
            }
            c0224b.f13774c = i7;
            return c0224b;
        }
        i8 = i9;
        if (i8 >= iA) {
            i7 = -1;
        }
        c0224b.f13774c = i7;
        return c0224b;
    }
}
