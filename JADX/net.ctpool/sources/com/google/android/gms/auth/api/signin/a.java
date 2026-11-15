package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import k3.C1819b;
import l3.q;
import l3.r;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.c(context).a();
    }

    public static AbstractC2272l c(Intent intent) {
        C1819b c1819bD = q.d(intent);
        GoogleSignInAccount googleSignInAccountA = c1819bD.a();
        return (!c1819bD.getStatus().isSuccess() || googleSignInAccountA == null) ? AbstractC2275o.e(ApiExceptionUtil.fromStatus(c1819bD.getStatus())) : AbstractC2275o.f(googleSignInAccountA);
    }

    public static void d(Activity activity, int i7, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(e(activity, googleSignInAccount, scopeArr), i7);
    }

    private static Intent e(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.e(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.a0())) {
            aVar.g((String) Preconditions.checkNotNull(googleSignInAccount.a0()));
        }
        return new b(activity, aVar.a()).c();
    }
}
