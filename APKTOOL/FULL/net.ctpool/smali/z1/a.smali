.class public abstract Lz1/a;
.super LY0/a;
.source "SourceFile"


# instance fields
.field private final h:Lcom/facebook/imagepipeline/producers/l0;

.field private final i:LF1/d;


# direct methods
.method protected constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)V
    .locals 3

    .line 1
    const-string v0, "producer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "settableProducerContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestListener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, LY0/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 20
    .line 21
    iput-object p3, p0, Lz1/a;->i:LF1/d;

    .line 22
    .line 23
    invoke-static {}, LK1/b;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v1, "AbstractProducerToDataSourceAdapter()->produceResult"

    .line 28
    .line 29
    const-string v2, "AbstractProducerToDataSourceAdapter()->onRequestStart"

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/e;->getExtras()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, LY0/a;->o(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, LK1/b;->d()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p3, p2}, LF1/d;->b(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-static {v2}, LK1/b;->a(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :try_start_0
    invoke-interface {p3, p2}, LF1/d;->b(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 54
    .line 55
    .line 56
    sget-object p3, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    .line 58
    invoke-static {}, LK1/b;->b()V

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-static {}, LK1/b;->d()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-nez p3, :cond_1

    .line 66
    .line 67
    invoke-direct {p0}, Lz1/a;->A()Lcom/facebook/imagepipeline/producers/n;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-interface {p1, p3, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_1
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :try_start_1
    invoke-direct {p0}, Lz1/a;->A()Lcom/facebook/imagepipeline/producers/n;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-interface {p1, p3, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 83
    .line 84
    .line 85
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    invoke-static {}, LK1/b;->b()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    invoke-static {}, LK1/b;->b()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_2
    const-string v0, "AbstractProducerToDataSourceAdapter()"

    .line 99
    .line 100
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :try_start_2
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/e;->getExtras()Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {p0, v0}, LY0/a;->o(Ljava/util/Map;)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, LK1/b;->d()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    invoke-interface {p3, p2}, LF1/d;->b(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_2
    move-exception p1

    .line 121
    goto :goto_5

    .line 122
    :cond_3
    invoke-static {v2}, LK1/b;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 123
    .line 124
    .line 125
    :try_start_3
    invoke-interface {p3, p2}, LF1/d;->b(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 126
    .line 127
    .line 128
    sget-object p3, Li5/u;->a:Li5/u;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 129
    .line 130
    :try_start_4
    invoke-static {}, LK1/b;->b()V

    .line 131
    .line 132
    .line 133
    :goto_1
    invoke-static {}, LK1/b;->d()Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-nez p3, :cond_4

    .line 138
    .line 139
    invoke-direct {p0}, Lz1/a;->A()Lcom/facebook/imagepipeline/producers/n;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    invoke-interface {p1, p3, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 148
    .line 149
    .line 150
    :try_start_5
    invoke-direct {p0}, Lz1/a;->A()Lcom/facebook/imagepipeline/producers/n;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-interface {p1, p3, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 158
    .line 159
    :try_start_6
    invoke-static {}, LK1/b;->b()V

    .line 160
    .line 161
    .line 162
    :goto_2
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 163
    .line 164
    :goto_3
    invoke-static {}, LK1/b;->b()V

    .line 165
    .line 166
    .line 167
    :goto_4
    return-void

    .line 168
    :catchall_3
    move-exception p1

    .line 169
    :try_start_7
    invoke-static {}, LK1/b;->b()V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :catchall_4
    move-exception p1

    .line 174
    invoke-static {}, LK1/b;->b()V

    .line 175
    .line 176
    .line 177
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 178
    :goto_5
    invoke-static {}, LK1/b;->b()V

    .line 179
    .line 180
    .line 181
    throw p1
.end method

.method private final A()Lcom/facebook/imagepipeline/producers/n;
    .locals 1

    .line 1
    new-instance v0, Lz1/a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz1/a$a;-><init>(Lz1/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final declared-synchronized D()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LY0/a;->k()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {v0}, LO0/l;->i(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    monitor-exit p0

    .line 13
    throw v0
.end method

.method private final E(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lz1/a;->B(Lcom/facebook/imagepipeline/producers/e0;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, p1, v0}, LY0/a;->q(Ljava/lang/Throwable;Ljava/util/Map;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lz1/a;->i:LF1/d;

    .line 14
    .line 15
    iget-object v1, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, LF1/d;->h(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static final synthetic x(Lz1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz1/a;->D()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic y(Lz1/a;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz1/a;->E(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic z(Lz1/a;F)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LY0/a;->s(F)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method protected final B(Lcom/facebook/imagepipeline/producers/e0;)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "producerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lo1/a;->getExtras()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final C()Lcom/facebook/imagepipeline/producers/l0;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method protected F(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    const-string v0, "producerContext"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0, p3}, Lz1/a;->B(Lcom/facebook/imagepipeline/producers/e0;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-super {p0, p1, p2, p3}, LY0/a;->u(Ljava/lang/Object;ZLjava/util/Map;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lz1/a;->i:LF1/d;

    .line 23
    .line 24
    iget-object p2, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 25
    .line 26
    invoke-interface {p1, p2}, LF1/d;->f(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public close()Z
    .locals 2

    .line 1
    invoke-super {p0}, LY0/a;->close()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-super {p0}, LY0/a;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lz1/a;->i:LF1/d;

    .line 16
    .line 17
    iget-object v1, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 18
    .line 19
    invoke-interface {v0, v1}, LF1/d;->i(Lcom/facebook/imagepipeline/producers/e0;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lz1/a;->h:Lcom/facebook/imagepipeline/producers/l0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/e;->m()V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    return v0
.end method
