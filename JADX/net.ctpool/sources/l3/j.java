package l3;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import k3.C1819b;

/* JADX INFO: loaded from: classes.dex */
final class j extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f21106a;

    j(k kVar) {
        this.f21106a = kVar;
    }

    @Override // l3.e, l3.v
    public final void H(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            k kVar = this.f21106a;
            r.c(kVar.f21107a).e(kVar.f21108b, googleSignInAccount);
        }
        this.f21106a.setResult(new C1819b(googleSignInAccount, status));
    }
}
