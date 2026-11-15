package g5;

import Y3.n;
import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1697a {
    public static Map a(Y3.f fVar) {
        String strQ = fVar.q();
        Y3.n nVarR = fVar.r();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map3.put("name", strQ);
        map3.put("automaticDataCollectionEnabled", Boolean.valueOf(fVar.x()));
        map2.put("apiKey", nVarR.b());
        map2.put("appId", nVarR.c());
        map2.put("projectId", nVarR.g());
        map2.put("databaseURL", nVarR.d());
        map2.put("gaTrackingId", nVarR.e());
        map2.put("messagingSenderId", nVarR.f());
        map2.put("storageBucket", nVarR.h());
        if (ReactNativeFirebaseAppModule.authDomains.get(strQ) != null) {
            map2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(strQ));
        }
        map.put("options", map2);
        map.put("appConfig", map3);
        return map;
    }

    public static WritableMap b(Y3.f fVar) {
        return Arguments.makeNativeMap((Map<String, Object>) a(fVar));
    }

    public static Y3.f c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        n.b bVar = new n.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("gaTrackingId")) {
            bVar.e(readableMap.getString("gaTrackingId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        Y3.f fVarV = string.equals("[DEFAULT]") ? Y3.f.v(context, bVar.a()) : Y3.f.w(context, bVar.a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            fVarV.F(Boolean.valueOf(readableMap2.getBoolean("automaticDataCollectionEnabled")));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            fVarV.E(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return fVarV;
    }

    public static WritableMap d(ReadableMap readableMap) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.merge(readableMap);
        return writableMapCreateMap;
    }
}
