package f2;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import com.tenjin.android.config.TenjinConsts;
import w5.k;

/* JADX INFO: renamed from: f2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f19296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648a(String str, WritableMap writableMap, int i7, int i8) {
        super(i7, i8);
        k.f(str, TenjinConsts.EVENT_NAME);
        this.f19295a = str;
        this.f19296b = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f19296b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.f19295a;
    }
}
