package L;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewGroup f1949n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        w5.k.f(fragment, "fragment");
        this.f1949n = viewGroup;
    }
}
