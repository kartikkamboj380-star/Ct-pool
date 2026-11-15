package T5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: T5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0462h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3433b;

    public C0462h(String str, Map map) {
        String lowerCase;
        w5.k.f(str, "scheme");
        w5.k.f(map, "authParams");
        this.f3433b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                w5.k.e(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                w5.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        w5.k.e(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f3432a = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f3432a.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                w5.k.e(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        w5.k.e(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return (String) this.f3432a.get("realm");
    }

    public final String c() {
        return this.f3433b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0462h) {
            C0462h c0462h = (C0462h) obj;
            if (w5.k.b(c0462h.f3433b, this.f3433b) && w5.k.b(c0462h.f3432a, this.f3432a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f3433b.hashCode()) * 31) + this.f3432a.hashCode();
    }

    public String toString() {
        return this.f3433b + " authParams=" + this.f3432a;
    }
}
