package L;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Fragment f1953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        w5.k.f(fragment, "fragment");
        this.f1953m = fragment;
    }

    public final Fragment a() {
        return this.f1953m;
    }
}
