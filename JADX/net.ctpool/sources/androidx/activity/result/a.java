package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0118a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f4916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Intent f4917n;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    class C0118a implements Parcelable.Creator {
        C0118a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, Intent intent) {
        this.f4916m = i7;
        this.f4917n = intent;
    }

    public static String c(int i7) {
        return i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f4917n;
    }

    public int b() {
        return this.f4916m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f4916m) + ", data=" + this.f4917n + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4916m);
        parcel.writeInt(this.f4917n == null ? 0 : 1);
        Intent intent = this.f4917n;
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    a(Parcel parcel) {
        this.f4916m = parcel.readInt();
        this.f4917n = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
