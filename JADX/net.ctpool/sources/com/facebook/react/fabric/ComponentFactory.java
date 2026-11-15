package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentFactory {
    private static final a Companion = new a(null);
    private final HybridData mHybridData = Companion.b();

    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b() {
            return ComponentFactory.initHybrid();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.a();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();
}
