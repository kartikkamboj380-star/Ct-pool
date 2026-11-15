package com.facebook.react.modules.network;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends CookieHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CookieManager f11931b;

    public e(ReactContext reactContext) {
        this.f11930a = reactContext;
    }

    private void b(String str, String str2) {
        CookieManager cookieManagerF = f();
        if (cookieManagerF != null) {
            cookieManagerF.setCookie(str, str2, null);
        }
    }

    private CookieManager f() {
        if (this.f11931b == null) {
            try {
                this.f11931b = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.f11931b;
    }

    private static boolean g(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    public void c(String str, List list) {
        CookieManager cookieManagerF = f();
        if (cookieManagerF == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(str, (String) it.next());
        }
        cookieManagerF.flush();
    }

    public void d(final Callback callback) {
        CookieManager cookieManagerF = f();
        if (cookieManagerF != null) {
            cookieManagerF.removeAllCookies(new ValueCallback() { // from class: com.facebook.react.modules.network.d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    e.h(callback, (Boolean) obj);
                }
            });
        }
    }

    public void e() {
    }

    @Override // java.net.CookieHandler
    public Map get(URI uri, Map map) {
        CookieManager cookieManagerF = f();
        if (cookieManagerF == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManagerF.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map map) {
        String string = uri.toString();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && g(str)) {
                c(string, (List) entry.getValue());
            }
        }
    }
}
