package u4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import t4.InterfaceC2069d;

/* JADX INFO: renamed from: u4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2144j extends AbstractSafeParcelable implements InterfaceC2069d {
    public static final Parcelable.Creator<C2144j> CREATOR = new C2145k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uri f22557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f22558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f22559o;

    /* JADX INFO: renamed from: u4.j$a */
    public static class a extends AbstractSafeParcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2146l();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f22560m;

        public a(String str) {
            this.f22560m = str;
        }

        public String w() {
            return this.f22560m;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            C2146l.c(this, parcel, i7);
        }
    }

    public C2144j(Uri uri, Uri uri2, List list) {
        this.f22557m = uri;
        this.f22558n = uri2;
        this.f22559o = list == null ? new ArrayList() : list;
    }

    public List a0() {
        return this.f22559o;
    }

    @Override // t4.InterfaceC2069d
    public Uri f() {
        return this.f22557m;
    }

    public Uri w() {
        return this.f22558n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        C2145k.c(this, parcel, i7);
    }
}
