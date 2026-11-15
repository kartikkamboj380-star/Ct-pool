package com.google.android.datatransport.cct;

import U2.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f13451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f13452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f13453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f13454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f13455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13456h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13458b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13451c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f13452d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13453e = strA3;
        f13454f = Collections.unmodifiableSet(new HashSet(Arrays.asList(S2.c.b("proto"), S2.c.b("json"))));
        f13455g = new a(strA, null);
        f13456h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f13457a = str;
        this.f13458b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // U2.g
    public Set a() {
        return f13454f;
    }

    public byte[] b() {
        String str = this.f13458b;
        if (str == null && this.f13457a == null) {
            return null;
        }
        String str2 = this.f13457a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f13458b;
    }

    public String e() {
        return this.f13457a;
    }

    @Override // U2.f
    public byte[] getExtras() {
        return b();
    }

    @Override // U2.f
    public String getName() {
        return "cct";
    }
}
