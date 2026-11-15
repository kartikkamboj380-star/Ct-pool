package x3;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: x3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2223d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api.ClientKey f22844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api.ClientKey f22845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Api.AbstractClientBuilder f22846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Api.AbstractClientBuilder f22847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f22848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f22849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Api f22850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Api f22851h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f22844a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f22845b = clientKey2;
        C2221b c2221b = new C2221b();
        f22846c = c2221b;
        C2222c c2222c = new C2222c();
        f22847d = c2222c;
        f22848e = new Scope(Scopes.PROFILE);
        f22849f = new Scope(Scopes.EMAIL);
        f22850g = new Api("SignIn.API", c2221b, clientKey);
        f22851h = new Api("SignIn.INTERNAL_API", c2222c, clientKey2);
    }
}
