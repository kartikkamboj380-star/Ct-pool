package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Configuration f6925b;

    public X(boolean z6) {
        this.f6924a = z6;
        this.f6925b = null;
    }

    public boolean a() {
        return this.f6924a;
    }

    public X(boolean z6, Configuration configuration) {
        this.f6924a = z6;
        this.f6925b = configuration;
    }
}
