package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class DefaultComponentsRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11442a = new a(null);

    @R1.a
    private final HybridData mHybridData;

    public static final class a {
        private a() {
        }

        @R1.a
        public final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
            k.f(componentFactory, "componentFactory");
            return new DefaultComponentsRegistry(componentFactory, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.f11459a.a();
    }

    @R1.a
    private DefaultComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @R1.a
    private final native HybridData initHybrid(ComponentFactory componentFactory);

    @R1.a
    public static final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
        return f11442a.register(componentFactory);
    }

    public /* synthetic */ DefaultComponentsRegistry(ComponentFactory componentFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentFactory);
    }
}
