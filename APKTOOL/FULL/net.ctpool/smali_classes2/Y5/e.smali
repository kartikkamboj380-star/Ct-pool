.class public final LY5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY5/e$a;,
        LY5/e$b;
    }
.end annotation


# instance fields
.field private volatile A:LY5/f;

.field private final B:LT5/z;

.field private final C:LT5/B;

.field private final D:Z

.field private final m:LY5/h;

.field private final n:LT5/r;

.field private final o:LY5/e$c;

.field private final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private q:Ljava/lang/Object;

.field private r:LY5/d;

.field private s:LY5/f;

.field private t:Z

.field private u:LY5/c;

.field private v:Z

.field private w:Z

.field private x:Z

.field private volatile y:Z

.field private volatile z:LY5/c;


# direct methods
.method public constructor <init>(LT5/z;LT5/B;Z)V
    .locals 2

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalRequest"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LY5/e;->B:LT5/z;

    .line 15
    .line 16
    iput-object p2, p0, LY5/e;->C:LT5/B;

    .line 17
    .line 18
    iput-boolean p3, p0, LY5/e;->D:Z

    .line 19
    .line 20
    invoke-virtual {p1}, LT5/z;->l()LT5/k;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, LT5/k;->a()LY5/h;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iput-object p2, p0, LY5/e;->m:LY5/h;

    .line 29
    .line 30
    invoke-virtual {p1}, LT5/z;->s()LT5/r$c;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {p2, p0}, LT5/r$c;->a(LT5/e;)LT5/r;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iput-object p2, p0, LY5/e;->n:LT5/r;

    .line 39
    .line 40
    new-instance p2, LY5/e$c;

    .line 41
    .line 42
    invoke-direct {p2, p0}, LY5/e$c;-><init>(LY5/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, LT5/z;->h()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-long v0, p1

    .line 50
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    invoke-virtual {p2, v0, v1, p1}, Li6/D;->g(JLjava/util/concurrent/TimeUnit;)Li6/D;

    .line 53
    .line 54
    .line 55
    sget-object p1, Li5/u;->a:Li5/u;

    .line 56
    .line 57
    iput-object p2, p0, LY5/e;->o:LY5/e$c;

    .line 58
    .line 59
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, LY5/e;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-boolean p1, p0, LY5/e;->x:Z

    .line 68
    .line 69
    return-void
.end method

.method private final C(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    iget-boolean v0, p0, LY5/e;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, LY5/e;->o:LY5/e$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/d;->s()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 16
    .line 17
    const-string v1, "timeout"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    :cond_2
    return-object v0
.end method

.method private final D()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LY5/e;->n0()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "canceled "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, ""

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-boolean v1, p0, LY5/e;->D:Z

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const-string v1, "web socket"

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const-string v1, "call"

    .line 28
    .line 29
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " to "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, LY5/e;->x()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method

.method public static final synthetic a(LY5/e;)LY5/e$c;
    .locals 0

    .line 1
    iget-object p0, p0, LY5/e;->o:LY5/e$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LY5/e;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, LY5/e;->D()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 4

    .line 1
    sget-boolean v0, LU5/c;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const-string v2, "Thread.currentThread()"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, LY5/e;->s:LY5/f;

    if-eqz v1, :cond_8

    if-eqz v0, :cond_3

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    const-string v3, "Thread.currentThread()"

    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    :goto_1
    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, LY5/e;->y()Ljava/net/Socket;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v2, p0, LY5/e;->s:LY5/f;

    if-nez v2, :cond_5

    if-eqz v0, :cond_4

    invoke-static {v0}, LU5/c;->k(Ljava/net/Socket;)V

    :cond_4
    iget-object v0, p0, LY5/e;->n:LT5/r;

    invoke-virtual {v0, p0, v1}, LT5/r;->l(LT5/e;LT5/j;)V

    goto :goto_3

    :cond_5
    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_3
    invoke-direct {p0, p1}, LY5/e;->C(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz p1, :cond_9

    iget-object p1, p0, LY5/e;->n:LT5/r;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, LT5/r;->e(LT5/e;Ljava/io/IOException;)V

    goto :goto_4

    :cond_9
    iget-object p1, p0, LY5/e;->n:LT5/r;

    invoke-virtual {p1, p0}, LT5/r;->d(LT5/e;)V

    :goto_4
    return-object v0
.end method

.method private final e()V
    .locals 2

    .line 1
    sget-object v0, Ld6/j;->c:Ld6/j$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld6/j$a;->g()Ld6/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "response.body().close()"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ld6/j;->i(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LY5/e;->q:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v0, p0, LY5/e;->n:LT5/r;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, LT5/r;->f(LT5/e;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final h(LT5/u;)LT5/a;
    .locals 14

    .line 1
    invoke-virtual {p1}, LT5/u;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LY5/e;->B:LT5/z;

    .line 8
    .line 9
    invoke-virtual {v0}, LT5/z;->L()Ljavax/net/ssl/SSLSocketFactory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LY5/e;->B:LT5/z;

    .line 14
    .line 15
    invoke-virtual {v1}, LT5/z;->x()Ljavax/net/ssl/HostnameVerifier;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, LY5/e;->B:LT5/z;

    .line 20
    .line 21
    invoke-virtual {v2}, LT5/z;->j()LT5/g;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v6, v0

    .line 26
    move-object v7, v1

    .line 27
    move-object v8, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    move-object v6, v0

    .line 31
    move-object v7, v6

    .line 32
    move-object v8, v7

    .line 33
    :goto_0
    new-instance v0, LT5/a;

    .line 34
    .line 35
    invoke-virtual {p1}, LT5/u;->h()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, LT5/u;->l()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 44
    .line 45
    invoke-virtual {p1}, LT5/z;->r()LT5/q;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 50
    .line 51
    invoke-virtual {p1}, LT5/z;->K()Ljavax/net/SocketFactory;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 56
    .line 57
    invoke-virtual {p1}, LT5/z;->G()LT5/b;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 62
    .line 63
    invoke-virtual {p1}, LT5/z;->F()Ljava/net/Proxy;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 68
    .line 69
    invoke-virtual {p1}, LT5/z;->E()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 74
    .line 75
    invoke-virtual {p1}, LT5/z;->m()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    iget-object p1, p0, LY5/e;->B:LT5/z;

    .line 80
    .line 81
    invoke-virtual {p1}, LT5/z;->H()Ljava/net/ProxySelector;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    move-object v1, v0

    .line 86
    invoke-direct/range {v1 .. v13}, LT5/a;-><init>(Ljava/lang/String;ILT5/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LT5/g;LT5/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method


# virtual methods
.method public final A(LY5/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY5/e;->A:LY5/f;

    .line 2
    .line 3
    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LY5/e;->t:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, LY5/e;->t:Z

    .line 8
    .line 9
    iget-object v0, p0, LY5/e;->o:LY5/e$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Li6/d;->s()Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v1, "Check failed."

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public S0(LT5/f;)V
    .locals 3

    .line 1
    const-string v0, "responseCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY5/e;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, LY5/e;->e()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LY5/e;->B:LT5/z;

    .line 20
    .line 21
    invoke-virtual {v0}, LT5/z;->q()LT5/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, LY5/e$a;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1}, LY5/e$a;-><init>(LY5/e;LT5/f;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, LT5/p;->a(LY5/e$a;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "Already Executed"

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final c(LY5/f;)V
    .locals 4

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-boolean v0, LU5/c;->h:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Thread "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "Thread.currentThread()"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, " MUST hold lock on "

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    :goto_0
    iget-object v0, p0, LY5/e;->s:LY5/f;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    :goto_1
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iput-object p1, p0, LY5/e;->s:LY5/f;

    .line 71
    .line 72
    invoke-virtual {p1}, LY5/f;->n()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v0, LY5/e$b;

    .line 77
    .line 78
    iget-object v1, p0, LY5/e;->q:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-direct {v0, p0, v1}, LY5/e$b;-><init>(LY5/e;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v0, "Check failed."

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LY5/e;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LY5/e;->y:Z

    .line 8
    .line 9
    iget-object v0, p0, LY5/e;->z:LY5/c;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, LY5/c;->b()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, LY5/e;->A:LY5/f;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, LY5/f;->d()V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, LY5/e;->n:LT5/r;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, LT5/r;->g(LT5/e;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY5/e;->g()LY5/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()LT5/D;
    .locals 3

    .line 1
    iget-object v0, p0, LY5/e;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LY5/e;->o:LY5/e$c;

    .line 12
    .line 13
    invoke-virtual {v0}, Li6/d;->r()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, LY5/e;->e()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, LY5/e;->B:LT5/z;

    .line 20
    .line 21
    invoke-virtual {v0}, LT5/z;->q()LT5/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p0}, LT5/p;->b(LY5/e;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LY5/e;->s()LT5/D;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    iget-object v1, p0, LY5/e;->B:LT5/z;

    .line 33
    .line 34
    invoke-virtual {v1}, LT5/z;->q()LT5/p;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, p0}, LT5/p;->g(LY5/e;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    iget-object v1, p0, LY5/e;->B:LT5/z;

    .line 44
    .line 45
    invoke-virtual {v1}, LT5/z;->q()LT5/p;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p0}, LT5/p;->g(LY5/e;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "Already Executed"

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0
.end method

.method public g()LY5/e;
    .locals 4

    .line 1
    new-instance v0, LY5/e;

    .line 2
    .line 3
    iget-object v1, p0, LY5/e;->B:LT5/z;

    .line 4
    .line 5
    iget-object v2, p0, LY5/e;->C:LT5/B;

    .line 6
    .line 7
    iget-boolean v3, p0, LY5/e;->D:Z

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LY5/e;-><init>(LT5/z;LT5/B;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final i(LT5/B;Z)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY5/e;->u:LY5/c;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-eqz v0, :cond_4

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget-boolean v0, p0, LY5/e;->w:Z

    .line 18
    .line 19
    xor-int/2addr v0, v1

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-boolean v0, p0, LY5/e;->v:Z

    .line 23
    .line 24
    xor-int/2addr v0, v1

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    new-instance p2, LY5/d;

    .line 33
    .line 34
    iget-object v0, p0, LY5/e;->m:LY5/h;

    .line 35
    .line 36
    invoke-virtual {p1}, LT5/B;->l()LT5/u;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1}, LY5/e;->h(LT5/u;)LT5/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, LY5/e;->n:LT5/r;

    .line 45
    .line 46
    invoke-direct {p2, v0, p1, p0, v1}, LY5/d;-><init>(LY5/h;LT5/a;LY5/e;LT5/r;)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, LY5/e;->r:LY5/d;

    .line 50
    .line 51
    :cond_1
    return-void

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :try_start_1
    const-string p1, "Check failed."

    .line 55
    .line 56
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p2

    .line 66
    :cond_3
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 67
    .line 68
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    :goto_1
    monitor-exit p0

    .line 79
    throw p1

    .line 80
    :cond_4
    const-string p1, "Check failed."

    .line 81
    .line 82
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p2
.end method

.method public final j(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LY5/e;->x:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LY5/e;->z:LY5/c;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, LY5/c;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, LY5/e;->u:LY5/c;

    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 25
    .line 26
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    monitor-exit p0

    .line 37
    throw p1
.end method

.method public final k()LT5/z;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->B:LT5/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LY5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->s:LY5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()LT5/r;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->n:LT5/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public n0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY5/e;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public o()LT5/B;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->C:LT5/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY5/e;->D:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()LY5/c;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->u:LY5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()LT5/B;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->C:LT5/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LT5/D;
    .locals 11

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v0}, LT5/z;->y()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj5/n;->t(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v0, LZ5/j;

    iget-object v1, p0, LY5/e;->B:LT5/z;

    invoke-direct {v0, v1}, LZ5/j;-><init>(LT5/z;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LZ5/a;

    iget-object v1, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v1}, LT5/z;->p()LT5/n;

    move-result-object v1

    invoke-direct {v0, v1}, LZ5/a;-><init>(LT5/n;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, LW5/a;

    iget-object v1, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v1}, LT5/z;->g()LT5/c;

    move-result-object v1

    invoke-direct {v0, v1}, LW5/a;-><init>(LT5/c;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, LY5/a;->a:LY5/a;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LY5/e;->D:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v0}, LT5/z;->A()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lj5/n;->t(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    :cond_0
    new-instance v0, LZ5/b;

    iget-boolean v1, p0, LY5/e;->D:Z

    invoke-direct {v0, v1}, LZ5/b;-><init>(Z)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v9, LZ5/g;

    iget-object v5, p0, LY5/e;->C:LT5/B;

    iget-object v0, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v0}, LT5/z;->k()I

    move-result v6

    iget-object v0, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v0}, LT5/z;->I()I

    move-result v7

    iget-object v0, p0, LY5/e;->B:LT5/z;

    invoke-virtual {v0}, LT5/z;->N()I

    move-result v8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, LZ5/g;-><init>(LY5/e;Ljava/util/List;ILY5/c;LT5/B;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LY5/e;->C:LT5/B;

    invoke-virtual {v9, v2}, LZ5/g;->a(LT5/B;)LT5/D;

    move-result-object v2

    invoke-virtual {p0}, LY5/e;->n0()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, LY5/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p0, v1}, LY5/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v3, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    move v10, v2

    move-object v2, v1

    move v1, v10

    goto :goto_0

    :cond_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, LY5/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_3
    throw v2
.end method

.method public final t(LZ5/g;)LY5/c;
    .locals 4

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, LY5/e;->x:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-boolean v0, p0, LY5/e;->w:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    xor-int/2addr v0, v1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v0, p0, LY5/e;->v:Z

    .line 18
    .line 19
    xor-int/2addr v0, v1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    iget-object v0, p0, LY5/e;->r:LY5/d;

    .line 26
    .line 27
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, LY5/e;->B:LT5/z;

    .line 31
    .line 32
    invoke-virtual {v0, v2, p1}, LY5/d;->a(LT5/z;LZ5/g;)LZ5/d;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v2, LY5/c;

    .line 37
    .line 38
    iget-object v3, p0, LY5/e;->n:LT5/r;

    .line 39
    .line 40
    invoke-direct {v2, p0, v3, v0, p1}, LY5/c;-><init>(LY5/e;LT5/r;LY5/d;LZ5/d;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, LY5/e;->u:LY5/c;

    .line 44
    .line 45
    iput-object v2, p0, LY5/e;->z:LY5/c;

    .line 46
    .line 47
    monitor-enter p0

    .line 48
    :try_start_1
    iput-boolean v1, p0, LY5/e;->v:Z

    .line 49
    .line 50
    iput-boolean v1, p0, LY5/e;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    iget-boolean p1, p0, LY5/e;->y:Z

    .line 54
    .line 55
    if-nez p1, :cond_0

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 59
    .line 60
    const-string v0, "Canceled"

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    monitor-exit p0

    .line 68
    throw p1

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    :try_start_2
    const-string p1, "Check failed."

    .line 72
    .line 73
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v0

    .line 83
    :cond_2
    const-string p1, "Check failed."

    .line 84
    .line 85
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_3
    const-string p1, "released"

    .line 96
    .line 97
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    :goto_0
    monitor-exit p0

    .line 108
    throw p1
.end method

.method public final u(LY5/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    const-string v0, "exchange"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY5/e;->z:LY5/c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x1

    .line 13
    xor-int/2addr p1, v0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-object p4

    .line 17
    :cond_0
    monitor-enter p0

    .line 18
    const/4 p1, 0x0

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    :try_start_0
    iget-boolean v1, p0, LY5/e;->v:Z

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_4

    .line 28
    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    .line 29
    .line 30
    iget-boolean v1, p0, LY5/e;->w:Z

    .line 31
    .line 32
    if-eqz v1, :cond_7

    .line 33
    .line 34
    :cond_2
    if-eqz p2, :cond_3

    .line 35
    .line 36
    iput-boolean p1, p0, LY5/e;->v:Z

    .line 37
    .line 38
    :cond_3
    if-eqz p3, :cond_4

    .line 39
    .line 40
    iput-boolean p1, p0, LY5/e;->w:Z

    .line 41
    .line 42
    :cond_4
    iget-boolean p2, p0, LY5/e;->v:Z

    .line 43
    .line 44
    if-nez p2, :cond_5

    .line 45
    .line 46
    iget-boolean p3, p0, LY5/e;->w:Z

    .line 47
    .line 48
    if-nez p3, :cond_5

    .line 49
    .line 50
    move p3, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_5
    move p3, p1

    .line 53
    :goto_1
    if-nez p2, :cond_6

    .line 54
    .line 55
    iget-boolean p2, p0, LY5/e;->w:Z

    .line 56
    .line 57
    if-nez p2, :cond_6

    .line 58
    .line 59
    iget-boolean p2, p0, LY5/e;->x:Z

    .line 60
    .line 61
    if-nez p2, :cond_6

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_6
    move v0, p1

    .line 65
    :goto_2
    move p1, p3

    .line 66
    goto :goto_3

    .line 67
    :cond_7
    move v0, p1

    .line 68
    :goto_3
    sget-object p2, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    monitor-exit p0

    .line 71
    if-eqz p1, :cond_8

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, LY5/e;->z:LY5/c;

    .line 75
    .line 76
    iget-object p1, p0, LY5/e;->s:LY5/f;

    .line 77
    .line 78
    if-eqz p1, :cond_8

    .line 79
    .line 80
    invoke-virtual {p1}, LY5/f;->s()V

    .line 81
    .line 82
    .line 83
    :cond_8
    if-eqz v0, :cond_9

    .line 84
    .line 85
    invoke-direct {p0, p4}, LY5/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_9
    return-object p4

    .line 91
    :goto_4
    monitor-exit p0

    .line 92
    throw p1
.end method

.method public final v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LY5/e;->x:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, LY5/e;->x:Z

    .line 8
    .line 9
    iget-boolean v0, p0, LY5/e;->v:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LY5/e;->w:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-direct {p0, p1}, LY5/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_1
    return-object p1

    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    throw p1
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->C:LT5/B;

    .line 2
    .line 3
    invoke-virtual {v0}, LT5/B;->l()LT5/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LT5/u;->n()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final y()Ljava/net/Socket;
    .locals 7

    .line 1
    iget-object v0, p0, LY5/e;->s:LY5/f;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    sget-boolean v1, LU5/c;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

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

    const-string v3, " MUST hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {v0}, LY5/f;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/Reference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LY5/e;

    invoke-static {v5, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    move v4, v6

    :goto_2
    if-eq v4, v6, :cond_4

    const/4 v3, 0x1

    :cond_4
    if-eqz v3, :cond_6

    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, LY5/e;->s:LY5/f;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, LY5/f;->C(J)V

    iget-object v1, p0, LY5/e;->m:LY5/h;

    invoke-virtual {v1, v0}, LY5/h;->c(LY5/f;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, LY5/f;->E()Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :cond_5
    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()Z
    .locals 1

    .line 1
    iget-object v0, p0, LY5/e;->r:LY5/d;

    .line 2
    .line 3
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LY5/d;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method
