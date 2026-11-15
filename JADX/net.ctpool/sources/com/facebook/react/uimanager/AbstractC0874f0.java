package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import w2.InterfaceC2186c;
import y2.C2239a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0874f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f12592a = new float[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PointF f12593b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f12594c = new float[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix f12595d = new Matrix();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.f0$a */
    private enum a {
        SELF,
        CHILD
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.f0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f12600b;

        private b(int i7, View view) {
            this.f12599a = i7;
            this.f12600b = view;
        }

        public View a() {
            return this.f12600b;
        }

        public int b() {
            return this.f12599a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f12599a;
        }

        public int hashCode() {
            return Integer.valueOf(this.f12599a).hashCode();
        }
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(float f7, float f8, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f7;
        fArr[1] = f8;
        List arrayList = new ArrayList();
        View viewF = f(fArr, viewGroup, arrayList);
        if (viewF != null) {
            int i7 = 0;
            while (viewF != null && viewF.getId() <= 0) {
                viewF = (View) viewF.getParent();
                i7++;
            }
            if (i7 > 0) {
                arrayList = arrayList.subList(i7, arrayList.size());
            }
            int iH = h(viewF, fArr[0], fArr[1]);
            if (iH != viewF.getId()) {
                arrayList.add(0, new b(iH, null));
            }
        }
        return arrayList;
    }

    public static int c(float f7, float f8, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View viewA;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f7;
        fArr[1] = f8;
        View viewF = f(fArr, viewGroup, null);
        if (viewF == null || (viewA = a(viewF)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return h(viewA, fArr[0], fArr[1]);
    }

    public static int d(float f7, float f8, ViewGroup viewGroup) {
        return c(f7, f8, viewGroup, f12592a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View e(float[] fArr, View view, EnumSet enumSet, List list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof P) {
                    if (C2239a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((P) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            Y y6 = viewGroup instanceof Y ? (Y) viewGroup : null;
            for (int i7 = childCount - 1; i7 >= 0; i7--) {
                View childAt = viewGroup.getChildAt(y6 != null ? y6.getZIndexMappedChildIndex(i7) : i7);
                PointF pointF = f12593b;
                g(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f7 = fArr[0];
                float f8 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewF = f(fArr, childAt, list);
                if (viewF != null) {
                    return viewF;
                }
                fArr[0] = f7;
                fArr[1] = f8;
            }
        }
        if (enumSet.contains(a.SELF) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View f(float[] fArr, View view, List list) {
        H pointerEvents = view instanceof Q ? ((Q) view).getPointerEvents() : H.f12293q;
        if (!view.isEnabled()) {
            if (pointerEvents == H.f12293q) {
                pointerEvents = H.f12291o;
            } else if (pointerEvents == H.f12292p) {
                pointerEvents = H.f12290n;
            }
        }
        if (pointerEvents == H.f12290n) {
            return null;
        }
        if (pointerEvents == H.f12292p) {
            View viewE = e(fArr, view, EnumSet.of(a.SELF), list);
            if (viewE != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return viewE;
        }
        if (pointerEvents == H.f12291o) {
            View viewE2 = e(fArr, view, EnumSet.of(a.CHILD), list);
            if (viewE2 != null) {
                if (list != null) {
                    list.add(new b(view.getId(), view));
                }
                return viewE2;
            }
            if (!(view instanceof M) || !i(fArr[0], fArr[1], view) || ((M) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new b(view.getId(), view));
            }
            return view;
        }
        if (pointerEvents != H.f12293q) {
            P0.a.G("ReactNative", "Unknown pointer event type: " + pointerEvents.toString());
        }
        if ((view instanceof N) && i(fArr[0], fArr[1], view) && ((N) view).interceptsTouchEvent(fArr[0], fArr[1])) {
            if (list != null) {
                list.add(new b(view.getId(), view));
            }
            return view;
        }
        View viewE3 = e(fArr, view, EnumSet.of(a.SELF, a.CHILD), list);
        if (viewE3 != null && list != null) {
            list.add(new b(view.getId(), view));
        }
        return viewE3;
    }

    private static void g(float f7, float f8, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f7 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f8 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f12594c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f12595d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f9 = fArr[0];
            scrollY = fArr[1];
            scrollX = f9;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int h(View view, float f7, float f8) {
        return view instanceof M ? ((M) view).reactTagForTouch(f7, f8) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(float f7, float f8, View view) {
        if (view instanceof InterfaceC2186c) {
            InterfaceC2186c interfaceC2186c = (InterfaceC2186c) view;
            if (interfaceC2186c.getHitSlopRect() != null) {
                Rect hitSlopRect = interfaceC2186c.getHitSlopRect();
                return f7 >= ((float) (-hitSlopRect.left)) && f7 < ((float) (view.getWidth() + hitSlopRect.right)) && f8 >= ((float) (-hitSlopRect.top)) && f8 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f7 >= 0.0f && f7 < ((float) view.getWidth()) && f8 >= 0.0f && f8 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean j(float f7, float f8, View view) {
        if (!(view instanceof P)) {
            return false;
        }
        Rect overflowInset = ((P) view).getOverflowInset();
        return f7 >= ((float) overflowInset.left) && f7 < ((float) (view.getWidth() - overflowInset.right)) && f8 >= ((float) overflowInset.top) && f8 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
