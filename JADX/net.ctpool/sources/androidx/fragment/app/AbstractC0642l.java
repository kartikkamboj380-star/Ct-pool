package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642l {
    public Fragment c(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View f(int i7);

    public abstract boolean g();
}
