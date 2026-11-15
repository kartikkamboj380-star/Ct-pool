package com.facebook.react.modules.dialog;

import S1.f;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.w;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import i2.InterfaceC1741a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeDialogManagerAndroidSpec.NAME)
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = f.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c f11886m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f11887n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Callback f11888o;

        a(c cVar, Bundle bundle, Callback callback) {
            this.f11886m = cVar;
            this.f11887n = bundle;
            this.f11888o = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11886m.b(this.f11887n, this.f11888o);
        }
    }

    class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Callback f11890m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11891n = false;

        public b(Callback callback) {
            this.f11890m = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            if (this.f11891n || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f11890m.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i7));
            this.f11891n = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f11891n || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f11890m.invoke(DialogModule.ACTION_DISMISSED);
            this.f11891n = true;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w f11893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f11894b;

        public c(w wVar) {
            this.f11893a = wVar;
        }

        private void a() {
            com.facebook.react.modules.dialog.a aVar;
            if (DialogModule.this.mIsInForeground && (aVar = (com.facebook.react.modules.dialog.a) this.f11893a.k0(DialogModule.FRAGMENT_TAG)) != null && aVar.isResumed()) {
                aVar.dismiss();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.a aVar = new com.facebook.react.modules.dialog.a(callback != null ? DialogModule.this.new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f11893a.Q0()) {
                this.f11894b = aVar;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                aVar.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            aVar.show(this.f11893a, DialogModule.FRAGMENT_TAG);
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f11894b == null) {
                return;
            }
            a();
            ((com.facebook.react.modules.dialog.a) this.f11894b).show(this.f11893a, DialogModule.FRAGMENT_TAG);
            this.f11894b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC0640j)) {
            return null;
        }
        return new c(((AbstractActivityC0640j) currentActivity).O());
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            P0.a.C(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i7 = 0; i7 < array.size(); i7++) {
                charSequenceArr[i7] = array.getString(i7);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(fragmentManagerHelper, bundle, callback2));
    }
}
