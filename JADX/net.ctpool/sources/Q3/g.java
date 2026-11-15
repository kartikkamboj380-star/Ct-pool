package Q3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Binder implements IInterface {
    protected g(String str) {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    protected abstract boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return i0(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
