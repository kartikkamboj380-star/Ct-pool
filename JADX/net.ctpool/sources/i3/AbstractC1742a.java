package i3;

import com.google.android.gms.common.api.Api;
import j3.InterfaceC1779a;
import k3.InterfaceC1818a;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1742a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api f19922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Api f19923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1779a f19924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1818a f19925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Api.ClientKey f19926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Api.ClientKey f19927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f19928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f19929h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f19926e = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f19927f = clientKey2;
        d dVar = new d();
        f19928g = dVar;
        e eVar = new e();
        f19929h = eVar;
        f19922a = b.f19930a;
        new Api("Auth.CREDENTIALS_API", dVar, clientKey);
        f19923b = new Api("Auth.GOOGLE_SIGN_IN_API", eVar, clientKey2);
        f19924c = b.f19931b;
        f19925d = new l3.h();
    }
}
