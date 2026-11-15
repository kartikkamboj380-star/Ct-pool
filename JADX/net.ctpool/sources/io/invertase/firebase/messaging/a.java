package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: io.invertase.firebase.messaging.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0269a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20124a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f20124a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20124a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20124a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20124a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20124a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20124a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static WritableArray a(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableArrayCreateArray.pushDouble(jSONArray.getDouble(i7));
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushInt(jSONArray.getInt(i7));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString(jSONArray.getString(i7));
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(b(jSONArray.getJSONObject(i7)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(a(jSONArray.getJSONArray(i7)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap b(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, b(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, a(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    public static JSONArray c(ReadableArray readableArray) throws JSONException {
        Object string;
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            switch (C0269a.f20124a[readableArray.getType(i7).ordinal()]) {
                case 1:
                    string = JSONObject.NULL;
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i7));
                    continue;
                    break;
                case 3:
                    try {
                        jSONArray.put(readableArray.getInt(i7));
                        continue;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i7));
                    }
                    break;
                case 4:
                    string = readableArray.getString(i7);
                    break;
                case 5:
                    string = d(readableArray.getMap(i7));
                    break;
                case 6:
                    string = c(readableArray.getArray(i7));
                    break;
                default:
                    break;
            }
            jSONArray.put(string);
        }
        return jSONArray;
    }

    public static JSONObject d(ReadableMap readableMap) throws JSONException {
        Object string;
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (C0269a.f20124a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    string = JSONObject.NULL;
                    break;
                case 2:
                    jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                    continue;
                case 3:
                    try {
                        jSONObject.put(strNextKey, readableMap.getInt(strNextKey));
                        continue;
                    } catch (Exception unused) {
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                    }
                    break;
                case 4:
                    string = readableMap.getString(strNextKey);
                    break;
                case 5:
                    string = d(readableMap.getMap(strNextKey));
                    break;
                case 6:
                    string = c(readableMap.getArray(strNextKey));
                    break;
            }
            jSONObject.put(strNextKey, string);
        }
        return jSONObject;
    }
}
