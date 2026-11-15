package T5;

import T5.m;
import com.google.android.gms.common.internal.ImagesContract;
import j5.AbstractC1787F;
import j5.AbstractC1809n;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CookieHandler f3642c;

    public w(CookieHandler cookieHandler) {
        w5.k.f(cookieHandler, "cookieHandler");
        this.f3642c = cookieHandler;
    }

    private final List e(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int iN = U5.c.n(str, ";,", i7, length);
            int iM = U5.c.m(str, '=', i7, iN);
            String strV = U5.c.V(str, i7, iM);
            if (!F5.g.B(strV, "$", false, 2, null)) {
                String strV2 = iM < iN ? U5.c.V(str, iM + 1, iN) : "";
                if (F5.g.B(strV2, "\"", false, 2, null) && F5.g.o(strV2, "\"", false, 2, null)) {
                    strV2 = strV2.substring(1, strV2.length() - 1);
                    w5.k.e(strV2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new m.a().d(strV).e(strV2).b(uVar.h()).a());
            }
            i7 = iN + 1;
        }
        return arrayList;
    }

    @Override // T5.n
    public void a(u uVar, List list) {
        w5.k.f(uVar, ImagesContract.URL);
        w5.k.f(list, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(U5.b.a((m) it.next(), true));
        }
        try {
            this.f3642c.put(uVar.q(), AbstractC1787F.e(i5.q.a("Set-Cookie", arrayList)));
        } catch (IOException e7) {
            d6.j jVarG = d6.j.f18715c.g();
            StringBuilder sb = new StringBuilder();
            sb.append("Saving cookies failed for ");
            u uVarO = uVar.o("/...");
            w5.k.c(uVarO);
            sb.append(uVarO);
            jVarG.k(sb.toString(), 5, e7);
        }
    }

    @Override // T5.n
    public List d(u uVar) {
        w5.k.f(uVar, ImagesContract.URL);
        try {
            Map<String, List<String>> map = this.f3642c.get(uVar.q(), AbstractC1787F.g());
            w5.k.e(map, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (F5.g.p("Cookie", key, true) || F5.g.p("Cookie2", key, true)) {
                    w5.k.e(value, "value");
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            w5.k.e(str, "header");
                            arrayList.addAll(e(uVar, str));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return AbstractC1809n.i();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            w5.k.e(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        } catch (IOException e7) {
            d6.j jVarG = d6.j.f18715c.g();
            StringBuilder sb = new StringBuilder();
            sb.append("Loading cookies failed for ");
            u uVarO = uVar.o("/...");
            w5.k.c(uVarO);
            sb.append(uVarO);
            jVarG.k(sb.toString(), 5, e7);
            return AbstractC1809n.i();
        }
    }
}
