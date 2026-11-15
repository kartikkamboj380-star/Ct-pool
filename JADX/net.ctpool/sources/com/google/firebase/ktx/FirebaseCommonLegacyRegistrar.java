package com.google.firebase.ktx;

import L4.h;
import androidx.annotation.Keep;
import b4.C0688c;
import com.google.firebase.components.ComponentRegistrar;
import j5.AbstractC1809n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        return AbstractC1809n.d(h.b("fire-core-ktx", "21.0.0"));
    }
}
