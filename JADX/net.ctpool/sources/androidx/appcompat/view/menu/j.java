package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0582b;
import java.lang.reflect.Method;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceMenuItemC2150b f5496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f5497e;

    private class a extends AbstractC0582b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ActionProvider f5498d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f5498d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0582b
        public boolean a() {
            return this.f5498d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0582b
        public boolean d() {
            return this.f5498d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0582b
        public void e(SubMenu subMenu) {
            this.f5498d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private AbstractC0582b.InterfaceC0147b f5500f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0582b
        public boolean b() {
            return this.f5498d.isVisible();
        }

        @Override // androidx.core.view.AbstractC0582b
        public View c(MenuItem menuItem) {
            return this.f5498d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0582b
        public boolean f() {
            return this.f5498d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0582b
        public void i(AbstractC0582b.InterfaceC0147b interfaceC0147b) {
            this.f5500f = interfaceC0147b;
            this.f5498d.setVisibilityListener(interfaceC0147b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z6) {
            AbstractC0582b.InterfaceC0147b interfaceC0147b = this.f5500f;
            if (interfaceC0147b != null) {
                interfaceC0147b.onActionProviderVisibilityChanged(z6);
            }
        }
    }

    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final CollapsibleActionView f5502m;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f5502m = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f5502m;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f5502m.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f5502m.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f5503a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f5503a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f5503a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f5503a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f5505a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f5505a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f5505a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, InterfaceMenuItemC2150b interfaceMenuItemC2150b) {
        super(context);
        if (interfaceMenuItemC2150b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f5496d = interfaceMenuItemC2150b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f5496d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f5496d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0582b abstractC0582bB = this.f5496d.b();
        if (abstractC0582bB instanceof a) {
            return ((a) abstractC0582bB).f5498d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f5496d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5496d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5496d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5496d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5496d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5496d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5496d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5496d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5496d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5496d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5496d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5496d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5496d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5496d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f5496d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5496d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f5496d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5496d.getTooltipText();
    }

    public void h(boolean z6) {
        try {
            if (this.f5497e == null) {
                this.f5497e = this.f5496d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f5497e.invoke(this.f5496d, Boolean.valueOf(z6));
        } catch (Exception e7) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5496d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5496d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f5496d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f5496d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f5496d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f5496d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f5376a, actionProvider);
        InterfaceMenuItemC2150b interfaceMenuItemC2150b = this.f5496d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC2150b.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i7) {
        this.f5496d.setActionView(i7);
        View actionView = this.f5496d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f5496d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f5496d.setAlphabeticShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.f5496d.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.f5496d.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f5496d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f5496d.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f5496d.setIcon(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5496d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5496d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5496d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f5496d.setNumericShortcut(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5496d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5496d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f5496d.setShortcut(c7, c8);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i7) {
        this.f5496d.setShowAsAction(i7);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i7) {
        this.f5496d.setShowAsActionFlags(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f5496d.setTitle(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5496d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f5496d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        return this.f5496d.setVisible(z6);
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f5496d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f5496d.setAlphabeticShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5496d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f5496d.setNumericShortcut(c7, i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f5496d.setShortcut(c7, c8, i7, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5496d.setTitle(charSequence);
        return this;
    }
}
