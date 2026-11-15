package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1006t1 extends AbstractC0998q1 {
    C1006t1() {
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0998q1
    final /* synthetic */ Object a(Object obj) {
        return ((C0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0998q1
    final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        if (C1003s1.a().equals(obj2)) {
            return obj;
        }
        C1003s1 c1003s1 = (C1003s1) obj2;
        if (C1003s1.a().equals(obj)) {
            return C1003s1.c((C1003s1) obj, c1003s1);
        }
        ((C1003s1) obj).b(c1003s1);
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0998q1
    final void c(Object obj) {
        ((C0) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0998q1
    final /* synthetic */ void d(Object obj, Object obj2) {
        ((C0) obj).zzc = (C1003s1) obj2;
    }
}
