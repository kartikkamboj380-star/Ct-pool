package j6;

import java.security.MessageDigest;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageDigest f20434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20435b;

        a(String str) {
            this.f20435b = str;
            this.f20434a = MessageDigest.getInstance(str);
        }

        @Override // j6.c
        public byte[] a() {
            return this.f20434a.digest();
        }

        @Override // j6.c
        public void b(byte[] bArr, int i7, int i8) {
            k.f(bArr, "input");
            this.f20434a.update(bArr, i7, i8);
        }
    }

    public static final c a(String str) {
        k.f(str, "algorithm");
        return new a(str);
    }
}
