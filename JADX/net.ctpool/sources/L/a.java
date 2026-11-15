package L;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1931n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        w5.k.f(fragment, "fragment");
        w5.k.f(str, "previousFragmentId");
        this.f1931n = str;
    }
}
