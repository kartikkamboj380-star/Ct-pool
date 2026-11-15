.class public Lcom/facebook/react/fabric/events/EventEmitterWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingNativeLoadLibrary"
    }
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/facebook/react/fabric/d;->a()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0
    .annotation build LR1/a;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method private native dispatchEvent(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;I)V
.end method

.method private native dispatchEventSynchronously(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V
.end method

.method private native dispatchUniqueEvent(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V
.end method

.method private e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->mHybridData:Lcom/facebook/jni/HybridData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->isValid()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->mHybridData:Lcom/facebook/jni/HybridData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;I)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->e()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->dispatchEvent(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->e()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->dispatchEventSynchronously(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->e()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/fabric/events/EventEmitterWrapper;->dispatchUniqueEvent(Ljava/lang/String;Lcom/facebook/react/bridge/NativeMap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
