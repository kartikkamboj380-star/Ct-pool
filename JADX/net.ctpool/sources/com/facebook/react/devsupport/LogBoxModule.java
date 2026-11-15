package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "LogBox")
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "LogBox";
    private final X1.e devSupportManager;
    private final S1.i surfaceDelegate;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, X1.e eVar) {
        super(reactApplicationContext);
        w5.k.f(eVar, "devSupportManager");
        this.devSupportManager = eVar;
        S1.i iVarC = eVar.c("LogBox");
        this.surfaceDelegate = iVarC == null ? new N(eVar) : iVarC;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.P
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule._init_$lambda$0(this.f11549m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(LogBoxModule logBoxModule) {
        w5.k.f(logBoxModule, "this$0");
        logBoxModule.surfaceDelegate.f("LogBox");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$2(LogBoxModule logBoxModule) {
        w5.k.f(logBoxModule, "this$0");
        logBoxModule.surfaceDelegate.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidate$lambda$3(LogBoxModule logBoxModule) {
        w5.k.f(logBoxModule, "this$0");
        logBoxModule.surfaceDelegate.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(LogBoxModule logBoxModule) {
        w5.k.f(logBoxModule, "this$0");
        logBoxModule.surfaceDelegate.b();
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.O
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.hide$lambda$2(this.f11548m);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.Q
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.invalidate$lambda$3(this.f11550m);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        if (this.surfaceDelegate.d()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.S
                @Override // java.lang.Runnable
                public final void run() {
                    LogBoxModule.show$lambda$1(this.f11551m);
                }
            });
        }
    }
}
