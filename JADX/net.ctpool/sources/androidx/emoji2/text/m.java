package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I.b f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f7919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f7920c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f7921d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f7922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f7923b;

        private a() {
            this(1);
        }

        a a(int i7) {
            SparseArray sparseArray = this.f7922a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i7);
        }

        final g b() {
            return this.f7923b;
        }

        void c(g gVar, int i7, int i8) {
            a aVarA = a(gVar.b(i7));
            if (aVarA == null) {
                aVarA = new a();
                this.f7922a.put(gVar.b(i7), aVarA);
            }
            if (i8 > i7) {
                aVarA.c(gVar, i7 + 1, i8);
            } else {
                aVarA.f7923b = gVar;
            }
        }

        a(int i7) {
            this.f7922a = new SparseArray(i7);
        }
    }

    private m(Typeface typeface, I.b bVar) {
        this.f7921d = typeface;
        this.f7918a = bVar;
        this.f7919b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(I.b bVar) {
        int iK = bVar.k();
        for (int i7 = 0; i7 < iK; i7++) {
            g gVar = new g(this, i7);
            Character.toChars(gVar.f(), this.f7919b, i7 * 2);
            h(gVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.o.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            androidx.core.os.o.b();
        }
    }

    public char[] c() {
        return this.f7919b;
    }

    public I.b d() {
        return this.f7918a;
    }

    int e() {
        return this.f7918a.l();
    }

    a f() {
        return this.f7920c;
    }

    Typeface g() {
        return this.f7921d;
    }

    void h(g gVar) {
        androidx.core.util.f.g(gVar, "emoji metadata cannot be null");
        androidx.core.util.f.a(gVar.c() > 0, "invalid metadata codepoint length");
        this.f7920c.c(gVar, 0, gVar.c() - 1);
    }
}
