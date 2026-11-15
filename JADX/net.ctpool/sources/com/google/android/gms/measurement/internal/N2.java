package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.N7;
import com.google.android.gms.internal.measurement.Q7;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class N2 implements Q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ I2 f15709a;

    N2(I2 i22) {
        this.f15709a = i22;
    }

    @Override // com.google.android.gms.internal.measurement.Q7
    public final void a(N7 n7, String str, List list, boolean z6, boolean z7) {
        C1463p2 c1463p2D;
        int i7 = O2.f15714a[n7.ordinal()];
        if (i7 == 1) {
            c1463p2D = this.f15709a.d().D();
        } else if (i7 == 2) {
            C1449n2 c1449n2D = this.f15709a.d();
            c1463p2D = z6 ? c1449n2D.G() : !z7 ? c1449n2D.F() : c1449n2D.E();
        } else if (i7 != 3) {
            c1463p2D = i7 != 4 ? this.f15709a.d().H() : this.f15709a.d().I();
        } else {
            C1449n2 c1449n2D2 = this.f15709a.d();
            c1463p2D = z6 ? c1449n2D2.L() : !z7 ? c1449n2D2.K() : c1449n2D2.J();
        }
        int size = list.size();
        if (size == 1) {
            c1463p2D.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c1463p2D.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c1463p2D.a(str);
        } else {
            c1463p2D.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
