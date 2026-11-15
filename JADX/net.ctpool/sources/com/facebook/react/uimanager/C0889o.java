package com.facebook.react.uimanager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0889o f12620a = new C0889o();

    private C0889o() {
    }

    public static final boolean a(float f7, float f8) {
        if (Float.isNaN(f7) || Float.isNaN(f8)) {
            if (!Float.isNaN(f7) || !Float.isNaN(f8)) {
                return false;
            }
        } else if (Math.abs(f8 - f7) >= 1.0E-5f) {
            return false;
        }
        return true;
    }
}
