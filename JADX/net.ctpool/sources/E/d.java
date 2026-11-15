package E;

import androidx.datastore.preferences.protobuf.C0630z;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1016a = new a(null);

    public static final class a {
        private a() {
        }

        public final f a(InputStream inputStream) throws C.a {
            k.f(inputStream, "input");
            try {
                f fVarN = f.N(inputStream);
                k.e(fVarN, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return fVarN;
            } catch (C0630z e7) {
                throw new C.a("Unable to parse preferences proto.", e7);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
