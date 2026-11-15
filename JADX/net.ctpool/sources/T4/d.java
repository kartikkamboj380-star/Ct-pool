package T4;

import R4.q;
import R4.r;
import androidx.appcompat.app.y;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r, Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f3231s = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3235p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private double f3232m = -1.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3233n = 136;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f3234o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f3236q = Collections.emptyList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f3237r = Collections.emptyList();

    class a extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q f3238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ R4.d f3241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TypeToken f3242e;

        a(boolean z6, boolean z7, R4.d dVar, TypeToken typeToken) {
            this.f3239b = z6;
            this.f3240c = z7;
            this.f3241d = dVar;
            this.f3242e = typeToken;
        }

        private q e() {
            q qVar = this.f3238a;
            if (qVar != null) {
                return qVar;
            }
            q qVarM = this.f3241d.m(d.this, this.f3242e);
            this.f3238a = qVarM;
            return qVarM;
        }

        @Override // R4.q
        public Object b(Y4.a aVar) throws IOException {
            if (!this.f3239b) {
                return e().b(aVar);
            }
            aVar.n1();
            return null;
        }

        @Override // R4.q
        public void d(Y4.c cVar, Object obj) throws IOException {
            if (this.f3240c) {
                cVar.J();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    private boolean d(Class cls) {
        if (this.f3232m != -1.0d && !m((S4.d) cls.getAnnotation(S4.d.class), (S4.e) cls.getAnnotation(S4.e.class))) {
            return true;
        }
        if (this.f3234o || !i(cls)) {
            return h(cls);
        }
        return true;
    }

    private boolean e(Class cls, boolean z6) {
        Iterator it = (z6 ? this.f3236q : this.f3237r).iterator();
        if (!it.hasNext()) {
            return false;
        }
        y.a(it.next());
        throw null;
    }

    private boolean h(Class cls) {
        return (Enum.class.isAssignableFrom(cls) || j(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean i(Class cls) {
        return cls.isMemberClass() && !j(cls);
    }

    private boolean j(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean k(S4.d dVar) {
        if (dVar != null) {
            return this.f3232m >= dVar.value();
        }
        return true;
    }

    private boolean l(S4.e eVar) {
        if (eVar != null) {
            return this.f3232m < eVar.value();
        }
        return true;
    }

    private boolean m(S4.d dVar, S4.e eVar) {
        return k(dVar) && l(eVar);
    }

    @Override // R4.r
    public q a(R4.d dVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zD = d(rawType);
        boolean z6 = zD || e(rawType, true);
        boolean z7 = zD || e(rawType, false);
        if (z6 || z7) {
            return new a(z7, z6, dVar, typeToken);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public boolean c(Class cls, boolean z6) {
        return d(cls) || e(cls, z6);
    }

    public boolean g(Field field, boolean z6) {
        S4.a aVar;
        if ((this.f3233n & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f3232m != -1.0d && !m((S4.d) field.getAnnotation(S4.d.class), (S4.e) field.getAnnotation(S4.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f3235p && ((aVar = (S4.a) field.getAnnotation(S4.a.class)) == null || (!z6 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f3234o && i(field.getType())) || h(field.getType())) {
            return true;
        }
        List list = z6 ? this.f3236q : this.f3237r;
        if (list.isEmpty()) {
            return false;
        }
        new R4.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        y.a(it.next());
        throw null;
    }
}
