package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f16792m;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i7) {
            return new f[i7];
        }
    }

    private f(long j7) {
        this.f16792m = j7;
    }

    public static f a(long j7) {
        return new f(j7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f16792m == ((f) obj).f16792m;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16792m)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean n(long j7) {
        return j7 >= this.f16792m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f16792m);
    }

    /* synthetic */ f(long j7, a aVar) {
        this(j7);
    }
}
