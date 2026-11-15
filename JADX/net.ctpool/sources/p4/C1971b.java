package p4;

import h4.F;
import org.json.JSONObject;
import p4.C1973d;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1971b implements i {
    C1971b() {
    }

    static C1973d b(F f7) {
        return new C1973d(f7.a() + ((long) 3600000), new C1973d.b(8, 4), new C1973d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p4.i
    public C1973d a(F f7, JSONObject jSONObject) {
        return b(f7);
    }
}
