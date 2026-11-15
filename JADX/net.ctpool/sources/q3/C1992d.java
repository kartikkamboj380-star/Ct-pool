package q3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: q3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1992d extends AbstractC1989a implements InterfaceC1994f {
    C1992d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // q3.InterfaceC1994f
    public final boolean n(boolean z6) {
        Parcel parcelI0 = i0();
        AbstractC1991c.a(parcelI0, true);
        Parcel parcelJ0 = j0(2, parcelI0);
        boolean zB = AbstractC1991c.b(parcelJ0);
        parcelJ0.recycle();
        return zB;
    }

    @Override // q3.InterfaceC1994f
    public final String zzc() {
        Parcel parcelJ0 = j0(1, i0());
        String string = parcelJ0.readString();
        parcelJ0.recycle();
        return string;
    }

    @Override // q3.InterfaceC1994f
    public final boolean zzd() {
        Parcel parcelJ0 = j0(6, i0());
        boolean zB = AbstractC1991c.b(parcelJ0);
        parcelJ0.recycle();
        return zB;
    }
}
