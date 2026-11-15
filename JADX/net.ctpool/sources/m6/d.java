package m6;

import android.os.Looper;
import l6.f;
import l6.h;
import l6.l;

/* JADX INFO: loaded from: classes2.dex */
public class d implements h {
    @Override // l6.h
    public l a(l6.c cVar) {
        return new f(cVar, Looper.getMainLooper(), 10);
    }

    @Override // l6.h
    public boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
