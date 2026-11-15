package com.facebook.react.modules.appearance;

import android.content.Context;
import androidx.appcompat.app.f;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.tenjin.android.config.TenjinConsts;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "Appearance")
public final class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final a Companion = new a(null);
    public static final String NAME = "Appearance";
    private String colorScheme;
    private final b overrideColorScheme;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, 2, 0 == true ? 1 : 0);
        k.f(reactApplicationContext, "reactContext");
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) != 32 ? "light" : "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String str) {
        k.f(str, TenjinConsts.EVENT_NAME);
    }

    public final void emitAppearanceChanged(String str) {
        k.f(str, "colorScheme");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(APPEARANCE_CHANGED_EVENT_NAME, writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        k.c(currentActivity);
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentActivity);
        this.colorScheme = strColorSchemeForCurrentConfiguration;
        return strColorSchemeForCurrentConfiguration;
    }

    public final void onConfigurationChanged(Context context) {
        k.f(context, "currentContext");
        String strColorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (k.b(this.colorScheme, strColorSchemeForCurrentConfiguration)) {
            return;
        }
        this.colorScheme = strColorSchemeForCurrentConfiguration;
        emitAppearanceChanged(strColorSchemeForCurrentConfiguration);
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d7) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void setColorScheme(String str) {
        int i7;
        k.f(str, "style");
        int iHashCode = str.hashCode();
        if (iHashCode != -1626174665) {
            if (iHashCode != 3075958) {
                if (iHashCode != 102970646 || !str.equals("light")) {
                    return;
                } else {
                    i7 = 1;
                }
            } else if (!str.equals("dark")) {
                return;
            } else {
                i7 = 2;
            }
        } else if (!str.equals("unspecified")) {
            return;
        } else {
            i7 = -1;
        }
        f.M(i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppearanceModule(ReactApplicationContext reactApplicationContext, b bVar) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        this.colorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }

    public /* synthetic */ AppearanceModule(ReactApplicationContext reactApplicationContext, b bVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, (i7 & 2) != 0 ? null : bVar);
    }
}
