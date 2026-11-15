package com.facebook.imagepipeline.nativecode;

import s1.C2037b;
import s1.C2038c;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeJpegTranscoderFactory implements L1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10704c;

    @O0.d
    public NativeJpegTranscoderFactory(int i7, boolean z6, boolean z7) {
        this.f10702a = i7;
        this.f10703b = z6;
        this.f10704c = z7;
    }

    @Override // L1.d
    @O0.d
    public L1.c createImageTranscoder(C2038c c2038c, boolean z6) {
        if (c2038c != C2037b.f22237b) {
            return null;
        }
        return new NativeJpegTranscoder(z6, this.f10702a, this.f10703b, this.f10704c);
    }
}
