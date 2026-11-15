package m4;

import e4.C1629g;
import i4.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: m4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1881a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21255c = new HashMap();

    public C1881a(String str, Map map) {
        this.f21253a = str;
        this.f21254b = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
    
        if (r1.getValue() != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (r7.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        if (r1.getValue() == null) goto L5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
    }

    private String b(String str, Map map) throws UnsupportedEncodingException {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    private String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i7 = bufferedReader.read(cArr);
            if (i7 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i7);
        }
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        f.d();
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.f21253a, this.f21254b);
            C1629g.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f21255c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, strE);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public C1881a d(String str, String str2) {
        this.f21255c.put(str, str2);
        return this;
    }
}
