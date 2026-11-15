package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.W;
import com.facebook.react.views.view.ReactViewManager;
import i2.InterfaceC1741a;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = SafeAreaViewManager.REACT_CLASS)
public final class SafeAreaViewManager extends ReactViewManager {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<p> getShadowNodeClass() {
        return p.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @InterfaceC2218a(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setEdges(k kVar, ReadableMap readableMap) {
        l lVarValueOf;
        l lVarValueOf2;
        l lVarValueOf3;
        l lVarValueOf4;
        w5.k.f(kVar, "view");
        if (readableMap != null) {
            String string = readableMap.getString("top");
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                w5.k.e(upperCase, "toUpperCase(...)");
                lVarValueOf = l.valueOf(upperCase);
                if (lVarValueOf == null) {
                    lVarValueOf = l.f18607m;
                }
            }
            String string2 = readableMap.getString("right");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                w5.k.e(upperCase2, "toUpperCase(...)");
                lVarValueOf2 = l.valueOf(upperCase2);
                if (lVarValueOf2 == null) {
                    lVarValueOf2 = l.f18607m;
                }
            }
            String string3 = readableMap.getString("bottom");
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                w5.k.e(upperCase3, "toUpperCase(...)");
                lVarValueOf3 = l.valueOf(upperCase3);
                if (lVarValueOf3 == null) {
                    lVarValueOf3 = l.f18607m;
                }
            }
            String string4 = readableMap.getString("left");
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                w5.k.e(upperCase4, "toUpperCase(...)");
                lVarValueOf4 = l.valueOf(upperCase4);
                if (lVarValueOf4 == null) {
                    lVarValueOf4 = l.f18607m;
                }
            }
            kVar.setEdges(new m(lVarValueOf, lVarValueOf2, lVarValueOf3, lVarValueOf4));
        }
    }

    @InterfaceC2218a(name = "mode")
    public void setMode(k kVar, String str) {
        o oVar;
        w5.k.f(kVar, "view");
        if (w5.k.b(str, "padding")) {
            oVar = o.f18619m;
        } else if (!w5.k.b(str, "margin")) {
            return;
        } else {
            oVar = o.f18620n;
        }
        kVar.setMode(oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.view.i iVar, W w6, InterfaceC0870d0 interfaceC0870d0) {
        w5.k.f(iVar, "view");
        ((k) iVar).setStateWrapper(interfaceC0870d0);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public p createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public k createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return new k(c0872e0);
    }
}
