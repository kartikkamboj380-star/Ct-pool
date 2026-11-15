package t2;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2057a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f22287q = C2058b.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22288m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f22289n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f22290o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f22291p;

    /* JADX INFO: renamed from: t2.a$a, reason: collision with other inner class name */
    class C0312a extends AbstractC2063g {
        C0312a() {
        }

        @Override // t2.InterfaceC2062f
        public void b(Object obj, InterfaceC2064h interfaceC2064h) {
            JSONObject jSONObject;
            synchronized (RunnableC2057a.this.f22290o) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e7) {
                        interfaceC2064h.b(e7.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { mode: string, filename: string }");
                    }
                    String strOptString = jSONObject.optString("mode");
                    if (strOptString == null) {
                        throw new Exception("missing params.mode");
                    }
                    String strOptString2 = jSONObject.optString("filename");
                    if (strOptString2 == null) {
                        throw new Exception("missing params.filename");
                    }
                    if (!strOptString.equals("r")) {
                        throw new IllegalArgumentException("unsupported mode: " + strOptString);
                    }
                    interfaceC2064h.a(Integer.valueOf(RunnableC2057a.this.c(strOptString2)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t2.a$b */
    class b extends AbstractC2063g {
        b() {
        }

        @Override // t2.InterfaceC2062f
        public void b(Object obj, InterfaceC2064h interfaceC2064h) {
            synchronized (RunnableC2057a.this.f22290o) {
                try {
                    try {
                    } catch (Exception e7) {
                        interfaceC2064h.b(e7.toString());
                    }
                    if (!(obj instanceof Number)) {
                        throw new Exception("params must be a file handle");
                    }
                    d dVar = (d) RunnableC2057a.this.f22290o.get(obj);
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    RunnableC2057a.this.f22290o.remove(obj);
                    dVar.a();
                    interfaceC2064h.a("");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t2.a$c */
    class c extends AbstractC2063g {
        c() {
        }

        @Override // t2.InterfaceC2062f
        public void b(Object obj, InterfaceC2064h interfaceC2064h) {
            JSONObject jSONObject;
            synchronized (RunnableC2057a.this.f22290o) {
                try {
                    try {
                        jSONObject = (JSONObject) obj;
                    } catch (Exception e7) {
                        interfaceC2064h.b(e7.toString());
                    }
                    if (jSONObject == null) {
                        throw new Exception("params must be an object { file: handle, size: number }");
                    }
                    int iOptInt = jSONObject.optInt("file");
                    if (iOptInt == 0) {
                        throw new Exception("invalid or missing file handle");
                    }
                    int iOptInt2 = jSONObject.optInt("size");
                    if (iOptInt2 == 0) {
                        throw new Exception("invalid or missing read size");
                    }
                    d dVar = (d) RunnableC2057a.this.f22290o.get(Integer.valueOf(iOptInt));
                    if (dVar == null) {
                        throw new Exception("invalid file handle, it might have timed out");
                    }
                    interfaceC2064h.a(dVar.d(iOptInt2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t2.a$d */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileInputStream f22295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f22296b = System.currentTimeMillis() + 30000;

        public d(String str) {
            this.f22295a = new FileInputStream(str);
        }

        private void c() {
            this.f22296b = System.currentTimeMillis() + 30000;
        }

        public void a() throws IOException {
            this.f22295a.close();
        }

        public boolean b() {
            return System.currentTimeMillis() >= this.f22296b;
        }

        public String d(int i7) {
            c();
            byte[] bArr = new byte[i7];
            return Base64.encodeToString(bArr, 0, this.f22295a.read(bArr), 0);
        }
    }

    public RunnableC2057a() {
        HashMap map = new HashMap();
        this.f22291p = map;
        map.put("fopen", new C0312a());
        map.put("fclose", new b());
        map.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(String str) {
        int i7 = this.f22288m;
        this.f22288m = i7 + 1;
        this.f22290o.put(Integer.valueOf(i7), new d(str));
        if (this.f22290o.size() == 1) {
            this.f22289n.postDelayed(this, 30000L);
        }
        return i7;
    }

    public Map d() {
        return this.f22291p;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f22290o) {
            Iterator it = this.f22290o.values().iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.b()) {
                    it.remove();
                    try {
                        dVar.a();
                    } catch (IOException e7) {
                        P0.a.j(f22287q, "closing expired file failed: " + e7.toString());
                    }
                }
            }
            if (!this.f22290o.isEmpty()) {
                this.f22289n.postDelayed(this, 30000L);
            }
        }
    }
}
