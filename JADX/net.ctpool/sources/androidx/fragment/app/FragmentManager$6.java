package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC0651h f8031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f8032c;

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
        if (bVar == AbstractC0651h.b.ON_START && ((Bundle) this.f8032c.f8225k.get(this.f8030a)) != null) {
            throw null;
        }
        if (bVar == AbstractC0651h.b.ON_DESTROY) {
            this.f8031b.c(this);
            this.f8032c.f8226l.remove(this.f8030a);
        }
    }
}
