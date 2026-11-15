package I2;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1520b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1521a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(int i7, int i8, int i9) {
        super(i7, i8);
        this.f1521a = i9;
    }

    public final int a() {
        return this.f1521a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        k.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("drawerState", a());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
