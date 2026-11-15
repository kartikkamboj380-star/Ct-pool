package j4;

import e4.C1629g;
import h4.AbstractC1721j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n4.C1928g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f20361b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1928g f20362a;

    class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20363a;

        a(String str) throws JSONException {
            this.f20363a = str;
            put("userId", str);
        }
    }

    public f(C1928g c1928g) {
        this.f20362a = c1928g;
    }

    private static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, o(jSONObject, next));
        }
        return map;
    }

    private static List f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            String string = jSONArray.getString(i7);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e7) {
                C1629g.f().l("Failed de-serializing rollouts state. " + string, e7);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return o(new JSONObject(str), "userId");
    }

    private static String h(Map map) {
        return new JSONObject(map).toString();
    }

    private static String l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            try {
                jSONArray.put(new JSONObject(i.f20389a.b(list.get(i7))));
            } catch (JSONException e7) {
                C1629g.f().l("Exception parsing rollout assignment!", e7);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            C1629g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String n(String str) {
        return new a(str).toString();
    }

    private static String o(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f20362a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f20362a.q(str, "keys");
    }

    public File c(String str) {
        return this.f20362a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f20362a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    Map i(String str, boolean z6) throws Throwable {
        FileInputStream fileInputStream;
        Exception e7;
        File fileA = z6 ? a(str) : b(str);
        if (fileA.exists()) {
            ?? length = fileA.length();
            if (length != 0) {
                ?? r8 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileA);
                        try {
                            Map mapE = e(AbstractC1721j.A(fileInputStream));
                            AbstractC1721j.f(fileInputStream, "Failed to close user metadata file.");
                            return mapE;
                        } catch (Exception e8) {
                            e7 = e8;
                            C1629g.f().l("Error deserializing user metadata.", e7);
                            m(fileA);
                            AbstractC1721j.f(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        r8 = length;
                        AbstractC1721j.f(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e9) {
                    fileInputStream = null;
                    e7 = e9;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC1721j.f(r8, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m(fileA);
        return Collections.emptyMap();
    }

    public List j(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            m(fileC);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileC);
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List listF = f(AbstractC1721j.A(fileInputStream));
            C1629g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
            AbstractC1721j.f(fileInputStream, "Failed to close rollouts state file.");
            return listF;
        } catch (Exception e8) {
            e = e8;
            fileInputStream2 = fileInputStream;
            C1629g.f().l("Error deserializing rollouts state.", e);
            m(fileC);
            AbstractC1721j.f(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.emptyList();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            AbstractC1721j.f(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            C1629g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(AbstractC1721j.A(fileInputStream));
                    C1629g.f().b("Loaded userId " + strG + " for session " + str);
                    AbstractC1721j.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e7) {
                    e = e7;
                    C1629g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    AbstractC1721j.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                AbstractC1721j.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC1721j.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void p(String str, Map map) throws Throwable {
        q(str, map, false);
    }

    public void q(String str, Map map, boolean z6) throws Throwable {
        String strH;
        BufferedWriter bufferedWriter;
        File fileA = z6 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strH = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f20361b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            bufferedWriter.write(strH);
            bufferedWriter.flush();
            AbstractC1721j.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            C1629g.f().l("Error serializing key/value metadata.", e);
            m(fileA);
            AbstractC1721j.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1721j.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public void r(String str, List list) throws Throwable {
        String strL;
        BufferedWriter bufferedWriter;
        File fileC = c(str);
        if (list.isEmpty()) {
            m(fileC);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f20361b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e7) {
            e = e7;
        }
        try {
            bufferedWriter.write(strL);
            bufferedWriter.flush();
            AbstractC1721j.f(bufferedWriter, "Failed to close rollouts state file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            C1629g.f().l("Error serializing rollouts state.", e);
            m(fileC);
            AbstractC1721j.f(bufferedWriter2, "Failed to close rollouts state file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1721j.f(bufferedWriter2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void s(String str, String str2) throws Throwable {
        String strN;
        BufferedWriter bufferedWriter;
        File fileD = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strN = n(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f20361b));
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(strN);
            bufferedWriter.flush();
            AbstractC1721j.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            C1629g.f().l("Error serializing user metadata.", e);
            AbstractC1721j.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC1721j.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
