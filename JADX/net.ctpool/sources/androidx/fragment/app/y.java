package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f8257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f8258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    C0632b[] f8259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f8260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    String f8261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f8262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList f8263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ArrayList f8264t;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i7) {
            return new y[i7];
        }
    }

    public y() {
        this.f8261q = null;
        this.f8262r = new ArrayList();
        this.f8263s = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8257m);
        parcel.writeStringList(this.f8258n);
        parcel.writeTypedArray(this.f8259o, i7);
        parcel.writeInt(this.f8260p);
        parcel.writeString(this.f8261q);
        parcel.writeStringList(this.f8262r);
        parcel.writeTypedList(this.f8263s);
        parcel.writeTypedList(this.f8264t);
    }

    public y(Parcel parcel) {
        this.f8261q = null;
        this.f8262r = new ArrayList();
        this.f8263s = new ArrayList();
        this.f8257m = parcel.createStringArrayList();
        this.f8258n = parcel.createStringArrayList();
        this.f8259o = (C0632b[]) parcel.createTypedArray(C0632b.CREATOR);
        this.f8260p = parcel.readInt();
        this.f8261q = parcel.readString();
        this.f8262r = parcel.createStringArrayList();
        this.f8263s = parcel.createTypedArrayList(C0633c.CREATOR);
        this.f8264t = parcel.createTypedArrayList(w.k.CREATOR);
    }
}
