package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import e4.C1629g;
import e4.InterfaceC1623a;
import k4.G;
import n4.C1928g;

/* JADX INFO: loaded from: classes.dex */
class c implements InterfaceC1623a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f17434e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.ndk.a f17435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f17438d;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    c(com.google.firebase.crashlytics.ndk.a aVar, boolean z6) {
        this.f17435a = aVar;
        this.f17436b = z6;
    }

    static c f(Context context, boolean z6) {
        c cVar = new c(new com.google.firebase.crashlytics.ndk.a(context, new JniNativeApi(context), new C1928g(context)), z6);
        f17434e = cVar;
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, String str2, long j7, G g7) {
        C1629g.f().b("Initializing native session: " + str);
        if (this.f17435a.k(str, str2, j7, g7)) {
            return;
        }
        C1629g.f().k("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // e4.InterfaceC1623a
    public e4.h a(String str) {
        return new g(this.f17435a.d(str));
    }

    @Override // e4.InterfaceC1623a
    public boolean b() {
        String str = this.f17437c;
        return str != null && d(str);
    }

    @Override // e4.InterfaceC1623a
    public synchronized void c(final String str, final String str2, final long j7, final G g7) {
        this.f17437c = str;
        a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.b
            @Override // com.google.firebase.crashlytics.ndk.c.a
            public final void a() {
                this.f17429a.g(str, str2, j7, g7);
            }
        };
        this.f17438d = aVar;
        if (this.f17436b) {
            aVar.a();
        }
    }

    @Override // e4.InterfaceC1623a
    public boolean d(String str) {
        return this.f17435a.j(str);
    }
}
