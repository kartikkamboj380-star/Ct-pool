package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1681l;

/* JADX INFO: loaded from: classes.dex */
public abstract class N extends AbstractC1681l {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String[] f19321W = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f19322V = 3;

    class a extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f19324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f19325c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f19323a = viewGroup;
            this.f19324b = view;
            this.f19325c = view2;
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void b(AbstractC1681l abstractC1681l) {
            if (this.f19324b.getParent() == null) {
                x.a(this.f19323a).c(this.f19324b);
            } else {
                N.this.cancel();
            }
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            this.f19325c.setTag(AbstractC1678i.f19395a, null);
            x.a(this.f19323a).d(this.f19324b);
            abstractC1681l.S(this);
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void e(AbstractC1681l abstractC1681l) {
            x.a(this.f19323a).d(this.f19324b);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f19333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f19334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f19335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f19336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f19337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f19338f;

        c() {
        }
    }

    private void g0(s sVar) {
        sVar.f19459a.put("android:visibility:visibility", Integer.valueOf(sVar.f19460b.getVisibility()));
        sVar.f19459a.put("android:visibility:parent", sVar.f19460b.getParent());
        int[] iArr = new int[2];
        sVar.f19460b.getLocationOnScreen(iArr);
        sVar.f19459a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r0.f19337e == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r0.f19335c == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c h0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f19333a = false;
        cVar.f19334b = false;
        ViewGroup viewGroup = null;
        if (sVar == null || !sVar.f19459a.containsKey("android:visibility:visibility")) {
            cVar.f19335c = -1;
            cVar.f19337e = null;
        } else {
            cVar.f19335c = ((Integer) sVar.f19459a.get("android:visibility:visibility")).intValue();
            cVar.f19337e = (ViewGroup) sVar.f19459a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f19459a.containsKey("android:visibility:visibility")) {
            cVar.f19336d = -1;
        } else {
            cVar.f19336d = ((Integer) sVar2.f19459a.get("android:visibility:visibility")).intValue();
            viewGroup = (ViewGroup) sVar2.f19459a.get("android:visibility:parent");
        }
        cVar.f19338f = viewGroup;
        if (sVar == null || sVar2 == null) {
            if (sVar != null || cVar.f19336d != 0) {
                if (sVar2 == null) {
                }
                return cVar;
            }
            cVar.f19334b = true;
        } else {
            int i7 = cVar.f19335c;
            int i8 = cVar.f19336d;
            if (i7 == i8 && cVar.f19337e == cVar.f19338f) {
                return cVar;
            }
            if (i7 != i8) {
                if (i7 != 0) {
                }
                cVar.f19334b = false;
            } else {
                if (cVar.f19338f != null) {
                }
                cVar.f19334b = false;
            }
        }
        cVar.f19333a = true;
        return cVar;
    }

    @Override // g0.AbstractC1681l
    public String[] G() {
        return f19321W;
    }

    @Override // g0.AbstractC1681l
    public boolean I(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f19459a.containsKey("android:visibility:visibility") != sVar.f19459a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarH0 = h0(sVar, sVar2);
        if (cVarH0.f19333a) {
            return cVarH0.f19335c == 0 || cVarH0.f19336d == 0;
        }
        return false;
    }

    @Override // g0.AbstractC1681l
    public void g(s sVar) {
        g0(sVar);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // g0.AbstractC1681l
    public void j(s sVar) {
        g0(sVar);
    }

    public Animator j0(ViewGroup viewGroup, s sVar, int i7, s sVar2, int i8) {
        if ((this.f19322V & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f19460b.getParent();
            if (h0(v(view, false), H(view, false)).f19333a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.f19460b, sVar, sVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator l0(ViewGroup viewGroup, s sVar, int i7, s sVar2, int i8) {
        View view;
        boolean z6;
        boolean z7;
        View view2;
        if ((this.f19322V & 2) != 2 || sVar == null) {
            return null;
        }
        View view3 = sVar.f19460b;
        View viewA = sVar2 != null ? sVar2.f19460b : null;
        View view4 = (View) view3.getTag(AbstractC1678i.f19395a);
        if (view4 != null) {
            view2 = null;
            z7 = true;
        } else if (viewA == null || viewA.getParent() == null) {
            if (viewA != null) {
                view = null;
                z6 = false;
            } else {
                viewA = null;
                view = null;
                z6 = true;
            }
            if (z6) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (h0(H(view5, true), v(view5, true)).f19333a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f19409I) {
                            }
                        } else {
                            viewA = r.a(viewGroup, view3, view5);
                        }
                    }
                    z7 = false;
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                }
                view2 = view;
                z7 = false;
                view4 = view3;
            } else {
                z7 = false;
                View view62 = view;
                view4 = viewA;
                view2 = view62;
            }
        } else {
            if (i8 == 4 || view3 == viewA) {
                view = viewA;
                z6 = false;
                viewA = null;
            }
            if (z6) {
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            AbstractC1666A.h(view2, 0);
            Animator animatorK0 = k0(viewGroup, view2, sVar, sVar2);
            if (animatorK0 != null) {
                b bVar = new b(view2, i8, true);
                animatorK0.addListener(bVar);
                AbstractC1670a.a(animatorK0, bVar);
                a(bVar);
            } else {
                AbstractC1666A.h(view2, visibility);
            }
            return animatorK0;
        }
        if (!z7) {
            int[] iArr = (int[]) sVar.f19459a.get("android:visibility:screenLocation");
            int i9 = iArr[0];
            int i10 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i9 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i10 - iArr2[1]) - view4.getTop());
            x.a(viewGroup).c(view4);
        }
        Animator animatorK02 = k0(viewGroup, view4, sVar, sVar2);
        if (!z7) {
            if (animatorK02 == null) {
                x.a(viewGroup).d(view4);
            } else {
                view3.setTag(AbstractC1678i.f19395a, view4);
                a(new a(viewGroup, view4, view3));
            }
        }
        return animatorK02;
    }

    public void m0(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f19322V = i7;
    }

    @Override // g0.AbstractC1681l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarH0 = h0(sVar, sVar2);
        if (!cVarH0.f19333a) {
            return null;
        }
        if (cVarH0.f19337e == null && cVarH0.f19338f == null) {
            return null;
        }
        return cVarH0.f19334b ? j0(viewGroup, sVar, cVarH0.f19335c, sVar2, cVarH0.f19336d) : l0(viewGroup, sVar, cVarH0.f19335c, sVar2, cVarH0.f19336d);
    }

