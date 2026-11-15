package com.tenjin.android.store;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TenjinRoomConverters {
    public static Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    public static String fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new R4.d().r(map);
    }

    public static Map<String, String> fromString(String str) {
        Type type = new TypeToken<Map<String, String>>() { // from class: com.tenjin.android.store.TenjinRoomConverters.1
        }.getType();
        if (str == null) {
            return null;
        }
        return (Map) new R4.d().j(str, type);
    }

    public static Date fromTimestamp(Long l7) {
        if (l7 == null) {
            return null;
        }
        return new Date(l7.longValue());
    }
}
