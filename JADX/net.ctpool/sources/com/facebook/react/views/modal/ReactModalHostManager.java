package com.facebook.react.views.modal;

import F2.C0357i;
import F2.InterfaceC0358j;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.views.modal.f;
import i2.InterfaceC1741a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactModalHostManager.REACT_CLASS)
public final class ReactModalHostManager extends ViewGroupManager<f> implements InterfaceC0358j {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RCTModalHostView";
    private final A0 delegate = new C0357i(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(com.facebook.react.uimanager.events.e eVar, C0872e0 c0872e0, f fVar, DialogInterface dialogInterface) {
        k.f(c0872e0, "$reactContext");
        k.f(fVar, "$view");
        eVar.c(new g(AbstractC0884k0.e(c0872e0), fVar.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(com.facebook.react.uimanager.events.e eVar, C0872e0 c0872e0, f fVar, DialogInterface dialogInterface) {
        k.f(c0872e0, "$reactContext");
        k.f(fVar, "$view");
        eVar.c(new h(AbstractC0884k0.e(c0872e0), fVar.getId()));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public A0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        Map mapA = S1.f.a().b("topRequestClose", S1.f.d("registrationName", "onRequestClose")).b("topShow", S1.f.d("registrationName", "onShow")).b("topDismiss", S1.f.d("registrationName", "onDismiss")).b("topOrientationChange", S1.f.d("registrationName", "onOrientationChange")).a();
        k.e(mapA, "build(...)");
        exportedCustomDirectEventTypeConstants.putAll(mapA);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C0895v> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final C0872e0 c0872e0, final f fVar) {
        k.f(c0872e0, "reactContext");
        k.f(fVar, "view");
        final com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(c0872e0, fVar.getId());
        if (eVarC != null) {
            fVar.setOnRequestCloseListener(new f.c() { // from class: com.facebook.react.views.modal.c
                @Override // com.facebook.react.views.modal.f.c
                public final void a(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$0(eVarC, c0872e0, fVar, dialogInterface);
                }
            });
            fVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.d
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(eVarC, c0872e0, fVar, dialogInterface);
                }
            });
            fVar.setEventDispatcher(eVarC);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(C0872e0 c0872e0) {
        k.f(c0872e0, "reactContext");
        return new f(c0872e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(f fVar) {
        k.f(fVar, "view");
        super.onAfterUpdateTransaction(fVar);
        fVar.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(f fVar) {
        k.f(fVar, "view");
        super.onDropViewInstance(fVar);
        fVar.b();
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "animated")
    public void setAnimated(f fVar, boolean z6) {
        k.f(fVar, "view");
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "animationType")
    public void setAnimationType(f fVar, String str) {
        k.f(fVar, "view");
        if (str != null) {
            fVar.setAnimationType(str);
        }
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(f fVar, boolean z6) {
        k.f(fVar, "view");
        fVar.setHardwareAccelerated(z6);
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "identifier")
    public void setIdentifier(f fVar, int i7) {
        k.f(fVar, "view");
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "presentationStyle")
    public void setPresentationStyle(f fVar, String str) {
        k.f(fVar, "view");
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(f fVar, boolean z6) {
        k.f(fVar, "view");
        fVar.setStatusBarTranslucent(z6);
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "supportedOrientations")
    public void setSupportedOrientations(f fVar, ReadableArray readableArray) {
        k.f(fVar, "view");
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "transparent")
    public void setTransparent(f fVar, boolean z6) {
        k.f(fVar, "view");
        fVar.setTransparent(z6);
    }

    @Override // F2.InterfaceC0358j
    @InterfaceC2218a(name = "visible")
    public void setVisible(f fVar, boolean z6) {
        k.f(fVar, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(f fVar, W w6, InterfaceC0870d0 interfaceC0870d0) {
        k.f(fVar, "view");
        k.f(w6, "props");
        k.f(interfaceC0870d0, "stateWrapper");
        fVar.setStateWrapper(interfaceC0870d0);
        Context context = fVar.getContext();
        k.e(context, "getContext(...)");
        Point pointA = com.facebook.react.views.modal.a.a(context);
        fVar.e(pointA.x, pointA.y);
        return null;
    }
}
