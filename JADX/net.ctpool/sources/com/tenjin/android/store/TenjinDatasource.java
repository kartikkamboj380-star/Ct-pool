package com.tenjin.android.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.platform.IDataSource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class TenjinDatasource implements IDataSource {
    Context context;
    private final QueueEventDao queueEventDao;
    private final SharedPreferences sharedPreferences;
    Date oneWeekAgo = new Date(System.currentTimeMillis() - 604800000);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public interface TenjinCallback {
        void onEventsLoaded(List<QueueEvent> list);
    }

    public TenjinDatasource(Context context) {
        this.queueEventDao = QueueEventDatabase.getDatabase(context).queueEventDao();
        this.sharedPreferences = context.getSharedPreferences(TenjinConsts.INSTALL_PREFERENCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteEvent$4(QueueEvent queueEvent) {
        this.queueEventDao.delete(queueEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteOldEvents$5() {
        this.queueEventDao.deleteOldEvents(this.oneWeekAgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllEvents$2(TenjinCallback tenjinCallback) {
        List<QueueEvent> allEvents = this.queueEventDao.getAllEvents(this.oneWeekAgo);
        this.queueEventDao.deleteOldEvents(this.oneWeekAgo);
        tenjinCallback.onEventsLoaded(allEvents);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getEventWithParams$3(Map map, TenjinCallback tenjinCallback) {
        tenjinCallback.onEventsLoaded(this.queueEventDao.getEventsFromParams(stringFromMap(map)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$insertEvent$0(QueueEvent queueEvent) {
        this.queueEventDao.insert(queueEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insertEventWithFuture$1(QueueEvent queueEvent) {
        return Long.valueOf(this.queueEventDao.insert(queueEvent));
    }

    public static String stringFromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new R4.d().r(map);
    }

    public void deleteEvent(final QueueEvent queueEvent) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f18573m.lambda$deleteEvent$4(queueEvent);
            }
        });
    }

    public void deleteOldEvents() {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f18581m.lambda$deleteOldEvents$5();
            }
        });
    }

    public void getAllEvents(final TenjinCallback tenjinCallback) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f18575m.lambda$getAllEvents$2(tenjinCallback);
            }
        });
    }

    public Boolean getCacheEventSetting() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_EVENT_CACHE_ENABLED, false));
    }

    public void getEventWithParams(final Map<String, String> map, final TenjinCallback tenjinCallback) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f18570m.lambda$getEventWithParams$3(map, tenjinCallback);
            }
        });
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public String getStoredAdvertisingId() {
        return this.sharedPreferences.getString(TenjinConsts.TENJIN_ADVERTISING_ID_STORE_KEY, null);
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public Boolean getStoredLimitAdTracking() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(TenjinConsts.TENJIN_AD_TRACKING_STORE_KEY, true));
    }

    public void insertEvent(final QueueEvent queueEvent) {
        this.executorService.execute(new Runnable() { // from class: com.tenjin.android.store.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f18579m.lambda$insertEvent$0(queueEvent);
            }
        });
    }

    public Future<Long> insertEventWithFuture(final QueueEvent queueEvent) {
        return this.executorService.submit(new Callable() { // from class: com.tenjin.android.store.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18577a.lambda$insertEventWithFuture$1(queueEvent);
            }
        });
    }

    @Override // com.tenjin.android.params.platform.IDataSource
    public void setAdvertisingIdInfo(String str, Boolean bool) {
        this.sharedPreferences.edit().putString(TenjinConsts.TENJIN_ADVERTISING_ID_STORE_KEY, str).apply();
        this.sharedPreferences.edit().putBoolean(TenjinConsts.TENJIN_AD_TRACKING_STORE_KEY, bool.booleanValue()).apply();
    }

    public void setCacheEventSetting(Boolean bool) {
        Log.d(TenjinConsts.LOG_TAG, "Set event cache setting " + bool);
        this.sharedPreferences.edit().putBoolean(TenjinConsts.TENJIN_EVENT_CACHE_ENABLED, bool.booleanValue()).apply();
    }
}
