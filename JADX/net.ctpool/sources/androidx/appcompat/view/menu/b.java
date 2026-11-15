package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Context f5366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Context f5367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected g f5368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected LayoutInflater f5369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected LayoutInflater f5370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private m.a f5371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected n f5374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5375v;

    public b(Context context, int i7, int i8) {
        this.f5366m = context;
        this.f5369p = LayoutInflater.from(context);
        this.f5372s = i7;
        this.f5373t = i8;
    }

    protected void a(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f5374u).addView(view, i7);
    }

    public abstract void b(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z6) {
        m.a aVar = this.f5371r;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z6) {
        ViewGroup viewGroup = (ViewGroup) this.f5374u;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f5368o;
        int i7 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList arrayListE = this.f5368o.E();
            int size = arrayListE.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                i iVar = (i) arrayListE.get(i9);
                if (q(i8, iVar)) {
                    View childAt = viewGroup.getChildAt(i8);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f5371r = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        this.f5367n = context;
        this.f5370q = LayoutInflater.from(context);
        this.f5368o = gVar;
    }

    public n.a j(ViewGroup viewGroup) {
        return (n.a) this.f5369p.inflate(this.f5373t, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        m.a aVar = this.f5371r;
        g gVar = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            gVar = this.f5368o;
        }
        return aVar.d(gVar);
    }

    protected boolean l(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    public m.a m() {
        return this.f5371r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarJ = view instanceof n.a ? (n.a) view : j(viewGroup);
        b(iVar, aVarJ);
        return (View) aVarJ;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f5374u == null) {
            n nVar = (n) this.f5369p.inflate(this.f5372s, viewGroup, false);
            this.f5374u = nVar;
            nVar.b(this.f5368o);
            d(true);
        }
        return this.f5374u;
    }

    public void p(int i7) {
        this.f5375v = i7;
    }

    public abstract boolean q(int i7, i iVar);
}
