package u4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: renamed from: u4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2135a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2135a> CREATOR = new C2136b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f22536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f22537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f22539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Bundle f22540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f22541r;

    public C2135a(String str, String str2, int i7, long j7, Bundle bundle, Uri uri) {
        this.f22536m = str;
        this.f22537n = str2;
        this.f22538o = i7;
        this.f22539p = j7;
        this.f22540q = bundle;
        this.f22541r = uri;
    }

    public Bundle B0() {
        Bundle bundle = this.f22540q;
        return bundle == null ? new Bundle() : bundle;
    }

    public int H0() {
        return this.f22538o;
    }

    public Uri S0() {
        return this.f22541r;
    }

    public String a0() {
        return this.f22537n;
    }

    public void h1(long j7) {
        this.f22539p = j7;
    }

    public String n0() {
        return this.f22536m;
    }

    public long w() {
        return this.f22539p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        C2136b.c(this, parcel, i7);
    }
}
