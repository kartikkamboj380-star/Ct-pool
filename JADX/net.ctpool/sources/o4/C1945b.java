package o4;

import S2.h;
import U2.u;
import android.content.Context;
import h4.D;
import h4.Q;
import java.nio.charset.Charset;
import k4.F;
import l4.j;
import z3.AbstractC2272l;

/* JADX INFO: renamed from: o4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1945b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f21460c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21461d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f21462e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f21463f = new h() { // from class: o4.a
        @Override // S2.h
        public final Object apply(Object obj) {
            return C1945b.d((F) obj);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f21464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f21465b;

    C1945b(e eVar, h hVar) {
        this.f21464a = eVar;
        this.f21465b = hVar;
    }

    public static C1945b b(Context context, p4.j jVar, Q q6) {
        u.f(context);
        S2.j jVarG = u.c().g(new com.google.android.datatransport.cct.a(f21461d, f21462e));
        S2.c cVarB = S2.c.b("json");
        h hVar = f21463f;
        return new C1945b(new e(jVarG.a("FIREBASE_CRASHLYTICS_REPORT", F.class, cVarB, hVar), jVar.b(), q6), hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(F f7) {
        return f21460c.M(f7).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }

    public AbstractC2272l c(D d7, boolean z6) {
        return this.f21464a.i(d7, z6).a();
    }
}
