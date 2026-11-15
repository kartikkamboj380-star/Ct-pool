package com.facebook.react.modules.devtoolssettings;

import android.content.SharedPreferences;
import com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeDevToolsSettingsManagerSpec.NAME)
public final class DevToolsSettingsManagerModule extends NativeDevToolsSettingsManagerSpec {
    private static final a Companion = new a(null);
    private static final String KEY_CONSOLE_PATCH_SETTINGS = "ConsolePatchSettings";
    private static final String KEY_PROFILING_SETTINGS = "ProfilingSettings";
    private static final String SHARED_PREFERENCES_PREFIX = "ReactNative__DevToolsSettings";
    private final SharedPreferences sharedPreferences;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevToolsSettingsManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        SharedPreferences sharedPreferences = reactApplicationContext.getSharedPreferences(SHARED_PREFERENCES_PREFIX, 0);
        k.e(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getConsolePatchSettings() {
        return this.sharedPreferences.getString(KEY_CONSOLE_PATCH_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public String getProfilingSettings() {
        return this.sharedPreferences.getString(KEY_PROFILING_SETTINGS, null);
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setConsolePatchSettings(String str) {
        this.sharedPreferences.edit().putString(KEY_CONSOLE_PATCH_SETTINGS, str).apply();
    }

    @Override // com.facebook.fbreact.specs.NativeDevToolsSettingsManagerSpec
    public void setProfilingSettings(String str) {
        this.sharedPreferences.edit().putString(KEY_PROFILING_SETTINGS, str).apply();
    }
}
