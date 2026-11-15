package i2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC1741a {
    boolean canOverrideExistingModule() default false;

    boolean hasConstants() default true;

    boolean isCxxModule() default false;

    String name();

    boolean needsEagerInit() default false;
}
