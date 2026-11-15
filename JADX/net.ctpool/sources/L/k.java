package L;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment, boolean z6) {
        super(fragment, "Attempting to set user visible hint to " + z6 + " for fragment " + fragment);
        w5.k.f(fragment, "fragment");
        this.f1952n = z6;
    }
}
