package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l3.C1848a;
import l3.C1849b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Scope f13504C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Scope f13505D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Comparator f13506E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final GoogleSignInOptions f13507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final GoogleSignInOptions f13508y;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f13510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f13511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Account f13512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f13514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f13515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f13516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f13517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f13518u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f13519v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map f13520w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Scope f13509z = new Scope(Scopes.PROFILE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Scope f13502A = new Scope(Scopes.EMAIL);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Scope f13503B = new Scope(Scopes.OPEN_ID);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f13521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f13522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f13525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f13526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f13527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f13528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f13529i;

        public a() {
            this.f13521a = new HashSet();
            this.f13528h = new HashMap();
        }

        private final String j(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.f13525e;
            boolean z6 = true;
            if (str2 != null && !str2.equals(str)) {
                z6 = false;
            }
            Preconditions.checkArgument(z6, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f13521a.contains(GoogleSignInOptions.f13505D)) {
                Set set = this.f13521a;
                Scope scope = GoogleSignInOptions.f13504C;
                if (set.contains(scope)) {
                    this.f13521a.remove(scope);
                }
            }
            if (this.f13524d && (this.f13526f == null || !this.f13521a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f13521a), this.f13526f, this.f13524d, this.f13522b, this.f13523c, this.f13525e, this.f13527g, this.f13528h, this.f13529i);
        }

        public a b() {
            this.f13521a.add(GoogleSignInOptions.f13503B);
            return this;
        }

        public a c(String str) {
            this.f13524d = true;
            j(str);
            this.f13525e = str;
            return this;
        }

        public a d() {
            this.f13521a.add(GoogleSignInOptions.f13509z);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f13521a.add(scope);
            this.f13521a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z6) {
            this.f13522b = true;
            j(str);
            this.f13525e = str;
            this.f13523c = z6;
            return this;
        }

        public a g(String str) {
            this.f13526f = new Account(Preconditions.checkNotEmpty(str), AccountType.GOOGLE);
            return this;
        }

        public a h(String str) {
            this.f13527g = Preconditions.checkNotEmpty(str);
            return this;
        }

        public a i(String str) {
            this.f13529i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f13521a = new HashSet();
            this.f13528h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.f13521a = new HashSet(googleSignInOptions.f13511n);
            this.f13522b = googleSignInOptions.f13514q;
            this.f13523c = googleSignInOptions.f13515r;
            this.f13524d = googleSignInOptions.f13513p;
            this.f13525e = googleSignInOptions.f13516s;
            this.f13526f = googleSignInOptions.f13512o;
            this.f13527g = googleSignInOptions.f13517t;
            this.f13528h = GoogleSignInOptions.u1(googleSignInOptions.f13518u);
            this.f13529i = googleSignInOptions.f13519v;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        f13504C = scope;
        f13505D = new Scope(Scopes.GAMES);
        a aVar = new a();
        aVar.b();
        aVar.d();
        f13507x = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f13508y = aVar2.a();
        CREATOR = new e();
        f13506E = new d();
    }

    GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z6, boolean z7, boolean z8, String str, String str2, ArrayList arrayList2, String str3) {
        this(i7, arrayList, account, z6, z7, z8, str, str2, u1(arrayList2), str3);
    }

    public static GoogleSignInOptions j1(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, AccountType.GOOGLE) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map u1(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1848a c1848a = (C1848a) it.next();
                map.put(Integer.valueOf(c1848a.w()), c1848a);
            }
        }
        return map;
    }

    public String B0() {
        return this.f13516s;
    }

    public boolean H0() {
        return this.f13515r;
    }

    public boolean S0() {
        return this.f13513p;
    }

    public String a0() {
        return this.f13519v;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f13518u.isEmpty() && googleSignInOptions.f13518u.isEmpty() && this.f13511n.size() == googleSignInOptions.n0().size() && this.f13511n.containsAll(googleSignInOptions.n0())) {
                Account account = this.f13512o;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (TextUtils.isEmpty(this.f13516s)) {
                            if (this.f13516s.equals(googleSignInOptions.B0())) {
                                if (this.f13515r == googleSignInOptions.H0()) {
                                    if (!TextUtils.equals(this.f13519v, googleSignInOptions.a0())) {
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(googleSignInOptions.B0())) {
                            if (this.f13515r == googleSignInOptions.H0() && this.f13513p == googleSignInOptions.S0() && this.f13514q == googleSignInOptions.h1()) {
                                if (!TextUtils.equals(this.f13519v, googleSignInOptions.a0())) {
                                    return true;
                                }
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (TextUtils.isEmpty(this.f13516s)) {
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public Account getAccount() {
        return this.f13512o;
    }

    public boolean h1() {
        return this.f13514q;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f13511n;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).getScopeUri());
        }
        Collections.sort(arrayList);
        C1849b c1849b = new C1849b();
        c1849b.a(arrayList);
        c1849b.a(this.f13512o);
        c1849b.a(this.f13516s);
        c1849b.c(this.f13515r);
        c1849b.c(this.f13513p);
        c1849b.c(this.f13514q);
        c1849b.a(this.f13519v);
        return c1849b.b();
    }

    public ArrayList n0() {
        return new ArrayList(this.f13511n);
    }

    public final String n1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f13511n, f13506E);
            Iterator it = this.f13511n.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f13512o;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f13513p);
            jSONObject.put("forceCodeForRefreshToken", this.f13515r);
            jSONObject.put("serverAuthRequested", this.f13514q);
            if (!TextUtils.isEmpty(this.f13516s)) {
                jSONObject.put("serverClientId", this.f13516s);
            }
            if (!TextUtils.isEmpty(this.f13517t)) {
                jSONObject.put("hostedDomain", this.f13517t);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public ArrayList w() {
        return this.f13518u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13510m;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i8);
        SafeParcelWriter.writeTypedList(parcel, 2, n0(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i7, false);
        SafeParcelWriter.writeBoolean(parcel, 4, S0());
        SafeParcelWriter.writeBoolean(parcel, 5, h1());
        SafeParcelWriter.writeBoolean(parcel, 6, H0());
        SafeParcelWriter.writeString(parcel, 7, B0(), false);
        SafeParcelWriter.writeString(parcel, 8, this.f13517t, false);
        SafeParcelWriter.writeTypedList(parcel, 9, w(), false);
        SafeParcelWriter.writeString(parcel, 10, a0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z6, boolean z7, boolean z8, String str, String str2, Map map, String str3) {
        this.f13510m = i7;
        this.f13511n = arrayList;
        this.f13512o = account;
        this.f13513p = z6;
        this.f13514q = z7;
        this.f13515r = z8;
        this.f13516s = str;
        this.f13517t = str2;
        this.f13518u = new ArrayList(map.values());
        this.f13520w = map;
        this.f13519v = str3;
    }
}
