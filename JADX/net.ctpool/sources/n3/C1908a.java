package n3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: n3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1908a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1908a> CREATOR = new C1911d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Intent f21368m;

    public C1908a(Intent intent) {
        this.f21368m = intent;
    }

    public String a0() {
        String stringExtra = this.f21368m.getStringExtra("google.message_id");
        return stringExtra == null ? this.f21368m.getStringExtra("message_id") : stringExtra;
    }

    final Integer n0() {
        if (this.f21368m.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f21368m.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public Intent w() {
        return this.f21368m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f21368m, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
