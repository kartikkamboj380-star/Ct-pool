package com.tenjin.android.store;

import Z.k;
import android.database.Cursor;
import androidx.room.A;
import androidx.room.h;
import androidx.room.i;
import androidx.room.u;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QueueEventDao_Impl implements QueueEventDao {
    private final u __db;
    private final h __deletionAdapterOfQueueEvent;
    private final i __insertionAdapterOfQueueEvent;
    private final A __preparedStmtOfDeleteAllEvents;
    private final A __preparedStmtOfDeleteOldEvents;

    public QueueEventDao_Impl(u uVar) {
        this.__db = uVar;
        this.__insertionAdapterOfQueueEvent = new i(uVar) { // from class: com.tenjin.android.store.QueueEventDao_Impl.1
            @Override // androidx.room.i
            public void bind(k kVar, QueueEvent queueEvent) {
                kVar.b0(1, queueEvent.getId());
                String strFromMap = TenjinRoomConverters.fromMap(queueEvent.getParams());
                if (strFromMap == null) {
                    kVar.A0(2);
                } else {
                    kVar.v(2, strFromMap);
                }
                Long lDateToTimestamp = TenjinRoomConverters.dateToTimestamp(queueEvent.getDate());
                if (lDateToTimestamp == null) {
                    kVar.A0(3);
                } else {
                    kVar.b0(3, lDateToTimestamp.longValue());
                }
                if (queueEvent.getEndpoint() == null) {
                    kVar.A0(4);
                } else {
                    kVar.v(4, queueEvent.getEndpoint());
                }
            }

            @Override // androidx.room.A
            public String createQuery() {
                return "INSERT OR ABORT INTO `QueueEvent` (`id`,`params`,`date`,`endpoint`) VALUES (nullif(?, 0),?,?,?)";
            }
        };
        this.__deletionAdapterOfQueueEvent = new h(uVar) { // from class: com.tenjin.android.store.QueueEventDao_Impl.2
            @Override // androidx.room.h
            public void bind(k kVar, QueueEvent queueEvent) {
                kVar.b0(1, queueEvent.getId());
            }

            @Override // androidx.room.A
            public String createQuery() {
                return "DELETE FROM `QueueEvent` WHERE `id` = ?";
            }
        };
        this.__preparedStmtOfDeleteAllEvents = new A(uVar) { // from class: com.tenjin.android.store.QueueEventDao_Impl.3
            @Override // androidx.room.A
            public String createQuery() {
                return "DELETE FROM QueueEvent";
            }
        };
        this.__preparedStmtOfDeleteOldEvents = new A(uVar) { // from class: com.tenjin.android.store.QueueEventDao_Impl.4
            @Override // androidx.room.A
            public String createQuery() {
                return "DELETE FROM QueueEvent WHERE date < ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public void delete(QueueEvent queueEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfQueueEvent.handle(queueEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public void deleteAllEvents() {
        this.__db.assertNotSuspendingTransaction();
        k kVarAcquire = this.__preparedStmtOfDeleteAllEvents.acquire();
        this.__db.beginTransaction();
        try {
            kVarAcquire.D();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllEvents.release(kVarAcquire);
        }
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public void deleteOldEvents(Date date) {
        this.__db.assertNotSuspendingTransaction();
        k kVarAcquire = this.__preparedStmtOfDeleteOldEvents.acquire();
        Long lDateToTimestamp = TenjinRoomConverters.dateToTimestamp(date);
        if (lDateToTimestamp == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.b0(1, lDateToTimestamp.longValue());
        }
        this.__db.beginTransaction();
        try {
            kVarAcquire.D();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOldEvents.release(kVarAcquire);
        }
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public List<QueueEvent> getAllEvents(Date date) {
        x xVarD = x.d("SELECT * FROM QueueEvent WHERE date >= ? ORDER BY date DESC", 1);
        Long lDateToTimestamp = TenjinRoomConverters.dateToTimestamp(date);
        if (lDateToTimestamp == null) {
            xVarD.A0(1);
        } else {
            xVarD.b0(1, lDateToTimestamp.longValue());
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.__db, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "params");
            int iE3 = X.a.e(cursorB, "date");
            int iE4 = X.a.e(cursorB, "endpoint");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                QueueEvent queueEvent = new QueueEvent();
                queueEvent.setId(cursorB.getInt(iE));
                queueEvent.setParams(TenjinRoomConverters.fromString(cursorB.isNull(iE2) ? null : cursorB.getString(iE2)));
                queueEvent.setDate(TenjinRoomConverters.fromTimestamp(cursorB.isNull(iE3) ? null : Long.valueOf(cursorB.getLong(iE3))));
                queueEvent.setEndpoint(cursorB.isNull(iE4) ? null : cursorB.getString(iE4));
                arrayList.add(queueEvent);
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public List<QueueEvent> getEventsFromParams(String str) {
        x xVarD = x.d("SELECT * FROM QueueEvent WHERE params == ?", 1);
        if (str == null) {
            xVarD.A0(1);
        } else {
            xVarD.v(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = X.b.b(this.__db, xVarD, false, null);
        try {
            int iE = X.a.e(cursorB, "id");
            int iE2 = X.a.e(cursorB, "params");
            int iE3 = X.a.e(cursorB, "date");
            int iE4 = X.a.e(cursorB, "endpoint");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                QueueEvent queueEvent = new QueueEvent();
                queueEvent.setId(cursorB.getInt(iE));
                queueEvent.setParams(TenjinRoomConverters.fromString(cursorB.isNull(iE2) ? null : cursorB.getString(iE2)));
                queueEvent.setDate(TenjinRoomConverters.fromTimestamp(cursorB.isNull(iE3) ? null : Long.valueOf(cursorB.getLong(iE3))));
                queueEvent.setEndpoint(cursorB.isNull(iE4) ? null : cursorB.getString(iE4));
                arrayList.add(queueEvent);
            }
            return arrayList;
        } finally {
            cursorB.close();
            xVarD.release();
        }
    }

    @Override // com.tenjin.android.store.QueueEventDao
    public long insert(QueueEvent queueEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfQueueEvent.insertAndReturnId(queueEvent);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
