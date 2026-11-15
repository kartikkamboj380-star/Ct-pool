package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0633c implements Parcelable {
    public static final Parcelable.Creator<C0633c> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final List f8108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f8109n;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0633c createFromParcel(Parcel parcel) {
            return new C0633c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0633c[] newArray(int i7) {
            return new C0633c[i7];
        }
    }

    C0633c(Parcel parcel) {
        this.f8108m = parcel.createStringArrayList();
        this.f8109n = parcel.createTypedArrayList(C0632b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8108m);
        parcel.writeTypedList(this.f8109n);
    }
}
