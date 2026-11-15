package com.zoontek.rnlocalize;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import f5.AbstractC1662i;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNLocalize")
public class RNLocalizeModule extends ReactContextBaseJavaModule {
    public RNLocalizeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCalendar() {
        return AbstractC1662i.b();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCountry() {
        return AbstractC1662i.c(getReactApplicationContext());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getCurrencies() {
        return AbstractC1662i.e(getReactApplicationContext());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getLocales() {
        return AbstractC1662i.h(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNLocalize";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getNumberFormatSettings() {
        return AbstractC1662i.j(getReactApplicationContext());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTemperatureUnit() {
        return AbstractC1662i.n(getReactApplicationContext());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTimeZone() {
        return AbstractC1662i.o();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean uses24HourClock() {
        return AbstractC1662i.p(getReactApplicationContext());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public Boolean usesAutoDateAndTime() {
        return Boolean.valueOf(AbstractC1662i.q(getReactApplicationContext()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public Boolean usesAutoTimeZone() {
        return Boolean.valueOf(AbstractC1662i.r(getReactApplicationContext()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean usesMetricSystem() {
        return AbstractC1662i.s(getReactApplicationContext());
    }
}
