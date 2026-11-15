package W1;

import com.facebook.react.AbstractC0862u;
import com.facebook.react.ReactActivity;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractC0862u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactActivity reactActivity, String str, boolean z6) {
        super(reactActivity, str);
        k.f(reactActivity, "activity");
        k.f(str, "mainComponentName");
        this.f4164f = z6;
    }

    @Override // com.facebook.react.AbstractC0862u
    protected boolean j() {
        return this.f4164f;
    }
}
