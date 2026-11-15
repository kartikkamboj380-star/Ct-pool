package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0227a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f16766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f16767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f16768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f16769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f16770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f16771r;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0227a implements Parcelable.Creator {
        C0227a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((k) parcel.readParcelable(k.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f16772e = r.a(k.h(1900, 0).f16869r);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f16773f = r.a(k.h(2100, 11).f16869r);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f16775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f16776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f16777d;

        b(a aVar) {
            this.f16774a = f16772e;
            this.f16775b = f16773f;
            this.f16777d = f.a(Long.MIN_VALUE);
            this.f16774a = aVar.f16766m.f16869r;
            this.f16775b = aVar.f16767n.f16869r;
            this.f16776c = Long.valueOf(aVar.f16769p.f16869r);
            this.f16777d = aVar.f16768o;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f16777d);
            k kVarJ = k.j(this.f16774a);
            k kVarJ2 = k.j(this.f16775b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l7 = this.f16776c;
            return new a(kVarJ, kVarJ2, cVar, l7 == null ? null : k.j(l7.longValue()), null);
        }

        public b b(long j7) {
            this.f16776c = Long.valueOf(j7);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean n(long j7);
    }

    private a(k kVar, k kVar2, c cVar, k kVar3) {
        this.f16766m = kVar;
        this.f16767n = kVar2;
        this.f16769p = kVar3;
        this.f16768o = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.compareTo(kVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f16771r = kVar.t(kVar2) + 1;
        this.f16770q = (kVar2.f16866o - kVar.f16866o) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f16768o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16766m.equals(aVar.f16766m) && this.f16767n.equals(aVar.f16767n) && androidx.core.util.b.a(this.f16769p, aVar.f16769p) && this.f16768o.equals(aVar.f16768o);
    }

    k f() {
        return this.f16767n;
    }

    int g() {
        return this.f16771r;
    }

    k h() {
        return this.f16769p;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16766m, this.f16767n, this.f16769p, this.f16768o});
    }

    k i() {
        return this.f16766m;
    }

    int j() {
        return this.f16770q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f16766m, 0);
        parcel.writeParcelable(this.f16767n, 0);
        parcel.writeParcelable(this.f16769p, 0);
        parcel.writeParcelable(this.f16768o, 0);
    }

    /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, C0227a c0227a) {
        this(kVar, kVar2, cVar, kVar3);
    }
}
