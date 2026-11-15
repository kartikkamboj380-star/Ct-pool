package d;

import C5.g;
import android.content.Context;
import android.content.Intent;
import d.AbstractC1600a;
import i5.l;
import i5.q;
import j5.AbstractC1787F;
import j5.AbstractC1803h;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1601b extends AbstractC1600a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18651a = new a(null);

    /* JADX INFO: renamed from: d.b$a */
    public static final class a {
        private a() {
        }

        public final Intent a(String[] strArr) {
            k.f(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            k.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        k.f(context, "context");
        k.f(strArr, "input");
        return f18651a.a(strArr);
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1600a.C0249a b(Context context, String[] strArr) {
        k.f(context, "context");
        k.f(strArr, "input");
        if (strArr.length == 0) {
            return new AbstractC1600a.C0249a(AbstractC1787F.g());
        }
        for (String str : strArr) {
            if (androidx.core.content.b.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.c(AbstractC1787F.d(strArr.length), 16));
        for (String str2 : strArr) {
            l lVarA = q.a(str2, Boolean.TRUE);
            linkedHashMap.put(lVarA.c(), lVarA.d());
        }
        return new AbstractC1600a.C0249a(linkedHashMap);
    }

    @Override // d.AbstractC1600a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i7, Intent intent) {
        if (i7 != -1) {
            return AbstractC1787F.g();
        }
        if (intent == null) {
            return AbstractC1787F.g();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return AbstractC1787F.g();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i8 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i8 == 0));
        }
        return AbstractC1787F.o(AbstractC1809n.f0(AbstractC1803h.p(stringArrayExtra), arrayList));
    }
}
