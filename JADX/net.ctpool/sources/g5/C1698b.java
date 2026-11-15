package g5;

import com.facebook.react.bridge.WritableMap;
import h5.InterfaceC1737a;

/* JADX INFO: renamed from: g5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1698b implements InterfaceC1737a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WritableMap f19531b;

    public C1698b(String str, WritableMap writableMap) {
        this.f19530a = str;
        this.f19531b = writableMap;
    }

    @Override // h5.InterfaceC1737a
    public WritableMap a() {
        return this.f19531b;
    }

    @Override // h5.InterfaceC1737a
    public String b() {
        return this.f19530a;
    }
}
