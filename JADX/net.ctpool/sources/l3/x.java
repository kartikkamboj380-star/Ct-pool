package l3;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21116a;

    public x(Context context) {
        this.f21116a = context;
    }

    private final void j0() {
        if (UidVerifier.isGooglePlayServicesUid(this.f21116a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // l3.t
    public final void g() {
        j0();
        r.c(this.f21116a).d();
    }

    @Override // l3.t
    public final void t() {
        j0();
        c cVarB = c.b(this.f21116a);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f13507x;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f21116a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.d();
        } else {
            bVarA.e();
        }
    }
}