    private static class b extends AnimatorListenerAdapter implements AbstractC1681l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f19327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f19329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f19330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f19332f = false;

        b(View view, int i7, boolean z6) {
            this.f19327a = view;
            this.f19328b = i7;
            this.f19329c = (ViewGroup) view.getParent();
            this.f19330d = z6;
            g(true);
        }

        private void f() {
            if (!this.f19332f) {
                AbstractC1666A.h(this.f19327a, this.f19328b);
                ViewGroup viewGroup = this.f19329c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z6) {
            ViewGroup viewGroup;
            if (!this.f19330d || this.f19331e == z6 || (viewGroup = this.f19329c) == null) {
                return;
            }
            this.f19331e = z6;
            x.c(viewGroup, z6);
        }

        @Override // g0.AbstractC1681l.f
        public void b(AbstractC1681l abstractC1681l) {
            g(true);
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            f();
            abstractC1681l.S(this);
        }

        @Override // g0.AbstractC1681l.f
        public void e(AbstractC1681l abstractC1681l) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19332f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f19332f) {
                return;
            }
            AbstractC1666A.h(this.f19327a, this.f19328b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f19332f) {
                return;
            }
            AbstractC1666A.h(this.f19327a, 0);
        }

        @Override // g0.AbstractC1681l.f
        public void a(AbstractC1681l abstractC1681l) {
        }

        @Override // g0.AbstractC1681l.f
        public void c(AbstractC1681l abstractC1681l) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
