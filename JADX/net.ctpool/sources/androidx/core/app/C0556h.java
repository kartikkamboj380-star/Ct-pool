package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: renamed from: androidx.core.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0556h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Configuration f6965b;

    public C0556h(boolean z6) {
        this.f6964a = z6;
        this.f6965b = null;
    }

    public boolean a() {
        return this.f6964a;
    }

    public C0556h(boolean z6, Configuration configuration) {
        this.f6964a = z6;
        this.f6965b = configuration;
    }
}
