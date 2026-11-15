package R2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f2840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2841b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.f2840a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2840a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2841b);
        return parcelObtain;
    }

    protected final Parcel j0(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f2840a.transact(1, parcel, parcelObtain, 0);
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
