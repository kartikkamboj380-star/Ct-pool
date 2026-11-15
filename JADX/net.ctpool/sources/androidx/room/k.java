package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.j;

/* JADX INFO: loaded from: classes.dex */
public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* JADX INFO: renamed from: androidx.room.k$a$a, reason: collision with other inner class name */
        private static class C0174a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f8966a;

            C0174a(IBinder iBinder) {
                this.f8966a = iBinder;
            }

            @Override // androidx.room.k
            public void a0(int i7, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeStringArray(strArr);
                    this.f8966a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8966a;
            }

            @Override // androidx.room.k
            public void e0(j jVar, int i7) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeInt(i7);
                    this.f8966a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.k
            public int v(j jVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongInterface(jVar);
                    parcelObtain.writeString(str);
                    this.f8966a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k)) ? new C0174a(iBinder) : (k) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i7 == 1) {
                int iV = v(j.a.i0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iV);
            } else if (i7 == 2) {
                e0(j.a.i0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i7 != 3) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                a0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void a0(int i7, String[] strArr);

    void e0(j jVar, int i7);

    int v(j jVar, String str);
}
