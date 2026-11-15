package com.tenjin;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.tenjin.android.AttributionInfoCallback;
import com.tenjin.android.TenjinSDK;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TenjinModule extends ReactContextBaseJavaModule {
    public TenjinSDK instance;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: com.tenjin.TenjinModule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public TenjinModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.instance = null;
        this.reactContext = reactApplicationContext;
    }

    private JSONArray convertArrayToJson(ReadableArray readableArray) throws JSONException {
        Object string;
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            int i8 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i7).ordinal()];
            if (i8 == 2) {
                jSONArray.put(readableArray.getBoolean(i7));
            } else if (i8 != 3) {
                if (i8 == 4) {
                    string = readableArray.getString(i7);
                } else if (i8 == 5) {
                    string = convertMapToJson(readableArray.getMap(i7));
                } else if (i8 == 6) {
                    string = convertArrayToJson(readableArray.getArray(i7));
                }
                jSONArray.put(string);
            } else {
                jSONArray.put(readableArray.getDouble(i7));
            }
        }
        return jSONArray;
    }

    private JSONObject convertMapToJson(ReadableMap readableMap) throws JSONException {
        Object string;
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    string = JSONObject.NULL;
                    break;
                case 2:
                    jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                    continue;
                case 3:
                    jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                    continue;
                case 4:
                    string = readableMap.getString(strNextKey);
                    break;
                case 5:
                    string = convertMapToJson(readableMap.getMap(strNextKey));
                    break;
                case 6:
                    string = convertArrayToJson(readableMap.getArray(strNextKey));
                    break;
            }
            jSONObject.put(strNextKey, string);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAttributionInfo$0(Callback callback, Map map) {
        try {
            callback.invoke(convertJsonToMap(new JSONObject(map)));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    private String[] readableToArray(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            strArr[i7] = readableArray.getString(i7);
        }
        return strArr;
    }

    @ReactMethod
    public void appendAppSubversion(Double d7) {
        this.instance.appendAppSubversion(Integer.valueOf(d7.intValue()));
    }

    @ReactMethod
    public void connect() {
        this.instance.connect();
    }

    public WritableArray convertJsonToArray(JSONArray jSONArray) throws JSONException {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONObject) {
                writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else {
                writableNativeArray.pushString(obj instanceof String ? (String) obj : obj.toString());
            }
        }
        return writableNativeArray;
    }

    public WritableMap convertJsonToMap(JSONObject jSONObject) throws JSONException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                writableNativeMap.putArray(next, convertJsonToArray(jSONArray));
                if ("option_values".equals(next)) {
                    writableNativeMap.putArray("options", convertJsonToArray(jSONArray));
                }
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else {
                writableNativeMap.putString(next, obj instanceof String ? (String) obj : obj.toString());
            }
        }
        return writableNativeMap;
    }

    @ReactMethod
    public void eventAdImpressionAdMob(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionAdMob(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventAdImpressionAppLovin(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionAppLovin(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventAdImpressionHyperBid(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionHyperBid(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventAdImpressionIronSource(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionIronSource(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventAdImpressionTopOn(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionTopOn(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventAdImpressionTradPlus(ReadableMap readableMap) {
        try {
            this.instance.eventAdImpressionTradPlus(convertMapToJson(readableMap));
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    @ReactMethod
    public void eventWithName(String str) {
        this.instance.eventWithName(str);
    }

    @ReactMethod
    public void eventWithNameAndValue(String str, String str2) {
        this.instance.eventWithNameAndValue(str, str2);
    }

    @ReactMethod
    public void getAnalyticsInstallationId(Callback callback) {
        callback.invoke(this.instance.getAnalyticsInstallationId());
    }

    @ReactMethod
    public void getAttributionInfo(final Callback callback, Callback callback2) {
        this.instance.getAttributionInfo(new AttributionInfoCallback() { // from class: com.tenjin.a
            @Override // com.tenjin.android.AttributionInfoCallback
            public final void onSuccess(Map map) {
                this.f18565a.lambda$getAttributionInfo$0(callback, map);
            }
        });
    }

    @ReactMethod
    public void getCustomerUserId(Callback callback) {
        callback.invoke(this.instance.getCustomerUserId());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Tenjin";
    }

    @ReactMethod
    public void initialize(String str) {
        this.instance = TenjinSDK.getInstance(this.reactContext, str);
    }

    @ReactMethod
    public void optIn() {
        this.instance.optIn();
    }

    @ReactMethod
    public void optInGoogleDMA() {
        this.instance.optInGoogleDMA();
    }

    @ReactMethod
    public void optInOutUsingCMP() {
        this.instance.optInOutUsingCMP();
    }

    @ReactMethod
    public void optInParams(ReadableArray readableArray) {
        this.instance.optInParams(readableToArray(readableArray));
    }

    @ReactMethod
    public void optOut() {
        this.instance.optOut();
    }

    @ReactMethod
    public void optOutGoogleDMA() {
        this.instance.optOutGoogleDMA();
    }

    @ReactMethod
    public void optOutParams(ReadableArray readableArray) {
        this.instance.optOutParams(readableToArray(readableArray));
    }

    @ReactMethod
    public void setAppStore(String str) {
        TenjinSDK.AppStoreType appStoreType;
        TenjinSDK.AppStoreType appStoreType2 = TenjinSDK.AppStoreType.unspecified;
        str.hashCode();
        switch (str) {
            case "googleplay":
                appStoreType = TenjinSDK.AppStoreType.googleplay;
                break;
            case "amazon":
                appStoreType = TenjinSDK.AppStoreType.amazon;
                break;
            case "other":
                appStoreType = TenjinSDK.AppStoreType.other;
                break;
            default:
                appStoreType = TenjinSDK.AppStoreType.unspecified;
                break;
        }
        this.instance.setAppStore(appStoreType);
    }

    @ReactMethod
    public void setCacheEventSetting(boolean z6) {
        this.instance.setCacheEventSetting(Boolean.valueOf(z6));
    }

    @ReactMethod
    public void setCustomerUserId(String str) {
        this.instance.setCustomerUserId(str);
    }

    @ReactMethod
    public void setGoogleDMAParameters(Boolean bool, Boolean bool2) {
        this.instance.setGoogleDMAParameters(bool.booleanValue(), bool2.booleanValue());
    }

    @ReactMethod
    public void transaction(String str, String str2, Double d7, Double d8) {
        this.instance.transaction(str, str2, d7.intValue(), d8.doubleValue());
    }

    @ReactMethod
    public void transactionWithReceipt(String str, String str2, Double d7, Double d8, String str3, String str4) {
        this.instance.transaction(str, str2, d7.intValue(), d8.doubleValue(), str3, str4);
    }
}
