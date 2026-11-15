package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f14090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f14092c;

    private I(F f7, boolean z6, z zVar, int i7) {
        this.f14092c = f7;
        this.f14091b = z6;
        this.f14090a = zVar;
    }

    public static I c(z zVar) {
        return new I(new F(zVar), false, y.f14116b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new E(this.f14092c, this, charSequence);
    }

    public final I b() {
        return new I(this.f14092c, true, this.f14090a, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final Iterable d(CharSequence charSequence) {
        return new G(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itH = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itH.hasNext()) {
            arrayList.add((String) itH.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
