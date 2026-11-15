package com.facebook.react.views.switchview;

import F2.C0355g;
import F2.InterfaceC0356h;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> implements InterfaceC0356h {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final A0 mDelegate = new C0355g(this);

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id = compoundButton.getId();
            AbstractC0884k0.c(reactContext, id).c(new com.facebook.react.views.switchview.b(AbstractC0884k0.e(reactContext), id, z6));
        }
    }

    static class b extends C0895v implements o {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f13010A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f13011B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private boolean f13012C;

        private b() {
            x1();
        }

        private void x1() {
            Y0(this);
        }

        @Override // com.facebook.yoga.o
        public long V(r rVar, float f7, p pVar, float f8, p pVar2) {
            if (!this.f13012C) {
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(G());
                aVar.setShowText(false);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.f13010A = aVar.getMeasuredWidth();
                this.f13011B = aVar.getMeasuredHeight();
                this.f13012C = true;
            }
            return q.b(this.f13010A, this.f13011B);
        }
    }

    private static void setValueInternal(com.facebook.react.views.switchview.a aVar, boolean z6) {
        aVar.setOnCheckedChangeListener(null);
        aVar.t(z6);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, p pVar, float f8, p pVar2, float[] fArr) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(context);
        aVar.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return q.a(G.b(aVar.getMeasuredWidth()), G.b(aVar.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.switchview.a createViewInstance(C0872e0 c0872e0) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(c0872e0);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.switchview.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z6 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z6 = true;
            }
            setValueInternal(aVar, z6);
        }
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.facebook.react.views.switchview.a aVar, boolean z6) {
        aVar.setEnabled(!z6);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z6) {
        aVar.setEnabled(z6);
    }

    @Override // F2.InterfaceC0356h
    public void setNativeValue(com.facebook.react.views.switchview.a aVar, boolean z6) {
        setValueInternal(aVar, z6);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(name = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z6) {
        setValueInternal(aVar, z6);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(customType = "Color", name = "thumbColor")
    public void setThumbColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.u(num);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.x(num);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.y(num);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.v(num);
    }

    @Override // F2.InterfaceC0356h
    @InterfaceC2218a(name = "value")
    public void setValue(com.facebook.react.views.switchview.a aVar, boolean z6) {
        setValueInternal(aVar, z6);
    }
}
