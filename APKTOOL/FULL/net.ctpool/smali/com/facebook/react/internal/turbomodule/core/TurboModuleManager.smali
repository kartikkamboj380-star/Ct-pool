.class public Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/internal/turbomodule/core/interfaces/TurboModuleRegistry;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;,
        Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;
    }
.end annotation


# instance fields
.field private final mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

.field private final mEagerInitModuleNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field

.field private final mLegacyModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;

.field private final mModuleCleanupLock:Ljava/lang/Object;

.field private mModuleCleanupStarted:Z

.field private final mModuleHolders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final mTurboModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/react/internal/turbomodule/core/NativeModuleSoLoader;->maybeLoadSoLibrary()V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;Lcom/facebook/react/turbomodule/core/interfaces/NativeMethodCallInvokerHolder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupLock:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupStarted:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    iput-object p2, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    check-cast p3, Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    check-cast p4, Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;

    invoke-direct {p0, p1, p3, p4, p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->initHybrid(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldEnableLegacyModuleInterop()Z

    move-result p1

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->enableSyncVoidMethods()Z

    move-result p3

    invoke-direct {p0, p1, p3}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->installJSIBindings(ZZ)V

    if-nez p2, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->getEagerInitModuleNames()Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mEagerInitModuleNames:Ljava/util/List;

    new-instance p1, Lcom/facebook/react/internal/turbomodule/core/a;

    invoke-direct {p1}, Lcom/facebook/react/internal/turbomodule/core/a;-><init>()V

    if-nez p2, :cond_1

    move-object p3, p1

    goto :goto_1

    :cond_1
    new-instance p3, Lcom/facebook/react/internal/turbomodule/core/b;

    invoke-direct {p3, p2}, Lcom/facebook/react/internal/turbomodule/core/b;-><init>(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)V

    :goto_1
    iput-object p3, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mTurboModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldEnableLegacyModuleInterop()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Lcom/facebook/react/internal/turbomodule/core/c;

    invoke-direct {p1, p2}, Lcom/facebook/react/internal/turbomodule/core/c;-><init>(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)V

    :cond_3
    :goto_2
    iput-object p1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mLegacyModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->lambda$new$1(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->lambda$new$0(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->lambda$new$2(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    return-object p0
.end method

.method private enableSyncVoidMethods()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->unstable_enableSyncVoidMethods()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getLegacyCxxModule(Ljava/lang/String;)Lcom/facebook/react/bridge/CxxModuleWrapper;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    :cond_0
    return-object v1

    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isLegacyModule(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-eqz v0, :cond_3

    instance-of v0, p1, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    if-nez v0, :cond_3

    move-object v1, p1

    check-cast v1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    :cond_3
    return-object v1
.end method

.method private getLegacyJavaModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-nez v0, :cond_0

    move-object v1, p1

    :cond_0
    return-object v1

    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isLegacyModule(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    if-nez v0, :cond_3

    move-object v1, p1

    :cond_3
    return-object v1
.end method

.method private static getMethodDescriptorsFromModule(Lcom/facebook/react/bridge/NativeModule;)Ljava/util/List;
    .locals 0
    .annotation build LR1/a;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/NativeModule;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils$MethodDescriptor;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleInteropUtils;->getMethodDescriptorsFromModule(Lcom/facebook/react/bridge/NativeModule;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private getOrCreateModule(Ljava/lang/String;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;Z)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    monitor-enter p2

    :try_start_0
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->isDoneCreatingModule()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result p3

    invoke-static {p1, p3}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateCacheHit(Ljava/lang/String;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    monitor-exit p2

    return-object p1

    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->isCreatingModule()Z

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p3, :cond_2

    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->startCreatingModule()V

    move p3, v0

    goto :goto_1

    :cond_2
    move p3, v1

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_5

    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result p3

    invoke-static {p1, p3}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateConstructStart(Ljava/lang/String;I)V

    iget-object p3, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mTurboModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;

    invoke-interface {p3, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p3

    if-nez p3, :cond_3

    iget-object p3, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mLegacyModuleProvider:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;

    invoke-interface {p3, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleProvider;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p3

    :cond_3
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateConstructEnd(Ljava/lang/String;I)V

    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateSetUpStart(Ljava/lang/String;I)V

    if-eqz p3, :cond_4

    monitor-enter p2

    :try_start_1
    invoke-virtual {p2, p3}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->setModule(Lcom/facebook/react/bridge/NativeModule;)V

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {p3}, Lcom/facebook/react/bridge/NativeModule;->initialize()V

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getOrCreateModule(): Unable to create module \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\". Was legacy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isLegacyModule(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ". Was turbo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isTurboModule(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->logError(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateSetUpEnd(Ljava/lang/String;I)V

    monitor-enter p2

    :try_start_3
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->endCreatingModule()V

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p2

    return-object p3

    :catchall_2
    move-exception p1

    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :cond_5
    monitor-enter p2

    :goto_3
    :try_start_4
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->isCreatingModule()Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz p1, :cond_6

    :try_start_5
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    goto :goto_4

    :catch_0
    move v1, v0

    goto :goto_3

    :cond_6
    if-eqz v1, :cond_7

    :try_start_6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_7
    invoke-virtual {p2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    monitor-exit p2

    return-object p1

    :goto_4
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw p1

    :goto_5
    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private getTurboJavaModule(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isTurboModule(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    :cond_2
    return-object v1
.end method

.method private getTurboLegacyCxxModule(Ljava/lang/String;)Lcom/facebook/react/bridge/CxxModuleWrapper;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isTurboModule(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    instance-of v0, p1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Lcom/facebook/react/bridge/CxxModuleWrapper;

    :cond_2
    return-object v1
.end method

.method private native initHybrid(Lcom/facebook/react/bridge/RuntimeExecutor;Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;Lcom/facebook/react/turbomodule/core/NativeMethodCallInvokerHolderImpl;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;)Lcom/facebook/jni/HybridData;
.end method

.method private native installJSIBindings(ZZ)V
.end method

.method private isLegacyModule(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->unstable_isLegacyModuleRegistered(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isTurboModule(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->unstable_isModuleRegistered(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static synthetic lambda$new$0(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic lambda$new$1(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->getModule(Ljava/lang/String;)Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/bridge/NativeModule;

    return-object p0
.end method

.method private static synthetic lambda$new$2(Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->getLegacyModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    if-eqz p0, :cond_0

    instance-of v0, p0, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    xor-int/lit8 v0, v0, 0x1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NativeModule \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" is a TurboModule"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LO1/a;->b(ZLjava/lang/String;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private logError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "TurboModuleManager"

    invoke-static {v0, p1}, LP0/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    invoke-direct {v1, p1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private shouldEnableLegacyModuleInterop()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->unstable_shouldEnableLegacyModuleInterop()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private shouldRouteTurboModulesThroughLegacyModuleInterop()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mDelegate:Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManagerDelegate;->unstable_shouldRouteTurboModulesThroughLegacyModuleInterop()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getEagerInitModuleNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mEagerInitModuleNames:Ljava/util/List;

    return-object v0
.end method

.method public getModule(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupStarted:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getModule(): Tried to get module \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\", but TurboModuleManager was tearing down. Returning null. Was legacy: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isLegacyModule(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ". Was turbo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->isTurboModule(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->logError(Ljava/lang/String;)V

    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    new-instance v2, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;

    invoke-direct {v2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;-><init>()V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateStart(Ljava/lang/String;I)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getOrCreateModule(Ljava/lang/String;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;Z)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModuleId()I

    move-result v1

    if-eqz v0, :cond_2

    invoke-static {p1, v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateEnd(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    invoke-static {p1, v1}, Lcom/facebook/react/internal/turbomodule/core/TurboModulePerfLogger;->moduleCreateFail(Ljava/lang/String;I)V

    :goto_0
    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getModules()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupLock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;

    monitor-enter v2

    :try_start_1
    invoke-virtual {v2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    monitor-exit v2

    goto :goto_0

    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-object v1

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method

.method public hasModule(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;->getModule()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    if-eqz v0, :cond_0

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p1

    goto :goto_1

    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    :goto_1
    const/4 p1, 0x0

    return p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public invalidate()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleCleanupStarted:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;

    const/4 v3, 0x0

    invoke-direct {p0, v2, v1, v3}, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->getOrCreateModule(Ljava/lang/String;Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager$ModuleHolder;Z)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/facebook/react/bridge/NativeModule;->invalidate()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mModuleHolders:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/facebook/react/internal/turbomodule/core/TurboModuleManager;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
