package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n.g f5377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n.g f5378c;

    c(Context context) {
        this.f5376a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2150b)) {
            return menuItem;
        }
        InterfaceMenuItemC2150b interfaceMenuItemC2150b = (InterfaceMenuItemC2150b) menuItem;
        if (this.f5377b == null) {
            this.f5377b = new n.g();
        }
        MenuItem menuItem2 = (MenuItem) this.f5377b.get(interfaceMenuItemC2150b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f5376a, interfaceMenuItemC2150b);
        this.f5377b.put(interfaceMenuItemC2150b, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        n.g gVar = this.f5377b;
        if (gVar != null) {
            gVar.clear();
        }
        n.g gVar2 = this.f5378c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i7) {
        if (this.f5377b == null) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f5377b.size()) {
            if (((InterfaceMenuItemC2150b) this.f5377b.j(i8)).getGroupId() == i7) {
                this.f5377b.l(i8);
                i8--;
            }
            i8++;
        }
    }

    final void g(int i7) {
        if (this.f5377b == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f5377b.size(); i8++) {
            if (((InterfaceMenuItemC2150b) this.f5377b.j(i8)).getItemId() == i7) {
                this.f5377b.l(i8);
                return;
            }
        }
    }
}
