package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.ndk.f;
import e4.C1629g;
import h4.AbstractC1721j;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import k4.F;
import k4.G;
import n4.C1928g;
import r0.AbstractC2015f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f17425d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f17427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1928g f17428c;

    a(Context context, e eVar, C1928g c1928g) {
        this.f17426a = context;
        this.f17427b = eVar;
        this.f17428c = c1928g;
    }

    private static F.a a(ApplicationExitInfo applicationExitInfo) {
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(i(applicationExitInfo)).a();
    }

    public static String b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    private F.a c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f(str);
        }
        return null;
    }

    private f.c e(String str, File file) {
        return new f.c(h(file, ".dmp"), c(str));
    }

    private F.a f(String str) {
        List historicalProcessExitReasons = ((ActivityManager) this.f17426a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File fileQ = this.f17428c.q(str, "start-time");
        return g(fileQ == null ? System.currentTimeMillis() : fileQ.lastModified(), historicalProcessExitReasons);
    }

    private F.a g(long j7, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = AbstractC2015f.a(it.next());
            if (applicationExitInfoA.getReason() == 5 && applicationExitInfoA.getTimestamp() >= j7) {
                arrayList.add(applicationExitInfoA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a(AbstractC2015f.a(arrayList.get(0)));
    }

    private static File h(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static String i(ApplicationExitInfo applicationExitInfo) {
        try {
            return b(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            C1629g.f().k("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void o(C1928g c1928g, String str, String str2, String str3) throws Throwable {
        q(new File(c1928g.k(str), str3), str2);
    }

    private static void q(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f17425d));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            AbstractC1721j.f(bufferedWriter, "Failed to close " + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            AbstractC1721j.f(bufferedWriter2, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1721j.f(bufferedWriter2, "Failed to close " + file);
            throw th;
        }
    }

    private static String r(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public f d(String str) {
        File fileK = this.f17428c.k(str);
        File file = new File(fileK, "pending");
        C1629g.f().i("Minidump directory: " + file.getAbsolutePath());
        File fileH = h(file, ".dmp");
        C1629g c1629gF = C1629g.f();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((fileH == null || !fileH.exists()) ? "does not exist" : "exists");
        c1629gF.i(sb.toString());
        f.b bVar = new f.b();
        if (fileK != null && fileK.exists() && file.exists()) {
            bVar.l(e(str, file)).k(h(fileK, ".device_info")).n(new File(fileK, "session.json")).h(new File(fileK, "app.json")).j(new File(fileK, "device.json")).m(new File(fileK, "os.json"));
        }
        return bVar.i();
    }

    public boolean j(String str) {
        f.c cVar = d(str).f17439a;
        return cVar != null && cVar.a();
    }

    public boolean k(String str, String str2, long j7, G g7) throws Throwable {
        File fileK = this.f17428c.k(str);
        if (fileK == null) {
            return false;
        }
        try {
            if (!this.f17427b.a(fileK.getCanonicalPath(), this.f17426a.getAssets())) {
                return false;
            }
            l(str, str2, j7);
            m(str, g7.a());
            p(str, g7.d());
            n(str, g7.c());
            return true;
        } catch (IOException e7) {
            C1629g.f().e("Error initializing Crashlytics NDK", e7);
            return false;
        }
    }

    public void l(String str, String str2, long j7) throws Throwable {
        o(this.f17428c, str, h.b(str, str2, j7), "session.json");
    }

    public void m(String str, G.a aVar) throws Throwable {
        o(this.f17428c, str, h.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), "app.json");
    }

    public void n(String str, G.b bVar) throws Throwable {
        o(this.f17428c, str, h.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), "device.json");
    }

    public void p(String str, G.c cVar) throws Throwable {
        o(this.f17428c, str, h.e(cVar.d(), cVar.c(), cVar.b()), "os.json");
    }
}
