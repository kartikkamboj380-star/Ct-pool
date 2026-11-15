package com.facebook.react.views.drawer;

import F2.C0349a;
import F2.InterfaceC0350b;
import H.a;
import I2.b;
import I2.c;
import I2.d;
import S1.f;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.e;
import i2.InterfaceC1741a;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactDrawerLayoutManager.REACT_CLASS)
public class ReactDrawerLayoutManager extends ViewGroupManager<com.facebook.react.views.drawer.a> implements InterfaceC0350b {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final A0 mDelegate = new C0349a(this);

    public static class a implements a.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H.a f12761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f12762b;

        public a(H.a aVar, e eVar) {
            this.f12761a = aVar;
            this.f12762b = eVar;
        }

        @Override // H.a.e
        public void a(View view) {
            this.f12762b.c(new b(AbstractC0884k0.f(this.f12761a), this.f12761a.getId()));
        }

        @Override // H.a.e
        public void b(View view) {
            this.f12762b.c(new I2.a(AbstractC0884k0.f(this.f12761a), this.f12761a.getId()));
        }

        @Override // H.a.e
        public void c(int i7) {
            this.f12762b.c(new d(AbstractC0884k0.f(this.f12761a), this.f12761a.getId(), i7));
        }

        @Override // H.a.e
        public void d(View view, float f7) {
            this.f12762b.c(new c(AbstractC0884k0.f(this.f12761a), this.f12761a.getId(), f7));
        }
    }

    private void setDrawerPositionInternal(com.facebook.react.views.drawer.a aVar, String str) {
        if (!str.equals("left")) {
            if (str.equals("right")) {
                aVar.Y(8388613);
                return;
            }
            P0.a.G("ReactNative", "drawerPosition must be 'left' or 'right', received" + str);
        }
        aVar.Y(8388611);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.e("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(f.g("topDrawerSlide", f.d("registrationName", "onDrawerSlide"), "topDrawerOpen", f.d("registrationName", "onDrawerOpen"), "topDrawerClose", f.d("registrationName", "onDrawerClose"), "topDrawerStateChanged", f.d("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return f.d("DrawerPosition", f.e("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, com.facebook.react.views.drawer.a aVar) {
        e eVarC = AbstractC0884k0.c(c0872e0, aVar.getId());
        if (eVarC == null) {
            return;
        }
        aVar.a(new a(aVar, eVarC));
    }

    @Override // F2.InterfaceC0350b
    public void closeDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.drawer.a createViewInstance(C0872e0 c0872e0) {
        return new com.facebook.react.views.drawer.a(c0872e0);
    }

    @Override // F2.InterfaceC0350b
    public void openDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.X();
    }

    @Override // F2.InterfaceC0350b
    @InterfaceC2218a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    @Override // F2.InterfaceC0350b
    @InterfaceC2218a(name = "drawerLockMode")
    public void setDrawerLockMode(com.facebook.react.views.drawer.a aVar, String str) {
        int i7;
        if (str != null && !"unlocked".equals(str)) {
            if ("locked-closed".equals(str)) {
                i7 = 1;
            } else if ("locked-open".equals(str)) {
                i7 = 2;
            } else {
                P0.a.G("ReactNative", "Unknown drawerLockMode " + str);
            }
            aVar.setDrawerLockMode(i7);
            return;
        }
        aVar.setDrawerLockMode(0);
    }

    @InterfaceC2218a(name = "drawerPosition")
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, Dynamic dynamic) {
        String str;
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.Number) {
                int iAsInt = dynamic.asInt();
                if (8388611 == iAsInt || 8388613 == iAsInt) {
                    aVar.Y(iAsInt);
                    return;
                }
                str = "Unknown drawerPosition " + iAsInt;
            } else {
                if (dynamic.getType() == ReadableType.String) {
                    setDrawerPositionInternal(aVar, dynamic.asString());
                    return;
                }
                str = "drawerPosition must be a string or int";
            }
            P0.a.G("ReactNative", str);
        }
        aVar.Y(8388611);
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, float f7) {
        aVar.a0(Float.isNaN(f7) ? -1 : Math.round(G.d(f7)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
    public void setElevation(com.facebook.react.views.drawer.a aVar, float f7) {
        aVar.setDrawerElevation(G.d(f7));
    }

    @Override // F2.InterfaceC0350b
    @InterfaceC2218a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(com.facebook.react.views.drawer.a aVar, String str) {
    }

    @Override // F2.InterfaceC0350b
    @InterfaceC2218a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.facebook.react.views.drawer.a aVar, View view, int i7) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i7 == 0 || i7 == 1) {
            aVar.addView(view, i7);
            aVar.Z();
        } else {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i7 + " instead.");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, int i7, ReadableArray readableArray) {
        if (i7 == 1) {
            aVar.X();
        } else {
            if (i7 != 2) {
                return;
            }
            aVar.W();
        }
    }

    @Override // F2.InterfaceC0350b
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, String str) {
        if (str == null) {
            aVar.Y(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @Override // F2.InterfaceC0350b
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, Float f7) {
        aVar.a0(f7 == null ? -1 : Math.round(G.d(f7.floatValue())));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            aVar.W();
        } else if (str.equals("openDrawer")) {
            aVar.X();
        }
    }
}
