package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.y7;
import com.tenjin.android.config.TenjinConsts;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends AbstractC1533z3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f15997i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f15998j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f15999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f16000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private T.a f16002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f16003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f16004h;

    d6(S2 s22) {
        super(s22);
        this.f16004h = null;
        this.f16000d = new AtomicLong(0L);
    }

    public static Bundle B(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i7 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i7 < parcelableArr.length) {
                        if (parcelableArr[i7] instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelableArr[i7]);
                        }
                        i7++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i7 < list.size()) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                        i7++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean B0(String str) {
        return E0((String) G.f15521e0.a(null), str);
    }

    public static Bundle E(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Y5 y52 = (Y5) it.next();
            String str = y52.f15879q;
            if (str != null) {
                bundle.putString(y52.f15876n, str);
            } else {
                Long l7 = y52.f15878p;
                if (l7 != null) {
                    bundle.putLong(y52.f15876n, l7.longValue());
                } else {
                    Double d7 = y52.f15881s;
                    if (d7 != null) {
                        bundle.putDouble(y52.f15876n, d7.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean E0(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    static boolean F0(String str) {
        return E0((String) G.f15459B0.a(null), str);
    }

    private final Object G(int i7, Object obj, boolean z6, boolean z7, String str) {
        Bundle bundleC;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return H(String.valueOf(obj), i7, z6);
        }
        if (!z7 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleC = C((Bundle) parcelable, null)) != null && !bundleC.isEmpty()) {
                arrayList.add(bundleC);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static String H(String str, int i7, boolean z6) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (!z6) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i7)) + "...";
    }

    static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean I0(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void J(Bundle bundle, int i7, String str, Object obj) {
        if (t0(bundle, i7)) {
            bundle.putString("_ev", H(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean K0(String str) {
        for (String str2 : f15998j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int L0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !h0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int M0(String str) {
        if (!A0("event param", str)) {
            return 3;
        }
        if (m0("event param", null, str)) {
            return !h0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int N0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean Q0(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void V(C1520x4 c1520x4, Bundle bundle, boolean z6) {
        if (bundle == null || c1520x4 == null || (bundle.containsKey("_sc") && !z6)) {
            if (bundle != null && c1520x4 == null && z6) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c1520x4.f16346a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c1520x4.f16347b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c1520x4.f16348c);
    }

    public static void W(c6 c6Var, int i7, String str, String str2, int i8) {
        X(c6Var, null, i7, str, str2, i8);
    }

    static void X(c6 c6Var, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        t0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        c6Var.g(str, "_err", bundle);
    }

    private final boolean X0() {
        Integer num;
        if (this.f16003g == null) {
            T.a aVarR0 = R0();
            boolean z6 = false;
            if (aVarR0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) aVarR0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z6 = true;
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        num2 = num;
                        d().J().b("Measurement manager api exception", e);
                        this.f16003g = Boolean.FALSE;
                        num = num2;
                    } catch (CancellationException e8) {
                        e = e8;
                        num2 = num;
                        d().J().b("Measurement manager api exception", e);
                        this.f16003g = Boolean.FALSE;
                        num = num2;
                    } catch (ExecutionException e9) {
                        e = e9;
                        num2 = num;
                        d().J().b("Measurement manager api exception", e);
                        this.f16003g = Boolean.FALSE;
                        num = num2;
                    } catch (TimeoutException e10) {
                        e = e10;
                        num2 = num;
                        d().J().b("Measurement manager api exception", e);
                        this.f16003g = Boolean.FALSE;
                        num = num2;
                    }
                }
                this.f16003g = Boolean.valueOf(z6);
            } catch (InterruptedException e11) {
                e = e11;
            } catch (CancellationException e12) {
                e = e12;
            } catch (ExecutionException e13) {
                e = e13;
            } catch (TimeoutException e14) {
                e = e14;
            }
            d().I().b("Measurement manager api status result", num);
        }
        return this.f16003g.booleanValue();
    }

    private final void Y(String str, String str2, String str3, Bundle bundle, List list, boolean z6) {
        int iM0;
        int i7;
        String str4;
        int iV;
        int i8;
        if (bundle == null) {
            return;
        }
        int i9 = b().h().a0(231100000, true) ? 35 : 0;
        int i10 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iM0 = !z6 ? M0(str5) : 0;
                if (iM0 == 0) {
                    iM0 = L0(str5);
                }
            } else {
                iM0 = 0;
            }
            if (iM0 != 0) {
                J(bundle, iM0, str5, iM0 == 3 ? str5 : null);
                bundle.remove(str5);
                i7 = i9;
            } else {
                if (f0(bundle.get(str5))) {
                    d().K().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iV = 22;
                    str4 = str5;
                    i7 = i9;
                } else {
                    str4 = str5;
                    i7 = i9;
                    iV = v(str, str2, str5, bundle.get(str5), bundle, list, z6, false);
                }
                if (iV == 0 || "_ev".equals(str4)) {
                    if (!I0(str4) || l0(str4, w3.u.f22708d)) {
                        i8 = i7;
                    } else {
                        int i11 = i10 + 1;
                        if (a0(231100000, true)) {
                            i8 = i7;
                            if (i11 > i8) {
                                d().F().c("Item can't contain more than " + i8 + " item-scoped custom params", e().c(str2), e().a(bundle));
                                t0(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            d().F().c("Item array not supported on client's version of Google Play Services (Android Only)", e().c(str2), e().a(bundle));
                            t0(bundle, 23);
                            bundle.remove(str4);
                            i8 = i7;
                        }
                        i10 = i11;
                    }
                    i9 = i8;
                } else {
                    J(bundle, iV, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
            i9 = i7;
        }
    }

    static boolean b0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean c0(Context context, boolean z6) {
        Preconditions.checkNotNull(context);
        return z0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean d0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean e0(Bundle bundle, int i7) {
        int i8 = 0;
        if (bundle.size() <= i7) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i8++;
            if (i8 > i7) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean f0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean k0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean l0(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] o0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList r0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1383e c1383e = (C1383e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1383e.f16005m);
            bundle.putString("origin", c1383e.f16006n);
            bundle.putLong("creation_timestamp", c1383e.f16008p);
            bundle.putString("name", c1383e.f16007o.f15876n);
            w3.q.b(bundle, Preconditions.checkNotNull(c1383e.f16007o.w()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, c1383e.f16009q);
            String str = c1383e.f16010r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            E e7 = c1383e.f16011s;
            if (e7 != null) {
                bundle.putString("timed_out_event_name", e7.f15418m);
                D d7 = e7.f15419n;
                if (d7 != null) {
                    bundle.putBundle("timed_out_event_params", d7.n0());
                }
            }
            bundle.putLong("trigger_timeout", c1383e.f16012t);
            E e8 = c1383e.f16013u;
            if (e8 != null) {
                bundle.putString("triggered_event_name", e8.f15418m);
                D d8 = e8.f15419n;
                if (d8 != null) {
                    bundle.putBundle("triggered_event_params", d8.n0());
                }
            }
            bundle.putLong("triggered_timestamp", c1383e.f16007o.f15877o);
            bundle.putLong("time_to_live", c1383e.f16014v);
            E e9 = c1383e.f16015w;
            if (e9 != null) {
                bundle.putString("expired_event_name", e9.f15418m);
                D d9 = e9.f15419n;
                if (d9 != null) {
                    bundle.putBundle("expired_event_params", d9.n0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean s0(Context context, String str) {
        C1463p2 c1463p2E;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            e = e7;
            c1463p2E = d().E();
            str2 = "Package name not found";
            c1463p2E.b(str2, e);
            return true;
        } catch (CertificateException e8) {
            e = e8;
            c1463p2E = d().E();
            str2 = "Error obtaining certificate";
            c1463p2E.b(str2, e);
            return true;
        }
    }

    private static boolean t0(Bundle bundle, int i7) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int v(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z6, boolean z7) {
        int i7;
        C1463p2 c1463p2K;
        String str4;
        String str5;
        int size;
        l();
        int i8 = 0;
        if (!f0(obj)) {
            i7 = 0;
        } else {
            if (!z7) {
                return 21;
            }
            if (!l0(str3, w3.u.f22707c)) {
                return 20;
            }
            if (!this.f16325a.H().f0()) {
                return 25;
            }
            boolean z8 = obj instanceof Parcelable[];
            if (z8) {
                size = ((Parcelable[]) obj).length;
            } else {
                if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                i7 = 0;
            }
            if (size > 200) {
                d().K().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                if (z8) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i7 = 17;
            }
        }
        if (j0("param", str3, (H0(str2) || H0(str3)) ? b().v(null, false) : b().p(null, false), obj)) {
            return i7;
        }
        if (!z7) {
            return 4;
        }
        if (obj instanceof Bundle) {
            Y(str, str2, str3, (Bundle) obj, list, z6);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    c1463p2K = d().K();
                    str4 = parcelable.getClass();
                    str5 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                    c1463p2K.c(str5, str4, str3);
                    return 4;
                }
                Y(str, str2, str3, (Bundle) parcelable, list, z6);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            while (i8 < size2) {
                Object obj2 = arrayList2.get(i8);
                int i9 = i8 + 1;
                if (!(obj2 instanceof Bundle)) {
                    c1463p2K = d().K();
                    str4 = obj2 != null ? obj2.getClass() : "null";
                    str5 = "All ArrayList elements must be of type Bundle. Value type, name";
                    c1463p2K.c(str5, str4, str3);
                    return 4;
                }
                Y(str, str2, str3, (Bundle) obj2, list, z6);
                i8 = i9;
            }
        }
        return i7;
    }

    static Bundle[] v0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long w(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    static int w0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long y(D d7) {
        long length = 0;
        if (d7 == null) {
            return 0L;
        }
        Iterator it = d7.iterator();
        while (it.hasNext()) {
            Object objH0 = d7.H0((String) it.next());
            if (objH0 instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objH0).length;
            }
        }
        return length;
    }

    static long z(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int i7 = 0;
        Preconditions.checkState(bArr.length > 0);
        long j7 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j7 += (((long) bArr[length]) & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    private static boolean z0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    final Bundle A(Uri uri, boolean z6) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z6 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z6 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z6 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z6 && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(TenjinConsts.ATTR_PARAM_CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            d().J().b("Install referrer url isn't a hierarchical URI", e7);
            return null;
        }
    }

    final boolean A0(String str, String str2) {
        if (str2 == null) {
            d().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            d().F().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            d().F().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final Bundle C(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objQ0 = q0(str2, bundle.get(str2));
                if (objQ0 == null) {
                    d().K().b("Param value can't be null", e().f(str2));
                } else {
                    M(bundle2, str2, objQ0);
                }
            }
        }
        return bundle2;
    }

    final boolean C0(String str, String str2) {
        if (y7.a() && b().r(G.f15572z0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b().P().equals(str);
    }

    final Bundle D(String str, String str2, Bundle bundle, List list, boolean z6) {
        int iM0;
        int i7;
        d6 d6Var = this;
        boolean zL0 = l0(str2, w3.s.f22702d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iW = b().w();
        int i8 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM0 = !z6 ? d6Var.M0(str3) : 0;
                if (iM0 == 0) {
                    iM0 = d6Var.L0(str3);
                }
            } else {
                iM0 = 0;
            }
            if (iM0 != 0) {
                J(bundle2, iM0, str3, iM0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i7 = iW;
            } else {
                i7 = iW;
                int iV = v(str, str2, str3, bundle.get(str3), bundle2, list, z6, zL0);
                if (iV == 17) {
                    J(bundle2, iV, str3, Boolean.FALSE);
                } else if (iV != 0 && !"_ev".equals(str3)) {
                    J(bundle2, iV, iV == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (I0(str3)) {
                    int i9 = i8 + 1;
                    if (i9 > i7) {
                        d().F().c("Event can't contain more than " + i7 + " params", e().c(str2), e().a(bundle));
                        t0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i8 = i9;
                }
            }
            iW = i7;
            d6Var = this;
        }
        return bundle2;
    }

    final boolean D0(String str) {
        l();
        if (Wrappers.packageManager(a()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        d().D().b("Permission not granted", str);
        return false;
    }

    final E F(String str, String str2, Bundle bundle, String str3, long j7, boolean z6, boolean z7) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (t(str2) != 0) {
            d().E().b("Invalid conditional property event name", e().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleD = D(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z6) {
            bundleD = C(bundleD, str);
        }
        Preconditions.checkNotNull(bundleD);
        return new E(str2, new D(bundleD), str3, j7);
    }

    public final int G0() {
        if (this.f16004h == null) {
            this.f16004h = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(a()) / 1000);
        }
        return this.f16004h.intValue();
    }

    public final URL I(long j7, String str, String str2, long j8, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j7), Integer.valueOf(G0())), str2, str, Long.valueOf(j8));
            if (str.equals(b().Q())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e7) {
            e = e7;
            d().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e8) {
            e = e8;
            d().E().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean J0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    final void K(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            d().J().b("Params already contained engagement", Long.valueOf(j8));
        }
        bundle.putLong("_et", j7 + j8);
    }

    final void L(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                h().M(bundle, str, bundle2.get(str));
            }
        }
    }

    final void M(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            d().K().c("Not putting event parameter. Invalid value type. name, type", e().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void N(com.google.android.gms.internal.measurement.U0 u02, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning int value to wrapper", e7);
        }
    }

    public final void O(com.google.android.gms.internal.measurement.U0 u02, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning long value to wrapper", e7);
        }
    }

    final long O0() {
        l();
        if (!B0(this.f16325a.z().D())) {
            return 0L;
        }
        long j7 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : w0() < ((Integer) G.f15504Y.a(null)).intValue() ? 16L : 0L;
        if (!D0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !X0()) {
            j7 |= 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u02, Bundle bundle) {
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning bundle value to wrapper", e7);
        }
    }

    public final long P0() {
        long andIncrement;
        long j7;
        if (this.f16000d.get() != 0) {
            synchronized (this.f16000d) {
                this.f16000d.compareAndSet(-1L, 1L);
                andIncrement = this.f16000d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f16000d) {
            long jNextLong = new Random(System.nanoTime() ^ zzb().currentTimeMillis()).nextLong();
            int i7 = this.f16001e + 1;
            this.f16001e = i7;
            j7 = jNextLong + ((long) i7);
        }
        return j7;
    }

    public final void Q(com.google.android.gms.internal.measurement.U0 u02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning string value to wrapper", e7);
        }
    }

    public final void R(com.google.android.gms.internal.measurement.U0 u02, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning bundle list to wrapper", e7);
        }
    }

    final T.a R0() {
        if (this.f16002f == null) {
            this.f16002f = T.a.a(a());
        }
        return this.f16002f;
    }

    public final void S(com.google.android.gms.internal.measurement.U0 u02, boolean z6) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z6);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning boolean value to wrapper", e7);
        }
    }

    final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(com.google.android.gms.internal.measurement.U0 u02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f16325a.d().J().b("Error returning byte array to wrapper", e7);
        }
    }

    final void U(C1476r2 c1476r2, int i7) {
        int i8 = 0;
        for (String str : new TreeSet(c1476r2.f16256d.keySet())) {
            if (I0(str) && (i8 = i8 + 1) > i7) {
                d().F().c("Event can't contain more than " + i7 + " params", e().c(c1476r2.f16253a), e().a(c1476r2.f16256d));
                t0(c1476r2.f16256d, 5);
                c1476r2.f16256d.remove(str);
            }
        }
    }

    final SecureRandom U0() {
        l();
        if (this.f15999c == null) {
            this.f15999c = new SecureRandom();
        }
        return this.f15999c;
    }

    final boolean V0() {
        l();
        return O0() == 1;
    }

    public final boolean W0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final void Z(Parcelable[] parcelableArr, int i7) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i8 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (I0(str) && !l0(str, w3.u.f22708d) && (i8 = i8 + 1) > i7) {
                    d().F().c("Param can't contain more than " + i7 + " item-scoped custom parameters", e().f(str), e().a(bundle));
                    t0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final boolean a0(int i7, boolean z6) {
        Boolean boolU = this.f16325a.H().U();
        if (G0() < i7 / 1000) {
            return (boolU == null || boolU.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    final boolean g0(String str, double d7) {
        try {
            SharedPreferences.Editor editorEdit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d7));
            return editorEdit.commit();
        } catch (RuntimeException e7) {
            d().E().b("Failed to persist Deferred Deep Link. exception", e7);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    final boolean h0(String str, int i7, String str2) {
        if (str2 == null) {
            d().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        d().F().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    final boolean i0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (Q0(str)) {
                return true;
            }
            if (this.f16325a.p()) {
                d().F().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C1449n2.t(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f16325a.p()) {
                d().F().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (Q0(str2)) {
            return true;
        }
        d().F().b("Invalid admob_app_id. Analytics disabled.", C1449n2.t(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final boolean j0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i7) {
                d().K().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final void m() {
        l();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                d().J().a("Utils falling back to Random for random id");
            }
        }
        this.f16000d.set(jNextLong);
    }

    final boolean m0(String str, String[] strArr, String str2) {
        return n0(str, strArr, null, str2);
    }

    final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            d().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        for (String str3 : f15997i) {
            if (str2.startsWith(str3)) {
                d().F().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !l0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && l0(str2, strArr2)) {
            return true;
        }
        d().F().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int p0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (m0("user property", w3.t.f22703a, str)) {
            return !h0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object q0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return G(b().v(null, false), obj, true, true, null);
        }
        return G(H0(str) ? b().v(null, false) : b().p(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final boolean r() {
        return true;
    }

    public final int s(int i7) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(a(), 12451000);
    }

    final int t(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (n0("event", w3.s.f22699a, w3.s.f22700b, str)) {
            return !h0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int u(String str, Object obj) {
        return j0("_ldl".equals(str) ? "user property referrer" : "user property", str, N0(str), obj) ? 0 : 7;
    }

    final boolean u0(String str, String str2) {
        if (str2 == null) {
            d().F().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            d().F().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            d().F().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d().F().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final long x(Context context, String str) {
        l();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest messageDigestT0 = T0();
        long jZ = -1;
        if (messageDigestT0 == null) {
            d().E().a("Could not get MD5 instance");
        } else if (packageManager != null) {
            try {
            } catch (PackageManager.NameNotFoundException e7) {
                d().E().b("Package name not found", e7);
            }
            if (s0(context, str)) {
                jZ = 0;
            } else {
                Signature[] signatureArr = Wrappers.packageManager(context).getPackageInfo(a().getPackageName(), 64).signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    d().J().a("Could not get signatures");
                } else {
                    jZ = z(messageDigestT0.digest(signatureArr[0].toByteArray()));
                }
            }
        }
        return jZ;
    }

    final long x0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i7 = 0;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(a()).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i7 = applicationInfo.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            d().H().b("PackageManager failed to find running app: app_id", str);
        }
        return i7;
    }

    final Object y0(String str, Object obj) {
        return "_ldl".equals(str) ? G(N0(str), obj, true, false, null) : G(N0(str), obj, false, false, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
