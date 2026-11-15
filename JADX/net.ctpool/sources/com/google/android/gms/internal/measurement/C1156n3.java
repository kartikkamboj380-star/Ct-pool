package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156n3 {

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n3$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile U3.g f14748a;

        public static U3.g a(Context context) {
            U3.g gVarA;
            U3.g gVar = f14748a;
            if (gVar == null) {
                synchronized (a.class) {
                    try {
                        gVar = f14748a;
                        if (gVar == null) {
                            new C1156n3();
                            if (AbstractC1191r3.c(Build.TYPE, Build.TAGS)) {
                                if (Z2.a() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                gVarA = C1156n3.a(context);
                            } else {
                                gVarA = U3.g.a();
                            }
                            f14748a = gVarA;
                            gVar = gVarA;
                        }
                    } finally {
                    }
                }
            }
            return gVar;
        }
    }

    static U3.g a(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            U3.g gVarD = d(context);
            U3.g gVarD2 = gVarD.c() ? U3.g.d(b(context, (File) gVarD.b())) : U3.g.a();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return gVarD2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static InterfaceC1165o3 b(Context context, File file) {
        BufferedReader bufferedReader;
        n.g gVar;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                gVar = new n.g();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                C1084f3 c1084f3 = new C1084f3(gVar);
                bufferedReader.close();
                return c1084f3;
            }
            String[] strArrSplit = line.split(" ", 3);
            if (strArrSplit.length != 3) {
                Log.e("HermeticFileOverrides", "Invalid: " + line);
            } else {
                String strC = c(strArrSplit[0]);
                String strDecode = Uri.decode(c(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String strC2 = c(strArrSplit[2]);
                    strDecode2 = Uri.decode(strC2);
                    if (strDecode2.length() < 1024 || strDecode2 == strC2) {
                        map.put(strC2, strDecode2);
                    }
                }
                n.g gVar2 = (n.g) gVar.get(strC);
                if (gVar2 == null) {
                    gVar2 = new n.g();
                    gVar.put(strC, gVar2);
                }
                gVar2.put(strDecode, strDecode2);
            }
            throw new RuntimeException(e7);
        }
    }

    private static final String c(String str) {
        return new String(str);
    }

    private static U3.g d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? U3.g.d(file) : U3.g.a();
        } catch (RuntimeException e7) {
            Log.e("HermeticFileOverrides", "no data dir", e7);
            return U3.g.a();
        }
    }
}
