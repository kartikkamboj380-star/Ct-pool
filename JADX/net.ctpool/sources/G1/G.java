package G1;

import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f1186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1190g;

    public G(int i7, int i8, SparseIntArray sparseIntArray) {
        this(i7, i8, sparseIntArray, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, -1);
    }

    public G(int i7, int i8, SparseIntArray sparseIntArray, int i9, int i10, int i11) {
        O0.l.i(i7 >= 0 && i8 >= i7);
        this.f1185b = i7;
        this.f1184a = i8;
        this.f1186c = sparseIntArray;
        this.f1187d = i9;
        this.f1188e = i10;
        this.f1190g = i11;
    }
}
