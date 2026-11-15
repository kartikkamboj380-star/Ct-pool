package com.facebook.react.modules.network;

import T5.t;
import T5.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T5.n f11947c = null;

    @Override // T5.n
    public void a(u uVar, List list) {
        T5.n nVar = this.f11947c;
        if (nVar != null) {
            nVar.a(uVar, list);
        }
    }

    @Override // com.facebook.react.modules.network.a
    public void b() {
        this.f11947c = null;
    }

    @Override // com.facebook.react.modules.network.a
    public void c(T5.n nVar) {
        this.f11947c = nVar;
    }

    @Override // T5.n
    public List d(u uVar) {
        T5.n nVar = this.f11947c;
        if (nVar == null) {
            return Collections.emptyList();
        }
        List<T5.m> listD = nVar.d(uVar);
        ArrayList arrayList = new ArrayList();
        for (T5.m mVar : listD) {
            try {
                new t.a().a(mVar.e(), mVar.g());
                arrayList.add(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }
}
