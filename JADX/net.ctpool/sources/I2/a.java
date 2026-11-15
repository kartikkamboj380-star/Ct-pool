package I2;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0027a f1516a = new C0027a(null);

    /* JADX INFO: renamed from: I2.a$a, reason: collision with other inner class name */
    public static final class C0027a {
        private C0027a() {
        }

        public /* synthetic */ C0027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int i7, int i8) {
        super(i7, i8);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerClose";
    }
}
