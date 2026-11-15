package com.swmansion.rnscreens;

import F2.C0367t;
import F2.InterfaceC0368u;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.gms.common.Scopes;
import com.swmansion.rnscreens.K;
import i2.InterfaceC1741a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = SearchBarManager.REACT_CLASS)
public final class SearchBarManager extends ViewGroupManager<K> implements InterfaceC0368u {
    public static final a Companion = new a(null);
    public static final String REACT_CLASS = "RNSSearchBar";
    private final A0 delegate = new C0367t(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("[RNScreens]", str + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return S1.f.i("topSearchBlur", S1.f.d("registrationName", "onSearchBlur"), "topChangeText", S1.f.d("registrationName", "onChangeText"), "topClose", S1.f.d("registrationName", "onClose"), "topSearchFocus", S1.f.d("registrationName", "onSearchFocus"), "topOpen", S1.f.d("registrationName", "onOpen"), "topSearchButtonPress", S1.f.d("registrationName", "onSearchButtonPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @InterfaceC2218a(name = "autoFocus")
    public final void setAutoFocus(K k7, Boolean bool) {
        w5.k.f(k7, "view");
        k7.setAutoFocus(bool != null ? bool.booleanValue() : false);
    }

    @Override // F2.InterfaceC0368u
    public void blur(K k7) {
        if (k7 != null) {
            k7.z();
        }
    }

    @Override // F2.InterfaceC0368u
    public void cancelSearch(K k7) {
        if (k7 != null) {
            k7.D();
        }
    }

    @Override // F2.InterfaceC0368u
    public void clearText(K k7) {
        if (k7 != null) {
            k7.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public K createViewInstance(C0872e0 c0872e0) {
        w5.k.f(c0872e0, "context");
        return new K(c0872e0);
    }

    @Override // F2.InterfaceC0368u
    public void focus(K k7) {
        if (k7 != null) {
            k7.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(K k7) {
        w5.k.f(k7, "view");
        super.onAfterUpdateTransaction(k7);
        k7.J();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3.equals("none") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoCapitalize(K k7, String str) {
        K.a aVar;
        w5.k.f(k7, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case 3387192:
                    break;
                case 113318569:
                    if (str.equals("words")) {
                        aVar = K.a.f18363n;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 490141296:
                    if (str.equals("sentences")) {
                        aVar = K.a.f18364o;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                case 1245424234:
                    if (str.equals("characters")) {
                        aVar = K.a.f18365p;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden auto capitalize value passed");
            }
        } else {
            aVar = K.a.f18362m;
        }
        k7.setAutoCapitalize(aVar);
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(customType = "Color", name = "barTintColor")
    public void setBarTintColor(K k7, Integer num) {
        w5.k.f(k7, "view");
        k7.setTintColor(num);
    }

    @Override // F2.InterfaceC0368u
    public void setCancelButtonText(K k7, String str) {
        logNotAvailable("cancelButtonText");
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(name = "disableBackButtonOverride")
    public void setDisableBackButtonOverride(K k7, boolean z6) {
        w5.k.f(k7, "view");
        k7.setShouldOverrideBackButton(!z6);
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(customType = "Color", name = "headerIconColor")
    public void setHeaderIconColor(K k7, Integer num) {
        w5.k.f(k7, "view");
        k7.setHeaderIconColor(num);
    }

    @Override // F2.InterfaceC0368u
    public void setHideNavigationBar(K k7, boolean z6) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // F2.InterfaceC0368u
    public void setHideWhenScrolling(K k7, boolean z6) {
        logNotAvailable("hideWhenScrolling");
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(customType = "Color", name = "hintTextColor")
    public void setHintTextColor(K k7, Integer num) {
        w5.k.f(k7, "view");
        k7.setHintTextColor(num);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r3.equals("text") != false) goto L21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInputType(K k7, String str) {
        K.b bVar;
        w5.k.f(k7, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        bVar = K.b.f18370o;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 3556653:
                    break;
                case 96619420:
                    if (str.equals(Scopes.EMAIL)) {
                        bVar = K.b.f18371p;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                case 106642798:
                    if (str.equals("phone")) {
                        bVar = K.b.f18369n;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
                default:
                    throw new JSApplicationIllegalArgumentException("Forbidden input type value");
            }
        } else {
            bVar = K.b.f18368m;
        }
        k7.setInputType(bVar);
    }

    @Override // F2.InterfaceC0368u
    public void setObscureBackground(K k7, boolean z6) {
        logNotAvailable("hideNavigationBar");
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(name = "placeholder")
    public void setPlaceholder(K k7, String str) {
        w5.k.f(k7, "view");
        if (str != null) {
            k7.setPlaceholder(str);
        }
    }

    @Override // F2.InterfaceC0368u
    public void setPlacement(K k7, String str) {
        w5.k.f(k7, "view");
        logNotAvailable("setPlacement");
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(name = "shouldShowHintSearchIcon")
    public void setShouldShowHintSearchIcon(K k7, boolean z6) {
        w5.k.f(k7, "view");
        k7.setShouldShowHintSearchIcon(z6);
    }

    @Override // F2.InterfaceC0368u
    public void setText(K k7, String str) {
        if (k7 != null) {
            k7.F(str);
        }
    }

    @Override // F2.InterfaceC0368u
    @InterfaceC2218a(customType = "Color", name = "textColor")
    public void setTextColor(K k7, Integer num) {
        w5.k.f(k7, "view");
        k7.setTextColor(num);
    }

    @Override // F2.InterfaceC0368u
    public void setTintColor(K k7, Integer num) {
        logNotAvailable("tintColor");
    }

    @Override // F2.InterfaceC0368u
    public void toggleCancelButton(K k7, boolean z6) {
        if (k7 != null) {
            k7.I(z6);
        }
    }
}
