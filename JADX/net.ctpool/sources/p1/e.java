package p1;

import app.notifee.core.event.LogEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum e {
    UNKNOWN(-1),
    REQUESTED(0),
    INTERMEDIATE_AVAILABLE(2),
    SUCCESS(3),
    CANCELED(4),
    ERROR(5),
    DRAW(6),
    EMPTY_EVENT(7),
    RELEASED(8);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f21544n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final e[] f21545o = values();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21556m;

    public static final class a {
        private a() {
        }

        public final e a(int i7) {
            for (e eVar : e.f21545o) {
                if (eVar.j() == i7) {
                    return eVar;
                }
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21557a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.REQUESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.INTERMEDIATE_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.RELEASED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21557a = iArr;
        }
    }

    e(int i7) {
        this.f21556m = i7;
    }

    public final int j() {
        return this.f21556m;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (b.f21557a[ordinal()]) {
            case 1:
                return "requested";
            case 2:
                return "success";
            case 3:
                return "canceled";
            case 4:
                return "intermediate_available";
            case 5:
                return LogEvent.LEVEL_ERROR;
            case 6:
                return "released";
            default:
                return "unknown";
        }
    }
}
