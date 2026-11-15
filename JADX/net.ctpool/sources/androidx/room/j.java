package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: androidx.room.j$a$a, reason: collision with other inner class name */
        private static class C0173a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f8965a;

            C0173a(IBinder iBinder) {
                this.f8965a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8965a;
            }

            @Override // androidx.room.j
            public void m(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f8965a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0173a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            m(parcel.createStringArray());
            return true;
        }
    }

    void m(String[] strArr);
}
