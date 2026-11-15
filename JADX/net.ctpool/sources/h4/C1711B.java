package h4;

import e4.C1629g;
import java.io.File;
import java.io.IOException;
import n4.C1928g;

/* JADX INFO: renamed from: h4.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1711B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1928g f19651b;

    public C1711B(String str, C1928g c1928g) {
        this.f19650a = str;
        this.f19651b = c1928g;
    }

    private File b() {
        return this.f19651b.g(this.f19650a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e7) {
            C1629g.f().e("Error creating marker: " + this.f19650a, e7);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
