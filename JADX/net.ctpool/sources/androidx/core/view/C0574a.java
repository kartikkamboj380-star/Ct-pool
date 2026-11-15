package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import u.AbstractC2078c;

/* JADX INFO: renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0574a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f7335c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f7336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f7337b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0145a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0574a f7338a;

        C0145a(C0574a c0574a) {
            this.f7338a = c0574a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7338a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.D dB = this.f7338a.b(view);
            if (dB != null) {
                return (AccessibilityNodeProvider) dB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7338a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.C cN0 = androidx.core.view.accessibility.C.N0(accessibilityNodeInfo);
            cN0.A0(H.W(view));
            cN0.p0(H.R(view));
            cN0.v0(H.p(view));
            cN0.G0(H.J(view));
            this.f7338a.g(view, cN0);
            cN0.f(accessibilityNodeInfo.getText(), view);
            List listC = C0574a.c(view);
            for (int i7 = 0; i7 < listC.size(); i7++) {
                cN0.b((C.a) listC.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f7338a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f7338a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f7338a.j(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f7338a.l(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f7338a.m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a$b */
    static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i7, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i7, bundle);
        }
    }

    public C0574a() {
        this(f7335c);
    }

    static List c(View view) {
        List list = (List) view.getTag(AbstractC2078c.f22349H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrQ = androidx.core.view.accessibility.C.q(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; clickableSpanArrQ != null && i7 < clickableSpanArrQ.length; i7++) {
                if (clickableSpan.equals(clickableSpanArrQ[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC2078c.f22350I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7336a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.D b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f7336a, view);
        if (accessibilityNodeProviderA != null) {
            return new androidx.core.view.accessibility.D(accessibilityNodeProviderA);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f7337b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f7336a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.C c7) {
        this.f7336a.onInitializeAccessibilityNodeInfo(view, c7.M0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f7336a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7336a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i7, Bundle bundle) {
        List listC = c(view);
        boolean zB = false;
        int i8 = 0;
        while (true) {
            if (i8 >= listC.size()) {
                break;
            }
            C.a aVar = (C.a) listC.get(i8);
            if (aVar.b() == i7) {
                zB = aVar.d(view, bundle);
                break;
            }
            i8++;
        }
        if (!zB) {
            zB = b.b(this.f7336a, view, i7, bundle);
        }
        return (zB || i7 != AbstractC2078c.f22361a || bundle == null) ? zB : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i7) {
        this.f7336a.sendAccessibilityEvent(view, i7);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f7336a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0574a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7336a = accessibilityDelegate;
        this.f7337b = new C0145a(this);
    }
}
