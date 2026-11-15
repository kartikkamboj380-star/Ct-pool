package com.facebook.react.views.image;

import android.graphics.Shader;
import j1.p;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f12780a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final p.b b() {
        p.b bVar = p.b.f20329i;
        k.e(bVar, "CENTER_CROP");
        return bVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final p.b c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        p.b bVar = p.b.f20321a;
                        k.e(bVar, "FIT_XY");
                        return bVar;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        p.b bVar2 = p.b.f20328h;
                        k.e(bVar2, "CENTER_INSIDE");
                        return bVar2;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return j.f12814l.a();
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        p.b bVar3 = p.b.f20329i;
                        k.e(bVar3, "CENTER_CROP");
                        return bVar3;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        p.b bVar4 = p.b.f20325e;
                        k.e(bVar4, "FIT_CENTER");
                        return bVar4;
                    }
                    break;
            }
        }
        if (str != null) {
            P0.a.G("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String str) {
        if (k.b("contain", str) || k.b("cover", str) || k.b("stretch", str) || k.b("center", str)) {
            return Shader.TileMode.CLAMP;
        }
        if (k.b("repeat", str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            P0.a.G("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return a();
    }
}
