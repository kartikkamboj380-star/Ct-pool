package n3;

import android.os.Bundle;

/* JADX INFO: renamed from: n3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1902C extends AbstractC1900A {
    C1902C(int i7, int i8, Bundle bundle) {
        super(i7, i8, bundle);
    }

    @Override // n3.AbstractC1900A
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // n3.AbstractC1900A
    final boolean b() {
        return false;
    }
}
