package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.toast.ToastModule;
import i2.InterfaceC1741a;
import i5.q;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "ToastAndroid")
public final class ToastModule extends NativeToastAndroidSpec {
    public static final a Companion = new a(null);
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule toastModule, String str, int i7) {
        k.f(toastModule, "this$0");
        Toast.makeText(toastModule.getReactApplicationContext(), str, i7).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i7, int i8) {
        k.f(toastModule, "this$0");
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i7);
        toastMakeText.setGravity(i8, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i7, int i8, int i9, int i10) {
        k.f(toastModule, "this$0");
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i7);
        toastMakeText.setGravity(i8, i9, i10);
        toastMakeText.show();
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC1787F.j(q.a(DURATION_SHORT_KEY, 0), q.a(DURATION_LONG_KEY, 1), q.a(GRAVITY_TOP_KEY, 49), q.a(GRAVITY_BOTTOM_KEY, 81), q.a(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(final String str, double d7) {
        final int i7 = (int) d7;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: r2.c
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.show$lambda$0(this.f22130m, str, i7);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(final String str, double d7, double d8) {
        final int i7 = (int) d7;
        final int i8 = (int) d8;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: r2.b
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravity$lambda$1(this.f22126m, str, i7, i8);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(final String str, double d7, double d8, double d9, double d10) {
        final int i7 = (int) d7;
        final int i8 = (int) d8;
        final int i9 = (int) d9;
        final int i10 = (int) d10;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: r2.a
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(this.f22120m, str, i7, i8, i9, i10);
            }
        });
    }
}
