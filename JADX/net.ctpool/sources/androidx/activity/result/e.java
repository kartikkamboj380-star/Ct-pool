package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final IntentSender f4918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Intent f4919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f4920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f4921p;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IntentSender f4922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f4923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4925d;

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public e a() {
            return new e(this.f4922a, this.f4923b, this.f4924c, this.f4925d);
        }

        public b b(Intent intent) {
            this.f4923b = intent;
            return this;
        }

        public b c(int i7, int i8) {
            this.f4925d = i7;
            this.f4924c = i8;
            return this;
        }

        public b(IntentSender intentSender) {
            this.f4922a = intentSender;
        }
    }

    e(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f4918m = intentSender;
        this.f4919n = intent;
        this.f4920o = i7;
        this.f4921p = i8;
    }

    public Intent a() {
        return this.f4919n;
    }

    public int b() {
        return this.f4920o;
    }

    public int c() {
        return this.f4921p;
    }

    public IntentSender d() {
        return this.f4918m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4918m, i7);
        parcel.writeParcelable(this.f4919n, i7);
        parcel.writeInt(this.f4920o);
        parcel.writeInt(this.f4921p);
    }

    e(Parcel parcel) {
        this.f4918m = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f4919n = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f4920o = parcel.readInt();
        this.f4921p = parcel.readInt();
    }
}
