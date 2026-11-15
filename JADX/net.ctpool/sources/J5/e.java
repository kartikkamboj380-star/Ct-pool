package J5;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final d a(int i7, a aVar, v5.l lVar) {
        d bVar;
        if (i7 == -2) {
            bVar = aVar == a.SUSPEND ? new b(d.f1814a.a(), lVar) : new k(1, aVar, lVar);
        } else {
            if (i7 == -1) {
                if (aVar == a.SUSPEND) {
                    return new k(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i7 != 0) {
                return i7 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i7, lVar) : new k(i7, aVar, lVar) : new b(Api.BaseClientBuilder.API_PRIORITY_OTHER, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b(0, lVar) : new k(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i7, a aVar, v5.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        return a(i7, aVar, lVar);
    }
}
