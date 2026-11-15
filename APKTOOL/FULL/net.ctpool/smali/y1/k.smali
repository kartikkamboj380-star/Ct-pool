.class public final Ly1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/k$a;,
        Ly1/k$b;
    }
.end annotation


# static fields
.field public static final o:Ly1/k$a;

.field private static final p:Ljava/util/concurrent/CancellationException;

.field private static final q:Ljava/util/concurrent/CancellationException;


# instance fields
.field private final a:Ly1/t;

.field private final b:LO0/o;

.field private final c:LF1/e;

.field private final d:LF1/d;

.field private final e:Lw1/x;

.field private final f:Lw1/x;

.field private final g:Lw1/j;

.field private final h:Lw1/j;

.field private final i:Lw1/k;

.field private final j:Lcom/facebook/imagepipeline/producers/p0;

.field private final k:LO0/o;

.field private final l:Ljava/util/concurrent/atomic/AtomicLong;

.field private final m:LO0/o;

.field private final n:Ly1/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly1/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly1/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly1/k;->o:Ly1/k$a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 10
    .line 11
    const-string v1, "Prefetching is not enabled"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ly1/k;->p:Ljava/util/concurrent/CancellationException;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    const-string v1, "ImageRequest is null"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ly1/k;->q:Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ly1/t;Ljava/util/Set;Ljava/util/Set;LO0/o;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lcom/facebook/imagepipeline/producers/p0;LO0/o;LO0/o;LK0/a;Ly1/m;)V
    .locals 0

    .line 1
    const-string p13, "producerSequenceFactory"

    invoke-static {p1, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "requestListeners"

    invoke-static {p2, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "requestListener2s"

    invoke-static {p3, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "isPrefetchEnabledSupplier"

    invoke-static {p4, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "bitmapMemoryCache"

    invoke-static {p5, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "encodedMemoryCache"

    invoke-static {p6, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "mainBufferedDiskCache"

    invoke-static {p7, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "smallImageBufferedDiskCache"

    invoke-static {p8, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "cacheKeyFactory"

    invoke-static {p9, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "threadHandoffProducerQueue"

    invoke-static {p10, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "suppressBitmapPrefetchingSupplier"

    invoke-static {p11, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "lazyDataSource"

    invoke-static {p12, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p13, "config"

    invoke-static {p14, p13}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/k;->a:Ly1/t;

    iput-object p4, p0, Ly1/k;->b:LO0/o;

    new-instance p1, LF1/c;

    invoke-direct {p1, p2}, LF1/c;-><init>(Ljava/util/Set;)V

    iput-object p1, p0, Ly1/k;->c:LF1/e;

    new-instance p1, LF1/b;

    invoke-direct {p1, p3}, LF1/b;-><init>(Ljava/util/Set;)V

    iput-object p1, p0, Ly1/k;->d:LF1/d;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Ly1/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p5, p0, Ly1/k;->e:Lw1/x;

    iput-object p6, p0, Ly1/k;->f:Lw1/x;

    iput-object p7, p0, Ly1/k;->g:Lw1/j;

    iput-object p8, p0, Ly1/k;->h:Lw1/j;

    iput-object p9, p0, Ly1/k;->i:Lw1/k;

    iput-object p10, p0, Ly1/k;->j:Lcom/facebook/imagepipeline/producers/p0;

    iput-object p11, p0, Ly1/k;->k:LO0/o;

    iput-object p12, p0, Ly1/k;->m:LO0/o;

    iput-object p14, p0, Ly1/k;->n:Ly1/m;

    return-void
.end method

.method private final A(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;Lx1/e;LF1/e;)LY0/c;
    .locals 13

    .line 1
    move-object v1, p0

    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/F;

    .line 3
    .line 4
    move-object v3, p2

    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual {p0, p2, v2}, Ly1/k;->o(LJ1/b;LF1/e;)LF1/e;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v4, v1, Ly1/k;->d:LF1/d;

    .line 12
    .line 13
    invoke-direct {v0, v2, v4}, Lcom/facebook/imagepipeline/producers/F;-><init>(LF1/e;LF1/d;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p2}, LJ1/b;->j()LJ1/b$c;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object/from16 v4, p3

    .line 21
    .line 22
    invoke-static {v2, v4}, LJ1/b$c;->e(LJ1/b$c;LJ1/b$c;)LJ1/b$c;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v2, "getMax(\n              im\u2026ttedRequestLevelOnSubmit)"

    .line 27
    .line 28
    invoke-static {v7, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v12, Lcom/facebook/imagepipeline/producers/l0;

    .line 32
    .line 33
    invoke-virtual {p0}, Ly1/k;->l()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v2, v1, Ly1/k;->n:Ly1/m;

    .line 38
    .line 39
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, Ly1/n;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v5, 0x1

    .line 50
    if-ne v2, v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2}, LJ1/b;->o()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    move v9, v5

    .line 59
    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/4 v2, 0x0

    .line 63
    move v9, v2

    .line 64
    :goto_0
    iget-object v11, v1, Ly1/k;->n:Ly1/m;

    .line 65
    .line 66
    const/4 v8, 0x1

    .line 67
    move-object v2, v12

    .line 68
    move-object v3, p2

    .line 69
    move-object v5, v0

    .line 70
    move-object/from16 v6, p4

    .line 71
    .line 72
    move-object/from16 v10, p5

    .line 73
    .line 74
    invoke-direct/range {v2 .. v11}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LJ1/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    .line 75
    .line 76
    .line 77
    sget-object v2, Lz1/d;->j:Lz1/d$a;

    .line 78
    .line 79
    move-object v3, p1

    .line 80
    invoke-virtual {v2, p1, v12, v0}, Lz1/d$a;->a(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)LY0/c;

    .line 81
    .line 82
    .line 83
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_2

    .line 85
    :goto_1
    invoke-static {v0}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v2, "{\n      DataSources.imme\u2026taSource(exception)\n    }"

    .line 90
    .line 91
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    return-object v0
.end method

.method public static synthetic a(LI0/d;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ly1/k;->f(LI0/d;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Landroid/net/Uri;LI0/d;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly1/k;->v(Landroid/net/Uri;LI0/d;)Z

    move-result p0

    return p0
.end method

.method private static final f(LI0/d;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method public static synthetic j(Ly1/k;LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;ILjava/lang/Object;)LY0/c;
    .locals 7

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object v4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v4, p3

    .line 9
    :goto_0
    and-int/lit8 p3, p6, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v5, p4

    .line 16
    :goto_1
    and-int/lit8 p3, p6, 0x10

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    move-object v6, v0

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    move-object v6, p5

    .line 23
    :goto_2
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    invoke-virtual/range {v1 .. v6}, Ly1/k;->i(LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;)LY0/c;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method private final u(Landroid/net/Uri;)LO0/m;
    .locals 1

    .line 1
    new-instance v0, Ly1/i;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly1/i;-><init>(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final v(Landroid/net/Uri;LI0/d;)Z
    .locals 1

    .line 1
    const-string v0, "$uri"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "key"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0}, LI0/d;->a(Landroid/net/Uri;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method private final y(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;LF1/e;Ljava/lang/String;)LY0/c;
    .locals 8

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v7}, Ly1/k;->z(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;LF1/e;Ljava/lang/String;Ljava/util/Map;)LY0/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final z(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;LF1/e;Ljava/lang/String;Ljava/util/Map;)LY0/c;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move-object/from16 v13, p7

    .line 12
    .line 13
    invoke-static {}, LK1/b;->d()Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const-string v14, "{\n          DataSources.\u2026urce(exception)\n        }"

    .line 18
    .line 19
    const-string v15, "{\n          val lowestPe\u2026questListener2)\n        }"

    .line 20
    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, 0x0

    .line 23
    const-string v8, "getMax(\n                \u2026ttedRequestLevelOnSubmit)"

    .line 24
    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    new-instance v12, Lcom/facebook/imagepipeline/producers/F;

    .line 28
    .line 29
    invoke-virtual {v1, v3, v4}, Ly1/k;->o(LJ1/b;LF1/e;)LF1/e;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, v1, Ly1/k;->d:LF1/d;

    .line 34
    .line 35
    invoke-direct {v12, v4, v5}, Lcom/facebook/imagepipeline/producers/F;-><init>(LF1/e;LF1/d;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-virtual/range {p2 .. p2}, LJ1/b;->j()LJ1/b$c;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v2}, LJ1/b$c;->e(LJ1/b$c;LJ1/b$c;)LJ1/b$c;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-static {v9, v8}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v11, Lcom/facebook/imagepipeline/producers/l0;

    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, Ly1/k;->l()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual/range {p2 .. p2}, LJ1/b;->o()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    invoke-virtual/range {p2 .. p2}, LJ1/b;->u()Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, LW0/f;->n(Landroid/net/Uri;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v10, v7

    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception v0

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    :goto_0
    move v10, v6

    .line 77
    :goto_1
    invoke-virtual/range {p2 .. p2}, LJ1/b;->n()Lx1/e;

    .line 78
    .line 79
    .line 80
    move-result-object v16

    .line 81
    iget-object v8, v1, Ly1/k;->n:Ly1/m;

    .line 82
    .line 83
    const/16 v17, 0x0

    .line 84
    .line 85
    move-object v2, v11

    .line 86
    move-object/from16 v3, p2

    .line 87
    .line 88
    move-object/from16 v5, p6

    .line 89
    .line 90
    move-object v6, v12

    .line 91
    move-object/from16 v7, p4

    .line 92
    .line 93
    move-object/from16 v18, v8

    .line 94
    .line 95
    move-object v8, v9

    .line 96
    move/from16 v9, v17

    .line 97
    .line 98
    move-object/from16 v19, v11

    .line 99
    .line 100
    move-object/from16 v11, v16

    .line 101
    .line 102
    move-object v1, v12

    .line 103
    move-object/from16 v12, v18

    .line 104
    .line 105
    invoke-direct/range {v2 .. v12}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v2, v19

    .line 109
    .line 110
    invoke-virtual {v2, v13}, Lcom/facebook/imagepipeline/producers/e;->j(Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2, v1}, Lz1/c;->H(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)LY0/c;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0, v15}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_2
    invoke-static {v0}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0, v14}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    return-object v0

    .line 129
    :cond_2
    const-string v1, "ImagePipeline#submitFetchRequest"

    .line 130
    .line 131
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :try_start_1
    new-instance v1, Lcom/facebook/imagepipeline/producers/F;

    .line 135
    .line 136
    move-object/from16 v12, p0

    .line 137
    .line 138
    invoke-virtual {v12, v3, v4}, Ly1/k;->o(LJ1/b;LF1/e;)LF1/e;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    iget-object v5, v12, Ly1/k;->d:LF1/d;

    .line 143
    .line 144
    invoke-direct {v1, v4, v5}, Lcom/facebook/imagepipeline/producers/F;-><init>(LF1/e;LF1/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    .line 147
    :try_start_2
    invoke-virtual/range {p2 .. p2}, LJ1/b;->j()LJ1/b$c;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v4, v2}, LJ1/b$c;->e(LJ1/b$c;LJ1/b$c;)LJ1/b$c;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-static {v9, v8}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v11, Lcom/facebook/imagepipeline/producers/l0;

    .line 159
    .line 160
    invoke-virtual/range {p0 .. p0}, Ly1/k;->l()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual/range {p2 .. p2}, LJ1/b;->o()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_4

    .line 169
    .line 170
    invoke-virtual/range {p2 .. p2}, LJ1/b;->u()Landroid/net/Uri;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-static {v2}, LW0/f;->n(Landroid/net/Uri;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_3

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_3
    move v10, v7

    .line 182
    goto :goto_5

    .line 183
    :catchall_0
    move-exception v0

    .line 184
    goto :goto_8

    .line 185
    :catch_1
    move-exception v0

    .line 186
    goto :goto_6

    .line 187
    :cond_4
    :goto_4
    move v10, v6

    .line 188
    :goto_5
    invoke-virtual/range {p2 .. p2}, LJ1/b;->n()Lx1/e;

    .line 189
    .line 190
    .line 191
    move-result-object v16

    .line 192
    iget-object v8, v12, Ly1/k;->n:Ly1/m;

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    move-object v2, v11

    .line 197
    move-object/from16 v3, p2

    .line 198
    .line 199
    move-object/from16 v5, p6

    .line 200
    .line 201
    move-object v6, v1

    .line 202
    move-object/from16 v7, p4

    .line 203
    .line 204
    move-object/from16 v18, v8

    .line 205
    .line 206
    move-object v8, v9

    .line 207
    move/from16 v9, v17

    .line 208
    .line 209
    move-object/from16 v20, v11

    .line 210
    .line 211
    move-object/from16 v11, v16

    .line 212
    .line 213
    move-object/from16 v12, v18

    .line 214
    .line 215
    invoke-direct/range {v2 .. v12}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    .line 216
    .line 217
    .line 218
    move-object/from16 v2, v20

    .line 219
    .line 220
    invoke-virtual {v2, v13}, Lcom/facebook/imagepipeline/producers/e;->j(Ljava/util/Map;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0, v2, v1}, Lz1/c;->H(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)LY0/c;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0, v15}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :goto_6
    :try_start_3
    invoke-static {v0}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0, v14}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    .line 237
    .line 238
    :goto_7
    invoke-static {}, LK1/b;->b()V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :goto_8
    invoke-static {}, LK1/b;->b()V

    .line 243
    .line 244
    .line 245
    throw v0
.end method


# virtual methods
.method public final c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly1/k;->e()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly1/k;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/k;->g:Lw1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw1/j;->h()Lx0/f;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/k;->h:Lw1/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Lw1/j;->h()Lx0/f;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    new-instance v0, Ly1/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ly1/j;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ly1/k;->e:Lw1/x;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lw1/x;->e(LO0/m;)I

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ly1/k;->f:Lw1/x;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lw1/x;->e(LO0/m;)I

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(LJ1/b;Ljava/lang/Object;)LY0/c;
    .locals 8

    .line 1
    const/16 v6, 0x18

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    invoke-static/range {v0 .. v7}, Ly1/k;->j(Ly1/k;LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;ILjava/lang/Object;)LY0/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final h(LJ1/b;Ljava/lang/Object;LJ1/b$c;)LY0/c;
    .locals 9

    .line 1
    const-string v0, "lowestPermittedRequestLevelOnSubmit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v7, 0x10

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    invoke-static/range {v1 .. v8}, Ly1/k;->j(Ly1/k;LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;ILjava/lang/Object;)LY0/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final i(LJ1/b;Ljava/lang/Object;LJ1/b$c;LF1/e;Ljava/lang/String;)LY0/c;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "immediateFailedDataSource(NullPointerException())"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Ly1/k;->a:Ly1/t;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ly1/t;->p(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-nez p3, :cond_1

    .line 25
    .line 26
    sget-object p3, LJ1/b$c;->n:LJ1/b$c;

    .line 27
    .line 28
    :cond_1
    move-object v4, p3

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    move-object v1, p0

    .line 33
    move-object v3, p1

    .line 34
    move-object v5, p2

    .line 35
    move-object v6, p4

    .line 36
    move-object v7, p5

    .line 37
    invoke-direct/range {v1 .. v7}, Ly1/k;->y(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;LF1/e;Ljava/lang/String;)LY0/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    invoke-static {p1}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "{\n      DataSources.imme\u2026taSource(exception)\n    }"

    .line 47
    .line 48
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_2
    return-object p1
.end method

.method public final k(LJ1/b;Ljava/lang/Object;)LY0/c;
    .locals 1

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LJ1/b$c;->q:LJ1/b$c;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, v0}, Ly1/k;->h(LJ1/b;Ljava/lang/Object;LJ1/b$c;)LY0/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final m()Lw1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/k;->e:Lw1/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Lw1/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/k;->i:Lw1/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o(LJ1/b;LF1/e;)LF1/e;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, LJ1/b;->p()LF1/e;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Ly1/k;->c:LF1/e;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p2, LF1/c;

    .line 18
    .line 19
    iget-object v3, p0, Ly1/k;->c:LF1/e;

    .line 20
    .line 21
    invoke-virtual {p1}, LJ1/b;->p()LF1/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-array v2, v2, [LF1/e;

    .line 26
    .line 27
    aput-object v3, v2, v1

    .line 28
    .line 29
    aput-object p1, v2, v0

    .line 30
    .line 31
    invoke-direct {p2, v2}, LF1/c;-><init>([LF1/e;)V

    .line 32
    .line 33
    .line 34
    move-object p1, p2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p1}, LJ1/b;->p()LF1/e;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    new-instance p1, LF1/c;

    .line 43
    .line 44
    iget-object v3, p0, Ly1/k;->c:LF1/e;

    .line 45
    .line 46
    new-array v2, v2, [LF1/e;

    .line 47
    .line 48
    aput-object v3, v2, v1

    .line 49
    .line 50
    aput-object p2, v2, v0

    .line 51
    .line 52
    invoke-direct {p1, v2}, LF1/c;-><init>([LF1/e;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v3, LF1/c;

    .line 57
    .line 58
    iget-object v4, p0, Ly1/k;->c:LF1/e;

    .line 59
    .line 60
    invoke-virtual {p1}, LJ1/b;->p()LF1/e;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 v5, 0x3

    .line 65
    new-array v5, v5, [LF1/e;

    .line 66
    .line 67
    aput-object v4, v5, v1

    .line 68
    .line 69
    aput-object p2, v5, v0

    .line 70
    .line 71
    aput-object p1, v5, v2

    .line 72
    .line 73
    invoke-direct {v3, v5}, LF1/c;-><init>([LF1/e;)V

    .line 74
    .line 75
    .line 76
    move-object p1, v3

    .line 77
    :goto_0
    return-object p1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string p2, "Required value was null."

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method

.method public final p(LJ1/b;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Ly1/k;->i:Lw1/k;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-interface {v0, p1, v1}, Lw1/k;->a(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Ly1/k;->e:Lw1/x;

    .line 13
    .line 14
    const-string v1, "cacheKey"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1}, Lw1/x;->get(Ljava/lang/Object;)LS0/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :try_start_0
    invoke-static {p1}, LS0/a;->B(LS0/a;)Z

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 28
    .line 29
    .line 30
    return v0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public final q(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Ly1/k;->u(Landroid/net/Uri;)LO0/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Ly1/k;->e:Lw1/x;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lw1/x;->b(LO0/m;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final r(LJ1/b;)Z
    .locals 3

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/k;->i:Lw1/k;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-interface {v0, p1, v1}, Lw1/k;->c(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, LJ1/b;->c()LJ1/b$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v1, "imageRequest.cacheChoice"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Ly1/k$b;->a:[I

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    aget p1, v1, p1

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const-string v2, "cacheKey"

    .line 32
    .line 33
    if-eq p1, v1, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    if-eq p1, v1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object p1, p0, Ly1/k;->h:Lw1/j;

    .line 41
    .line 42
    :goto_0
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lw1/j;->k(LI0/d;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p1, p0, Ly1/k;->g:Lw1/j;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    return p1
.end method

.method public final s(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    sget-object v0, LJ1/b$b;->m:LJ1/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Ly1/k;->t(Landroid/net/Uri;LJ1/b$b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, LJ1/b$b;->n:LJ1/b$b;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Ly1/k;->t(Landroid/net/Uri;LJ1/b$b;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
.end method

.method public final t(Landroid/net/Uri;LJ1/b$b;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, LJ1/c;->z(LJ1/b$b;)LJ1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LJ1/c;->a()LJ1/b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string p2, "imageRequest"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ly1/k;->r(LJ1/b;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method public final w(LJ1/b;Ljava/lang/Object;)LY0/c;
    .locals 2

    .line 1
    sget-object v0, Lx1/e;->o:Lx1/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Ly1/k;->x(LJ1/b;Ljava/lang/Object;Lx1/e;LF1/e;)LY0/c;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final x(LJ1/b;Ljava/lang/Object;Lx1/e;LF1/e;)LY0/c;
    .locals 8

    .line 1
    const-string v0, "priority"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly1/k;->b:LO0/o;

    .line 7
    .line 8
    invoke-interface {v0}, LO0/o;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object p1, Ly1/k;->p:Ljava/util/concurrent/CancellationException;

    .line 21
    .line 22
    invoke-static {p1}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "immediateFailedDataSource(PREFETCH_EXCEPTION)"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    if-nez p1, :cond_1

    .line 33
    .line 34
    new-instance p1, Ljava/lang/NullPointerException;

    .line 35
    .line 36
    const-string p2, "imageRequest is null"

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string p2, "{\n      DataSources.imme\u2026eRequest is null\"))\n    }"

    .line 46
    .line 47
    :goto_0
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :try_start_0
    iget-object v0, p0, Ly1/k;->a:Ly1/t;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ly1/t;->r(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    sget-object v4, LJ1/b$c;->n:LJ1/b$c;

    .line 58
    .line 59
    move-object v1, p0

    .line 60
    move-object v3, p1

    .line 61
    move-object v5, p2

    .line 62
    move-object v6, p3

    .line 63
    move-object v7, p4

    .line 64
    invoke-direct/range {v1 .. v7}, Ly1/k;->A(Lcom/facebook/imagepipeline/producers/d0;LJ1/b;LJ1/b$c;Ljava/lang/Object;Lx1/e;LF1/e;)LY0/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    goto :goto_1

    .line 69
    :catch_0
    move-exception p1

    .line 70
    invoke-static {p1}, LY0/d;->b(Ljava/lang/Throwable;)LY0/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "{\n        DataSources.im\u2026Source(exception)\n      }"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_1
    return-object p1
.end method
