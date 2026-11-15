package io.invertase.firebase.messaging;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.V;
import g5.C1698b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static C1698b a(String str, Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        writableMapCreateMap.putMap(LogEvent.LEVEL_ERROR, g5.m.b(exc));
        return new C1698b("messaging_message_send_error", writableMapCreateMap);
    }

    public static C1698b b(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("messageId", str);
        return new C1698b("messaging_message_sent", writableMapCreateMap);
    }

    public static C1698b c() {
        return new C1698b("messaging_message_deleted", Arguments.createMap());
    }

    public static C1698b d(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("token", str);
        return new C1698b("messaging_token_refresh", writableMapCreateMap);
    }

    static V e(ReadableMap readableMap) {
        V.b bVar = new V.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                bVar.a(strNextKey, map.getString(strNextKey));
            }
        }
        return bVar.b();
    }

    public static C1698b f(WritableMap writableMap, Boolean bool) {
        return new C1698b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", writableMap);
    }

    static WritableMap g(V.c cVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            writableMapCreateMap.putString("title", cVar.o());
        }
        if (cVar.q() != null) {
            writableMapCreateMap.putString("titleLocKey", cVar.q());
        }
        if (cVar.p() != null) {
            writableMapCreateMap.putArray("titleLocArgs", Arguments.fromJavaArgs(cVar.p()));
        }
        if (cVar.a() != null) {
            writableMapCreateMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            writableMapCreateMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            writableMapCreateMap.putArray("bodyLocArgs", Arguments.fromJavaArgs(cVar.b()));
        }
        if (cVar.d() != null) {
            writableMapCreateMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            writableMapCreateMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            writableMapCreateMap2.putString("color", cVar.f());
        }
        if (cVar.g() != null) {
            writableMapCreateMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            writableMapCreateMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            writableMapCreateMap2.putString("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            writableMapCreateMap2.putInt("count", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            writableMapCreateMap2.putInt("priority", cVar.l().intValue());
        }
        if (cVar.m() != null) {
            writableMapCreateMap2.putString("sound", cVar.m());
        }
        if (cVar.n() != null) {
            writableMapCreateMap2.putString("ticker", cVar.n());
        }
        if (cVar.r() != null) {
            writableMapCreateMap2.putInt("visibility", cVar.r().intValue());
        }
        writableMapCreateMap.putMap("android", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static C1698b h(V v6, Boolean bool) {
        return new C1698b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", i(v6));
    }

    static WritableMap i(V v6) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (v6.w() != null) {
            writableMapCreateMap.putString("collapseKey", v6.w());
        }
        if (v6.n0() != null) {
            writableMapCreateMap.putString("from", v6.n0());
        }
        if (v6.l1() != null) {
            writableMapCreateMap.putString("to", v6.l1());
        }
        if (v6.B0() != null) {
            writableMapCreateMap.putString("messageId", v6.B0());
        }
        if (v6.S0() != null) {
            writableMapCreateMap.putString("messageType", v6.S0());
        }
        if (v6.a0().size() > 0) {
            for (Map.Entry entry : v6.a0().entrySet()) {
                writableMapCreateMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        writableMapCreateMap.putMap("data", writableMapCreateMap2);
        writableMapCreateMap.putDouble("ttl", v6.m1());
        writableMapCreateMap.putDouble("sentTime", v6.k1());
        writableMapCreateMap.putInt("priority", v6.j1());
        writableMapCreateMap.putInt("originalPriority", v6.i1());
        if (v6.h1() != null) {
            writableMapCreateMap.putMap("notification", g(v6.h1()));
        }
        return writableMapCreateMap;
    }
}
