package w3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f22691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22692b;

    public p(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.f22691a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f22692b = a(context);
        } else {
            this.f22692b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f22691a.getIdentifier(str, "string", this.f22692b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f22691a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
