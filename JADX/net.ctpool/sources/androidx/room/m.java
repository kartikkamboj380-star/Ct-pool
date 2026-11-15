package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f8970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f8971b;

    public m(u uVar) {
        w5.k.f(uVar, "database");
        this.f8970a = uVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        w5.k.e(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f8971b = setNewSetFromMap;
    }
}
