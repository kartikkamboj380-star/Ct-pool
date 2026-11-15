package C;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th) {
        super(str, th);
        w5.k.f(str, "message");
    }

    public /* synthetic */ a(String str, Throwable th, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : th);
    }
}
