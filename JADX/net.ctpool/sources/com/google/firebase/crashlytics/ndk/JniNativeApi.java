package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import e4.C1629g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class JniNativeApi implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f17422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FilenameFilter f17423c = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return JniNativeApi.g(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17424a;

    static {
        boolean z6;
        try {
            System.loadLibrary("crashlytics");
            z6 = true;
        } catch (UnsatisfiedLinkError e7) {
            C1629g.f().d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e7.getLocalizedMessage());
            z6 = false;
        }
        f17422b = z6;
    }

    public JniNativeApi(Context context) {
        this.f17424a = context;
    }

    public static void c(List list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", e(packageInfo)));
        if (!file.exists()) {
            C1629g.f().b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = file.listFiles(f17423c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        C1629g.f().b("Found " + fileArrListFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : fileArrListFiles) {
            C1629g.f().b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    private static int d() {
        return 9216;
    }

    private static String e(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.e
    public boolean a(String str, AssetManager assetManager) {
        String[] strArrH = h(Build.CPU_ABI);
        if (strArrH.length < 2) {
            return false;
        }
        return f17422b && nativeInit(new String[]{strArrH[0], strArrH[1], str}, assetManager);
    }

    public String[] h(String str) {
        String path;
        try {
            PackageInfo packageInfo = this.f17424a.getPackageManager().getPackageInfo(this.f17424a.getPackageName(), d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (f()) {
                c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    path = new File(parentFile, "arm64").getPath();
                } else if (str.startsWith("arm")) {
                    path = new File(parentFile, "arm").getPath();
                }
                arrayList2.add(path);
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e7) {
            C1629g.f().e("Unable to compose package paths", e7);
            throw new RuntimeException(e7);
        }
    }
}
