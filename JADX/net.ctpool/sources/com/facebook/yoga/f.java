package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {
    public void c() {
        long j7 = this.f13377a;
        if (j7 != 0) {
            this.f13377a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j7);
        }
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
