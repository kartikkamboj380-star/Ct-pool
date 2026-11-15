package l3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1848a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1848a> CREATOR = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f21092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bundle f21094o;

    C1848a(int i7, int i8, Bundle bundle) {
        this.f21092m = i7;
        this.f21093n = i8;
        this.f21094o = bundle;
    }

    public int w() {
        return this.f21093n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f21092m);
        SafeParcelWriter.writeInt(parcel, 2, w());
        SafeParcelWriter.writeBundle(parcel, 3, this.f21094o, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
