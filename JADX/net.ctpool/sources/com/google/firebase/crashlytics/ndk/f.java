package com.google.firebase.crashlytics.ndk;

import java.io.File;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f17440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f17441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f17442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f17443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f17444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f17445g;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f17446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f17447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f17448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f17449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private File f17450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private File f17451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private File f17452g;

        b() {
        }

        b h(File file) {
            this.f17450e = file;
            return this;
        }

        f i() {
            return new f(this);
        }

        b j(File file) {
            this.f17451f = file;
            return this;
        }

        b k(File file) {
            this.f17448c = file;
            return this;
        }

        b l(c cVar) {
            this.f17446a = cVar;
            return this;
        }

        b m(File file) {
            this.f17452g = file;
            return this;
        }

        b n(File file) {
            this.f17449d = file;
            return this;
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f17453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final F.a f17454b;

        c(File file, F.a aVar) {
            this.f17453a = file;
            this.f17454b = aVar;
        }

        boolean a() {
            File file = this.f17453a;
            return (file != null && file.exists()) || this.f17454b != null;
        }
    }

    private f(b bVar) {
        this.f17439a = bVar.f17446a;
        this.f17440b = bVar.f17447b;
        this.f17441c = bVar.f17448c;
        this.f17442d = bVar.f17449d;
        this.f17443e = bVar.f17450e;
        this.f17444f = bVar.f17451f;
        this.f17445g = bVar.f17452g;
    }
}
