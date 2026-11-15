package u4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: u4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2142h extends IInterface {

    /* JADX INFO: renamed from: u4.h$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void E(Status status, C2135a c2135a);

    void h0(Status status, C2144j c2144j);

    /* JADX INFO: renamed from: u4.h$a */
    public static abstract class a extends Binder implements InterfaceC2142h {
        public a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                return true;
            }
            if (i7 == 1) {
                E((Status) b.b(parcel, Status.CREATOR), (C2135a) b.b(parcel, C2135a.CREATOR));
            } else {
                if (i7 != 2) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                h0((Status) b.b(parcel, Status.CREATOR), (C2144j) b.b(parcel, C2144j.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
