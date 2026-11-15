package com.android.billingclient.api;

import C0.C0334a;
import C0.C0337d;
import C0.C0343j;
import C0.C0344k;
import C0.InterfaceC0335b;
import C0.InterfaceC0336c;
import C0.InterfaceC0338e;
import C0.InterfaceC0339f;
import C0.InterfaceC0340g;
import C0.InterfaceC0341h;
import C0.InterfaceC0342i;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C0752f;

/* JADX INFO: renamed from: com.android.billingclient.api.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0748b {

    /* JADX INFO: renamed from: com.android.billingclient.api.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile C0752f f10199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f10200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile InterfaceC0342i f10201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f10202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f10203e;

        /* synthetic */ a(Context context, C0.N n7) {
            this.f10200b = context;
        }

        public AbstractC0748b a() {
            if (this.f10200b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f10201c == null) {
                if (this.f10202d || this.f10203e) {
                    return new C0749c(null, this.f10200b, null, null);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f10199a == null || !this.f10199a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return this.f10201c != null ? new C0749c(null, this.f10199a, this.f10200b, this.f10201c, null, null, null) : new C0749c(null, this.f10199a, this.f10200b, null, null, null);
        }

        public a b() {
            C0752f.a aVarC = C0752f.c();
            aVarC.b();
            c(aVarC.a());
            return this;
        }

        public a c(C0752f c0752f) {
            this.f10199a = c0752f;
            return this;
        }

        public a d(InterfaceC0342i interfaceC0342i) {
            this.f10201c = interfaceC0342i;
            return this;
        }
    }

    public static a g(Context context) {
        return new a(context, null);
    }

    public abstract void a(C0334a c0334a, InterfaceC0335b interfaceC0335b);

    public abstract void b(C0337d c0337d, InterfaceC0338e interfaceC0338e);

    public abstract void c();

    public abstract C0751e d(String str);

    public abstract boolean e();

    public abstract C0751e f(Activity activity, C0750d c0750d);

    public abstract void h(C0754h c0754h, InterfaceC0339f interfaceC0339f);

    public abstract void i(C0343j c0343j, InterfaceC0340g interfaceC0340g);

    public abstract void j(C0344k c0344k, InterfaceC0341h interfaceC0341h);

    public abstract void k(InterfaceC0336c interfaceC0336c);
}
