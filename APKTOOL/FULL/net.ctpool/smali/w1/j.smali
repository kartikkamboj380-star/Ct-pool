.class public final Lw1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/j$a;
    }
.end annotation


# static fields
.field public static final h:Lw1/j$a;

.field private static final i:Ljava/lang/Class;


# instance fields
.field private final a:LJ0/n;

.field private final b:LR0/i;

.field private final c:LR0/l;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lw1/t;

.field private final g:Lw1/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw1/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw1/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw1/j;->h:Lw1/j$a;

    .line 8
    .line 9
    const-class v0, Lw1/j;

    .line 10
    .line 11
    sput-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(LJ0/n;LR0/i;LR0/l;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lw1/t;)V
    .locals 1

    .line 1
    const-string v0, "fileCache"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pooledByteBufferFactory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "pooledByteStreams"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "readExecutor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "writeExecutor"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "imageCacheStatsTracker"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lw1/j;->a:LJ0/n;

    .line 35
    .line 36
    iput-object p2, p0, Lw1/j;->b:LR0/i;

    .line 37
    .line 38
    iput-object p3, p0, Lw1/j;->c:LR0/l;

    .line 39
    .line 40
    iput-object p4, p0, Lw1/j;->d:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    iput-object p5, p0, Lw1/j;->e:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    iput-object p6, p0, Lw1/j;->f:Lw1/t;

    .line 45
    .line 46
    invoke-static {}, Lw1/C;->d()Lw1/C;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "getInstance()"

    .line 51
    .line 52
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lw1/j;->g:Lw1/C;

    .line 56
    .line 57
    return-void
.end method

