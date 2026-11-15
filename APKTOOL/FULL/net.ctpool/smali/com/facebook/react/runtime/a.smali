.class Lcom/facebook/react/runtime/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/a$b;,
        Lcom/facebook/react/runtime/a$a;
    }
.end annotation


# instance fields
.field volatile a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field private volatile c:Lcom/facebook/react/runtime/a$b;

.field private volatile d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/a;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/a;->a:Ljava/lang/Object;

    iput-object p1, p0, Lcom/facebook/react/runtime/a;->b:Ljava/lang/Object;

    sget-object p1, Lcom/facebook/react/runtime/a$b;->m:Lcom/facebook/react/runtime/a$b;

    iput-object p1, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    const-string p1, ""

    iput-object p1, p0, Lcom/facebook/react/runtime/a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/a;->a:Ljava/lang/Object;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/a;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c(Lcom/facebook/react/runtime/a$a;)Ljava/lang/Object;
    .locals 5

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    sget-object v1, Lcom/facebook/react/runtime/a$b;->o:Lcom/facebook/react/runtime/a$b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    sget-object v2, Lcom/facebook/react/runtime/a$b;->p:Lcom/facebook/react/runtime/a$b;

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    sget-object v2, Lcom/facebook/react/runtime/a$b;->n:Lcom/facebook/react/runtime/a$b;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v2, :cond_1

    iput-object v2, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-interface {p1}, Lcom/facebook/react/runtime/a$a;->get()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/runtime/a;->a:Ljava/lang/Object;

    monitor-enter p0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iput-object v1, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    invoke-virtual {p0}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :catchall_1
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception p1

    monitor-enter p0

    :try_start_4
    sget-object v0, Lcom/facebook/react/runtime/a$b;->p:Lcom/facebook/react/runtime/a$b;

    iput-object v0, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    invoke-static {v0, v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/runtime/a;->d:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "BridgelessAtomicRef: Failed to create object."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_2
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :cond_2
    monitor-enter p0

    :goto_1
    :try_start_6
    iget-object p1, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    sget-object v0, Lcom/facebook/react/runtime/a$b;->n:Lcom/facebook/react/runtime/a$b;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne p1, v0, :cond_3

    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    goto :goto_2

    :catch_1
    move v4, v3

    goto :goto_1

    :cond_3
    if-eqz v4, :cond_4

    :try_start_8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    iget-object p1, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    sget-object v0, Lcom/facebook/react/runtime/a$b;->p:Lcom/facebook/react/runtime/a$b;

    if-eq p1, v0, :cond_5

    invoke-virtual {p0}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    move-result-object p1

    monitor-exit p0

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BridgelessAtomicRef: Failed to create object. Reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/runtime/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw p1

    :cond_6
    :try_start_9
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BridgelessAtomicRef: Failed to create object. Reason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/react/runtime/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method

.method public declared-synchronized d()V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/a;->b:Ljava/lang/Object;

    iput-object v0, p0, Lcom/facebook/react/runtime/a;->a:Ljava/lang/Object;

    sget-object v0, Lcom/facebook/react/runtime/a$b;->m:Lcom/facebook/react/runtime/a$b;

    iput-object v0, p0, Lcom/facebook/react/runtime/a;->c:Lcom/facebook/react/runtime/a$b;

    const-string v0, ""

    iput-object v0, p0, Lcom/facebook/react/runtime/a;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
