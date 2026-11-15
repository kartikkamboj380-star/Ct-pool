package h3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.AbstractBinderC0979k0;
import com.google.android.gms.internal.auth.AbstractC1000r1;
import com.google.android.gms.internal.auth.C0966g;
import com.google.android.gms.internal.auth.EnumC0972i;
import com.google.android.gms.internal.auth.InterfaceC0956c1;
import com.google.android.gms.internal.auth.J1;
import com.google.android.gms.internal.auth.M;
import com.google.android.gms.internal.auth.M1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19629a = {AccountType.GOOGLE, "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19630b = "androidPackageName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComponentName f19631c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f19632d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws IOException, C1709a {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).zza();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j7, Executor executor) throws IOException, C1709a {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        M.d(context);
        if (M1.d() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(AbstractC1000r1.a(context).a(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (ApiException e7) {
                m(e7, "token retrieval");
            }
        }
        return (TokenData) i(context, f19631c, new h() { // from class: h3.f
            @Override // h3.h
            public final Object a(IBinder iBinder) {
                return i.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws IOException {
        Bundle bundleJ = AbstractBinderC0979k0.j0(iBinder).j(account, str, bundle);
        if (bundleJ != null) {
            return h(context, "getTokenWithDetails", bundleJ);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) throws IOException {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j7) throws IOException, C1709a {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        M.d(context);
        if (M1.d() && q(context)) {
            InterfaceC0956c1 interfaceC0956c1A = AbstractC1000r1.a(context);
            C0966g c0966g = new C0966g();
            c0966g.w(str);
            try {
                j(interfaceC0956c1A.b(c0966g), "clear token");
                return;
            } catch (ApiException e7) {
                m(e7, "clear token");
            }
        }
        i(context, f19631c, new g(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) throws IOException, C1709a {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new C1709a("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j7, Executor executor) throws IOException {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return hVar.a(blockingServiceConnection.getService());
                } catch (RemoteException | InterruptedException | TimeoutException e7) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e7);
                    throw new IOException("Error on service connection.", e7);
                }
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            }
        } catch (SecurityException e8) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e8.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e8);
        }
    }

    private static Object j(AbstractC2272l abstractC2272l, String str) throws IOException, ApiException {
        try {
            return AbstractC2275o.a(abstractC2272l);
        } catch (InterruptedException e7) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f19632d.w(str2, new Object[0]);
            throw new IOException(str2, e7);
        } catch (CancellationException e8) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f19632d.w(str3, new Object[0]);
            throw new IOException(str3, e8);
        } catch (ExecutionException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f19632d.w(str4, new Object[0]);
            throw new IOException(str4, e9);
        }
    }

    private static Object k(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f19632d.w("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i7) throws C1709a {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i7);
        } catch (GooglePlayServicesIncorrectManifestValueException e7) {
            e = e7;
            throw new C1709a(e.getMessage(), e);
        } catch (GooglePlayServicesNotAvailableException e8) {
            e = e8;
            throw new C1709a(e.getMessage(), e);
        } catch (GooglePlayServicesRepairableException e9) {
            throw new c(e9.getConnectionStatusCode(), e9.getMessage(), e9.getIntent());
        }
    }

    private static void m(ApiException apiException, String str) {
        f19632d.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(apiException));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f19630b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws IOException, C1709a {
        EnumC0972i enumC0972iE = EnumC0972i.e(str2);
        Logger logger = f19632d;
        logger.w(String.format("[GoogleAuthUtil] error status:%s with method:%s", enumC0972iE, str), new Object[0]);
        if (!EnumC0972i.BAD_AUTHENTICATION.equals(enumC0972iE) && !EnumC0972i.CAPTCHA.equals(enumC0972iE) && !EnumC0972i.NEED_PERMISSION.equals(enumC0972iE) && !EnumC0972i.NEED_REMOTE_CONSENT.equals(enumC0972iE) && !EnumC0972i.NEEDS_BROWSER.equals(enumC0972iE) && !EnumC0972i.USER_CANCEL.equals(enumC0972iE) && !EnumC0972i.DEVICE_MANAGEMENT_REQUIRED.equals(enumC0972iE) && !EnumC0972i.DM_INTERNAL_ERROR.equals(enumC0972iE) && !EnumC0972i.DM_SYNC_DISABLED.equals(enumC0972iE) && !EnumC0972i.DM_ADMIN_BLOCKED.equals(enumC0972iE) && !EnumC0972i.DM_ADMIN_PENDING_APPROVAL.equals(enumC0972iE) && !EnumC0972i.DM_STALE_SYNC_REQUIRED.equals(enumC0972iE) && !EnumC0972i.DM_DEACTIVATED.equals(enumC0972iE) && !EnumC0972i.DM_REQUIRED.equals(enumC0972iE) && !EnumC0972i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC0972iE) && !EnumC0972i.DM_SCREENLOCK_REQUIRED.equals(enumC0972iE)) {
            if (!EnumC0972i.NETWORK_ERROR.equals(enumC0972iE) && !EnumC0972i.SERVICE_UNAVAILABLE.equals(enumC0972iE) && !EnumC0972i.INTNERNAL_ERROR.equals(enumC0972iE) && !EnumC0972i.AUTH_SECURITY_ERROR.equals(enumC0972iE) && !EnumC0972i.ACCOUNT_NOT_PRESENT.equals(enumC0972iE)) {
                throw new C1709a(str2);
            }
            throw new IOException(str2);
        }
        M.d(context);
        if (!J1.c()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (GoogleApiAvailability.getInstance().getApkVersion(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer numValueOf = Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            logger.e(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", numValueOf, str, numValueOf), new Object[0]);
        }
        if (intent == null) {
            logger.e(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f19629a;
        for (int i7 = 0; i7 < 3; i7++) {
            if (strArr[i7].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        List listR = M1.b().r();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
