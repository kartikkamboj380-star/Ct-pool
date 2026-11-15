package X;

import X.e;
import Z.g;
import android.database.Cursor;
import j5.AbstractC1787F;
import j5.AbstractC1794M;
import j5.AbstractC1809n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import t5.AbstractC2070a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final Map a(g gVar, String str) throws IOException {
        Cursor cursorO0 = gVar.o0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorO0.getColumnCount() <= 0) {
                Map mapG = AbstractC1787F.g();
                AbstractC2070a.a(cursorO0, null);
                return mapG;
            }
            int columnIndex = cursorO0.getColumnIndex("name");
            int columnIndex2 = cursorO0.getColumnIndex("type");
            int columnIndex3 = cursorO0.getColumnIndex("notnull");
            int columnIndex4 = cursorO0.getColumnIndex("pk");
            int columnIndex5 = cursorO0.getColumnIndex("dflt_value");
            Map mapC = AbstractC1787F.c();
            while (cursorO0.moveToNext()) {
                String string = cursorO0.getString(columnIndex);
                String string2 = cursorO0.getString(columnIndex2);
                boolean z6 = cursorO0.getInt(columnIndex3) != 0;
                int i7 = cursorO0.getInt(columnIndex4);
                String string3 = cursorO0.getString(columnIndex5);
                k.e(string, "name");
                k.e(string2, "type");
                mapC.put(string, new e.a(string, string2, z6, i7, string3, 2));
            }
            Map mapB = AbstractC1787F.b(mapC);
            AbstractC2070a.a(cursorO0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2070a.a(cursorO0, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = AbstractC1809n.c();
        while (cursor.moveToNext()) {
            int i7 = cursor.getInt(columnIndex);
            int i8 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            k.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            k.e(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i7, i8, string, string2));
        }
        return AbstractC1809n.W(AbstractC1809n.a(listC));
    }

    private static final Set c(g gVar, String str) throws IOException {
        Cursor cursorO0 = gVar.o0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorO0.getColumnIndex("id");
            int columnIndex2 = cursorO0.getColumnIndex("seq");
            int columnIndex3 = cursorO0.getColumnIndex("table");
            int columnIndex4 = cursorO0.getColumnIndex("on_delete");
            int columnIndex5 = cursorO0.getColumnIndex("on_update");
            List listB = b(cursorO0);
            cursorO0.moveToPosition(-1);
            Set setB = AbstractC1794M.b();
            while (cursorO0.moveToNext()) {
                if (cursorO0.getInt(columnIndex2) == 0) {
                    int i7 = cursorO0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).j() == i7) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.h());
                        arrayList2.add(dVar.k());
                    }
                    String string = cursorO0.getString(columnIndex3);
                    k.e(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorO0.getString(columnIndex4);
                    k.e(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorO0.getString(columnIndex5);
                    k.e(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = AbstractC1794M.a(setB);
            AbstractC2070a.a(cursorO0, null);
            return setA;
        } finally {
        }
    }

    private static final e.C0098e d(g gVar, String str, boolean z6) throws IOException {
        Cursor cursorO0 = gVar.o0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorO0.getColumnIndex("seqno");
            int columnIndex2 = cursorO0.getColumnIndex("cid");
            int columnIndex3 = cursorO0.getColumnIndex("name");
            int columnIndex4 = cursorO0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorO0.moveToNext()) {
                    if (cursorO0.getInt(columnIndex2) >= 0) {
                        int i7 = cursorO0.getInt(columnIndex);
                        String string = cursorO0.getString(columnIndex3);
                        String str2 = cursorO0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i7);
                        k.e(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i7), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                k.e(collectionValues, "columnsMap.values");
                List listB0 = AbstractC1809n.b0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                k.e(collectionValues2, "ordersMap.values");
                e.C0098e c0098e = new e.C0098e(str, z6, listB0, AbstractC1809n.b0(collectionValues2));
                AbstractC2070a.a(cursorO0, null);
                return c0098e;
            }
            AbstractC2070a.a(cursorO0, null);
            return null;
        } finally {
        }
    }

    private static final Set e(g gVar, String str) throws IOException {
        Cursor cursorO0 = gVar.o0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorO0.getColumnIndex("name");
            int columnIndex2 = cursorO0.getColumnIndex("origin");
            int columnIndex3 = cursorO0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = AbstractC1794M.b();
                while (cursorO0.moveToNext()) {
                    if (k.b("c", cursorO0.getString(columnIndex2))) {
                        String string = cursorO0.getString(columnIndex);
                        boolean z6 = true;
                        if (cursorO0.getInt(columnIndex3) != 1) {
                            z6 = false;
                        }
                        k.e(string, "name");
                        e.C0098e c0098eD = d(gVar, string, z6);
                        if (c0098eD == null) {
                            AbstractC2070a.a(cursorO0, null);
                            return null;
                        }
                        setB.add(c0098eD);
                    }
                }
                Set setA = AbstractC1794M.a(setB);
                AbstractC2070a.a(cursorO0, null);
                return setA;
            }
            AbstractC2070a.a(cursorO0, null);
            return null;
        } finally {
        }
    }

    public static final e f(g gVar, String str) {
        k.f(gVar, "database");
        k.f(str, "tableName");
        return new e(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
