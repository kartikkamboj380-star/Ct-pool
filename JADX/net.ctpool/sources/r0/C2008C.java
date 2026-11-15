package r0;

import androidx.work.impl.WorkDatabase;
import s0.InterfaceC2034b;

/* JADX INFO: renamed from: r0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2008C implements l0.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f22070c = l0.i.i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WorkDatabase f22071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC2034b f22072b;

    public C2008C(WorkDatabase workDatabase, InterfaceC2034b interfaceC2034b) {
        this.f22071a = workDatabase;
        this.f22072b = interfaceC2034b;
    }
}
