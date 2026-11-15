package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ApiKey f13556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f13557b;

    /* synthetic */ E(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.f13556a = apiKey;
        this.f13557b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof E)) {
            E e7 = (E) obj;
            if (Objects.equal(this.f13556a, e7.f13556a) && Objects.equal(this.f13557b, e7.f13557b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f13556a, this.f13557b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.f13556a).add("feature", this.f13557b).toString();
    }
}
