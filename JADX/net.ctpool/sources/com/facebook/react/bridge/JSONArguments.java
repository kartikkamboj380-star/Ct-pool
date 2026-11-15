package com.facebook.react.bridge;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JSONArguments {
    public static ReadableArray fromJSONArray(JSONArray jSONArray) throws JSONException {
        int iIntValue;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    iIntValue = ((Long) obj).intValue();
                } else {
                    if (!jSONArray.isNull(i7)) {
                        throw new JSONException("Unexpected value when parsing JSON array. index: " + i7);
                    }
                    writableArrayCreateArray.pushNull();
                }
                writableArrayCreateArray.pushInt(iIntValue);
            }
        }
        return writableArrayCreateArray;
    }

    public static ReadableArray fromJSONArrayString(String str) {
        return fromJSONArray(new JSONArray(str));
    }

    public static ReadableMap fromJSONObject(JSONObject jSONObject) throws JSONException {
        int iIntValue;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, (String) obj);
            } else if (obj instanceof Boolean) {
                writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof Double) {
                    writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    iIntValue = ((Long) obj).intValue();
                } else {
                    if (!jSONObject.isNull(next)) {
                        throw new JSONException("Unexpected value when parsing JSON object. key: " + next);
                    }
                    writableMapCreateMap.putNull(next);
                }
                writableMapCreateMap.putInt(next, iIntValue);
            }
        }
        return writableMapCreateMap;
    }

    public static ReadableMap fromJSONObjectString(String str) {
        return fromJSONObject(new JSONObject(str));
    }
}
