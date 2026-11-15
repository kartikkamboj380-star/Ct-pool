package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0922a extends LifecycleCallback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f13596m;

    private C0922a(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f13596m = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ C0922a a(Activity activity) {
        C0922a c0922a;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                c0922a = (C0922a) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0922a.class);
                if (c0922a == null) {
                    c0922a = new C0922a(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0922a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(Runnable runnable) {
        this.f13596m.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List list;
        synchronized (this) {
            list = this.f13596m;
            this.f13596m = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
