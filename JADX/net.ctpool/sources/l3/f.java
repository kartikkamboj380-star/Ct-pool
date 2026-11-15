package l3;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Logger f21100o = new Logger("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f21101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final StatusPendingResult f21102n = new StatusPendingResult((GoogleApiClient) null);

    public f(String str) {
        this.f21101m = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult a(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f21102n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f21101m).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                f21100o.e("Unable to revoke access!", new Object[0]);
            }
            f21100o.d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            f21100o.e("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            f21100o.e("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f21102n.setResult(status);
    }
}
