package com.facebook.react.common;

import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleState {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final LifecycleState f11399m = new LifecycleState("BEFORE_CREATE", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LifecycleState f11400n = new LifecycleState("BEFORE_RESUME", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final LifecycleState f11401o = new LifecycleState("RESUMED", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ LifecycleState[] f11402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11403q;

    static {
        LifecycleState[] lifecycleStateArrE = e();
        f11402p = lifecycleStateArrE;
        f11403q = AbstractC1978a.a(lifecycleStateArrE);
    }

    private LifecycleState(String str, int i7) {
    }

    private static final /* synthetic */ LifecycleState[] e() {
        return new LifecycleState[]{f11399m, f11400n, f11401o};
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) f11402p.clone();
    }
}
