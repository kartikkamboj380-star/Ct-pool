package S3;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class a extends ApiException {
    public a(int i7) {
        super(new Status(i7, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i7), T3.a.a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