.method public static synthetic a(LD1/g;Lw1/j;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/j;->v(LD1/g;Lw1/j;Ljava/io/OutputStream;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lw1/j;LI0/d;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lw1/j;->t(Ljava/lang/Object;Lw1/j;LI0/d;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lw1/j;->q(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;Lw1/j;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw1/j;->i(Ljava/lang/Object;Lw1/j;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)LD1/g;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lw1/j;->o(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)LD1/g;

    move-result-object p0

    return-object p0
.end method

.method private final g(LI0/d;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw1/C;->c(LI0/d;)LD1/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LD1/g;->close()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "Found image for %s in staging area"

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lw1/j;->f:Lw1/t;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lw1/t;->m(LI0/d;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "Did not find image for %s in staging area"

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lw1/j;->f:Lw1/t;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Lw1/t;->b(LI0/d;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    iget-object v0, p0, Lw1/j;->a:LJ0/n;

    .line 47
    .line 48
    invoke-interface {v0, p1}, LJ0/n;->g(LI0/d;)Z

    .line 49
    .line 50
    .line 51
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    const/4 p1, 0x0

    .line 54
    :goto_0
    return p1
.end method

.method private static final i(Ljava/lang/Object;Lw1/j;)Ljava/lang/Void;
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p0, v0}, LE1/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :try_start_0
    iget-object v2, p1, Lw1/j;->g:Lw1/C;

    .line 12
    .line 13
    invoke-virtual {v2}, Lw1/C;->a()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lw1/j;->a:LJ0/n;

    .line 17
    .line 18
    invoke-interface {p1}, LJ0/n;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    invoke-static {p0, p1}, LE1/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    :catchall_1
    move-exception p0

    .line 31
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    throw p0
.end method

.method private final l(LI0/d;LD1/g;)Lx0/f;
    .locals 3

    .line 1
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "Found image for %s in staging area"

    .line 8
    .line 9
    invoke-static {v0, v2, v1}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lw1/j;->f:Lw1/t;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lw1/t;->m(LI0/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lx0/f;->h(Ljava/lang/Object;)Lx0/f;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "forResult(pinnedImage)"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method private final n(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "BufferedDiskCache_getAsync"

    .line 2
    .line 3
    invoke-static {v0}, LE1/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lw1/e;

    .line 8
    .line 9
    invoke-direct {v1, v0, p2, p0, p1}, Lw1/e;-><init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lw1/j;->d:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    invoke-static {v1, p2}, Lx0/f;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lx0/f;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "{\n      val token = Fres\u2026      readExecutor)\n    }"

    .line 19
    .line 20
    invoke-static {p2, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p2

    .line 25
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "Failed to schedule disk-cache read for %s"

    .line 36
    .line 37
    invoke-static {v0, p2, v1, p1}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, Lx0/f;->g(Ljava/lang/Exception;)Lx0/f;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string p1, "{\n      // Log failure\n \u2026forError(exception)\n    }"

    .line 45
    .line 46
    invoke-static {p2, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object p2
.end method

.method private static final o(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lw1/j;LI0/d;)LD1/g;
    .locals 4

    .line 1
    const-string v0, "$isCancelled"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$key"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {p0, v0}, LE1/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-object p1, p2, Lw1/j;->g:Lw1/C;

    .line 28
    .line 29
    invoke-virtual {p1, p3}, Lw1/C;->c(LI0/d;)LD1/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 36
    .line 37
    const-string v2, "Found image for %s in staging area"

    .line 38
    .line 39
    invoke-interface {p3}, LI0/d;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v0, v2, v3}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p2, Lw1/j;->f:Lw1/t;

    .line 47
    .line 48
    invoke-interface {p2, p3}, Lw1/t;->m(LI0/d;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    sget-object p1, Lw1/j;->i:Ljava/lang/Class;

    .line 55
    .line 56
    const-string v2, "Did not find image for %s in staging area"

    .line 57
    .line 58
    invoke-interface {p3}, LI0/d;->c()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {p1, v2, v3}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p2, Lw1/j;->f:Lw1/t;

    .line 66
    .line 67
    invoke-interface {p1, p3}, Lw1/t;->b(LI0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-direct {p2, p3}, Lw1/j;->r(LI0/d;)LR0/h;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    :try_start_2
    invoke-static {p1}, LS0/a;->J(Ljava/io/Closeable;)LS0/a;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "of(buffer)"

    .line 85
    .line 86
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    .line 88
    .line 89
    :try_start_3
    new-instance p2, LD1/g;

    .line 90
    .line 91
    invoke-direct {p2, p1}, LD1/g;-><init>(LS0/a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 92
    .line 93
    .line 94
    :try_start_4
    invoke-static {p1}, LS0/a;->g(LS0/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    .line 96
    .line 97
    move-object p1, p2

    .line 98
    :goto_0
    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 99
    .line 100
    .line 101
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 102
    if-nez p2, :cond_2

    .line 103
    .line 104
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :cond_2
    :try_start_6
    sget-object p2, Lw1/j;->i:Ljava/lang/Class;

    .line 109
    .line 110
    const-string p3, "Host thread was interrupted, decreasing reference count"

    .line 111
    .line 112
    invoke-static {p2, p3}, LP0/a;->v(Ljava/lang/Class;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, LD1/g;->close()V

    .line 116
    .line 117
    .line 118
    new-instance p1, Ljava/lang/InterruptedException;

    .line 119
    .line 120
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 121
    .line 122
    .line 123
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 124
    :catchall_1
    move-exception p2

    .line 125
    :try_start_7
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 126
    .line 127
    .line 128
    throw p2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 129
    :catch_0
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_3
    :try_start_8
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 139
    :goto_1
    :try_start_9
    invoke-static {p0, p1}, LE1/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 143
    :catchall_2
    move-exception p0

    .line 144
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw p0
.end method

.method private static final q(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$key"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, LE1/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :try_start_0
    invoke-direct {p1, p2, p3}, Lw1/j;->u(LI0/d;LD1/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    iget-object p0, p1, Lw1/j;->g:Lw1/C;

    .line 20
    .line 21
    invoke-static {p3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p2, p3}, Lw1/C;->h(LI0/d;LD1/g;)Z

    .line 25
    .line 26
    .line 27
    invoke-static {p3}, LD1/g;->d(LD1/g;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, LE1/a;->f(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    invoke-static {p0, v1}, LE1/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    :catchall_1
    move-exception p0

    .line 40
    iget-object p1, p1, Lw1/j;->g:Lw1/C;

    .line 41
    .line 42
    invoke-static {p3}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2, p3}, Lw1/C;->h(LI0/d;LD1/g;)Z

    .line 46
    .line 47
    .line 48
    invoke-static {p3}, LD1/g;->d(LD1/g;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, LE1/a;->f(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method private final r(LI0/d;)LR0/h;
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "Disk cache read for %s"

    .line 4
    .line 5
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v0, v1, v2}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lw1/j;->a:LJ0/n;

    .line 13
    .line 14
    invoke-interface {v1, p1}, LJ0/n;->e(LI0/d;)LH0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "Disk cache miss for %s"

    .line 21
    .line 22
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v1, v2}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lw1/j;->f:Lw1/t;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lw1/t;->c(LI0/d;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return-object p1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v2, "Found entry in disk cache for %s"

    .line 39
    .line 40
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v0, v2, v3}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lw1/j;->f:Lw1/t;

    .line 48
    .line 49
    invoke-interface {v2, p1}, Lw1/t;->f(LI0/d;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, LH0/a;->a()Ljava/io/InputStream;

    .line 53
    .line 54
    .line 55
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :try_start_1
    iget-object v3, p0, Lw1/j;->b:LR0/i;

    .line 57
    .line 58
    invoke-interface {v1}, LH0/a;->size()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    long-to-int v1, v4

    .line 63
    invoke-interface {v3, v2, v1}, LR0/i;->d(Ljava/io/InputStream;I)LR0/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 68
    .line 69
    .line 70
    const-string v2, "Successful read from disk cache for %s"

    .line 71
    .line 72
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {v0, v2, v3}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 82
    .line 83
    .line 84
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    :goto_0
    sget-object v1, Lw1/j;->i:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-string v3, "Exception reading from cache for %s"

    .line 96
    .line 97
    invoke-static {v1, v0, v3, v2}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Lw1/j;->f:Lw1/t;

    .line 101
    .line 102
    invoke-interface {v1, p1}, Lw1/t;->j(LI0/d;)V

    .line 103
    .line 104
    .line 105
    throw v0
.end method

.method private static final t(Ljava/lang/Object;Lw1/j;LI0/d;)Ljava/lang/Void;
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$key"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, LE1/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :try_start_0
    iget-object v2, p1, Lw1/j;->g:Lw1/C;

    .line 17
    .line 18
    invoke-virtual {v2, p2}, Lw1/C;->g(LI0/d;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Lw1/j;->a:LJ0/n;

    .line 22
    .line 23
    invoke-interface {p1, p2}, LJ0/n;->b(LI0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    invoke-static {p0, p1}, LE1/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :catchall_1
    move-exception p0

    .line 36
    invoke-static {v1}, LE1/a;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw p0
.end method

.method private final u(LI0/d;LD1/g;)V
    .locals 3

    .line 1
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "About to write to disk-cache for key %s"

    .line 8
    .line 9
    invoke-static {v0, v2, v1}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    iget-object v1, p0, Lw1/j;->a:LJ0/n;

    .line 13
    .line 14
    new-instance v2, Lw1/i;

    .line 15
    .line 16
    invoke-direct {v2, p2, p0}, Lw1/i;-><init>(LD1/g;Lw1/j;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1, v2}, LJ0/n;->d(LI0/d;LI0/j;)LH0/a;

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Lw1/j;->f:Lw1/t;

    .line 23
    .line 24
    invoke-interface {p2, p1}, Lw1/t;->l(LI0/d;)V

    .line 25
    .line 26
    .line 27
    const-string p2, "Successful disk-cache write for key %s"

    .line 28
    .line 29
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, p2, v1}, LP0/a;->w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p2

    .line 38
    sget-object v0, Lw1/j;->i:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v1, "Failed to write to disk-cache for key %s"

    .line 49
    .line 50
    invoke-static {v0, p2, v1, p1}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void
.end method

.method private static final v(LD1/g;Lw1/j;Ljava/io/OutputStream;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "os"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LD1/g;->o()Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Lw1/j;->c:LR0/l;

    .line 21
    .line 22
    invoke-virtual {p1, p0, p2}, LR0/l;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string p1, "Required value was null."

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p0
.end method


# virtual methods
.method public final f(LI0/d;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/j;->a:LJ0/n;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LJ0/n;->f(LI0/d;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final h()Lx0/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw1/C;->a()V

    .line 4
    .line 5
    .line 6
    const-string v0, "BufferedDiskCache_clearAll"

    .line 7
    .line 8
    invoke-static {v0}, LE1/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    new-instance v1, Lw1/f;

    .line 13
    .line 14
    invoke-direct {v1, v0, p0}, Lw1/f;-><init>(Ljava/lang/Object;Lw1/j;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lw1/j;->e:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lx0/f;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lx0/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "{\n      Task.call(\n     \u2026     writeExecutor)\n    }"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    sget-object v1, Lw1/j;->i:Ljava/lang/Class;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    new-array v2, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v3, "Failed to schedule disk-cache clear"

    .line 36
    .line 37
    invoke-static {v1, v0, v3, v2}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lx0/f;->g(Ljava/lang/Exception;)Lx0/f;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "{\n      // Log failure\n \u2026forError(exception)\n    }"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v0
.end method

.method public final j(LI0/d;)Z
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lw1/C;->b(LI0/d;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lw1/j;->a:LJ0/n;

    .line 15
    .line 16
    invoke-interface {v0, p1}, LJ0/n;->c(LI0/d;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 26
    :goto_1
    return p1
.end method

.method public final k(LI0/d;)Z
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lw1/j;->j(LI0/d;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Lw1/j;->g(LI0/d;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    :goto_0
    return p1
.end method

.method public final m(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "isCancelled"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LK1/b;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lw1/C;->c(LI0/d;)LD1/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-direct {p0, p1, v0}, Lw1/j;->l(LI0/d;LD1/g;)Lx0/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_4

    .line 30
    .line 31
    :cond_0
    invoke-direct {p0, p1, p2}, Lw1/j;->n(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-string v0, "BufferedDiskCache#get"

    .line 37
    .line 38
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lw1/C;->c(LI0/d;)LD1/g;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-direct {p0, p1, v0}, Lw1/j;->l(LI0/d;LD1/g;)Lx0/f;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    :goto_0
    invoke-direct {p0, p1, p2}, Lw1/j;->n(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    move-object v0, p1

    .line 63
    :cond_3
    invoke-static {}, LK1/b;->b()V

    .line 64
    .line 65
    .line 66
    :cond_4
    :goto_1
    return-object v0

    .line 67
    :goto_2
    invoke-static {}, LK1/b;->b()V

    .line 68
    .line 69
    .line 70
    throw p1
.end method

.method public final p(LI0/d;LD1/g;)V
    .locals 5

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "encodedImage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LK1/b;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "Failed to schedule disk-cache write for %s"

    .line 16
    .line 17
    const-string v2, "BufferedDiskCache_putAsync"

    .line 18
    .line 19
    const-string v3, "Check failed."

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-static {p2}, LD1/g;->j0(LD1/g;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lw1/C;->f(LI0/d;LD1/g;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2}, LD1/g;->b(LD1/g;)LD1/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :try_start_0
    invoke-static {v2}, LE1/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v3, p0, Lw1/j;->e:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    new-instance v4, Lw1/g;

    .line 45
    .line 46
    invoke-direct {v4, v2, p0, p1, v0}, Lw1/g;-><init>(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v2

    .line 54
    sget-object v3, Lw1/j;->i:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v3, v2, v1, v4}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lw1/j;->g:Lw1/C;

    .line 68
    .line 69
    invoke-virtual {v1, p1, p2}, Lw1/C;->h(LI0/d;LD1/g;)Z

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, LD1/g;->d(LD1/g;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_1
    const-string v0, "BufferedDiskCache#put"

    .line 87
    .line 88
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :try_start_1
    invoke-static {p2}, LD1/g;->j0(LD1/g;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 98
    .line 99
    invoke-virtual {v0, p1, p2}, Lw1/C;->f(LI0/d;LD1/g;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p2}, LD1/g;->b(LD1/g;)LD1/g;

    .line 103
    .line 104
    .line 105
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :try_start_2
    invoke-static {v2}, LE1/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v3, p0, Lw1/j;->e:Ljava/util/concurrent/Executor;

    .line 111
    .line 112
    new-instance v4, Lw1/g;

    .line 113
    .line 114
    invoke-direct {v4, v2, p0, p1, v0}, Lw1/g;-><init>(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catchall_0
    move-exception p1

    .line 122
    goto :goto_2

    .line 123
    :catch_1
    move-exception v2

    .line 124
    :try_start_3
    sget-object v3, Lw1/j;->i:Ljava/lang/Class;

    .line 125
    .line 126
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v3, v2, v1, v4}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lw1/j;->g:Lw1/C;

    .line 138
    .line 139
    invoke-virtual {v1, p1, p2}, Lw1/C;->h(LI0/d;LD1/g;)Z

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, LD1/g;->d(LD1/g;)V

    .line 143
    .line 144
    .line 145
    :goto_0
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    .line 147
    invoke-static {}, LK1/b;->b()V

    .line 148
    .line 149
    .line 150
    :goto_1
    return-void

    .line 151
    :cond_2
    :try_start_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 161
    :goto_2
    invoke-static {}, LK1/b;->b()V

    .line 162
    .line 163
    .line 164
    throw p1
.end method

.method public final s(LI0/d;)Lx0/f;
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw1/j;->g:Lw1/C;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lw1/C;->g(LI0/d;)Z

    .line 9
    .line 10
    .line 11
    :try_start_0
    const-string v0, "BufferedDiskCache_remove"

    .line 12
    .line 13
    invoke-static {v0}, LE1/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lw1/h;

    .line 18
    .line 19
    invoke-direct {v1, v0, p0, p1}, Lw1/h;-><init>(Ljava/lang/Object;Lw1/j;LI0/d;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lw1/j;->e:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    invoke-static {v1, v0}, Lx0/f;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lx0/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "{\n      val token = Fres\u2026     writeExecutor)\n    }"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    sget-object v1, Lw1/j;->i:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-interface {p1}, LI0/d;->c()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "Failed to schedule disk-cache remove for %s"

    .line 46
    .line 47
    invoke-static {v1, v0, v2, p1}, LP0/a;->F(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lx0/f;->g(Ljava/lang/Exception;)Lx0/f;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string p1, "{\n      // Log failure\n \u2026forError(exception)\n    }"

    .line 55
    .line 56
    invoke-static {v0, p1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-object v0
.end method
