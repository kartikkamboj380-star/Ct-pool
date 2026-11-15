package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V2 implements X2 {
    @Override // com.google.android.gms.internal.measurement.X2
    public final String a(ContentResolver contentResolver, String str) throws C1039a3 {
        Uri uri = P2.f14305a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new C1039a3("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new C1039a3("ContentProvider query returned null cursor");
                    }
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e7) {
                throw new C1039a3("ContentProvider query failed", e7);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.X2
    public final Map b(ContentResolver contentResolver, String[] strArr, Y2 y22) throws C1039a3 {
        Uri uri = P2.f14306b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new C1039a3("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new C1039a3("ContentProvider query returned null cursor");
                    }
                    Map mapD = y22.d(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapD.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new C1039a3("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    return mapD;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e7) {
                throw new C1039a3("ContentProvider query failed", e7);
            }
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }
}
