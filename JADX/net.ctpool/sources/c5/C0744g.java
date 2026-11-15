package c5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744g extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10103a = new a(null);

    /* JADX INFO: renamed from: c5.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0744g(int i7, int i8) {
        super(i7, i8);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("dismissCount", 1);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDismissed";
    }
}
