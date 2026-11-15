package k3;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1819b implements Result {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Status f20549m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GoogleSignInAccount f20550n;

    public C1819b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f20550n = googleSignInAccount;
        this.f20549m = status;
    }

    public GoogleSignInAccount a() {
        return this.f20550n;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.f20549m;
    }
}
