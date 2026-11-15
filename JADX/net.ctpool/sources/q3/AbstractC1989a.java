package q3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1989a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f21877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21878b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC1989a(IBinder iBinder, String str) {
        this.f21877a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21877a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21878b);
        return parcelObtain;
    }

    protected final Parcel j0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21877a.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e7) {
                parcelObtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }
}
