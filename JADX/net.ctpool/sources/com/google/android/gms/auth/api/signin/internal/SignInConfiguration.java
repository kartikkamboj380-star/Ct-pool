package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import l3.C1849b;
import l3.y;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "SignInConfigurationCreator")
@SafeParcelable.Reserved({1})
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f13535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GoogleSignInOptions f13536n;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f13535m = Preconditions.checkNotEmpty(str);
        this.f13536n = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f13535m.equals(signInConfiguration.f13535m)) {
            GoogleSignInOptions googleSignInOptions = this.f13536n;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f13536n;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C1849b().a(this.f13535m).a(this.f13536n).b();
    }

    public final GoogleSignInOptions w() {
        return this.f13536n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13535m;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f13536n, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
