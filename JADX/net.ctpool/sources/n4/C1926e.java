package n4;

import e4.C1629g;
import h4.C1725n;
import h4.D;
import j4.n;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import k4.F;
import l4.j;

/* JADX INFO: renamed from: n4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1926e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f21416e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21417f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f21418g = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f21419h = new Comparator() { // from class: n4.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1926e.u((File) obj, (File) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f21420i = new FilenameFilter() { // from class: n4.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C1926e.v(file, str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f21421a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1928g f21422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p4.j f21423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1725n f21424d;

    public C1926e(C1928g c1928g, p4.j jVar, C1725n c1725n) {
        this.f21422b = c1928g;
        this.f21423c = jVar;
        this.f21424d = c1725n;
    }

    private static String A(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i7 = fileInputStream.read(bArr);
                if (i7 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f21416e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String strD = this.f21424d.d(str);
        try {
            j jVar = f21418g;
            F(this.f21422b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e7) {
            C1629g.f().l("Could not synthesize final native report file for " + file, e7);
        }
    }

    private void C(String str, long j7) {
        boolean z6;
        List<File> listR = this.f21422b.r(str, f21420i);
        if (listR.isEmpty()) {
            C1629g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z6 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f21418g.j(A(file)));
                } catch (IOException e7) {
                    C1629g.f().l("Could not add event to report for " + file, e7);
                }
                if (z6 || s(file.getName())) {
                    z6 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f21422b.q(str, "report"), arrayList, j7, z6, n.l(str, this.f21422b), this.f21424d.d(str));
        } else {
            C1629g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(File file, List list, long j7, boolean z6, String str, String str2) {
        try {
            j jVar = f21418g;
            F fR = jVar.L(A(file)).v(j7, z6, str).p(str2).r(list);
            F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            C1629g.f().b("appQualitySessionId: " + str2);
            F(z6 ? this.f21422b.l(eVarN.i()) : this.f21422b.n(eVarN.i()), jVar.M(fR));
        } catch (IOException e7) {
            C1629g.f().l("Could not synthesize final report file for " + file, e7);
        }
    }

    private int E(String str, int i7) {
        List listR = this.f21422b.r(str, new FilenameFilter() { // from class: n4.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return C1926e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: n4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1926e.x((File) obj, (File) obj2);
            }
        });
        return f(listR, i7);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f21416e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j7) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f21416e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j7));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet e(String str) {
        this.f21422b.d();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() <= 8) {
            return sortedSetP;
        }
        while (sortedSetP.size() > 8) {
            String str2 = (String) sortedSetP.last();
            C1629g.f().b("Removing session over cap: " + str2);
            this.f21422b.e(str2);
            sortedSetP.remove(str2);
        }
        return sortedSetP;
    }

    private static int f(List list, int i7) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i7) {
                return size;
            }
            C1928g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i7 = this.f21423c.b().f21618a.f21630b;
        List listN = n();
        int size = listN.size();
        if (size <= i7) {
            return;
        }
        Iterator it = listN.subList(i7, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j7) {
        return j7 * 1000;
    }

    private void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String m(int i7, boolean z6) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i7)) + (z6 ? "_" : "");
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f21422b.m());
        arrayList.addAll(this.f21422b.j());
        Comparator comparator = f21419h;
        Collections.sort(arrayList, comparator);
        List listO = this.f21422b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f21417f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f21422b.o());
        j(this.f21422b.m());
        j(this.f21422b.j());
    }

    public void k(String str, long j7) {
        for (String str2 : e(str)) {
            C1629g.f().i("Finalizing report for session " + str2);
            C(str2, j7);
            this.f21422b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File fileQ = this.f21422b.q(str, "report");
        C1629g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        B(fileQ, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f21422b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f21422b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f21422b.o().isEmpty() && this.f21422b.m().isEmpty() && this.f21422b.j().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(D.a(f21418g.L(A(file)), file.getName(), file));
            } catch (IOException e7) {
                C1629g.f().l("Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z6) {
        int i7 = this.f21423c.b().f21618a.f21629a;
        try {
            F(this.f21422b.q(str, m(this.f21421a.getAndIncrement(), z6)), f21418g.k(dVar));
        } catch (IOException e7) {
            C1629g.f().l("Could not persist event for session " + str, e7);
        }
        E(str, i7);
    }

    public void z(F f7) {
        F.e eVarN = f7.n();
        if (eVarN == null) {
            C1629g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            F(this.f21422b.q(strI, "report"), f21418g.M(f7));
            G(this.f21422b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e7) {
            C1629g.f().c("Could not persist report for session " + strI, e7);
        }
    }
}
