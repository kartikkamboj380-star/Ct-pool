package B1;

import D1.k;
import D1.l;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f681a;

    private static class a implements b {
        private a() {
        }

        @Override // B1.h.b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override // B1.h.b
        public int b() {
            return 0;
        }
    }

    public interface b {
        List a();

        int b();
    }

    public h() {
        this(new a());
    }

    @Override // B1.e
    public l a(int i7) {
        return k.d(i7, i7 >= this.f681a.b(), false);
    }

    @Override // B1.e
    public int b(int i7) {
        List listA = this.f681a.a();
        if (listA == null || listA.isEmpty()) {
            return i7 + 1;
        }
        for (int i8 = 0; i8 < listA.size(); i8++) {
            if (((Integer) listA.get(i8)).intValue() > i7) {
                return ((Integer) listA.get(i8)).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // B1.e
    public boolean c() {
        return true;
    }

    public h(b bVar) {
        this.f681a = (b) O0.l.g(bVar);
    }
}
