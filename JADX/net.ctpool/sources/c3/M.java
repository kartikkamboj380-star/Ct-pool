package c3;

import U2.i;
import X2.a;
import X2.c;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import d3.C1605a;
import d3.b;
import e3.InterfaceC1622a;
import f3.AbstractC1649a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public class M implements InterfaceC0717d, d3.b, InterfaceC0716c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final S2.c f10011r = S2.c.b("proto");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final W f10012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1622a f10013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC1622a f10014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC0718e f10015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Provider f10016q;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f10017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f10018b;

        private c(String str, String str2) {
            this.f10017a = str;
            this.f10018b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, AbstractC0718e abstractC0718e, W w6, Provider provider) {
        this.f10012m = w6;
        this.f10013n = interfaceC1622a;
        this.f10014o = interfaceC1622a2;
        this.f10015p = abstractC0718e;
        this.f10016q = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long A1(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ X2.f B1(long j7, Cursor cursor) {
        cursor.moveToNext();
        return X2.f.c().c(cursor.getLong(0)).b(j7).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ X2.f C1(final long j7, SQLiteDatabase sQLiteDatabase) {
        return (X2.f) c2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: c3.D
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.B1(j7, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long D1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean E1(U2.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lR1 = r1(sQLiteDatabase, pVar);
        return lR1 == null ? Boolean.FALSE : (Boolean) c2(m1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lR1.toString()}), new b() { // from class: c3.u
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List F1(SQLiteDatabase sQLiteDatabase) {
        return (List) c2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: c3.K
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.G1((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List G1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(U2.p.a().b(cursor.getString(1)).d(AbstractC1649a.b(cursor.getInt(2))).c(W1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List H1(U2.p pVar, SQLiteDatabase sQLiteDatabase) {
        List listU1 = U1(sQLiteDatabase, pVar, this.f10015p.d());
        for (S2.f fVar : S2.f.values()) {
            if (fVar != pVar.d()) {
                int iD = this.f10015p.d() - listU1.size();
                if (iD <= 0) {
                    break;
                }
                listU1.addAll(U1(sQLiteDatabase, pVar.f(fVar), iD));
            }
        }
        return u1(listU1, V1(sQLiteDatabase, listU1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ X2.a I1(Map map, a.C0099a c0099a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarI1 = i1(cursor.getInt(1));
            long j7 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(X2.c.c().c(bVarI1).b(j7).a());
        }
        X1(c0099a, map);
        return c0099a.e(q1()).d(n1()).c((String) this.f10016q.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ X2.a J1(String str, final Map map, final a.C0099a c0099a, SQLiteDatabase sQLiteDatabase) {
        return (X2.a) c2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: c3.A
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f9997a.I1(map, c0099a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object K1(List list, U2.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j7 = cursor.getLong(0);
            boolean z6 = cursor.getInt(7) != 0;
            i.a aVarO = U2.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            aVarO.h(z6 ? new U2.h(a2(cursor.getString(4)), cursor.getBlob(5)) : new U2.h(a2(cursor.getString(4)), Y1(j7)));
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC0724k.a(j7, pVar, aVarO.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object L1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j7 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j7));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j7), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long M1(U2.i iVar, U2.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (t1()) {
            e(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jK1 = k1(sQLiteDatabase, pVar);
        int iE = this.f10015p.e();
        byte[] bArrA = iVar.e().a();
        boolean z6 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jK1));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z6));
        contentValues.put("payload", z6 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z6) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i7 = 1; i7 <= iCeil; i7++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i7 - 1) * iE, Math.min(i7 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i7));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] N1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            byte[] bArr2 = (byte[]) arrayList.get(i7);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object O1(Cursor cursor) {
        while (cursor.moveToNext()) {
            e(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object P1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        c2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: c3.v
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10073a.O1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean Q1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object R1(String str, c.b bVar, long j7, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) c2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), new b() { // from class: c3.y
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.Q1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j7 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.d()));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object S1(long j7, U2.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j7));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(AbstractC1649a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(AbstractC1649a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object T1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f10013n.a()).execute();
        return null;
    }

    private List U1(SQLiteDatabase sQLiteDatabase, final U2.p pVar, int i7) {
        final ArrayList arrayList = new ArrayList();
        Long lR1 = r1(sQLiteDatabase, pVar);
        if (lR1 == null) {
            return arrayList;
        }
        c2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lR1.toString()}, null, null, null, String.valueOf(i7)), new b() { // from class: c3.x
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10074a.K1(arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map V1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < list.size(); i7++) {
            sb.append(((AbstractC0724k) list.get(i7)).c());
            if (i7 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        c2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: c3.z
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.L1(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] W1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void X1(a.C0099a c0099a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0099a.a(X2.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private byte[] Y1(long j7) {
        return (byte[]) c2(m1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num"), new b() { // from class: c3.B
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.N1((Cursor) obj);
            }
        });
    }

    private Object Z1(d dVar, b bVar) {
        long jA = this.f10014o.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e7) {
                if (this.f10014o.a() >= ((long) this.f10015p.b()) + jA) {
                    return bVar.apply(e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static S2.c a2(String str) {
        return str == null ? f10011r : S2.c.b(str);
    }

    private static String b2(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0724k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static Object c2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b i1(int i7) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i7 == bVar.d()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i7 == bVar2.d()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i7 == bVar3.d()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i7 == bVar4.d()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i7 == bVar5.d()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i7 == bVar6.d()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i7 == bVar7.d()) {
            return bVar7;
        }
        Y2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i7));
        return bVar;
    }

    private void j1(final SQLiteDatabase sQLiteDatabase) {
        Z1(new d() { // from class: c3.l
            @Override // c3.M.d
            public final Object a() {
                return M.x1(sQLiteDatabase);
            }
        }, new b() { // from class: c3.w
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.y1((Throwable) obj);
            }
        });
    }

    private long k1(SQLiteDatabase sQLiteDatabase, U2.p pVar) {
        Long lR1 = r1(sQLiteDatabase, pVar);
        if (lR1 != null) {
            return lR1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(AbstractC1649a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private X2.b n1() {
        return X2.b.b().b(X2.e.c().b(l1()).c(AbstractC0718e.f10052a.f()).a()).a();
    }

    private long o1() {
        return m1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long p1() {
        return m1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private X2.f q1() {
        final long jA = this.f10013n.a();
        return (X2.f) s1(new b() { // from class: c3.C
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.C1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long r1(SQLiteDatabase sQLiteDatabase, U2.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(AbstractC1649a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) c2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: c3.n
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.D1((Cursor) obj);
            }
        });
    }

    private boolean t1() {
        return o1() * p1() >= this.f10015p.f();
    }

    private List u1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0724k abstractC0724k = (AbstractC0724k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0724k.c()))) {
                i.a aVarP = abstractC0724k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0724k.c()))) {
                    aVarP.c(cVar.f10017a, cVar.f10018b);
                }
                listIterator.set(AbstractC0724k.a(abstractC0724k.c(), abstractC0724k.d(), aVarP.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object v1(Cursor cursor) {
        while (cursor.moveToNext()) {
            e(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer w1(long j7, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j7)};
        c2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: c3.s
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10068a.v1((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object x1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y1(Throwable th) {
        throw new C1605a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase z1(Throwable th) {
        throw new C1605a("Timed out while trying to open db.", th);
    }

    @Override // c3.InterfaceC0717d
    public void E0(final U2.p pVar, final long j7) {
        s1(new b() { // from class: c3.p
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.S1(j7, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // c3.InterfaceC0717d
    public Iterable N(final U2.p pVar) {
        return (Iterable) s1(new b() { // from class: c3.m
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10058a.H1(pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // c3.InterfaceC0717d
    public AbstractC0724k S(final U2.p pVar, final U2.i iVar) {
        Y2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) s1(new b() { // from class: c3.I
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10003a.M1(iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0724k.a(jLongValue, pVar, iVar);
    }

    @Override // c3.InterfaceC0717d
    public boolean U0(final U2.p pVar) {
        return ((Boolean) s1(new b() { // from class: c3.o
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10060a.E1(pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // c3.InterfaceC0717d
    public Iterable V() {
        return (Iterable) s1(new b() { // from class: c3.G
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.F1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // c3.InterfaceC0717d
    public void V0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + b2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            s1(new b() { // from class: c3.L
                @Override // c3.M.b
                public final Object apply(Object obj) {
                    return this.f10008a.P1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // c3.InterfaceC0716c
    public void a() {
        s1(new b() { // from class: c3.q
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10064a.T1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // d3.b
    public Object b(b.a aVar) {
        SQLiteDatabase sQLiteDatabaseM1 = m1();
        j1(sQLiteDatabaseM1);
        try {
            Object objF = aVar.f();
            sQLiteDatabaseM1.setTransactionSuccessful();
            return objF;
        } finally {
            sQLiteDatabaseM1.endTransaction();
        }
    }

    @Override // c3.InterfaceC0717d
    public int c() {
        final long jA = this.f10013n.a() - this.f10015p.c();
        return ((Integer) s1(new b() { // from class: c3.J
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10006a.w1(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10012m.close();
    }

    @Override // c3.InterfaceC0716c
    public X2.a d() {
        final a.C0099a c0099aE = X2.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (X2.a) s1(new b() { // from class: c3.t
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return this.f10069a.J1(str, map, c0099aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // c3.InterfaceC0716c
    public void e(final long j7, final c.b bVar, final String str) {
        s1(new b() { // from class: c3.r
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.R1(str, bVar, j7, (SQLiteDatabase) obj);
            }
        });
    }

    long l1() {
        return o1() * p1();
    }

    SQLiteDatabase m1() {
        final W w6 = this.f10012m;
        Objects.requireNonNull(w6);
        return (SQLiteDatabase) Z1(new d() { // from class: c3.E
            @Override // c3.M.d
            public final Object a() {
                return w6.getWritableDatabase();
            }
        }, new b() { // from class: c3.F
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.z1((Throwable) obj);
            }
        });
    }

    @Override // c3.InterfaceC0717d
    public long p(U2.p pVar) {
        return ((Long) c2(m1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(AbstractC1649a.a(pVar.d()))}), new b() { // from class: c3.H
            @Override // c3.M.b
            public final Object apply(Object obj) {
                return M.A1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // c3.InterfaceC0717d
    public void r(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            m1().compileStatement("DELETE FROM events WHERE _id in " + b2(iterable)).execute();
        }
    }

    Object s1(b bVar) {
        SQLiteDatabase sQLiteDatabaseM1 = m1();
        sQLiteDatabaseM1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseM1);
            sQLiteDatabaseM1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM1.endTransaction();
        }
    }
}
