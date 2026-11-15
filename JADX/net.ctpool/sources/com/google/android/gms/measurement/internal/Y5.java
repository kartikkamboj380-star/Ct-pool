package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class Y5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Y5> CREATOR = new b6();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15876n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f15877o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f15878p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15879q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f15880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f15881s;

    Y5(int i7, String str, long j7, Long l7, Float f7, String str2, String str3, Double d7) {
        this.f15875m = i7;
        this.f15876n = str;
        this.f15877o = j7;
        this.f15878p = l7;
        if (i7 == 1) {
            this.f15881s = f7 != null ? Double.valueOf(f7.doubleValue()) : null;
        } else {
            this.f15881s = d7;
        }
        this.f15879q = str2;
        this.f15880r = str3;
    }

    public final Object w() {
        Long l7 = this.f15878p;
        if (l7 != null) {
            return l7;
        }
        Double d7 = this.f15881s;
        if (d7 != null) {
            return d7;
        }
        String str = this.f15879q;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15875m);
        SafeParcelWriter.writeString(parcel, 2, this.f15876n, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f15877o);
        SafeParcelWriter.writeLongObject(parcel, 4, this.f15878p, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.f15879q, false);
        SafeParcelWriter.writeString(parcel, 7, this.f15880r, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.f15881s, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    Y5(a6 a6Var) {
        this(a6Var.f15908c, a6Var.f15909d, a6Var.f15910e, a6Var.f15907b);
    }

    Y5(String str, long j7, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f15875m = 2;
        this.f15876n = str;
        this.f15877o = j7;
        this.f15880r = str2;
        if (obj == null) {
            this.f15878p = null;
            this.f15881s = null;
            this.f15879q = null;
            return;
        }
        if (obj instanceof Long) {
            this.f15878p = (Long) obj;
            this.f15881s = null;
            this.f15879q = null;
        } else if (obj instanceof String) {
            this.f15878p = null;
            this.f15881s = null;
            this.f15879q = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f15878p = null;
            this.f15881s = (Double) obj;
            this.f15879q = null;
        }
    }
}
