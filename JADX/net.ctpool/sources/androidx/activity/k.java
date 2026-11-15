package androidx.activity;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f4892a;

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f4892a.run();
    }
}
