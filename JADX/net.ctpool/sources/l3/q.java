package l3;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
import k3.C1819b;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f21111a = new Logger("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f21111a.d("getFallbackSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentC;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f21111a.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentC = c(context, googleSignInOptions);
        intentC.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentC;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f21111a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static C1819b d(Intent intent) {
        if (intent == null) {
            return new C1819b(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C1819b(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new C1819b(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OptionalPendingResult e(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions, boolean z6) {
        GoogleSignInAccount googleSignInAccountA;
        C1819b c1819b;
        Logger logger = f21111a;
        logger.d("silentSignIn()", new Object[0]);
        logger.d("getEligibleSavedSignInResult()", new Object[0]);
        Preconditions.checkNotNull(googleSignInOptions);
        GoogleSignInOptions googleSignInOptionsB = r.c(context).b();
        if (googleSignInOptionsB == null) {
            c1819b = null;
        } else {
            Account account = googleSignInOptionsB.getAccount();
            Account account2 = googleSignInOptions.getAccount();
            if (account != null ? account.equals(account2) : account2 == null) {
                if (!googleSignInOptions.h1() && ((!googleSignInOptions.S0() || (googleSignInOptionsB.S0() && Objects.equal(googleSignInOptions.B0(), googleSignInOptionsB.B0()))) && new HashSet(googleSignInOptionsB.n0()).containsAll(new HashSet(googleSignInOptions.n0())) && (googleSignInAccountA = r.c(context).a()) != null && !googleSignInAccountA.l1())) {
                    c1819b = new C1819b(googleSignInAccountA, Status.RESULT_SUCCESS);
                }
            }
        }
        if (c1819b != null) {
            logger.d("Eligible saved sign in result found", new Object[0]);
            return PendingResults.immediatePendingResult(c1819b, googleApiClient);
        }
        if (z6) {
            return PendingResults.immediatePendingResult(new C1819b(null, new Status(4)), googleApiClient);
        }
        logger.d("trySilentSignIn()", new Object[0]);
        return new OptionalPendingResultImpl(googleApiClient.enqueue(new k(googleApiClient, context, googleSignInOptions)));
    }

    public static PendingResult f(GoogleApiClient googleApiClient, Context context, boolean z6) {
        f21111a.d("Revoking access", new Object[0]);
        String strE = c.b(context).e();
        h(context);
        return z6 ? f.a(strE) : googleApiClient.execute(new o(googleApiClient));
    }

    public static PendingResult g(GoogleApiClient googleApiClient, Context context, boolean z6) {
        f21111a.d("Signing out", new Object[0]);
        h(context);
        return z6 ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new m(googleApiClient));
    }

    private static void h(Context context) {
        r.c(context).d();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
