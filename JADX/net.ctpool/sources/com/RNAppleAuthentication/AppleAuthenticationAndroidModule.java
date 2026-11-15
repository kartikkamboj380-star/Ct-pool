package com.RNAppleAuthentication;

import A0.d;
import A0.g;
import android.app.Activity;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.w;
import com.RNAppleAuthentication.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppleAuthenticationAndroidModule extends ReactContextBaseJavaModule {
    private static final String E_NOT_CONFIGURED_ERROR = "E_NOT_CONFIGURED_ERROR";
    private static final String E_SIGNIN_CANCELLED_ERROR = "E_SIGNIN_CANCELLED_ERROR";
    private static final String E_SIGNIN_FAILED_ERROR = "E_SIGNIN_FAILED_ERROR";
    private com.RNAppleAuthentication.a configuration;
    private final ReactApplicationContext reactContext;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f10122a;

        a(Promise promise) {
            this.f10122a = promise;
        }

        @Override // A0.d
        public void a() {
            this.f10122a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_CANCELLED_ERROR);
        }

        @Override // A0.d
        public void b(Throwable th) {
            this.f10122a.reject(AppleAuthenticationAndroidModule.E_SIGNIN_FAILED_ERROR, th);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // A0.d
        public void c(String str, String str2, String str3, String str4) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("code", str);
            writableMapCreateMap.putString("id_token", str2);
            writableMapCreateMap.putString("state", str3);
            String strC = AppleAuthenticationAndroidModule.this.configuration.c();
            if (!strC.isEmpty()) {
                writableMapCreateMap.putString("nonce", strC);
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                if (jSONObject.has("name")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("name");
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    if (jSONObject2.has("firstName")) {
                        writableMapCreateMap3.putString("firstName", jSONObject2.getString("firstName"));
                    }
                    if (jSONObject2.has("lastName")) {
                        writableMapCreateMap3.putString("lastName", jSONObject2.getString("lastName"));
                    }
                    if (writableMapCreateMap3.hasKey("firstName") || writableMapCreateMap3.hasKey("lastName")) {
                        writableMapCreateMap2.putMap("name", writableMapCreateMap3);
                    }
                }
                if (jSONObject.has(Scopes.EMAIL)) {
                    writableMapCreateMap2.putString(Scopes.EMAIL, jSONObject.getString(Scopes.EMAIL));
                }
                if (writableMapCreateMap2.hasKey("name") || writableMapCreateMap2.hasKey(Scopes.EMAIL)) {
                    writableMapCreateMap.putMap("user", writableMapCreateMap2);
                }
            } catch (Exception unused) {
            }
            this.f10122a.resolve(writableMapCreateMap);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f10124m;

        b(g gVar) {
            this.f10124m = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10124m.a();
        }
    }

    public AppleAuthenticationAndroidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i7 = 0; i7 < bArr.length; i7++) {
            stringBuffer.append(Character.forDigit((bArr[i7] >> 4) & 15, 16));
            stringBuffer.append(Character.forDigit(bArr[i7] & 15, 16));
        }
        return stringBuffer.toString();
    }

    private w getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof AbstractActivityC0640j)) {
            return null;
        }
        return ((AbstractActivityC0640j) currentActivity).O();
    }

    @ReactMethod
    public void configure(ReadableMap readableMap) {
        String strBytesToHex;
        String string;
        String string2;
        a.c cVar = a.c.f10145m;
        a.b bVar = a.b.f10140m;
        String string3 = UUID.randomUUID().toString();
        boolean z6 = readableMap.hasKey("nonceEnabled") ? readableMap.getBoolean("nonceEnabled") : true;
        String string4 = "";
        String string5 = readableMap.hasKey("clientId") ? readableMap.getString("clientId") : "";
        String string6 = readableMap.hasKey("redirectUri") ? readableMap.getString("redirectUri") : "";
        if (readableMap.hasKey("scope") && (string2 = readableMap.getString("scope")) != null) {
            a.c.valueOf(string2);
        }
        if (readableMap.hasKey("responseType") && (string = readableMap.getString("responseType")) != null) {
            a.b.valueOf(string);
        }
        if (readableMap.hasKey("state")) {
            string3 = readableMap.getString("state");
        }
        if (z6) {
            string4 = readableMap.hasKey("nonce") ? readableMap.getString("nonce") : UUID.randomUUID().toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(string4.getBytes());
                strBytesToHex = bytesToHex(messageDigest.digest());
            } catch (Exception unused) {
                strBytesToHex = string4;
            }
        } else {
            strBytesToHex = string4;
        }
        this.configuration = new a.C0194a().b(string5).e(string6).f(a.b.f10142o).g(a.c.f10147o).h(string3).d(string4).c(strBytesToHex).a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("ALL", a.b.f10142o.toString());
        map.put("CODE", a.b.f10140m.toString());
        map.put("ID_TOKEN", a.b.f10141n.toString());
        HashMap map2 = new HashMap();
        map2.put("ALL", a.c.f10147o.toString());
        map2.put("EMAIL", a.c.f10146n.toString());
        map2.put("NAME", a.c.f10145m.toString());
        HashMap map3 = new HashMap();
        map3.put(E_NOT_CONFIGURED_ERROR, E_NOT_CONFIGURED_ERROR);
        map3.put(E_SIGNIN_FAILED_ERROR, E_SIGNIN_FAILED_ERROR);
        map3.put(E_SIGNIN_CANCELLED_ERROR, E_SIGNIN_CANCELLED_ERROR);
        map3.put("ResponseType", map);
        map3.put("Scope", map2);
        map3.put("isSupported", true);
        return map3;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNAppleAuthModuleAndroid";
    }

    @ReactMethod
    public void signIn(Promise promise) {
        if (this.configuration == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        w fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            promise.reject(E_NOT_CONFIGURED_ERROR);
            return;
        }
        g gVar = new g(fragmentManagerHelper, "SignInWithAppleButton-$id-SignInWebViewDialogFragment", this.configuration, new a(promise));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("Activity is not found"));
        } else {
            currentActivity.runOnUiThread(new b(gVar));
        }
    }
}
