package W0;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4162a;

        static {
            int[] iArr = new int[e.values().length];
            f4162a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4162a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4162a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e j(boolean z6) {
        return z6 ? YES : NO;
    }

    public boolean e() {
        int i7 = a.f4162a[ordinal()];
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        if (i7 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean h() {
        return this != UNSET;
    }
}
