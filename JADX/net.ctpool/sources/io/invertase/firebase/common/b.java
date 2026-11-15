package io.invertase.firebase.common;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20106a = new a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20108c;

    protected b(Context context, String str) {
        this.f20107b = context;
        this.f20108c = str;
    }

    public Context a() {
        return this.f20107b;
    }

    public String b() {
        return "Universal" + this.f20108c + "Module";
    }
}
