package com.google.android.gms.internal.auth;

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

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile S f14049a;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x001c, TryCatch #5 {all -> 0x001c, all -> 0x0067, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0013, B:18:0x0030, B:74:0x0175, B:13:0x001f, B:15:0x0027, B:20:0x0037, B:22:0x003d, B:24:0x0043, B:25:0x0047, B:73:0x0170, B:75:0x0178, B:76:0x017b, B:77:0x017c, B:26:0x004b, B:28:0x004f, B:29:0x005c, B:31:0x0062, B:37:0x0078, B:39:0x007e, B:40:0x0082, B:60:0x0141, B:61:0x0144, B:69:0x0165, B:68:0x0150, B:70:0x0166, B:71:0x016b, B:72:0x016c, B:34:0x006a, B:36:0x0070), top: B:90:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static S a(Context context) {
        S s6;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        S sC;
        File file;
        synchronized (AbstractC1019y.class) {
            try {
                s6 = f14049a;
                if (s6 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (str.equals("eng") || str.equals("userdebug")) {
                        if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                            if (AbstractC0984m.b() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            StrictMode.allowThreadDiskWrites();
                            try {
                                file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            } catch (RuntimeException e7) {
                                Log.e("HermeticFileOverrides", "no data dir", e7);
                            }
                            S sD = file.exists() ? S.d(file) : S.c();
                            if (sD.b()) {
                                Object objA = sD.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objA)));
                                    try {
                                        n.g gVar = new n.g();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", "Invalid: " + line);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!gVar.containsKey(str3)) {
                                                    gVar.put(str3, new n.g());
                                                }
                                                ((n.g) gVar.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        Log.w("HermeticFileOverrides", "Parsed " + objA.toString() + " for Android package " + context.getPackageName());
                                        r rVar = new r(gVar);
                                        bufferedReader.close();
                                        sC = S.d(rVar);
                                    } finally {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                } catch (IOException e8) {
                                    throw new RuntimeException(e8);
                                }
                            } else {
                                sC = S.c();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } else {
                            sC = S.c();
                        }
                        s6 = sC;
                        f14049a = s6;
                    }
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return s6;
    }
}
