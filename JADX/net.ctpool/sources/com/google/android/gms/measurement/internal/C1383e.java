package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1383e extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1383e> CREATOR = new C1376d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Y5 f16007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f16010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E f16011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public E f16013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f16014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E f16015w;

    C1383e(C1383e c1383e) {
        Preconditions.checkNotNull(c1383e);
        this.f16005m = c1383e.f16005m;
        this.f16006n = c1383e.f16006n;
        this.f16007o = c1383e.f16007o;
        this.f16008p = c1383e.f16008p;
        this.f16009q = c1383e.f16009q;
        this.f16010r = c1383e.f16010r;
        this.f16011s = c1383e.f16011s;
        this.f16012t = c1383e.f16012t;
        this.f16013u = c1383e.f16013u;
        this.f16014v = c1383e.f16014v;
        this.f16015w = c1383e.f16015w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f16005m, false);
        SafeParcelWriter.writeString(parcel, 3, this.f16006n, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f16007o, i7, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f16008p);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f16009q);
        SafeParcelWriter.writeString(parcel, 7, this.f16010r, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f16011s, i7, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f16012t);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f16013u, i7, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f16014v);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f16015w, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    C1383e(String str, String str2, Y5 y52, long j7, boolean z6, String str3, E e7, long j8, E e8, long j9, E e9) {
        this.f16005m = str;
        this.f16006n = str2;
        this.f16007o = y52;
        this.f16008p = j7;
        this.f16009q = z6;
        this.f16010r = str3;
        this.f16011s = e7;
        this.f16012t = j8;
        this.f16013u = e8;
        this.f16014v = j9;
        this.f16015w = e9;
    }
}
