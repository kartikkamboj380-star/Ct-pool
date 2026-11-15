package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.AbstractC0559k;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6881a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f6882b = new Object();

    static Bundle a(AbstractC0559k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.k() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(Y y6) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", y6.i());
        bundle.putCharSequence("label", y6.h());
        bundle.putCharSequenceArray("choices", y6.e());
        bundle.putBoolean("allowFreeFormInput", y6.c());
        bundle.putBundle("extras", y6.g());
        Set setD = y6.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(Y[] yArr) {
        if (yArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[yArr.length];
        for (int i7 = 0; i7 < yArr.length; i7++) {
            bundleArr[i7] = b(yArr[i7]);
        }
        return bundleArr;
    }
}
