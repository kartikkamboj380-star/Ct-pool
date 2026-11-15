package com.facebook.react.modules.network;

import T5.B;
import T5.C;
import T5.D;
import T5.E;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import T5.t;
import T5.v;
import T5.w;
import T5.x;
import T5.y;
import T5.z;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import i2.InterfaceC1741a;
import i6.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "Networking")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static com.facebook.react.modules.network.c customClientBuilder;
    private final z mClient;
    private final com.facebook.react.modules.network.e mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<e> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<f> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<g> mUriHandlers;

    class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f11912a = System.nanoTime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f11914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11915d;

        a(String str, ReactApplicationContext reactApplicationContext, int i7) {
            this.f11913b = str;
            this.f11914c = reactApplicationContext;
            this.f11915d = i7;
        }

        @Override // com.facebook.react.modules.network.i
        public void a(long j7, long j8, boolean z6) {
            long jNanoTime = System.nanoTime();
            if ((z6 || NetworkingModule.shouldDispatch(jNanoTime, this.f11912a)) && !this.f11913b.equals("text")) {
                o.c(this.f11914c, this.f11915d, j7, j8);
                this.f11912a = jNanoTime;
            }
        }
    }

    class b implements InterfaceC0460f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f11918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f11919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11920d;

        b(int i7, ReactApplicationContext reactApplicationContext, String str, boolean z6) {
            this.f11917a = i7;
            this.f11918b = reactApplicationContext;
            this.f11919c = str;
            this.f11920d = z6;
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, D d7) {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f11917a);
            o.h(this.f11918b, this.f11917a, d7.f(), NetworkingModule.translateHeaders(d7.w()), d7.j0().l().toString());
            try {
                E eA = d7.a();
                if ("gzip".equalsIgnoreCase(d7.l("Content-Encoding")) && eA != null) {
                    i6.n nVar = new i6.n(eA.j());
                    String strL = d7.l("Content-Type");
                    eA = E.g(strL != null ? x.f(strL) : null, -1L, q.d(nVar));
                }
                for (f fVar : NetworkingModule.this.mResponseHandlers) {
                    if (fVar.b(this.f11919c)) {
                        o.a(this.f11918b, this.f11917a, fVar.a(eA));
                        o.g(this.f11918b, this.f11917a);
                        return;
                    }
                }
                if (this.f11920d && this.f11919c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f11917a, eA);
                    o.g(this.f11918b, this.f11917a);
                    return;
                }
                String strL2 = "";
                if (this.f11919c.equals("text")) {
                    try {
                        strL2 = eA.l();
                    } catch (IOException e7) {
                        if (!d7.j0().h().equalsIgnoreCase("HEAD")) {
                            o.f(this.f11918b, this.f11917a, e7.getMessage(), e7);
                        }
                    }
                } else if (this.f11919c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    strL2 = Base64.encodeToString(eA.b(), 2);
                }
                o.b(this.f11918b, this.f11917a, strL2);
                o.g(this.f11918b, this.f11917a);
            } catch (IOException e8) {
                o.f(this.f11918b, this.f11917a, e8.getMessage(), e8);
            }
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            String message;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f11917a);
            if (iOException.getMessage() != null) {
                message = iOException.getMessage();
            } else {
                message = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            o.f(this.f11918b, this.f11917a, message, iOException);
        }
    }

    class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f11922a = System.nanoTime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f11923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11924c;

        c(ReactApplicationContext reactApplicationContext, int i7) {
            this.f11923b = reactApplicationContext;
            this.f11924c = i7;
        }

        @Override // com.facebook.react.modules.network.i
        public void a(long j7, long j8, boolean z6) {
            long jNanoTime = System.nanoTime();
            if (z6 || NetworkingModule.shouldDispatch(jNanoTime, this.f11922a)) {
                o.d(this.f11923b, this.f11924c, j7, j8);
                this.f11922a = jNanoTime;
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i7) {
            super(reactContext);
            this.f11926a = i7;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            V1.a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f11926a));
        }
    }

    public interface e {
        boolean a(ReadableMap readableMap);

        C b(ReadableMap readableMap, String str);
    }

    public interface f {
        WritableMap a(E e7);

        boolean b(String str);
    }

    public interface g {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, h.b(reactApplicationContext), null);
    }

    private synchronized void addRequest(int i7) {
        this.mRequestIds.add(Integer.valueOf(i7));
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void cancelRequest(int i7) {
        new d(getReactApplicationContext(), i7).execute(new Void[0]);
    }

    private y.a constructMultipartBody(ReadableArray readableArray, String str, int i7) {
        String str2;
        x xVarF;
        C c7;
        y.a aVar = new y.a();
        aVar.d(x.f(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            ReadableMap map = readableArray.getMap(i8);
            t tVarExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (tVarExtractHeaders == null) {
                str2 = "Missing or invalid header format for FormData part.";
            } else {
                String strF = tVarExtractHeaders.f(CONTENT_TYPE_HEADER_NAME);
                if (strF != null) {
                    xVarF = x.f(strF);
                    tVarExtractHeaders = tVarExtractHeaders.i().h(CONTENT_TYPE_HEADER_NAME).e();
                } else {
                    xVarF = null;
                }
                if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                    c7 = C.d(xVarF, map.getString(REQUEST_BODY_KEY_STRING));
                } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                    o.f(reactApplicationContextIfActiveOrWarn, i7, "Unrecognized FormData part.", null);
                } else if (xVarF == null) {
                    str2 = "Binary FormData part needs a content-type header.";
                } else {
                    String string = map.getString(REQUEST_BODY_KEY_URI);
                    InputStream inputStreamH = n.h(getReactApplicationContext(), string);
                    if (inputStreamH == null) {
                        str2 = "Could not retrieve file for uri " + string;
                    } else {
                        c7 = n.c(xVarF, inputStreamH);
                    }
                }
                aVar.a(tVarExtractHeaders, c7);
            }
            o.f(reactApplicationContextIfActiveOrWarn, i7, str2, null);
            return null;
        }
        return aVar;
    }

    private t extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        t.a aVar = new t.a();
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableArray array = readableArray.getArray(i7);
            if (array != null && array.size() == 2) {
                String strA = com.facebook.react.modules.network.f.a(array.getString(0));
                String string = array.getString(1);
                if (strA != null && string != null) {
                    aVar.d(strA, string);
                }
            }
            return null;
        }
        if (aVar.f(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            aVar.h(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ D lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i7, v.a aVar) {
        D dA = aVar.a(aVar.o());
        return dA.U().b(new k(dA.a(), new a(str, reactApplicationContext, i7))).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(int i7, E e7) throws IOException {
        long J6;
        long jE = -1;
        try {
            k kVar = (k) e7;
            J6 = kVar.J();
            try {
                jE = kVar.e();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            J6 = -1;
        }
        l lVar = new l(e7.f() == null ? StandardCharsets.UTF_8 : e7.f().c(StandardCharsets.UTF_8));
        InputStream inputStreamA = e7.a();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i8 = inputStreamA.read(bArr);
                if (i8 == -1) {
                    return;
                } else {
                    o.e(reactApplicationContextIfActiveOrWarn, i7, lVar.a(bArr, i8), J6, jE);
                }
            }
        } finally {
            inputStreamA.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i7) {
        this.mRequestIds.remove(Integer.valueOf(i7));
    }

    public static void setCustomClientBuilder(com.facebook.react.modules.network.c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j7, long j8) {
        return j8 + 100000000 < j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(t tVar) {
        Bundle bundle = new Bundle();
        for (int i7 = 0; i7 < tVar.size(); i7++) {
            String strH = tVar.h(i7);
            bundle.putString(strH, bundle.containsKey(strH) ? bundle.getString(strH) + ", " + tVar.m(i7) : tVar.m(i7));
        }
        return Arguments.fromBundle(bundle);
    }

    private C wrapRequestBodyWithProgressEmitter(C c7, int i7) {
        if (c7 == null) {
            return null;
        }
        return n.e(c7, new c(getReactApplicationContextIfActiveOrWarn(), i7));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d7) {
        int i7 = (int) d7;
        cancelRequest(i7);
        removeRequest(i7);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(e eVar) {
        this.mRequestBodyHandlers.add(eVar);
    }

    public void addResponseHandler(f fVar) {
        this.mResponseHandlers.add(fVar);
    }

    public void addUriHandler(g gVar) {
        this.mUriHandlers.add(gVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.d(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.c(new w(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.e();
        this.mCookieJarContainer.b();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d7) {
    }

    public void removeRequestBodyHandler(e eVar) {
        this.mRequestBodyHandlers.remove(eVar);
    }

    public void removeResponseHandler(f fVar) {
        this.mResponseHandlers.remove(fVar);
    }

    public void removeUriHandler(g gVar) {
        this.mUriHandlers.remove(gVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d7, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z6, double d8, boolean z7) {
        int i7 = (int) d7;
        try {
            sendRequestInternal(str, str2, i7, readableArray, readableMap, str3, z6, (int) d8, z7);
        } catch (Throwable th) {
            P0.a.k("Networking", "Failed to send url request: " + str2, th);
            o.f(getReactApplicationContextIfActiveOrWarn(), i7, th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendRequestInternal(String str, String str2, final int i7, ReadableArray readableArray, ReadableMap readableMap, final String str3, boolean z6, int i8, boolean z7) {
        e next;
        C cG;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(str2);
            for (g gVar : this.mUriHandlers) {
                if (gVar.b(uri, str3)) {
                    o.a(reactApplicationContextIfActiveOrWarn, i7, gVar.a(uri));
                    o.g(reactApplicationContextIfActiveOrWarn, i7);
                    return;
                }
            }
            try {
                B.a aVarM = new B.a().m(str2);
                if (i7 != 0) {
                    aVarM.k(Integer.valueOf(i7));
                }
                z.a aVarB = this.mClient.B();
                applyCustomBuilder(aVarB);
                if (!z7) {
                    aVarB.f(T5.n.f3596a);
                }
                if (z6) {
                    aVarB.a(new v() { // from class: com.facebook.react.modules.network.g
                        @Override // T5.v
                        public final D a(v.a aVar) {
                            return this.f11932a.lambda$sendRequestInternal$0(str3, reactApplicationContextIfActiveOrWarn, i7, aVar);
                        }
                    });
                }
                if (i8 != this.mClient.h()) {
                    aVarB.d(i8, TimeUnit.MILLISECONDS);
                }
                z zVarB = aVarB.b();
                t tVarExtractHeaders = extractHeaders(readableArray, readableMap);
                if (tVarExtractHeaders == null) {
                    o.f(reactApplicationContextIfActiveOrWarn, i7, "Unrecognized headers format", null);
                    return;
                }
                String strF = tVarExtractHeaders.f(CONTENT_TYPE_HEADER_NAME);
                String strF2 = tVarExtractHeaders.f(CONTENT_ENCODING_HEADER_NAME);
                aVarM.f(tVarExtractHeaders);
                if (readableMap != null) {
                    Iterator<e> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.a(readableMap)) {
                            break;
                        }
                    }
                    next = null;
                } else {
                    next = null;
                }
                if (readableMap != null) {
                    Locale locale = Locale.ROOT;
                    if (str.toLowerCase(locale).equals("get") || str.toLowerCase(locale).equals("head")) {
                        cG = n.g(str);
                    } else if (next != null) {
                        cG = next.b(readableMap, strF);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                        if (strF == null) {
                            o.f(reactApplicationContextIfActiveOrWarn, i7, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                        x xVarF = x.f(strF);
                        if (n.i(strF2)) {
                            cG = n.d(xVarF, string);
                            if (cG == null) {
                                o.f(reactApplicationContextIfActiveOrWarn, i7, "Failed to gzip request body", null);
                                return;
                            }
                        } else {
                            Charset charsetC = StandardCharsets.UTF_8;
                            if (xVarF != null) {
                                charsetC = xVarF.c(charsetC);
                            }
                            cG = C.e(xVarF, string.getBytes(charsetC));
                        }
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (strF == null) {
                            o.f(reactApplicationContextIfActiveOrWarn, i7, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        cG = C.c(x.f(strF), i6.i.j(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (strF == null) {
                            o.f(reactApplicationContextIfActiveOrWarn, i7, "Payload is set but no content-type header specified", null);
                            return;
                        }
                        String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                        InputStream inputStreamH = n.h(getReactApplicationContext(), string2);
                        if (inputStreamH == null) {
                            o.f(reactApplicationContextIfActiveOrWarn, i7, "Could not retrieve file for uri " + string2, null);
                            return;
                        }
                        cG = n.c(x.f(strF), inputStreamH);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (strF == null) {
                            strF = "multipart/form-data";
                        }
                        y.a aVarConstructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), strF, i7);
                        if (aVarConstructMultipartBody == null) {
                            return;
                        } else {
                            cG = aVarConstructMultipartBody.c();
                        }
                    }
                }
                aVarM.g(str, wrapRequestBodyWithProgressEmitter(cG, i7));
                addRequest(i7);
                zVarB.a(aVarM.b()).S0(new b(i7, reactApplicationContextIfActiveOrWarn, str3, z6));
            } catch (Exception e7) {
                o.f(reactApplicationContextIfActiveOrWarn, i7, e7.getMessage(), null);
            }
        } catch (IOException e8) {
            o.f(reactApplicationContextIfActiveOrWarn, i7, e8.getMessage(), e8);
        }
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, h.b(reactApplicationContext), null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, z zVar) {
        this(reactApplicationContext, str, zVar, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, z zVar, List<Object> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            z.a aVarB = zVar.B();
            Iterator<Object> it = list.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.y.a(it.next());
                throw null;
            }
            zVar = aVarB.b();
        }
        this.mClient = zVar;
        this.mCookieHandler = new com.facebook.react.modules.network.e(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) zVar.p();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<Object> list) {
        this(reactApplicationContext, null, h.b(reactApplicationContext), list);
    }

    private static void applyCustomBuilder(z.a aVar) {
    }
}
