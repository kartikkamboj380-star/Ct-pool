package com.facebook.react.views.swiperefresh;

import F2.C0353e;
import F2.InterfaceC0354f;
import S1.f;
import android.view.View;
import androidx.swiperefreshlayout.widget.c;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.e;
import i2.InterfaceC1741a;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = SwipeRefreshLayoutManager.REACT_CLASS)
public class SwipeRefreshLayoutManager extends ViewGroupManager<com.facebook.react.views.swiperefresh.a> implements InterfaceC0354f {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final A0 mDelegate = new C0353e(this);

    class a implements c.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0872e0 f13000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.swiperefresh.a f13001b;

        a(C0872e0 c0872e0, com.facebook.react.views.swiperefresh.a aVar) {
            this.f13000a = c0872e0;
            this.f13001b = aVar;
        }

        @Override // androidx.swiperefreshlayout.widget.c.j
        public void a() {
            e eVarC = AbstractC0884k0.c(this.f13000a, this.f13001b.getId());
            if (eVarC != null) {
                eVarC.c(new b(AbstractC0884k0.f(this.f13001b), this.f13001b.getId()));
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(f.a().b("topRefresh", f.d("registrationName", "onRefresh")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return f.d("SIZE", f.e("DEFAULT", 1, "LARGE", 0));
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
    public void addEventEmitters(C0872e0 c0872e0, com.facebook.react.views.swiperefresh.a aVar) {
        aVar.setOnRefreshListener(new a(c0872e0, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.swiperefresh.a createViewInstance(C0872e0 c0872e0) {
        return new com.facebook.react.views.swiperefresh.a(c0872e0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.swiperefresh.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @Override // F2.InterfaceC0354f
    @InterfaceC2218a(customType = "ColorArray", name = "colors")
    public void setColors(com.facebook.react.views.swiperefresh.a aVar, ReadableArray readableArray) {
        if (readableArray == null) {
            aVar.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            if (readableArray.getType(i7) == ReadableType.Map) {
                iArr[i7] = ColorPropConverter.getColor(readableArray.getMap(i7), aVar.getContext()).intValue();
            } else {
                iArr[i7] = readableArray.getInt(i7);
            }
        }
        aVar.setColorSchemeColors(iArr);
    }

    @Override // F2.InterfaceC0354f
    @InterfaceC2218a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.swiperefresh.a aVar, boolean z6) {
        aVar.setEnabled(z6);
    }

    @Override // F2.InterfaceC0354f
    public void setNativeRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z6) {
        setRefreshing(aVar, z6);
    }

    @Override // F2.InterfaceC0354f
    @InterfaceC2218a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(com.facebook.react.views.swiperefresh.a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // F2.InterfaceC0354f
    @InterfaceC2218a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(com.facebook.react.views.swiperefresh.a aVar, float f7) {
        aVar.setProgressViewOffset(f7);
    }

    @Override // F2.InterfaceC0354f
    @InterfaceC2218a(name = "refreshing")
    public void setRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z6) {
        aVar.setRefreshing(z6);
    }

    public void setSize(com.facebook.react.views.swiperefresh.a aVar, int i7) {
        aVar.setSize(i7);
    }

    @InterfaceC2218a(name = "size")
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, Dynamic dynamic) {
        int iAsInt;
        if (dynamic.isNull()) {
            iAsInt = 1;
        } else {
            if (dynamic.getType() != ReadableType.Number) {
                if (dynamic.getType() != ReadableType.String) {
                    throw new IllegalArgumentException("Size must be 'default' or 'large'");
                }
                setSize(aVar, dynamic.asString());
                return;
            }
            iAsInt = dynamic.asInt();
        }
        aVar.setSize(iAsInt);
    }

    @Override // F2.InterfaceC0354f
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, String str) {
        int i7;
        if (str == null || str.equals("default")) {
            i7 = 1;
        } else {
            if (!str.equals("large")) {
                throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
            }
            i7 = 0;
        }
        aVar.setSize(i7);
    }
}
