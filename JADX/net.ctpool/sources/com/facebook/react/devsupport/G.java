package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f11516a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f11517b;

    private G() {
    }

    public static final synchronized void a() {
        if (f11517b) {
            return;
        }
        SoLoader.t("react_devsupportjni");
        f11517b = true;
    }
}
