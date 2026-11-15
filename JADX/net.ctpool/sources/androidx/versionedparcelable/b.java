package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f9196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f9197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9203k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1890a(), new C1890a(), new C1890a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f9197e.writeInt(-1);
        } else {
            this.f9197e.writeInt(bArr.length);
            this.f9197e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f9197e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i7) {
        this.f9197e.writeInt(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f9197e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f9197e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i7 = this.f9201i;
        if (i7 >= 0) {
            int i8 = this.f9196d.get(i7);
            int iDataPosition = this.f9197e.dataPosition();
            this.f9197e.setDataPosition(i8);
            this.f9197e.writeInt(iDataPosition - i8);
            this.f9197e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f9197e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f9202j;
        if (i7 == this.f9198f) {
            i7 = this.f9199g;
        }
        return new b(parcel, iDataPosition, i7, this.f9200h + "  ", this.f9193a, this.f9194b, this.f9195c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f9197e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i7 = this.f9197e.readInt();
        if (i7 < 0) {
            return null;
        }
        byte[] bArr = new byte[i7];
        this.f9197e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f9197e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i7) {
        while (this.f9202j < this.f9199g) {
            int i8 = this.f9203k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f9197e.setDataPosition(this.f9202j);
            int i9 = this.f9197e.readInt();
            this.f9203k = this.f9197e.readInt();
            this.f9202j += i9;
        }
        return this.f9203k == i7;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f9197e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f9197e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f9197e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i7) {
        a();
        this.f9201i = i7;
        this.f9196d.put(i7, this.f9197e.dataPosition());
        E(0);
        E(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z6) {
        this.f9197e.writeInt(z6 ? 1 : 0);
    }

    private b(Parcel parcel, int i7, int i8, String str, C1890a c1890a, C1890a c1890a2, C1890a c1890a3) {
        super(c1890a, c1890a2, c1890a3);
        this.f9196d = new SparseIntArray();
        this.f9201i = -1;
        this.f9203k = -1;
        this.f9197e = parcel;
        this.f9198f = i7;
        this.f9199g = i8;
        this.f9202j = i7;
        this.f9200h = str;
    }
}
