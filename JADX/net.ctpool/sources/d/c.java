package d;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC1600a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18652a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        k.f(context, "context");
        k.f(intent, "input");
        return intent;
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i7, Intent intent) {
        return new androidx.activity.result.a(i7, intent);
    }
}
