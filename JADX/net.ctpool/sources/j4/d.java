package j4;

import e4.C1629g;
import h4.AbstractC1721j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20355a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20357c;

    public d(int i7, int i8) {
        this.f20356b = i7;
        this.f20357c = i8;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f20357c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i7) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i7 ? strTrim.substring(0, i7) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f20355a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f20355a.size() >= this.f20356b && !this.f20355a.containsKey(strB)) {
            C1629g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f20356b);
            return false;
        }
        String strC = c(str2, this.f20357c);
        if (AbstractC1721j.y((String) this.f20355a.get(strB), strC)) {
            return false;
        }
        Map map = this.f20355a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i7 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f20355a.size() < this.f20356b || this.f20355a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f20355a.put(strB, str == null ? "" : c(str, this.f20357c));
                } else {
                    i7++;
                }
            }
            if (i7 > 0) {
                C1629g.f().k("Ignored " + i7 + " entries when adding custom keys. Maximum allowable: " + this.f20356b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
