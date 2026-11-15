package T5;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3598a = new o();

    private o() {
    }

    public static final String a(String str, String str2, Charset charset) {
        w5.k.f(str, "username");
        w5.k.f(str2, "password");
        w5.k.f(charset, "charset");
        return "Basic " + i6.i.f20019q.c(str + ':' + str2, charset).e();
    }
}
