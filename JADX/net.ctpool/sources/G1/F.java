package G1;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.imagepipeline.memory.e f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private R0.i f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private R0.l f1182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private R0.a f1183h;

    public F(D d7) {
        this.f1176a = (D) O0.l.g(d7);
    }

    private com.facebook.imagepipeline.memory.e a() {
        if (this.f1177b == null) {
            try {
                this.f1177b = (com.facebook.imagepipeline.memory.e) AshmemMemoryChunkPool.class.getConstructor(R0.d.class, G.class, H.class).newInstance(this.f1176a.i(), this.f1176a.g(), this.f1176a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f1177b = null;
            }
        }
        return this.f1177b;
    }

    private com.facebook.imagepipeline.memory.e e(int i7) {
        if (i7 == 0) {
            return f();
        }
        if (i7 == 1) {
            return c();
        }
        if (i7 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i b() {
        byte b7;
        i rVar;
        if (this.f1178c == null) {
            String strE = this.f1176a.e();
            switch (strE.hashCode()) {
                case -1868884870:
                    b7 = !strE.equals("legacy_default_params") ? (byte) -1 : (byte) 3;
                    break;
                case -1106578487:
                    if (strE.equals("legacy")) {
                        b7 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (strE.equals("experimental")) {
                        b7 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (strE.equals("dummy_with_tracking")) {
                        b7 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (strE.equals("dummy")) {
                        b7 = 0;
                        break;
                    }
                    break;
            }
            if (b7 == 0) {
                rVar = new r();
            } else if (b7 == 1) {
                rVar = new s();
            } else if (b7 != 2) {
                rVar = b7 != 3 ? new com.facebook.imagepipeline.memory.c(this.f1176a.i(), this.f1176a.c(), this.f1176a.d(), this.f1176a.l()) : new com.facebook.imagepipeline.memory.c(this.f1176a.i(), n.a(), this.f1176a.d(), this.f1176a.l());
            } else {
                rVar = new u(this.f1176a.b(), this.f1176a.a(), A.h(), this.f1176a.m() ? this.f1176a.i() : null);
            }
            this.f1178c = rVar;
        }
        return this.f1178c;
    }

    public com.facebook.imagepipeline.memory.e c() {
        if (this.f1179d == null) {
            try {
                this.f1179d = (com.facebook.imagepipeline.memory.e) BufferMemoryChunkPool.class.getConstructor(R0.d.class, G.class, H.class).newInstance(this.f1176a.i(), this.f1176a.g(), this.f1176a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                this.f1179d = null;
            }
        }
        return this.f1179d;
    }

    public int d() {
        return this.f1176a.f().f1190g;
    }

    public com.facebook.imagepipeline.memory.e f() {
        if (this.f1180e == null) {
            try {
                this.f1180e = (com.facebook.imagepipeline.memory.e) NativeMemoryChunkPool.class.getConstructor(R0.d.class, G.class, H.class).newInstance(this.f1176a.i(), this.f1176a.g(), this.f1176a.h());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
                P0.a.k("PoolFactory", "", e7);
                this.f1180e = null;
            }
        }
        return this.f1180e;
    }

    public R0.i g(int i7) {
        if (this.f1181f == null) {
            com.facebook.imagepipeline.memory.e eVarE = e(i7);
            O0.l.h(eVarE, "failed to get pool for chunk type: " + i7);
            this.f1181f = new z(eVarE, h());
        }
        return this.f1181f;
    }

    public R0.l h() {
        if (this.f1182g == null) {
            this.f1182g = new R0.l(i());
        }
        return this.f1182g;
    }

    public R0.a i() {
        if (this.f1183h == null) {
            this.f1183h = new com.facebook.imagepipeline.memory.d(this.f1176a.i(), this.f1176a.j(), this.f1176a.k());
        }
        return this.f1183h;
    }
}
