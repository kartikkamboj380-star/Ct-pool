package q2;

import android.content.Context;
import android.os.Build;
import com.facebook.react.AbstractC0832o;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1988a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21874a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f21875b;

    public static String a(Context context) {
        return b(c(context));
    }

    public static String b(Integer num) {
        return "adb reverse tcp:" + num + " tcp:" + num;
    }

    private static Integer c(Context context) {
        return Integer.valueOf(context.getResources().getInteger(AbstractC0832o.f11997a));
    }

    public static String d() {
        if (h()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:55|9)|(3:65|10|11)|(8:61|12|(1:14)(1:67)|54|20|39|40|41)|15|52|16|54|20|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (r2 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized String e() {
        BufferedReader bufferedReader;
        Throwable th;
        Process processExec;
        Exception e7;
        String str;
        String str2 = f21875b;
        if (str2 != null) {
            return str2;
        }
        try {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            bufferedReader = null;
            e7 = e8;
            processExec = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            processExec = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
            str = "";
        } catch (Exception e9) {
            bufferedReader = null;
            e7 = e9;
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception unused) {
                }
            }
            if (processExec == null) {
                throw th;
            }
            processExec.destroy();
            throw th;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = line;
            } catch (Exception e10) {
                e7 = e10;
                P0.a.H(f21874a, "Failed to query for metro.host prop:", e7);
                f21875b = "";
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            processExec.destroy();
            return f21875b;
        }
        f21875b = str;
        bufferedReader.close();
        processExec.destroy();
        return f21875b;
    }

    public static String f(Context context) {
        return g(c(context).intValue());
    }

    private static String g(int i7) {
        String strE = e();
        if (strE.equals("")) {
            strE = h() ? "10.0.3.2" : i() ? "10.0.2.2" : "localhost";
        }
        return String.format(Locale.US, "%s:%d", strE, Integer.valueOf(i7));
    }

    private static boolean h() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean i() {
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.startsWith("google/sdk_gphone");
    }
}
