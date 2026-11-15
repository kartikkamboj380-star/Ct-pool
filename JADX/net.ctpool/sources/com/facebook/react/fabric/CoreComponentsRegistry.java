package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class CoreComponentsRegistry {
    public static final a Companion = new a(null);
    private final HybridData mHybridData;

    public static final class a {
        private a() {
        }

        public final CoreComponentsRegistry a(ComponentFactory componentFactory) {
            w5.k.f(componentFactory, "componentFactory");
            return new CoreComponentsRegistry(componentFactory, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.a();
    }

    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(ComponentFactory componentFactory);

    public static final CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return Companion.a(componentFactory);
    }

    public /* synthetic */ CoreComponentsRegistry(ComponentFactory componentFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentFactory);
    }
}
