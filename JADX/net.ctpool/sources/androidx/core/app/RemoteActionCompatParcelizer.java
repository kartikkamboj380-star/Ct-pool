package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f6883a = (IconCompat) aVar.v(remoteActionCompat.f6883a, 1);
        remoteActionCompat.f6884b = aVar.l(remoteActionCompat.f6884b, 2);
        remoteActionCompat.f6885c = aVar.l(remoteActionCompat.f6885c, 3);
        remoteActionCompat.f6886d = (PendingIntent) aVar.r(remoteActionCompat.f6886d, 4);
        remoteActionCompat.f6887e = aVar.h(remoteActionCompat.f6887e, 5);
        remoteActionCompat.f6888f = aVar.h(remoteActionCompat.f6888f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f6883a, 1);
        aVar.D(remoteActionCompat.f6884b, 2);
        aVar.D(remoteActionCompat.f6885c, 3);
        aVar.H(remoteActionCompat.f6886d, 4);
        aVar.z(remoteActionCompat.f6887e, 5);
        aVar.z(remoteActionCompat.f6888f, 6);
    }
}
