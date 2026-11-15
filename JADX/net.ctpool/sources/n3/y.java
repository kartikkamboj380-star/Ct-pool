package n3;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Messenger f21414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1919l f21415b;

    y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f21414a = new Messenger(iBinder);
            this.f21415b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f21415b = new C1919l(iBinder);
            this.f21414a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f21414a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C1919l c1919l = this.f21415b;
        if (c1919l == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c1919l.b(message);
    }
}
