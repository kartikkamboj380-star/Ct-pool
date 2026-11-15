package n3;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: n3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1919l implements Parcelable {
    public static final Parcelable.Creator<C1919l> CREATOR = new C1917j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Messenger f21389m;

    public C1919l(IBinder iBinder) {
        this.f21389m = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f21389m;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f21389m;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((C1919l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f21389m;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
