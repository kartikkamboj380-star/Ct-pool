package y0;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import z0.C2253a;
import z0.g;
import z0.h;
import z0.i;
import z0.j;
import z0.k;
import z0.l;
import z0.m;
import z0.n;
import z0.p;
import z0.q;
import z0.r;
import z0.s;
import z0.t;
import z0.u;
import z0.v;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2232a implements ActivityEventListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static ReactApplicationContext f22866m;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22867a;

        static {
            int[] iArr = new int[b.values().length];
            f22867a = iArr;
            try {
                iArr[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22867a[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22867a[b.facebookstories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22867a[b.pagesmanager.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22867a[b.twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22867a[b.whatsapp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22867a[b.whatsappbusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22867a[b.instagram.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22867a[b.instagramstories.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22867a[b.googleplus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22867a[b.email.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22867a[b.pinterest.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22867a[b.sms.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22867a[b.snapchat.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22867a[b.messenger.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22867a[b.linkedin.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22867a[b.telegram.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22867a[b.viber.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22867a[b.discord.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* JADX INFO: renamed from: y0.a$b */
    private enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram,
        viber,
        discord;

        public static n h(String str, ReactApplicationContext reactApplicationContext) {
            switch (C0329a.f22867a[valueOf(str).ordinal()]) {
                case 1:
                    return new z0.f(reactApplicationContext);
                case 2:
                    return new z0.d(reactApplicationContext);
                case 3:
                    return new z0.e(reactApplicationContext);
                case 4:
                    return new z0.c(reactApplicationContext);
                case 5:
                    return new s(reactApplicationContext);
                case 6:
                    return new v(reactApplicationContext);
                case 7:
                    return new u(reactApplicationContext);
                case 8:
                    return new h(reactApplicationContext);
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    return new i(reactApplicationContext);
                case 10:
                    return new g(reactApplicationContext);
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    return new z0.b(reactApplicationContext);
                case 12:
                    return new l(reactApplicationContext);
                case 13:
                    return new m(reactApplicationContext);
                case 14:
                    return new p(reactApplicationContext);
                case 15:
                    return new k(reactApplicationContext);
                case 16:
                    return new j(reactApplicationContext);
                case 17:
                    return new r(reactApplicationContext);
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    return new t(reactApplicationContext);
                case 19:
                    return new C2253a(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public C2232a(ReactApplicationContext reactApplicationContext) {
        f22866m = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public Map a() {
        HashMap map = new HashMap();
        for (b bVar : b.values()) {
            map.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return map;
    }

    public void b(String str, Promise promise) {
        try {
            String scheme = Uri.parse(str).getScheme();
            promise.resolve((scheme == null || !scheme.equals("data")) ? Boolean.FALSE : Boolean.TRUE);
        } catch (Exception e7) {
            Log.e("RNShare", e7.getMessage());
            e7.printStackTrace(System.out);
            promise.reject(e7.getMessage());
        }
    }

    public void c(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(n.k(str, f22866m)));
        } catch (Exception e7) {
            Log.e("RNShare", e7.getMessage());
            promise.reject(e7.getMessage());
        }
    }

    public void d(int i7, int i8, Intent intent) {
        WritableMap writableMapCreateMap;
        if (i7 == 16845) {
            if (i8 == 0) {
                writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", false);
                writableMapCreateMap.putString("message", "CANCELED");
            } else {
                if (i8 != -1) {
                    return;
                }
                writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", true);
            }
            q.b(writableMapCreateMap);
        }
    }

    public void e(ReadableMap readableMap, Promise promise) {
        String message;
        q.e(promise);
        try {
            new z0.f(f22866m).l(readableMap);
        } catch (ActivityNotFoundException e7) {
            Log.e("RNShare", e7.getMessage());
            e7.printStackTrace(System.out);
            message = "not_available";
            q.a(message);
        } catch (Exception e8) {
            Log.e("RNShare", e8.getMessage());
            e8.printStackTrace(System.out);
            message = e8.getMessage();
            q.a(message);
        }
    }

    public void f(ReadableMap readableMap, Promise promise) {
        String message;
        q.e(promise);
        if (n.j("social", readableMap)) {
            try {
                n nVarH = b.h(readableMap.getString("social"), f22866m);
                if (nVarH == null) {
                    throw new ActivityNotFoundException("Invalid share activity");
                }
                nVarH.l(readableMap);
                return;
            } catch (ActivityNotFoundException e7) {
                e = e7;
                Log.e("RNShare", e.getMessage());
                e.printStackTrace(System.out);
                message = e.getMessage();
                q.a(message);
            } catch (Exception e8) {
                e = e8;
                Log.e("RNShare", e.getMessage());
                e.printStackTrace(System.out);
                message = e.getMessage();
                q.a(message);
            }
        }
        message = "key 'social' missing in options";
        q.a(message);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
        d(i7, i8, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
