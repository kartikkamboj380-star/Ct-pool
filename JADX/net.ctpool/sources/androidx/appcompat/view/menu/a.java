package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC0582b;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: loaded from: classes.dex */
public class a implements InterfaceMenuItemC2150b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f5349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f5350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f5351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f5352g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f5354i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f5356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f5357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f5358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f5359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f5360o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5353h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5355j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f5361p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f5362q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5363r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5364s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5365t = 16;

    public a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f5357l = context;
        this.f5346a = i8;
        this.f5347b = i7;
        this.f5348c = i10;
        this.f5349d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f5356k;
        if (drawable != null) {
            if (this.f5363r || this.f5364s) {
                Drawable drawableL = androidx.core.graphics.drawable.a.l(drawable);
                this.f5356k = drawableL;
                Drawable drawableMutate = drawableL.mutate();
                this.f5356k = drawableMutate;
                if (this.f5363r) {
                    androidx.core.graphics.drawable.a.i(drawableMutate, this.f5361p);
                }
                if (this.f5364s) {
                    androidx.core.graphics.drawable.a.j(this.f5356k, this.f5362q);
                }
            }
        }
    }

    @Override // v.InterfaceMenuItemC2150b
    public InterfaceMenuItemC2150b a(AbstractC0582b abstractC0582b) {
        throw new UnsupportedOperationException();
    }

    @Override // v.InterfaceMenuItemC2150b
    public AbstractC0582b b() {
        return null;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5355j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5354i;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5359n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5347b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f5356k;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5361p;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5362q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5351f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5346a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5353h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5352g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5348c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5349d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5350e;
        return charSequence != null ? charSequence : this.f5349d;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5360o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f5365t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f5365t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f5365t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f5365t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        this.f5354i = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        this.f5365t = (z6 ? 1 : 0) | (this.f5365t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        this.f5365t = (z6 ? 2 : 0) | (this.f5365t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f5365t = (z6 ? 16 : 0) | (this.f5365t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f5356k = androidx.core.content.b.e(this.f5357l, i7);
        c();
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5361p = colorStateList;
        this.f5363r = true;
        c();
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5362q = mode;
        this.f5364s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5351f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        this.f5352g = c7;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5358m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f5352g = c7;
        this.f5354i = Character.toLowerCase(c8);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        this.f5349d = this.f5357l.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5350e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        this.f5365t = (this.f5365t & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        this.f5354i = Character.toLowerCase(c7);
        this.f5355j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC2150b setContentDescription(CharSequence charSequence) {
        this.f5359n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5356k = drawable;
        c();
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        this.f5352g = c7;
        this.f5353h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f5352g = c7;
        this.f5353h = KeyEvent.normalizeMetaState(i7);
        this.f5354i = Character.toLowerCase(c8);
        this.f5355j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5349d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC2150b setTooltipText(CharSequence charSequence) {
        this.f5360o = charSequence;
        return this;
    }
}
