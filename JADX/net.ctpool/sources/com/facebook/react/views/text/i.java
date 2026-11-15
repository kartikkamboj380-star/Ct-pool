package com.facebook.react.views.text;

import android.text.Spannable;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f13075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f13078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f13079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f13080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f13081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13084j;

    public i(Spannable spannable, int i7, boolean z6, float f7, float f8, float f9, float f10, int i8, int i9, int i10) {
        this.f13075a = spannable;
        this.f13076b = i7;
        this.f13077c = z6;
        this.f13078d = f7;
        this.f13079e = f8;
        this.f13080f = f9;
        this.f13081g = f10;
        this.f13082h = i8;
        this.f13083i = i9;
        this.f13084j = i10;
    }

    public static i a(Spannable spannable, int i7, int i8, int i9, int i10) {
        return new i(spannable, i7, false, i8, i9, i10);
    }

    public boolean b() {
        return this.f13077c;
    }

    public int c() {
        return this.f13076b;
    }

    public int d() {
        return this.f13084j;
    }

    public float e() {
        return this.f13081g;
    }

    public float f() {
        return this.f13078d;
    }

    public float g() {
        return this.f13080f;
    }

    public float h() {
        return this.f13079e;
    }

    public Spannable i() {
        return this.f13075a;
    }

    public int j() {
        return this.f13082h;
    }

    public int k() {
        return this.f13083i;
    }

    public i(Spannable spannable, int i7, boolean z6, int i8, int i9, int i10) {
        this(spannable, i7, z6, -1.0f, -1.0f, -1.0f, -1.0f, i8, i9, i10);
    }
}
