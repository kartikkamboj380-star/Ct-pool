package com.swmansion.rnscreens;

import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1593f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f18388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.activity.h f18389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18391d;

    public C1593f(Fragment fragment, androidx.activity.h hVar) {
        w5.k.f(fragment, "fragment");
        w5.k.f(hVar, "onBackPressedCallback");
        this.f18388a = fragment;
        this.f18389b = hVar;
        this.f18391d = true;
    }

    public final boolean a() {
        return this.f18391d;
    }

    public final void b() {
        OnBackPressedDispatcher onBackPressedDispatcherB;
        if (this.f18390c || !this.f18391d) {
            return;
        }
        AbstractActivityC0640j activity = this.f18388a.getActivity();
        if (activity != null && (onBackPressedDispatcherB = activity.b()) != null) {
            onBackPressedDispatcherB.b(this.f18388a, this.f18389b);
        }
        this.f18390c = true;
    }

    public final void c() {
        if (this.f18390c) {
            this.f18389b.d();
            this.f18390c = false;
        }
    }

    public final void d(boolean z6) {
        this.f18391d = z6;
    }
}
