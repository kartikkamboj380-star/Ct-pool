package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AtomicReference f8344a = new AtomicReference();

    /* JADX INFO: renamed from: androidx.lifecycle.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8346b;

        static {
            int[] iArr = new int[b.values().length];
            f8346b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8346b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8346b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8346b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8346b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8346b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8346b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f8345a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8345a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8345a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8345a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8345a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h$b */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b e(c cVar) {
            int i7 = a.f8345a[cVar.ordinal()];
            if (i7 == 1) {
                return ON_DESTROY;
            }
            if (i7 == 2) {
                return ON_STOP;
            }
            if (i7 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static b j(c cVar) {
            int i7 = a.f8345a[cVar.ordinal()];
            if (i7 == 1) {
                return ON_START;
            }
            if (i7 == 2) {
                return ON_RESUME;
            }
            if (i7 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public c h() {
            switch (a.f8346b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h$c */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean e(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    public abstract void a(InterfaceC0654k interfaceC0654k);

    public abstract c b();

    public abstract void c(InterfaceC0654k interfaceC0654k);
}
