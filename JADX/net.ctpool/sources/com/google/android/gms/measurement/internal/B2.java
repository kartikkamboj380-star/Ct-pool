package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1195r7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f15376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f15377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C1532z2 f15378d;

    public B2(C1532z2 c1532z2, String str, Bundle bundle) {
        this.f15378d = c1532z2;
        Preconditions.checkNotEmpty(str);
        this.f15375a = str;
        this.f15376b = c1532z2.b().r(G.f15543l1) ? new Bundle() : new Bundle();
    }

    private final String c(Bundle bundle) {
        C1463p2 c1463p2E;
        Class<?> cls;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    if (!C1195r7.a() || !this.f15378d.b().r(G.f15475J0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                        } else {
                            c1463p2E = this.f15378d.d().E();
                            cls = obj.getClass();
                            c1463p2E.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                        jSONArray.put(jSONObject);
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                        jSONArray.put(jSONObject);
                    } else {
                        if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            str = "ia";
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            str = "la";
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                        } else {
                            c1463p2E = this.f15378d.d().E();
                            cls = obj.getClass();
                            c1463p2E.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e7) {
                    this.f15378d.d().E().b("Cannot serialize bundle value to SharedPreferences", e7);
                }
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:9:0x0025, B:42:0x0091, B:42:0x0091, B:43:0x00a2, B:43:0x00a2, B:45:0x00a8, B:45:0x00a8, B:47:0x00b6, B:47:0x00b6, B:49:0x00c8, B:49:0x00c8, B:50:0x00d1, B:50:0x00d1, B:51:0x00d5, B:51:0x00d5, B:53:0x00db, B:53:0x00db, B:55:0x00e9, B:55:0x00e9, B:57:0x00fb, B:57:0x00fb, B:58:0x0104, B:58:0x0104, B:59:0x0108, B:59:0x0108, B:60:0x0114, B:60:0x0114, B:61:0x0120, B:61:0x0120, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:79:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle a() {
        byte b7;
        if (this.f15377c == null) {
            String string = this.f15378d.H().getString(this.f15375a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode == 100) {
                                if (string3.equals("d")) {
                                    b7 = 1;
                                }
                                if (b7 == 0) {
                                }
                            } else if (iHashCode == 108) {
                                if (string3.equals("l")) {
                                    b7 = 2;
                                }
                                if (b7 == 0) {
                                }
                            } else if (iHashCode == 115) {
                                if (string3.equals("s")) {
                                    b7 = 0;
                                }
                                if (b7 == 0) {
                                }
                            } else if (iHashCode != 3352) {
                                b7 = (iHashCode == 3445 && string3.equals("la")) ? (byte) 4 : (byte) -1;
                                if (b7 == 0) {
                                    bundle.putString(string2, jSONObject.getString("v"));
                                } else if (b7 == 1) {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                } else if (b7 == 2) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else if (b7 != 3) {
                                    if (b7 != 4) {
                                        this.f15378d.d().E().b("Unrecognized persisted bundle type. Type", string3);
                                    } else if (C1195r7.a() && this.f15378d.b().r(G.f15475J0)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                        int length = jSONArray2.length();
                                        long[] jArr = new long[length];
                                        for (int i8 = 0; i8 < length; i8++) {
                                            jArr[i8] = jSONArray2.optLong(i8);
                                        }
                                        bundle.putLongArray(string2, jArr);
                                    }
                                } else if (C1195r7.a() && this.f15378d.b().r(G.f15475J0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    int[] iArr = new int[length2];
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        iArr[i9] = jSONArray3.optInt(i9);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else {
                                if (string3.equals("ia")) {
                                    b7 = 3;
                                }
                                if (b7 == 0) {
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f15378d.d().E().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f15377c = bundle;
                } catch (JSONException unused2) {
                    this.f15378d.d().E().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f15377c == null) {
                this.f15377c = this.f15376b;
            }
        }
        return this.f15378d.b().r(G.f15543l1) ? new Bundle((Bundle) Preconditions.checkNotNull(this.f15377c)) : (Bundle) Preconditions.checkNotNull(this.f15377c);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        } else if (this.f15378d.b().r(G.f15543l1)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor editorEdit = this.f15378d.H().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f15375a);
        } else {
            editorEdit.putString(this.f15375a, c(bundle));
        }
        editorEdit.apply();
        this.f15377c = bundle;
    }
}
