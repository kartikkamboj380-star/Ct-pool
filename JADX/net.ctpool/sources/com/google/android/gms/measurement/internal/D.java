package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<D> CREATOR = new F();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Bundle f15396m;

    D(Bundle bundle) {
        this.f15396m = bundle;
    }

    final Long B0(String str) {
        return Long.valueOf(this.f15396m.getLong(str));
    }

    final Object H0(String str) {
        return this.f15396m.get(str);
    }

    final String S0(String str) {
        return this.f15396m.getString(str);
    }

    final Double a0(String str) {
        return Double.valueOf(this.f15396m.getDouble(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C(this);
    }

    public final Bundle n0() {
        return new Bundle(this.f15396m);
    }

    public final String toString() {
        return this.f15396m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, n0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f15396m.size();
    }
}
