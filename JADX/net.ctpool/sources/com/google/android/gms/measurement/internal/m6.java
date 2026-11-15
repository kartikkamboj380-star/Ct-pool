package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1217u2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1199s2 f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f16179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ h6 f16181d;

    private m6(h6 h6Var) {
        this.f16181d = h6Var;
    }

    final C1199s2 a(String str, C1199s2 c1199s2) {
        C1463p2 c1463p2G;
        String str2;
        Object obj;
        String strS = c1199s2.S();
        List listT = c1199s2.T();
        this.f16181d.m();
        Long l7 = (Long) Z5.d0(c1199s2, "_eid");
        boolean z6 = l7 != null;
        if (z6 && strS.equals("_ep")) {
            Preconditions.checkNotNull(l7);
            this.f16181d.m();
            strS = (String) Z5.d0(c1199s2, "_en");
            if (TextUtils.isEmpty(strS)) {
                this.f16181d.d().G().b("Extra parameter without an event name. eventId", l7);
                return null;
            }
            if (this.f16178a == null || this.f16179b == null || l7.longValue() != this.f16179b.longValue()) {
                Pair pairF = this.f16181d.o().F(str, l7);
                if (pairF == null || (obj = pairF.first) == null) {
                    this.f16181d.d().G().c("Extra parameter without existing main event. eventName, eventId", strS, l7);
                    return null;
                }
                this.f16178a = (C1199s2) obj;
                this.f16180c = ((Long) pairF.second).longValue();
                this.f16181d.m();
                this.f16179b = (Long) Z5.d0(this.f16178a, "_eid");
            }
            long j7 = this.f16180c - 1;
            this.f16180c = j7;
            if (j7 <= 0) {
                C1425k c1425kO = this.f16181d.o();
                c1425kO.l();
                c1425kO.d().I().b("Clearing complex main event info. appId", str);
                try {
                    c1425kO.z().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e7) {
                    c1425kO.d().E().b("Error clearing complex main event", e7);
                }
            } else {
                this.f16181d.o().l0(str, l7, this.f16180c, this.f16178a);
            }
            ArrayList arrayList = new ArrayList();
            for (C1217u2 c1217u2 : this.f16178a.T()) {
                this.f16181d.m();
                if (Z5.D(c1199s2, c1217u2.U()) == null) {
                    arrayList.add(c1217u2);
                }
            }
            if (arrayList.isEmpty()) {
                c1463p2G = this.f16181d.d().G();
                str2 = "No unique parameters in main event. eventName";
                c1463p2G.b(str2, strS);
            } else {
                arrayList.addAll(listT);
                listT = arrayList;
            }
        } else if (z6) {
            this.f16179b = l7;
            this.f16178a = c1199s2;
            this.f16181d.m();
            long jLongValue = ((Long) Z5.H(c1199s2, "_epc", 0L)).longValue();
            this.f16180c = jLongValue;
            if (jLongValue <= 0) {
                c1463p2G = this.f16181d.d().G();
                str2 = "Complex event with zero extra param count. eventName";
                c1463p2G.b(str2, strS);
            } else {
                this.f16181d.o().l0(str, (Long) Preconditions.checkNotNull(l7), this.f16180c, c1199s2);
            }
        }
        return (C1199s2) ((AbstractC1260z4) ((C1199s2.a) c1199s2.w()).C(strS).H().B(listT).p());
    }
}
