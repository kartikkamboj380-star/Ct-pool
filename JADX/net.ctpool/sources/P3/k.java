package P3;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class k implements R3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f2603a;

    k(l lVar, Activity activity) {
        this.f2603a = activity;
    }

    @Override // R3.a
    public final void a(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        this.f2603a.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
