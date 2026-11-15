package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1407h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f16061b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference f16062c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReference f16063d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w3.i f16064a;

    public C1407h2(w3.i iVar) {
        this.f16064a = iVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (Objects.equals(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i7] == null) {
                            strArr3[i7] = strArr2[i7] + "(" + strArr[i7] + ")";
                        }
                        str2 = strArr3[i7];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strA);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f16064a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String b(E e7) {
        if (e7 == null) {
            return null;
        }
        if (!this.f16064a.a()) {
            return e7.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(e7.f15420o);
        sb.append(",name=");
        sb.append(c(e7.f15418m));
        sb.append(",params=");
        D d7 = e7.f15419n;
        sb.append(d7 != null ? !this.f16064a.a() ? d7.toString() : a(d7.n0()) : null);
        return sb.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16064a.a() ? str : d(str, w3.s.f22701c, w3.s.f22699a, f16061b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16064a.a() ? str : d(str, w3.u.f22706b, w3.u.f22705a, f16062c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16064a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, w3.t.f22704b, w3.t.f22703a, f16063d);
        }
        return "experiment_id(" + str + ")";
    }
}
