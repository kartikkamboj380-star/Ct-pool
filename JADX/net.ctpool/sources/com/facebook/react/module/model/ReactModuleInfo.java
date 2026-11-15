package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class ReactModuleInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11793g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f11799f;

    public static final class a {
        private a() {
        }

        public final boolean a(Class cls) {
            k.f(cls, "clazz");
            return TurboModule.class.isAssignableFrom(cls);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReactModuleInfo(String str, String str2, boolean z6, boolean z7, boolean z8, boolean z9) {
        k.f(str, "_name");
        k.f(str2, "_className");
        this.f11794a = str;
        this.f11795b = str2;
        this.f11796c = z6;
        this.f11797d = z7;
        this.f11798e = z8;
        this.f11799f = z9;
    }

    public static final boolean b(Class cls) {
        return f11793g.a(cls);
    }

    public final boolean a() {
        return this.f11796c;
    }

    public final String c() {
        return this.f11795b;
    }

    public final boolean d() {
        return this.f11798e;
    }

    public final boolean e() {
        return this.f11799f;
    }

    public final String f() {
        return this.f11794a;
    }

    public final boolean g() {
        return this.f11797d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String str, String str2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this(str, str2, z6, z7, z9, z10);
        k.f(str, "name");
        k.f(str2, "className");
    }
}
