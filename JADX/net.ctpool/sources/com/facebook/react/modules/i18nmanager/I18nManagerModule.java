package com.facebook.react.modules.i18nmanager;

import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.i18nmanager.a;
import i2.InterfaceC1741a;
import i5.q;
import j5.AbstractC1787F;
import java.util.Locale;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeI18nManagerSpec.NAME)
public final class I18nManagerModule extends NativeI18nManagerSpec {
    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z6) {
        a aVarA = a.f11899a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        k.e(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.b(reactApplicationContext, z6);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z6) {
        a aVarA = a.f11899a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        k.e(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.e(reactApplicationContext, z6);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Locale locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        a.C0215a c0215a = a.f11899a;
        a aVarA = c0215a.a();
        k.c(reactApplicationContext);
        return AbstractC1787F.i(q.a("isRTL", Boolean.valueOf(aVarA.i(reactApplicationContext))), q.a("doLeftAndRightSwapInRTL", Boolean.valueOf(c0215a.a().d(reactApplicationContext))), q.a("localeIdentifier", locale.toString()));
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z6) {
        a aVarA = a.f11899a.a();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        k.e(reactApplicationContext, "getReactApplicationContext(...)");
        aVarA.m(reactApplicationContext, z6);
    }
}
