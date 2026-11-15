package I2;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1518b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1519a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(int i7, int i8, float f7) {
        super(i7, i8);
        this.f1519a = f7;
    }

    public final float a() {
        return this.f1519a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        k.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("offset", a());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerSlide";
    }
}
