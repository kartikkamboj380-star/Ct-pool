package com.dooboolab.rniap;

import C0.C0334a;
import C0.C0337d;
import C0.C0343j;
import C0.C0344k;
import C0.InterfaceC0335b;
import C0.InterfaceC0336c;
import C0.InterfaceC0338e;
import C0.InterfaceC0339f;
import C0.InterfaceC0340g;
import C0.InterfaceC0341h;
import C0.InterfaceC0342i;
import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.AbstractC0748b;
import com.android.billingclient.api.C0747a;
import com.android.billingclient.api.C0750d;
import com.android.billingclient.api.C0751e;
import com.android.billingclient.api.C0753g;
import com.android.billingclient.api.C0754h;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.dooboolab.rniap.RNIapModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.GoogleApiAvailability;
import com.tenjin.android.config.TenjinConsts;
import i2.InterfaceC1741a;
import i5.u;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = RNIapModule.TAG)
public final class RNIapModule extends ReactContextBaseJavaModule implements InterfaceC0342i {
    public static final a Companion = new a(null);
    private static final String PROMISE_BUY_ITEM = "PROMISE_BUY_ITEM";
    public static final String TAG = "RNIapModule";
    private AbstractC0748b billingClientCache;
    private final AbstractC0748b.a builder;
    private final GoogleApiAvailability googleApiAvailability;
    private final ReactApplicationContext reactContext;
    private final Map<String, C0753g> skus;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f10395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10396n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Promise f10397o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f10395m = str;
            this.f10396n = rNIapModule;
            this.f10397o = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("responseCode", c0751e.b());
                writableMapCreateMap.putString("debugMessage", c0751e.a());
                com.dooboolab.rniap.a aVarA = com.dooboolab.rniap.b.f10436a.a(c0751e.b());
                writableMapCreateMap.putString("code", aVarA.a());
                writableMapCreateMap.putString("message", aVarA.b());
                com.dooboolab.rniap.d.d(promise, writableMapCreateMap);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            C0334a c0334aA = C0334a.b().b(this.f10395m).a();
            w5.k.e(c0334aA, "build(...)");
            final RNIapModule rNIapModule = this.f10396n;
            final Promise promise = this.f10397o;
            abstractC0748b.a(c0334aA, new InterfaceC0335b() { // from class: com.dooboolab.rniap.g
                @Override // C0.InterfaceC0335b
                public final void a(C0751e c0751e) {
                    RNIapModule.b.c(rNIapModule, promise, c0751e);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class c extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Promise f10398m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f10399n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ReadableArray f10400o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ReadableArray f10401p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10402q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f10403r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f10404s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f10405t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f10406u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f10407v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Activity f10408w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Promise promise, String str, ReadableArray readableArray, ReadableArray readableArray2, RNIapModule rNIapModule, boolean z6, String str2, int i7, String str3, String str4, Activity activity) {
            super(1);
            this.f10398m = promise;
            this.f10399n = str;
            this.f10400o = readableArray;
            this.f10401p = readableArray2;
            this.f10402q = rNIapModule;
            this.f10403r = z6;
            this.f10404s = str2;
            this.f10405t = i7;
            this.f10406u = str3;
            this.f10407v = str4;
            this.f10408w = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0165 A[PHI: r4
          0x0165: PHI (r4v6 int) = (r4v5 int), (r4v7 int), (r4v8 int), (r4v9 int), (r4v10 int) binds: [B:35:0x0155, B:37:0x0158, B:39:0x015b, B:41:0x015e, B:43:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(AbstractC0748b abstractC0748b) {
            int i7;
            String string;
            w5.k.f(abstractC0748b, "billingClient");
            com.dooboolab.rniap.c.f10437a.a(RNIapModule.PROMISE_BUY_ITEM, this.f10398m);
            if (w5.k.b(this.f10399n, "subs") && this.f10400o.size() != this.f10401p.size()) {
                String str = "The number of skus (" + this.f10400o.size() + ") must match: the number of offerTokens (" + this.f10401p.size() + ") for Subscriptions";
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("debugMessage", str);
                writableMapCreateMap.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                writableMapCreateMap.putString("message", str);
                RNIapModule rNIapModule = this.f10402q;
                rNIapModule.sendEvent(rNIapModule.reactContext, "purchase-error", writableMapCreateMap);
                com.dooboolab.rniap.d.b(this.f10398m, RNIapModule.PROMISE_BUY_ITEM, str);
                return;
            }
            ArrayList<Object> arrayList = this.f10400o.toArrayList();
            ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().toString());
            }
            RNIapModule rNIapModule2 = this.f10402q;
            Promise promise = this.f10398m;
            String str2 = this.f10399n;
            ReadableArray readableArray = this.f10401p;
            ArrayList arrayList3 = new ArrayList(AbstractC1809n.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1809n.p();
                }
                String str3 = (String) next;
                Iterator it3 = it2;
                C0753g c0753g = (C0753g) rNIapModule2.skus.get(str3);
                if (c0753g == null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("debugMessage", "The sku was not found. Please fetch products first by calling getItems");
                    writableMapCreateMap2.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                    writableMapCreateMap2.putString("message", "The sku was not found. Please fetch products first by calling getItems");
                    writableMapCreateMap2.putString("productId", str3);
                    rNIapModule2.sendEvent(rNIapModule2.reactContext, "purchase-error", writableMapCreateMap2);
                    com.dooboolab.rniap.d.b(promise, RNIapModule.PROMISE_BUY_ITEM, "The sku was not found. Please fetch products first by calling getItems");
                    return;
                }
                C0750d.b.a aVarC = C0750d.b.a().c(c0753g);
                w5.k.e(aVarC, "setProductDetails(...)");
                if (w5.k.b(str2, "subs") && (string = readableArray.getString(i8)) != null) {
                    aVarC = aVarC.b(string);
                    w5.k.e(aVarC, "setOfferToken(...)");
                }
                arrayList3.add(aVarC.a());
                it2 = it3;
                i8 = i9;
            }
            C0750d.a aVarA = C0750d.a();
            w5.k.e(aVarA, "newBuilder(...)");
            aVarA.e(arrayList3).b(this.f10403r);
            C0750d.c.a aVarA2 = C0750d.c.a();
            w5.k.e(aVarA2, "newBuilder(...)");
            String str4 = this.f10404s;
            if (str4 != null) {
                aVarA2.b(str4);
                if (w5.k.b(this.f10399n, "subs") && (i7 = this.f10405t) != -1) {
                    int i10 = 1;
                    if (i7 != 1) {
                        i10 = 2;
                        if (i7 != 2) {
                            i10 = 3;
                            if (i7 != 3) {
                                i10 = 5;
                                if (i7 != 5) {
                                    i10 = 6;
                                    int i11 = i7 != 6 ? 0 : i10;
                                    aVarA2.d(i11);
                                }
                            }
                        }
                    }
                }
                if (this.f10404s != null) {
                    C0750d.c cVarA = aVarA2.a();
                    w5.k.e(cVarA, "build(...)");
                    aVarA.f(cVarA);
                }
            }
            String str5 = this.f10406u;
            if (str5 != null) {
                aVarA.c(str5);
            }
            String str6 = this.f10407v;
            if (str6 != null) {
                aVarA.d(str6);
            }
            C0750d c0750dA = aVarA.a();
            w5.k.e(c0750dA, "build(...)");
            int iB = abstractC0748b.f(this.f10408w, c0750dA).b();
            if (iB != 0) {
                com.dooboolab.rniap.a aVarA3 = com.dooboolab.rniap.b.f10436a.a(iB);
                com.dooboolab.rniap.d.b(this.f10398m, aVarA3.a(), aVarA3.b());
            }
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class d extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Purchase f10409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f10410n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Promise f10411o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Purchase purchase, int i7, Promise promise) {
            super(1);
            this.f10409m = purchase;
            this.f10410n = i7;
            this.f10411o = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(int i7, Promise promise, C0751e c0751e, String str) {
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            if (c0751e.b() != i7) {
                com.dooboolab.rniap.b.f10436a.b(promise, c0751e.b());
            } else {
                com.dooboolab.rniap.d.d(promise, Boolean.TRUE);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            C0337d c0337dA = C0337d.b().b(this.f10409m.i()).a();
            w5.k.e(c0337dA, "build(...)");
            final int i7 = this.f10410n;
            final Promise promise = this.f10411o;
            abstractC0748b.b(c0337dA, new InterfaceC0338e() { // from class: com.dooboolab.rniap.h
                @Override // C0.InterfaceC0338e
                public final void a(C0751e c0751e, String str) {
                    RNIapModule.d.c(i7, promise, c0751e, str);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class e extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0337d f10412m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10413n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Promise f10414o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C0337d c0337d, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f10412m = c0337d;
            this.f10413n = rNIapModule;
            this.f10414o = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e, String str) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("responseCode", c0751e.b());
                writableMapCreateMap.putString("debugMessage", c0751e.a());
                com.dooboolab.rniap.a aVarA = com.dooboolab.rniap.b.f10436a.a(c0751e.b());
                writableMapCreateMap.putString("code", aVarA.a());
                writableMapCreateMap.putString("message", aVarA.b());
                writableMapCreateMap.putString("purchaseToken", str);
                com.dooboolab.rniap.d.d(promise, writableMapCreateMap);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            C0337d c0337d = this.f10412m;
            final RNIapModule rNIapModule = this.f10413n;
            final Promise promise = this.f10414o;
            abstractC0748b.b(c0337d, new InterfaceC0338e() { // from class: com.dooboolab.rniap.i
                @Override // C0.InterfaceC0338e
                public final void a(C0751e c0751e, String str) {
                    RNIapModule.e.c(rNIapModule, promise, c0751e, str);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class f extends w5.l implements v5.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Promise f10416n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Promise promise) {
            super(1);
            this.f10416n = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e, List list) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                if (list == null) {
                    com.dooboolab.rniap.d.d(promise, Boolean.FALSE);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Purchase) obj).g() == 2) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    com.dooboolab.rniap.d.d(promise, Boolean.FALSE);
                } else {
                    rNIapModule.consumeItems(arrayList, promise, 8);
                }
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            C0344k c0344kA = C0344k.a().b("inapp").a();
            final RNIapModule rNIapModule = RNIapModule.this;
            final Promise promise = this.f10416n;
            abstractC0748b.j(c0344kA, new InterfaceC0341h() { // from class: com.dooboolab.rniap.j
                @Override // C0.InterfaceC0341h
                public final void a(C0751e c0751e, List list) {
                    RNIapModule.f.c(rNIapModule, promise, c0751e, list);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class g extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f10417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10418n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Promise f10419o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f10417m = str;
            this.f10418n = rNIapModule;
            this.f10419o = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, WritableNativeArray writableNativeArray, String str, C0751e c0751e, List list) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(writableNativeArray, "$items");
            w5.k.f(str, "$type");
            w5.k.f(c0751e, "billingResult");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("productId", (String) purchase.f().get(0));
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        List listF = purchase.f();
                        w5.k.e(listF, "getProducts(...)");
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            writableArrayCreateArray.pushString((String) it2.next());
                        }
                        writableNativeMap.putArray("productIds", writableArrayCreateArray);
                        writableNativeMap.putString("transactionId", purchase.c());
                        writableNativeMap.putDouble("transactionDate", purchase.h());
                        writableNativeMap.putString("transactionReceipt", purchase.d());
                        writableNativeMap.putString("orderId", purchase.c());
                        writableNativeMap.putString("purchaseToken", purchase.i());
                        writableNativeMap.putString("developerPayloadAndroid", purchase.b());
                        writableNativeMap.putString("signatureAndroid", purchase.j());
                        writableNativeMap.putInt("purchaseStateAndroid", purchase.g());
                        writableNativeMap.putBoolean("isAcknowledgedAndroid", purchase.k());
                        writableNativeMap.putString("packageNameAndroid", purchase.e());
                        C0747a c0747aA = purchase.a();
                        writableNativeMap.putString("obfuscatedAccountIdAndroid", c0747aA != null ? c0747aA.a() : null);
                        C0747a c0747aA2 = purchase.a();
                        writableNativeMap.putString("obfuscatedProfileIdAndroid", c0747aA2 != null ? c0747aA2.b() : null);
                        if (w5.k.b(str, "subs")) {
                            writableNativeMap.putBoolean("autoRenewingAndroid", purchase.l());
                        }
                        writableNativeArray.pushMap(writableNativeMap);
                    }
                }
                com.dooboolab.rniap.d.d(promise, writableNativeArray);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            final WritableNativeArray writableNativeArray = new WritableNativeArray();
            C0344k c0344kA = C0344k.a().b(w5.k.b(this.f10417m, "subs") ? "subs" : "inapp").a();
            final RNIapModule rNIapModule = this.f10418n;
            final Promise promise = this.f10419o;
            final String str = this.f10417m;
            abstractC0748b.j(c0344kA, new InterfaceC0341h() { // from class: com.dooboolab.rniap.k
                @Override // C0.InterfaceC0341h
                public final void a(C0751e c0751e, List list) {
                    RNIapModule.g.c(rNIapModule, promise, writableNativeArray, str, c0751e, list);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class h extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ReadableArray f10420m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Promise f10421n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f10422o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10423p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ReadableArray readableArray, Promise promise, String str, RNIapModule rNIapModule) {
            super(1);
            this.f10420m = readableArray;
            this.f10421n = promise;
            this.f10422o = str;
            this.f10423p = rNIapModule;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e, List list) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            w5.k.f(list, "skuDetailsList");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                WritableArray writableArrayCreateArray = Arguments.createArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0753g c0753g = (C0753g) it.next();
                    Map map = rNIapModule.skus;
                    String strD = c0753g.d();
                    w5.k.e(strD, "getProductId(...)");
                    w5.k.c(c0753g);
                    map.put(strD, c0753g);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("productId", c0753g.d());
                    writableMapCreateMap.putString("title", c0753g.g());
                    writableMapCreateMap.putString("description", c0753g.a());
                    writableMapCreateMap.putString("productType", c0753g.e());
                    writableMapCreateMap.putString("name", c0753g.b());
                    C0753g.b bVarC = c0753g.c();
                    if (bVarC != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putString("priceCurrencyCode", bVarC.c());
                        writableMapCreateMap2.putString("formattedPrice", bVarC.a());
                        writableMapCreateMap2.putString("priceAmountMicros", String.valueOf(bVarC.b()));
                        writableMapCreateMap.putMap("oneTimePurchaseOfferDetails", writableMapCreateMap2);
                    }
                    List<C0753g.e> listF = c0753g.f();
                    if (listF != null) {
                        WritableArray writableArrayCreateArray2 = Arguments.createArray();
                        for (C0753g.e eVar : listF) {
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putString("basePlanId", eVar.a());
                            writableMapCreateMap3.putString("offerId", eVar.b());
                            writableMapCreateMap3.putString("offerToken", eVar.d());
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            List listC = eVar.c();
                            w5.k.e(listC, "getOfferTags(...)");
                            Iterator it2 = listC.iterator();
                            while (it2.hasNext()) {
                                writableArrayCreateArray3.pushString((String) it2.next());
                            }
                            writableMapCreateMap3.putArray("offerTags", writableArrayCreateArray3);
                            WritableArray writableArrayCreateArray4 = Arguments.createArray();
                            List<C0753g.c> listA = eVar.e().a();
                            w5.k.e(listA, "getPricingPhaseList(...)");
                            for (C0753g.c cVar : listA) {
                                WritableMap writableMapCreateMap4 = Arguments.createMap();
                                writableMapCreateMap4.putString("formattedPrice", cVar.c());
                                writableMapCreateMap4.putString("priceCurrencyCode", cVar.e());
                                writableMapCreateMap4.putString("billingPeriod", cVar.b());
                                writableMapCreateMap4.putInt("billingCycleCount", cVar.a());
                                writableMapCreateMap4.putString("priceAmountMicros", String.valueOf(cVar.d()));
                                writableMapCreateMap4.putInt("recurrenceMode", cVar.f());
                                writableArrayCreateArray4.pushMap(writableMapCreateMap4);
                            }
                            WritableMap writableMapCreateMap5 = Arguments.createMap();
                            writableMapCreateMap5.putArray("pricingPhaseList", writableArrayCreateArray4);
                            writableMapCreateMap3.putMap("pricingPhases", writableMapCreateMap5);
                            writableArrayCreateArray2.pushMap(writableMapCreateMap3);
                        }
                        writableMapCreateMap.putArray("subscriptionOfferDetails", writableArrayCreateArray2);
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap);
                }
                com.dooboolab.rniap.d.d(promise, writableArrayCreateArray);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            String string;
            w5.k.f(abstractC0748b, "billingClient");
            ArrayList arrayList = new ArrayList();
            int size = this.f10420m.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (this.f10420m.getType(i7) == ReadableType.String && (string = this.f10420m.getString(i7)) != null) {
                    C0754h.b bVarA = C0754h.b.a().b(string).c(this.f10422o).a();
                    w5.k.e(bVarA, "build(...)");
                    arrayList.add(bVarA);
                }
            }
            if (arrayList.isEmpty()) {
                com.dooboolab.rniap.d.b(this.f10421n, "EMPTY_SKU_LIST", "The SKU list is empty.");
                return;
            }
            C0754h c0754hA = C0754h.a().b(arrayList).a();
            w5.k.e(c0754hA, "build(...)");
            final RNIapModule rNIapModule = this.f10423p;
            final Promise promise = this.f10421n;
            abstractC0748b.h(c0754hA, new InterfaceC0339f() { // from class: com.dooboolab.rniap.l
                @Override // C0.InterfaceC0339f
                public final void a(C0751e c0751e, List list) {
                    RNIapModule.h.c(rNIapModule, promise, c0751e, list);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    static final class i extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f10424m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10425n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Promise f10426o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, RNIapModule rNIapModule, Promise promise) {
            super(1);
            this.f10424m = str;
            this.f10425n = rNIapModule;
            this.f10426o = promise;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e, List list) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                Log.d(RNIapModule.TAG, String.valueOf(list));
                WritableArray writableArrayCreateArray = Arguments.createArray();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("productId", (String) purchaseHistoryRecord.c().get(0));
                        WritableArray writableArrayCreateArray2 = Arguments.createArray();
                        List listC = purchaseHistoryRecord.c();
                        w5.k.e(listC, "getProducts(...)");
                        Iterator it2 = listC.iterator();
                        while (it2.hasNext()) {
                            writableArrayCreateArray2.pushString((String) it2.next());
                        }
                        writableMapCreateMap.putArray("productIds", writableArrayCreateArray2);
                        writableMapCreateMap.putDouble("transactionDate", purchaseHistoryRecord.d());
                        writableMapCreateMap.putString("transactionReceipt", purchaseHistoryRecord.b());
                        writableMapCreateMap.putString("purchaseToken", purchaseHistoryRecord.e());
                        writableMapCreateMap.putString("dataAndroid", purchaseHistoryRecord.b());
                        writableMapCreateMap.putString("signatureAndroid", purchaseHistoryRecord.f());
                        writableMapCreateMap.putString("developerPayload", purchaseHistoryRecord.a());
                        writableArrayCreateArray.pushMap(writableMapCreateMap);
                    }
                }
                com.dooboolab.rniap.d.d(promise, writableArrayCreateArray);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            C0343j c0343jA = C0343j.a().b(w5.k.b(this.f10424m, "subs") ? "subs" : "inapp").a();
            final RNIapModule rNIapModule = this.f10425n;
            final Promise promise = this.f10426o;
            abstractC0748b.i(c0343jA, new InterfaceC0340g() { // from class: com.dooboolab.rniap.m
                @Override // C0.InterfaceC0340g
                public final void a(C0751e c0751e, List list) {
                    RNIapModule.i.c(rNIapModule, promise, c0751e, list);
                }
            });
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    public static final class j implements InterfaceC0336c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f10428b;

        j(Promise promise) {
            this.f10428b = promise;
        }

        @Override // C0.InterfaceC0336c
        public void a(C0751e c0751e) {
            w5.k.f(c0751e, "billingResult");
            if (RNIapModule.this.isValidResult(c0751e, this.f10428b)) {
                com.dooboolab.rniap.d.d(this.f10428b, Boolean.TRUE);
            }
        }

        @Override // C0.InterfaceC0336c
        public void b() {
            Log.i(RNIapModule.TAG, "Billing service disconnected");
        }
    }

    static final class k extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f10429m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Promise f10430n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Promise promise) {
            super(1);
            this.f10429m = str;
            this.f10430n = promise;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void a(AbstractC0748b abstractC0748b) {
            String str;
            w5.k.f(abstractC0748b, "billingClient");
            String str2 = this.f10429m;
            switch (str2.hashCode()) {
                case -91953012:
                    if (str2.equals("IN_APP_MESSAGING")) {
                        str = "bbb";
                        break;
                    }
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
                case 755711666:
                    if (str2.equals("PRODUCT_DETAILS")) {
                        str = "fff";
                        break;
                    }
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
                case 808641238:
                    if (str2.equals("SUBSCRIPTIONS")) {
                        str = "subscriptions";
                        break;
                    }
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
                case 1739975758:
                    if (str2.equals("PRICE_CHANGE_CONFIRMATION")) {
                        str = "priceChangeConfirmation";
                        break;
                    }
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
                case 1785301586:
                    if (str2.equals("SUBSCRIPTIONS_UPDATE")) {
                        str = "subscriptionsUpdate";
                        break;
                    }
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
                default:
                    com.dooboolab.rniap.d.a(this.f10430n, "Invalid Feature name");
                    return;
            }
            com.dooboolab.rniap.d.d(this.f10430n, abstractC0748b.d(str));
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    public static final class l implements LifecycleEventListener {
        l() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            AbstractC0748b abstractC0748b = RNIapModule.this.billingClientCache;
            if (abstractC0748b != null) {
                abstractC0748b.c();
            }
            RNIapModule.this.billingClientCache = null;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }

    static final class m extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Promise f10432m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RNIapModule f10433n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Promise promise, RNIapModule rNIapModule) {
            super(1);
            this.f10432m = promise;
            this.f10433n = rNIapModule;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RNIapModule rNIapModule, Promise promise, C0751e c0751e, List list) {
            w5.k.f(rNIapModule, "this$0");
            w5.k.f(promise, "$promise");
            w5.k.f(c0751e, "billingResult");
            w5.k.f(list, "list");
            if (rNIapModule.isValidResult(c0751e, promise)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((Purchase) obj).k()) {
                        arrayList.add(obj);
                    }
                }
                rNIapModule.onPurchasesUpdated(c0751e, arrayList);
            }
        }

        public final void b(AbstractC0748b abstractC0748b) {
            w5.k.f(abstractC0748b, "billingClient");
            String[] strArr = {"inapp", "subs"};
            for (int i7 = 0; i7 < 2; i7++) {
                C0344k c0344kA = C0344k.a().b(strArr[i7]).a();
                final RNIapModule rNIapModule = this.f10433n;
                final Promise promise = this.f10432m;
                abstractC0748b.j(c0344kA, new InterfaceC0341h() { // from class: com.dooboolab.rniap.n
                    @Override // C0.InterfaceC0341h
                    public final void a(C0751e c0751e, List list) {
                        RNIapModule.m.c(rNIapModule, promise, c0751e, list);
                    }
                });
            }
            com.dooboolab.rniap.d.d(this.f10432m, Boolean.TRUE);
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            b((AbstractC0748b) obj);
            return u.f19985a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNIapModule(ReactApplicationContext reactApplicationContext, AbstractC0748b.a aVar, GoogleApiAvailability googleApiAvailability) {
        super(reactApplicationContext);
        w5.k.f(reactApplicationContext, "reactContext");
        w5.k.f(aVar, "builder");
        w5.k.f(googleApiAvailability, "googleApiAvailability");
        this.reactContext = reactApplicationContext;
        this.builder = aVar;
        this.googleApiAvailability = googleApiAvailability;
        this.skus = new LinkedHashMap();
        reactApplicationContext.addLifecycleEventListener(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeItems(List<? extends Purchase> list, Promise promise, int i7) {
        Iterator<? extends Purchase> it = list.iterator();
        while (it.hasNext()) {
            ensureConnection(promise, new d(it.next(), i7, promise));
        }
    }

    static /* synthetic */ void consumeItems$default(RNIapModule rNIapModule, List list, Promise promise, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        rNIapModule.consumeItems(list, promise, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureConnection$lambda$0(RNIapModule rNIapModule, v5.l lVar, Promise promise, Object[] objArr) {
        w5.k.f(rNIapModule, "this$0");
        w5.k.f(lVar, "$callback");
        w5.k.f(promise, "$promise");
        w5.k.f(objArr, "it");
        if (!(objArr.length == 0)) {
            Object obj = objArr[0];
            if (obj instanceof Boolean) {
                w5.k.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj).booleanValue()) {
                    AbstractC0748b abstractC0748b = rNIapModule.billingClientCache;
                    if (abstractC0748b == null || !abstractC0748b.e()) {
                        com.dooboolab.rniap.d.b(promise, "E_NOT_PREPARED", "Unable to auto-initialize connection");
                        return;
                    } else {
                        lVar.i(abstractC0748b);
                        return;
                    }
                }
            }
        }
        com.dooboolab.rniap.d.b(promise, "E_UNKNOWN", "ensureConnection - incorrect parameter in resolve");
        Log.i(TAG, "Incorrect parameter in resolve");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ensureConnection$lambda$1(Promise promise, Object[] objArr) {
        String string;
        String string2;
        w5.k.f(promise, "$promise");
        w5.k.f(objArr, "it");
        if (objArr.length > 1) {
            Object obj = objArr[0];
            if ((obj instanceof String) && (objArr[1] instanceof String)) {
                w5.k.d(obj, "null cannot be cast to non-null type kotlin.String");
                string = (String) obj;
                Object obj2 = objArr[1];
                w5.k.d(obj2, "null cannot be cast to non-null type kotlin.String");
                string2 = (String) obj2;
            } else {
                if (!(objArr.length == 0)) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof WritableNativeMap) {
                        w5.k.d(obj3, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeMap");
                        WritableNativeMap writableNativeMap = (WritableNativeMap) obj3;
                        string = writableNativeMap.getString("code");
                        string2 = writableNativeMap.getString("message");
                    } else {
                        string = null;
                        string2 = null;
                    }
                }
            }
        }
        if (string != null && string2 != null) {
            com.dooboolab.rniap.d.b(promise, string, string2);
        } else {
            com.dooboolab.rniap.d.b(promise, "E_UNKNOWN", "ensureConnection - incorrect parameter in reject");
            Log.i(TAG, "Incorrect parameters in reject");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidResult(C0751e c0751e, Promise promise) {
        Log.d(TAG, "responseCode: " + c0751e.b());
        if (c0751e.b() == 0) {
            return true;
        }
        com.dooboolab.rniap.b.f10436a.b(promise, c0751e.b());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private final void sendUnconsumedPurchases(Promise promise) {
        ensureConnection(promise, new m(promise, this));
    }

    @ReactMethod
    public final void acknowledgePurchase(String str, String str2, Promise promise) {
        w5.k.f(str, "token");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new b(str, this, promise));
    }

    @ReactMethod
    public final void addListener(String str) {
        w5.k.f(str, TenjinConsts.EVENT_NAME);
    }

    @ReactMethod
    public final void buyItemByType(String str, ReadableArray readableArray, String str2, int i7, String str3, String str4, ReadableArray readableArray2, boolean z6, Promise promise) {
        w5.k.f(str, "type");
        w5.k.f(readableArray, "skuArr");
        w5.k.f(readableArray2, "offerTokenArr");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            com.dooboolab.rniap.d.b(promise, "E_UNKNOWN", "getCurrentActivity returned null");
        } else {
            ensureConnection(promise, new c(promise, str, readableArray, readableArray2, this, z6, str2, i7, str3, str4, currentActivity));
        }
    }

    @ReactMethod
    public final void consumeProduct(String str, String str2, Promise promise) {
        w5.k.f(str, "token");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        C0337d c0337dA = C0337d.b().b(str).a();
        w5.k.e(c0337dA, "build(...)");
        ensureConnection(promise, new e(c0337dA, this, promise));
    }

    @ReactMethod
    public final void endConnection(Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        AbstractC0748b abstractC0748b = this.billingClientCache;
        if (abstractC0748b != null) {
            abstractC0748b.c();
        }
        this.billingClientCache = null;
        this.skus.clear();
        com.dooboolab.rniap.c.f10437a.b();
        com.dooboolab.rniap.d.d(promise, Boolean.TRUE);
    }

    public final void ensureConnection(final Promise promise, final v5.l lVar) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        w5.k.f(lVar, "callback");
        AbstractC0748b abstractC0748b = this.billingClientCache;
        if (abstractC0748b == null || !abstractC0748b.e()) {
            initConnection(new PromiseImpl(new Callback() { // from class: com.dooboolab.rniap.e
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    RNIapModule.ensureConnection$lambda$0(this.f10439a, lVar, promise, objArr);
                }
            }, new Callback() { // from class: com.dooboolab.rniap.f
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    RNIapModule.ensureConnection$lambda$1(promise, objArr);
                }
            }));
        } else {
            lVar.i(abstractC0748b);
        }
    }

    @ReactMethod
    public final void flushFailedPurchasesCachedAsPending(Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new f(promise));
    }

    @ReactMethod
    public final void getAvailableItemsByType(String str, Promise promise) {
        w5.k.f(str, "type");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new g(str, this, promise));
    }

    @ReactMethod
    public final void getItemsByType(String str, ReadableArray readableArray, Promise promise) {
        w5.k.f(str, "type");
        w5.k.f(readableArray, "skuArr");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new h(readableArray, promise, str, this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getPackageName(Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(getReactApplicationContext().getPackageName());
    }

    @ReactMethod
    public final void getPurchaseHistoryByType(String str, Promise promise) {
        w5.k.f(str, "type");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new i(str, this, promise));
    }

    @ReactMethod
    public final void initConnection(Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (this.googleApiAvailability.isGooglePlayServicesAvailable(this.reactContext) != 0) {
            Log.i(TAG, "Google Play Services are not available on this device");
            com.dooboolab.rniap.d.b(promise, "E_NOT_PREPARED", "Google Play Services are not available on this device");
            return;
        }
        AbstractC0748b abstractC0748b = this.billingClientCache;
        if (abstractC0748b != null && abstractC0748b.e()) {
            Log.i(TAG, "Already initialized, you should only call initConnection() once when your app starts");
            com.dooboolab.rniap.d.d(promise, Boolean.TRUE);
        } else {
            AbstractC0748b abstractC0748bA = this.builder.d(this).a();
            this.billingClientCache = abstractC0748bA;
            abstractC0748bA.k(new j(promise));
        }
    }

    @ReactMethod
    public final void isFeatureSupported(String str, Promise promise) {
        w5.k.f(str, "feature");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new k(str, promise));
    }

    @Override // C0.InterfaceC0342i
    public void onPurchasesUpdated(C0751e c0751e, List<? extends Purchase> list) {
        w5.k.f(c0751e, "billingResult");
        int iB = c0751e.b();
        if (iB != 0) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("responseCode", iB);
            writableMapCreateMap.putString("debugMessage", c0751e.a());
            com.dooboolab.rniap.b bVar = com.dooboolab.rniap.b.f10436a;
            com.dooboolab.rniap.a aVarA = bVar.a(iB);
            writableMapCreateMap.putString("code", aVarA.a());
            writableMapCreateMap.putString("message", aVarA.b());
            sendEvent(this.reactContext, "purchase-error", writableMapCreateMap);
            bVar.c(PROMISE_BUY_ITEM, iB);
            return;
        }
        if (list == null) {
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("responseCode", c0751e.b());
            writableMapCreateMap2.putString("debugMessage", c0751e.a());
            writableMapCreateMap2.putString("extraMessage", "The purchases are null. This is a normal behavior if you have requested DEFERRED proration. If not please report an issue.");
            sendEvent(this.reactContext, "purchase-updated", writableMapCreateMap2);
            com.dooboolab.rniap.c.f10437a.d(PROMISE_BUY_ITEM, null);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        w5.k.e(writableArrayCreateArray, "createArray(...)");
        for (Purchase purchase : list) {
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putString("productId", (String) purchase.f().get(0));
            WritableArray writableArrayCreateArray2 = Arguments.createArray();
            List listF = purchase.f();
            w5.k.e(listF, "getProducts(...)");
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray2.pushString((String) it.next());
            }
            writableMapCreateMap3.putArray("productIds", writableArrayCreateArray2);
            writableMapCreateMap3.putString("transactionId", purchase.c());
            writableMapCreateMap3.putDouble("transactionDate", purchase.h());
            writableMapCreateMap3.putString("transactionReceipt", purchase.d());
            writableMapCreateMap3.putString("purchaseToken", purchase.i());
            writableMapCreateMap3.putString("dataAndroid", purchase.d());
            writableMapCreateMap3.putString("signatureAndroid", purchase.j());
            writableMapCreateMap3.putBoolean("autoRenewingAndroid", purchase.l());
            writableMapCreateMap3.putBoolean("isAcknowledgedAndroid", purchase.k());
            writableMapCreateMap3.putInt("purchaseStateAndroid", purchase.g());
            writableMapCreateMap3.putString("packageNameAndroid", purchase.e());
            writableMapCreateMap3.putString("developerPayloadAndroid", purchase.b());
            C0747a c0747aA = purchase.a();
            if (c0747aA != null) {
                writableMapCreateMap3.putString("obfuscatedAccountIdAndroid", c0747aA.a());
                writableMapCreateMap3.putString("obfuscatedProfileIdAndroid", c0747aA.b());
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap3.copy());
            sendEvent(this.reactContext, "purchase-updated", writableMapCreateMap3);
        }
        com.dooboolab.rniap.c.f10437a.d(PROMISE_BUY_ITEM, writableArrayCreateArray);
    }

    @ReactMethod
    public final void removeListeners(double d7) {
    }

    @ReactMethod
    public final void startListening(Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        sendUnconsumedPurchases(promise);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RNIapModule(ReactApplicationContext reactApplicationContext, AbstractC0748b.a aVar, GoogleApiAvailability googleApiAvailability, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i7 & 2) != 0) {
            aVar = AbstractC0748b.g(reactApplicationContext).b();
            w5.k.e(aVar, "enablePendingPurchases(...)");
        }
        if ((i7 & 4) != 0) {
            googleApiAvailability = GoogleApiAvailability.getInstance();
            w5.k.e(googleApiAvailability, "getInstance(...)");
        }
        this(reactApplicationContext, aVar, googleApiAvailability);
    }
}
