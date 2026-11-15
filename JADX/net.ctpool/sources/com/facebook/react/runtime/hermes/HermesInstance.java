package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class HermesInstance extends JSRuntimeFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12191a = new a(null);

    public static final class a {
        private a() {
        }

        @DoNotStrip
        protected final HybridData initHybrid(Object obj) {
            return HermesInstance.initHybrid(obj);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SoLoader.t("hermesinstancejni");
    }

    public HermesInstance() {
        this(null);
    }

    @DoNotStrip
    protected static final native HybridData initHybrid(Object obj);

    public HermesInstance(ReactNativeConfig reactNativeConfig) {
        super(initHybrid(reactNativeConfig));
    }
}
