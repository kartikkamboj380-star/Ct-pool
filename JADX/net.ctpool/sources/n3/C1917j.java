package n3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: n3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1917j implements Parcelable.Creator {
    C1917j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C1919l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1919l[i7];
    }
}
