package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() throws Throwable {
        try {
            t0();
        } finally {
            super.finalize();
        }
    }

    public void t0() {
        long j7 = this.f13356q;
        if (j7 != 0) {
            this.f13356q = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j7);
        }
    }
}
