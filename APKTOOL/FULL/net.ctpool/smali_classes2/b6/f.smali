.class public final Lb6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb6/f$b;,
        Lb6/f$e;,
        Lb6/f$d;,
        Lb6/f$c;
    }
.end annotation


# static fields
.field private static final O:Lb6/m;

.field public static final P:Lb6/f$c;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:J

.field private final E:Lb6/m;

.field private F:Lb6/m;

.field private G:J

.field private H:J

.field private I:J

.field private J:J

.field private final K:Ljava/net/Socket;

.field private final L:Lb6/j;

.field private final M:Lb6/f$e;

.field private final N:Ljava/util/Set;

.field private final m:Z

.field private final n:Lb6/f$d;

.field private final o:Ljava/util/Map;

.field private final p:Ljava/lang/String;

.field private q:I

.field private r:I

.field private s:Z

.field private final t:LX5/e;

.field private final u:LX5/d;

.field private final v:LX5/d;

.field private final w:LX5/d;

.field private final x:Lb6/l;

.field private y:J

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lb6/f$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lb6/f$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb6/f;->P:Lb6/f$c;

    .line 8
    .line 9
    new-instance v0, Lb6/m;

    .line 10
    .line 11
    invoke-direct {v0}, Lb6/m;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    const v2, 0xffff

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lb6/m;->h(II)Lb6/m;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    const/16 v2, 0x4000

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lb6/m;->h(II)Lb6/m;

    .line 25
    .line 26
    .line 27
    sput-object v0, Lb6/f;->O:Lb6/m;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lb6/f$b;)V
    .locals 12

    .line 1
    const-string v0, "builder"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lb6/f$b;->b()Z

    move-result v0

    iput-boolean v0, p0, Lb6/f;->m:Z

    invoke-virtual {p1}, Lb6/f$b;->d()Lb6/f$d;

    move-result-object v1

    iput-object v1, p0, Lb6/f;->n:Lb6/f$d;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lb6/f;->o:Ljava/util/Map;

    invoke-virtual {p1}, Lb6/f$b;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb6/f;->p:Ljava/lang/String;

    invoke-virtual {p1}, Lb6/f$b;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, Lb6/f;->r:I

    invoke-virtual {p1}, Lb6/f$b;->j()LX5/e;

    move-result-object v2

    iput-object v2, p0, Lb6/f;->t:LX5/e;

    invoke-virtual {v2}, LX5/e;->i()LX5/d;

    move-result-object v3

    iput-object v3, p0, Lb6/f;->u:LX5/d;

    invoke-virtual {v2}, LX5/e;->i()LX5/d;

    move-result-object v4

    iput-object v4, p0, Lb6/f;->v:LX5/d;

    invoke-virtual {v2}, LX5/e;->i()LX5/d;

    move-result-object v2

    iput-object v2, p0, Lb6/f;->w:LX5/d;

    invoke-virtual {p1}, Lb6/f$b;->f()Lb6/l;

    move-result-object v2

    iput-object v2, p0, Lb6/f;->x:Lb6/l;

    new-instance v2, Lb6/m;

    invoke-direct {v2}, Lb6/m;-><init>()V

    invoke-virtual {p1}, Lb6/f$b;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Lb6/m;->h(II)Lb6/m;

    :cond_1
    sget-object v4, Li5/u;->a:Li5/u;

    iput-object v2, p0, Lb6/f;->E:Lb6/m;

    sget-object v2, Lb6/f;->O:Lb6/m;

    iput-object v2, p0, Lb6/f;->F:Lb6/m;

    invoke-virtual {v2}, Lb6/m;->c()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Lb6/f;->J:J

    invoke-virtual {p1}, Lb6/f$b;->h()Ljava/net/Socket;

    move-result-object v2

    iput-object v2, p0, Lb6/f;->K:Ljava/net/Socket;

    new-instance v2, Lb6/j;

    invoke-virtual {p1}, Lb6/f$b;->g()Li6/g;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lb6/j;-><init>(Li6/g;Z)V

    iput-object v2, p0, Lb6/f;->L:Lb6/j;

    new-instance v2, Lb6/f$e;

    new-instance v4, Lb6/h;

    invoke-virtual {p1}, Lb6/f$b;->i()Li6/h;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lb6/h;-><init>(Li6/h;Z)V

    invoke-direct {v2, p0, v4}, Lb6/f$e;-><init>(Lb6/f;Lb6/h;)V

    iput-object v2, p0, Lb6/f;->M:Lb6/f$e;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lb6/f;->N:Ljava/util/Set;

    invoke-virtual {p1}, Lb6/f$b;->e()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lb6/f$b;->e()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ping"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance p1, Lb6/f$a;

    move-object v6, p1

    move-object v7, v8

    move-object v9, p0

    move-wide v10, v4

    invoke-direct/range {v6 .. v11}, Lb6/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lb6/f;J)V

    invoke-virtual {v3, p1, v4, v5}, LX5/d;->i(LX5/a;J)V

    :cond_2
    return-void
