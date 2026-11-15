.class public final Lcom/facebook/react/modules/debug/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;
.implements Lz2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/debug/c$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/facebook/react/modules/debug/c$a;


# instance fields
.field private final a:LS1/d;

.field private final b:LS1/d;

.field private final c:LS1/d;

.field private final d:LS1/d;

.field private volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/debug/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/debug/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/debug/c;->f:Lcom/facebook/react/modules/debug/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    invoke-static {v0}, LS1/d;->b(I)LS1/d;

    move-result-object v1

    const-string v2, "createWithInitialCapacity(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/react/modules/debug/c;->a:LS1/d;

    invoke-static {v0}, LS1/d;->b(I)LS1/d;

    move-result-object v1

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/react/modules/debug/c;->b:LS1/d;

    invoke-static {v0}, LS1/d;->b(I)LS1/d;

    move-result-object v1

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/react/modules/debug/c;->c:LS1/d;

    invoke-static {v0}, LS1/d;->b(I)LS1/d;

    move-result-object v0

    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/react/modules/debug/c;->d:LS1/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/modules/debug/c;->e:Z

    return-void
.end method

.method private final c(JJ)Z
    .locals 9

    .line 1
    sget-object v6, Lcom/facebook/react/modules/debug/c;->f:Lcom/facebook/react/modules/debug/c$a;

    iget-object v1, p0, Lcom/facebook/react/modules/debug/c;->a:LS1/d;

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/debug/c$a;->b(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)J

    move-result-wide v7

    iget-object v1, p0, Lcom/facebook/react/modules/debug/c;->b:LS1/d;

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/debug/c$a;->b(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)J

    move-result-wide p1

    const-wide/16 p3, -0x1

    cmp-long v0, v7, p3

    if-nez v0, :cond_0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    iget-boolean p1, p0, Lcom/facebook/react/modules/debug/c;->e:Z

    goto :goto_0

    :cond_0
    cmp-long p1, v7, p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/c;->c:LS1/d;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LS1/d;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/c;->d:LS1/d;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LS1/d;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d(JJ)Z
    .locals 9

    .line 1
    monitor-enter p0

    :try_start_0
    sget-object v6, Lcom/facebook/react/modules/debug/c;->f:Lcom/facebook/react/modules/debug/c$a;

    iget-object v1, p0, Lcom/facebook/react/modules/debug/c;->d:LS1/d;

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/debug/c$a;->c(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/modules/debug/c;->c(JJ)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v7, :cond_1

    iget-object v1, p0, Lcom/facebook/react/modules/debug/c;->c:LS1/d;

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/modules/debug/c$a;->c(Lcom/facebook/react/modules/debug/c$a;LS1/d;JJ)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_0
    iget-object p1, p0, Lcom/facebook/react/modules/debug/c;->a:LS1/d;

    invoke-static {v6, p1, p3, p4}, Lcom/facebook/react/modules/debug/c$a;->a(Lcom/facebook/react/modules/debug/c$a;LS1/d;J)V

    iget-object p1, p0, Lcom/facebook/react/modules/debug/c;->b:LS1/d;

    invoke-static {v6, p1, p3, p4}, Lcom/facebook/react/modules/debug/c$a;->a(Lcom/facebook/react/modules/debug/c$a;LS1/d;J)V

    iget-object p1, p0, Lcom/facebook/react/modules/debug/c;->c:LS1/d;

    invoke-static {v6, p1, p3, p4}, Lcom/facebook/react/modules/debug/c$a;->a(Lcom/facebook/react/modules/debug/c$a;LS1/d;J)V

    iget-object p1, p0, Lcom/facebook/react/modules/debug/c;->d:LS1/d;

    invoke-static {v6, p1, p3, p4}, Lcom/facebook/react/modules/debug/c$a;->a(Lcom/facebook/react/modules/debug/c$a;LS1/d;J)V

    iput-boolean v7, p0, Lcom/facebook/react/modules/debug/c;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v8

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onBridgeDestroyed()V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized onTransitionToBridgeBusy()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/c;->b:LS1/d;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LS1/d;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onTransitionToBridgeIdle()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/debug/c;->a:LS1/d;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LS1/d;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
