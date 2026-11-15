package g0;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
class O implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowId f19339a;

    O(View view) {
        this.f19339a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof O) && ((O) obj).f19339a.equals(this.f19339a);
    }

    public int hashCode() {
        return this.f19339a.hashCode();
    }
}
