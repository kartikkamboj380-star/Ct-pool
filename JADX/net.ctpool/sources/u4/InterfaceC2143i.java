package u4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: u4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2143i extends IInterface {

    /* JADX INFO: renamed from: u4.i$a */
    public static abstract class a extends Binder implements InterfaceC2143i {

        /* JADX INFO: renamed from: u4.i$a$a, reason: collision with other inner class name */
        private static class C0322a implements InterfaceC2143i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f22556a;

            C0322a(IBinder iBinder) {
                this.f22556a = iBinder;
            }

            @Override // u4.InterfaceC2143i
            public void X(InterfaceC2142h interfaceC2142h, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    parcelObtain.writeStrongInterface(interfaceC2142h);
                    parcelObtain.writeString(str);
                    this.f22556a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22556a;
            }

            @Override // u4.InterfaceC2143i
            public void c0(InterfaceC2142h interfaceC2142h, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    parcelObtain.writeStrongInterface(interfaceC2142h);
                    b.b(parcelObtain, bundle, 0);
                    this.f22556a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC2143i i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2143i)) ? new C0322a(iBinder) : (InterfaceC2143i) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: u4.i$b */
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

    void X(InterfaceC2142h interfaceC2142h, String str);

    void c0(InterfaceC2142h interfaceC2142h, Bundle bundle);
}
