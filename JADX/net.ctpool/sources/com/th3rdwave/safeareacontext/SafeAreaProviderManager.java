package com.th3rdwave.safeareacontext;

import F2.C0359k;
import android.view.View;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import i2.InterfaceC1741a;
import i5.u;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = SafeAreaProviderManager.REACT_CLASS)
public final class SafeAreaProviderManager extends ViewGroupManager<f> {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final C0359k mDelegate = new C0359k(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* synthetic */ class b extends w5.i implements v5.q {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f18582v = new b();

        b() {
            super(3, g.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        @Override // v5.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            l((f) obj, (com.th3rdwave.safeareacontext.a) obj2, (c) obj3);
            return u.f19985a;
        }

        public final void l(f fVar, com.th3rdwave.safeareacontext.a aVar, c cVar) {
            w5.k.f(fVar, "p0");
            w5.k.f(aVar, "p1");
            w5.k.f(cVar, "p2");
            g.b(fVar, aVar, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C0359k getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return AbstractC1787F.j(i5.q.a("topInsetsChange", AbstractC1787F.j(i5.q.a("registrationName", "onInsetsChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, f fVar) {
        w5.k.f(c0872e0, "reactContext");
        w5.k.f(fVar, "view");
        super.addEventEmitters(c0872e0, fVar);
        fVar.setOnInsetsChangeHandler(b.f18582v);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return new f(c0872e0);
    }
}
