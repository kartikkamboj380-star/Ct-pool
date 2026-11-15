package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.G;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public interface a {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, b bVar);

        void scrollToEnd(Object obj, c cVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12958c;

        b(int i7, int i8, boolean z6) {
            this.f12956a = i7;
            this.f12957b = i8;
            this.f12958c = z6;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f12959a;

        c(boolean z6) {
            this.f12959a = z6;
        }
    }

    public static Map a() {
        return S1.f.f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static void b(a aVar, Object obj, int i7, ReadableArray readableArray) {
        O1.a.c(aVar);
        O1.a.c(obj);
        if (i7 == 1) {
            d(aVar, obj, (ReadableArray) O1.a.c(readableArray));
        } else if (i7 == 2) {
            e(aVar, obj, (ReadableArray) O1.a.c(readableArray));
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i7), aVar.getClass().getSimpleName()));
            }
            aVar.flashScrollIndicators(obj);
        }
    }

    public static void c(a aVar, Object obj, String str, ReadableArray readableArray) {
        O1.a.c(aVar);
        O1.a.c(obj);
        str.hashCode();
        switch (str) {
            case "scrollTo":
                d(aVar, obj, (ReadableArray) O1.a.c(readableArray));
                return;
            case "flashScrollIndicators":
                aVar.flashScrollIndicators(obj);
                return;
            case "scrollToEnd":
                e(aVar, obj, (ReadableArray) O1.a.c(readableArray));
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, aVar.getClass().getSimpleName()));
        }
    }

    private static void d(a aVar, Object obj, ReadableArray readableArray) {
        aVar.scrollTo(obj, new b(Math.round(G.c(readableArray.getDouble(0))), Math.round(G.c(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static void e(a aVar, Object obj, ReadableArray readableArray) {
        aVar.scrollToEnd(obj, new c(readableArray.getBoolean(0)));
    }
}
