package P3;

import android.os.Bundle;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class t extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f2621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f2622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, C2273m c2273m, String str) {
        super(uVar, new Q3.p("OnRequestInstallCallback"), c2273m);
        this.f2622e = uVar;
        this.f2621d = str;
    }

    @Override // P3.s, Q3.m
    public final void I(Bundle bundle) {
        super.I(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f2619b.d(new S3.a(bundle.getInt("error.code", -2)));
        } else {
            this.f2619b.e(u.d(this.f2622e, bundle, this.f2621d));
        }
    }
}
