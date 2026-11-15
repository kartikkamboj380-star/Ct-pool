package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.uimanager.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12736c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC0898y f12738b;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.x$a */
    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.uimanager.x$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0217a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12739a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12739a = iArr;
            }
        }

        private a() {
        }

        public final C0897x a(Dynamic dynamic) {
            StringBuilder sb;
            String str;
            w5.k.f(dynamic, "dynamic");
            int i7 = C0217a.f12739a[dynamic.getType().ordinal()];
            if (i7 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new C0897x(G.c(dAsDouble), EnumC0898y.f12740m);
                }
                return null;
            }
            if (i7 != 2) {
                ReadableType type = dynamic.getType();
                sb = new StringBuilder();
                sb.append("Unsupported type for radius property: ");
                sb.append(type);
            } else {
                String strAsString = dynamic.asString();
                if (F5.g.o(strAsString, "%", false, 2, null)) {
                    try {
                        String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                        w5.k.e(strSubstring, "substring(...)");
                        float f7 = Float.parseFloat(strSubstring);
                        if (f7 >= 0.0f) {
                            return new C0897x(f7, EnumC0898y.f12741n);
                        }
                        return null;
                    } catch (NumberFormatException unused) {
                        sb = new StringBuilder();
                        str = "Invalid percentage format: ";
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Invalid string value: ";
                }
                sb.append(str);
                sb.append(strAsString);
            }
            P0.a.G("ReactNative", sb.toString());
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0897x(float f7, EnumC0898y enumC0898y) {
        w5.k.f(enumC0898y, "unit");
        this.f12737a = f7;
        this.f12738b = enumC0898y;
    }

    public static final C0897x c(Dynamic dynamic) {
        return f12736c.a(dynamic);
    }

    public final EnumC0898y a() {
        return this.f12738b;
    }

    public final float b(float f7, float f8) {
        return this.f12738b == EnumC0898y.f12741n ? (this.f12737a / 100) * Math.min(f7, f8) : this.f12737a;
    }
}
