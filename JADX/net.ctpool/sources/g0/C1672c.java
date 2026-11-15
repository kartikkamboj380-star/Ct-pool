package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: g0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1672c extends AbstractC1681l {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String[] f19340Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Property f19341Z = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Property f19342a0 = new C0257c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Property f19343b0 = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Property f19344c0 = new e(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Property f19345d0 = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Property f19346e0 = new g(PointF.class, "position");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static C1679j f19347f0 = new C1679j();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int[] f19348V = new int[2];

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f19349W = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f19350X = false;

    /* JADX INFO: renamed from: g0.c$a */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f19352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f19353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f19354d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f7) {
            this.f19351a = viewGroup;
            this.f19352b = bitmapDrawable;
            this.f19353c = view;
            this.f19354d = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1666A.b(this.f19351a).b(this.f19352b);
            AbstractC1666A.g(this.f19353c, this.f19354d);
        }
    }

    /* JADX INFO: renamed from: g0.c$b */
    static class b extends Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f19356a;

        b(Class cls, String str) {
            super(cls, str);
            this.f19356a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f19356a);
            Rect rect = this.f19356a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f19356a);
            this.f19356a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f19356a);
        }
    }

    /* JADX INFO: renamed from: g0.c$c, reason: collision with other inner class name */
    static class C0257c extends Property {
        C0257c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: g0.c$d */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: g0.c$e */
    static class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC1666A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: g0.c$f */
    static class f extends Property {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC1666A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: g0.c$g */
    static class g extends Property {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            AbstractC1666A.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: g0.c$h */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f19357a;
        private k mViewBounds;

        h(k kVar) {
            this.f19357a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* JADX INFO: renamed from: g0.c$i */
    class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f19360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f19361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f19364f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f19365g;

        i(View view, Rect rect, int i7, int i8, int i9, int i10) {
            this.f19360b = view;
            this.f19361c = rect;
            this.f19362d = i7;
            this.f19363e = i8;
            this.f19364f = i9;
            this.f19365g = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19359a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f19359a) {
                return;
            }
            androidx.core.view.H.w0(this.f19360b, this.f19361c);
            AbstractC1666A.f(this.f19360b, this.f19362d, this.f19363e, this.f19364f, this.f19365g);
        }
    }

    /* JADX INFO: renamed from: g0.c$j */
    class j extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f19367a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19368b;

        j(ViewGroup viewGroup) {
            this.f19368b = viewGroup;
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void b(AbstractC1681l abstractC1681l) {
            x.c(this.f19368b, true);
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void c(AbstractC1681l abstractC1681l) {
            x.c(this.f19368b, false);
            this.f19367a = true;
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            if (!this.f19367a) {
                x.c(this.f19368b, false);
            }
            abstractC1681l.S(this);
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void e(AbstractC1681l abstractC1681l) {
            x.c(this.f19368b, false);
        }
    }

    /* JADX INFO: renamed from: g0.c$k */
    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f19373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f19374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19375f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19376g;

        k(View view) {
            this.f19374e = view;
        }

        private void b() {
            AbstractC1666A.f(this.f19374e, this.f19370a, this.f19371b, this.f19372c, this.f19373d);
            this.f19375f = 0;
            this.f19376g = 0;
        }

        void a(PointF pointF) {
            this.f19372c = Math.round(pointF.x);
            this.f19373d = Math.round(pointF.y);
            int i7 = this.f19376g + 1;
            this.f19376g = i7;
            if (this.f19375f == i7) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f19370a = Math.round(pointF.x);
            this.f19371b = Math.round(pointF.y);
            int i7 = this.f19375f + 1;
            this.f19375f = i7;
            if (i7 == this.f19376g) {
                b();
            }
        }
    }

    private void g0(s sVar) {
        View view = sVar.f19460b;
        if (!androidx.core.view.H.T(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f19459a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f19459a.put("android:changeBounds:parent", sVar.f19460b.getParent());
        if (this.f19350X) {
            sVar.f19460b.getLocationInWindow(this.f19348V);
            sVar.f19459a.put("android:changeBounds:windowX", Integer.valueOf(this.f19348V[0]));
            sVar.f19459a.put("android:changeBounds:windowY", Integer.valueOf(this.f19348V[1]));
        }
        if (this.f19349W) {
            sVar.f19459a.put("android:changeBounds:clip", androidx.core.view.H.u(view));
        }
    }

    private boolean h0(View view, View view2) {
        if (!this.f19350X) {
            return true;
        }
        s sVarV = v(view, true);
        if (sVarV == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarV.f19460b) {
            return true;
        }
        return false;
    }

    @Override // g0.AbstractC1681l
    public String[] G() {
        return f19340Y;
    }

    @Override // g0.AbstractC1681l
    public void g(s sVar) {
        g0(sVar);
    }

    @Override // g0.AbstractC1681l
    public void j(s sVar) {
        g0(sVar);
    }

    @Override // g0.AbstractC1681l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i7;
        View view;
        int i8;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f19459a;
        Map map2 = sVar2.f19459a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f19460b;
        if (!h0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.f19459a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f19459a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f19459a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f19459a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f19348V);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = AbstractC1666A.c(view2);
            AbstractC1666A.g(view2, 0.0f);
            AbstractC1666A.b(viewGroup).a(bitmapDrawable);
            AbstractC1676g abstractC1676gY = y();
            int[] iArr = this.f19348V;
            int i9 = iArr[0];
            int i10 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC1677h.a(f19341Z, abstractC1676gY.a(iIntValue - i9, iIntValue2 - i10, iIntValue3 - i9, iIntValue4 - i10)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect = (Rect) sVar.f19459a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) sVar2.f19459a.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) sVar.f19459a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) sVar2.f19459a.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i7 = 0;
        } else {
            i7 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i7++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i7++;
        }
        if (i7 <= 0) {
            return null;
        }
        if (this.f19349W) {
            view = view2;
            AbstractC1666A.f(view, i11, i13, Math.max(i19, i21) + i11, Math.max(i20, i22) + i13);
            ObjectAnimator objectAnimatorA = (i11 == i12 && i13 == i14) ? null : AbstractC1675f.a(view, f19346e0, y().a(i11, i13, i12, i14));
            if (rect3 == null) {
                i8 = 0;
                rect3 = new Rect(0, 0, i19, i20);
            } else {
                i8 = 0;
            }
            Rect rect5 = rect4 == null ? new Rect(i8, i8, i21, i22) : rect4;
            if (rect3.equals(rect5)) {
                objectAnimator = null;
            } else {
                androidx.core.view.H.w0(view, rect3);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f19347f0, rect3, rect5);
                objectAnimatorOfObject.addListener(new i(view, rect4, i12, i14, i16, i18));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            AbstractC1666A.f(view, i11, i13, i15, i17);
            if (i7 == 2) {
                if (i19 == i21 && i20 == i22) {
                    pathA = y().a(i11, i13, i12, i14);
                    property = f19346e0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator objectAnimatorA2 = AbstractC1675f.a(kVar, f19342a0, y().a(i11, i13, i12, i14));
                    ObjectAnimator objectAnimatorA3 = AbstractC1675f.a(kVar, f19343b0, y().a(i15, i17, i16, i18));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar));
                    animatorC = animatorSet;
                }
            } else if (i11 == i12 && i13 == i14) {
                pathA = y().a(i15, i17, i16, i18);
                property = f19344c0;
            } else {
                pathA = y().a(i11, i13, i12, i14);
                property = f19345d0;
            }
            animatorC = AbstractC1675f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
