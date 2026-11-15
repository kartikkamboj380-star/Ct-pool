package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f17318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.android.material.timepicker.a f17319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int f17320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f17321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f17322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f17324s;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    public c(int i7, int i8, int i9, int i10) {
        this.f17321p = i7;
        this.f17322q = i8;
        this.f17323r = i9;
        this.f17320o = i10;
        this.f17324s = c(i7);
        this.f17318m = new com.google.android.material.timepicker.a(59);
        this.f17319n = new com.google.android.material.timepicker.a(i10 == 1 ? 24 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i7) {
        return i7 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17321p == cVar.f17321p && this.f17322q == cVar.f17322q && this.f17320o == cVar.f17320o && this.f17323r == cVar.f17323r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17320o), Integer.valueOf(this.f17321p), Integer.valueOf(this.f17322q), Integer.valueOf(this.f17323r)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f17321p);
        parcel.writeInt(this.f17322q);
        parcel.writeInt(this.f17323r);
        parcel.writeInt(this.f17320o);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
