package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0672a extends IInterface {

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0185a extends Binder implements InterfaceC0672a {

        /* JADX INFO: renamed from: b.a$a$a, reason: collision with other inner class name */
        private static class C0186a implements InterfaceC0672a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f9563a;

            C0186a(IBinder iBinder) {
                this.f9563a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9563a;
            }

            @Override // b.InterfaceC0672a
            public void b0(String str, int i7, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f9563a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC0672a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0672a)) ? new C0186a(iBinder) : (InterfaceC0672a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    void b0(String str, int i7, String str2, Notification notification);
}
