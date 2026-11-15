package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import i2.InterfaceC1741a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "Clipboard")
public final class ClipboardModule extends NativeClipboardSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "Clipboard";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "context");
    }

    private final ClipboardManager getClipboardService() {
        Object systemService = getReactApplicationContext().getSystemService("clipboard");
        k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void getString(Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            promise.resolve((primaryClip == null || primaryClip.getItemCount() < 1) ? "" : String.valueOf(primaryClip.getItemAt(0).getText()));
        } catch (Exception e7) {
            promise.reject(e7);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void setString(String str) {
        ClipData clipDataNewPlainText = ClipData.newPlainText(null, str);
        k.e(clipDataNewPlainText, "newPlainText(...)");
        getClipboardService().setPrimaryClip(clipDataNewPlainText);
    }
}
