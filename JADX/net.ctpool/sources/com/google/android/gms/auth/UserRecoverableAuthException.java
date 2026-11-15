package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import h3.C1709a;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class UserRecoverableAuthException extends C1709a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Intent f13485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f13486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f13487o;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkNotNull(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        String str;
        Intent intent = this.f13485m;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.f13487o.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            str = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.";
        } else {
            if (iOrdinal != 2) {
                return null;
            }
            str = "this instantiation of UserRecoverableAuthException doesn't support an Intent.";
        }
        Log.e("Auth", str);
        return null;
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f13486n = pendingIntent;
        this.f13485m = intent;
        this.f13487o = (b) Preconditions.checkNotNull(bVar);
    }
}
