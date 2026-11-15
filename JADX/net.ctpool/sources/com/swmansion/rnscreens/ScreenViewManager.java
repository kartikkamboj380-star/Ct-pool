package com.swmansion.rnscreens;

import F2.C0361m;
import F2.InterfaceC0362n;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.swmansion.rnscreens.C1599l;
import i2.InterfaceC1741a;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ScreenViewManager.REACT_CLASS)
public class ScreenViewManager extends ViewGroupManager<C1599l> implements InterfaceC0362n {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreen";
    private final A0 delegate = new C0361m(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC1787F.j(i5.q.a("topDismissed", S1.f.d("registrationName", "onDismissed")), i5.q.a("topWillAppear", S1.f.d("registrationName", "onWillAppear")), i5.q.a("topAppear", S1.f.d("registrationName", "onAppear")), i5.q.a("topWillDisappear", S1.f.d("registrationName", "onWillDisappear")), i5.q.a("topDisappear", S1.f.d("registrationName", "onDisappear")), i5.q.a("topHeaderHeightChange", S1.f.d("registrationName", "onHeaderHeightChange")), i5.q.a("topHeaderBackButtonClicked", S1.f.d("registrationName", "onHeaderBackButtonClicked")), i5.q.a("topTransitionProgress", S1.f.d("registrationName", "onTransitionProgress")));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1599l createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "reactContext");
        return new C1599l(c0872e0);
    }

    @Override // F2.InterfaceC0362n
    public void setActivityState(C1599l c1599l, float f7) {
        w5.k.f(c1599l, "view");
        setActivityState(c1599l, (int) f7);
    }

    @Override // F2.InterfaceC0362n
    public void setCustomAnimationOnSwipe(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    public void setFullScreenSwipeEnabled(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    public void setFullScreenSwipeShadowEnabled(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setGestureEnabled(z6);
    }

    @Override // F2.InterfaceC0362n
    public void setGestureResponseDistance(C1599l c1599l, ReadableMap readableMap) {
    }

    @Override // F2.InterfaceC0362n
    public void setHideKeyboardOnSwipe(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    public void setHomeIndicatorHidden(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setNativeBackButtonDismissalEnabled(z6);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C1599l c1599l, Integer num) {
        w5.k.f(c1599l, "view");
        c1599l.setNavigationBarColor(num);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "navigationBarHidden")
    public void setNavigationBarHidden(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setNavigationBarHidden(Boolean.valueOf(z6));
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setNavigationBarTranslucent(Boolean.valueOf(z6));
    }

    @Override // F2.InterfaceC0362n
    public void setPreventNativeDismiss(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "replaceAnimation")
    public void setReplaceAnimation(C1599l c1599l, String str) {
        C1599l.b bVar;
        w5.k.f(c1599l, "view");
        if (str == null ? true : w5.k.b(str, "pop")) {
            bVar = C1599l.b.f18441n;
        } else {
            if (!w5.k.b(str, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
            }
            bVar = C1599l.b.f18440m;
        }
        c1599l.setReplaceAnimation(bVar);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "screenOrientation")
    public void setScreenOrientation(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
        c1599l.setScreenOrientation(str);
    }

    @Override // F2.InterfaceC0362n
    public void setSheetAllowedDetents(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
    }

    @Override // F2.InterfaceC0362n
    public void setSheetCornerRadius(C1599l c1599l, float f7) {
    }

    @Override // F2.InterfaceC0362n
    public void setSheetExpandsWhenScrolledToEdge(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    public void setSheetGrabberVisible(C1599l c1599l, boolean z6) {
    }

    @Override // F2.InterfaceC0362n
    public void setSheetLargestUndimmedDetent(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals("default") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r4.equals("flip") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r4.equals("simple_push") != false) goto L39;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackAnimation(C1599l c1599l, String str) {
        C1599l.c cVar;
        w5.k.f(c1599l, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1418955385:
                    break;
                case -427095442:
                    if (str.equals("slide_from_left")) {
                        cVar = C1599l.c.f18449r;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case -349395819:
                    if (str.equals("slide_from_right")) {
                        cVar = C1599l.c.f18448q;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 104461:
                    if (str.equals("ios")) {
                        cVar = C1599l.c.f18451t;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 3135100:
                    if (str.equals("fade")) {
                        cVar = C1599l.c.f18446o;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 3145837:
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        cVar = C1599l.c.f18445n;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 182437661:
                    if (str.equals("fade_from_bottom")) {
                        cVar = C1599l.c.f18450s;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                case 1544803905:
                    break;
                case 1601504978:
                    if (str.equals("slide_from_bottom")) {
                        cVar = C1599l.c.f18447p;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
                default:
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + str);
            }
        } else {
            cVar = C1599l.c.f18444m;
        }
        c1599l.setStackAnimation(cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.equals("containedModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4.equals("modal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r4 = com.swmansion.rnscreens.C1599l.d.f18455n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r4.equals("transparentModal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r4 = com.swmansion.rnscreens.C1599l.d.f18456o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4.equals("formSheet") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackPresentation(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -76271493:
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        C1599l.d dVar = C1599l.d.f18454m;
                        c1599l.setStackPresentation(dVar);
                        return;
                    }
                    break;
                case 104069805:
                    break;
                case 438078970:
                    break;
                case 955284238:
                    break;
                case 1171936146:
                    break;
                case 1798290171:
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + str);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "statusBarAnimation")
    public void setStatusBarAnimation(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
        c1599l.setStatusBarAnimated(Boolean.valueOf((str == null || w5.k.b("none", str)) ? false : true));
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C1599l c1599l, Integer num) {
        w5.k.f(c1599l, "view");
        c1599l.setStatusBarColor(num);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "statusBarHidden")
    public void setStatusBarHidden(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setStatusBarHidden(Boolean.valueOf(z6));
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "statusBarStyle")
    public void setStatusBarStyle(C1599l c1599l, String str) {
        w5.k.f(c1599l, "view");
        c1599l.setStatusBarStyle(str);
    }

    @Override // F2.InterfaceC0362n
    @InterfaceC2218a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C1599l c1599l, boolean z6) {
        w5.k.f(c1599l, "view");
        c1599l.setStatusBarTranslucent(Boolean.valueOf(z6));
    }

    @Override // F2.InterfaceC0362n
    public void setSwipeDirection(C1599l c1599l, String str) {
    }

    @Override // F2.InterfaceC0362n
    public void setTransitionDuration(C1599l c1599l, int i7) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C1599l c1599l, W w6, InterfaceC0870d0 interfaceC0870d0) {
        w5.k.f(c1599l, "view");
        return super.updateState(c1599l, w6, interfaceC0870d0);
    }

    @InterfaceC2218a(name = "activityState")
    public final void setActivityState(C1599l c1599l, int i7) {
        C1599l.a aVar;
        w5.k.f(c1599l, "view");
        if (i7 == -1) {
            return;
        }
        if (i7 == 0) {
            aVar = C1599l.a.f18435m;
        } else if (i7 == 1) {
            aVar = C1599l.a.f18436n;
        } else if (i7 != 2) {
            return;
        } else {
            aVar = C1599l.a.f18437o;
        }
        c1599l.setActivityState(aVar);
    }
}
