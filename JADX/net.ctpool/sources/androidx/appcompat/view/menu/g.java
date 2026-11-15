package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC0582b;
import androidx.core.view.J;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import v.InterfaceMenuC2149a;

/* JADX INFO: loaded from: classes.dex */
public class g implements InterfaceMenuC2149a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f5433A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f5438e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f5446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f5447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f5448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f5449p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private i f5457x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f5459z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5445l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5450q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f5451r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5452s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5453t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5454u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f5455v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f5456w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5458y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f5439f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f5440g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5441h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f5442i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f5443j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5444k = true;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f5434a = context;
        this.f5435b = context.getResources();
        b0(true);
    }

    private static int B(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = f5433A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i7, boolean z6) {
        if (i7 < 0 || i7 >= this.f5439f.size()) {
            return;
        }
        this.f5439f.remove(i7);
        if (z6) {
            K(true);
        }
    }

    private void W(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f5449p = view;
            this.f5447n = null;
            this.f5448o = null;
        } else {
            if (i7 > 0) {
                this.f5447n = resourcesC.getText(i7);
            } else if (charSequence != null) {
                this.f5447n = charSequence;
            }
            if (i8 > 0) {
                this.f5448o = androidx.core.content.b.e(u(), i8);
            } else if (drawable != null) {
                this.f5448o = drawable;
            }
            this.f5449p = null;
        }
        K(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b0(boolean z6) {
        boolean z7;
        if (z6) {
            z7 = this.f5435b.getConfiguration().keyboard != 1 && J.e(ViewConfiguration.get(this.f5434a), this.f5434a);
        }
        this.f5437d = z7;
    }

    private i g(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new i(this, i7, i8, i9, i10, charSequence, i11);
    }

    private void i(boolean z6) {
        if (this.f5456w.isEmpty()) {
            return;
        }
        d0();
        for (WeakReference weakReference : this.f5456w) {
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f5456w.remove(weakReference);
            } else {
                mVar.d(z6);
            }
        }
        c0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.f5456w.isEmpty()) {
            return false;
        }
        boolean zK = mVar != null ? mVar.k(rVar) : false;
        for (WeakReference weakReference : this.f5456w) {
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null) {
                this.f5456w.remove(weakReference);
            } else if (!zK) {
                zK = mVar2.k(rVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((i) arrayList.get(size)).f() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f5453t;
    }

    Resources C() {
        return this.f5435b;
    }

    public g D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f5441h) {
            return this.f5440g;
        }
        this.f5440g.clear();
        int size = this.f5439f.size();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f5439f.get(i7);
            if (iVar.isVisible()) {
                this.f5440g.add(iVar);
            }
        }
        this.f5441h = false;
        this.f5444k = true;
        return this.f5440g;
    }

    public boolean F() {
        return this.f5458y;
    }

    boolean G() {
        return this.f5436c;
    }

    public boolean H() {
        return this.f5437d;
    }

    void I(i iVar) {
        this.f5444k = true;
        K(true);
    }

    void J(i iVar) {
        this.f5441h = true;
        K(true);
    }

    public void K(boolean z6) {
        if (this.f5450q) {
            this.f5451r = true;
            if (z6) {
                this.f5452s = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f5441h = true;
            this.f5444k = true;
        }
        i(z6);
    }

    public boolean L(MenuItem menuItem, int i7) {
        return M(menuItem, null, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[PHI: r1
      0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean M(MenuItem menuItem, m mVar, int i7) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean zK = iVar.k();
        AbstractC0582b abstractC0582bB = iVar.b();
        boolean z6 = abstractC0582bB != null && abstractC0582bB.a();
        if (iVar.j()) {
            zK |= iVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z6) {
            if ((i7 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z6) {
                abstractC0582bB.e(rVar);
            }
            zK |= j(rVar, mVar);
            if (!zK) {
            }
        } else if ((i7 & 1) == 0) {
        }
        return zK;
    }

    public void O(m mVar) {
        for (WeakReference weakReference : this.f5456w) {
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f5456w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (menuItemFindItem = findItem(i8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f5438e = aVar;
    }

    public g S(int i7) {
        this.f5445l = i7;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f5439f.size();
        d0();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f5439f.get(i7);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    protected g U(int i7) {
        W(0, null, i7, null, null);
        return this;
    }

    protected g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected g X(int i7) {
        W(i7, null, 0, null, null);
        return this;
    }

    protected g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i7, int i8, int i9, CharSequence charSequence) {
        int iB = B(i9);
        i iVarG = g(i7, i8, i9, iB, charSequence, this.f5445l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f5446m;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f5439f;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z6) {
        this.f5459z = z6;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return a(0, 0, 0, this.f5435b.getString(i7));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f5434a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f5435b.getString(i7));
    }

    public void b(m mVar) {
        c(mVar, this.f5434a);
    }

    public void c(m mVar, Context context) {
        this.f5456w.add(new WeakReference(mVar));
        mVar.i(context, this);
        this.f5444k = true;
    }

    public void c0() {
        this.f5450q = false;
        if (this.f5451r) {
            this.f5451r = false;
            K(this.f5452s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.f5457x;
        if (iVar != null) {
            f(iVar);
        }
        this.f5439f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f5448o = null;
        this.f5447n = null;
        this.f5449p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f5438e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f5450q) {
            return;
        }
        this.f5450q = true;
        this.f5451r = false;
        this.f5452s = false;
    }

    public final void e(boolean z6) {
        if (this.f5454u) {
            return;
        }
        this.f5454u = true;
        for (WeakReference weakReference : this.f5456w) {
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f5456w.remove(weakReference);
            } else {
                mVar.c(this, z6);
            }
        }
        this.f5454u = false;
    }

    public boolean f(i iVar) {
        boolean zF = false;
        if (!this.f5456w.isEmpty() && this.f5457x == iVar) {
            d0();
            for (WeakReference weakReference : this.f5456w) {
                m mVar = (m) weakReference.get();
                if (mVar != null) {
                    zF = mVar.f(this, iVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f5456w.remove(weakReference);
                }
            }
            c0();
            if (zF) {
                this.f5457x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) this.f5439f.get(i8);
            if (iVar.getItemId() == i7) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return (MenuItem) this.f5439f.get(i7);
    }

    boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f5438e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f5459z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((i) this.f5439f.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return p(i7, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean zG = false;
        if (this.f5456w.isEmpty()) {
            return false;
        }
        d0();
        for (WeakReference weakReference : this.f5456w) {
            m mVar = (m) weakReference.get();
            if (mVar != null) {
                zG = mVar.g(this, iVar);
                if (zG) {
                    break;
                }
            } else {
                this.f5456w.remove(weakReference);
            }
        }
        c0();
        if (zG) {
            this.f5457x = iVar;
        }
        return zG;
    }

    public int l(int i7) {
        return m(i7, 0);
    }

    public int m(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (((i) this.f5439f.get(i8)).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public int o(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((i) this.f5439f.get(i8)).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    i p(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f5455v;
        arrayList.clear();
        q(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean zG = G();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) arrayList.get(i8);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i7 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return L(findItem(i7), i8);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        i iVarP = p(i7, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i8) : false;
        if ((i8 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List list, int i7, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f5439f.size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = (i) this.f5439f.get(i8);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i7, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i7 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f5444k) {
            boolean zE = false;
            for (WeakReference weakReference : this.f5456w) {
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f5456w.remove(weakReference);
                } else {
                    zE |= mVar.e();
                }
            }
            if (zE) {
                this.f5442i.clear();
                this.f5443j.clear();
                int size = arrayListE.size();
                for (int i7 = 0; i7 < size; i7++) {
                    i iVar = (i) arrayListE.get(i7);
                    (iVar.l() ? this.f5442i : this.f5443j).add(iVar);
                }
            } else {
                this.f5442i.clear();
                this.f5443j.clear();
                this.f5443j.addAll(E());
            }
            this.f5444k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int iL = l(i7);
        if (iL >= 0) {
            int size = this.f5439f.size() - iL;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || ((i) this.f5439f.get(iL)).getGroupId() != i7) {
                    break;
                }
                N(iL, false);
                i8 = i9;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        N(o(i7), true);
    }

    public ArrayList s() {
        r();
        return this.f5442i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z6, boolean z7) {
        int size = this.f5439f.size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) this.f5439f.get(i8);
            if (iVar.getGroupId() == i7) {
                iVar.t(z7);
                iVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f5458y = z6;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z6) {
        int size = this.f5439f.size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) this.f5439f.get(i8);
            if (iVar.getGroupId() == i7) {
                iVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z6) {
        int size = this.f5439f.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = (i) this.f5439f.get(i8);
            if (iVar.getGroupId() == i7 && iVar.y(z6)) {
                z7 = true;
            }
        }
        if (z7) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f5436c = z6;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f5439f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f5434a;
    }

    public i v() {
        return this.f5457x;
    }

    public Drawable w() {
        return this.f5448o;
    }

    public CharSequence x() {
        return this.f5447n;
    }

    public View y() {
        return this.f5449p;
    }

    public ArrayList z() {
        r();
        return this.f5443j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f5435b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f5435b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        i iVar = (i) a(i7, i8, i9, charSequence);
        r rVar = new r(this.f5434a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
