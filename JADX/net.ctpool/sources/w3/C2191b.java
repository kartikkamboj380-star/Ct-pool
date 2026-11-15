package w3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: w3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2191b extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2191b> CREATOR = new C2192c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f22687m;

    public C2191b(Bundle bundle) {
        this.f22687m = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f22687m, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
