package w3;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.internal.measurement.AbstractBinderC1045b0;
import com.google.android.gms.internal.measurement.AbstractC1036a0;
import com.google.android.gms.measurement.internal.C1383e;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.Y5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractBinderC1045b0 implements InterfaceC2195f {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1045b0
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        List listY;
        switch (i7) {
            case 1:
                com.google.android.gms.measurement.internal.E e7 = (com.google.android.gms.measurement.internal.E) AbstractC1036a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                M5 m52 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                g0(e7, m52);
                parcel2.writeNoException();
                return true;
            case 2:
                Y5 y52 = (Y5) AbstractC1036a0.a(parcel, Y5.CREATOR);
                M5 m53 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                s(y52, m53);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            default:
                return false;
            case 4:
                M5 m54 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                e(m54);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.E e8 = (com.google.android.gms.measurement.internal.E) AbstractC1036a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC1036a0.f(parcel);
                J(e8, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                M5 m55 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                d0(m55);
                parcel2.writeNoException();
                return true;
            case 7:
                M5 m56 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                boolean zH = AbstractC1036a0.h(parcel);
                AbstractC1036a0.f(parcel);
                listY = Y(m56, zH);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                com.google.android.gms.measurement.internal.E e9 = (com.google.android.gms.measurement.internal.E) AbstractC1036a0.a(parcel, com.google.android.gms.measurement.internal.E.CREATOR);
                String string3 = parcel.readString();
                AbstractC1036a0.f(parcel);
                byte[] bArrU = U(e9, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrU);
                return true;
            case 10:
                long j7 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                AbstractC1036a0.f(parcel);
                B(j7, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                M5 m57 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                String strW = w(m57);
                parcel2.writeNoException();
                parcel2.writeString(strW);
                return true;
            case 12:
                C1383e c1383e = (C1383e) AbstractC1036a0.a(parcel, C1383e.CREATOR);
                M5 m58 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                y(c1383e, m58);
                parcel2.writeNoException();
                return true;
            case 13:
                C1383e c1383e2 = (C1383e) AbstractC1036a0.a(parcel, C1383e.CREATOR);
                AbstractC1036a0.f(parcel);
                F(c1383e2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH2 = AbstractC1036a0.h(parcel);
                M5 m59 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                listY = R(string7, string8, zH2, m59);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zH3 = AbstractC1036a0.h(parcel);
                AbstractC1036a0.f(parcel);
                listY = l(string9, string10, string11, zH3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                M5 m510 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                listY = c(string12, string13, m510);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                AbstractC1036a0.f(parcel);
                listY = D(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                M5 m511 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                p(m511);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                M5 m512 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                q(bundle, m512);
                parcel2.writeNoException();
                return true;
            case 20:
                M5 m513 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                r(m513);
                parcel2.writeNoException();
                return true;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                M5 m514 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                C2191b c2191bP = P(m514);
                parcel2.writeNoException();
                AbstractC1036a0.g(parcel2, c2191bP);
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                M5 m515 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                AbstractC1036a0.f(parcel);
                listY = T(m515, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 25:
                M5 m516 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                M(m516);
                parcel2.writeNoException();
                return true;
            case 26:
                M5 m517 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                S(m517);
                parcel2.writeNoException();
                return true;
            case 27:
                M5 m518 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                C(m518);
                parcel2.writeNoException();
                return true;
            case 28:
                Bundle bundle3 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                M5 m519 = (M5) AbstractC1036a0.a(parcel, M5.CREATOR);
                AbstractC1036a0.f(parcel);
                d(bundle3, m519);
                parcel2.writeNoException();
                return true;
        }
    }
}
