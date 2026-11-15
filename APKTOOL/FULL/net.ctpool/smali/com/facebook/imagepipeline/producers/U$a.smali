.class Lcom/facebook/imagepipeline/producers/U$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/U$a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/util/concurrent/CopyOnWriteArraySet;

.field private c:Ljava/io/Closeable;

.field private d:F

.field private e:I

.field private f:Lcom/facebook/imagepipeline/producers/e;

.field private g:Lcom/facebook/imagepipeline/producers/U$a$b;

.field final synthetic h:Lcom/facebook/imagepipeline/producers/U;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/U;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LO0/n;->a()Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/U$a;->a:Ljava/lang/Object;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/imagepipeline/producers/U$a;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/imagepipeline/producers/U$a;)Lcom/facebook/imagepipeline/producers/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/U$a;LW0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;->q(LW0/e;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/U$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->r()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/imagepipeline/producers/U$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->s()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic f(Lcom/facebook/imagepipeline/producers/U$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->t()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private g(Landroid/util/Pair;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/U$a$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/U$a$a;-><init>(Lcom/facebook/imagepipeline/producers/U$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    return-void
.end method

.method private i(Ljava/io/Closeable;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method private declared-synchronized j()Z
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized k()Z
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized l()Lx1/e;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lx1/e;->n:Lx1/e;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroid/util/Pair;

    .line 21
    .line 22
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lcom/facebook/imagepipeline/producers/e0;

    .line 25
    .line 26
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->b()Lx1/e;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v0, v2}, Lx1/e;->h(Lx1/e;Lx1/e;)Lx1/e;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    monitor-exit p0

    .line 38
    return-object v0

    .line 39
    :goto_1
    monitor-exit p0

    .line 40
    throw v0
.end method

.method private q(LW0/e;)V
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move v1, v2

    .line 23
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LO0/l;->b(Ljava/lang/Boolean;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->a:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p1, v0, p0}, Lcom/facebook/imagepipeline/producers/U;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/U$a;)V

    .line 43
    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/util/Pair;

    .line 60
    .line 61
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lcom/facebook/imagepipeline/producers/e0;

    .line 64
    .line 65
    new-instance v11, Lcom/facebook/imagepipeline/producers/e;

    .line 66
    .line 67
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->k()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->j()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->l()Lx1/e;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    move-object v1, v11

    .line 104
    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/e;-><init>(LJ1/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    .line 105
    .line 106
    .line 107
    iput-object v11, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 108
    .line 109
    invoke-interface {v0}, Lo1/a;->getExtras()Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v11, v0}, Lcom/facebook/imagepipeline/producers/e;->j(Ljava/util/Map;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, LW0/e;->h()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 123
    .line 124
    const-string v1, "started_as_prefetch"

    .line 125
    .line 126
    invoke-virtual {p1}, LW0/e;->e()Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/e;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    new-instance p1, Lcom/facebook/imagepipeline/producers/U$a$b;

    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-direct {p1, p0, v0}, Lcom/facebook/imagepipeline/producers/U$a$b;-><init>(Lcom/facebook/imagepipeline/producers/U$a;Lcom/facebook/imagepipeline/producers/V;)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    .line 144
    .line 145
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    .line 146
    .line 147
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    .line 149
    .line 150
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/U;->d(Lcom/facebook/imagepipeline/producers/U;)Lcom/facebook/imagepipeline/producers/d0;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-interface {v1, p1, v0}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    throw p1
.end method

.method private declared-synchronized r()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->j()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->q(Z)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized s()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->k()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->r(Z)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized t()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->l()Lx1/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/e;->s(Lx1/e;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z
    .locals 7

    .line 1
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/U$a;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/facebook/imagepipeline/producers/U;->i(Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/U$a;

    move-result-object v1

    if-eq v1, p0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->s()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->t()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/U$a;->r()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    iget v5, p0, Lcom/facebook/imagepipeline/producers/U$a;->d:F

    iget v6, p0, Lcom/facebook/imagepipeline/producers/U$a;->e:I

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/e;->i(Ljava/util/List;)V

    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/e;->k(Ljava/util/List;)V

    invoke-static {v3}, Lcom/facebook/imagepipeline/producers/e;->h(Ljava/util/List;)V

    monitor-enter v0

    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    if-eq v4, v1, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-virtual {v1, v4}, Lcom/facebook/imagepipeline/producers/U;->g(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object v4

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v4, :cond_4

    const/4 v1, 0x0

    cmpl-float v1, v5, v1

    if-lez v1, :cond_3

    :try_start_3
    invoke-interface {p1, v5}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    invoke-interface {p1, v4, v6}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    invoke-direct {p0, v4}, Lcom/facebook/imagepipeline/producers/U$a;->i(Ljava/io/Closeable;)V

    :cond_4
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-direct {p0, v0, p2}, Lcom/facebook/imagepipeline/producers/U$a;->g(Landroid/util/Pair;Lcom/facebook/imagepipeline/producers/e0;)V

    const/4 p1, 0x1

    return p1

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw p1

    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :goto_4
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public m(Lcom/facebook/imagepipeline/producers/U$a$b;)V
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    if-eq v0, p1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/U$a;->i(Ljava/io/Closeable;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p1, LW0/e;->o:LW0/e;

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;->q(LW0/e;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public n(Lcom/facebook/imagepipeline/producers/U$a$b;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    if-eq v0, p1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p0}, Lcom/facebook/imagepipeline/producers/U;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/U$a;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/U$a;->i(Ljava/io/Closeable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    monitor-enter v1

    :try_start_1
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v2

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lcom/facebook/imagepipeline/producers/e0;

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-static {v4}, Lcom/facebook/imagepipeline/producers/U;->f(Lcom/facebook/imagepipeline/producers/U;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, p2, v0}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v2, p2}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public o(Lcom/facebook/imagepipeline/producers/U$a$b;Ljava/io/Closeable;I)V
    .locals 6

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    if-eq v0, p1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;->i(Ljava/io/Closeable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v1

    invoke-static {p3}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-virtual {v2, p2}, Lcom/facebook/imagepipeline/producers/U;->g(Ljava/io/Closeable;)Ljava/io/Closeable;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/U$a;->c:Ljava/io/Closeable;

    iput p3, p0, Lcom/facebook/imagepipeline/producers/U$a;->e:I

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/U$a;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, p0}, Lcom/facebook/imagepipeline/producers/U;->k(Ljava/lang/Object;Lcom/facebook/imagepipeline/producers/U$a;)V

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    monitor-enter v2

    :try_start_1
    invoke-static {p3}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v3}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v3

    iget-object v4, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/facebook/imagepipeline/producers/e0;

    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-static {v5}, Lcom/facebook/imagepipeline/producers/U;->f(Lcom/facebook/imagepipeline/producers/U;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5, p1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/U$a;->f:Lcom/facebook/imagepipeline/producers/e;

    if-eqz v3, :cond_2

    iget-object v4, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/facebook/imagepipeline/producers/e0;

    invoke-virtual {v3}, Lcom/facebook/imagepipeline/producers/e;->getExtras()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v4, v3}, Lo1/a;->j(Ljava/util/Map;)V

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    iget-object v3, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Lcom/facebook/imagepipeline/producers/e0;

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/U$a;->h:Lcom/facebook/imagepipeline/producers/U;

    invoke-static {v4}, Lcom/facebook/imagepipeline/producers/U;->c(Lcom/facebook/imagepipeline/producers/U;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v3, p2, p3}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    monitor-exit v2

    goto :goto_1

    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_4
    return-void

    :goto_4
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public p(Lcom/facebook/imagepipeline/producers/U$a$b;F)V
    .locals 2

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a;->g:Lcom/facebook/imagepipeline/producers/U$a$b;

    if-eq v0, p1, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput p2, p0, Lcom/facebook/imagepipeline/producers/U$a;->d:F

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a;->b:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    monitor-enter v0

    :try_start_1
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v1, p2}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
