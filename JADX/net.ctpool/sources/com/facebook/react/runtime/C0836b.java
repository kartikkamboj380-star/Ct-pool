package com.facebook.react.runtime;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: renamed from: com.facebook.react.runtime.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0836b extends com.facebook.react.devsupport.B {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final ReactHostImpl f12161F;

    /* JADX INFO: renamed from: com.facebook.react.runtime.b$a */
    class a implements com.facebook.react.devsupport.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactHostImpl f12162a;

        a(ReactHostImpl reactHostImpl) {
            this.f12162a = reactHostImpl;
        }

        @Override // com.facebook.react.devsupport.a0
        public View a(String str) {
            Activity activityJ = j();
            if (activityJ == null || this.f12162a.F0(str)) {
                return null;
            }
            e0 e0VarF = e0.f(activityJ, str, new Bundle());
            e0VarF.c(this.f12162a);
            e0VarF.start();
            return e0VarF.a();
        }

        @Override // com.facebook.react.devsupport.a0
        public JavaScriptExecutorFactory b() {
            throw new IllegalStateException("Not implemented for bridgeless mode");
        }

        @Override // com.facebook.react.devsupport.a0
        public void d(View view) {
        }

        @Override // com.facebook.react.devsupport.a0
        public void h() {
            ReactContext reactContextH0 = this.f12162a.h0();
            if (reactContextH0 != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextH0.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
            }
        }

        @Override // com.facebook.react.devsupport.a0
        public Activity j() {
            return this.f12162a.o0();
        }
    }

    public C0836b(ReactHostImpl reactHostImpl, Context context, String str) {
        super(context.getApplicationContext(), T0(reactHostImpl), str, true, null, null, 2, null, null, null, null);
        this.f12161F = reactHostImpl;
    }

    private static com.facebook.react.devsupport.a0 T0(ReactHostImpl reactHostImpl) {
        return new a(reactHostImpl);
    }

    @Override // com.facebook.react.devsupport.B
    protected String p0() {
        return "Bridgeless";
    }

    @Override // X1.e
    public void q() {
        UiThreadUtil.assertOnUiThread();
        o();
        this.f12161F.A1("BridgelessDevSupportManager.handleReloadJS()");
    }
}
