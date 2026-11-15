package l3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f21096c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f21097d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f21098a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f21099b;

    c(Context context) {
        this.f21099b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = f21096c;
        lock.lock();
        try {
            if (f21097d == null) {
                f21097d = new c(context.getApplicationContext());
            }
            c cVar = f21097d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f21096c.unlock();
            throw th;
        }
    }

    private static final String k(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f21098a.lock();
        try {
            this.f21099b.edit().clear().apply();
        } finally {
            this.f21098a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(k("googleSignInAccount", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.n1(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(k("googleSignInOptions", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.j1(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.o1());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strO1 = googleSignInAccount.o1();
        j(k("googleSignInAccount", strO1), googleSignInAccount.p1());
        j(k("googleSignInOptions", strO1), googleSignInOptions.n1());
    }

    protected final String g(String str) {
        this.f21098a.lock();
        try {
            return this.f21099b.getString(str, null);
        } finally {
            this.f21098a.unlock();
        }
    }

    protected final void h(String str) {
        this.f21098a.lock();
        try {
            this.f21099b.edit().remove(str).apply();
        } finally {
            this.f21098a.unlock();
        }
    }

    public final void i() {
        String strG = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        h(k("googleSignInAccount", strG));
        h(k("googleSignInOptions", strG));
    }

    protected final void j(String str, String str2) {
        this.f21098a.lock();
        try {
            this.f21099b.edit().putString(str, str2).apply();
        } finally {
            this.f21098a.unlock();
        }
    }
}
