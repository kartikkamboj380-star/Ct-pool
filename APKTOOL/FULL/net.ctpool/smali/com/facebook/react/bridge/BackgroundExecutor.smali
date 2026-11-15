.class public Lcom/facebook/react/bridge/BackgroundExecutor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/bridge/BackgroundExecutor$NamedThreadFactory;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FabricBackgroundExecutor"


# instance fields
.field private final mExecutorService:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/facebook/react/bridge/BackgroundExecutor$NamedThreadFactory;

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/BackgroundExecutor$NamedThreadFactory;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-static {p1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/bridge/BackgroundExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private queueRunnable(Ljava/lang/Runnable;)V
    .locals 2
    .annotation build LR1/a;
    .end annotation

    const-string v0, "FabricBackgroundExecutor"

    if-nez p1, :cond_0

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "runnable is null"

    invoke-direct {p1, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {v0, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/bridge/BackgroundExecutor;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_1

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "executorService is null"

    invoke-direct {p1, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {v1, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
