package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f13377a;

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f13377a, kVar.h());
    }

    @Override // com.facebook.yoga.c
    public void b(float f7) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f13377a, f7);
    }

    private e(long j7) {
        if (j7 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f13377a = j7;
    }
}
