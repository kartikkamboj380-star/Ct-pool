.class public final Lh6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/H;
.implements Lh6/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/d$c;,
        Lh6/d$a;,
        Lh6/d$d;,
        Lh6/d$e;,
        Lh6/d$b;
    }
.end annotation


# static fields
.field public static final A:Lh6/d$b;

.field private static final z:Ljava/util/List;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:LT5/e;

.field private c:LX5/a;

.field private d:Lh6/g;

.field private e:Lh6/h;

.field private f:LX5/d;

.field private g:Ljava/lang/String;

.field private h:Lh6/d$d;

.field private final i:Ljava/util/ArrayDeque;

.field private final j:Ljava/util/ArrayDeque;

.field private k:J

.field private l:Z

.field private m:I

.field private n:Ljava/lang/String;

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:Z

.field private final t:LT5/B;

.field private final u:LT5/I;

.field private final v:Ljava/util/Random;

.field private final w:J

.field private x:Lh6/e;

.field private y:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh6/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh6/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh6/d;->A:Lh6/d$b;

    .line 8
    .line 9
    sget-object v0, LT5/A;->o:LT5/A;

    .line 10
    .line 11
    invoke-static {v0}, Lj5/n;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lh6/d;->z:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(LX5/e;LT5/B;LT5/I;Ljava/util/Random;JLh6/e;J)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

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
    const-string v0, "listener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "random"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lh6/d;->t:LT5/B;

    .line 25
    .line 26
    iput-object p3, p0, Lh6/d;->u:LT5/I;

    .line 27
    .line 28
    iput-object p4, p0, Lh6/d;->v:Ljava/util/Random;

    .line 29
    .line 30
    iput-wide p5, p0, Lh6/d;->w:J

    .line 31
    .line 32
    iput-object p7, p0, Lh6/d;->x:Lh6/e;

    .line 33
    .line 34
    iput-wide p8, p0, Lh6/d;->y:J

    .line 35
    .line 36
    invoke-virtual {p1}, LX5/e;->i()LX5/d;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lh6/d;->f:LX5/d;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lh6/d;->i:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    new-instance p1, Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    const/4 p1, -0x1

    .line 57
    iput p1, p0, Lh6/d;->m:I

    .line 58
    .line 59
    const-string p1, "GET"

    .line 60
    .line 61
    invoke-virtual {p2}, LT5/B;->h()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-static {p1, p3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    sget-object p2, Li6/i;->q:Li6/i$a;

    .line 72
    .line 73
    const/16 p1, 0x10

    .line 74
    .line 75
    new-array p3, p1, [B

    .line 76
    .line 77
    invoke-virtual {p4, p3}, Ljava/util/Random;->nextBytes([B)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Li5/u;->a:Li5/u;

    .line 81
    .line 82
    const/4 p6, 0x3

    .line 83
    const/4 p7, 0x0

    .line 84
    const/4 p4, 0x0

    .line 85
    const/4 p5, 0x0

    .line 86
    invoke-static/range {p2 .. p7}, Li6/i$a;->g(Li6/i$a;[BIIILjava/lang/Object;)Li6/i;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Li6/i;->e()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lh6/d;->a:Ljava/lang/String;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string p3, "Request must be GET: "

    .line 103
    .line 104
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, LT5/B;->h()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p2
.end method

.method public static final synthetic i(Lh6/d;)Ljava/util/ArrayDeque;
    .locals 0

    .line 1
    iget-object p0, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lh6/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lh6/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lh6/d;Lh6/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh6/d;->t(Lh6/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic l(Lh6/d;Lh6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh6/d;->x:Lh6/e;

    .line 2
    .line 3
    return-void
.end method

.method private final t(Lh6/e;)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Lh6/e;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p1, Lh6/e;->b:Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    iget-object p1, p1, Lh6/e;->d:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    if-gt v0, p1, :cond_2

    .line 23
    .line 24
    const/16 v0, 0xf

    .line 25
    .line 26
    if-ge v0, p1, :cond_3

    .line 27
    .line 28
    :cond_2
    return v1

    .line 29
    :cond_3
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method private final v()V
    .locals 8

    .line 1
    sget-boolean v0, LU5/c;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Thread "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "Thread.currentThread()"

    .line 29
    .line 30
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, " MUST hold lock on "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_1
    :goto_0
    iget-object v3, p0, Lh6/d;->c:LX5/a;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-object v2, p0, Lh6/d;->f:LX5/d;

    .line 61
    .line 62
    const/4 v6, 0x2

    .line 63
    const/4 v7, 0x0

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    invoke-static/range {v2 .. v7}, LX5/d;->j(LX5/d;LX5/a;JILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method private final declared-synchronized w(Li6/i;I)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh6/d;->o:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Lh6/d;->l:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v2, p0, Lh6/d;->k:J

    .line 13
    .line 14
    invoke-virtual {p1}, Li6/i;->C()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-long v4, v0

    .line 19
    add-long/2addr v2, v4

    .line 20
    const-wide/32 v4, 0x1000000

    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x3e9

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p0, p1, p2}, Lh6/d;->f(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return v1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :try_start_1
    iget-wide v0, p0, Lh6/d;->k:J

    .line 38
    .line 39
    invoke-virtual {p1}, Li6/i;->C()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-long v2, v2

    .line 44
    add-long/2addr v0, v2

    .line 45
    iput-wide v0, p0, Lh6/d;->k:J

    .line 46
    .line 47
    iget-object v0, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    new-instance v1, Lh6/d$c;

    .line 50
    .line 51
    invoke-direct {v1, p2, p1}, Lh6/d$c;-><init>(ILi6/i;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lh6/d;->v()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit p0

    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_2
    :goto_0
    monitor-exit p0

    .line 64
    return v1

    .line 65
    :goto_1
    monitor-exit p0

    .line 66
    throw p1
.end method


# virtual methods
.method public a(Li6/i;)V
    .locals 1

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->u:LT5/I;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, LT5/I;->d(LT5/H;Li6/i;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Li6/i;->q:Li6/i$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li6/i$a;->d(Ljava/lang/String;)Li6/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0}, Lh6/d;->w(Li6/i;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public c(Li6/i;)Z
    .locals 1

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p0, p1, v0}, Lh6/d;->w(Li6/i;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public declared-synchronized d(Li6/i;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lh6/d;->o:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lh6/d;->l:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lh6/d;->i:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lh6/d;->v()V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lh6/d;->q:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    iput p1, p0, Lh6/d;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :cond_1
    :goto_0
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit p0

    .line 45
    throw p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->u:LT5/I;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, LT5/I;->e(LT5/H;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public f(ILjava/lang/String;)Z
    .locals 2

    .line 1
    const-wide/32 v0, 0xea60

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Lh6/d;->o(ILjava/lang/String;J)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public declared-synchronized g(Li6/i;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget p1, p0, Lh6/d;->r:I

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Lh6/d;->r:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lh6/d;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit p0

    .line 20
    throw p1
.end method

.method public h(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "reason"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    move v3, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v0

    .line 14
    :goto_0
    if-eqz v3, :cond_b

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget v3, p0, Lh6/d;->m:I

    .line 18
    .line 19
    if-ne v3, v2, :cond_1

    .line 20
    .line 21
    move v0, v1

    .line 22
    :cond_1
    if-eqz v0, :cond_a

    .line 23
    .line 24
    iput p1, p0, Lh6/d;->m:I

    .line 25
    .line 26
    iput-object p2, p0, Lh6/d;->n:Ljava/lang/String;

    .line 27
    .line 28
    iget-boolean v0, p0, Lh6/d;->l:Z

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lh6/d;->h:Lh6/d$d;

    .line 42
    .line 43
    iput-object v1, p0, Lh6/d;->h:Lh6/d$d;

    .line 44
    .line 45
    iget-object v2, p0, Lh6/d;->d:Lh6/g;

    .line 46
    .line 47
    iput-object v1, p0, Lh6/d;->d:Lh6/g;

    .line 48
    .line 49
    iget-object v3, p0, Lh6/d;->e:Lh6/h;

    .line 50
    .line 51
    iput-object v1, p0, Lh6/d;->e:Lh6/h;

    .line 52
    .line 53
    iget-object v1, p0, Lh6/d;->f:LX5/d;

    .line 54
    .line 55
    invoke-virtual {v1}, LX5/d;->n()V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_4

    .line 62
    :cond_2
    move-object v2, v1

    .line 63
    move-object v3, v2

    .line 64
    :goto_1
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit p0

    .line 67
    :try_start_1
    iget-object v0, p0, Lh6/d;->u:LT5/I;

    .line 68
    .line 69
    invoke-virtual {v0, p0, p1, p2}, LT5/I;->b(LT5/H;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Lh6/d;->u:LT5/I;

    .line 75
    .line 76
    invoke-virtual {v0, p0, p1, p2}, LT5/I;->a(LT5/H;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    if-eqz v3, :cond_6

    .line 93
    .line 94
    invoke-static {v3}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 95
    .line 96
    .line 97
    :cond_6
    return-void

    .line 98
    :goto_3
    if-eqz v1, :cond_7

    .line 99
    .line 100
    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    if-eqz v2, :cond_8

    .line 104
    .line 105
    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    if-eqz v3, :cond_9

    .line 109
    .line 110
    invoke-static {v3}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 111
    .line 112
    .line 113
    :cond_9
    throw p1

    .line 114
    :cond_a
    :try_start_2
    const-string p1, "already closed"

    .line 115
    .line 116
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    :goto_4
    monitor-exit p0

    .line 127
    throw p1

    .line 128
    :cond_b
    const-string p1, "Failed requirement."

    .line 129
    .line 130
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p2
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/d;->b:LT5/e;

    .line 2
    .line 3
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, LT5/e;->cancel()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(LT5/D;LY5/c;)V
    .locals 7

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LT5/D;->f()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x65

    .line 11
    .line 12
    const/16 v2, 0x27

    .line 13
    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    const-string v0, "Connection"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v3, 0x2

    .line 20
    invoke-static {p1, v0, v1, v3, v1}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v4, "Upgrade"

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-static {v4, v0, v5}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    invoke-static {p1, v4, v1, v3, v1}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v4, "websocket"

    .line 38
    .line 39
    invoke-static {v4, v0, v5}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const-string v0, "Sec-WebSocket-Accept"

    .line 46
    .line 47
    invoke-static {p1, v0, v1, v3, v1}, LT5/D;->o(LT5/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Li6/i;->q:Li6/i$a;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lh6/d;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Li6/i$a;->d(Ljava/lang/String;)Li6/i;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Li6/i;->A()Li6/i;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Li6/i;->e()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    xor-int/2addr v1, v5

    .line 89
    if-nez v1, :cond_1

    .line 90
    .line 91
    if-eqz p2, :cond_0

    .line 92
    .line 93
    return-void

    .line 94
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 95
    .line 96
    const-string p2, "Web Socket exchange missing: bad interceptor?"

    .line 97
    .line 98
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_1
    new-instance p2, Ljava/net/ProtocolException;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    .line 110
    .line 111
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v0, "\' but was \'"

    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p2

    .line 136
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    .line 137
    .line 138
    new-instance p2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    .line 144
    .line 145
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    .line 163
    .line 164
    new-instance p2, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    .line 170
    .line 171
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1

    .line 188
    :cond_4
    new-instance p2, Ljava/net/ProtocolException;

    .line 189
    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v1, "Expected HTTP 101 response but was \'"

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, LT5/D;->f()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const/16 v1, 0x20

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, LT5/D;->B()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p2
.end method

.method public final declared-synchronized o(ILjava/lang/String;J)Z
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lh6/f;->a:Lh6/f;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lh6/f;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    sget-object v2, Li6/i;->q:Li6/i$a;

    .line 12
    .line 13
    invoke-virtual {v2, p2}, Li6/i$a;->d(Ljava/lang/String;)Li6/i;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Li6/i;->C()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-long v3, v3

    .line 22
    const-wide/16 v5, 0x7b

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-gtz v3, :cond_0

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v0

    .line 31
    :goto_0
    if-eqz v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string p3, "reason.size() > 123: "

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_1
    iget-boolean p2, p0, Lh6/d;->o:Z

    .line 65
    .line 66
    if-nez p2, :cond_4

    .line 67
    .line 68
    iget-boolean p2, p0, Lh6/d;->l:Z

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iput-boolean v1, p0, Lh6/d;->l:Z

    .line 74
    .line 75
    iget-object p2, p0, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 76
    .line 77
    new-instance v0, Lh6/d$a;

    .line 78
    .line 79
    invoke-direct {v0, p1, v2, p3, p4}, Lh6/d$a;-><init>(ILi6/i;J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-direct {p0}, Lh6/d;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    monitor-exit p0

    .line 89
    return v1

    .line 90
    :cond_4
    :goto_2
    monitor-exit p0

    .line 91
    return v0

    .line 92
    :goto_3
    monitor-exit p0

    .line 93
    throw p1
.end method

.method public final p(LT5/z;)V
    .locals 4

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->t:LT5/B;

    .line 7
    .line 8
    const-string v1, "Sec-WebSocket-Extensions"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LT5/B;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p1, Ljava/net/ProtocolException;

    .line 17
    .line 18
    const-string v0, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, LT5/z;->B()LT5/z$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, LT5/r;->a:LT5/r;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, LT5/z$a;->g(LT5/r;)LT5/z$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lh6/d;->z:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, LT5/z$a;->L(Ljava/util/List;)LT5/z$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, LT5/z$a;->b()LT5/z;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Lh6/d;->t:LT5/B;

    .line 49
    .line 50
    invoke-virtual {v0}, LT5/B;->i()LT5/B$a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "websocket"

    .line 55
    .line 56
    const-string v3, "Upgrade"

    .line 57
    .line 58
    invoke-virtual {v0, v3, v2}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "Connection"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v3}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "Sec-WebSocket-Key"

    .line 69
    .line 70
    iget-object v3, p0, Lh6/d;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v2, v3}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "Sec-WebSocket-Version"

    .line 77
    .line 78
    const-string v3, "13"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v3}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v2, "permessage-deflate"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, LT5/B$a;->e(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, LY5/e;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, p1, v0, v2}, LY5/e;-><init>(LT5/z;LT5/B;Z)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lh6/d;->b:LT5/e;

    .line 101
    .line 102
    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Lh6/d$f;

    .line 106
    .line 107
    invoke-direct {p1, p0, v0}, Lh6/d$f;-><init>(Lh6/d;LT5/B;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, p1}, LT5/e;->S0(LT5/f;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final q(Ljava/lang/Exception;LT5/D;)V
    .locals 4

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lh6/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    :try_start_1
    iput-boolean v0, p0, Lh6/d;->o:Z

    .line 15
    .line 16
    iget-object v0, p0, Lh6/d;->h:Lh6/d$d;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Lh6/d;->h:Lh6/d$d;

    .line 20
    .line 21
    iget-object v2, p0, Lh6/d;->d:Lh6/g;

    .line 22
    .line 23
    iput-object v1, p0, Lh6/d;->d:Lh6/g;

    .line 24
    .line 25
    iget-object v3, p0, Lh6/d;->e:Lh6/h;

    .line 26
    .line 27
    iput-object v1, p0, Lh6/d;->e:Lh6/h;

    .line 28
    .line 29
    iget-object v1, p0, Lh6/d;->f:LX5/d;

    .line 30
    .line 31
    invoke-virtual {v1}, LX5/d;->n()V

    .line 32
    .line 33
    .line 34
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    :try_start_2
    iget-object v1, p0, Lh6/d;->u:LT5/I;

    .line 38
    .line 39
    invoke-virtual {v1, p0, p1, p2}, LT5/I;->c(LT5/H;Ljava/lang/Throwable;LT5/D;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    if-eqz v3, :cond_3

    .line 53
    .line 54
    invoke-static {v3}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-static {v2}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    if-eqz v3, :cond_6

    .line 70
    .line 71
    invoke-static {v3}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 72
    .line 73
    .line 74
    :cond_6
    throw p1

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    monitor-exit p0

    .line 77
    throw p1
.end method

.method public final r()LT5/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/d;->u:LT5/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/String;Lh6/d$d;)V
    .locals 16

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    const-string v1, "name"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "streams"

    .line 13
    .line 14
    invoke-static {v11, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v12, v10, Lh6/d;->x:Lh6/e;

    .line 18
    .line 19
    invoke-static {v12}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    monitor-enter p0

    .line 23
    :try_start_0
    iput-object v0, v10, Lh6/d;->g:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v11, v10, Lh6/d;->h:Lh6/d$d;

    .line 26
    .line 27
    new-instance v9, Lh6/h;

    .line 28
    .line 29
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->a()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->b()Li6/g;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, v10, Lh6/d;->v:Ljava/util/Random;

    .line 38
    .line 39
    iget-boolean v5, v12, Lh6/e;->a:Z

    .line 40
    .line 41
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v12, v1}, Lh6/e;->a(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-wide v7, v10, Lh6/d;->y:J

    .line 50
    .line 51
    move-object v1, v9

    .line 52
    invoke-direct/range {v1 .. v8}, Lh6/h;-><init>(ZLi6/g;Ljava/util/Random;ZZJ)V

    .line 53
    .line 54
    .line 55
    iput-object v9, v10, Lh6/d;->e:Lh6/h;

    .line 56
    .line 57
    new-instance v1, Lh6/d$e;

    .line 58
    .line 59
    invoke-direct {v1, v10}, Lh6/d$e;-><init>(Lh6/d;)V

    .line 60
    .line 61
    .line 62
    iput-object v1, v10, Lh6/d;->c:LX5/a;

    .line 63
    .line 64
    iget-wide v1, v10, Lh6/d;->w:J

    .line 65
    .line 66
    const-wide/16 v3, 0x0

    .line 67
    .line 68
    cmp-long v3, v1, v3

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 73
    .line 74
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v13

    .line 78
    iget-object v15, v10, Lh6/d;->f:LX5/d;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v2, " ping"

    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v9, Lh6/d$g;

    .line 98
    .line 99
    move-object v1, v9

    .line 100
    move-object v2, v3

    .line 101
    move-wide v4, v13

    .line 102
    move-object/from16 v6, p0

    .line 103
    .line 104
    move-object/from16 v7, p1

    .line 105
    .line 106
    move-object/from16 v8, p2

    .line 107
    .line 108
    move-object v0, v9

    .line 109
    move-object v9, v12

    .line 110
    invoke-direct/range {v1 .. v9}, Lh6/d$g;-><init>(Ljava/lang/String;Ljava/lang/String;JLh6/d;Ljava/lang/String;Lh6/d$d;Lh6/e;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v15, v0, v13, v14}, LX5/d;->i(LX5/a;J)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    goto :goto_1

    .line 119
    :cond_0
    :goto_0
    iget-object v0, v10, Lh6/d;->j:Ljava/util/ArrayDeque;

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    xor-int/lit8 v0, v0, 0x1

    .line 126
    .line 127
    if-eqz v0, :cond_1

    .line 128
    .line 129
    invoke-direct/range {p0 .. p0}, Lh6/d;->v()V

    .line 130
    .line 131
    .line 132
    :cond_1
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    .line 134
    monitor-exit p0

    .line 135
    new-instance v0, Lh6/g;

    .line 136
    .line 137
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->a()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->d()Li6/h;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    iget-boolean v5, v12, Lh6/e;->a:Z

    .line 146
    .line 147
    invoke-virtual/range {p2 .. p2}, Lh6/d$d;->a()Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    xor-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    invoke-virtual {v12, v1}, Lh6/e;->a(Z)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    move-object v1, v0

    .line 158
    move-object/from16 v4, p0

    .line 159
    .line 160
    invoke-direct/range {v1 .. v6}, Lh6/g;-><init>(ZLi6/h;Lh6/g$a;ZZ)V

    .line 161
    .line 162
    .line 163
    iput-object v0, v10, Lh6/d;->d:Lh6/g;

    .line 164
    .line 165
    return-void

    .line 166
    :goto_1
    monitor-exit p0

    .line 167
    throw v0
.end method

.method public final u()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lh6/d;->m:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lh6/d;->d:Lh6/g;

    .line 7
    .line 8
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lh6/g;->a()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final x()Z
    .locals 27

    move-object/from16 v15, p0

    .line 1
    new-instance v0, Lw5/v;

    invoke-direct {v0}, Lw5/v;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lw5/v;->m:Ljava/lang/Object;

    new-instance v14, Lw5/t;

    invoke-direct {v14}, Lw5/t;-><init>()V

    const/4 v2, -0x1

    iput v2, v14, Lw5/t;->m:I

    new-instance v13, Lw5/v;

    invoke-direct {v13}, Lw5/v;-><init>()V

    iput-object v1, v13, Lw5/v;->m:Ljava/lang/Object;

    new-instance v12, Lw5/v;

    invoke-direct {v12}, Lw5/v;-><init>()V

    iput-object v1, v12, Lw5/v;->m:Ljava/lang/Object;

    new-instance v11, Lw5/v;

    invoke-direct {v11}, Lw5/v;-><init>()V

    iput-object v1, v11, Lw5/v;->m:Ljava/lang/Object;

    new-instance v10, Lw5/v;

    invoke-direct {v10}, Lw5/v;-><init>()V

    iput-object v1, v10, Lw5/v;->m:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-boolean v3, v15, Lh6/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    monitor-exit p0

    return v4

    :cond_0
    :try_start_1
    iget-object v9, v15, Lh6/d;->e:Lh6/h;

    iget-object v3, v15, Lh6/d;->i:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Li6/i;

    if-nez v8, :cond_1

    iget-object v3, v15, Lh6/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lw5/v;->m:Ljava/lang/Object;

    instance-of v5, v3, Lh6/d$a;

    if-eqz v5, :cond_4

    iget v3, v15, Lh6/d;->m:I

    iput v3, v14, Lw5/t;->m:I

    iget-object v4, v15, Lh6/d;->n:Ljava/lang/String;

    iput-object v4, v13, Lw5/v;->m:Ljava/lang/Object;

    if-eq v3, v2, :cond_2

    iget-object v2, v15, Lh6/d;->h:Lh6/d$d;

    iput-object v2, v12, Lw5/v;->m:Ljava/lang/Object;

    iput-object v1, v15, Lh6/d;->h:Lh6/d$d;

    iget-object v2, v15, Lh6/d;->d:Lh6/g;

    iput-object v2, v11, Lw5/v;->m:Ljava/lang/Object;

    iput-object v1, v15, Lh6/d;->d:Lh6/g;

    iget-object v2, v15, Lh6/d;->e:Lh6/h;

    iput-object v2, v10, Lw5/v;->m:Ljava/lang/Object;

    iput-object v1, v15, Lh6/d;->e:Lh6/h;

    iget-object v1, v15, Lh6/d;->f:LX5/d;

    invoke-virtual {v1}, LX5/d;->n()V

    :cond_1
    move-object/from16 v16, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    move-object/from16 v26, v14

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    iget-object v1, v0, Lw5/v;->m:Ljava/lang/Object;

    if-eqz v1, :cond_3

    check-cast v1, Lh6/d$a;

    invoke-virtual {v1}, Lh6/d$a;->a()J

    move-result-wide v1

    iget-object v7, v15, Lh6/d;->f:LX5/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v15, Lh6/d;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " cancel"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v5

    new-instance v3, Lh6/d$h;

    const/16 v16, 0x1

    move-object v1, v3

    move-object v2, v4

    move-object/from16 v17, v3

    move/from16 v3, v16

    move-wide/from16 v18, v5

    move/from16 v5, v16

    move-object/from16 v6, p0

    move-object/from16 v20, v7

    move-object v7, v9

    move-object/from16 v16, v8

    move-object/from16 v21, v9

    move-object v9, v0

    move-object/from16 v22, v10

    move-object v10, v14

    move-object/from16 v23, v11

    move-object v11, v13

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    move-object/from16 v13, v23

    move-object/from16 v26, v14

    move-object/from16 v14, v22

    invoke-direct/range {v1 .. v14}, Lh6/d$h;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLh6/d;Lh6/h;Li6/i;Lw5/v;Lw5/t;Lw5/v;Lw5/v;Lw5/v;Lw5/v;)V

    move-object/from16 v4, v17

    move-wide/from16 v2, v18

    move-object/from16 v1, v20

    invoke-virtual {v1, v4, v2, v3}, LX5/d;->i(LX5/a;J)V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    move-object/from16 v16, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    move-object/from16 v26, v14

    if-nez v3, :cond_5

    monitor-exit p0

    return v4

    :cond_5
    :goto_0
    :try_start_2
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    move-object/from16 v3, v16

    if-eqz v3, :cond_6

    :try_start_3
    invoke-static/range {v21 .. v21}, Lw5/k;->c(Ljava/lang/Object;)V

    move-object/from16 v1, v21

    invoke-virtual {v1, v3}, Lh6/h;->f(Li6/i;)V

    :goto_1
    move-object/from16 v1, v24

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v1, v24

    goto/16 :goto_3

    :cond_6
    move-object/from16 v1, v21

    iget-object v0, v0, Lw5/v;->m:Ljava/lang/Object;

    instance-of v2, v0, Lh6/d$c;

    if-eqz v2, :cond_8

    if-eqz v0, :cond_7

    check-cast v0, Lh6/d$c;

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lh6/d$c;->b()I

    move-result v2

    invoke-virtual {v0}, Lh6/d$c;->a()Li6/i;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lh6/h;->d(ILi6/i;)V

    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-wide v1, v15, Lh6/d;->k:J

    invoke-virtual {v0}, Lh6/d$c;->a()Li6/i;

    move-result-object v0

    invoke-virtual {v0}, Li6/i;->C()I

    move-result v0

    int-to-long v3, v0

    sub-long/2addr v1, v3

    iput-wide v1, v15, Lh6/d;->k:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit p0

    goto :goto_1

    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    instance-of v2, v0, Lh6/d$a;

    if-eqz v2, :cond_e

    if-eqz v0, :cond_d

    check-cast v0, Lh6/d$a;

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lh6/d$a;->b()I

    move-result v2

    invoke-virtual {v0}, Lh6/d$a;->c()Li6/i;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lh6/h;->a(ILi6/i;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object/from16 v1, v24

    :try_start_6
    iget-object v0, v1, Lw5/v;->m:Ljava/lang/Object;

    check-cast v0, Lh6/d$d;

    if-eqz v0, :cond_9

    iget-object v0, v15, Lh6/d;->u:LT5/I;

    move-object/from16 v2, v26

    iget v2, v2, Lw5/t;->m:I

    move-object/from16 v3, v25

    iget-object v3, v3, Lw5/v;->m:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v15, v2, v3}, LT5/I;->a(LT5/H;ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    goto :goto_3

    :cond_9
    :goto_2
    iget-object v0, v1, Lw5/v;->m:Ljava/lang/Object;

    check-cast v0, Lh6/d$d;

    if-eqz v0, :cond_a

    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_a
    move-object/from16 v2, v23

    iget-object v0, v2, Lw5/v;->m:Ljava/lang/Object;

    check-cast v0, Lh6/g;

    if-eqz v0, :cond_b

    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_b
    move-object/from16 v3, v22

    iget-object v0, v3, Lw5/v;->m:Ljava/lang/Object;

    check-cast v0, Lh6/h;

    if-eqz v0, :cond_c

    invoke-static {v0}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_c
    const/4 v0, 0x1

    return v0

    :cond_d
    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v1, v24

    :try_start_7
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v4, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    invoke-direct {v0, v4}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_4
    move-exception v0

    goto :goto_3

    :cond_e
    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v1, v24

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :goto_3
    iget-object v1, v1, Lw5/v;->m:Ljava/lang/Object;

    check-cast v1, Lh6/d$d;

    if-eqz v1, :cond_f

    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_f
    iget-object v1, v2, Lw5/v;->m:Ljava/lang/Object;

    check-cast v1, Lh6/g;

    if-eqz v1, :cond_10

    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_10
    iget-object v1, v3, Lw5/v;->m:Ljava/lang/Object;

    check-cast v1, Lh6/h;

    if-eqz v1, :cond_11

    invoke-static {v1}, LU5/c;->j(Ljava/io/Closeable;)V

    :cond_11
    throw v0

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public final y()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh6/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lh6/d;->e:Lh6/h;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-boolean v1, p0, Lh6/d;->s:Z

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v1, p0, Lh6/d;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    move v1, v2

    .line 23
    :goto_0
    iget v3, p0, Lh6/d;->p:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    add-int/2addr v3, v4

    .line 27
    iput v3, p0, Lh6/d;->p:I

    .line 28
    .line 29
    iput-boolean v4, p0, Lh6/d;->s:Z

    .line 30
    .line 31
    sget-object v3, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/net/SocketTimeoutException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v5, "sent ping but didn\'t receive pong within "

    .line 45
    .line 46
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-wide v5, p0, Lh6/d;->w:J

    .line 50
    .line 51
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v5, "ms (after "

    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sub-int/2addr v1, v4

    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " successful ping/pongs)"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, v3}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    :try_start_2
    sget-object v1, Li6/i;->p:Li6/i;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lh6/h;->e(Li6/i;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-exception v0

    .line 86
    invoke-virtual {p0, v0, v3}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :cond_3
    monitor-exit p0

    .line 91
    return-void

    .line 92
    :goto_2
    monitor-exit p0

    .line 93
    throw v0
.end method
