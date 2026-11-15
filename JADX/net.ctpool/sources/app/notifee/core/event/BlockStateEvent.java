package app.notifee.core.event;

import android.os.Bundle;
import app.notifee.core.KeepForSdk;
import app.notifee.core.interfaces.MethodCallResult;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class BlockStateEvent {

    @KeepForSdk
    public static final int TYPE_APP_BLOCKED = 4;

    @KeepForSdk
    public static final int TYPE_CHANNEL_BLOCKED = 5;

    @KeepForSdk
    public static final int TYPE_CHANNEL_GROUP_BLOCKED = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f9546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MethodCallResult f9547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9548e = false;

    public BlockStateEvent(int i7, Bundle bundle, boolean z6, MethodCallResult methodCallResult) {
        this.f9544a = i7;
        this.f9547d = methodCallResult;
        this.f9545b = z6;
        this.f9546c = bundle;
    }

    @KeepForSdk
    public Bundle getChannelOrGroupBundle() {
        return this.f9546c;
    }

    @KeepForSdk
    public int getType() {
        return this.f9544a;
    }

    @KeepForSdk
    public boolean isBlocked() {
        return this.f9545b;
    }

    @KeepForSdk
    public void setCompletionResult() {
        if (this.f9548e) {
            return;
        }
        this.f9548e = true;
        this.f9547d.onComplete(null, null);
    }
}
