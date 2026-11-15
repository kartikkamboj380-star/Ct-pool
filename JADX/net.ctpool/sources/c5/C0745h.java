package c5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745h extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10104e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f10108d;

    /* JADX INFO: renamed from: c5.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0745h(int i7, int i8, float f7, boolean z6, boolean z7, short s6) {
        super(i7, i8);
        this.f10105a = f7;
        this.f10106b = z6;
        this.f10107c = z7;
        this.f10108d = s6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.f10108d;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("progress", this.f10105a);
        writableMapCreateMap.putInt("closing", this.f10106b ? 1 : 0);
        writableMapCreateMap.putInt("goingForward", this.f10107c ? 1 : 0);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topTransitionProgress";
    }
}
