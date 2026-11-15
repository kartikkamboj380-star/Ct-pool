package l3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f21112d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f21115c;

    private r(Context context) {
        c cVarB = c.b(context);
        this.f21113a = cVarB;
        this.f21114b = cVarB.c();
        this.f21115c = cVarB.d();
    }

    public static synchronized r c(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized r f(Context context) {
        r rVar = f21112d;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context);
        f21112d = rVar2;
        return rVar2;
    }

    public final synchronized GoogleSignInAccount a() {
        return this.f21114b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.f21115c;
    }

    public final synchronized void d() {
        this.f21113a.a();
        this.f21114b = null;
        this.f21115c = null;
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f21113a.f(googleSignInAccount, googleSignInOptions);
        this.f21114b = googleSignInAccount;
        this.f21115c = googleSignInOptions;
    }
}
