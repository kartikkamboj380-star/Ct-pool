package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC1171p0;
import com.google.android.gms.internal.measurement.C1195r7;

/* JADX INFO: loaded from: classes.dex */
final class r extends AbstractC1171p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1425k f16252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C1425k c1425k, Context context, String str) {
        super(context, str, null, 1);
        this.f16252m = c1425k;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if (!this.f16252m.f16129e.b(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            this.f16252m.f16129e.c();
            this.f16252m.d().E().a("Opening the database failed, dropping and recreating it");
            if (!this.f16252m.a().getDatabasePath("google_app_measurement.db").delete()) {
                this.f16252m.d().E().b("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                this.f16252m.f16129e.a();
                return writableDatabase;
            } catch (SQLiteException e7) {
                this.f16252m.d().E().b("Failed to open freshly created database", e7);
                throw e7;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1494u.b(this.f16252m.d(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1425k.f16118f);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1425k.f16119g);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1425k.f16120h);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1425k.f16122j);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1425k.f16121i);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1425k.f16123k);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1425k.f16124l);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1425k.f16125m);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1425k.f16126n);
        if (C1195r7.a()) {
            AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1425k.f16127o);
        }
        AbstractC1494u.c(this.f16252m.d(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
