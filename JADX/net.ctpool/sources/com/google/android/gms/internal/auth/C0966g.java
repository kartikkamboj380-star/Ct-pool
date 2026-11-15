package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966g extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0966g> CREATOR = new C0969h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f13906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f13907n;

    public C0966g() {
        this.f13906m = 1;
    }

    public final C0966g w(String str) {
        this.f13907n = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13906m);
        SafeParcelWriter.writeString(parcel, 2, this.f13907n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    C0966g(int i7, String str) {
        this.f13906m = i7;
        this.f13907n = str;
    }
}
