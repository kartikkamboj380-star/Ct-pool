.class Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field private static sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;->maybeLoadSoLibrary()V

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableLogging(Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    invoke-static {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->jniEnableCppLogging(Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;)V

    :cond_0
    return-void
.end method

.method private static native jniEnableCppLogging(Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;)V
.end method

.method public static moduleCreateCacheHit(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->a(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateConstructEnd(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->b(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateConstructStart(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->c(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateEnd(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->d(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateFail(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->e(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateSetUpEnd(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->f(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateSetUpStart(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->g(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleCreateStart(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->h(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleDataCreateEnd(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->i(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static moduleDataCreateStart(Ljava/lang/String;I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->sNativeModulePerfLogger:Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/reactperflogger/NativeModulePerfLogger;->j(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
