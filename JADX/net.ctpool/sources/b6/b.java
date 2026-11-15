package b6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f9730C = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f9744m;

    public static final class a {
        private a() {
        }

        public final b a(int i7) {
            for (b bVar : b.values()) {
                if (bVar.e() == i7) {
                    return bVar;
                }
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    b(int i7) {
        this.f9744m = i7;
    }

    public final int e() {
        return this.f9744m;
    }
}
