package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0599t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f7421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f7422b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f7423c = new HashMap();

    public C0599t(Runnable runnable) {
        this.f7421a = runnable;
    }

    public void a(InterfaceC0601v interfaceC0601v) {
        this.f7422b.add(interfaceC0601v);
        this.f7421a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f7422b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0601v) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f7422b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0601v) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f7422b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0601v) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f7422b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0601v) it.next()).d(menu);
        }
    }

    public void f(InterfaceC0601v interfaceC0601v) {
        this.f7422b.remove(interfaceC0601v);
        androidx.appcompat.app.y.a(this.f7423c.remove(interfaceC0601v));
        this.f7421a.run();
    }
}
