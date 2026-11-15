package a5;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: a5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0518a extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0114a f4787b = new C0114a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WritableMap f4788a;

    /* JADX INFO: renamed from: a5.a$a, reason: collision with other inner class name */
    public static final class C0114a {
        private C0114a() {
        }

        public /* synthetic */ C0114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518a(int i7, WritableMap writableMap) {
        super(i7);
        k.f(writableMap, "mEventData");
        this.f4788a = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f4788a);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topCustomMenuSelection";
    }
}
