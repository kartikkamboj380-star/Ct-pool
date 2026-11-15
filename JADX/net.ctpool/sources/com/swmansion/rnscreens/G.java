package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.InterfaceC0880i0;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes.dex */
public final class G extends C0895v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ReactContext f18345A;

    public G(ReactContext reactContext) {
        w5.k.f(reactContext, "context");
        this.f18345A = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(G g7, com.facebook.react.uimanager.C c7) {
        w5.k.f(g7, "this$0");
        w5.k.f(c7, "nativeViewHierarchyManager");
        View viewV = c7.v(g7.r());
        if (viewV instanceof n) {
            ((n) viewV).u();
        }
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void W(com.facebook.react.uimanager.D d7) {
        w5.k.f(d7, "nativeViewHierarchyOptimizer");
        super.W(d7);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f18345A.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new InterfaceC0880i0() { // from class: com.swmansion.rnscreens.F
                @Override // com.facebook.react.uimanager.InterfaceC0880i0
                public final void a(com.facebook.react.uimanager.C c7) {
                    G.y1(this.f18344a, c7);
                }
            });
        }
    }
}
