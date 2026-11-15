package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e implements J1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12781a;

    private e(List list) {
        this.f12781a = new LinkedList(list);
    }

    public static J1.d c(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new e(list) : (J1.d) list.get(0);
        }
        return null;
    }

    @Override // J1.d
    public S0.a a(Bitmap bitmap, v1.b bVar) {
        S0.a aVarA = null;
        try {
            Iterator it = this.f12781a.iterator();
            S0.a aVarClone = null;
            while (it.hasNext()) {
                aVarA = ((J1.d) it.next()).a(aVarClone != null ? (Bitmap) aVarClone.j() : bitmap, bVar);
                S0.a.g(aVarClone);
                aVarClone = aVarA.clone();
            }
            S0.a aVarClone2 = aVarA.clone();
            S0.a.g(aVarA);
            return aVarClone2;
        } catch (Throwable th) {
            S0.a.g(aVarA);
            throw th;
        }
    }

    @Override // J1.d
    public I0.d b() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f12781a.iterator();
        while (it.hasNext()) {
            linkedList.push(((J1.d) it.next()).b());
        }
        return new I0.f(linkedList);
    }

    @Override // J1.d
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (J1.d dVar : this.f12781a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(dVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
