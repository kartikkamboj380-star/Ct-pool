package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f6941m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f6942n;

    public interface a {
        Intent m();
    }

    private a0(Context context) {
        this.f6942n = context;
    }

    public static a0 i(Context context) {
        return new a0(context);
    }

    public a0 c(Intent intent) {
        this.f6941m.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0 f(Activity activity) {
        Intent intentM = activity instanceof a ? ((a) activity).m() : null;
        if (intentM == null) {
            intentM = AbstractC0557i.a(activity);
        }
        if (intentM != null) {
            ComponentName component = intentM.getComponent();
            if (component == null) {
                component = intentM.resolveActivity(this.f6942n.getPackageManager());
            }
            h(component);
            c(intentM);
        }
        return this;
    }

    public a0 h(ComponentName componentName) {
        int size = this.f6941m.size();
        try {
            Context context = this.f6942n;
            while (true) {
                Intent intentB = AbstractC0557i.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f6941m.add(size, intentB);
                context = this.f6942n;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f6941m.iterator();
    }

    public void k() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (this.f6941m.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f6941m.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.b.l(this.f6942n, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f6942n.startActivity(intent);
    }
}
