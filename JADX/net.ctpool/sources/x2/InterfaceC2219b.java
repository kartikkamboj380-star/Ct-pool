package x2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: defaultLong */
/* JADX INFO: renamed from: x2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC2219b {
    String customType() default "__default_type__";

    double defaultDouble() default 0.0d;

    float defaultFloat() default 0.0f;

    int defaultInt() default 0;

    String[] names();
}
