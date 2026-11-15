package com.facebook.react.defaults;

import android.app.Application;
import android.content.Context;
import com.facebook.react.EnumC0826i;
import com.facebook.react.InterfaceC0917y;
import com.facebook.react.L;
import com.facebook.react.T;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.defaults.c;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.fabric.h;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.ViewManager;
import j5.AbstractC1809n;
import java.util.Collection;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends L {

    public static final class a implements H0 {
        a() {
        }

        @Override // com.facebook.react.uimanager.H0
        public Collection a() {
            return c.this.o().H();
        }

        @Override // com.facebook.react.uimanager.H0
        public ViewManager b(String str) {
            k.f(str, "viewManagerName");
            return c.this.o().y(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected c(Application application) {
        super(application);
        k.f(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager x(c cVar, ReactApplicationContext reactApplicationContext) {
        k.f(cVar, "this$0");
        k.f(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.f11442a.register(componentFactory);
        return new h(componentFactory, ReactNativeConfig.f11713b, cVar.l() ? new G0(cVar.new a()) : new G0(cVar.o().G(reactApplicationContext))).createUIManager(reactApplicationContext);
    }

    public final InterfaceC0917y A(Context context) {
        k.f(context, "context");
        List listM = m();
        k.e(listM, "getPackages(...)");
        String strJ = j();
        k.e(strJ, "getJSMainModuleName(...)");
        String strC = c();
        if (strC == null) {
            strC = "index";
        }
        String str = strC;
        Boolean boolY = y();
        return b.b(context, listM, (64 & 4) != 0 ? "index" : strJ, (64 & 8) == 0 ? str : "index", (64 & 16) != 0 ? true : boolY != null ? boolY.booleanValue() : true, (64 & 32) != 0 ? false : u(), (64 & 64) != 0 ? AbstractC1809n.i() : null);
    }

    @Override // com.facebook.react.L
    protected EnumC0826i h() {
        Boolean boolY = y();
        if (k.b(boolY, Boolean.TRUE)) {
            return EnumC0826i.f11781n;
        }
        if (k.b(boolY, Boolean.FALSE)) {
            return EnumC0826i.f11780m;
        }
        if (boolY == null) {
            return null;
        }
        throw new i5.k();
    }

    @Override // com.facebook.react.L
    protected T.a p() {
        if (z()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // com.facebook.react.L
    protected UIManagerProvider t() {
        if (z()) {
            return new UIManagerProvider() { // from class: W1.b
                @Override // com.facebook.react.bridge.UIManagerProvider
                public final UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
                    return c.x(this.f4165a, reactApplicationContext);
                }
            };
        }
        return null;
    }

    protected abstract Boolean y();

    protected abstract boolean z();
}
