package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055c1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1055c1> CREATOR = new C1046b1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f14528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f14529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f14531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f14532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f14533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f14534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14535t;

    public C1055c1(long j7, long j8, boolean z6, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f14528m = j7;
        this.f14529n = j8;
        this.f14530o = z6;
        this.f14531p = str;
        this.f14532q = str2;
        this.f14533r = str3;
        this.f14534s = bundle;
        this.f14535t = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f14528m);
        SafeParcelWriter.writeLong(parcel, 2, this.f14529n);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f14530o);
        SafeParcelWriter.writeString(parcel, 4, this.f14531p, false);
        SafeParcelWriter.writeString(parcel, 5, this.f14532q, false);
        SafeParcelWriter.writeString(parcel, 6, this.f14533r, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f14534s, false);
        SafeParcelWriter.writeString(parcel, 8, this.f14535t, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
