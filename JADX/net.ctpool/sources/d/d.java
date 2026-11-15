package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC1600a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18653a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, e eVar) {
        k.f(context, "context");
        k.f(eVar, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
        k.e(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i7, Intent intent) {
        return new androidx.activity.result.a(i7, intent);
    }
}
