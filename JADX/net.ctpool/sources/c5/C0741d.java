package c5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741d extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10099b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f10100a;

    /* JADX INFO: renamed from: c5.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0741d(int i7, int i8, double d7) {
        super(i7, i8);
        this.f10100a = d7;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f10100a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("headerHeight", this.f10100a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topHeaderHeightChange";
    }
}
