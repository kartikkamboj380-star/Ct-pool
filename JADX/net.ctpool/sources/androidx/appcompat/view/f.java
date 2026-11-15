package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;
import v.InterfaceMenuC2149a;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f5257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f5258b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f5259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f5260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f5261c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final n.g f5262d = new n.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f5260b = context;
            this.f5259a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f5262d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f5260b, (InterfaceMenuC2149a) menu);
            this.f5262d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f5259a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f5259a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f5259a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f5259a.onActionItemClicked(e(bVar), new j(this.f5260b, (InterfaceMenuItemC2150b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f5261c.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = (f) this.f5261c.get(i7);
                if (fVar != null && fVar.f5258b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f5260b, bVar);
            this.f5261c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f5257a = context;
        this.f5258b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f5258b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f5258b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f5257a, (InterfaceMenuC2149a) this.f5258b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f5258b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f5258b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f5258b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f5258b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f5258b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f5258b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f5258b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f5258b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i7) {
        this.f5258b.n(i7);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f5258b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i7) {
        this.f5258b.q(i7);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z6) {
        this.f5258b.s(z6);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f5258b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f5258b.r(charSequence);
    }
}
