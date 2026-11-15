package com.swmansion.rnscreens;

import F2.C0365q;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.rnscreens.y;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<y> implements F2.r {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final A0 delegate = new C0365q(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.delegate;
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
    public y createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return new y(c0872e0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // F2.r
    @InterfaceC2218a(name = "type")
    public void setType(y yVar, String str) {
        y.a aVar;
        w5.k.f(yVar, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        aVar = y.a.f18557n;
                        yVar.setType(aVar);
                        return;
                    }
                    break;
                case 3015911:
                    if (str.equals("back")) {
                        aVar = y.a.f18559p;
                        yVar.setType(aVar);
                        return;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        aVar = y.a.f18556m;
                        yVar.setType(aVar);
                        return;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        aVar = y.a.f18558o;
                        yVar.setType(aVar);
                        return;
                    }
                    break;
                case 1778179403:
                    if (str.equals("searchBar")) {
                        aVar = y.a.f18560q;
                        yVar.setType(aVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + str);
    }
}
