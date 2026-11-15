package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7393a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final D f7394a;

        a(D d7) {
            this.f7394a = d7;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
            C cB = this.f7394a.b(i7);
            if (cB == null) {
                return null;
            }
            return cB.M0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i7) {
            List listC = this.f7394a.c(str, i7);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((C) listC.get(i8)).M0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i7, int i8, Bundle bundle) {
            return this.f7394a.f(i7, i8, bundle);
        }
    }

    static class b extends a {
        b(D d7) {
            super(d7);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i7) {
            C cD = this.f7394a.d(i7);
            if (cD == null) {
                return null;
            }
            return cD.M0();
        }
    }

    static class c extends b {
        c(D d7) {
            super(d7);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f7394a.a(i7, C.N0(accessibilityNodeInfo), str, bundle);
        }
    }

    public D() {
        this.f7393a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public void a(int i7, C c7, String str, Bundle bundle) {
    }

    public C b(int i7) {
        return null;
    }

    public List c(String str, int i7) {
        return null;
    }

    public C d(int i7) {
        return null;
    }

    public Object e() {
        return this.f7393a;
    }

    public boolean f(int i7, int i8, Bundle bundle) {
        return false;
    }

    public D(Object obj) {
        this.f7393a = obj;
    }
}
