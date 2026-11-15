package z1;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC2254a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f23249j = new a(null);

    public static final class a {
        private a() {
        }

        public final Y0.c a(d0 d0Var, l0 l0Var, F1.d dVar) {
            k.f(d0Var, "producer");
            k.f(l0Var, "settableProducerContext");
            k.f(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return new d(d0Var, l0Var, dVar, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private d(d0 d0Var, l0 l0Var, F1.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, F1.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }
}
