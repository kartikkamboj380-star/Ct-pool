package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes.dex */
public class r extends g implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private g f5545B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private i f5546C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.f5545B = gVar;
        this.f5546C = iVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public g D() {
        return this.f5545B.D();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean F() {
        return this.f5545B.F();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean G() {
        return this.f5545B.G();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean H() {
        return this.f5545B.H();
    }

    @Override // androidx.appcompat.view.menu.g
    public void R(g.a aVar) {
        this.f5545B.R(aVar);
    }

    public Menu e0() {
        return this.f5545B;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean f(i iVar) {
        return this.f5545B.f(iVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f5546C;
    }

    @Override // androidx.appcompat.view.menu.g
    boolean h(g gVar, MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.f5545B.h(gVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean k(i iVar) {
        return this.f5545B.k(iVar);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f5545B.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.U(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.X(i7);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i7) {
        this.f5546C.setIcon(i7);
        return this;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f5545B.setQwertyMode(z6);
    }

    @Override // androidx.appcompat.view.menu.g
    public String t() {
        i iVar = this.f5546C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f5546C.setIcon(drawable);
        return this;
    }
}
