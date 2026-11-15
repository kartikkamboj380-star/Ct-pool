package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
public final class JSCInstance extends JSRuntimeFactory {
    private static final a Companion = new a(null);

    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotStrip
        public final HybridData initHybrid() {
            return JSCInstance.initHybrid();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SoLoader.t("jscinstance");
    }

    public JSCInstance() {
        super(Companion.initHybrid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotStrip
    public static final native HybridData initHybrid();
}
