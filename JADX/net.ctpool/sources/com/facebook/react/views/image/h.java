package com.facebook.react.views.image;

import J2.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0889o;
import com.facebook.react.uimanager.G;
import g1.AbstractC1687b;
import g1.C1691f;
import g1.InterfaceC1689d;
import j1.RunnableC1775b;
import j1.k;
import j1.p;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k1.C1815a;
import k1.C1816b;
import k1.d;
import n1.AbstractC1897d;
import p2.C1962a;
import x1.C2215f;

/* JADX INFO: loaded from: classes.dex */
public class h extends AbstractC1897d {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static float[] f12783T = new float[4];

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final Matrix f12784U = new Matrix();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f12785A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f12786B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f12787C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private float f12788D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f12789E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float[] f12790F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p.b f12791G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Shader.TileMode f12792H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f12793I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final AbstractC1687b f12794J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private b f12795K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private I1.a f12796L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private g f12797M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private InterfaceC1689d f12798N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Object f12799O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f12800P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f12801Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ReadableMap f12802R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f12803S;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f12804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f12805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private J2.a f12806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private J2.a f12807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f12808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f12809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private k f12810z;

    class a extends g {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.e f12811r;

        a(com.facebook.react.uimanager.events.e eVar) {
            this.f12811r = eVar;
        }

        @Override // g1.InterfaceC1689d
        public void i(String str, Throwable th) {
            this.f12811r.c(com.facebook.react.views.image.b.a(AbstractC0884k0.f(h.this), h.this.getId(), th));
        }

        @Override // g1.InterfaceC1689d
        public void p(String str, Object obj) {
            this.f12811r.c(com.facebook.react.views.image.b.e(AbstractC0884k0.f(h.this), h.this.getId()));
        }

        @Override // com.facebook.react.views.image.g
        public void x(int i7, int i8) {
            this.f12811r.c(com.facebook.react.views.image.b.f(AbstractC0884k0.f(h.this), h.this.getId(), h.this.f12806v.d(), i7, i8));
        }

        @Override // g1.InterfaceC1689d
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void e(String str, D1.i iVar, Animatable animatable) {
            if (iVar != null) {
                this.f12811r.c(com.facebook.react.views.image.b.d(AbstractC0884k0.f(h.this), h.this.getId(), h.this.f12806v.d(), iVar.getWidth(), iVar.getHeight()));
                this.f12811r.c(com.facebook.react.views.image.b.c(AbstractC0884k0.f(h.this), h.this.getId()));
            }
        }
    }

    private class b extends J1.a {
        private b() {
        }

        @Override // J1.a, J1.d
        public S0.a a(Bitmap bitmap, v1.b bVar) {
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f12791G.a(h.f12784U, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, h.this.f12792H, h.this.f12792H);
            bitmapShader.setLocalMatrix(h.f12784U);
            paint.setShader(bitmapShader);
            S0.a aVarA = bVar.a(h.this.getWidth(), h.this.getHeight());
            try {
                new Canvas((Bitmap) aVarA.j()).drawRect(rect, paint);
                return aVarA.clone();
            } finally {
                S0.a.g(aVarA);
            }
        }
    }

