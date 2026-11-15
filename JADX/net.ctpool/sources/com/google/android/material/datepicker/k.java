package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
final class k implements Comparable, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Calendar f16864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f16865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int f16866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int f16867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f16868q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final long f16869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f16870s;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return k.h(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i7) {
            return new k[i7];
        }
    }

    private k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = r.d(calendar);
        this.f16864m = calendarD;
        this.f16865n = calendarD.get(2);
        this.f16866o = calendarD.get(1);
        this.f16867p = calendarD.getMaximum(7);
        this.f16868q = calendarD.getActualMaximum(5);
        this.f16869r = calendarD.getTimeInMillis();
    }

    static k h(int i7, int i8) {
        Calendar calendarI = r.i();
        calendarI.set(1, i7);
        calendarI.set(2, i8);
        return new k(calendarI);
    }

    static k j(long j7) {
        Calendar calendarI = r.i();
        calendarI.setTimeInMillis(j7);
        return new k(calendarI);
    }

    static k k() {
        return new k(r.g());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return this.f16864m.compareTo(kVar.f16864m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f16865n == kVar.f16865n && this.f16866o == kVar.f16866o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16865n), Integer.valueOf(this.f16866o)});
    }

    int l() {
        int firstDayOfWeek = this.f16864m.get(7) - this.f16864m.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f16867p : firstDayOfWeek;
    }

    long m(int i7) {
        Calendar calendarD = r.d(this.f16864m);
        calendarD.set(5, i7);
        return calendarD.getTimeInMillis();
    }

    int p(long j7) {
        Calendar calendarD = r.d(this.f16864m);
        calendarD.setTimeInMillis(j7);
        return calendarD.get(5);
    }

    String q() {
        if (this.f16870s == null) {
            this.f16870s = e.c(this.f16864m.getTimeInMillis());
        }
        return this.f16870s;
    }

    long r() {
        return this.f16864m.getTimeInMillis();
    }

    k s(int i7) {
        Calendar calendarD = r.d(this.f16864m);
        calendarD.add(2, i7);
        return new k(calendarD);
    }

    int t(k kVar) {
        if (this.f16864m instanceof GregorianCalendar) {
            return ((kVar.f16866o - this.f16866o) * 12) + (kVar.f16865n - this.f16865n);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16866o);
        parcel.writeInt(this.f16865n);
    }
}
