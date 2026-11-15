package Q3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: Q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0452a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f2761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2762b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    protected AbstractC0452a(IBinder iBinder, String str) {
        this.f2761a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2761a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2762b);
        return parcelObtain;
    }

    protected final void j0(int i7, Parcel parcel) {
        try {
            this.f2761a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
