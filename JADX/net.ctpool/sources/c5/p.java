package c5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10117b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10118a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public p(int i7, int i8, String str) {
        super(i7, i8);
        this.f10118a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f10118a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSearchButtonPress";
    }
}
