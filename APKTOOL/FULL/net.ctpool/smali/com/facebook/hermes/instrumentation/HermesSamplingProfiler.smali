.class public abstract Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "jsijniprofiler"

    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    return-void
.end method

.method public static native disable()V
.end method

.method public static native dumpSampledTraceToFile(Ljava/lang/String;)V
.end method

.method public static native enable()V
.end method
