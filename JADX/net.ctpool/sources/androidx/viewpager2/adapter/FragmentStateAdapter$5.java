package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.l;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC0653j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f9204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f9205b;

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(l lVar, AbstractC0651h.b bVar) {
        if (bVar == AbstractC0651h.b.ON_DESTROY) {
            this.f9204a.removeCallbacks(this.f9205b);
            lVar.getLifecycle().c(this);
        }
    }
}
