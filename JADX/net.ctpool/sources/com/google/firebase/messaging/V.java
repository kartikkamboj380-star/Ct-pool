package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.AbstractC1540e;
import java.util.Map;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractSafeParcelable {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f17548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f17549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f17550o;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f17551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f17552b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f17551a = bundle;
            this.f17552b = new C1890a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f17552b.put(str, str2);
            return this;
        }

        public V b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f17552b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f17551a);
            this.f17551a.remove("from");
            return new V(bundle);
        }

        public b c(String str) {
            this.f17551a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f17551a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f17551a.putString("message_type", str);
            return this;
        }

        public b f(int i7) {
            this.f17551a.putString("google.ttl", String.valueOf(i7));
            return this;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f17555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f17556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f17557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String[] f17558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f17559g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f17560h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f17561i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f17562j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f17563k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final String f17564l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f17565m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f17566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f17567o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f17568p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Integer f17569q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Integer f17570r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int[] f17571s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Long f17572t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f17573u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f17574v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f17575w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f17576x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f17577y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final long[] f17578z;

        private c(M m7) {
            this.f17553a = m7.p("gcm.n.title");
            this.f17554b = m7.h("gcm.n.title");
            this.f17555c = j(m7, "gcm.n.title");
            this.f17556d = m7.p("gcm.n.body");
            this.f17557e = m7.h("gcm.n.body");
            this.f17558f = j(m7, "gcm.n.body");
            this.f17559g = m7.p("gcm.n.icon");
            this.f17561i = m7.o();
            this.f17562j = m7.p("gcm.n.tag");
            this.f17563k = m7.p("gcm.n.color");
            this.f17564l = m7.p("gcm.n.click_action");
            this.f17565m = m7.p("gcm.n.android_channel_id");
            this.f17566n = m7.f();
            this.f17560h = m7.p("gcm.n.image");
            this.f17567o = m7.p("gcm.n.ticker");
            this.f17568p = m7.b("gcm.n.notification_priority");
            this.f17569q = m7.b("gcm.n.visibility");
            this.f17570r = m7.b("gcm.n.notification_count");
            this.f17573u = m7.a("gcm.n.sticky");
            this.f17574v = m7.a("gcm.n.local_only");
            this.f17575w = m7.a("gcm.n.default_sound");
            this.f17576x = m7.a("gcm.n.default_vibrate_timings");
            this.f17577y = m7.a("gcm.n.default_light_settings");
            this.f17572t = m7.j("gcm.n.event_time");
            this.f17571s = m7.e();
            this.f17578z = m7.q();
        }

        private static String[] j(M m7, String str) {
            Object[] objArrG = m7.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i7 = 0; i7 < objArrG.length; i7++) {
                strArr[i7] = String.valueOf(objArrG[i7]);
            }
            return strArr;
        }

        public String a() {
            return this.f17556d;
        }

        public String[] b() {
            return this.f17558f;
        }

        public String c() {
            return this.f17557e;
        }

        public String d() {
            return this.f17565m;
        }

        public String e() {
            return this.f17564l;
        }

        public String f() {
            return this.f17563k;
        }

        public String g() {
            return this.f17559g;
        }

        public Uri h() {
            String str = this.f17560h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f17566n;
        }

        public Integer k() {
            return this.f17570r;
        }

        public Integer l() {
            return this.f17568p;
        }

        public String m() {
            return this.f17561i;
        }

        public String n() {
            return this.f17567o;
        }

        public String o() {
            return this.f17553a;
        }

        public String[] p() {
            return this.f17555c;
        }

        public String q() {
            return this.f17554b;
        }

        public Integer r() {
            return this.f17569q;
        }
    }

    public V(Bundle bundle) {
        this.f17548m = bundle;
    }

    private int H0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String B0() {
        String string = this.f17548m.getString("google.message_id");
        return string == null ? this.f17548m.getString("message_id") : string;
    }

    public String S0() {
        return this.f17548m.getString("message_type");
    }

    public Map a0() {
        if (this.f17549n == null) {
            this.f17549n = AbstractC1540e.a.a(this.f17548m);
        }
        return this.f17549n;
    }

    public c h1() {
        if (this.f17550o == null && M.t(this.f17548m)) {
            this.f17550o = new c(new M(this.f17548m));
        }
        return this.f17550o;
    }

    public int i1() {
        String string = this.f17548m.getString("google.original_priority");
        if (string == null) {
            string = this.f17548m.getString("google.priority");
        }
        return H0(string);
    }

    public int j1() {
        String string = this.f17548m.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.f17548m.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.f17548m.getString("google.priority");
        }
        return H0(string);
    }

    public long k1() {
        Object obj = this.f17548m.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String l1() {
        return this.f17548m.getString("google.to");
    }

    public int m1() {
        Object obj = this.f17548m.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public String n0() {
        return this.f17548m.getString("from");
    }

    void n1(Intent intent) {
        intent.putExtras(this.f17548m);
    }

    public String w() {
        return this.f17548m.getString("collapse_key");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        W.c(this, parcel, i7);
    }
}
