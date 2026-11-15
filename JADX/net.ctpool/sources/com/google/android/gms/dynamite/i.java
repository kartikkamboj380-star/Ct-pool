package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DynamiteModule.b.C0224b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0224b c0224b = new DynamiteModule.b.C0224b();
        c0224b.f13772a = aVar.b(context, str);
        int i7 = 1;
        int iA = aVar.a(context, str, true);
        c0224b.f13773b = iA;
        int i8 = c0224b.f13772a;
        if (i8 == 0) {
            i8 = 0;
            if (iA == 0) {
                i7 = 0;
            } else if (iA < i8) {
                i7 = -1;
            }
        }
        c0224b.f13774c = i7;
        return c0224b;
    }
}
