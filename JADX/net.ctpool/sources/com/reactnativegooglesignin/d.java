package com.reactnativegooglesignin;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.A0;
import com.google.android.gms.common.SignInButton;

/* JADX INFO: loaded from: classes.dex */
public class d implements A0 {
    d(RNGoogleSigninButtonViewManager rNGoogleSigninButtonViewManager) {
    }

    @Override // com.facebook.react.uimanager.A0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(SignInButton signInButton, String str, ReadableArray readableArray) {
        throw new RuntimeException("receiveCommand must not be called");
    }

    @Override // com.facebook.react.uimanager.A0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(SignInButton signInButton, String str, Object obj) {
        throw new RuntimeException("setProperty must not be called");
    }
}
