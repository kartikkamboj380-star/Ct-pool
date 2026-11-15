package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f16920a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f16921b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f16922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16924e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0229a implements h.a {
        C0229a() {
        }

        @Override // com.google.android.material.internal.h.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h hVar, boolean z6) {
            if (!z6) {
                a aVar = a.this;
                if (!aVar.r(hVar, aVar.f16924e)) {
                    return;
                }
            } else if (!a.this.g(hVar)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(h hVar) {
        int id = hVar.getId();
        if (this.f16921b.contains(Integer.valueOf(id))) {
            return false;
        }
        h hVar2 = (h) this.f16920a.get(Integer.valueOf(k()));
        if (hVar2 != null) {
            r(hVar2, false);
        }
        boolean zAdd = this.f16921b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        b bVar = this.f16922c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(h hVar, boolean z6) {
        int id = hVar.getId();
        if (!this.f16921b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z6 && this.f16921b.size() == 1 && this.f16921b.contains(Integer.valueOf(id))) {
            hVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f16921b.remove(Integer.valueOf(id));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return zRemove;
    }

    public void e(h hVar) {
        this.f16920a.put(Integer.valueOf(hVar.getId()), hVar);
        if (hVar.isChecked()) {
            g(hVar);
        }
        hVar.setInternalOnCheckedChangeListener(new C0229a());
    }

    public void f(int i7) {
        h hVar = (h) this.f16920a.get(Integer.valueOf(i7));
        if (hVar != null && g(hVar)) {
            m();
        }
    }

    public void h() {
        boolean z6 = !this.f16921b.isEmpty();
        Iterator it = this.f16920a.values().iterator();
        while (it.hasNext()) {
            r((h) it.next(), false);
        }
        if (z6) {
            m();
        }
    }

    public Set i() {
        return new HashSet(this.f16921b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof h) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f16923d || this.f16921b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16921b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f16923d;
    }

    public void n(h hVar) {
        hVar.setInternalOnCheckedChangeListener(null);
        this.f16920a.remove(Integer.valueOf(hVar.getId()));
        this.f16921b.remove(Integer.valueOf(hVar.getId()));
    }

    public void o(b bVar) {
        this.f16922c = bVar;
    }

    public void p(boolean z6) {
        this.f16924e = z6;
    }

    public void q(boolean z6) {
        if (this.f16923d != z6) {
            this.f16923d = z6;
            h();
        }
    }
}
