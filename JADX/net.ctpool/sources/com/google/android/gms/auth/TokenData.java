package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f13478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f13479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Long f13480o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f13481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f13482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f13483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f13484s;

    TokenData(int i7, String str, Long l7, boolean z6, boolean z7, List list, String str2) {
        this.f13478m = i7;
        this.f13479n = Preconditions.checkNotEmpty(str);
        this.f13480o = l7;
        this.f13481p = z6;
        this.f13482q = z7;
        this.f13483r = list;
        this.f13484s = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f13479n, tokenData.f13479n) && Objects.equal(this.f13480o, tokenData.f13480o) && this.f13481p == tokenData.f13481p && this.f13482q == tokenData.f13482q && Objects.equal(this.f13483r, tokenData.f13483r) && Objects.equal(this.f13484s, tokenData.f13484s);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f13479n, this.f13480o, Boolean.valueOf(this.f13481p), Boolean.valueOf(this.f13482q), this.f13483r, this.f13484s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13478m);
        SafeParcelWriter.writeString(parcel, 2, this.f13479n, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f13480o, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f13481p);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f13482q);
        SafeParcelWriter.writeStringList(parcel, 6, this.f13483r, false);
        SafeParcelWriter.writeString(parcel, 7, this.f13484s, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f13479n;
    }
}
