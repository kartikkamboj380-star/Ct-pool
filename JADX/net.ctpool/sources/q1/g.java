package q1;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ULocale f21853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ULocale.Builder f21854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21855c;

    private g(ULocale uLocale) {
        this.f21854b = null;
        this.f21855c = false;
        this.f21853a = uLocale;
    }

    public static b i() {
        return new g(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b j(String str) {
        return new g(str);
    }

    public static b k(ULocale uLocale) {
        return new g(uLocale);
    }

    private void l() throws e {
        if (this.f21855c) {
            try {
                this.f21853a = this.f21854b.build();
                this.f21855c = false;
            } catch (RuntimeException e7) {
                throw new e(e7.getMessage());
            }
        }
    }

    @Override // q1.b
    public String a() {
        return h().toLanguageTag();
    }

    @Override // q1.b
    public HashMap b() throws e {
        l();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f21853a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(h.b(next), this.f21853a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // q1.b
    public ArrayList c(String str) throws e {
        l();
        String strA = h.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f21853a.getKeywordValue(strA);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // q1.b
    public b e() throws e {
        l();
        return new g(this.f21853a);
    }

    @Override // q1.b
    public String f() {
        return d().toLanguageTag();
    }

    @Override // q1.b
    public void g(String str, ArrayList arrayList) throws e {
        l();
        if (this.f21854b == null) {
            this.f21854b = new ULocale.Builder().setLocale(this.f21853a);
        }
        try {
            this.f21854b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f21855c = true;
        } catch (RuntimeException e7) {
            throw new e(e7.getMessage());
        }
    }

    @Override // q1.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale h() throws e {
        l();
        return this.f21853a;
    }

    @Override // q1.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public ULocale d() throws e {
        l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f21853a);
        builder.clearExtensions();
        return builder.build();
    }

    private g(String str) throws e {
        this.f21853a = null;
        this.f21854b = null;
        this.f21855c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f21854b = builder;
        try {
            builder.setLanguageTag(str);
            this.f21855c = true;
        } catch (RuntimeException e7) {
            throw new e(e7.getMessage());
        }
    }
}
