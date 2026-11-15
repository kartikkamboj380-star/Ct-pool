package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.swmansion.rnscreens.C1599l;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class t extends n {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f18501D = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f18502A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f18503B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f18504C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f18505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f18506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f18507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f18508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private v f18509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f18510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f18511z;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(r rVar) {
            return rVar.g().getStackPresentation() == C1599l.d.f18456o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(r rVar) {
            return Build.VERSION.SDK_INT >= 33 || rVar.g().getStackAnimation() == C1599l.c.f18447p || rVar.g().getStackAnimation() == C1599l.c.f18450s || rVar.g().getStackAnimation() == C1599l.c.f18451t;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Canvas f18512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f18513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18514c;

        public b() {
        }

        public final void a() {
            t.this.J(this);
            this.f18512a = null;
            this.f18513b = null;
            this.f18514c = 0L;
        }

        public final Canvas b() {
            return this.f18512a;
        }

        public final View c() {
            return this.f18513b;
        }

        public final long d() {
            return this.f18514c;
        }

        public final void e(Canvas canvas) {
            this.f18512a = canvas;
        }

        public final void f(View view) {
            this.f18513b = view;
        }

        public final void g(long j7) {
            this.f18514c = j7;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18516a;

        static {
            int[] iArr = new int[C1599l.c.values().length];
            try {
                iArr[C1599l.c.f18444m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1599l.c.f18445n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1599l.c.f18446o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1599l.c.f18448q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1599l.c.f18449r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1599l.c.f18447p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1599l.c.f18450s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C1599l.c.f18451t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f18516a = iArr;
        }
    }

    public t(Context context) {
        super(context);
        this.f18505t = new ArrayList();
        this.f18506u = new HashSet();
        this.f18507v = new ArrayList();
        this.f18508w = new ArrayList();
    }

    private final void E() {
        int iF = AbstractC0884k0.f(this);
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, getId());
        if (eVarC != null) {
            eVarC.c(new c5.q(iF, getId()));
        }
    }

    private final void F() {
        List<b> list = this.f18508w;
        this.f18508w = new ArrayList();
        for (b bVar : list) {
            bVar.a();
            this.f18507v.add(bVar);
        }
    }

    private final b G() {
        if (this.f18507v.isEmpty()) {
            return new b();
        }
        List list = this.f18507v;
        return (b) list.remove(AbstractC1809n.j(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(r rVar) {
        C1599l c1599lG;
        if (rVar == null || (c1599lG = rVar.g()) == null) {
            return;
        }
        c1599lG.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(b bVar) {
        Canvas canvasB = bVar.b();
        w5.k.c(canvasB);
        super.drawChild(canvasB, bVar.c(), bVar.d());
    }

    private final void K(r rVar) {
        v vVar;
        if (this.f18475m.size() > 1 && rVar != null && (vVar = this.f18509x) != null && f18501D.c(vVar)) {
            ArrayList arrayList = this.f18475m;
            for (r rVar2 : AbstractC1809n.y(AbstractC1809n.V(arrayList, C5.g.l(0, arrayList.size() - 1)))) {
                rVar2.g().b(4);
                if (w5.k.b(rVar2, rVar)) {
                    break;
                }
            }
        }
        C1599l topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.b(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.n
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public u c(C1599l c1599l) {
        w5.k.f(c1599l, "screen");
        return new u(c1599l);
    }

    public final void D(v vVar) {
        w5.k.f(vVar, "screenFragment");
        this.f18506u.add(vVar);
        v();
    }

    public final void I() {
        if (this.f18510y) {
            return;
        }
        E();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        w5.k.f(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f18508w.size() < this.f18503B) {
            this.f18502A = false;
        }
        this.f18503B = this.f18508w.size();
        if (this.f18502A && this.f18508w.size() >= 2) {
            Collections.swap(this.f18508w, r4.size() - 1, this.f18508w.size() - 2);
        }
        F();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        w5.k.f(canvas, "canvas");
        w5.k.f(view, "child");
        List list = this.f18508w;
        b bVarG = G();
        bVarG.e(canvas);
        bVarG.f(view);
        bVarG.g(j7);
        list.add(bVarG);
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        w5.k.f(view, "view");
        super.endViewTransition(view);
        if (this.f18510y) {
            this.f18510y = false;
            E();
        }
    }

    public final ArrayList<v> getFragments() {
        return this.f18505t;
    }

    public final boolean getGoingForward() {
        return this.f18504C;
    }

    public final C1599l getRootScreen() {
        int screenCount = getScreenCount();
        for (int i7 = 0; i7 < screenCount; i7++) {
            r rVarM = m(i7);
            if (!AbstractC1809n.D(this.f18506u, rVarM)) {
                return rVarM.g();
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    @Override // com.swmansion.rnscreens.n
    public C1599l getTopScreen() {
        v vVar = this.f18509x;
        if (vVar != null) {
            return vVar.g();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.n
    public boolean n(r rVar) {
        return super.n(rVar) && !AbstractC1809n.D(this.f18506u, rVar);
    }

    @Override // com.swmansion.rnscreens.n
    protected void p() {
        Iterator it = this.f18505t.iterator();
        while (it.hasNext()) {
            ((v) it.next()).k();
        }
    }

    @Override // com.swmansion.rnscreens.n, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        w5.k.f(view, "view");
        if (this.f18511z) {
            this.f18511z = false;
            this.f18502A = true;
        }
        super.removeView(view);
    }

    public final void setGoingForward(boolean z6) {
        this.f18504C = z6;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        w5.k.f(view, "view");
        super.startViewTransition(view);
        this.f18510y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d8 A[LOOP:4: B:126:0x01d2->B:128:0x01d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[PHI: r3 r4
      0x002c: PHI (r3v9 com.swmansion.rnscreens.r) = (r3v8 com.swmansion.rnscreens.r), (r3v10 com.swmansion.rnscreens.r) binds: [B:5:0x001c, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r4v3 com.swmansion.rnscreens.r) = (r4v2 com.swmansion.rnscreens.r), (r4v5 com.swmansion.rnscreens.r) binds: [B:5:0x001c, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    @Override // com.swmansion.rnscreens.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t() {
        C1599l.c stackAnimation;
        boolean z6;
        C1599l c1599lG;
        androidx.fragment.app.E eG;
        Iterator it;
        r rVar;
        int i7;
        int i8;
        C1599l c1599lG2;
        this.f18511z = false;
        int size = this.f18475m.size() - 1;
        final r rVar2 = null;
        r rVar3 = null;
        if (size >= 0) {
            while (true) {
                int i9 = size - 1;
                r rVarM = m(size);
                if (!AbstractC1809n.D(this.f18506u, rVarM)) {
                    if (rVar2 == null) {
                        rVar2 = rVarM;
                    } else {
                        rVar3 = rVarM;
                    }
                    if (!f18501D.c(rVarM)) {
                        break;
                    }
                } else if (i9 < 0) {
                    break;
                } else {
                    size = i9;
                }
            }
        }
        boolean z7 = true;
        if (AbstractC1809n.D(this.f18505t, rVar2)) {
            v vVar = this.f18509x;
            if (vVar != null && !w5.k.b(vVar, rVar2)) {
                v vVar2 = this.f18509x;
                stackAnimation = (vVar2 == null || (c1599lG = vVar2.g()) == null) ? null : c1599lG.getStackAnimation();
                z6 = false;
                eG = g();
                if (stackAnimation != null) {
                }
                this.f18504C = z6;
                if (z6) {
                }
                while (r1.hasNext()) {
                }
                it = this.f18475m.iterator();
                while (it.hasNext()) {
                }
                if (rVar3 == null) {
                }
                this.f18509x = rVar2 instanceof v ? (v) rVar2 : null;
                this.f18505t.clear();
                ArrayList arrayList = this.f18505t;
                ArrayList<r> arrayList2 = this.f18475m;
                ArrayList arrayList3 = new ArrayList(AbstractC1809n.q(arrayList2, 10));
                while (r1.hasNext()) {
                }
                arrayList.addAll(arrayList3);
                K(rVar3);
                eG.j();
            }
            stackAnimation = null;
        } else {
            v vVar3 = this.f18509x;
            if (vVar3 != null && rVar2 != null) {
                z6 = (vVar3 != null && this.f18475m.contains(vVar3)) || (rVar2.g().getReplaceAnimation() == C1599l.b.f18440m);
                if (!z6) {
                    v vVar4 = this.f18509x;
                    if (vVar4 == null || (c1599lG2 = vVar4.g()) == null) {
                        stackAnimation = null;
                    }
                    eG = g();
                    if (stackAnimation != null) {
                        int[] iArr = c.f18516a;
                        int iOrdinal = stackAnimation.ordinal();
                        if (z6) {
                            switch (iArr[iOrdinal]) {
                                case 1:
                                    i7 = AbstractC1596i.f18393a;
                                    i8 = AbstractC1596i.f18394b;
                                    eG.q(i7, i8);
                                    break;
                                case 2:
                                    int i10 = AbstractC1596i.f18401i;
                                    eG.q(i10, i10);
                                    break;
                                case 3:
                                    i7 = AbstractC1596i.f18398f;
                                    i8 = AbstractC1596i.f18399g;
                                    eG.q(i7, i8);
                                    break;
                                case 4:
                                    i7 = AbstractC1596i.f18408p;
                                    i8 = AbstractC1596i.f18411s;
                                    eG.q(i7, i8);
                                    break;
                                case 5:
                                    i7 = AbstractC1596i.f18406n;
                                    i8 = AbstractC1596i.f18413u;
                                    eG.q(i7, i8);
                                    break;
                                case 6:
                                    i7 = AbstractC1596i.f18405m;
                                    i8 = AbstractC1596i.f18404l;
                                    eG.q(i7, i8);
                                    break;
                                case 7:
                                    i7 = AbstractC1596i.f18397e;
                                    i8 = AbstractC1596i.f18403k;
                                    eG.q(i7, i8);
                                    break;
                                case 8:
                                    i7 = AbstractC1596i.f18409q;
                                    i8 = AbstractC1596i.f18412t;
                                    eG.q(i7, i8);
                                    break;
                            }
                        } else {
                            switch (iArr[iOrdinal]) {
                                case 1:
                                    i7 = AbstractC1596i.f18395c;
                                    i8 = AbstractC1596i.f18396d;
                                    eG.q(i7, i8);
                                    break;
                                case 6:
                                    i7 = AbstractC1596i.f18404l;
                                    i8 = AbstractC1596i.f18410r;
                                    eG.q(i7, i8);
                                    break;
                                case 7:
                                    i7 = AbstractC1596i.f18402j;
                                    i8 = AbstractC1596i.f18400h;
                                    eG.q(i7, i8);
                                    break;
                                case 8:
                                    i7 = AbstractC1596i.f18407o;
                                    i8 = AbstractC1596i.f18414v;
                                    eG.q(i7, i8);
                                    break;
                            }
                        }
                    }
                    this.f18504C = z6;
                    if (z6 && rVar2 != null && f18501D.d(rVar2) && rVar3 == null) {
                        this.f18511z = true;
                    }
                    for (v vVar5 : this.f18505t) {
                        if (!this.f18475m.contains(vVar5) || this.f18506u.contains(vVar5)) {
                            eG.m(vVar5.e());
                        }
                    }
                    it = this.f18475m.iterator();
                    while (it.hasNext() && (rVar = (r) it.next()) != rVar3) {
                        if (rVar == rVar2 && !AbstractC1809n.D(this.f18506u, rVar)) {
                            eG.m(rVar.e());
                        }
                    }
                    if (rVar3 == null && !rVar3.e().isAdded()) {
                        for (r rVar4 : this.f18475m) {
                            if (z7) {
                                if (rVar4 == rVar3) {
                                    z7 = false;
                                }
                            }
                            eG.b(getId(), rVar4.e()).p(new Runnable() { // from class: com.swmansion.rnscreens.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    t.H(rVar2);
                                }
                            });
                        }
                    } else if (rVar2 != null && !rVar2.e().isAdded()) {
                        eG.b(getId(), rVar2.e());
                    }
                    this.f18509x = rVar2 instanceof v ? (v) rVar2 : null;
                    this.f18505t.clear();
                    ArrayList arrayList4 = this.f18505t;
                    ArrayList<r> arrayList22 = this.f18475m;
                    ArrayList arrayList32 = new ArrayList(AbstractC1809n.q(arrayList22, 10));
                    for (r rVar5 : arrayList22) {
                        w5.k.d(rVar5, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragmentWrapper");
                        arrayList32.add((v) rVar5);
                    }
                    arrayList4.addAll(arrayList32);
                    K(rVar3);
                    eG.j();
                }
                c1599lG2 = rVar2.g();
                stackAnimation = c1599lG2.getStackAnimation();
                eG = g();
                if (stackAnimation != null) {
                }
                this.f18504C = z6;
                if (z6) {
                    this.f18511z = true;
                }
                while (r1.hasNext()) {
                }
                it = this.f18475m.iterator();
                while (it.hasNext()) {
                    if (rVar == rVar2) {
                    }
                }
                if (rVar3 == null) {
                    if (rVar2 != null) {
                        eG.b(getId(), rVar2.e());
                    }
                }
                this.f18509x = rVar2 instanceof v ? (v) rVar2 : null;
                this.f18505t.clear();
                ArrayList arrayList42 = this.f18505t;
                ArrayList<r> arrayList222 = this.f18475m;
                ArrayList arrayList322 = new ArrayList(AbstractC1809n.q(arrayList222, 10));
                while (r1.hasNext()) {
                }
                arrayList42.addAll(arrayList322);
                K(rVar3);
                eG.j();
            }
            if (vVar3 != null || rVar2 == null) {
                stackAnimation = null;
            } else {
                stackAnimation = C1599l.c.f18445n;
                this.f18504C = true;
            }
        }
        z6 = true;
        eG = g();
        if (stackAnimation != null) {
        }
        this.f18504C = z6;
        if (z6) {
        }
        while (r1.hasNext()) {
        }
        it = this.f18475m.iterator();
        while (it.hasNext()) {
        }
        if (rVar3 == null) {
        }
        this.f18509x = rVar2 instanceof v ? (v) rVar2 : null;
        this.f18505t.clear();
        ArrayList arrayList422 = this.f18505t;
        ArrayList<r> arrayList2222 = this.f18475m;
        ArrayList arrayList3222 = new ArrayList(AbstractC1809n.q(arrayList2222, 10));
        while (r1.hasNext()) {
        }
        arrayList422.addAll(arrayList3222);
        K(rVar3);
        eG.j();
    }

    @Override // com.swmansion.rnscreens.n
    public void w() {
        this.f18506u.clear();
        super.w();
    }

    @Override // com.swmansion.rnscreens.n
    public void y(int i7) {
        Set set = this.f18506u;
        w5.z.a(set).remove(m(i7));
        super.y(i7);
    }
}
