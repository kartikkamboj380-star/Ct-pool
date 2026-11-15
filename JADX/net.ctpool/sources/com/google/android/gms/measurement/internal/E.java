package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import w3.C2193d;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractSafeParcelable {
    public static final Parcelable.Creator<E> CREATOR = new C2193d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D f15419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f15421p;

    E(E e7, long j7) {
        Preconditions.checkNotNull(e7);
        this.f15418m = e7.f15418m;
        this.f15419n = e7.f15419n;
        this.f15420o = e7.f15420o;
        this.f15421p = j7;
    }

    public final String toString() {
        return "origin=" + this.f15420o + ",name=" + this.f15418m + ",params=" + String.valueOf(this.f15419n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f15418m, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15419n, i7, false);
        SafeParcelWriter.writeString(parcel, 4, this.f15420o, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f15421p);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public E(String str, D d7, String str2, long j7) {
        this.f15418m = str;
        this.f15419n = d7;
        this.f15420o = str2;
        this.f15421p = j7;
    }
}
