package r0;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import l0.C1844b;

/* JADX INFO: renamed from: r0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2013d {
    public static final q0.u a(q0.u uVar) throws Throwable {
        w5.k.f(uVar, "workSpec");
        C1844b c1844b = uVar.f21804j;
        String str = uVar.f21797c;
        if (w5.k.b(str, ConstraintTrackingWorker.class.getName())) {
            return uVar;
        }
        if (!c1844b.f() && !c1844b.i()) {
            return uVar;
        }
        androidx.work.b bVarA = new b.a().c(uVar.f21799e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        w5.k.e(bVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        w5.k.e(name, "name");
        return uVar.d((1048574 & 1) != 0 ? uVar.f21795a : null, (1048574 & 2) != 0 ? uVar.f21796b : null, (1048574 & 4) != 0 ? uVar.f21797c : name, (1048574 & 8) != 0 ? uVar.f21798d : null, (1048574 & 16) != 0 ? uVar.f21799e : bVarA, (1048574 & 32) != 0 ? uVar.f21800f : null, (1048574 & 64) != 0 ? uVar.f21801g : 0L, (1048574 & 128) != 0 ? uVar.f21802h : 0L, (1048574 & 256) != 0 ? uVar.f21803i : 0L, (1048574 & 512) != 0 ? uVar.f21804j : null, (1048574 & 1024) != 0 ? uVar.f21805k : 0, (1048574 & 2048) != 0 ? uVar.f21806l : null, (1048574 & 4096) != 0 ? uVar.f21807m : 0L, (1048574 & 8192) != 0 ? uVar.f21808n : 0L, (1048574 & 16384) != 0 ? uVar.f21809o : 0L, (1048574 & 32768) != 0 ? uVar.f21810p : 0L, (1048574 & 65536) != 0 ? uVar.f21811q : false, (131072 & 1048574) != 0 ? uVar.f21812r : null, (1048574 & 262144) != 0 ? uVar.f21813s : 0, (1048574 & 524288) != 0 ? uVar.f21814t : 0);
    }

    public static final q0.u b(List list, q0.u uVar) {
        w5.k.f(list, "schedulers");
        w5.k.f(uVar, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(uVar) : uVar;
    }
}
