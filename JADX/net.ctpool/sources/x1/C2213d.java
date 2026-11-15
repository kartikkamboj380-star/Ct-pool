package x1;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: x1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2213d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22806a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22807b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap.Config f22813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap.Config f22814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B1.c f22815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f22816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22817l;

    public C2213d() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f22813h = config;
        this.f22814i = config;
    }

    public C2212c a() {
        return new C2212c(this);
    }

    public Bitmap.Config b() {
        return this.f22814i;
    }

    public Bitmap.Config c() {
        return this.f22813h;
    }

    public M1.a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f22816k;
    }

    public B1.c f() {
        return this.f22815j;
    }

    public boolean g() {
        return this.f22811f;
    }

    public boolean h() {
        return this.f22808c;
    }

    public boolean i() {
        return this.f22817l;
    }

    public boolean j() {
        return this.f22812g;
    }

    public int k() {
        return this.f22807b;
    }

    public int l() {
        return this.f22806a;
    }

    public boolean m() {
        return this.f22810e;
    }

    public boolean n() {
        return this.f22809d;
    }
}
