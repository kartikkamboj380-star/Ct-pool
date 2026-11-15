.class public Lcom/facebook/react/bridge/ModuleHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation


# static fields
.field private static final sInstanceKeyCounter:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private mInitializable:Z

.field private final mInstanceKey:I

.field private mIsCreating:Z

.field private mIsInitializing:Z

.field private mModule:Lcom/facebook/react/bridge/NativeModule;

.field private final mName:Ljava/lang/String;

.field private mProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider;"
        }
    .end annotation
.end field

.field private final mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/facebook/react/bridge/ModuleHolder;->sInstanceKeyCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/NativeModule;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/react/bridge/ModuleHolder;->sInstanceKeyCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-interface {p1}, Lcom/facebook/react/bridge/NativeModule;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    new-instance v8, Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-interface {p1}, Lcom/facebook/react/bridge/NativeModule;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/facebook/react/bridge/NativeModule;->canOverrideExistingModule()Z

    move-result v4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v5, Lcom/facebook/react/bridge/CxxModuleWrapper;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/react/module/model/ReactModuleInfo;->b(Ljava/lang/Class;)Z

    move-result v7

    const/4 v5, 0x1

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    iput-object v8, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    iput-object p1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object p1

    sget-object v1, Lb1/a;->e:LZ0/a;

    const-string v2, "NativeModule init: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1, v2, v0}, La1/b;->a(LZ0/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/module/model/ReactModuleInfo;Ljavax/inject/Provider;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/module/model/ReactModuleInfo;",
            "Ljavax/inject/Provider;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/react/bridge/ModuleHolder;->sInstanceKeyCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-virtual {p1}, Lcom/facebook/react/module/model/ReactModuleInfo;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iput-object p2, p0, Lcom/facebook/react/bridge/ModuleHolder;->mProvider:Ljavax/inject/Provider;

    iput-object p1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-virtual {p1}, Lcom/facebook/react/module/model/ReactModuleInfo;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/bridge/ModuleHolder;->create()Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    :cond_0
    return-void
.end method

.method private create()Lcom/facebook/react/bridge/NativeModule;
    .locals 8

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Creating an already created module."

    invoke-static {v0, v3}, Lcom/facebook/react/bridge/SoftAssertions;->assertCondition(ZLjava/lang/String;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_MODULE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v3, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v4, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {v0, v3, v4}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    const-string v0, "ModuleHolder.createModule"

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    const-string v5, "name"

    iget-object v6, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    invoke-virtual {v0, v5, v6}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    invoke-static {}, La1/c;->a()La1/b;

    move-result-object v0

    sget-object v5, Lb1/a;->e:LZ0/a;

    const-string v6, "NativeModule init: %s"

    iget-object v7, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v5, v6, v7}, La1/b;->a(LZ0/a;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mProvider:Ljavax/inject/Provider;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/NativeModule;

    const/4 v5, 0x0

    iput-object v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mProvider:Ljavax/inject/Provider;

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    iget-boolean v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInitializable:Z

    if-eqz v5, :cond_1

    iget-boolean v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsInitializing:Z

    if-nez v5, :cond_1

    move v1, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    :try_start_2
    invoke-direct {p0, v0}, Lcom/facebook/react/bridge/ModuleHolder;->doInitialize(Lcom/facebook/react/bridge/NativeModule;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_2
    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v2, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {v1, v2, v5}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    invoke-static {v3, v4}, LP2/b;->b(J)LP2/b$a;

    move-result-object v1

    invoke-virtual {v1}, LP2/b$a;->c()V

    return-object v0

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    :try_start_5
    const-string v1, "ReactNative"

    const-string v2, "Failed to create NativeModule \'%s\'"

    iget-object v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v0, v2, v5}, LP0/a;->m(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CREATE_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v2, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v5, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {v1, v2, v5}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    invoke-static {v3, v4}, LP2/b;->b(J)LP2/b$a;

    move-result-object v1

    invoke-virtual {v1}, LP2/b$a;->c()V

    throw v0
.end method

.method private doInitialize(Lcom/facebook/react/bridge/NativeModule;)V
    .locals 5

    const-string v0, "ModuleHolder.initialize"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    const-string v3, "name"

    iget-object v4, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, LP2/b$a;->b(Ljava/lang/String;Ljava/lang/Object;)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->INITIALIZE_MODULE_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v3, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v4, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {v0, v3, v4}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInitializable:Z

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsInitializing:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsInitializing:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move v0, v3

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    :try_start_2
    invoke-interface {p1}, Lcom/facebook/react/bridge/NativeModule;->initialize()V

    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iput-boolean v3, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsInitializing:Z

    monitor-exit p0

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_1
    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->INITIALIZE_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v3, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {p1, v0, v3}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object p1

    invoke-virtual {p1}, LP2/b$a;->c()V

    return-void

    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_3
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->INITIALIZE_MODULE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    iget-object v3, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    iget v4, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInstanceKey:I

    invoke-static {v0, v3, v4}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    invoke-static {v1, v2}, LP2/b;->b(J)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    throw p1
.end method


# virtual methods
.method public declared-synchronized destroy()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/bridge/NativeModule;->invalidate()V
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

.method public getCanOverrideExistingModule()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-virtual {v0}, Lcom/facebook/react/module/model/ReactModuleInfo;->a()Z

    move-result v0

    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-virtual {v0}, Lcom/facebook/react/module/model/ReactModuleInfo;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getModule()Lcom/facebook/react/bridge/NativeModule;
    .locals 2
    .annotation build LR1/a;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsCreating:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsCreating:Z

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/facebook/react/bridge/ModuleHolder;->create()Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    monitor-enter p0

    :try_start_1
    iput-boolean v1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsCreating:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-object v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :cond_2
    monitor-enter p0

    :catch_0
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    if-nez v0, :cond_3

    iget-boolean v1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsCreating:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v1, :cond_3

    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    goto :goto_2

    :cond_3
    :try_start_4
    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/NativeModule;

    monitor-exit p0

    return-object v0

    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0

    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mName:Ljava/lang/String;

    return-object v0
.end method

.method declared-synchronized hasInstance()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public isCxxModule()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-virtual {v0}, Lcom/facebook/react/module/model/ReactModuleInfo;->d()Z

    move-result v0

    return v0
.end method

.method public isTurboModule()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mReactModuleInfo:Lcom/facebook/react/module/model/ReactModuleInfo;

    invoke-virtual {v0}, Lcom/facebook/react/module/model/ReactModuleInfo;->e()Z

    move-result v0

    return v0
.end method

.method markInitializable()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/react/bridge/ModuleHolder;->mInitializable:Z

    iget-object v1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mIsInitializing:Z

    xor-int/2addr v1, v0

    invoke-static {v1}, LO1/a;->a(Z)V

    iget-object v1, p0, Lcom/facebook/react/bridge/ModuleHolder;->mModule:Lcom/facebook/react/bridge/NativeModule;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v0, v2

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-direct {p0, v1}, Lcom/facebook/react/bridge/ModuleHolder;->doInitialize(Lcom/facebook/react/bridge/NativeModule;)V

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
