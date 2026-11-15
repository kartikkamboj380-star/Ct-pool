.class public LJ0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ0/n;
.implements LL0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ0/j$c;,
        LJ0/j$b;
    }
.end annotation


# static fields
.field private static final r:Ljava/lang/Class;

.field private static final s:J

.field private static final t:J


# instance fields
.field private final a:J

.field private final b:J

.field private final c:Ljava/util/concurrent/CountDownLatch;

.field private d:J

.field private final e:LI0/c;

.field final f:Ljava/util/Set;

.field private g:J

.field private final h:J

.field private final i:LT0/a;

.field private final j:LJ0/i;

.field private final k:LJ0/m;

.field private final l:LI0/a;

.field private final m:Z

.field private final n:LJ0/j$b;

.field private final o:LV0/a;

.field private final p:Ljava/lang/Object;

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, LJ0/j;

    .line 2
    .line 3
    sput-object v0, LJ0/j;->r:Ljava/lang/Class;

    .line 4
    .line 5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    const-wide/16 v1, 0x2

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sput-wide v0, LJ0/j;->s:J

    .line 14
    .line 15
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 16
    .line 17
    const-wide/16 v1, 0x1e

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, LJ0/j;->t:J

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(LJ0/i;LJ0/m;LJ0/j$c;LI0/c;LI0/a;LL0/b;Ljava/util/concurrent/Executor;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-wide v0, p3, LJ0/j$c;->b:J

    .line 12
    .line 13
    iput-wide v0, p0, LJ0/j;->a:J

    .line 14
    .line 15
    iget-wide v0, p3, LJ0/j$c;->c:J

    .line 16
    .line 17
    iput-wide v0, p0, LJ0/j;->b:J

    .line 18
    .line 19
    iput-wide v0, p0, LJ0/j;->d:J

    .line 20
    .line 21
    invoke-static {}, LT0/a;->d()LT0/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, LJ0/j;->i:LT0/a;

    .line 26
    .line 27
    iput-object p1, p0, LJ0/j;->j:LJ0/i;

    .line 28
    .line 29
    iput-object p2, p0, LJ0/j;->k:LJ0/m;

    .line 30
    .line 31
    const-wide/16 p1, -0x1

    .line 32
    .line 33
    iput-wide p1, p0, LJ0/j;->g:J

    .line 34
    .line 35
    iput-object p4, p0, LJ0/j;->e:LI0/c;

    .line 36
    .line 37
    iget-wide p1, p3, LJ0/j$c;->a:J

    .line 38
    .line 39
    iput-wide p1, p0, LJ0/j;->h:J

    .line 40
    .line 41
    iput-object p5, p0, LJ0/j;->l:LI0/a;

    .line 42
    .line 43
    new-instance p1, LJ0/j$b;

    .line 44
    .line 45
    invoke-direct {p1}, LJ0/j$b;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, LJ0/j;->n:LJ0/j$b;

    .line 49
    .line 50
    invoke-static {}, LV0/d;->a()LV0/d;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, LJ0/j;->o:LV0/a;

    .line 55
    .line 56
    iput-boolean p8, p0, LJ0/j;->m:Z

    .line 57
    .line 58
    new-instance p1, Ljava/util/HashSet;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 64
    .line 65
    if-eqz p6, :cond_0

    .line 66
    .line 67
    invoke-interface {p6, p0}, LL0/b;->a(LL0/a;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 71
    .line 72
    if-eqz p8, :cond_1

    .line 73
    .line 74
    const/4 p2, 0x1

    .line 75
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, LJ0/j;->c:Ljava/util/concurrent/CountDownLatch;

    .line 79
    .line 80
    new-instance p1, LJ0/j$a;

    .line 81
    .line 82
    invoke-direct {p1, p0}, LJ0/j$a;-><init>(LJ0/j;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p7, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 p2, 0x0

    .line 90
    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, LJ0/j;->c:Ljava/util/concurrent/CountDownLatch;

    .line 94
    .line 95
    :goto_0
    return-void
.end method

.method static bridge synthetic h(LJ0/j;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/j;->c:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method static bridge synthetic i(LJ0/j;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/j;->p:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic j(LJ0/j;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ0/j;->q:Z

    return-void
.end method

.method static bridge synthetic k(LJ0/j;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LJ0/j;->p()Z

    move-result p0

    return p0
.end method

.method private l(LJ0/i$b;LI0/d;Ljava/lang/String;)LH0/a;
    .locals 5

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {p1, p2}, LJ0/i$b;->d(Ljava/lang/Object;)LH0/a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p2, p0, LJ0/j;->f:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, LJ0/j;->n:LJ0/j$b;

    .line 14
    .line 15
    invoke-interface {p1}, LH0/a;->size()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, 0x1

    .line 20
    .line 21
    invoke-virtual {p2, v1, v2, v3, v4}, LJ0/j$b;->c(JJ)V

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
.end method

.method private m(JLI0/c$a;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v1, LJ0/j;->j:LJ0/i;

    .line 6
    .line 7
    invoke-interface {v0}, LJ0/i;->h()Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, LJ0/j;->n(Ljava/util/Collection;)Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    iget-object v4, v1, LJ0/j;->n:LJ0/j$b;

    .line 16
    .line 17
    invoke-virtual {v4}, LJ0/j$b;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    sub-long v6, v4, v2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v10, 0x0

    .line 28
    const-wide/16 v11, 0x0

    .line 29
    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v13

    .line 34
    if-eqz v13, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v13

    .line 40
    check-cast v13, LJ0/i$a;

    .line 41
    .line 42
    cmp-long v14, v11, v6

    .line 43
    .line 44
    if-lez v14, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    iget-object v14, v1, LJ0/j;->j:LJ0/i;

    .line 48
    .line 49
    invoke-interface {v14, v13}, LJ0/i;->i(LJ0/i$a;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v14

    .line 53
    iget-object v8, v1, LJ0/j;->f:Ljava/util/Set;

    .line 54
    .line 55
    invoke-interface {v13}, LJ0/i$a;->getId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    invoke-interface {v8, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const-wide/16 v8, 0x0

    .line 63
    .line 64
    cmp-long v16, v14, v8

    .line 65
    .line 66
    if-lez v16, :cond_1

    .line 67
    .line 68
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    add-long/2addr v11, v14

    .line 71
    invoke-static {}, LJ0/o;->a()LJ0/o;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-interface {v13}, LJ0/i$a;->getId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v8, v9}, LJ0/o;->j(Ljava/lang/String;)LJ0/o;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    move-object/from16 v9, p3

    .line 84
    .line 85
    invoke-virtual {v8, v9}, LJ0/o;->g(LI0/c$a;)LJ0/o;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8, v14, v15}, LJ0/o;->i(J)LJ0/o;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    sub-long v13, v4, v11

    .line 94
    .line 95
    invoke-virtual {v8, v13, v14}, LJ0/o;->f(J)LJ0/o;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8, v2, v3}, LJ0/o;->e(J)LJ0/o;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    iget-object v13, v1, LJ0/j;->e:LI0/c;

    .line 104
    .line 105
    invoke-interface {v13, v8}, LI0/c;->g(LI0/b;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8}, LJ0/o;->b()V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_1
    move-object/from16 v9, p3

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    :goto_1
    iget-object v0, v1, LJ0/j;->n:LJ0/j$b;

    .line 116
    .line 117
    neg-long v2, v11

    .line 118
    neg-int v4, v10

    .line 119
    int-to-long v4, v4

    .line 120
    invoke-virtual {v0, v2, v3, v4, v5}, LJ0/j$b;->c(JJ)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v1, LJ0/j;->j:LJ0/i;

    .line 124
    .line 125
    invoke-interface {v0}, LJ0/i;->c()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :catch_0
    move-exception v0

    .line 130
    iget-object v2, v1, LJ0/j;->l:LI0/a;

    .line 131
    .line 132
    sget-object v3, LI0/a$a;->A:LI0/a$a;

    .line 133
    .line 134
    sget-object v4, LJ0/j;->r:Ljava/lang/Class;

    .line 135
    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v6, "evictAboveSize: "

    .line 142
    .line 143
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-interface {v2, v3, v4, v5, v0}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    throw v0
.end method

.method private n(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 7

    .line 1
    iget-object v0, p0, LJ0/j;->o:LV0/a;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/a;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-wide v2, LJ0/j;->s:J

    .line 8
    .line 9
    add-long/2addr v0, v2

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, LJ0/i$a;

    .line 43
    .line 44
    invoke-interface {v4}, LJ0/i$a;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    cmp-long v5, v5, v0

    .line 49
    .line 50
    if-lez v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object p1, p0, LJ0/j;->k:LJ0/m;

    .line 61
    .line 62
    invoke-interface {p1}, LJ0/m;->get()LJ0/l;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v3, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    .line 71
    .line 72
    return-object v2
.end method

.method private o()V
    .locals 6

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, LJ0/j;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-direct {p0}, LJ0/j;->s()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LJ0/j;->n:LJ0/j$b;

    .line 12
    .line 13
    invoke-virtual {v2}, LJ0/j$b;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-wide v4, p0, LJ0/j;->d:J

    .line 18
    .line 19
    cmp-long v4, v2, v4

    .line 20
    .line 21
    if-lez v4, :cond_0

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LJ0/j;->n:LJ0/j$b;

    .line 26
    .line 27
    invoke-virtual {v1}, LJ0/j$b;->e()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, LJ0/j;->p()Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    iget-wide v4, p0, LJ0/j;->d:J

    .line 37
    .line 38
    cmp-long v1, v2, v4

    .line 39
    .line 40
    if-lez v1, :cond_1

    .line 41
    .line 42
    const-wide/16 v1, 0x9

    .line 43
    .line 44
    mul-long/2addr v4, v1

    .line 45
    const-wide/16 v1, 0xa

    .line 46
    .line 47
    div-long/2addr v4, v1

    .line 48
    sget-object v1, LI0/c$a;->m:LI0/c$a;

    .line 49
    .line 50
    invoke-direct {p0, v4, v5, v1}, LJ0/j;->m(JLI0/c$a;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw v1
.end method

.method private p()Z
    .locals 6

    .line 1
    iget-object v0, p0, LJ0/j;->o:LV0/a;

    .line 2
    .line 3
    invoke-interface {v0}, LV0/a;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, LJ0/j;->n:LJ0/j$b;

    .line 8
    .line 9
    invoke-virtual {v2}, LJ0/j$b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-wide v2, p0, LJ0/j;->g:J

    .line 16
    .line 17
    const-wide/16 v4, -0x1

    .line 18
    .line 19
    cmp-long v4, v2, v4

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    sub-long/2addr v0, v2

    .line 24
    sget-wide v2, LJ0/j;->t:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_1
    :goto_0
    invoke-direct {p0}, LJ0/j;->q()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    return v0
.end method

.method private q()Z
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LJ0/j;->o:LV0/a;

    .line 4
    .line 5
    invoke-interface {v0}, LV0/a;->now()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sget-wide v4, LJ0/j;->s:J

    .line 10
    .line 11
    add-long/2addr v4, v2

    .line 12
    iget-boolean v0, v1, LJ0/j;->m:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v1, LJ0/j;->f:Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v1, LJ0/j;->f:Ljava/util/Set;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-boolean v0, v1, LJ0/j;->m:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_0
    :try_start_0
    iget-object v8, v1, LJ0/j;->j:LJ0/i;

    .line 39
    .line 40
    invoke-interface {v8}, LJ0/i;->h()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const-wide/16 v9, 0x0

    .line 49
    .line 50
    const-wide/16 v11, -0x1

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v16

    .line 60
    const/16 v17, 0x1

    .line 61
    .line 62
    if-eqz v16, :cond_4

    .line 63
    .line 64
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v16

    .line 68
    check-cast v16, LJ0/i$a;

    .line 69
    .line 70
    add-int/lit8 v14, v14, 0x1

    .line 71
    .line 72
    invoke-interface/range {v16 .. v16}, LJ0/i$a;->n()J

    .line 73
    .line 74
    .line 75
    move-result-wide v18

    .line 76
    add-long v9, v9, v18

    .line 77
    .line 78
    invoke-interface/range {v16 .. v16}, LJ0/i$a;->a()J

    .line 79
    .line 80
    .line 81
    move-result-wide v18

    .line 82
    cmp-long v18, v18, v4

    .line 83
    .line 84
    if-lez v18, :cond_2

    .line 85
    .line 86
    add-int/lit8 v15, v15, 0x1

    .line 87
    .line 88
    int-to-long v6, v7

    .line 89
    invoke-interface/range {v16 .. v16}, LJ0/i$a;->n()J

    .line 90
    .line 91
    .line 92
    move-result-wide v19

    .line 93
    add-long v6, v6, v19

    .line 94
    .line 95
    long-to-int v7, v6

    .line 96
    invoke-interface/range {v16 .. v16}, LJ0/i$a;->a()J

    .line 97
    .line 98
    .line 99
    move-result-wide v19

    .line 100
    move-wide/from16 v21, v4

    .line 101
    .line 102
    sub-long v4, v19, v2

    .line 103
    .line 104
    invoke-static {v4, v5, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    move-wide v11, v4

    .line 109
    move/from16 v13, v17

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catch_0
    move-exception v0

    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :cond_2
    move-wide/from16 v21, v4

    .line 116
    .line 117
    iget-boolean v4, v1, LJ0/j;->m:Z

    .line 118
    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-interface/range {v16 .. v16}, LJ0/i$a;->getId()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_2
    move-wide/from16 v4, v21

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    if-eqz v13, :cond_5

    .line 135
    .line 136
    iget-object v4, v1, LJ0/j;->l:LI0/a;

    .line 137
    .line 138
    sget-object v5, LI0/a$a;->p:LI0/a$a;

    .line 139
    .line 140
    sget-object v6, LJ0/j;->r:Ljava/lang/Class;

    .line 141
    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v13, "Future timestamp found in "

    .line 148
    .line 149
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v13, " files , with a total size of "

    .line 156
    .line 157
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v7, " bytes, and a maximum time delta of "

    .line 164
    .line 165
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v7, "ms"

    .line 172
    .line 173
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    const/4 v8, 0x0

    .line 181
    invoke-interface {v4, v5, v6, v7, v8}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    iget-object v4, v1, LJ0/j;->n:LJ0/j$b;

    .line 185
    .line 186
    invoke-virtual {v4}, LJ0/j$b;->a()J

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    int-to-long v6, v14

    .line 191
    cmp-long v4, v4, v6

    .line 192
    .line 193
    if-nez v4, :cond_6

    .line 194
    .line 195
    iget-object v4, v1, LJ0/j;->n:LJ0/j$b;

    .line 196
    .line 197
    invoke-virtual {v4}, LJ0/j$b;->b()J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    cmp-long v4, v4, v9

    .line 202
    .line 203
    if-eqz v4, :cond_8

    .line 204
    .line 205
    :cond_6
    iget-boolean v4, v1, LJ0/j;->m:Z

    .line 206
    .line 207
    if-eqz v4, :cond_7

    .line 208
    .line 209
    iget-object v4, v1, LJ0/j;->f:Ljava/util/Set;

    .line 210
    .line 211
    if-eq v4, v0, :cond_7

    .line 212
    .line 213
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    iget-object v4, v1, LJ0/j;->f:Ljava/util/Set;

    .line 217
    .line 218
    invoke-interface {v4}, Ljava/util/Set;->clear()V

    .line 219
    .line 220
    .line 221
    iget-object v4, v1, LJ0/j;->f:Ljava/util/Set;

    .line 222
    .line 223
    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 224
    .line 225
    .line 226
    :cond_7
    iget-object v0, v1, LJ0/j;->n:LJ0/j$b;

    .line 227
    .line 228
    invoke-virtual {v0, v9, v10, v6, v7}, LJ0/j$b;->f(JJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    .line 230
    .line 231
    :cond_8
    iput-wide v2, v1, LJ0/j;->g:J

    .line 232
    .line 233
    return v17

    .line 234
    :goto_3
    iget-object v2, v1, LJ0/j;->l:LI0/a;

    .line 235
    .line 236
    sget-object v3, LI0/a$a;->B:LI0/a$a;

    .line 237
    .line 238
    sget-object v4, LJ0/j;->r:Ljava/lang/Class;

    .line 239
    .line 240
    new-instance v5, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const-string v6, "calcFileCacheSize: "

    .line 246
    .line 247
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-interface {v2, v3, v4, v5, v0}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    const/4 v2, 0x0

    .line 265
    return v2
.end method

.method private r(Ljava/lang/String;LI0/d;)LJ0/i$b;
    .locals 1

    .line 1
    invoke-direct {p0}, LJ0/j;->o()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ0/j;->j:LJ0/i;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, LJ0/i;->d(Ljava/lang/String;Ljava/lang/Object;)LJ0/i$b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method private s()V
    .locals 6

    .line 1
    iget-object v0, p0, LJ0/j;->j:LJ0/i;

    .line 2
    .line 3
    invoke-interface {v0}, LJ0/i;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LT0/a$a;->n:LT0/a$a;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, LT0/a$a;->m:LT0/a$a;

    .line 13
    .line 14
    :goto_0
    iget-object v1, p0, LJ0/j;->i:LT0/a;

    .line 15
    .line 16
    iget-wide v2, p0, LJ0/j;->b:J

    .line 17
    .line 18
    iget-object v4, p0, LJ0/j;->n:LJ0/j$b;

    .line 19
    .line 20
    invoke-virtual {v4}, LJ0/j$b;->b()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    sub-long/2addr v2, v4

    .line 25
    invoke-virtual {v1, v0, v2, v3}, LT0/a;->f(LT0/a$a;J)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-wide v0, p0, LJ0/j;->a:J

    .line 32
    .line 33
    :goto_1
    iput-wide v0, p0, LJ0/j;->d:J

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    iget-wide v0, p0, LJ0/j;->b:J

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :goto_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LJ0/j;->j:LJ0/i;

    .line 5
    .line 6
    invoke-interface {v1}, LJ0/i;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LJ0/j;->e:LI0/c;

    .line 15
    .line 16
    invoke-interface {v1}, LI0/c;->d()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :catch_1
    move-exception v1

    .line 25
    :goto_0
    :try_start_1
    iget-object v2, p0, LJ0/j;->l:LI0/a;

    .line 26
    .line 27
    sget-object v3, LI0/a$a;->A:LI0/a$a;

    .line 28
    .line 29
    sget-object v4, LJ0/j;->r:Ljava/lang/Class;

    .line 30
    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v6, "clearAll: "

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v2, v3, v4, v5, v1}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object v1, p0, LJ0/j;->n:LJ0/j$b;

    .line 56
    .line 57
    invoke-virtual {v1}, LJ0/j$b;->e()V

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw v1
.end method

.method public b(LI0/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, LI0/e;->b(LI0/d;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, LJ0/j;->j:LJ0/i;

    .line 22
    .line 23
    invoke-interface {v3, v2}, LJ0/i;->remove(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, LJ0/j;->f:Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    :try_start_1
    iget-object v1, p0, LJ0/j;->l:LI0/a;

    .line 38
    .line 39
    sget-object v2, LI0/a$a;->z:LI0/a$a;

    .line 40
    .line 41
    sget-object v3, LJ0/j;->r:Ljava/lang/Class;

    .line 42
    .line 43
    new-instance v4, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v5, "delete: "

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v1, v2, v3, v4, p1}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
.end method

.method public c(LI0/d;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, LI0/e;->b(LI0/d;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p0, LJ0/j;->f:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return v1

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1
.end method

.method public d(LI0/d;LI0/j;)LH0/a;
    .locals 4

    .line 1
    invoke-static {}, LJ0/o;->a()LJ0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LJ0/o;->d(LI0/d;)LJ0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LJ0/j;->e:LI0/c;

    .line 10
    .line 11
    invoke-interface {v1, v0}, LI0/c;->e(LI0/b;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    invoke-static {p1}, LI0/e;->a(LI0/d;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    invoke-virtual {v0, v2}, LJ0/o;->j(Ljava/lang/String;)LJ0/o;

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-direct {p0, v2, p1}, LJ0/j;->r(Ljava/lang/String;LI0/d;)LJ0/i$b;

    .line 26
    .line 27
    .line 28
    move-result-object v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :try_start_2
    invoke-interface {v1, p2, p1}, LJ0/i$b;->e(LI0/j;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v1, p1, v2}, LJ0/j;->l(LJ0/i$b;LI0/d;Ljava/lang/String;)LH0/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, LH0/a;->size()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v0, v2, v3}, LJ0/o;->i(J)LJ0/o;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iget-object v2, p0, LJ0/j;->n:LJ0/j$b;

    .line 45
    .line 46
    invoke-virtual {v2}, LJ0/j$b;->b()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-virtual {p2, v2, v3}, LJ0/o;->f(J)LJ0/o;

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, LJ0/j;->e:LI0/c;

    .line 54
    .line 55
    invoke-interface {p2, v0}, LI0/c;->b(LI0/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    :try_start_3
    invoke-interface {v1}, LJ0/i$b;->c()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_0

    .line 63
    .line 64
    sget-object p2, LJ0/j;->r:Ljava/lang/Class;

    .line 65
    .line 66
    const-string v1, "Failed to delete temp file"

    .line 67
    .line 68
    invoke-static {p2, v1}, LP0/a;->f(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_2

    .line 74
    :catch_0
    move-exception p1

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    :goto_0
    invoke-virtual {v0}, LJ0/o;->b()V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    :try_start_4
    invoke-interface {v1}, LJ0/i$b;->c()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_1

    .line 86
    .line 87
    sget-object p2, LJ0/j;->r:Ljava/lang/Class;

    .line 88
    .line 89
    const-string v1, "Failed to delete temp file"

    .line 90
    .line 91
    invoke-static {p2, v1}, LP0/a;->f(Ljava/lang/Class;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    :goto_1
    :try_start_5
    invoke-virtual {v0, p1}, LJ0/o;->h(Ljava/io/IOException;)LJ0/o;

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, LJ0/j;->e:LI0/c;

    .line 99
    .line 100
    invoke-interface {p2, v0}, LI0/c;->c(LI0/b;)V

    .line 101
    .line 102
    .line 103
    sget-object p2, LJ0/j;->r:Ljava/lang/Class;

    .line 104
    .line 105
    const-string v1, "Failed inserting a file into the cache"

    .line 106
    .line 107
    invoke-static {p2, v1, p1}, LP0/a;->g(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 111
    :goto_2
    invoke-virtual {v0}, LJ0/o;->b()V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :catchall_2
    move-exception p1

    .line 116
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 117
    throw p1
.end method

.method public e(LI0/d;)LH0/a;
    .locals 8

    .line 1
    invoke-static {}, LJ0/o;->a()LJ0/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LJ0/o;->d(LI0/d;)LJ0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    iget-object v2, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    invoke-static {p1}, LI0/e;->b(LI0/d;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v5, v1

    .line 19
    move-object v6, v5

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    if-ge v4, v7, :cond_1

    .line 25
    .line 26
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v5}, LJ0/o;->j(Ljava/lang/String;)LJ0/o;

    .line 33
    .line 34
    .line 35
    iget-object v6, p0, LJ0/j;->j:LJ0/i;

    .line 36
    .line 37
    invoke-interface {v6, v5, p1}, LJ0/i;->g(Ljava/lang/String;Ljava/lang/Object;)LH0/a;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    :goto_1
    if-nez v6, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, LJ0/j;->e:LI0/c;

    .line 52
    .line 53
    invoke-interface {p1, v0}, LI0/c;->f(LI0/b;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {p1, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-static {v5}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, LJ0/j;->e:LI0/c;

    .line 66
    .line 67
    invoke-interface {p1, v0}, LI0/c;->h(LI0/b;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 71
    .line 72
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    invoke-virtual {v0}, LJ0/o;->b()V

    .line 77
    .line 78
    .line 79
    return-object v6

    .line 80
    :goto_3
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    :try_start_3
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    goto :goto_4

    .line 84
    :catch_0
    move-exception p1

    .line 85
    :try_start_4
    iget-object v2, p0, LJ0/j;->l:LI0/a;

    .line 86
    .line 87
    sget-object v3, LI0/a$a;->B:LI0/a$a;

    .line 88
    .line 89
    sget-object v4, LJ0/j;->r:Ljava/lang/Class;

    .line 90
    .line 91
    const-string v5, "getResource"

    .line 92
    .line 93
    invoke-interface {v2, v3, v4, v5, p1}, LI0/a;->a(LI0/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, LJ0/o;->h(Ljava/io/IOException;)LJ0/o;

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, LJ0/j;->e:LI0/c;

    .line 100
    .line 101
    invoke-interface {p1, v0}, LI0/c;->a(LI0/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, LJ0/o;->b()V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :goto_4
    invoke-virtual {v0}, LJ0/o;->b()V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

.method public f(LI0/d;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    :try_start_1
    invoke-static {p1}, LI0/e;->b(LI0/d;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    move v4, v0

    .line 11
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-ge v4, v5, :cond_1

    .line 16
    .line 17
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    :try_start_2
    iget-object v1, p0, LJ0/j;->j:LJ0/i;

    .line 24
    .line 25
    invoke-interface {v1, v5, p1}, LJ0/i;->e(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    move-object v1, v5

    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v3

    .line 46
    move-object v5, v1

    .line 47
    move-object v1, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 50
    return v0

    .line 51
    :goto_1
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    :try_start_5
    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    goto :goto_2

    .line 55
    :catch_1
    move-exception v2

    .line 56
    move-object v5, v1

    .line 57
    move-object v1, v2

    .line 58
    :goto_2
    invoke-static {}, LJ0/o;->a()LJ0/o;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2, p1}, LJ0/o;->d(LI0/d;)LJ0/o;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v5}, LJ0/o;->j(Ljava/lang/String;)LJ0/o;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1, v1}, LJ0/o;->h(Ljava/io/IOException;)LJ0/o;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v1, p0, LJ0/j;->e:LI0/c;

    .line 75
    .line 76
    invoke-interface {v1, p1}, LI0/c;->a(LI0/b;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, LJ0/o;->b()V

    .line 80
    .line 81
    .line 82
    return v0
.end method

.method public g(LI0/d;)Z
    .locals 7

    .line 1
    iget-object v0, p0, LJ0/j;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LJ0/j;->c(LI0/d;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return v2

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-static {p1}, LI0/e;->b(LI0/d;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    move v4, v1

    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-ge v4, v5, :cond_2

    .line 26
    .line 27
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    iget-object v6, p0, LJ0/j;->j:LJ0/i;

    .line 34
    .line 35
    invoke-interface {v6, v5, p1}, LJ0/i;->f(Ljava/lang/String;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, LJ0/j;->f:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {p1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    monitor-exit v0

    .line 47
    return v2

    .line 48
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    monitor-exit v0

    .line 52
    return v1

    .line 53
    :catch_0
    monitor-exit v0

    .line 54
    return v1

    .line 55
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    throw p1
.end method
