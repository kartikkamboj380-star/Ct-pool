package com.facebook.react.uimanager.events;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f12582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f12583o = new s("START", 0, "topTouchStart");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f12584p = new s("END", 1, "topTouchEnd");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f12585q = new s("MOVE", 2, "topTouchMove");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f12586r = new s("CANCEL", 3, "topTouchCancel");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ s[] f12587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12588t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f12589m;

    public static final class a {
        private a() {
        }

        public final String a(s sVar) {
            w5.k.f(sVar, "type");
            return sVar.j();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        s[] sVarArrE = e();
        f12587s = sVarArrE;
        f12588t = AbstractC1978a.a(sVarArrE);
        f12582n = new a(null);
    }

    private s(String str, int i7, String str2) {
        this.f12589m = str2;
    }

    private static final /* synthetic */ s[] e() {
        return new s[]{f12583o, f12584p, f12585q, f12586r};
    }

    public static final String h(s sVar) {
        return f12582n.a(sVar);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f12587s.clone();
    }

    public final String j() {
        return this.f12589m;
    }
}
