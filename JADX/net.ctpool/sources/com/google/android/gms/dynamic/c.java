package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private final String zza;
    private Object zzb;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.zza = str;
    }

    protected abstract Object getRemoteCreator(IBinder iBinder);

    @KeepForSdk
    protected final Object getRemoteCreatorInstance(Context context) throws a {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new a("Could not load creator class.", e7);
            } catch (IllegalAccessException e8) {
                throw new a("Could not access creator.", e8);
            } catch (InstantiationException e9) {
                throw new a("Could not instantiate creator.", e9);
            }
        }
        return this.zzb;
    }
}
