package com.facebook.react.fabric;

import com.tenjin.android.config.TenjinConsts;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11740c;

    public m(int i7, int i8, String str) {
        w5.k.f(str, TenjinConsts.EVENT_NAME);
        this.f11738a = i7;
        this.f11739b = i8;
        this.f11740c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11738a == mVar.f11738a && this.f11739b == mVar.f11739b && w5.k.b(this.f11740c, mVar.f11740c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11738a) * 31) + Integer.hashCode(this.f11739b)) * 31) + this.f11740c.hashCode();
    }

    public String toString() {
        return "SynchronousEvent(surfaceId=" + this.f11738a + ", viewTag=" + this.f11739b + ", eventName=" + this.f11740c + ")";
    }
}
