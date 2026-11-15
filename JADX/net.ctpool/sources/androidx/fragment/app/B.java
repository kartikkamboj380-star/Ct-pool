package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f7931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f7932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f7933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int f7934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f7935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final String f7936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f7937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f7938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final boolean f7939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Bundle f7940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final boolean f7941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f7942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Bundle f7943y;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public B createFromParcel(Parcel parcel) {
            return new B(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public B[] newArray(int i7) {
            return new B[i7];
        }
    }

    B(Parcel parcel) {
        this.f7931m = parcel.readString();
        this.f7932n = parcel.readString();
        this.f7933o = parcel.readInt() != 0;
        this.f7934p = parcel.readInt();
        this.f7935q = parcel.readInt();
        this.f7936r = parcel.readString();
        this.f7937s = parcel.readInt() != 0;
        this.f7938t = parcel.readInt() != 0;
        this.f7939u = parcel.readInt() != 0;
        this.f7940v = parcel.readBundle();
        this.f7941w = parcel.readInt() != 0;
        this.f7943y = parcel.readBundle();
        this.f7942x = parcel.readInt();
    }

    Fragment a(n nVar, ClassLoader classLoader) {
        Fragment fragmentA = nVar.a(classLoader, this.f7931m);
        Bundle bundle = this.f7940v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(this.f7940v);
        fragmentA.mWho = this.f7932n;
        fragmentA.mFromLayout = this.f7933o;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f7934p;
        fragmentA.mContainerId = this.f7935q;
        fragmentA.mTag = this.f7936r;
        fragmentA.mRetainInstance = this.f7937s;
        fragmentA.mRemoving = this.f7938t;
        fragmentA.mDetached = this.f7939u;
        fragmentA.mHidden = this.f7941w;
        fragmentA.mMaxState = AbstractC0651h.c.values()[this.f7942x];
        Bundle bundle2 = this.f7943y;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        fragmentA.mSavedFragmentState = bundle2;
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f7931m);
        sb.append(" (");
        sb.append(this.f7932n);
        sb.append(")}:");
        if (this.f7933o) {
            sb.append(" fromLayout");
        }
        if (this.f7935q != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f7935q));
        }
        String str = this.f7936r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f7936r);
        }
        if (this.f7937s) {
            sb.append(" retainInstance");
        }
        if (this.f7938t) {
            sb.append(" removing");
        }
        if (this.f7939u) {
            sb.append(" detached");
        }
        if (this.f7941w) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7931m);
        parcel.writeString(this.f7932n);
        parcel.writeInt(this.f7933o ? 1 : 0);
        parcel.writeInt(this.f7934p);
        parcel.writeInt(this.f7935q);
        parcel.writeString(this.f7936r);
        parcel.writeInt(this.f7937s ? 1 : 0);
        parcel.writeInt(this.f7938t ? 1 : 0);
        parcel.writeInt(this.f7939u ? 1 : 0);
        parcel.writeBundle(this.f7940v);
        parcel.writeInt(this.f7941w ? 1 : 0);
        parcel.writeBundle(this.f7943y);
        parcel.writeInt(this.f7942x);
    }

    B(Fragment fragment) {
        this.f7931m = fragment.getClass().getName();
        this.f7932n = fragment.mWho;
        this.f7933o = fragment.mFromLayout;
        this.f7934p = fragment.mFragmentId;
        this.f7935q = fragment.mContainerId;
        this.f7936r = fragment.mTag;
        this.f7937s = fragment.mRetainInstance;
        this.f7938t = fragment.mRemoving;
        this.f7939u = fragment.mDetached;
        this.f7940v = fragment.mArguments;
        this.f7941w = fragment.mHidden;
        this.f7942x = fragment.mMaxState.ordinal();
    }
}
