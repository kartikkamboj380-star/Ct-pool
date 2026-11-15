package com.facebook.react.views.scroll;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;
import w5.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f12988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f12989n = new h("BEGIN_DRAG", 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f12990o = new h("END_DRAG", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f12991p = new h("SCROLL", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f12992q = new h("MOMENTUM_BEGIN", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f12993r = new h("MOMENTUM_END", 4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ h[] f12994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f12995t;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0222a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12996a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.f12989n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.f12990o.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.f12991p.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h.f12992q.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[h.f12993r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f12996a = iArr;
            }
        }

        private a() {
        }

        public final String a(h hVar) {
            k.f(hVar, "type");
            int i7 = C0222a.f12996a[hVar.ordinal()];
            if (i7 == 1) {
                return "topScrollBeginDrag";
            }
            if (i7 == 2) {
                return "topScrollEndDrag";
            }
            if (i7 == 3) {
                return "topScroll";
            }
            if (i7 == 4) {
                return "topMomentumScrollBegin";
            }
            if (i7 == 5) {
                return "topMomentumScrollEnd";
            }
            throw new i5.k();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        h[] hVarArrE = e();
        f12994s = hVarArrE;
        f12995t = AbstractC1978a.a(hVarArrE);
        f12988m = new a(null);
    }

    private h(String str, int i7) {
    }

    private static final /* synthetic */ h[] e() {
        return new h[]{f12989n, f12990o, f12991p, f12992q, f12993r};
    }

    public static final String h(h hVar) {
        return f12988m.a(hVar);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12994s.clone();
    }
}
