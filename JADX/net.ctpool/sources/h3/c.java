package h3;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* JADX INFO: loaded from: classes.dex */
public class c extends UserRecoverableAuthException {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19605p;

    c(int i7, String str, Intent intent) {
        super(str, intent);
        this.f19605p = i7;
    }
}
