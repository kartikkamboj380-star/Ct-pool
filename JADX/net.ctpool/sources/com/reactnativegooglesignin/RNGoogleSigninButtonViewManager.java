package com.reactnativegooglesignin;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.google.android.gms.common.SignInButton;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class RNGoogleSigninButtonViewManager extends SimpleViewManager<SignInButton> {
    public static final String MODULE_NAME = "RNGoogleSigninButton";
    private static final View.OnClickListener mOnClickListener = new View.OnClickListener() { // from class: com.reactnativegooglesignin.e
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RNGoogleSigninButtonViewManager.lambda$static$0(view);
        }
    };
    private final A0 mDelegate = new d(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(View view) {
        ReactContext reactContext = (ReactContext) view.getContext();
        int id = view.getId();
        AbstractC0884k0.c(reactContext, id).c(new n(AbstractC0884k0.e(reactContext), id));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.put("topPress", S1.f.d("phasedRegistrationNames", S1.f.d("bubbled", "onPress")));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, SignInButton signInButton) {
        signInButton.setOnClickListener(mOnClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SignInButton createViewInstance(C0872e0 c0872e0) {
        return new SignInButton(c0872e0);
    }

    @InterfaceC2218a(name = "color")
    public void setColor(SignInButton signInButton, String str) {
        signInButton.setColorScheme(str == null ? 2 : !"dark".equals(str) ? 1 : 0);
    }

    @InterfaceC2218a(name = "disabled")
    public void setDisabled(SignInButton signInButton, boolean z6) {
        signInButton.setEnabled(!z6);
    }

    @InterfaceC2218a(name = "size")
    public void setSize(SignInButton signInButton, int i7) {
        signInButton.setSize(i7);
    }
}
