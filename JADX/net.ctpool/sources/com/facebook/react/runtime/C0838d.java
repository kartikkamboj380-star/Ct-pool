package com.facebook.react.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.runtime.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0838d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f12172c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12174b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.facebook.react.runtime.d$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0838d(boolean z6) {
        this.f12173a = z6;
    }

    protected final void a(String str) {
        w5.k.f(str, "state");
        P0.a.G("BridgelessReact", str);
        if (this.f12173a) {
            this.f12174b.add(str);
        }
    }
}
