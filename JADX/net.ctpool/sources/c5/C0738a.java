package c5;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738a extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0191a f10096a = new C0191a(null);

    /* JADX INFO: renamed from: c5.a$a, reason: collision with other inner class name */
    public static final class C0191a {
        private C0191a() {
        }

        public /* synthetic */ C0191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0738a(int i7, int i8) {
        super(i7, i8);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topAttached";
    }
}
