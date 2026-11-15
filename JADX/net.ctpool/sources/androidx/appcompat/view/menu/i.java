package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.AbstractC0582b;
import e.AbstractC1616h;
import f.AbstractC1641a;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceMenuItemC2150b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f5464A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC0582b f5465B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f5466C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f5468E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f5473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f5474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f5475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f5476h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f5478j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f5480l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    g f5482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f5483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f5484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f5485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f5486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f5487s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f5494z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5477i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5479k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5481m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f5488t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f5489u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5490v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f5491w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5492x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5493y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f5467D = false;

    class a implements AbstractC0582b.InterfaceC0147b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0582b.InterfaceC0147b
        public void onActionProviderVisibilityChanged(boolean z6) {
            i iVar = i.this;
            iVar.f5482n.J(iVar);
        }
    }

    i(g gVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f5482n = gVar;
        this.f5469a = i8;
        this.f5470b = i7;
        this.f5471c = i9;
        this.f5472d = i10;
        this.f5473e = charSequence;
        this.f5494z = i11;
    }

    private static void d(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f5492x && (this.f5490v || this.f5491w)) {
            drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
            if (this.f5490v) {
                androidx.core.graphics.drawable.a.i(drawable, this.f5488t);
            }
            if (this.f5491w) {
                androidx.core.graphics.drawable.a.j(drawable, this.f5489u);
            }
            this.f5492x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f5482n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f5494z & 4) == 4;
    }

    @Override // v.InterfaceMenuItemC2150b
    public InterfaceMenuItemC2150b a(AbstractC0582b abstractC0582b) {
        AbstractC0582b abstractC0582b2 = this.f5465B;
        if (abstractC0582b2 != null) {
            abstractC0582b2.g();
        }
        this.f5464A = null;
        this.f5465B = abstractC0582b;
        this.f5482n.K(true);
        AbstractC0582b abstractC0582b3 = this.f5465B;
        if (abstractC0582b3 != null) {
            abstractC0582b3.i(new a());
        }
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b
    public AbstractC0582b b() {
        return this.f5465B;
    }

    public void c() {
        this.f5482n.I(this);
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f5494z & 8) == 0) {
            return false;
        }
        if (this.f5464A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5466C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5482n.f(this);
        }
        return false;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f5466C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5482n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f5472d;
    }

    char g() {
        return this.f5482n.G() ? this.f5478j : this.f5476h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public View getActionView() {
        View view = this.f5464A;
        if (view != null) {
            return view;
        }
        AbstractC0582b abstractC0582b = this.f5465B;
        if (abstractC0582b == null) {
            return null;
        }
        View viewC = abstractC0582b.c(this);
        this.f5464A = viewC;
        return viewC;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f5479k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f5478j;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f5486r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f5470b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f5480l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f5481m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC1641a.b(this.f5482n.u(), this.f5481m);
        this.f5481m = 0;
        this.f5480l = drawableB;
        return e(drawableB);
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f5488t;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f5489u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f5475g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f5469a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f5468E;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f5477i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f5476h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f5471c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f5483o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f5473e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5474f;
        return charSequence != null ? charSequence : this.f5473e;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f5487s;
    }

    String h() {
        int i7;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f5482n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f5482n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC1616h.f18895m));
        }
        int i8 = this.f5482n.G() ? this.f5479k : this.f5477i;
        d(sb, i8, 65536, resources.getString(AbstractC1616h.f18891i));
        d(sb, i8, 4096, resources.getString(AbstractC1616h.f18887e));
        d(sb, i8, 2, resources.getString(AbstractC1616h.f18886d));
        d(sb, i8, 1, resources.getString(AbstractC1616h.f18892j));
        d(sb, i8, 4, resources.getString(AbstractC1616h.f18894l));
        d(sb, i8, 8, resources.getString(AbstractC1616h.f18890h));
        if (cG == '\b') {
            i7 = AbstractC1616h.f18888f;
        } else if (cG == '\n') {
            i7 = AbstractC1616h.f18889g;
        } else {
            if (cG != ' ') {
                sb.append(cG);
                return sb.toString();
            }
            i7 = AbstractC1616h.f18893k;
        }
        sb.append(resources.getString(i7));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f5483o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f5467D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f5493y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f5493y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f5493y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0582b abstractC0582b = this.f5465B;
        return (abstractC0582b == null || !abstractC0582b.f()) ? (this.f5493y & 8) == 0 : (this.f5493y & 8) == 0 && this.f5465B.b();
    }

    public boolean j() {
        AbstractC0582b abstractC0582b;
        if ((this.f5494z & 8) == 0) {
            return false;
        }
        if (this.f5464A == null && (abstractC0582b = this.f5465B) != null) {
            this.f5464A = abstractC0582b.c(this);
        }
        return this.f5464A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f5485q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f5482n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f5484p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f5475g != null) {
            try {
                this.f5482n.u().startActivity(this.f5475g);
                return true;
            } catch (ActivityNotFoundException e7) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
            }
        }
        AbstractC0582b abstractC0582b = this.f5465B;
        return abstractC0582b != null && abstractC0582b.d();
    }

    public boolean l() {
        return (this.f5493y & 32) == 32;
    }

    public boolean m() {
        return (this.f5493y & 4) != 0;
    }

    public boolean n() {
        return (this.f5494z & 1) == 1;
    }

    public boolean o() {
        return (this.f5494z & 2) == 2;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setActionView(int i7) {
        Context contextU = this.f5482n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i7, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setActionView(View view) {
        int i7;
        this.f5464A = view;
        this.f5465B = null;
        if (view != null && view.getId() == -1 && (i7 = this.f5469a) > 0) {
            view.setId(i7);
        }
        this.f5482n.I(this);
        return this;
    }

    public void r(boolean z6) {
        this.f5467D = z6;
        this.f5482n.K(false);
    }

    void s(boolean z6) {
        int i7 = this.f5493y;
        int i8 = (z6 ? 2 : 0) | (i7 & (-3));
        this.f5493y = i8;
        if (i7 != i8) {
            this.f5482n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7) {
        if (this.f5478j == c7) {
            return this;
        }
        this.f5478j = Character.toLowerCase(c7);
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z6) {
        int i7 = this.f5493y;
        int i8 = (z6 ? 1 : 0) | (i7 & (-2));
        this.f5493y = i8;
        if (i7 != i8) {
            this.f5482n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z6) {
        if ((this.f5493y & 4) != 0) {
            this.f5482n.T(this);
        } else {
            s(z6);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z6) {
        this.f5493y = z6 ? this.f5493y | 16 : this.f5493y & (-17);
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i7) {
        this.f5480l = null;
        this.f5481m = i7;
        this.f5492x = true;
        this.f5482n.K(false);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5488t = colorStateList;
        this.f5490v = true;
        this.f5492x = true;
        this.f5482n.K(false);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5489u = mode;
        this.f5491w = true;
        this.f5492x = true;
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f5475g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c7) {
        if (this.f5476h == c7) {
            return this;
        }
        this.f5476h = c7;
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5466C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5485q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8) {
        this.f5476h = c7;
        this.f5478j = Character.toLowerCase(c8);
        this.f5482n.K(false);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f5494z = i7;
        this.f5482n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i7) {
        return setTitle(this.f5482n.u().getString(i7));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5474f = charSequence;
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z6) {
        if (y(z6)) {
            this.f5482n.J(this);
        }
        return this;
    }

    public void t(boolean z6) {
        this.f5493y = (z6 ? 4 : 0) | (this.f5493y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f5473e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z6) {
        this.f5493y = z6 ? this.f5493y | 32 : this.f5493y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f5468E = contextMenuInfo;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC2150b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    public void x(r rVar) {
        this.f5483o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z6) {
        int i7 = this.f5493y;
        int i8 = (z6 ? 0 : 8) | (i7 & (-9));
        this.f5493y = i8;
        return i7 != i8;
    }

    public boolean z() {
        return this.f5482n.A();
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c7, int i7) {
        if (this.f5478j == c7 && this.f5479k == i7) {
            return this;
        }
        this.f5478j = Character.toLowerCase(c7);
        this.f5479k = KeyEvent.normalizeMetaState(i7);
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC2150b setContentDescription(CharSequence charSequence) {
        this.f5486r = charSequence;
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f5481m = 0;
        this.f5480l = drawable;
        this.f5492x = true;
        this.f5482n.K(false);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c7, int i7) {
        if (this.f5476h == c7 && this.f5477i == i7) {
            return this;
        }
        this.f5476h = c7;
        this.f5477i = KeyEvent.normalizeMetaState(i7);
        this.f5482n.K(false);
        return this;
    }

    @Override // v.InterfaceMenuItemC2150b, android.view.MenuItem
    public MenuItem setShortcut(char c7, char c8, int i7, int i8) {
        this.f5476h = c7;
        this.f5477i = KeyEvent.normalizeMetaState(i7);
        this.f5478j = Character.toLowerCase(c8);
        this.f5479k = KeyEvent.normalizeMetaState(i8);
        this.f5482n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f5473e = charSequence;
        this.f5482n.K(false);
        r rVar = this.f5483o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC2150b setTooltipText(CharSequence charSequence) {
        this.f5487s = charSequence;
        this.f5482n.K(false);
        return this;
    }
}
