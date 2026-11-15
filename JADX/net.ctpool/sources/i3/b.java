package i3;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.C0963f;
import j3.InterfaceC1779a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Api f19930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1779a f19931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Api.ClientKey f19932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f19933d;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f19932c = clientKey;
        h hVar = new h();
        f19933d = hVar;
        f19930a = new Api("Auth.PROXY_API", hVar, clientKey);
        f19931b = new C0963f();
    }
}
