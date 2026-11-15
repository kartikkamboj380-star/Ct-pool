package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<M5> CREATOR = new e6();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f15677A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f15678B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f15679C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Boolean f15680D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f15681E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final List f15682F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final String f15683G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f15684H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f15685I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f15686J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f15687K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final long f15688L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f15689M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final String f15690N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f15691O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final long f15692P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f15693Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final String f15694R;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f15699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f15700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f15702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f15704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f15705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f15706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f15707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f15708z;

    M5(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z6, boolean z7, String str6, long j10, long j11, int i7, boolean z8, boolean z9, String str7, Boolean bool, long j12, List list, String str8, String str9, String str10, String str11, boolean z10, long j13, int i8, String str12, int i9, long j14, String str13, String str14) {
        Preconditions.checkNotEmpty(str);
        this.f15695m = str;
        this.f15696n = TextUtils.isEmpty(str2) ? null : str2;
        this.f15697o = str3;
        this.f15704v = j7;
        this.f15698p = str4;
        this.f15699q = j8;
        this.f15700r = j9;
        this.f15701s = str5;
        this.f15702t = z6;
        this.f15703u = z7;
        this.f15705w = str6;
        this.f15706x = j10;
        this.f15707y = j11;
        this.f15708z = i7;
        this.f15677A = z8;
        this.f15678B = z9;
        this.f15679C = str7;
        this.f15680D = bool;
        this.f15681E = j12;
        this.f15682F = list;
        this.f15683G = null;
        this.f15684H = str9;
        this.f15685I = str10;
        this.f15686J = str11;
        this.f15687K = z10;
        this.f15688L = j13;
        this.f15689M = i8;
        this.f15690N = str12;
        this.f15691O = i9;
        this.f15692P = j14;
        this.f15693Q = str13;
        this.f15694R = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f15695m, false);
        SafeParcelWriter.writeString(parcel, 3, this.f15696n, false);
        SafeParcelWriter.writeString(parcel, 4, this.f15697o, false);
        SafeParcelWriter.writeString(parcel, 5, this.f15698p, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f15699q);
        SafeParcelWriter.writeLong(parcel, 7, this.f15700r);
        SafeParcelWriter.writeString(parcel, 8, this.f15701s, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f15702t);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f15703u);
        SafeParcelWriter.writeLong(parcel, 11, this.f15704v);
        SafeParcelWriter.writeString(parcel, 12, this.f15705w, false);
        SafeParcelWriter.writeLong(parcel, 13, this.f15706x);
        SafeParcelWriter.writeLong(parcel, 14, this.f15707y);
        SafeParcelWriter.writeInt(parcel, 15, this.f15708z);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f15677A);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f15678B);
        SafeParcelWriter.writeString(parcel, 19, this.f15679C, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.f15680D, false);
        SafeParcelWriter.writeLong(parcel, 22, this.f15681E);
        SafeParcelWriter.writeStringList(parcel, 23, this.f15682F, false);
        SafeParcelWriter.writeString(parcel, 24, this.f15683G, false);
        SafeParcelWriter.writeString(parcel, 25, this.f15684H, false);
        SafeParcelWriter.writeString(parcel, 26, this.f15685I, false);
        SafeParcelWriter.writeString(parcel, 27, this.f15686J, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.f15687K);
        SafeParcelWriter.writeLong(parcel, 29, this.f15688L);
        SafeParcelWriter.writeInt(parcel, 30, this.f15689M);
        SafeParcelWriter.writeString(parcel, 31, this.f15690N, false);
        SafeParcelWriter.writeInt(parcel, 32, this.f15691O);
        SafeParcelWriter.writeLong(parcel, 34, this.f15692P);
        SafeParcelWriter.writeString(parcel, 35, this.f15693Q, false);
        SafeParcelWriter.writeString(parcel, 36, this.f15694R, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    M5(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z6, boolean z7, long j9, String str6, long j10, long j11, int i7, boolean z8, boolean z9, String str7, Boolean bool, long j12, List list, String str8, String str9, String str10, String str11, boolean z10, long j13, int i8, String str12, int i9, long j14, String str13, String str14) {
        this.f15695m = str;
        this.f15696n = str2;
        this.f15697o = str3;
        this.f15704v = j9;
        this.f15698p = str4;
        this.f15699q = j7;
        this.f15700r = j8;
        this.f15701s = str5;
        this.f15702t = z6;
        this.f15703u = z7;
        this.f15705w = str6;
        this.f15706x = j10;
        this.f15707y = j11;
        this.f15708z = i7;
        this.f15677A = z8;
        this.f15678B = z9;
        this.f15679C = str7;
        this.f15680D = bool;
        this.f15681E = j12;
        this.f15682F = list;
        this.f15683G = str8;
        this.f15684H = str9;
        this.f15685I = str10;
        this.f15686J = str11;
        this.f15687K = z10;
        this.f15688L = j13;
        this.f15689M = i8;
        this.f15690N = str12;
        this.f15691O = i9;
        this.f15692P = j14;
        this.f15693Q = str13;
        this.f15694R = str14;
    }
}
