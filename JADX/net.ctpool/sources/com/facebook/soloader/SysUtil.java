package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class SysUtil {

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    @f
    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @f
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j7) throws IOException {
            int i7;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j7);
            } catch (ErrnoException e7) {
                if (e7.errno != OsConstants.EOPNOTSUPP && (i7 = e7.errno) != OsConstants.ENOSYS && i7 != OsConstants.EINVAL) {
                    throw new IOException(e7.toString(), e7);
                }
            }
        }

        @f
        public static String[] getSupportedAbis() {
            String str;
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add("arm64-v8a");
                    str = "x86_64";
                } else {
                    treeSet.add("armeabi-v7a");
                    str = "x86";
                }
                treeSet.add(str);
                ArrayList arrayList = new ArrayList();
                for (String str2 : strArr) {
                    if (treeSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e7) {
                m.b("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e7.errno), e7.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @f
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    @f
    private static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        public static boolean a(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean b(Context context, int i7) {
            if (i7 == 2) {
                return true;
            }
            return a(context);
        }

        @f
        public static String[] getSupportedAbis() {
            String str;
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                str = "x86_64";
            } else {
                treeSet.add("armeabi-v7a");
                str = "x86";
            }
            treeSet.add(str);
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArr) {
                if (treeSet.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @f
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i7, byte[] bArr) throws IOException {
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, 0, Math.min(bArr.length, i7 - i8));
            if (i9 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, i9);
            i8 += i9;
        }
        return i8;
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            m.b("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void c(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                b(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b((File) arrayList.get(size));
        }
    }

    public static void d(FileDescriptor fileDescriptor, long j7) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j7);
    }

    public static int e(String[] strArr, String str) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str2 = strArr[i7];
            if (str2 != null && str.equals(str2)) {
                return i7;
            }
        }
        return -1;
    }

    public static void f(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    m.b("SysUtil", "Syncing failed for " + file2 + ": " + e7.getMessage());
                }
            }
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    @f
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
            } catch (Exception e7) {
                m.c("SysUtil", "Cannot call getLdLibraryPath", e7);
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    @f
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e7) {
            m.h("SysUtil", "Cannot get nativeLoad method", e7);
            return null;
        }
    }

    public static l h(File file) {
        return l.a(file);
    }

    public static l i(File file, File file2) throws Throwable {
        boolean z6;
        try {
            return h(file2);
        } catch (FileNotFoundException e7) {
            z6 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e7;
                }
                l lVarH = h(file2);
                if (!file.setWritable(false)) {
                    m.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                return lVarH;
            } catch (Throwable th) {
                th = th;
                if (z6 && !file.setWritable(false)) {
                    m.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z6 = false;
            if (z6) {
                m.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String[] j() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    public static boolean k() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean l(Context context, int i7) {
        return MarshmallowSysdeps.b(context, i7);
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    public static void n(File file) throws IOException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
