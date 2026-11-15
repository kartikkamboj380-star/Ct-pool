package com.facebook.react.modules.websocket;

import T5.B;
import T5.D;
import T5.H;
import T5.I;
import T5.z;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.c;
import com.facebook.react.modules.network.e;
import i2.InterfaceC1741a;
import i6.i;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeWebSocketModuleSpec.NAME)
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    private static c customClientBuilder;
    private final Map<Integer, b> mContentHandlers;
    private e mCookieHandler;
    private final Map<Integer, H> mWebSocketConnections;

    class a extends I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11967a;

        a(int i7) {
            this.f11967a = i7;
        }

        @Override // T5.I
        public void a(H h7, int i7, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f11967a);
            writableMapCreateMap.putInt("code", i7);
            writableMapCreateMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // T5.I
        public void b(H h7, int i7, String str) {
            h7.f(i7, str);
        }

        @Override // T5.I
        public void c(H h7, Throwable th, D d7) {
            WebSocketModule.this.notifyWebSocketFailed(this.f11967a, th.getMessage());
        }

        @Override // T5.I
        public void d(H h7, i iVar) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f11967a);
            writableMapCreateMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f11967a));
            if (bVar != null) {
                bVar.a(iVar, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", iVar.e());
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // T5.I
        public void e(H h7, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f11967a);
            writableMapCreateMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f11967a));
            if (bVar != null) {
                bVar.b(str, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // T5.I
        public void f(H h7, D d7) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f11967a), h7);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f11967a);
            writableMapCreateMap.putString("protocol", d7.n("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
        }
    }

    public interface b {
        void a(i iVar, WritableMap writableMap);

        void b(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new e(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[Catch: URISyntaxException -> 0x00b1, TryCatch #0 {URISyntaxException -> 0x00b1, blocks: (B:2:0x0000, B:12:0x002b, B:34:0x0085, B:36:0x008b, B:37:0x00a2, B:30:0x0059, B:31:0x0068, B:32:0x006d, B:33:0x0079, B:15:0x0033, B:18:0x003b, B:21:0x0045), top: B:41:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[Catch: URISyntaxException -> 0x00b1, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x00b1, blocks: (B:2:0x0000, B:12:0x002b, B:34:0x0085, B:36:0x008b, B:37:0x00a2, B:30:0x0059, B:31:0x0068, B:32:0x006d, B:33:0x0079, B:15:0x0033, B:18:0x003b, B:21:0x0045), top: B:41:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getDefaultOrigin(String str) {
        byte b7;
        StringBuilder sb;
        try {
            String string = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3804) {
                if (iHashCode != 118039) {
                    if (iHashCode != 3213448) {
                        b7 = (iHashCode == 99617003 && scheme.equals("https")) ? (byte) 3 : (byte) -1;
                    } else if (scheme.equals("http")) {
                        b7 = 2;
                    }
                } else if (scheme.equals("wss")) {
                    b7 = 0;
                }
            } else if (scheme.equals("ws")) {
                b7 = 1;
            }
            if (b7 == 0) {
                sb = new StringBuilder();
                sb.append("");
                sb.append("https");
            } else if (b7 == 1) {
                sb = new StringBuilder();
                sb.append("");
                sb.append("http");
            } else {
                if (b7 != 2 && b7 != 3) {
                    return uri.getPort() == -1 ? String.format("%s://%s:%s", string, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", string, uri.getHost());
                }
                sb = new StringBuilder();
                sb.append("");
                sb.append(uri.getScheme());
            }
            string = sb.toString();
            if (uri.getPort() == -1) {
            }
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i7, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i7);
        writableMapCreateMap.putString("message", str);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public static void setCustomClientBuilder(c cVar) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d7, String str, double d8) {
        int i7 = (int) d8;
        H h7 = this.mWebSocketConnections.get(Integer.valueOf(i7));
        if (h7 == null) {
            return;
        }
        try {
            h7.f((int) d7, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i7));
            this.mContentHandlers.remove(Integer.valueOf(i7));
        } catch (Exception e7) {
            P0.a.k("ReactNative", "Could not close WebSocket connection for id " + i7, e7);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d7) {
        boolean z6;
        int i7 = (int) d7;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z.a aVarM = aVar.e(10L, timeUnit).N(10L, timeUnit).M(0L, TimeUnit.MINUTES);
        applyCustomBuilder(aVarM);
        z zVarB = aVarM.b();
        B.a aVarM2 = new B.a().k(Integer.valueOf(i7)).m(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            aVarM2.a("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z6 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(strNextKey))) {
                    if (strNextKey.equalsIgnoreCase("origin")) {
                        z6 = true;
                    }
                    aVarM2.a(strNextKey, map.getString(strNextKey));
                } else {
                    P0.a.G("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z6 = false;
        }
        if (!z6) {
            aVarM2.a("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i8 = 0; i8 < readableArray.size(); i8++) {
                String strTrim = readableArray.getString(i8).trim();
                if (!strTrim.isEmpty() && !strTrim.contains(",")) {
                    sb.append(strTrim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                aVarM2.a("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        zVarB.C(aVarM2.b(), new a(i7));
        zVarB.q().c().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        Iterator<H> it = this.mWebSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().f(1001, null);
        }
        this.mWebSocketConnections.clear();
        this.mContentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d7) {
        int i7 = (int) d7;
        H h7 = this.mWebSocketConnections.get(Integer.valueOf(i7));
        if (h7 != null) {
            try {
                h7.c(i.f20018p);
                return;
            } catch (Exception e7) {
                notifyWebSocketFailed(i7, e7.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i7);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i7);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i7));
        this.mContentHandlers.remove(Integer.valueOf(i7));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d7) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d7) {
        int i7 = (int) d7;
        H h7 = this.mWebSocketConnections.get(Integer.valueOf(i7));
        if (h7 != null) {
            try {
                h7.b(str);
                return;
            } catch (Exception e7) {
                notifyWebSocketFailed(i7, e7.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i7);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i7);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i7));
        this.mContentHandlers.remove(Integer.valueOf(i7));
    }

    public void sendBinary(i iVar, int i7) {
        H h7 = this.mWebSocketConnections.get(Integer.valueOf(i7));
        if (h7 != null) {
            try {
                h7.c(iVar);
                return;
            } catch (Exception e7) {
                notifyWebSocketFailed(i7, e7.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i7);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i7);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i7));
        this.mContentHandlers.remove(Integer.valueOf(i7));
    }

    public void setContentHandler(int i7, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i7), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i7));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d7) {
        int i7 = (int) d7;
        H h7 = this.mWebSocketConnections.get(Integer.valueOf(i7));
        if (h7 != null) {
            try {
                h7.c(i.j(str));
                return;
            } catch (Exception e7) {
                notifyWebSocketFailed(i7, e7.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i7);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i7);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i7));
        this.mContentHandlers.remove(Integer.valueOf(i7));
    }

    private static void applyCustomBuilder(z.a aVar) {
    }
}
