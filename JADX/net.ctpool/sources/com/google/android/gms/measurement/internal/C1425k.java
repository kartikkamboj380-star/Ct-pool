package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1168o6;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1217u2;
import com.google.android.gms.internal.measurement.C1234w2;
import com.google.android.gms.internal.measurement.C1242x2;
import com.google.android.gms.internal.measurement.C1258z2;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.U1;
import com.google.android.gms.internal.measurement.Y6;
import com.google.android.gms.internal.measurement.y7;
import com.google.android.gms.measurement.internal.A3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1425k extends E5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f16118f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f16119g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f16120h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f16121i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f16122j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f16123k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f16124l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f16125m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f16126n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f16127o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f16128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1528y5 f16129e;

    C1425k(H5 h52) {
        super(h52);
        this.f16129e = new C1528y5(zzb());
        this.f16128d = new r(this, a(), "google_app_measurement.db");
    }

    private final long A0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = z().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j7 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                d().E().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long E(String str, String[] strArr, long j7) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = z().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j7;
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                d().E().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    private final boolean E0(String str, List list) {
        Preconditions.checkNotEmpty(str);
        s();
        l();
        SQLiteDatabase sQLiteDatabaseZ = z();
        try {
            long jA0 = A0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, b().u(str, G.f15472I)));
            if (jA0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                Integer num = (Integer) list.get(i7);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseZ.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e7) {
            d().E().c("Database error querying filters. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final A H0(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        l();
        s();
        CursorWrapper cursorWrapper = 0;
        try {
            try {
                cursorQuery = z().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j7 = cursorQuery.getLong(0);
                    long j8 = cursorQuery.getLong(1);
                    long j9 = cursorQuery.getLong(2);
                    long j10 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    A a7 = new A(str2, str3, j7, j8, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j9, j10, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        d().E().b("Got multiple records for event aggregates, expected one. appId", C1449n2.t(str2));
                    }
                    cursorQuery.close();
                    return a7;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().d("Error querying events. appId", C1449n2.t(str2), e().c(str3), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursorWrapper = "current_bundle_count";
                if (cursorWrapper != 0) {
                    cursorWrapper.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursorWrapper != 0) {
            }
            throw th;
        }
    }

    private final Object K(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 0) {
            d().E().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            d().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        d().E().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object L(String str, String[] strArr, InterfaceC1480s interfaceC1480s) throws Throwable {
        Cursor cursorRawQuery;
        ?? r02 = 0;
        try {
            try {
                cursorRawQuery = z().rawQuery(str, strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        Object objA = interfaceC1480s.a(cursorRawQuery);
                        cursorRawQuery.close();
                        return objA;
                    }
                    d().I().a("No data found");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().b("Error querying database.", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r02 = str;
                if (r02 != 0) {
                    r02.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r02 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String N(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = z().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e7) {
                d().E().c("Database error", str, e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    private static void R(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void T0(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        try {
            z().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            d().E().c("Error deleting snapshot. appId", C1449n2.t(str2), e7);
        }
    }

    private final void X(String str, A a7) {
        Preconditions.checkNotNull(a7);
        l();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a7.f15335a);
        contentValues.put("name", a7.f15336b);
        contentValues.put("lifetime_count", Long.valueOf(a7.f15337c));
        contentValues.put("current_bundle_count", Long.valueOf(a7.f15338d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a7.f15340f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a7.f15341g));
        contentValues.put("last_bundled_day", a7.f15342h);
        contentValues.put("last_sampled_complex_event_id", a7.f15343i);
        contentValues.put("last_sampling_rate", a7.f15344j);
        contentValues.put("current_session_count", Long.valueOf(a7.f15339e));
        Boolean bool = a7.f15345k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (z().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                d().E().b("Failed to insert/update event aggregates (got -1). appId", C1449n2.t(a7.f15335a));
            }
        } catch (SQLiteException e7) {
            d().E().c("Error storing event aggregates. appId", C1449n2.t(a7.f15335a), e7);
        }
    }

    private final void Z(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZ = z();
            if (contentValues.getAsString(str2) == null) {
                d().F().b("Value of the primary key is not set.", C1449n2.t(str2));
                return;
            }
            if (sQLiteDatabaseZ.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && sQLiteDatabaseZ.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                d().E().c("Failed to insert/update table (got -1). key", C1449n2.t(str), C1449n2.t(str2));
            }
        } catch (SQLiteException e7) {
            d().E().d("Error storing into table. key", C1449n2.t(str), C1449n2.t(str2), e7);
        }
    }

    private final boolean c0(long j7, B b7, long j8, boolean z6) {
        l();
        s();
        Preconditions.checkNotNull(b7);
        Preconditions.checkNotEmpty(b7.f15368a);
        byte[] bArrI = m().C(b7).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b7.f15368a);
        contentValues.put("name", b7.f15369b);
        contentValues.put("timestamp", Long.valueOf(b7.f15371d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j8));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z6 ? 1 : 0));
        try {
            long jUpdate = z().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j7)});
            if (jUpdate == 1) {
                return true;
            }
            d().E().c("Failed to update raw event. appId, updatedRows", C1449n2.t(b7.f15368a), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error updating raw event. appId", C1449n2.t(b7.f15368a), e7);
            return false;
        }
    }

    private final boolean h0(String str, int i7, com.google.android.gms.internal.measurement.R1 r12) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(r12);
        if (r12.L().isEmpty()) {
            d().J().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C1449n2.t(str), Integer.valueOf(i7), String.valueOf(r12.R() ? Integer.valueOf(r12.H()) : null));
            return false;
        }
        byte[] bArrI = r12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        contentValues.put("filter_id", r12.R() ? Integer.valueOf(r12.H()) : null);
        contentValues.put("event_name", r12.L());
        contentValues.put("session_scoped", r12.S() ? Boolean.valueOf(r12.P()) : null);
        contentValues.put("data", bArrI);
        try {
            if (z().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert event filter (got -1). appId", C1449n2.t(str));
            return true;
        } catch (SQLiteException e7) {
            d().E().c("Error storing event filter. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    private final boolean i0(String str, int i7, com.google.android.gms.internal.measurement.U1 u12) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(u12);
        if (u12.I().isEmpty()) {
            d().J().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C1449n2.t(str), Integer.valueOf(i7), String.valueOf(u12.M() ? Integer.valueOf(u12.j()) : null));
            return false;
        }
        byte[] bArrI = u12.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i7));
        contentValues.put("filter_id", u12.M() ? Integer.valueOf(u12.j()) : null);
        contentValues.put("property_name", u12.I());
        contentValues.put("session_scoped", u12.N() ? Boolean.valueOf(u12.L()) : null);
        contentValues.put("data", bArrI);
        try {
            if (z().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert property filter (got -1). appId", C1449n2.t(str));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing property filter. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    private final String x0() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        w3.C c7 = w3.C.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + c7.a() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + ((Long) G.f15468G.a(null)).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + c7.a() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + C1397g.N() + " AS INTEGER)))") + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? Z6 = z();
        try {
            try {
                cursorRawQuery = Z6.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (Z6 != 0) {
                    Z6.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            Z6 = 0;
            if (Z6 != 0) {
            }
            throw th;
        }
    }

    public final int B(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        try {
            return z().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            d().E().d("Error deleting conditional property", C1449n2.t(str), e().g(str2), e7);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        d().E().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List B0(String str, String str2, String str3) throws Throwable {
        String str4;
        ArrayList arrayList;
        Preconditions.checkNotEmpty(str);
        l();
        s();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                arrayList = new ArrayList(3);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e7) {
            e = e7;
        }
        try {
            arrayList.add(str);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (TextUtils.isEmpty(str2)) {
                str4 = str2;
            } else {
                str4 = str2;
                try {
                    arrayList.add(str4);
                    sb.append(" and origin=?");
                } catch (SQLiteException e8) {
                    e = e8;
                    d().E().d("(2)Error querying user properties", C1449n2.t(str), str4, e);
                    List listEmptyList = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList;
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3 + "*");
                sb.append(" and name glob ?");
            }
            cursorQuery = z().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), null, null, "rowid", "1001");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return arrayList2;
            }
            while (true) {
                if (arrayList2.size() >= 1000) {
                    break;
                }
                String string = cursorQuery.getString(0);
                long j7 = cursorQuery.getLong(1);
                try {
                    try {
                        Object objK = K(cursorQuery, 2);
                        String string2 = cursorQuery.getString(3);
                        if (objK == null) {
                            try {
                                d().E().d("(2)Read invalid user property value, ignoring it", C1449n2.t(str), string2, str3);
                            } catch (SQLiteException e9) {
                                e = e9;
                                str4 = string2;
                                d().E().d("(2)Error querying user properties", C1449n2.t(str), str4, e);
                                List listEmptyList2 = Collections.emptyList();
                                if (cursorQuery != null) {
                                }
                                return listEmptyList2;
                            }
                        } else {
                            arrayList2.add(new a6(str, string2, string, j7, objK));
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        str4 = string2;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            cursorQuery.close();
            return arrayList2;
        } catch (SQLiteException e11) {
            e = e11;
            str4 = str2;
            d().E().d("(2)Error querying user properties", C1449n2.t(str), str4, e);
            List listEmptyList22 = Collections.emptyList();
            if (cursorQuery != null) {
            }
            return listEmptyList22;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    public final long C(C1242x2 c1242x2) {
        l();
        s();
        Preconditions.checkNotNull(c1242x2);
        Preconditions.checkNotEmpty(c1242x2.x2());
        byte[] bArrI = c1242x2.i();
        long jY = m().y(bArrI);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1242x2.x2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jY));
        contentValues.put("metadata", bArrI);
        try {
            z().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jY;
        } catch (SQLiteException e7) {
            d().E().c("Error storing raw event metadata. appId", C1449n2.t(c1242x2.x2()), e7);
            throw e7;
        }
    }

    public final void C0(String str, A3 a32) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(a32);
        l();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", a32.x());
        contentValues.put("consent_source", Integer.valueOf(a32.b()));
        Z("consent_settings", "app_id", contentValues);
    }

    public final long D(String str) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        try {
            return z().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, b().u(str, G.f15553q))))});
        } catch (SQLiteException e7) {
            d().E().c("Error deleting over the limit events. appId", C1449n2.t(str), e7);
            return 0L;
        }
    }

    final boolean D0(String str, Bundle bundle) {
        l();
        s();
        byte[] bArrI = m().C(new B(this.f16325a, "", str, "dep", 0L, 0L, bundle)).i();
        d().I().c("Saving default event parameters, appId, data size", e().c(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrI);
        try {
            if (z().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert default event parameters (got -1). appId", C1449n2.t(str));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing default event parameters. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair F(String str, Long l7) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        l();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = z().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l7)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        d().I().a("Main event not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        Pair pairCreate = Pair.create((C1199s2) ((AbstractC1260z4) ((C1199s2.a) Z5.E(C1199s2.Q(), cursorRawQuery.getBlob(0))).p()), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        return pairCreate;
                    } catch (IOException e7) {
                        d().E().d("Failed to merge main event. appId, eventId", C1449n2.t(str), l7, e7);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    d().E().b("Error selecting main event", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final long F0(String str) {
        Preconditions.checkNotEmpty(str);
        return E("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final C1453o G(long j7, String str, long j8, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        String[] strArr = {str};
        C1453o c1453o = new C1453o();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZ = z();
                Cursor cursorQuery = sQLiteDatabaseZ.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    d().J().b("Not updating daily counts, app is not known. appId", C1449n2.t(str));
                    cursorQuery.close();
                    return c1453o;
                }
                if (cursorQuery.getLong(0) == j7) {
                    c1453o.f16206b = cursorQuery.getLong(1);
                    c1453o.f16205a = cursorQuery.getLong(2);
                    c1453o.f16207c = cursorQuery.getLong(3);
                    c1453o.f16208d = cursorQuery.getLong(4);
                    c1453o.f16209e = cursorQuery.getLong(5);
                    c1453o.f16210f = cursorQuery.getLong(6);
                    c1453o.f16211g = cursorQuery.getLong(7);
                }
                if (z6) {
                    c1453o.f16206b += j8;
                }
                if (z7) {
                    c1453o.f16205a += j8;
                }
                if (z8) {
                    c1453o.f16207c += j8;
                }
                if (z9) {
                    c1453o.f16208d += j8;
                }
                if (z10) {
                    c1453o.f16209e += j8;
                }
                if (z11) {
                    c1453o.f16210f += j8;
                }
                if (z12) {
                    c1453o.f16211g += j8;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j7));
                contentValues.put("daily_public_events_count", Long.valueOf(c1453o.f16205a));
                contentValues.put("daily_events_count", Long.valueOf(c1453o.f16206b));
                contentValues.put("daily_conversions_count", Long.valueOf(c1453o.f16207c));
                contentValues.put("daily_error_events_count", Long.valueOf(c1453o.f16208d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c1453o.f16209e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c1453o.f16210f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c1453o.f16211g));
                sQLiteDatabaseZ.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c1453o;
            } catch (SQLiteException e7) {
                d().E().c("Error updating daily counts. appId", C1449n2.t(str), e7);
                if (0 != 0) {
                    cursor.close();
                }
                return c1453o;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:14:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1383e G0(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = z().query("conditional_properties", new String[]{"origin", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objK = K(cursorQuery, 1);
                    boolean z6 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j7 = cursorQuery.getLong(4);
                    Z5 z5M = m();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<E> creator = E.CREATOR;
                    C1383e c1383e = new C1383e(str, str3, new Y5(str2, cursorQuery.getLong(8), objK, str3), cursorQuery.getLong(6), z6, string2, (E) z5M.B(blob, creator), j7, (E) m().B(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (E) m().B(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        d().E().c("Got multiple records for conditional property, expected one", C1449n2.t(str), e().g(str2));
                    }
                    cursorQuery.close();
                    return c1383e;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().d("Error querying conditional property", C1449n2.t(str), e().g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final C1453o H(long j7, String str, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return G(j7, str, 1L, false, false, z8, false, z10, z11, z12);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle I0(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        l();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = z().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        d().I().a("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        C1199s2 c1199s2 = (C1199s2) ((AbstractC1260z4) ((C1199s2.a) Z5.E(C1199s2.Q(), cursorRawQuery.getBlob(0))).p());
                        m();
                        Bundle bundleZ = Z5.z(c1199s2.T());
                        cursorRawQuery.close();
                        return bundleZ;
                    } catch (IOException e7) {
                        d().E().c("Failed to retrieve default event parameters. appId", C1449n2.t(str), e7);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    d().E().b("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final A J0(String str, String str2) {
        return H0("events", str, str2);
    }

    public final C1372c2 K0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        l();
        s();
        Cursor cursor = null;
        try {
            cursorQuery = z().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    C1372c2 c1372c2 = new C1372c2(this.f15455b.r0(), str);
                    if (!C1168o6.a() || !b().r(G.f15507Z0) || this.f15455b.S(str).m(A3.a.ANALYTICS_STORAGE)) {
                        c1372c2.J(cursorQuery.getString(0));
                    }
                    c1372c2.Z(cursorQuery.getString(1));
                    if (!C1168o6.a() || !b().r(G.f15507Z0) || this.f15455b.S(str).m(A3.a.AD_STORAGE)) {
                        c1372c2.f0(cursorQuery.getString(2));
                    }
                    c1372c2.A0(cursorQuery.getLong(3));
                    c1372c2.C0(cursorQuery.getLong(4));
                    c1372c2.y0(cursorQuery.getLong(5));
                    c1372c2.S(cursorQuery.getString(6));
                    c1372c2.O(cursorQuery.getString(7));
                    c1372c2.u0(cursorQuery.getLong(8));
                    c1372c2.n0(cursorQuery.getLong(9));
                    c1372c2.K(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c1372c2.k0(cursorQuery.getLong(11));
                    c1372c2.e0(cursorQuery.getLong(12));
                    c1372c2.b0(cursorQuery.getLong(13));
                    c1372c2.V(cursorQuery.getLong(14));
                    c1372c2.R(cursorQuery.getLong(15));
                    c1372c2.s0(cursorQuery.getLong(16));
                    c1372c2.H(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c1372c2.W(cursorQuery.getString(18));
                    c1372c2.Y(cursorQuery.getLong(19));
                    c1372c2.h0(cursorQuery.getLong(20));
                    c1372c2.c0(cursorQuery.getString(21));
                    c1372c2.h(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    c1372c2.f(cursorQuery.getString(24));
                    c1372c2.q0(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        c1372c2.g(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    if (!C1168o6.a() || !b().r(G.f15507Z0) || this.f15455b.S(str).m(A3.a.ANALYTICS_STORAGE)) {
                        c1372c2.l0(cursorQuery.getString(28));
                    }
                    if (y7.a() && b().r(G.f15570y0)) {
                        h();
                        if (d6.F0(str)) {
                            c1372c2.P((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            c1372c2.w0(cursorQuery.getLong(39));
                            if (b().r(G.f15572z0)) {
                                c1372c2.o0(cursorQuery.getString(36));
                            }
                        }
                    }
                    c1372c2.G0(cursorQuery.getLong(30));
                    c1372c2.E0(cursorQuery.getLong(31));
                    if (C1195r7.a() && b().D(str, G.f15473I0)) {
                        c1372c2.b(cursorQuery.getInt(32));
                        c1372c2.N(cursorQuery.getLong(35));
                    }
                    c1372c2.T((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    c1372c2.d(boolValueOf);
                    c1372c2.M(cursorQuery.getInt(37));
                    c1372c2.G(cursorQuery.getInt(38));
                    c1372c2.i0(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                    if (b().r(G.f15503X0)) {
                        if (!cursorQuery.isNull(41)) {
                            c1372c2.e(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            c1372c2.I(Long.valueOf(cursorQuery.getLong(42)));
                        }
                    }
                    if (Y6.a() && b().D(str, G.f15499V0)) {
                        c1372c2.i(cursorQuery.getBlob(43));
                    }
                    c1372c2.x();
                    if (cursorQuery.moveToNext()) {
                        d().E().b("Got multiple records for app, expected one. appId", C1449n2.t(str));
                    }
                    cursorQuery.close();
                    return c1372c2;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().c("Error querying app. appId", C1449n2.t(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
            th = th;
            cursor = cursorQuery;
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a6 L0(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = z().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j7 = cursorQuery.getLong(0);
                    Object objK = K(cursorQuery, 1);
                    if (objK == null) {
                        cursorQuery.close();
                        return null;
                    }
                    a6 a6Var = new a6(str, cursorQuery.getString(2), str2, j7, objK);
                    if (cursorQuery.moveToNext()) {
                        d().E().b("Got multiple records for user property, expected one. appId", C1449n2.t(str));
                    }
                    cursorQuery.close();
                    return a6Var;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().d("Error querying user property. appId", C1449n2.t(str), e().g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String M(long j7) throws Throwable {
        Cursor cursorRawQuery;
        l();
        s();
        ?? r02 = 0;
        try {
            try {
                cursorRawQuery = z().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j7)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    d().I().a("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().b("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r02 = j7;
                if (r02 != 0) {
                    r02.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r02 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1432l M0(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        l();
        s();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = z().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    String string = cursorQuery.getString(1);
                    String string2 = cursorQuery.getString(2);
                    if (cursorQuery.moveToNext()) {
                        d().E().b("Got multiple records for app config, expected one. appId", C1449n2.t(str));
                    }
                    if (blob == null) {
                        cursorQuery.close();
                        return null;
                    }
                    C1432l c1432l = new C1432l(blob, string, string2);
                    cursorQuery.close();
                    return c1432l;
                } catch (SQLiteException e7) {
                    e = e7;
                    d().E().c("Error querying remote config. appId", C1449n2.t(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    final Map N0(String str, String str2) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C1890a c1890a = new C1890a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.R1 r12 = (com.google.android.gms.internal.measurement.R1) ((AbstractC1260z4) ((R1.a) Z5.E(com.google.android.gms.internal.measurement.R1.I(), cursorQuery.getBlob(1))).p());
                        int i7 = cursorQuery.getInt(0);
                        List arrayList = (List) c1890a.get(Integer.valueOf(i7));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c1890a.put(Integer.valueOf(i7), arrayList);
                        }
                        arrayList.add(r12);
                    } catch (IOException e7) {
                        d().E().c("Failed to merge filter. appId", C1449n2.t(str), e7);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c1890a;
            } catch (SQLiteException e8) {
                d().E().c("Database error querying filters. appId", C1449n2.t(str), e8);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List O(String str, int i7, int i8) {
        C1463p2 c1463p2E;
        String str2;
        Object objT;
        byte[] bArrH0;
        long jN;
        long jN2;
        l();
        s();
        int i9 = 1;
        Preconditions.checkArgument(i7 > 0);
        Preconditions.checkArgument(i8 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i7));
                if (!cursorQuery.moveToFirst()) {
                    List listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j7 = cursorQuery.getLong(0);
                    try {
                        bArrH0 = m().h0(cursorQuery.getBlob(i9));
                    } catch (IOException e7) {
                        e = e7;
                        c1463p2E = d().E();
                        str2 = "Failed to unzip queued bundle. appId";
                        objT = C1449n2.t(str);
                    }
                    if (!arrayList.isEmpty() && bArrH0.length + length > i8) {
                        break;
                    }
                    try {
                        C1242x2.a aVar = (C1242x2.a) Z5.E(C1242x2.u2(), bArrH0);
                        if (!arrayList.isEmpty()) {
                            C1242x2 c1242x2 = (C1242x2) ((Pair) arrayList.get(0)).first;
                            C1242x2 c1242x22 = (C1242x2) ((AbstractC1260z4) aVar.p());
                            if (!c1242x2.W().equals(c1242x22.W()) || !c1242x2.V().equals(c1242x22.V()) || c1242x2.n0() != c1242x22.n0() || !c1242x2.X().equals(c1242x22.X())) {
                                break;
                            }
                            Iterator it = c1242x2.l0().iterator();
                            while (true) {
                                jN = -1;
                                if (!it.hasNext()) {
                                    jN2 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.B2 b22 = (com.google.android.gms.internal.measurement.B2) it.next();
                                if ("_npa".equals(b22.S())) {
                                    jN2 = b22.N();
                                    break;
                                }
                            }
                            Iterator it2 = c1242x22.l0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                com.google.android.gms.internal.measurement.B2 b23 = (com.google.android.gms.internal.measurement.B2) it2.next();
                                if ("_npa".equals(b23.S())) {
                                    jN = b23.N();
                                    break;
                                }
                            }
                            if (jN2 != jN) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            aVar.A0(cursorQuery.getInt(2));
                        }
                        length += bArrH0.length;
                        arrayList.add(Pair.create((C1242x2) ((AbstractC1260z4) aVar.p()), Long.valueOf(j7)));
                    } catch (IOException e8) {
                        e = e8;
                        c1463p2E = d().E();
                        str2 = "Failed to merge queued bundle. appId";
                        objT = C1449n2.t(str);
                        c1463p2E.c(str2, objT, e);
                    }
                    if (!cursorQuery.moveToNext() || length > i8) {
                        break;
                    }
                    i9 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e9) {
                d().E().c("Error querying bundles. appId", C1449n2.t(str), e9);
                List listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C1501v O0(String str) {
        Preconditions.checkNotNull(str);
        l();
        s();
        return C1501v.c(N("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List P(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return Q(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    final Map P0(String str, String str2) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        C1890a c1890a = new C1890a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.U1 u12 = (com.google.android.gms.internal.measurement.U1) ((AbstractC1260z4) ((U1.a) Z5.E(com.google.android.gms.internal.measurement.U1.G(), cursorQuery.getBlob(1))).p());
                        int i7 = cursorQuery.getInt(0);
                        List arrayList = (List) c1890a.get(Integer.valueOf(i7));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c1890a.put(Integer.valueOf(i7), arrayList);
                        }
                        arrayList.add(u12);
                    } catch (IOException e7) {
                        d().E().c("Failed to merge filter", C1449n2.t(str), e7);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c1890a;
            } catch (SQLiteException e8) {
                d().E().c("Database error querying filters. appId", C1449n2.t(str), e8);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        d().E().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List Q(String str, String[] strArr) {
        l();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = z().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", AppStateModule.APP_STATE_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    if (arrayList.size() >= 1000) {
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objK = K(cursorQuery, 3);
                    boolean z6 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j7 = cursorQuery.getLong(6);
                    Z5 z5M = m();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<E> creator = E.CREATOR;
                    E e7 = (E) z5M.B(blob, creator);
                    arrayList.add(new C1383e(string, string2, new Y5(string3, cursorQuery.getLong(10), objK, string2), cursorQuery.getLong(8), z6, string4, e7, j7, (E) m().B(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (E) m().B(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e8) {
                d().E().b("Error querying conditional user property value", e8);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final A3 Q0(String str) {
        Preconditions.checkNotNull(str);
        l();
        s();
        return A3.q(N("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void R0(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        try {
            z().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            d().E().d("Error deleting user property. appId", C1449n2.t(str), e().g(str2), e7);
        }
    }

    public final void S(A a7) {
        X("events", a7);
    }

    public final A3 S0(String str) {
        Preconditions.checkNotNull(str);
        l();
        s();
        A3 a32 = (A3) L("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC1480s() { // from class: com.google.android.gms.measurement.internal.m
            @Override // com.google.android.gms.measurement.internal.InterfaceC1480s
            public final Object a(Cursor cursor) {
                return A3.e(cursor.getString(0), cursor.getInt(1));
            }
        });
        return a32 == null ? A3.f15351c : a32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(C1372c2 c1372c2, boolean z6, boolean z7) {
        Preconditions.checkNotNull(c1372c2);
        l();
        s();
        String strL = c1372c2.l();
        Preconditions.checkNotNull(strL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strL);
        if (!C1168o6.a() || !b().r(G.f15507Z0)) {
            contentValues.put("app_instance_id", c1372c2.m());
        } else if (z6) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f15455b.S(strL).m(A3.a.ANALYTICS_STORAGE)) {
        }
        contentValues.put("gmp_app_id", c1372c2.q());
        if (!C1168o6.a() || !b().r(G.f15507Z0) || this.f15455b.S(strL).m(A3.a.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c1372c2.s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c1372c2.F0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c1372c2.H0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c1372c2.D0()));
        contentValues.put("app_version", c1372c2.o());
        contentValues.put("app_store", c1372c2.n());
        contentValues.put("gmp_version", Long.valueOf(c1372c2.z0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c1372c2.t0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c1372c2.A()));
        contentValues.put("day", Long.valueOf(c1372c2.r0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c1372c2.m0()));
        contentValues.put("daily_events_count", Long.valueOf(c1372c2.j0()));
        contentValues.put("daily_conversions_count", Long.valueOf(c1372c2.d0()));
        contentValues.put("config_fetched_time", Long.valueOf(c1372c2.a0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c1372c2.x0()));
        contentValues.put("app_version_int", Long.valueOf(c1372c2.U()));
        contentValues.put("firebase_instance_id", c1372c2.p());
        contentValues.put("daily_error_events_count", Long.valueOf(c1372c2.g0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c1372c2.p0()));
        contentValues.put("health_monitor_sample", c1372c2.r());
        contentValues.put("android_id", Long.valueOf(c1372c2.Q()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c1372c2.z()));
        contentValues.put("admob_app_id", c1372c2.j());
        contentValues.put("dynamite_version", Long.valueOf(c1372c2.v0()));
        if (!C1168o6.a() || !b().r(G.f15507Z0) || this.f15455b.S(strL).m(A3.a.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c1372c2.u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c1372c2.C()));
        contentValues.put("target_os_version", Long.valueOf(c1372c2.J0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c1372c2.I0()));
        if (C1195r7.a() && b().D(strL, G.f15473I0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c1372c2.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c1372c2.X()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c1372c2.D()));
        contentValues.put("npa_metadata_value", c1372c2.K0());
        if (y7.a() && b().D(strL, G.f15570y0)) {
            h();
            if (d6.F0(strL)) {
                contentValues.put("bundle_delivery_index", Long.valueOf(c1372c2.B0()));
            }
        }
        if (y7.a() && b().D(strL, G.f15572z0)) {
            contentValues.put("sgtm_preview_key", c1372c2.v());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(c1372c2.L()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c1372c2.F()));
        contentValues.put("serialized_npa_metadata", c1372c2.t());
        List listW = c1372c2.w();
        if (listW != null) {
            if (listW.isEmpty()) {
                d().J().b("Safelisted events should not be an empty list. appId", strL);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listW));
            }
        }
        if (A6.a() && b().r(G.f15564v0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (b().r(G.f15503X0)) {
            contentValues.put("unmatched_pfo", c1372c2.L0());
            contentValues.put("unmatched_uwa", c1372c2.M0());
        }
        if (Y6.a() && b().D(strL, G.f15499V0)) {
            contentValues.put("ad_campaign_info", c1372c2.E());
        }
        try {
            SQLiteDatabase sQLiteDatabaseZ = z();
            if (sQLiteDatabaseZ.update("apps", contentValues, "app_id = ?", new String[]{strL}) == 0 && sQLiteDatabaseZ.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                d().E().b("Failed to insert/update app (got -1). appId", C1449n2.t(strL));
            }
        } catch (SQLiteException e7) {
            d().E().c("Error storing app. appId", C1449n2.t(strL), e7);
        }
    }

    final void U(Long l7) {
        l();
        s();
        Preconditions.checkNotNull(l7);
        if ((!y7.a() || b().r(G.f15461C0)) && m0()) {
            if (A0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l7 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                d().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l7 + " AND retry_count < 2147483647");
            } catch (SQLiteException e7) {
                d().E().b("Error incrementing retry count. error", e7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V5 U0(String str) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        l();
        s();
        boolean zA = y7.a();
        ?? r12 = 0;
        ?? r02 = zA;
        if (zA) {
            boolean zR = b().r(G.f15461C0);
            r02 = zR;
            if (!zR) {
                return null;
            }
        }
        try {
            try {
                cursorQuery = z().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + x0(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(3);
                    if (TextUtils.isEmpty(string)) {
                        d().D().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        C1234w2.a aVar = (C1234w2.a) Z5.E(C1234w2.J(), cursorQuery.getBlob(2));
                        w3.C c7 = w3.C.values()[cursorQuery.getInt(5)];
                        if (c7 == w3.C.SGTM || c7 == w3.C.GOOGLE_ANALYTICS) {
                            if (cursorQuery.getInt(6) > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = aVar.C().iterator();
                                while (it.hasNext()) {
                                    C1242x2.a aVar2 = (C1242x2.a) ((C1242x2) it.next()).w();
                                    aVar2.A0(cursorQuery.getInt(6));
                                    arrayList.add((C1242x2) ((AbstractC1260z4) aVar2.p()));
                                }
                                aVar.z();
                                aVar.v(arrayList);
                            }
                        }
                        HashMap map = new HashMap();
                        String string2 = cursorQuery.getString(4);
                        if (string2 != null) {
                            String[] strArrSplit = string2.split("\r\n");
                            int length = strArrSplit.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    break;
                                }
                                String str2 = strArrSplit[i7];
                                if (str2.isEmpty()) {
                                    break;
                                }
                                String[] strArrSplit2 = str2.split("=", 2);
                                if (strArrSplit2.length != 2) {
                                    d().E().b("Invalid upload header: ", str2);
                                    break;
                                }
                                map.put(strArrSplit2[0], strArrSplit2[1]);
                                i7++;
                            }
                        }
                        V5 v5A = new X5().b(cursorQuery.getLong(0)).c((C1234w2) ((AbstractC1260z4) aVar.p())).d(string).e(map).f(c7).a();
                        cursorQuery.close();
                        return v5A;
                    } catch (IOException e7) {
                        d().E().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e7);
                        cursorQuery.close();
                        return null;
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    d().E().c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r12 = r02;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
    }

    public final void V(String str, Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        l();
        s();
        C1460p c1460p = new C1460p(this, str);
        for (List<C1446n> listA = c1460p.a(); !listA.isEmpty(); listA = c1460p.a()) {
            for (C1446n c1446n : listA) {
                Z5 z5M = m();
                C1199s2 c1199s2 = c1446n.f16185d;
                Bundle bundle2 = new Bundle();
                for (C1217u2 c1217u2 : c1199s2.T()) {
                    if (c1217u2.X()) {
                        bundle2.putDouble(c1217u2.U(), c1217u2.E());
                    } else if (c1217u2.Y()) {
                        bundle2.putFloat(c1217u2.U(), c1217u2.L());
                    } else if (c1217u2.Z()) {
                        bundle2.putLong(c1217u2.U(), c1217u2.Q());
                    } else if (c1217u2.c0()) {
                        bundle2.putString(c1217u2.U(), c1217u2.V());
                    } else if (c1217u2.W().isEmpty()) {
                        z5M.d().E().b("Unexpected parameter type for parameter", c1217u2);
                    } else {
                        bundle2.putParcelableArray(c1217u2.U(), Z5.g0(c1217u2.W()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strS = c1199s2.S();
                if (string == null) {
                    string = "";
                }
                C1476r2 c1476r2 = new C1476r2(strS, string, bundle2, c1199s2.P());
                h().L(c1476r2.f16256d, bundle);
                c0(c1446n.f16182a, new B(this.f16325a, c1476r2.f16254b, str, c1446n.f16185d.S(), c1446n.f16185d.P(), c1446n.f16185d.O(), c1476r2.f16256d), c1446n.f16183b, c1446n.f16184c);
            }
        }
    }

    public final List V0(String str) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = z().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new B5(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e7) {
                d().E().c("Error querying trigger uris. appId", C1449n2.t(str), e7);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void W(String str, C1501v c1501v) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(c1501v);
        l();
        s();
        if (b().r(G.f15493S0)) {
            A3 a3S0 = S0(str);
            A3 a32 = A3.f15351c;
            if (a3S0 == a32) {
                C0(str, a32);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c1501v.j());
        Z("consent_settings", "app_id", contentValues);
    }

    public final List W0(String str) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = z().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j7 = cursorQuery.getLong(2);
                    Object objK = K(cursorQuery, 3);
                    if (objK == null) {
                        d().E().b("Read invalid user property value, ignoring it. appId", C1449n2.t(str));
                    } else {
                        arrayList.add(new a6(str, str2, string, j7, objK));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e7) {
                d().E().c("Error querying user properties. appId", C1449n2.t(str), e7);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final Map X0(String str) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                C1890a c1890a = new C1890a();
                do {
                    int i7 = cursorQuery.getInt(0);
                    try {
                        c1890a.put(Integer.valueOf(i7), (C1258z2) ((AbstractC1260z4) ((C1258z2.a) Z5.E(C1258z2.P(), cursorQuery.getBlob(1))).p()));
                    } catch (IOException e7) {
                        d().E().d("Failed to merge filter results. appId, audienceId, error", C1449n2.t(str), Integer.valueOf(i7), e7);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c1890a;
            } catch (SQLiteException e8) {
                d().E().c("Database error querying filter results. appId", C1449n2.t(str), e8);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Y(String str, A3 a32) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(a32);
        l();
        s();
        C0(str, S0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", a32.x());
        Z("consent_settings", "app_id", contentValues);
    }

    final Map Y0(String str) {
        Preconditions.checkNotEmpty(str);
        C1890a c1890a = new C1890a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.R1 r12 = (com.google.android.gms.internal.measurement.R1) ((AbstractC1260z4) ((R1.a) Z5.E(com.google.android.gms.internal.measurement.R1.I(), cursorQuery.getBlob(1))).p());
                        if (r12.Q()) {
                            int i7 = cursorQuery.getInt(0);
                            List arrayList = (List) c1890a.get(Integer.valueOf(i7));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c1890a.put(Integer.valueOf(i7), arrayList);
                            }
                            arrayList.add(r12);
                        }
                    } catch (IOException e7) {
                        d().E().c("Failed to merge filter. appId", C1449n2.t(str), e7);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c1890a;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e8) {
            d().E().c("Database error querying filters. appId", C1449n2.t(str), e8);
            Map mapEmptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return mapEmptyMap2;
        }
    }

    final Map Z0(String str) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        C1890a c1890a = new C1890a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = z().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map mapEmptyMap = Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i7 = cursorRawQuery.getInt(0);
                    List arrayList = (List) c1890a.get(Integer.valueOf(i7));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        c1890a.put(Integer.valueOf(i7), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return c1890a;
            } catch (SQLiteException e7) {
                d().E().c("Database error querying scoped filters. appId", C1449n2.t(str), e7);
                Map mapEmptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final void a0(String str, List list) {
        boolean z6;
        C1463p2 c1463p2J;
        String str2;
        Object objT;
        Integer numValueOf;
        boolean z7;
        Preconditions.checkNotNull(list);
        for (int i7 = 0; i7 < list.size(); i7++) {
            Q1.a aVarV = (Q1.a) ((com.google.android.gms.internal.measurement.Q1) list.get(i7)).w();
            if (aVarV.t() != 0) {
                for (int i8 = 0; i8 < aVarV.t(); i8++) {
                    R1.a aVar = (R1.a) aVarV.x(i8).w();
                    R1.a aVar2 = (R1.a) ((AbstractC1260z4.b) aVar.clone());
                    String strB = w3.s.b(aVar.y());
                    if (strB != null) {
                        aVar2.v(strB);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    for (int i9 = 0; i9 < aVar.t(); i9++) {
                        com.google.android.gms.internal.measurement.S1 s1X = aVar.x(i9);
                        String strA = w3.u.a(s1X.J());
                        if (strA != null) {
                            aVar2.u(i9, (com.google.android.gms.internal.measurement.S1) ((AbstractC1260z4) ((S1.a) s1X.w()).t(strA).p()));
                            z7 = true;
                        }
                    }
                    if (z7) {
                        Q1.a aVarU = aVarV.u(i8, aVar2);
                        list.set(i7, (com.google.android.gms.internal.measurement.Q1) ((AbstractC1260z4) aVarU.p()));
                        aVarV = aVarU;
                    }
                }
            }
            if (aVarV.y() != 0) {
                for (int i10 = 0; i10 < aVarV.y(); i10++) {
                    com.google.android.gms.internal.measurement.U1 u1Z = aVarV.z(i10);
                    String strA2 = w3.t.a(u1Z.I());
                    if (strA2 != null) {
                        aVarV = aVarV.v(i10, ((U1.a) u1Z.w()).t(strA2));
                        list.set(i7, (com.google.android.gms.internal.measurement.Q1) ((AbstractC1260z4) aVarV.p()));
                    }
                }
            }
        }
        s();
        l();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZ = z();
        sQLiteDatabaseZ.beginTransaction();
        try {
            s();
            l();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZ2 = z();
            sQLiteDatabaseZ2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZ2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.Q1 q12 = (com.google.android.gms.internal.measurement.Q1) it.next();
                s();
                l();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(q12);
                if (q12.N()) {
                    int iJ = q12.j();
                    Iterator it2 = q12.L().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.R1) it2.next()).R()) {
                                c1463p2J = d().J();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                objT = C1449n2.t(str);
                                numValueOf = Integer.valueOf(iJ);
                                break;
                            }
                        } else {
                            Iterator it3 = q12.M().iterator();
                            while (it3.hasNext()) {
                                if (!((com.google.android.gms.internal.measurement.U1) it3.next()).M()) {
                                    c1463p2J = d().J();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objT = C1449n2.t(str);
                                    numValueOf = Integer.valueOf(iJ);
                                }
                            }
                            Iterator it4 = q12.L().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (!h0(str, iJ, (com.google.android.gms.internal.measurement.R1) it4.next())) {
                                        z6 = false;
                                        break;
                                    }
                                } else {
                                    z6 = true;
                                    break;
                                }
                            }
                            if (z6) {
                                Iterator it5 = q12.M().iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (!i0(str, iJ, (com.google.android.gms.internal.measurement.U1) it5.next())) {
                                            z6 = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z6) {
                                s();
                                l();
                                Preconditions.checkNotEmpty(str);
                                SQLiteDatabase sQLiteDatabaseZ3 = z();
                                sQLiteDatabaseZ3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iJ)});
                                sQLiteDatabaseZ3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iJ)});
                            }
                        }
                    }
                    c1463p2J.c(str2, objT, numValueOf);
                    break;
                }
                d().J().b("Audience with no ID. appId", C1449n2.t(str));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.Q1 q13 = (com.google.android.gms.internal.measurement.Q1) it6.next();
                arrayList.add(q13.N() ? Integer.valueOf(q13.j()) : null);
            }
            E0(str, arrayList);
            sQLiteDatabaseZ.setTransactionSuccessful();
            sQLiteDatabaseZ.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseZ.endTransaction();
            throw th;
        }
    }

    public final void a1() {
        s();
        z().beginTransaction();
    }

    final void b0(List list) {
        l();
        s();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (m0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (A0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                d().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e7) {
                d().E().b("Error incrementing retry count. error", e7);
            }
        }
    }

    public final void b1(String str) {
        l();
        s();
        try {
            z().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e7) {
            d().E().b("Error clearing default event params", e7);
        }
    }

    public final void c1(String str) {
        A aJ0;
        T0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = z().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (aJ0 = J0(str, string)) != null) {
                        X("events_snapshot", aJ0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e7) {
                d().E().c("Error creating snapshot. appId", C1449n2.t(str), e7);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean d0(C1242x2 c1242x2, boolean z6) {
        C1463p2 c1463p2E;
        Object objT;
        String str;
        ContentValues contentValues;
        l();
        s();
        Preconditions.checkNotNull(c1242x2);
        Preconditions.checkNotEmpty(c1242x2.x2());
        Preconditions.checkState(c1242x2.L0());
        h1();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (c1242x2.c2() < jCurrentTimeMillis - C1397g.N() || c1242x2.c2() > C1397g.N() + jCurrentTimeMillis) {
            d().J().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C1449n2.t(c1242x2.x2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c1242x2.c2()));
        }
        try {
            byte[] bArrF0 = m().f0(c1242x2.i());
            d().I().b("Saving bundle, size", Integer.valueOf(bArrF0.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", c1242x2.x2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c1242x2.c2()));
            contentValues.put("data", bArrF0);
            contentValues.put("has_realtime", Integer.valueOf(z6 ? 1 : 0));
            if (c1242x2.S0()) {
                contentValues.put("retry_count", Integer.valueOf(c1242x2.B1()));
            }
        } catch (IOException e7) {
            e = e7;
            c1463p2E = d().E();
            objT = C1449n2.t(c1242x2.x2());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (z().insert("queue", null, contentValues) != -1) {
                return true;
            }
            d().E().b("Failed to insert bundle (got -1). appId", C1449n2.t(c1242x2.x2()));
            return false;
        } catch (SQLiteException e8) {
            e = e8;
            c1463p2E = d().E();
            objT = C1449n2.t(c1242x2.x2());
            str = "Error storing bundle. appId";
            c1463p2E.c(str, objT, e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(String str) throws Throwable {
        boolean z6;
        A aH0;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        A aJ0 = J0(str, "_f");
        A aJ02 = J0(str, "_v");
        T0("events", str);
        boolean z7 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = z().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                if (aJ0 != null) {
                    X("events", aJ0);
                } else if (aJ02 != null) {
                    X("events", aJ02);
                }
                T0("events_snapshot", str);
                return;
            }
            boolean z8 = false;
            z6 = false;
            do {
                try {
                    String string = cursorQuery.getString(0);
                    if (b().r(G.f15513b1)) {
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z8 = true;
                            } else if ("_v".equals(string)) {
                                z6 = true;
                            }
                        }
                    } else if ("_f".equals(string)) {
                        z8 = true;
                    } else if ("_v".equals(string)) {
                        z6 = true;
                    }
                    if (string != null && (aH0 = H0("events_snapshot", str, string)) != null) {
                        X("events", aH0);
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    z7 = z8;
                    try {
                        d().E().c("Error querying snapshot. appId", C1449n2.t(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (!z7 && aJ0 != null) {
                            X("events", aJ0);
                        } else if (!z6 && aJ02 != null) {
                            X("events", aJ02);
                        }
                        T0("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z7 && aJ0 != null) {
                            X("events", aJ0);
                        } else if (!z6 && aJ02 != null) {
                            X("events", aJ02);
                        }
                        T0("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z7 = z8;
                    if (cursorQuery != null) {
                    }
                    if (z7) {
                        if (!z6) {
                            X("events", aJ02);
                        }
                    }
                    T0("events_snapshot", str);
                    throw th;
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            if (!z8 && aJ0 != null) {
                X("events", aJ0);
            } else if (!z6 && aJ02 != null) {
                X("events", aJ02);
            }
            T0("events_snapshot", str);
        } catch (SQLiteException e8) {
            e = e8;
            z6 = false;
        } catch (Throwable th3) {
            th = th3;
            z6 = false;
        }
    }

    public final boolean e0(C1383e c1383e) {
        Preconditions.checkNotNull(c1383e);
        l();
        s();
        String str = c1383e.f16005m;
        Preconditions.checkNotNull(str);
        if (L0(str, c1383e.f16007o.f15876n) == null && A0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1383e.f16006n);
        contentValues.put("name", c1383e.f16007o.f15876n);
        R(contentValues, "value", Preconditions.checkNotNull(c1383e.f16007o.w()));
        contentValues.put(AppStateModule.APP_STATE_ACTIVE, Boolean.valueOf(c1383e.f16009q));
        contentValues.put("trigger_event_name", c1383e.f16010r);
        contentValues.put("trigger_timeout", Long.valueOf(c1383e.f16012t));
        h();
        contentValues.put("timed_out_event", d6.o0(c1383e.f16011s));
        contentValues.put("creation_timestamp", Long.valueOf(c1383e.f16008p));
        h();
        contentValues.put("triggered_event", d6.o0(c1383e.f16013u));
        contentValues.put("triggered_timestamp", Long.valueOf(c1383e.f16007o.f15877o));
        contentValues.put("time_to_live", Long.valueOf(c1383e.f16014v));
        h();
        contentValues.put("expired_event", d6.o0(c1383e.f16015w));
        try {
            if (z().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert/update conditional user property (got -1)", C1449n2.t(str));
            return true;
        } catch (SQLiteException e7) {
            d().E().c("Error storing conditional user property", C1449n2.t(str), e7);
            return true;
        }
    }

    public final boolean e1(String str) {
        if (y7.a() && !b().r(G.f15461C0)) {
            return false;
        }
        String strX0 = x0();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strX0);
        return A0(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean f0(B b7, long j7, boolean z6) {
        l();
        s();
        Preconditions.checkNotNull(b7);
        Preconditions.checkNotEmpty(b7.f15368a);
        byte[] bArrI = m().C(b7).i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b7.f15368a);
        contentValues.put("name", b7.f15369b);
        contentValues.put("timestamp", Long.valueOf(b7.f15371d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j7));
        contentValues.put("data", bArrI);
        contentValues.put("realtime", Integer.valueOf(z6 ? 1 : 0));
        try {
            if (z().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            d().E().b("Failed to insert raw event (got -1). appId", C1449n2.t(b7.f15368a));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing raw event. appId", C1449n2.t(b7.f15368a), e7);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean f1(String str) {
        boolean z6;
        boolean z7;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = z().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e7) {
            e = e7;
            z6 = false;
        }
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return false;
        }
        z6 = zzb().currentTimeMillis() < cursorRawQuery.getLong(0) + 15000;
        try {
            z7 = E("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
            cursorRawQuery.close();
        } catch (SQLiteException e8) {
            e = e8;
            d().E().b("Error checking backfill conditions", e);
            z7 = false;
        }
        return (z6 || z7) ? false : true;
        d().E().b("Error checking backfill conditions", e);
        z7 = false;
        if (z6) {
        }
    }

    public final boolean g0(a6 a6Var) {
        Preconditions.checkNotNull(a6Var);
        l();
        s();
        if (L0(a6Var.f15906a, a6Var.f15908c) == null) {
            if (d6.I0(a6Var.f15908c)) {
                if (A0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{a6Var.f15906a}) >= b().o(a6Var.f15906a, G.f15474J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(a6Var.f15908c) && A0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{a6Var.f15906a, a6Var.f15907b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a6Var.f15906a);
        contentValues.put("origin", a6Var.f15907b);
        contentValues.put("name", a6Var.f15908c);
        contentValues.put("set_timestamp", Long.valueOf(a6Var.f15909d));
        R(contentValues, "value", a6Var.f15910e);
        try {
            if (z().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert/update user property (got -1). appId", C1449n2.t(a6Var.f15906a));
            return true;
        } catch (SQLiteException e7) {
            d().E().c("Error storing user property. appId", C1449n2.t(a6Var.f15906a), e7);
            return true;
        }
    }

    public final void g1() {
        s();
        z().endTransaction();
    }

    final void h1() {
        int iDelete;
        l();
        s();
        if (m0()) {
            long jA = q().f16104e.a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > C1397g.O()) {
                q().f16104e.b(jElapsedRealtime);
                l();
                s();
                if (!m0() || (iDelete = z().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(C1397g.N())})) <= 0) {
                    return;
                }
                d().I().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    public final void i1() {
        s();
        z().setTransactionSuccessful();
    }

    public final boolean j0(String str, C1234w2 c1234w2, String str2, Map map, w3.C c7) {
        int iDelete;
        l();
        s();
        Preconditions.checkNotNull(c1234w2);
        Preconditions.checkNotEmpty(str);
        if (y7.a() && !b().r(G.f15461C0)) {
            return false;
        }
        l();
        s();
        if (m0()) {
            long jA = q().f16105f.a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > C1397g.O()) {
                q().f16105f.b(jElapsedRealtime);
                l();
                s();
                if (m0() && (iDelete = z().delete("upload_queue", x0(), new String[0])) > 0) {
                    d().I().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] bArrI = c1234w2.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrI);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i7 = 1;
            while (i7 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i7);
                i7++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(c7.a()));
        contentValues.put("creation_timestamp", Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (z().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            d().E().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing MeasurementBatch to upload_queue. appId", str, e7);
            return false;
        }
    }

    public final boolean j1() {
        return A0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean k0(String str, B5 b52) {
        l();
        s();
        Preconditions.checkNotNull(b52);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        long j7 = b52.f15385n;
        C1365b2 c1365b2 = G.f15533i0;
        if (j7 < jCurrentTimeMillis - ((Long) c1365b2.a(null)).longValue() || b52.f15385n > ((Long) c1365b2.a(null)).longValue() + jCurrentTimeMillis) {
            d().J().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C1449n2.t(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(b52.f15385n));
        }
        d().I().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b52.f15384m);
        contentValues.put("source", Integer.valueOf(b52.f15386o));
        contentValues.put("timestamp_millis", Long.valueOf(b52.f15385n));
        try {
            if (z().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            d().E().b("Failed to insert trigger URI (got -1). appId", C1449n2.t(str));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing trigger URI. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    public final boolean k1() {
        return A0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean l0(String str, Long l7, long j7, C1199s2 c1199s2) {
        l();
        s();
        Preconditions.checkNotNull(c1199s2);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l7);
        byte[] bArrI = c1199s2.i();
        d().I().c("Saving complex main event, appId, data size", e().c(str), Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j7));
        contentValues.put("main_event", bArrI);
        try {
            if (z().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            d().E().b("Failed to insert complex main event (got -1). appId", C1449n2.t(str));
            return false;
        } catch (SQLiteException e7) {
            d().E().c("Error storing complex main event. appId", C1449n2.t(str), e7);
            return false;
        }
    }

    public final boolean l1() {
        return A0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean m0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    public final long w() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = z().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j7 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j7;
            } catch (SQLiteException e7) {
                d().E().b("Error querying raw events", e7);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long x() {
        return E("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long y() {
        return E("select max(timestamp) from raw_events", null, 0L);
    }

    public final long y0(String str) {
        Preconditions.checkNotEmpty(str);
        l();
        s();
        return E("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    final SQLiteDatabase z() {
        l();
        try {
            return this.f16128d.getWritableDatabase();
        } catch (SQLiteException e7) {
            d().J().b("Error opening database", e7);
            throw e7;
        }
    }

    protected final long z0(String str, String str2) {
        long jE;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        s();
        SQLiteDatabase sQLiteDatabaseZ = z();
        sQLiteDatabaseZ.beginTransaction();
        long j7 = 0;
        try {
            try {
                jE = E("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseZ.endTransaction();
            }
        } catch (SQLiteException e7) {
            e = e7;
        }
        if (jE == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseZ.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                d().E().c("Failed to insert column (got -1). appId", C1449n2.t(str), str2);
                return -1L;
            }
            jE = 0;
            d().E().d("Error inserting column. appId", C1449n2.t(str), str2, e);
            sQLiteDatabaseZ.endTransaction();
            return j7;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put(str2, Long.valueOf(1 + jE));
            if (sQLiteDatabaseZ.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                d().E().c("Failed to update column (got 0). appId", C1449n2.t(str), str2);
                return -1L;
            }
            sQLiteDatabaseZ.setTransactionSuccessful();
            return jE;
        } catch (SQLiteException e8) {
            long j8 = jE;
            e = e8;
            j7 = j8;
        }
    }
}
