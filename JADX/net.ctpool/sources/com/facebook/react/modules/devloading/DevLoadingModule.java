package com.facebook.react.modules.devloading;

import X1.c;
import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.B;
import com.facebook.react.modules.devloading.DevLoadingModule;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "DevLoadingView")
public final class DevLoadingModule extends NativeDevLoadingViewSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "DevLoadingView";
    private c devLoadingViewManager;
    private final JSExceptionHandler jsExceptionHandler;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLoadingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        JSExceptionHandler jSExceptionHandler = reactApplicationContext.getJSExceptionHandler();
        this.jsExceptionHandler = jSExceptionHandler;
        if (jSExceptionHandler == null || !(jSExceptionHandler instanceof B)) {
            return;
        }
        this.devLoadingViewManager = ((B) jSExceptionHandler).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(DevLoadingModule devLoadingModule) {
        k.f(devLoadingModule, "this$0");
        c cVar = devLoadingModule.devLoadingViewManager;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(DevLoadingModule devLoadingModule, String str) {
        k.f(devLoadingModule, "this$0");
        k.f(str, "$message");
        c cVar = devLoadingModule.devLoadingViewManager;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: o2.a
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.hide$lambda$1(this.f21457m);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevLoadingViewSpec
    public void showMessage(final String str, Double d7, Double d8) {
        k.f(str, "message");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: o2.b
            @Override // java.lang.Runnable
            public final void run() {
                DevLoadingModule.showMessage$lambda$0(this.f21458m, str);
            }
        });
    }
}
