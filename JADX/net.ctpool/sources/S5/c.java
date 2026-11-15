package S5;

import android.graphics.Color;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2954a;

    public c(Bundle bundle) {
        this.f2954a = bundle;
    }

    public Integer a() {
        if (this.f2954a.containsKey("lightColor")) {
            return Integer.valueOf(Color.parseColor(this.f2954a.getString("lightColor")));
        }
        return null;
    }
}
