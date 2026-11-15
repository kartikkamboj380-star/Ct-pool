package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            IGmsCallbacks zzabVar;
            if (i7 > 16777215) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzabVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                zzabVar = iInterfaceQueryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) iInterfaceQueryLocalInterface : new zzab(strongBinder);
            }
            if (i7 == 46) {
                getService(zzabVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                Preconditions.checkNotNull(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i7 == 47) {
                if (parcel.readInt() != 0) {
                    zzak.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i7 != 4) {
                parcel.readString();
                if (i7 == 1) {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i7 == 2 || i7 == 23 || i7 == 25 || i7 == 27) {
                    if (parcel.readInt() != 0) {
                    }
                } else if (i7 == 30) {
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i7 == 34) {
                    parcel.readString();
                } else if (i7 != 41 && i7 != 43 && i7 != 37 && i7 != 38) {
                    switch (i7) {
                        case ConnectionResult.SERVICE_INVALID /* 9 */:
                            parcel.readString();
                            parcel.createStringArray();
                            parcel.readString();
                            parcel.readStrongBinder();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 10:
                            parcel.readString();
                            parcel.createStringArray();
                            break;
                        case 19:
                            parcel.readStrongBinder();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    @KeepForSdk
    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest);
}
