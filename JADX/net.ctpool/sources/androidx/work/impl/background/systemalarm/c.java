package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.List;
import l0.i;
import n0.InterfaceC1893c;
import q0.u;
import q0.x;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9360e = i.i("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f9363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0.e f9364d;

    c(Context context, int i7, g gVar) {
        this.f9361a = context;
        this.f9362b = i7;
        this.f9363c = gVar;
        this.f9364d = new n0.e(gVar.g().u(), (InterfaceC1893c) null);
    }

    void a() {
        List<u> listJ = this.f9363c.g().v().j().j();
        ConstraintProxy.a(this.f9361a, listJ);
        this.f9364d.b(listJ);
        ArrayList<u> arrayList = new ArrayList(listJ.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (u uVar : listJ) {
            String str = uVar.f21795a;
            if (jCurrentTimeMillis >= uVar.c() && (!uVar.h() || this.f9364d.e(str))) {
                arrayList.add(uVar);
            }
        }
        for (u uVar2 : arrayList) {
            String str2 = uVar2.f21795a;
            Intent intentC = b.c(this.f9361a, x.a(uVar2));
            i.e().a(f9360e, "Creating a delay_met command for workSpec with id (" + str2 + ")");
            this.f9363c.f().a().execute(new g.b(this.f9363c, intentC, this.f9362b));
        }
        this.f9364d.a();
    }
}
