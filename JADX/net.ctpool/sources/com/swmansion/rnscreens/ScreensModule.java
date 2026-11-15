package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import c5.C0745h;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.AbstractC0884k0;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNSModule")
public final class ScreensModule extends NativeScreensModuleSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "RNSModule";
    private final AtomicBoolean isActiveTransition;
    private AbstractC1595h proxy;
    private final ReactApplicationContext reactContext;
    private int topScreenId;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreensModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        w5.k.f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
        this.topScreenId = -1;
        this.isActiveTransition = new AtomicBoolean(false);
        try {
            System.loadLibrary("rnscreens");
            JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
            if (javaScriptContextHolder != null) {
                nativeInstall(javaScriptContextHolder.get());
            } else {
                Log.e("[RNScreens]", "Could not install JSI bindings.");
            }
        } catch (UnsatisfiedLinkError unused) {
            Log.w("[RNScreens]", "Could not load RNScreens module.");
        }
    }

    @R1.a
    private final void finishTransition(Integer num, boolean z6) {
        UiThreadUtil.assertOnUiThread();
        if (!this.isActiveTransition.get() || num == null) {
            Log.e("[RNScreens]", "Unable to call `finishTransition` method before transition start.");
            return;
        }
        UIManager uIManagerI = AbstractC0884k0.i(this.reactContext, num.intValue());
        View viewResolveView = uIManagerI != null ? uIManagerI.resolveView(num.intValue()) : null;
        if (viewResolveView instanceof t) {
            t tVar = (t) viewResolveView;
            if (z6) {
                tVar.h();
            } else {
                tVar.q();
            }
            this.isActiveTransition.set(false);
        }
        this.topScreenId = -1;
    }

    private final native void nativeInstall(long j7);

    @R1.a
    private final int[] startTransition(Integer num) {
        t tVar;
        ArrayList<v> fragments;
        int size;
        UiThreadUtil.assertOnUiThread();
        if (this.isActiveTransition.get() || num == null) {
            return new int[]{-1, -1};
        }
        this.topScreenId = -1;
        int[] iArr = {-1, -1};
        UIManager uIManagerI = AbstractC0884k0.i(this.reactContext, num.intValue());
        View viewResolveView = uIManagerI != null ? uIManagerI.resolveView(num.intValue()) : null;
        if ((viewResolveView instanceof t) && (size = (fragments = (tVar = (t) viewResolveView).getFragments()).size()) > 1) {
            this.isActiveTransition.set(true);
            tVar.e();
            int id = fragments.get(size - 1).g().getId();
            this.topScreenId = id;
            iArr[0] = id;
            iArr[1] = fragments.get(size - 2).g().getId();
        }
        return iArr;
    }

    @R1.a
    private final void updateTransition(double d7) {
        UiThreadUtil.assertOnUiThread();
        if (this.topScreenId == -1) {
            return;
        }
        float f7 = (float) d7;
        short sA = q.f18485t.a(f7);
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(this.reactContext, this.topScreenId);
        if (eVarC != null) {
            eVarC.c(new C0745h(AbstractC0884k0.e(this.reactContext), this.topScreenId, f7, true, true, sA));
        }
    }

    @Override // com.swmansion.rnscreens.NativeScreensModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }
}
