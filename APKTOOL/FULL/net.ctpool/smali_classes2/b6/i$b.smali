.class public final Lb6/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/A;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final m:Li6/f;

.field private n:LT5/t;

.field private o:Z

.field private p:Z

.field final synthetic q:Lb6/i;


# direct methods
.method public constructor <init>(Lb6/i;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb6/i$b;->q:Lb6/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lb6/i$b;->p:Z

    .line 7
    .line 8
    new-instance p1, Li6/f;

    .line 9
    .line 10
    invoke-direct {p1}, Li6/f;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lb6/i$b;->m:Li6/f;

    .line 14
    .line 15
    return-void
.end method

.method private final a(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->s()Lb6/i$d;

    move-result-object v1

    invoke-virtual {v1}, Li6/d;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->r()J

    move-result-wide v1

    iget-object v3, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v3}, Lb6/i;->q()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    iget-boolean v1, p0, Lb6/i$b;->p:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lb6/i$b;->o:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->h()Lb6/b;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :try_start_2
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->s()Lb6/i$d;

    move-result-object v1

    invoke-virtual {v1}, Lb6/i$d;->y()V

    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->c()V

    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->q()J

    move-result-wide v1

    iget-object v3, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v3}, Lb6/i;->r()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-object v3, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual {v3}, Li6/f;->m1()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->r()J

    move-result-wide v2

    add-long/2addr v2, v9

    invoke-virtual {v1, v2, v3}, Lb6/i;->B(J)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual {p1}, Li6/f;->m1()J

    move-result-wide v1

    cmp-long p1, v9, v1

    if-nez p1, :cond_1

    iget-object p1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {p1}, Lb6/i;->h()Lb6/b;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v7, p1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object p1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {p1}, Lb6/i;->s()Lb6/i$d;

    move-result-object p1

    invoke-virtual {p1}, Li6/d;->r()V

    :try_start_3
    iget-object p1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {p1}, Lb6/i;->g()Lb6/f;

    move-result-object v5

    iget-object p1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {p1}, Lb6/i;->j()I

    move-result v6

    iget-object v8, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual/range {v5 .. v10}, Lb6/f;->A1(IZLi6/f;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object p1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {p1}, Lb6/i;->s()Lb6/i$d;

    move-result-object p1

    invoke-virtual {p1}, Lb6/i$d;->y()V

    return-void

    :catchall_2
    move-exception p1

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->s()Lb6/i$d;

    move-result-object v0

    invoke-virtual {v0}, Lb6/i$d;->y()V

    throw p1

    :goto_3
    :try_start_4
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->s()Lb6/i$d;

    move-result-object v1

    invoke-virtual {v1}, Lb6/i$d;->y()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v0

    throw p1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb6/i$b;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 10

    .line 1
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    sget-boolean v1, LU5/c;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    const-string v4, "Thread.currentThread()"

    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb6/i$b;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    :try_start_1
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v1}, Lb6/i;->h()Lb6/b;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    sget-object v4, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->o()Lb6/i$b;

    move-result-object v0

    iget-boolean v0, v0, Lb6/i$b;->p:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    move v0, v2

    :goto_2
    iget-object v4, p0, Lb6/i$b;->n:LT5/t;

    if-eqz v4, :cond_6

    :goto_3
    iget-object v0, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v4

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    invoke-direct {p0, v2}, Lb6/i$b;->a(Z)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->g()Lb6/f;

    move-result-object v0

    iget-object v2, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v2}, Lb6/i;->j()I

    move-result v2

    iget-object v4, p0, Lb6/i$b;->n:LT5/t;

    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-static {v4}, LU5/c;->L(LT5/t;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4}, Lb6/f;->B1(IZLjava/util/List;)V

    goto :goto_5

    :cond_6
    if-eqz v0, :cond_7

    :goto_4
    iget-object v0, p0, Lb6/i$b;->m:Li6/f;

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_8

    invoke-direct {p0, v3}, Lb6/i$b;->a(Z)V

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->g()Lb6/f;

    move-result-object v4

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->j()I

    move-result v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v9}, Lb6/f;->A1(IZLi6/f;J)V

    :cond_8
    :goto_5
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    monitor-enter v0

    :try_start_2
    iput-boolean v3, p0, Lb6/i$b;->o:Z

    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->g()Lb6/f;

    move-result-object v0

    invoke-virtual {v0}, Lb6/f;->flush()V

    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    invoke-virtual {v0}, Lb6/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb6/i$b;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public flush()V
    .locals 5

    .line 1
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    .line 2
    .line 3
    sget-boolean v1, LU5/c;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v1, p0, Lb6/i$b;->q:Lb6/i;

    .line 62
    .line 63
    invoke-virtual {v1}, Lb6/i;->c()V

    .line 64
    .line 65
    .line 66
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit v0

    .line 69
    :goto_1
    iget-object v0, p0, Lb6/i$b;->m:Li6/f;

    .line 70
    .line 71
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    cmp-long v0, v0, v2

    .line 78
    .line 79
    if-lez v0, :cond_2

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, v0}, Lb6/i$b;->a(Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    .line 86
    .line 87
    invoke-virtual {v0}, Lb6/i;->g()Lb6/f;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lb6/f;->flush()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    return-void

    .line 96
    :catchall_0
    move-exception v1

    .line 97
    monitor-exit v0

    .line 98
    throw v1
.end method

.method public i()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb6/i;->s()Lb6/i$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public w0(Li6/f;J)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/i$b;->q:Lb6/i;

    .line 7
    .line 8
    sget-boolean v1, LU5/c;->h:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p3, "Thread "

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const-string v1, "Thread.currentThread()"

    .line 36
    .line 37
    invoke-static {p3, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p3, " MUST NOT hold lock on "

    .line 48
    .line 49
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    :goto_0
    iget-object v0, p0, Lb6/i$b;->m:Li6/f;

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Li6/f;->w0(Li6/f;J)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object p1, p0, Lb6/i$b;->m:Li6/f;

    .line 69
    .line 70
    invoke-virtual {p1}, Li6/f;->m1()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    const-wide/16 v0, 0x4000

    .line 75
    .line 76
    cmp-long p1, p1, v0

    .line 77
    .line 78
    if-ltz p1, :cond_2

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1}, Lb6/i$b;->a(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    return-void
.end method
