package com.facebook.imagepipeline.producers;

import x1.C2215f;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f11022a = new v0();

    private v0() {
    }

    public static final int a(int i7) {
        return (int) (i7 * 1.3333334f);
    }

    public static final boolean b(int i7, int i8, C2215f c2215f) {
        int iA = a(i7);
        if (c2215f == null) {
            if (iA < 2048.0f || a(i8) < 2048) {
                return false;
            }
        } else if (iA < c2215f.f22824a || a(i8) < c2215f.f22825b) {
            return false;
        }
        return true;
    }

    public static final boolean c(D1.g gVar, C2215f c2215f) {
        int height;
        int width;
        if (gVar == null) {
            return false;
        }
        int iT = gVar.T();
        if (iT == 90 || iT == 270) {
            height = gVar.getHeight();
            width = gVar.getWidth();
        } else {
            height = gVar.getWidth();
            width = gVar.getHeight();
        }
        return b(height, width, c2215f);
    }
}
