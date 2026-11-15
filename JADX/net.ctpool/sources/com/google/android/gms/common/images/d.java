package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f13681a;

    public d(Uri uri) {
        this.f13681a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Objects.equal(((d) obj).f13681a, this.f13681a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f13681a);
    }
}
