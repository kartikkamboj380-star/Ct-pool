package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC0640j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends AbstractActivityC0640j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static boolean f13537O = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f13538J = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private SignInConfiguration f13539K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f13540L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f13541M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Intent f13542N;

    private final void b0() {
        P().c(0, null, new a(this, null));
        f13537O = false;
    }

    private final void c0(int i7) {
        Status status = new Status(i7);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f13537O = false;
    }

    private final void d0(String str) {
        Intent intent = new Intent(str);
        intent.setPackage(str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent.putExtra("config", this.f13539K);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f13538J = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            c0(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f13538J) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.w() != null) {
                GoogleSignInAccount googleSignInAccountW = signInAccount.w();
                if (googleSignInAccountW == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    c0(12500);
                    return;
                }
                r.c(this).e(this.f13539K.w(), googleSignInAccountW);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccountW);
                this.f13540L = true;
                this.f13541M = i8;
                this.f13542N = intent;
                b0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                c0(intExtra);
                return;
            }
        }
        c0(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            c0(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            c0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f13539K = signInConfiguration;
        if (bundle == null) {
            if (f13537O) {
                setResult(0);
                c0(12502);
                return;
            } else {
                f13537O = true;
                d0(action);
                return;
            }
        }
        boolean z6 = bundle.getBoolean("signingInGoogleApiClients");
        this.f13540L = z6;
        if (z6) {
            this.f13541M = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f13542N = intent2;
                b0();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f13537O = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f13540L);
        if (this.f13540L) {
            bundle.putInt("signInResultCode", this.f13541M);
            bundle.putParcelable("signInResultData", this.f13542N);
        }
    }
}
