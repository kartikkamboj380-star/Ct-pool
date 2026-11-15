package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.AbstractC1031h;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13747a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13748b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC1031h f13749c = AbstractC1031h.r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1031h f13750d = AbstractC1031h.r();

    s() {
    }

    final s a(long j7) {
        this.f13748b = j7;
        return this;
    }

    final s b(List list) {
        Preconditions.checkNotNull(list);
        this.f13750d = AbstractC1031h.q(list);
        return this;
    }

    final s c(List list) {
        Preconditions.checkNotNull(list);
        this.f13749c = AbstractC1031h.q(list);
        return this;
    }

    final s d(String str) {
        this.f13747a = str;
        return this;
    }

    final d e() {
        if (this.f13747a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f13748b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f13749c.isEmpty() && this.f13750d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new d(this.f13747a, this.f13748b, this.f13749c, this.f13750d, null);
    }
}
