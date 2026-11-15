package z;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2252a implements Parcelable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Parcelable f23233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC2252a f23232n = new C0331a();
    public static final Parcelable.Creator<AbstractC2252a> CREATOR = new b();

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    class C0331a extends AbstractC2252a {
        C0331a() {
            super((C0331a) null);
        }
    }

    /* JADX INFO: renamed from: z.a$b */
    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC2252a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC2252a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC2252a.f23232n;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC2252a[] newArray(int i7) {
            return new AbstractC2252a[i7];
        }
    }

    private AbstractC2252a() {
        this.f23233m = null;
    }

    public final Parcelable a() {
        return this.f23233m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f23233m, i7);
    }

    protected AbstractC2252a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f23233m = parcelable == null ? f23232n : parcelable;
    }

    protected AbstractC2252a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f23233m = parcelable == f23232n ? null : parcelable;
    }

    /* synthetic */ AbstractC2252a(C0331a c0331a) {
        this();
    }
}
