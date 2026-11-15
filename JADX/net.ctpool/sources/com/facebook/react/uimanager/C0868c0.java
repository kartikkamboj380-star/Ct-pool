package com.facebook.react.uimanager;

import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.uimanager.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12487e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f12488f = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f12490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12492d;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.c0$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0868c0() {
        this(0.0f, f12487e.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i7) {
        float f7;
        if (i7 != 4 && i7 != 5) {
            switch (i7) {
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 10:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    break;
                default:
                    f7 = this.f12489a;
                    break;
            }
        } else {
            f7 = Float.NaN;
        }
        int i8 = this.f12491c;
        if (i8 == 0) {
            return f7;
        }
        int[] iArr = f12488f;
        if ((iArr[i7] & i8) != 0) {
            return this.f12490b[i7];
        }
        if (this.f12492d) {
            char c7 = (i7 == 1 || i7 == 3) ? (char) 7 : (char) 6;
            if ((iArr[c7] & i8) != 0) {
                return this.f12490b[c7];
            }
            if ((i8 & iArr[8]) != 0) {
                return this.f12490b[8];
            }
        }
        return f7;
    }

    public final float b(int i7) {
        return this.f12490b[i7];
    }

    public final boolean c(int i7, float f7) {
        if (C0889o.a(this.f12490b[i7], f7)) {
            return false;
        }
        this.f12490b[i7] = f7;
        int i8 = com.facebook.yoga.g.a(f7) ? (~f12488f[i7]) & this.f12491c : f12488f[i7] | this.f12491c;
        this.f12491c = i8;
        int[] iArr = f12488f;
        this.f12492d = ((iArr[8] & i8) == 0 && (iArr[7] & i8) == 0 && (iArr[6] & i8) == 0 && (i8 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public C0868c0(float f7) {
        this(f7, f12487e.b());
    }

    public C0868c0(float f7, float[] fArr) {
        w5.k.f(fArr, "spacing");
        this.f12489a = f7;
        this.f12490b = fArr;
    }
}