    public h(Context context, AbstractC1687b abstractC1687b, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, k(context));
        this.f12804t = c.f12775m;
        this.f12805u = new LinkedList();
        this.f12785A = 0;
        this.f12789E = Float.NaN;
        this.f12791G = d.b();
        this.f12792H = d.a();
        this.f12800P = -1;
        this.f12803S = 1.0f;
        this.f12794J = abstractC1687b;
        this.f12799O = obj;
        setLegacyVisibilityHandlingEnabled(true);
    }

    private C2215f getResizeOptions() {
        int iRound = Math.round(getWidth() * this.f12803S);
        int iRound2 = Math.round(getHeight() * this.f12803S);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new C2215f(iRound, iRound2);
    }

    private static C1815a k(Context context) {
        k1.d dVarA = k1.d.a(0.0f);
        dVarA.q(true);
        return new C1816b(context.getResources()).u(dVarA).a();
    }

    private void l(float[] fArr) {
        float f7 = !com.facebook.yoga.g.a(this.f12789E) ? this.f12789E : 0.0f;
        float[] fArr2 = this.f12790F;
        fArr[0] = (fArr2 == null || com.facebook.yoga.g.a(fArr2[0])) ? f7 : this.f12790F[0];
        float[] fArr3 = this.f12790F;
        fArr[1] = (fArr3 == null || com.facebook.yoga.g.a(fArr3[1])) ? f7 : this.f12790F[1];
        float[] fArr4 = this.f12790F;
        fArr[2] = (fArr4 == null || com.facebook.yoga.g.a(fArr4[2])) ? f7 : this.f12790F[2];
        float[] fArr5 = this.f12790F;
        if (fArr5 != null && !com.facebook.yoga.g.a(fArr5[3])) {
            f7 = this.f12790F[3];
        }
        fArr[3] = f7;
    }

    private boolean m() {
        return this.f12805u.size() > 1;
    }

    private boolean n() {
        return this.f12792H != Shader.TileMode.CLAMP;
    }

    private void q() {
        this.f12806v = null;
        if (this.f12805u.isEmpty()) {
            this.f12805u.add(J2.a.e(getContext()));
        } else if (m()) {
            b.a aVarA = J2.b.a(getWidth(), getHeight(), this.f12805u);
            this.f12806v = aVarA.f1715a;
            this.f12807w = aVarA.f1716b;
            return;
        }
        this.f12806v = (J2.a) this.f12805u.get(0);
    }

    private boolean r(J2.a aVar) {
        c cVar = this.f12804t;
        return cVar == c.f12775m ? W0.f.k(aVar.f()) || W0.f.l(aVar.f()) : cVar == c.f12776n;
    }

    private void s(String str) {
    }

    public J2.a getImageSource() {
        return this.f12806v;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o() {
        g gVar;
        InterfaceC1689d interfaceC1689d;
        if (this.f12793I) {
            if (!m() || (getWidth() > 0 && getHeight() > 0)) {
                q();
                J2.a aVar = this.f12806v;
                if (aVar == null) {
                    return;
                }
                boolean zR = r(aVar);
                if (!zR || (getWidth() > 0 && getHeight() > 0)) {
                    if (!n() || (getWidth() > 0 && getHeight() > 0)) {
                        C1815a c1815a = (C1815a) getHierarchy();
                        c1815a.v(this.f12791G);
                        Drawable drawable = this.f12808x;
                        if (drawable != null) {
                            c1815a.z(drawable, this.f12791G);
                        }
                        Drawable drawable2 = this.f12809y;
                        if (drawable2 != null) {
                            c1815a.z(drawable2, p.b.f20327g);
                        }
                        l(f12783T);
                        k1.d dVarQ = c1815a.q();
                        float[] fArr = f12783T;
                        dVarQ.n(fArr[0], fArr[1], fArr[2], fArr[3]);
                        k kVar = this.f12810z;
                        if (kVar != null) {
                            kVar.b(this.f12786B, this.f12788D);
                            this.f12810z.t(dVarQ.d());
                            c1815a.w(this.f12810z);
                        }
                        dVarQ.m(this.f12786B, this.f12788D);
                        int i7 = this.f12787C;
                        if (i7 != 0) {
                            dVarQ.p(i7);
                        } else {
                            dVarQ.r(d.a.BITMAP_ONLY);
                        }
                        c1815a.C(dVarQ);
                        int i8 = this.f12800P;
                        if (i8 < 0) {
                            i8 = this.f12806v.g() ? 0 : 300;
                        }
                        c1815a.y(i8);
                        LinkedList linkedList = new LinkedList();
                        I1.a aVar2 = this.f12796L;
                        if (aVar2 != null) {
                            linkedList.add(aVar2);
                        }
                        b bVar = this.f12795K;
                        if (bVar != null) {
                            linkedList.add(bVar);
                        }
                        J1.d dVarC = e.c(linkedList);
                        C2215f resizeOptions = zR ? getResizeOptions() : null;
                        C1962a c1962aZ = C1962a.z(J1.c.w(this.f12806v.f()).H(dVarC).L(resizeOptions).x(true).I(this.f12801Q), this.f12802R);
                        this.f12794J.x();
                        this.f12794J.y(true).z(this.f12799O).D(getController()).B(c1962aZ);
                        J2.a aVar3 = this.f12807w;
                        if (aVar3 != null) {
                            this.f12794J.C(J1.c.w(aVar3.f()).H(dVarC).L(resizeOptions).x(true).I(this.f12801Q).a());
                        }
                        g gVar2 = this.f12797M;
                        if (gVar2 == null || this.f12798N == null) {
                            InterfaceC1689d interfaceC1689d2 = this.f12798N;
                            interfaceC1689d = gVar2;
                            if (interfaceC1689d2 != null) {
                                this.f12794J.A(interfaceC1689d2);
                            } else if (gVar2 != null) {
                            }
                            gVar = this.f12797M;
                            if (gVar != null) {
                                c1815a.B(gVar);
                            }
                            setController(this.f12794J.a());
                            this.f12793I = false;
                            this.f12794J.x();
                        }
                        C1691f c1691f = new C1691f();
                        c1691f.b(this.f12797M);
                        c1691f.b(this.f12798N);
                        interfaceC1689d = c1691f;
                        this.f12794J.A(interfaceC1689d);
                        gVar = this.f12797M;
                        if (gVar != null) {
                        }
                        setController(this.f12794J.a());
                        this.f12793I = false;
                        this.f12794J.x();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 <= 0 || i8 <= 0) {
            return;
        }
        this.f12793I = this.f12793I || m() || n();
        o();
    }

    public void p(float f7, int i7) {
        if (this.f12790F == null) {
            float[] fArr = new float[4];
            this.f12790F = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (C0889o.a(this.f12790F[i7], f7)) {
            return;
        }
        this.f12790F[i7] = f7;
        this.f12793I = true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (this.f12785A != i7) {
            this.f12785A = i7;
            this.f12810z = new k(i7);
            this.f12793I = true;
        }
    }

    public void setBlurRadius(float f7) {
        int iD = ((int) G.d(f7)) / 2;
        if (iD == 0) {
            this.f12796L = null;
        } else {
            this.f12796L = new I1.a(2, iD);
        }
        this.f12793I = true;
    }

    public void setBorderColor(int i7) {
        if (this.f12786B != i7) {
            this.f12786B = i7;
            this.f12793I = true;
        }
    }

    public void setBorderRadius(float f7) {
        if (C0889o.a(this.f12789E, f7)) {
            return;
        }
        this.f12789E = f7;
        this.f12793I = true;
    }

    public void setBorderWidth(float f7) {
        float fD = G.d(f7);
        if (C0889o.a(this.f12788D, fD)) {
            return;
        }
        this.f12788D = fD;
        this.f12793I = true;
    }

    public void setControllerListener(InterfaceC1689d interfaceC1689d) {
        this.f12798N = interfaceC1689d;
        this.f12793I = true;
        o();
    }

    public void setDefaultSource(String str) {
        Drawable drawableE = J2.c.d().e(getContext(), str);
        if (O0.j.a(this.f12808x, drawableE)) {
            return;
        }
        this.f12808x = drawableE;
        this.f12793I = true;
    }

    public void setFadeDuration(int i7) {
        this.f12800P = i7;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.f12802R = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable drawableE = J2.c.d().e(getContext(), str);
        RunnableC1775b runnableC1775b = drawableE != null ? new RunnableC1775b(drawableE, 1000) : null;
        if (O0.j.a(this.f12809y, runnableC1775b)) {
            return;
        }
        this.f12809y = runnableC1775b;
        this.f12793I = true;
    }

    public void setOverlayColor(int i7) {
        if (this.f12787C != i7) {
            this.f12787C = i7;
            this.f12793I = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z6) {
        this.f12801Q = z6;
    }

    public void setResizeMethod(c cVar) {
        if (this.f12804t != cVar) {
            this.f12804t = cVar;
            this.f12793I = true;
        }
    }

    public void setResizeMultiplier(float f7) {
        if (Math.abs(this.f12803S - f7) > 1.0E-4f) {
            this.f12803S = f7;
            this.f12793I = true;
        }
    }

    public void setScaleType(p.b bVar) {
        if (this.f12791G != bVar) {
            this.f12791G = bVar;
            this.f12793I = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z6) {
        if (z6 == (this.f12797M != null)) {
            return;
        }
        if (z6) {
            this.f12797M = new a(AbstractC0884k0.c((ReactContext) getContext(), getId()));
        } else {
            this.f12797M = null;
        }
        this.f12793I = true;
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList linkedList = new LinkedList();
        if (readableArray == null || readableArray.size() == 0) {
            linkedList.add(J2.a.e(getContext()));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                J2.a aVar = new J2.a(getContext(), map.getString("uri"));
                if (Uri.EMPTY.equals(aVar.f())) {
                    s(map.getString("uri"));
                    aVar = J2.a.e(getContext());
                }
                linkedList.add(aVar);
            } else {
                for (int i7 = 0; i7 < readableArray.size(); i7++) {
                    ReadableMap map2 = readableArray.getMap(i7);
                    J2.a aVar2 = new J2.a(getContext(), map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"));
                    if (Uri.EMPTY.equals(aVar2.f())) {
                        s(map2.getString("uri"));
                        aVar2 = J2.a.e(getContext());
                    }
                    linkedList.add(aVar2);
                }
            }
        }
        if (this.f12805u.equals(linkedList)) {
            return;
        }
        this.f12805u.clear();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f12805u.add((J2.a) it.next());
        }
        this.f12793I = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.f12792H != tileMode) {
            this.f12792H = tileMode;
            if (n()) {
                this.f12795K = new b();
            } else {
                this.f12795K = null;
            }
            this.f12793I = true;
        }
    }
}
