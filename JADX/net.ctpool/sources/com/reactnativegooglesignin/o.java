package com.reactnativegooglesignin;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    static Scope[] a(ReadableArray readableArray) {
        int size = readableArray.size();
        Scope[] scopeArr = new Scope[size];
        for (int i7 = 0; i7 < size; i7++) {
            scopeArr[i7] = new Scope(readableArray.getString(i7));
        }
        return scopeArr;
    }

    public static int b(AbstractC2272l abstractC2272l) {
        Exception excK = abstractC2272l.k();
        if (excK instanceof ApiException) {
            return ((ApiException) excK).getStatusCode();
        }
        return 8;
    }

    static GoogleSignInOptions c(Scope[] scopeArr, String str, boolean z6, boolean z7, String str2, String str3) {
        GoogleSignInOptions.a aVarE = new GoogleSignInOptions.a(GoogleSignInOptions.f13507x).e(new Scope(Scopes.EMAIL), scopeArr);
        if (str != null && !str.isEmpty()) {
            aVarE.c(str);
            if (z6) {
                aVarE.f(str, z7);
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            aVarE.g(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            aVarE.h(str3);
        }
        return aVarE.a();
    }

    static WritableMap d(GoogleSignInAccount googleSignInAccount) {
        Uri uriI1 = googleSignInAccount.i1();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", googleSignInAccount.S0());
        writableMapCreateMap.putString("name", googleSignInAccount.w());
        writableMapCreateMap.putString("givenName", googleSignInAccount.B0());
        writableMapCreateMap.putString("familyName", googleSignInAccount.n0());
        writableMapCreateMap.putString(Scopes.EMAIL, googleSignInAccount.a0());
        writableMapCreateMap.putString("photo", uriI1 != null ? uriI1.toString() : null);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("user", writableMapCreateMap);
        writableMapCreateMap2.putString("idToken", googleSignInAccount.h1());
        writableMapCreateMap2.putString("serverAuthCode", googleSignInAccount.k1());
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = googleSignInAccount.H0().iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(((Scope) it.next()).toString());
        }
        writableMapCreateMap2.putArray("scopes", writableArrayCreateArray);
        return writableMapCreateMap2;
    }

    static String e(ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder("oauth2:");
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            sb.append(readableArray.getString(i7));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
