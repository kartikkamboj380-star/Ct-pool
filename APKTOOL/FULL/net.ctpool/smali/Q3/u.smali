.class final LQ3/u;
.super LQ3/q;
.source "SourceFile"


# instance fields
.field final synthetic n:LQ3/A;


# direct methods
.method constructor <init>(LQ3/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ3/u;->n:LQ3/A;

    .line 2
    .line 3
    invoke-direct {p0}, LQ3/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LQ3/u;->n:LQ3/A;

    .line 2
    .line 3
    invoke-static {v0}, LQ3/A;->g(LQ3/A;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 9
    .line 10
    invoke-static {v1}, LQ3/A;->i(LQ3/A;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 22
    .line 23
    invoke-static {v1}, LQ3/A;->i(LQ3/A;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-gtz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 35
    .line 36
    invoke-static {v1}, LQ3/A;->f(LQ3/A;)LQ3/p;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v3, "Leaving the connection open for other ongoing calls."

    .line 41
    .line 42
    new-array v2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v1, v3, v2}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 52
    .line 53
    invoke-static {v1}, LQ3/A;->d(LQ3/A;)Landroid/os/IInterface;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-static {v1}, LQ3/A;->f(LQ3/A;)LQ3/p;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v3, "Unbind from service."

    .line 64
    .line 65
    new-array v4, v2, [Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v4}, LQ3/p;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 71
    .line 72
    invoke-static {v1}, LQ3/A;->a(LQ3/A;)Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v1}, LQ3/A;->b(LQ3/A;)Landroid/content/ServiceConnection;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 84
    .line 85
    invoke-static {v1, v2}, LQ3/A;->l(LQ3/A;Z)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-static {v1, v2}, LQ3/A;->m(LQ3/A;Landroid/os/IInterface;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 95
    .line 96
    invoke-static {v1, v2}, LQ3/A;->k(LQ3/A;Landroid/content/ServiceConnection;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v1, p0, LQ3/u;->n:LQ3/A;

    .line 100
    .line 101
    invoke-static {v1}, LQ3/A;->o(LQ3/A;)V

    .line 102
    .line 103
    .line 104
    monitor-exit v0

    .line 105
    return-void

    .line 106
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    throw v1
.end method
