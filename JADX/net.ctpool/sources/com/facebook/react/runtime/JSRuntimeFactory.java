package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSRuntimeFactory {
    private static final a Companion = new a(null);
    private final HybridData mHybridData;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSRuntimeFactory(HybridData hybridData) {
        w5.k.f(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }
}
