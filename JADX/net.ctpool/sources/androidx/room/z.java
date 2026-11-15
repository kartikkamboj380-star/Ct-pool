package androidx.room;

import Z.h;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class z implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f9078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f9079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h.c f9080d;

    public z(String str, File file, Callable callable, h.c cVar) {
        w5.k.f(cVar, "mDelegate");
        this.f9077a = str;
        this.f9078b = file;
        this.f9079c = callable;
        this.f9080d = cVar;
    }

    @Override // Z.h.c
    public Z.h a(h.b bVar) {
        w5.k.f(bVar, "configuration");
        return new y(bVar.f4620a, this.f9077a, this.f9078b, this.f9079c, bVar.f4622c.f4618a, this.f9080d.a(bVar));
    }
}
