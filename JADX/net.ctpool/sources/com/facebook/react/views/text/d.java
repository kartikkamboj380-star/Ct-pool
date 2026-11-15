package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f13046b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T1.b f13047a;

    private d(T1.b bVar) {
        this.f13047a = bVar;
    }

    public static d a() {
        if (f13046b == null) {
            f13046b = new d(T1.b.b());
        }
        return f13046b;
    }

    public Typeface b(String str, int i7, AssetManager assetManager) {
        return this.f13047a.c(str, i7, assetManager);
    }
}
