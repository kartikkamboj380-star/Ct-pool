package com.th3rdwave.safeareacontext;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import i2.InterfaceC1741a;
import j5.AbstractC1787F;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = SafeAreaContextModule.NAME)
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "RNCSafeAreaContext";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        ViewGroup viewGroup = (ViewGroup) ((currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView());
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.content) : null;
        if (viewFindViewById == null) {
            return null;
        }
        com.th3rdwave.safeareacontext.a aVarE = h.e(viewGroup);
        c cVarA = h.a(viewGroup, viewFindViewById);
        if (aVarE == null || cVarA == null) {
            return null;
        }
        return AbstractC1787F.i(i5.q.a("insets", q.a(aVarE)), i5.q.a("frame", q.c(cVarA)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public Map<String, Object> getTypedExportedConstants() {
        return AbstractC1787F.e(i5.q.a("initialWindowMetrics", getInitialWindowMetrics()));
    }
}
