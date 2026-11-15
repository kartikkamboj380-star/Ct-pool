package r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: r3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2026a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f22133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22134b;

    protected AbstractC2026a(IBinder iBinder, String str) {
        this.f22133a = iBinder;
        this.f22134b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22133a;
    }

    protected final Parcel i0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22134b);
        return parcelObtain;
    }

    protected final void j0(int i7, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22133a.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
