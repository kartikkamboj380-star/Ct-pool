package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.ndk.f;
import java.io.File;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
class g implements e4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f17455a;

    g(f fVar) {
        this.f17455a = fVar;
    }

    @Override // e4.h
    public File a() {
        return this.f17455a.f17443e;
    }

    @Override // e4.h
    public File b() {
        return this.f17455a.f17445g;
    }

    @Override // e4.h
    public File c() {
        return this.f17455a.f17444f;
    }

    @Override // e4.h
    public F.a d() {
        f.c cVar = this.f17455a.f17439a;
        if (cVar != null) {
            return cVar.f17454b;
        }
        return null;
    }

    @Override // e4.h
    public File e() {
        return this.f17455a.f17439a.f17453a;
    }

    @Override // e4.h
    public File f() {
        return this.f17455a.f17442d;
    }

    @Override // e4.h
    public File g() {
        return this.f17455a.f17441c;
    }
}
