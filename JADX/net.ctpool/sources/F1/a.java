package F1;

import com.tenjin.android.config.TenjinConsts;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements e {
    @Override // com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void b(String str, String str2, Map map) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void c(String str, String str2, boolean z6) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean g(String str) {
        k.f(str, "requestId");
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, String str3) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
        k.f(str3, TenjinConsts.EVENT_NAME);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void i(String str, String str2, Map map) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, Throwable th, Map map) {
        k.f(str, "requestId");
        k.f(str2, "producerName");
        k.f(th, "t");
    }
}
