package R4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f2889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f2890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ m[] f2891o;

    enum a extends m {
        a(String str, int i7) {
            super(str, i7, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f2889m = aVar;
        m mVar = new m("STRING", 1) { // from class: R4.m.b
            {
                a aVar2 = null;
            }
        };
        f2890n = mVar;
        f2891o = new m[]{aVar, mVar};
    }

    private m(String str, int i7) {
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f2891o.clone();
    }

    /* synthetic */ m(String str, int i7, a aVar) {
        this(str, i7);
    }
}
