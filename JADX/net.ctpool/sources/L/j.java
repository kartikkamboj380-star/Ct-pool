package L;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Fragment f1950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f1951o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Fragment fragment, Fragment fragment2, int i7) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i7 + " for fragment " + fragment);
        w5.k.f(fragment, "fragment");
        w5.k.f(fragment2, "targetFragment");
        this.f1950n = fragment2;
        this.f1951o = i7;
    }
}
