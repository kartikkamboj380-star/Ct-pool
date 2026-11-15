package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1036a0;
import java.util.ArrayList;
import java.util.List;
import w3.C2191b;
import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1386e2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC2195f {
    C1386e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // w3.InterfaceC2195f
    public final void B(long j7, String str, String str2, String str3) {
        Parcel parcelI0 = i0();
        parcelI0.writeLong(j7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        k0(10, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void C(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(27, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final List D(String str, String str2, String str3) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        Parcel parcelJ0 = j0(17, parcelI0);
        ArrayList arrayListCreateTypedArrayList = parcelJ0.createTypedArrayList(C1383e.CREATOR);
        parcelJ0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // w3.InterfaceC2195f
    public final void F(C1383e c1383e) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, c1383e);
        k0(13, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void J(E e7, String str, String str2) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, e7);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        k0(5, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void M(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(25, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final C2191b P(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        Parcel parcelJ0 = j0(21, parcelI0);
        C2191b c2191b = (C2191b) AbstractC1036a0.a(parcelJ0, C2191b.CREATOR);
        parcelJ0.recycle();
        return c2191b;
    }

    @Override // w3.InterfaceC2195f
    public final List R(String str, String str2, boolean z6, M5 m52) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.e(parcelI0, z6);
        AbstractC1036a0.d(parcelI0, m52);
        Parcel parcelJ0 = j0(14, parcelI0);
        ArrayList arrayListCreateTypedArrayList = parcelJ0.createTypedArrayList(Y5.CREATOR);
        parcelJ0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // w3.InterfaceC2195f
    public final void S(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(26, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final List T(M5 m52, Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        AbstractC1036a0.d(parcelI0, bundle);
        Parcel parcelJ0 = j0(24, parcelI0);
        ArrayList arrayListCreateTypedArrayList = parcelJ0.createTypedArrayList(B5.CREATOR);
        parcelJ0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // w3.InterfaceC2195f
    public final byte[] U(E e7, String str) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, e7);
        parcelI0.writeString(str);
        Parcel parcelJ0 = j0(9, parcelI0);
        byte[] bArrCreateByteArray = parcelJ0.createByteArray();
        parcelJ0.recycle();
        return bArrCreateByteArray;
    }

    @Override // w3.InterfaceC2195f
    public final List c(String str, String str2, M5 m52) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.d(parcelI0, m52);
        Parcel parcelJ0 = j0(16, parcelI0);
        ArrayList arrayListCreateTypedArrayList = parcelJ0.createTypedArrayList(C1383e.CREATOR);
        parcelJ0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // w3.InterfaceC2195f
    public final void d0(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(6, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void e(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(4, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void g0(E e7, M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, e7);
        AbstractC1036a0.d(parcelI0, m52);
        k0(1, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final List l(String str, String str2, String str3, boolean z6) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeString(str3);
        AbstractC1036a0.e(parcelI0, z6);
        Parcel parcelJ0 = j0(15, parcelI0);
        ArrayList arrayListCreateTypedArrayList = parcelJ0.createTypedArrayList(Y5.CREATOR);
        parcelJ0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // w3.InterfaceC2195f
    public final void p(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(18, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void q(Bundle bundle, M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        AbstractC1036a0.d(parcelI0, m52);
        k0(19, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void r(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        k0(20, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final void s(Y5 y52, M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, y52);
        AbstractC1036a0.d(parcelI0, m52);
        k0(2, parcelI0);
    }

    @Override // w3.InterfaceC2195f
    public final String w(M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, m52);
        Parcel parcelJ0 = j0(11, parcelI0);
        String string = parcelJ0.readString();
        parcelJ0.recycle();
        return string;
    }

    @Override // w3.InterfaceC2195f
    public final void y(C1383e c1383e, M5 m52) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, c1383e);
        AbstractC1036a0.d(parcelI0, m52);
        k0(12, parcelI0);
    }
}
