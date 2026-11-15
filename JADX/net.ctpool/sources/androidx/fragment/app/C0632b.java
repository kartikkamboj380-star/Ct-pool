package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC0651h;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0632b implements Parcelable {
    public static final Parcelable.Creator<C0632b> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int[] f8094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList f8095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int[] f8096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int[] f8097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f8098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final String f8099r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f8100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f8101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final CharSequence f8102u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final int f8103v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final CharSequence f8104w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final ArrayList f8105x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final ArrayList f8106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final boolean f8107z;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0632b createFromParcel(Parcel parcel) {
            return new C0632b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0632b[] newArray(int i7) {
            return new C0632b[i7];
        }
    }

    C0632b(Parcel parcel) {
        this.f8094m = parcel.createIntArray();
        this.f8095n = parcel.createStringArrayList();
        this.f8096o = parcel.createIntArray();
        this.f8097p = parcel.createIntArray();
        this.f8098q = parcel.readInt();
        this.f8099r = parcel.readString();
        this.f8100s = parcel.readInt();
        this.f8101t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8102u = (CharSequence) creator.createFromParcel(parcel);
        this.f8103v = parcel.readInt();
        this.f8104w = (CharSequence) creator.createFromParcel(parcel);
        this.f8105x = parcel.createStringArrayList();
        this.f8106y = parcel.createStringArrayList();
        this.f8107z = parcel.readInt() != 0;
    }

    private void a(C0631a c0631a) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 >= this.f8094m.length) {
                c0631a.f7963h = this.f8098q;
                c0631a.f7966k = this.f8099r;
                c0631a.f7964i = true;
                c0631a.f7967l = this.f8101t;
                c0631a.f7968m = this.f8102u;
                c0631a.f7969n = this.f8103v;
                c0631a.f7970o = this.f8104w;
                c0631a.f7971p = this.f8105x;
                c0631a.f7972q = this.f8106y;
                c0631a.f7973r = this.f8107z;
                return;
            }
            E.a aVar = new E.a();
            int i9 = i7 + 1;
            aVar.f7975a = this.f8094m[i7];
            if (w.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0631a + " op #" + i8 + " base fragment #" + this.f8094m[i9]);
            }
            aVar.f7982h = AbstractC0651h.c.values()[this.f8096o[i8]];
            aVar.f7983i = AbstractC0651h.c.values()[this.f8097p[i8]];
            int[] iArr = this.f8094m;
            int i10 = i7 + 2;
            if (iArr[i9] == 0) {
                z6 = false;
            }
            aVar.f7977c = z6;
            int i11 = iArr[i10];
            aVar.f7978d = i11;
            int i12 = iArr[i7 + 3];
            aVar.f7979e = i12;
            int i13 = i7 + 5;
            int i14 = iArr[i7 + 4];
            aVar.f7980f = i14;
            i7 += 6;
            int i15 = iArr[i13];
            aVar.f7981g = i15;
            c0631a.f7959d = i11;
            c0631a.f7960e = i12;
            c0631a.f7961f = i14;
            c0631a.f7962g = i15;
            c0631a.f(aVar);
            i8++;
        }
    }

    public C0631a b(w wVar) {
        C0631a c0631a = new C0631a(wVar);
        a(c0631a);
        c0631a.f8092v = this.f8100s;
        for (int i7 = 0; i7 < this.f8095n.size(); i7++) {
            String str = (String) this.f8095n.get(i7);
            if (str != null) {
                ((E.a) c0631a.f7958c.get(i7)).f7976b = wVar.g0(str);
            }
        }
        c0631a.t(1);
        return c0631a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f8094m);
        parcel.writeStringList(this.f8095n);
        parcel.writeIntArray(this.f8096o);
        parcel.writeIntArray(this.f8097p);
        parcel.writeInt(this.f8098q);
        parcel.writeString(this.f8099r);
        parcel.writeInt(this.f8100s);
        parcel.writeInt(this.f8101t);
        TextUtils.writeToParcel(this.f8102u, parcel, 0);
        parcel.writeInt(this.f8103v);
        TextUtils.writeToParcel(this.f8104w, parcel, 0);
        parcel.writeStringList(this.f8105x);
        parcel.writeStringList(this.f8106y);
        parcel.writeInt(this.f8107z ? 1 : 0);
    }

    C0632b(C0631a c0631a) {
        int size = c0631a.f7958c.size();
        this.f8094m = new int[size * 6];
        if (!c0631a.f7964i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8095n = new ArrayList(size);
        this.f8096o = new int[size];
        this.f8097p = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            E.a aVar = (E.a) c0631a.f7958c.get(i8);
            int i9 = i7 + 1;
            this.f8094m[i7] = aVar.f7975a;
            ArrayList arrayList = this.f8095n;
            Fragment fragment = aVar.f7976b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f8094m;
            iArr[i9] = aVar.f7977c ? 1 : 0;
            iArr[i7 + 2] = aVar.f7978d;
            iArr[i7 + 3] = aVar.f7979e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = aVar.f7980f;
            i7 += 6;
            iArr[i10] = aVar.f7981g;
            this.f8096o[i8] = aVar.f7982h.ordinal();
            this.f8097p[i8] = aVar.f7983i.ordinal();
        }
        this.f8098q = c0631a.f7963h;
        this.f8099r = c0631a.f7966k;
        this.f8100s = c0631a.f8092v;
        this.f8101t = c0631a.f7967l;
        this.f8102u = c0631a.f7968m;
        this.f8103v = c0631a.f7969n;
        this.f8104w = c0631a.f7970o;
        this.f8105x = c0631a.f7971p;
        this.f8106y = c0631a.f7972q;
        this.f8107z = c0631a.f7973r;
    }
}
