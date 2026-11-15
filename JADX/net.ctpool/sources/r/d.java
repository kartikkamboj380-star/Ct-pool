package r;

import com.google.android.gms.common.ConnectionResult;
import java.util.HashSet;
import java.util.Iterator;
import q.C1981c;
import q.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21922d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    q.i f21925g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f21919a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21923e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f21924f = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21926a;

        static {
            int[] iArr = new int[b.values().length];
            f21926a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21926a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21926a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21926a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21926a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21926a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21926a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21926a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21926a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f21920b = eVar;
        this.f21921c = bVar;
    }

    public boolean a(d dVar, int i7, int i8, boolean z6) {
        if (dVar == null) {
            k();
            return true;
        }
        if (!z6 && !j(dVar)) {
            return false;
        }
        this.f21922d = dVar;
        if (dVar.f21919a == null) {
            dVar.f21919a = new HashSet();
        }
        this.f21922d.f21919a.add(this);
        if (i7 > 0) {
            this.f21923e = i7;
        } else {
            this.f21923e = 0;
        }
        this.f21924f = i8;
        return true;
    }

    public int b() {
        d dVar;
        if (this.f21920b.M() == 8) {
            return 0;
        }
        return (this.f21924f <= -1 || (dVar = this.f21922d) == null || dVar.f21920b.M() != 8) ? this.f21923e : this.f21924f;
    }

    public final d c() {
        switch (a.f21926a[this.f21921c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return null;
            case 2:
                return this.f21920b.f21941D;
            case 3:
                return this.f21920b.f21939B;
            case 4:
                return this.f21920b.f21942E;
            case 5:
                return this.f21920b.f21940C;
            default:
                throw new AssertionError(this.f21921c.name());
        }
    }

    public e d() {
        return this.f21920b;
    }

    public q.i e() {
        return this.f21925g;
    }

    public d f() {
        return this.f21922d;
    }

    public b g() {
        return this.f21921c;
    }

    public boolean h() {
        HashSet hashSet = this.f21919a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f21922d != null;
    }

    public boolean j(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarG = dVar.g();
        b bVar = this.f21921c;
        if (bVarG == bVar) {
            return bVar != b.BASELINE || (dVar.d().Q() && d().Q());
        }
        switch (a.f21926a[bVar.ordinal()]) {
            case 1:
                return (bVarG == b.BASELINE || bVarG == b.CENTER_X || bVarG == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z6 = bVarG == b.LEFT || bVarG == b.RIGHT;
                if (dVar.d() instanceof g) {
                    return z6 || bVarG == b.CENTER_X;
                }
                return z6;
            case 4:
            case 5:
                boolean z7 = bVarG == b.TOP || bVarG == b.BOTTOM;
                if (dVar.d() instanceof g) {
                    return z7 || bVarG == b.CENTER_Y;
                }
                return z7;
            case 6:
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return false;
            default:
                throw new AssertionError(this.f21921c.name());
        }
    }

    public void k() {
        HashSet hashSet;
        d dVar = this.f21922d;
        if (dVar != null && (hashSet = dVar.f21919a) != null) {
            hashSet.remove(this);
        }
        this.f21922d = null;
        this.f21923e = 0;
        this.f21924f = -1;
    }

    public void l(C1981c c1981c) {
        q.i iVar = this.f21925g;
        if (iVar == null) {
            this.f21925g = new q.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f21920b.p() + ":" + this.f21921c.toString();
    }
}
