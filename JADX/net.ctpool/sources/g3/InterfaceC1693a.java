package g3;

import R2.b;
import R2.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: g3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1693a extends IInterface {

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0261a extends b implements InterfaceC1693a {

        /* JADX INFO: renamed from: g3.a$a$a, reason: collision with other inner class name */
        public static class C0262a extends R2.a implements InterfaceC1693a {
            C0262a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // g3.InterfaceC1693a
            public final Bundle x(Bundle bundle) {
                Parcel parcelI0 = i0();
                c.b(parcelI0, bundle);
                Parcel parcelJ0 = j0(parcelI0);
                Bundle bundle2 = (Bundle) c.a(parcelJ0, Bundle.CREATOR);
                parcelJ0.recycle();
                return bundle2;
            }
        }

        public static InterfaceC1693a i0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1693a ? (InterfaceC1693a) iInterfaceQueryLocalInterface : new C0262a(iBinder);
        }
    }

    Bundle x(Bundle bundle);
}
