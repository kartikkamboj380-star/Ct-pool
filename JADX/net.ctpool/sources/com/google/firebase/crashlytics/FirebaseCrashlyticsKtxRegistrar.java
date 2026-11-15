package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import b4.C0688c;
import com.google.firebase.components.ComponentRegistrar;
import j5.AbstractC1809n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        return AbstractC1809n.i();
    }
}
