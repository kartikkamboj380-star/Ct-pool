package h4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import e4.C1628f;
import java.util.List;

/* JADX INFO: renamed from: h4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1713b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1628f f19715h;

    public C1713b(String str, String str2, List list, String str3, String str4, String str5, String str6, C1628f c1628f) {
        this.f19708a = str;
        this.f19709b = str2;
        this.f19710c = list;
        this.f19711d = str3;
        this.f19712e = str4;
        this.f19713f = str5;
        this.f19714g = str6;
        this.f19715h = c1628f;
    }

    public static C1713b a(Context context, L l7, String str, String str2, List list, C1628f c1628f) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = l7.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1713b(str, str2, list, strG, packageName, strB, str3, c1628f);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
