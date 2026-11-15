package P3;

import android.os.Bundle;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
abstract class s extends Q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Q3.p f2618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C2273m f2619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f2620c;

    s(u uVar, Q3.p pVar, C2273m c2273m) {
        this.f2620c = uVar;
        this.f2618a = pVar;
        this.f2619b = c2273m;
    }

    @Override // Q3.m
    public void I(Bundle bundle) {
        this.f2620c.f2625a.u(this.f2619b);
        this.f2618a.c("onRequestInfo", new Object[0]);
    }

    @Override // Q3.m
    public void O(Bundle bundle) {
        this.f2620c.f2625a.u(this.f2619b);
        this.f2618a.c("onCompleteUpdate", new Object[0]);
    }
}
