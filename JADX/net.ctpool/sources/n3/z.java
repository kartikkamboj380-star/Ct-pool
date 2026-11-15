package n3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class z extends AbstractC1900A {
    z(int i7, int i8, Bundle bundle) {
        super(i7, i8, bundle);
    }

    @Override // n3.AbstractC1900A
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new C1901B(4, "Invalid response to one way request", null));
        }
    }

    @Override // n3.AbstractC1900A
    final boolean b() {
        return true;
    }
}
