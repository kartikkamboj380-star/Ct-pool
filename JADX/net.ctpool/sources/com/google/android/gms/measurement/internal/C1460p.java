package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1199s2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1460p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16224b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C1425k f16225c;

    public C1460p(C1425k c1425k, String str) {
        this.f16225c = c1425k;
        Preconditions.checkNotEmpty(str);
        this.f16223a = str;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f16225c.z().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f16223a, String.valueOf(this.f16224b)}, null, null, "rowid", "1000");
            } catch (SQLiteException e7) {
                this.f16225c.d().E().c("Data loss. Error querying raw events batch. appId", C1449n2.t(this.f16223a), e7);
                if (0 != 0) {
                }
                return arrayList;
            }
            if (!cursorQuery.moveToFirst()) {
                List listEmptyList = Collections.emptyList();
                cursorQuery.close();
                return listEmptyList;
            }
            do {
                long j7 = cursorQuery.getLong(0);
                long j8 = cursorQuery.getLong(3);
                boolean z6 = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j7 > this.f16224b) {
                    this.f16224b = j7;
                }
                try {
                    C1199s2.a aVar = (C1199s2.a) Z5.E(C1199s2.Q(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    aVar.C(string).E(cursorQuery.getLong(2));
                    arrayList.add(new C1446n(j7, j8, z6, (C1199s2) ((AbstractC1260z4) aVar.p())));
                } catch (IOException e8) {
                    this.f16225c.d().E().c("Data loss. Failed to merge raw event. appId", C1449n2.t(this.f16223a), e8);
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
