package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f13530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GoogleSignInAccount f13531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final String f13532o;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f13531n = googleSignInAccount;
        this.f13530m = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.f13532o = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount w() {
        return this.f13531n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13530m;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, str, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f13531n, i7, false);
        SafeParcelWriter.writeString(parcel, 8, this.f13532o, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
