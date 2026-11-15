package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10707a;

    public static synchronized void a() {
        if (!f10707a) {
            N2.a.d("native-imagetranscoder");
            f10707a = true;
        }
    }
}
