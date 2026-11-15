package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.devsupport.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801e implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f11615a = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.devsupport.e$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.devsupport.F
    public X1.e a(Context context, a0 a0Var, String str, boolean z6, X1.i iVar, X1.b bVar, int i7, Map map, S1.j jVar, X1.c cVar, X1.h hVar) {
        w5.k.f(context, "applicationContext");
        w5.k.f(a0Var, "reactInstanceManagerHelper");
        if (!z6) {
            return new f0();
        }
        try {
            String str2 = "com.facebook.react.devsupport.BridgeDevSupportManager";
            w5.k.e(str2, "toString(...)");
            Object objNewInstance = Class.forName(str2).getConstructor(Context.class, a0.class, String.class, Boolean.TYPE, X1.i.class, X1.b.class, Integer.TYPE, Map.class, S1.j.class, X1.c.class, X1.h.class).newInstance(context, a0Var, str, Boolean.TRUE, iVar, bVar, Integer.valueOf(i7), map, jVar, cVar, hVar);
            w5.k.d(objNewInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (X1.e) objNewInstance;
        } catch (Exception unused) {
            return new Z(context);
        }
    }
}
