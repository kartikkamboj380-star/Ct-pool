package r3;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f22135a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f22135a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
