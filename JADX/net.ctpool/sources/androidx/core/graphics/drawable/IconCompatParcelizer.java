package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f7129a = aVar.p(iconCompat.f7129a, 1);
        iconCompat.f7131c = aVar.j(iconCompat.f7131c, 2);
        iconCompat.f7132d = aVar.r(iconCompat.f7132d, 3);
        iconCompat.f7133e = aVar.p(iconCompat.f7133e, 4);
        iconCompat.f7134f = aVar.p(iconCompat.f7134f, 5);
        iconCompat.f7135g = (ColorStateList) aVar.r(iconCompat.f7135g, 6);
        iconCompat.f7137i = aVar.t(iconCompat.f7137i, 7);
        iconCompat.f7138j = aVar.t(iconCompat.f7138j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.q(aVar.f());
        int i7 = iconCompat.f7129a;
        if (-1 != i7) {
            aVar.F(i7, 1);
        }
        byte[] bArr = iconCompat.f7131c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f7132d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i8 = iconCompat.f7133e;
        if (i8 != 0) {
            aVar.F(i8, 4);
        }
        int i9 = iconCompat.f7134f;
        if (i9 != 0) {
            aVar.F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f7135g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f7137i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f7138j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