.end method

.method public static final synthetic B(Lb6/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb6/f;->C:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic J(Lb6/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb6/f;->B:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic U(Lb6/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb6/f;->y:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic W(Lb6/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb6/f;->z:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic a(Lb6/f;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb6/f;->n0(Ljava/io/IOException;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a0(Lb6/f;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lb6/f;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b(Lb6/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb6/f;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic d(Lb6/f;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lb6/f;->N:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e()Lb6/m;
    .locals 1

    .line 1
    sget-object v0, Lb6/f;->O:Lb6/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f(Lb6/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb6/f;->B:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic g(Lb6/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb6/f;->y:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic h0(Lb6/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lb6/f;->J:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic j(Lb6/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb6/f;->z:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic l(Lb6/f;)Lb6/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lb6/f;->x:Lb6/l;

    .line 2
    .line 3
    return-object p0
.end method

.method private final l1(ILjava/util/List;Z)Lb6/i;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    xor-int/lit8 v7, p3, 0x1

    .line 3
    .line 4
    iget-object v8, p0, Lb6/f;->L:Lb6/j;

    .line 5
    .line 6
    monitor-enter v8

    .line 7
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    iget v1, p0, Lb6/f;->r:I

    .line 9
    .line 10
    const v2, 0x3fffffff    # 1.9999999f

    .line 11
    .line 12
    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    sget-object v1, Lb6/b;->u:Lb6/b;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lb6/f;->w1(Lb6/b;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :cond_0
    :goto_0
    iget-boolean v1, p0, Lb6/f;->s:Z

    .line 25
    .line 26
    if-nez v1, :cond_7

    .line 27
    .line 28
    iget v9, p0, Lb6/f;->r:I

    .line 29
    .line 30
    add-int/lit8 v1, v9, 0x2

    .line 31
    .line 32
    iput v1, p0, Lb6/f;->r:I

    .line 33
    .line 34
    new-instance v10, Lb6/i;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v1, v10

    .line 39
    move v2, v9

    .line 40
    move-object v3, p0

    .line 41
    move v4, v7

    .line 42
    invoke-direct/range {v1 .. v6}, Lb6/i;-><init>(ILb6/f;ZZLT5/t;)V

    .line 43
    .line 44
    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    iget-wide v1, p0, Lb6/f;->I:J

    .line 48
    .line 49
    iget-wide v3, p0, Lb6/f;->J:J

    .line 50
    .line 51
    cmp-long p3, v1, v3

    .line 52
    .line 53
    if-gez p3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v10}, Lb6/i;->r()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-virtual {v10}, Lb6/i;->q()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    cmp-long p3, v1, v3

    .line 64
    .line 65
    if-ltz p3, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 p3, 0x0

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    :goto_1
    move p3, v0

    .line 71
    :goto_2
    invoke-virtual {v10}, Lb6/i;->u()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    iget-object v1, p0, Lb6/f;->o:Ljava/util/Map;

    .line 78
    .line 79
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {v1, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_3
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    :try_start_2
    monitor-exit p0

    .line 89
    if-nez p1, :cond_4

    .line 90
    .line 91
    iget-object p1, p0, Lb6/f;->L:Lb6/j;

    .line 92
    .line 93
    invoke-virtual {p1, v7, v9, p2}, Lb6/j;->j(ZILjava/util/List;)V

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    goto :goto_5

    .line 99
    :cond_4
    iget-boolean v1, p0, Lb6/f;->m:Z

    .line 100
    .line 101
    xor-int/2addr v0, v1

    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 105
    .line 106
    invoke-virtual {v0, p1, v9, p2}, Lb6/j;->o(IILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 107
    .line 108
    .line 109
    :goto_3
    monitor-exit v8

    .line 110
    if-eqz p3, :cond_5

    .line 111
    .line 112
    iget-object p1, p0, Lb6/f;->L:Lb6/j;

    .line 113
    .line 114
    invoke-virtual {p1}, Lb6/j;->flush()V

    .line 115
    .line 116
    .line 117
    :cond_5
    return-object v10

    .line 118
    :cond_6
    :try_start_3
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    .line 119
    .line 120
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    :cond_7
    :try_start_4
    new-instance p1, Lb6/a;

    .line 131
    .line 132
    invoke-direct {p1}, Lb6/a;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 136
    :goto_4
    :try_start_5
    monitor-exit p0

    .line 137
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 138
    :goto_5
    monitor-exit v8

    .line 139
    throw p1
.end method

.method public static final synthetic n(Lb6/f;)LX5/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lb6/f;->w:LX5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method private final n0(Ljava/io/IOException;)V
    .locals 1

    .line 1
    sget-object v0, Lb6/b;->o:Lb6/b;

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0, p1}, Lb6/f;->j0(Lb6/b;Lb6/b;Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic o(Lb6/f;)LX5/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lb6/f;->t:LX5/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lb6/f;)LX5/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lb6/f;->u:LX5/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic y1(Lb6/f;ZLX5/e;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    sget-object p2, LX5/e;->h:LX5/e;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lb6/f;->x1(ZLX5/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic z(Lb6/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lb6/f;->s:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final A1(IZLi6/f;J)V
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p4, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    iget-object p4, p0, Lb6/f;->L:Lb6/j;

    .line 9
    .line 10
    invoke-virtual {p4, p2, p1, p3, v3}, Lb6/j;->d(ZILi6/f;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    .line 15
    .line 16
    if-lez v2, :cond_4

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :goto_1
    :try_start_0
    iget-wide v4, p0, Lb6/f;->I:J

    .line 20
    .line 21
    iget-wide v6, p0, Lb6/f;->J:J

    .line 22
    .line 23
    cmp-long v2, v4, v6

    .line 24
    .line 25
    if-ltz v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lb6/f;->o:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string p2, "stream closed"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :cond_2
    sub-long/2addr v6, v4

    .line 54
    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-int v2, v4

    .line 59
    iget-object v4, p0, Lb6/f;->L:Lb6/j;

    .line 60
    .line 61
    invoke-virtual {v4}, Lb6/j;->l()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-wide v4, p0, Lb6/f;->I:J

    .line 70
    .line 71
    int-to-long v6, v2

    .line 72
    add-long/2addr v4, v6

    .line 73
    iput-wide v4, p0, Lb6/f;->I:J

    .line 74
    .line 75
    sget-object v4, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    monitor-exit p0

    .line 78
    sub-long/2addr p4, v6

    .line 79
    iget-object v4, p0, Lb6/f;->L:Lb6/j;

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    cmp-long v5, p4, v0

    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v5, v3

    .line 90
    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lb6/j;->d(ZILi6/f;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 99
    .line 100
    .line 101
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    :goto_3
    monitor-exit p0

    .line 108
    throw p1

    .line 109
    :cond_4
    return-void
.end method

.method public final B0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb6/f;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final B1(IZLjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "alternating"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 7
    .line 8
    invoke-virtual {v0, p2, p1, p3}, Lb6/j;->j(ZILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C1(ZII)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lb6/j;->n(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception p1

    .line 8
    invoke-direct {p0, p1}, Lb6/f;->n0(Ljava/io/IOException;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    return-void
.end method

.method public final D0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D1(ILb6/b;)V
    .locals 1

    .line 1
    const-string v0, "statusCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lb6/j;->w(ILb6/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final E1(ILb6/b;)V
    .locals 11

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->u:LX5/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] writeSynReset"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    new-instance v1, Lb6/f$k;

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    move-object v3, v1

    .line 39
    move-object v4, v6

    .line 40
    move v5, v7

    .line 41
    move-object v8, p0

    .line 42
    move v9, p1

    .line 43
    move-object v10, p2

    .line 44
    invoke-direct/range {v3 .. v10}, Lb6/f$k;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;ILb6/b;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1, p2}, LX5/d;->i(LX5/a;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final F1(IJ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lb6/f;->u:LX5/d;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x5b

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, "] windowUpdate"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    new-instance v1, Lb6/f$l;

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    move-object v3, v1

    .line 34
    move-object v4, v6

    .line 35
    move v5, v7

    .line 36
    move-object v8, p0

    .line 37
    move v9, p1

    .line 38
    move-wide v10, p2

    .line 39
    invoke-direct/range {v3 .. v11}, Lb6/f$l;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;IJ)V

    .line 40
    .line 41
    .line 42
    const-wide/16 p1, 0x0

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1, p2}, LX5/d;->i(LX5/a;J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final H0()I
    .locals 1

    .line 1
    iget v0, p0, Lb6/f;->q:I

    .line 2
    .line 3
    return v0
.end method

.method public final M0()Lb6/f$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->n:Lb6/f$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R0()I
    .locals 1

    .line 1
    iget v0, p0, Lb6/f;->r:I

    .line 2
    .line 3
    return v0
.end method

.method public final S0()Lb6/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->E:Lb6/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b1()Lb6/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->F:Lb6/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 3

    .line 1
    sget-object v0, Lb6/b;->n:Lb6/b;

    .line 2
    .line 3
    sget-object v1, Lb6/b;->v:Lb6/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v0, v1, v2}, Lb6/f;->j0(Lb6/b;Lb6/b;Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final declared-synchronized f1(I)Lb6/i;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb6/f;->o:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lb6/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0

    .line 18
    throw p1
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb6/j;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h1()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->o:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i1()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lb6/f;->J:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j0(Lb6/b;Lb6/b;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "connectionCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "streamCode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-boolean v0, LU5/c;->h:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string p3, "Thread "

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    const-string v0, "Thread.currentThread()"

    .line 39
    .line 40
    invoke-static {p3, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p3, " MUST NOT hold lock on "

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Lb6/f;->w1(Lb6/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    :catch_0
    monitor-enter p0

    .line 70
    :try_start_1
    iget-object p1, p0, Lb6/f;->o:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    xor-int/lit8 p1, p1, 0x1

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    iget-object p1, p0, Lb6/f;->o:Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-array v1, v0, [Lb6/i;

    .line 88
    .line 89
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    check-cast p1, [Lb6/i;

    .line 96
    .line 97
    iget-object v1, p0, Lb6/f;->o:Ljava/util/Map;

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    goto :goto_3

    .line 105
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 106
    .line 107
    const-string p2, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 108
    .line 109
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_3
    const/4 p1, 0x0

    .line 114
    :goto_1
    sget-object v1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    monitor-exit p0

    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    array-length v1, p1

    .line 120
    :goto_2
    if-ge v0, v1, :cond_4

    .line 121
    .line 122
    aget-object v2, p1, v0

    .line 123
    .line 124
    :try_start_2
    invoke-virtual {v2, p2, p3}, Lb6/i;->d(Lb6/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 125
    .line 126
    .line 127
    :catch_1
    add-int/lit8 v0, v0, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    :try_start_3
    iget-object p1, p0, Lb6/f;->L:Lb6/j;

    .line 131
    .line 132
    invoke-virtual {p1}, Lb6/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 133
    .line 134
    .line 135
    :catch_2
    :try_start_4
    iget-object p1, p0, Lb6/f;->K:Ljava/net/Socket;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 138
    .line 139
    .line 140
    :catch_3
    iget-object p1, p0, Lb6/f;->u:LX5/d;

    .line 141
    .line 142
    invoke-virtual {p1}, LX5/d;->n()V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lb6/f;->v:LX5/d;

    .line 146
    .line 147
    invoke-virtual {p1}, LX5/d;->n()V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lb6/f;->w:LX5/d;

    .line 151
    .line 152
    invoke-virtual {p1}, LX5/d;->n()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :goto_3
    monitor-exit p0

    .line 157
    throw p1
.end method

.method public final j1()Lb6/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized k1(J)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lb6/f;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-wide v2, p0, Lb6/f;->B:J

    .line 10
    .line 11
    iget-wide v4, p0, Lb6/f;->A:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    iget-wide v2, p0, Lb6/f;->D:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    cmp-long p1, p1, v2

    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return v1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    monitor-exit p0

    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :goto_0
    monitor-exit p0

    .line 31
    throw p1
.end method

.method public final m1(Ljava/util/List;Z)Lb6/i;
    .locals 1

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0, p1, p2}, Lb6/f;->l1(ILjava/util/List;Z)Lb6/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final n1(ILi6/h;IZ)V
    .locals 11

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v8, Li6/f;

    .line 7
    .line 8
    invoke-direct {v8}, Li6/f;-><init>()V

    .line 9
    .line 10
    .line 11
    int-to-long v0, p3

    .line 12
    invoke-interface {p2, v0, v1}, Li6/h;->W0(J)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v8, v0, v1}, Li6/C;->L0(Li6/f;J)J

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lb6/f;->v:LX5/d;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lb6/f;->p:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x5b

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, "] onData"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v0, Lb6/f$f;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    move-object v1, v0

    .line 51
    move-object v2, v4

    .line 52
    move v3, v5

    .line 53
    move-object v6, p0

    .line 54
    move v7, p1

    .line 55
    move v9, p3

    .line 56
    move v10, p4

    .line 57
    invoke-direct/range {v1 .. v10}, Lb6/f$f;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;ILi6/f;IZ)V

    .line 58
    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {p2, v0, p3, p4}, LX5/d;->i(LX5/a;J)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final o1(ILjava/util/List;Z)V
    .locals 12

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->v:LX5/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] onHeaders"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    new-instance v1, Lb6/f$g;

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    move-object v3, v1

    .line 39
    move-object v4, v6

    .line 40
    move v5, v7

    .line 41
    move-object v8, p0

    .line 42
    move v9, p1

    .line 43
    move-object v10, p2

    .line 44
    move v11, p3

    .line 45
    invoke-direct/range {v3 .. v11}, Lb6/f$g;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;ILjava/util/List;Z)V

    .line 46
    .line 47
    .line 48
    const-wide/16 p1, 0x0

    .line 49
    .line 50
    invoke-virtual {v0, v1, p1, p2}, LX5/d;->i(LX5/a;J)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final p1(ILjava/util/List;)V
    .locals 11

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lb6/f;->N:Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p2, Lb6/b;->o:Lb6/b;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Lb6/f;->E1(ILb6/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_1
    iget-object v0, p0, Lb6/f;->N:Ljava/util/Set;

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    iget-object v0, p0, Lb6/f;->v:LX5/d;

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v2, 0x5b

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, "] onRequest"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v1, Lb6/f$h;

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    move-object v3, v1

    .line 71
    move-object v4, v6

    .line 72
    move v5, v7

    .line 73
    move-object v8, p0

    .line 74
    move v9, p1

    .line 75
    move-object v10, p2

    .line 76
    invoke-direct/range {v3 .. v10}, Lb6/f$h;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;ILjava/util/List;)V

    .line 77
    .line 78
    .line 79
    const-wide/16 p1, 0x0

    .line 80
    .line 81
    invoke-virtual {v0, v1, p1, p2}, LX5/d;->i(LX5/a;J)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_0
    monitor-exit p0

    .line 86
    throw p1
.end method

.method public final q1(ILb6/b;)V
    .locals 11

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->v:LX5/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] onReset"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    new-instance v1, Lb6/f$i;

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    move-object v3, v1

    .line 39
    move-object v4, v6

    .line 40
    move v5, v7

    .line 41
    move-object v8, p0

    .line 42
    move v9, p1

    .line 43
    move-object v10, p2

    .line 44
    invoke-direct/range {v3 .. v10}, Lb6/f$i;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;ILb6/b;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1, p2}, LX5/d;->i(LX5/a;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final r1(I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p1, v0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return v0
.end method

.method public final declared-synchronized s1(I)Lb6/i;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb6/f;->o:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lb6/i;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit p0

    .line 21
    throw p1
.end method

.method public final t1()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lb6/f;->B:J

    .line 3
    .line 4
    iget-wide v2, p0, Lb6/f;->A:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    add-long/2addr v2, v0

    .line 15
    :try_start_1
    iput-wide v2, p0, Lb6/f;->A:J

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const v2, 0x3b9aca00

    .line 22
    .line 23
    .line 24
    int-to-long v2, v2

    .line 25
    add-long/2addr v0, v2

    .line 26
    iput-wide v0, p0, Lb6/f;->D:J

    .line 27
    .line 28
    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    iget-object v0, p0, Lb6/f;->u:LX5/d;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lb6/f;->p:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " ping"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    new-instance v1, Lb6/f$j;

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    move-object v3, v1

    .line 56
    move-object v4, v6

    .line 57
    move v5, v7

    .line 58
    move-object v8, p0

    .line 59
    invoke-direct/range {v3 .. v8}, Lb6/f$j;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLb6/f;)V

    .line 60
    .line 61
    .line 62
    const-wide/16 v2, 0x0

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2, v3}, LX5/d;->i(LX5/a;J)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    monitor-exit p0

    .line 70
    throw v0
.end method

.method public final u1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/f;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public final v1(Lb6/m;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lb6/f;->F:Lb6/m;

    .line 7
    .line 8
    return-void
.end method

.method public final w1(Lb6/b;)V
    .locals 4

    .line 1
    const-string v0, "statusCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb6/f;->L:Lb6/j;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :try_start_1
    iget-boolean v1, p0, Lb6/f;->s:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :try_start_3
    iput-boolean v1, p0, Lb6/f;->s:Z

    .line 21
    .line 22
    iget v1, p0, Lb6/f;->q:I

    .line 23
    .line 24
    sget-object v2, Li5/u;->a:Li5/u;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 25
    .line 26
    :try_start_4
    monitor-exit p0

    .line 27
    iget-object v2, p0, Lb6/f;->L:Lb6/j;

    .line 28
    .line 29
    sget-object v3, LU5/c;->a:[B

    .line 30
    .line 31
    invoke-virtual {v2, v1, p1, v3}, Lb6/j;->g(ILb6/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_1
    move-exception p1

    .line 37
    :try_start_5
    monitor-exit p0

    .line 38
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    throw p1
.end method

.method public final x1(ZLX5/e;)V
    .locals 6

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lb6/f;->L:Lb6/j;

    .line 9
    .line 10
    invoke-virtual {p1}, Lb6/j;->b()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lb6/f;->L:Lb6/j;

    .line 14
    .line 15
    iget-object v0, p0, Lb6/f;->E:Lb6/m;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lb6/j;->z(Lb6/m;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lb6/f;->E:Lb6/m;

    .line 21
    .line 22
    invoke-virtual {p1}, Lb6/m;->c()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const v0, 0xffff

    .line 27
    .line 28
    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lb6/f;->L:Lb6/j;

    .line 32
    .line 33
    sub-int/2addr p1, v0

    .line 34
    int-to-long v2, p1

    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {v1, p1, v2, v3}, Lb6/j;->B(IJ)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p2}, LX5/e;->i()LX5/d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v4, p0, Lb6/f;->p:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p0, Lb6/f;->M:Lb6/f$e;

    .line 46
    .line 47
    new-instance p2, LX5/c;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    move-object v0, p2

    .line 51
    move-object v2, v4

    .line 52
    move v3, v5

    .line 53
    invoke-direct/range {v0 .. v5}, LX5/c;-><init>(Lv5/a;Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v0, 0x0

    .line 57
    .line 58
    invoke-virtual {p1, p2, v0, v1}, LX5/d;->i(LX5/a;J)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final declared-synchronized z1(J)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lb6/f;->G:J

    .line 3
    .line 4
    add-long/2addr v0, p1

    .line 5
    iput-wide v0, p0, Lb6/f;->G:J

    .line 6
    .line 7
    iget-wide p1, p0, Lb6/f;->H:J

    .line 8
    .line 9
    sub-long/2addr v0, p1

    .line 10
    iget-object p1, p0, Lb6/f;->E:Lb6/m;

    .line 11
    .line 12
    invoke-virtual {p1}, Lb6/m;->c()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    div-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    int-to-long p1, p1

    .line 19
    cmp-long p1, v0, p1

    .line 20
    .line 21
    if-ltz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1, v0, v1}, Lb6/f;->F1(IJ)V

    .line 25
    .line 26
    .line 27
    iget-wide p1, p0, Lb6/f;->H:J

    .line 28
    .line 29
    add-long/2addr p1, v0

    .line 30
    iput-wide p1, p0, Lb6/f;->H:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit p0

    .line 38
    throw p1
.end method
