package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Clock f13488z = DefaultClock.getInstance();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f13489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f13490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f13491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f13492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f13493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Uri f13494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f13495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f13496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f13497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final List f13498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f13499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f13500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Set f13501y = new HashSet();

    GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f13489m = i7;
        this.f13490n = str;
        this.f13491o = str2;
        this.f13492p = str3;
        this.f13493q = str4;
        this.f13494r = uri;
        this.f13495s = str5;
        this.f13496t = j7;
        this.f13497u = str6;
        this.f13498v = list;
        this.f13499w = str7;
        this.f13500x = str8;
    }

    public static GoogleSignInAccount m1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    public static GoogleSignInAccount n1(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j7 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount googleSignInAccountM1 = m1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(Scopes.EMAIL) ? jSONObject.optString(Scopes.EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j7), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM1.f13495s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountM1;
    }

    public String B0() {
        return this.f13499w;
    }

    public Set H0() {
        return new HashSet(this.f13498v);
    }

    public String S0() {
        return this.f13490n;
    }

    public String a0() {
        return this.f13492p;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f13497u.equals(this.f13497u) && googleSignInAccount.j1().equals(j1());
    }

    public Account getAccount() {
        String str = this.f13492p;
        if (str == null) {
            return null;
        }
        return new Account(str, AccountType.GOOGLE);
    }

    public String h1() {
        return this.f13491o;
    }

    public int hashCode() {
        return ((this.f13497u.hashCode() + 527) * 31) + j1().hashCode();
    }

    public Uri i1() {
        return this.f13494r;
    }

    public Set j1() {
        HashSet hashSet = new HashSet(this.f13498v);
        hashSet.addAll(this.f13501y);
        return hashSet;
    }

    public String k1() {
        return this.f13495s;
    }

    public boolean l1() {
        return f13488z.currentTimeMillis() / 1000 >= this.f13496t + (-300);
    }

    public String n0() {
        return this.f13500x;
    }

    public final String o1() {
        return this.f13497u;
    }

    public final String p1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (S0() != null) {
                jSONObject.put("id", S0());
            }
            if (h1() != null) {
                jSONObject.put("tokenId", h1());
            }
            if (a0() != null) {
                jSONObject.put(Scopes.EMAIL, a0());
            }
            if (w() != null) {
                jSONObject.put("displayName", w());
            }
            if (B0() != null) {
                jSONObject.put("givenName", B0());
            }
            if (n0() != null) {
                jSONObject.put("familyName", n0());
            }
            Uri uriI1 = i1();
            if (uriI1 != null) {
                jSONObject.put("photoUrl", uriI1.toString());
            }
            if (k1() != null) {
                jSONObject.put("serverAuthCode", k1());
            }
            jSONObject.put("expirationTime", this.f13496t);
            jSONObject.put("obfuscatedIdentifier", this.f13497u);
            JSONArray jSONArray = new JSONArray();
            List list = this.f13498v;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: k3.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public String w() {
        return this.f13493q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f13489m);
        SafeParcelWriter.writeString(parcel, 2, S0(), false);
        SafeParcelWriter.writeString(parcel, 3, h1(), false);
        SafeParcelWriter.writeString(parcel, 4, a0(), false);
        SafeParcelWriter.writeString(parcel, 5, w(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, i1(), i7, false);
        SafeParcelWriter.writeString(parcel, 7, k1(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.f13496t);
        SafeParcelWriter.writeString(parcel, 9, this.f13497u, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f13498v, false);
        SafeParcelWriter.writeString(parcel, 11, B0(), false);
        SafeParcelWriter.writeString(parcel, 12, n0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
