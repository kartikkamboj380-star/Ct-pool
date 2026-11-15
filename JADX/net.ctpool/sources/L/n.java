package L;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewGroup f1954n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        w5.k.f(fragment, "fragment");
        w5.k.f(viewGroup, "container");
        this.f1954n = viewGroup;
    }
}
