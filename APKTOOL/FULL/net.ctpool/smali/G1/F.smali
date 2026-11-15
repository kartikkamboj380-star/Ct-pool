.class public LG1/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LG1/D;

.field private b:Lcom/facebook/imagepipeline/memory/e;

.field private c:LG1/i;

.field private d:Lcom/facebook/imagepipeline/memory/e;

.field private e:Lcom/facebook/imagepipeline/memory/e;

.field private f:LR0/i;

.field private g:LR0/l;

.field private h:LR0/a;


# direct methods
.method public constructor <init>(LG1/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LG1/D;

    .line 9
    .line 10
    iput-object p1, p0, LG1/F;->a:LG1/D;

    .line 11
    .line 12
    return-void
.end method

.method private a()Lcom/facebook/imagepipeline/memory/e;
    .locals 5

    .line 1
    iget-object v0, p0, LG1/F;->b:Lcom/facebook/imagepipeline/memory/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;

    .line 7
    .line 8
    const-class v2, LR0/d;

    .line 9
    .line 10
    const-class v3, LG1/G;

    .line 11
    .line 12
    const-class v4, LG1/H;

    .line 13
    .line 14
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, LG1/F;->a:LG1/D;

    .line 23
    .line 24
    invoke-virtual {v2}, LG1/D;->i()LR0/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, LG1/F;->a:LG1/D;

    .line 29
    .line 30
    invoke-virtual {v3}, LG1/D;->g()LG1/G;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 35
    .line 36
    invoke-virtual {v4}, LG1/D;->h()LG1/H;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/facebook/imagepipeline/memory/e;

    .line 49
    .line 50
    iput-object v1, p0, LG1/F;->b:Lcom/facebook/imagepipeline/memory/e;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    iput-object v0, p0, LG1/F;->b:Lcom/facebook/imagepipeline/memory/e;

    .line 54
    .line 55
    :cond_0
    :goto_0
    iget-object v0, p0, LG1/F;->b:Lcom/facebook/imagepipeline/memory/e;

    .line 56
    .line 57
    return-object v0
.end method

.method private e(I)Lcom/facebook/imagepipeline/memory/e;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, LG1/F;->a()Lcom/facebook/imagepipeline/memory/e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Invalid MemoryChunkType"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-virtual {p0}, LG1/F;->c()Lcom/facebook/imagepipeline/memory/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_2
    invoke-virtual {p0}, LG1/F;->f()Lcom/facebook/imagepipeline/memory/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method


# virtual methods
.method public b()LG1/i;
    .locals 5

    .line 1
    iget-object v0, p0, LG1/F;->c:LG1/i;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, LG1/F;->a:LG1/D;

    .line 6
    .line 7
    invoke-virtual {v0}, LG1/D;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    const/4 v3, 0x2

    .line 17
    const/4 v4, 0x1

    .line 18
    sparse-switch v1, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_0
    const-string v1, "dummy"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_1

    .line 32
    :sswitch_1
    const-string v1, "dummy_with_tracking"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    move v0, v4

    .line 41
    goto :goto_1

    .line 42
    :sswitch_2
    const-string v1, "experimental"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    move v0, v3

    .line 51
    goto :goto_1

    .line 52
    :sswitch_3
    const-string v1, "legacy"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    const/4 v0, 0x4

    .line 61
    goto :goto_1

    .line 62
    :sswitch_4
    const-string v1, "legacy_default_params"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    move v0, v2

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    const/4 v0, -0x1

    .line 73
    :goto_1
    if-eqz v0, :cond_5

    .line 74
    .line 75
    if-eq v0, v4, :cond_4

    .line 76
    .line 77
    if-eq v0, v3, :cond_2

    .line 78
    .line 79
    if-eq v0, v2, :cond_1

    .line 80
    .line 81
    new-instance v0, Lcom/facebook/imagepipeline/memory/c;

    .line 82
    .line 83
    iget-object v1, p0, LG1/F;->a:LG1/D;

    .line 84
    .line 85
    invoke-virtual {v1}, LG1/D;->i()LR0/d;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, LG1/F;->a:LG1/D;

    .line 90
    .line 91
    invoke-virtual {v2}, LG1/D;->c()LG1/G;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object v3, p0, LG1/F;->a:LG1/D;

    .line 96
    .line 97
    invoke-virtual {v3}, LG1/D;->d()LG1/H;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 102
    .line 103
    invoke-virtual {v4}, LG1/D;->l()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/imagepipeline/memory/c;-><init>(LR0/d;LG1/G;LG1/H;Z)V

    .line 108
    .line 109
    .line 110
    :goto_2
    iput-object v0, p0, LG1/F;->c:LG1/i;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_1
    new-instance v0, Lcom/facebook/imagepipeline/memory/c;

    .line 114
    .line 115
    iget-object v1, p0, LG1/F;->a:LG1/D;

    .line 116
    .line 117
    invoke-virtual {v1}, LG1/D;->i()LR0/d;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {}, LG1/n;->a()LG1/G;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, LG1/F;->a:LG1/D;

    .line 126
    .line 127
    invoke-virtual {v3}, LG1/D;->d()LG1/H;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 132
    .line 133
    invoke-virtual {v4}, LG1/D;->l()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/imagepipeline/memory/c;-><init>(LR0/d;LG1/G;LG1/H;Z)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    new-instance v0, LG1/u;

    .line 142
    .line 143
    iget-object v1, p0, LG1/F;->a:LG1/D;

    .line 144
    .line 145
    invoke-virtual {v1}, LG1/D;->b()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    iget-object v2, p0, LG1/F;->a:LG1/D;

    .line 150
    .line 151
    invoke-virtual {v2}, LG1/D;->a()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-static {}, LG1/A;->h()LG1/A;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 160
    .line 161
    invoke-virtual {v4}, LG1/D;->m()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_3

    .line 166
    .line 167
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 168
    .line 169
    invoke-virtual {v4}, LG1/D;->i()LR0/d;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    goto :goto_3

    .line 174
    :cond_3
    const/4 v4, 0x0

    .line 175
    :goto_3
    invoke-direct {v0, v1, v2, v3, v4}, LG1/u;-><init>(IILG1/H;LR0/d;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    new-instance v0, LG1/s;

    .line 180
    .line 181
    invoke-direct {v0}, LG1/s;-><init>()V

    .line 182
    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_5
    new-instance v0, LG1/r;

    .line 186
    .line 187
    invoke-direct {v0}, LG1/r;-><init>()V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    :goto_4
    iget-object v0, p0, LG1/F;->c:LG1/i;

    .line 192
    .line 193
    return-object v0

    .line 194
    nop

    .line 195
    :sswitch_data_0
    .sparse-switch
        -0x6f64eb86 -> :sswitch_4
        -0x41f50c37 -> :sswitch_3
        -0x181d2318 -> :sswitch_2
        -0x17f85147 -> :sswitch_1
        0x5b804a8 -> :sswitch_0
    .end sparse-switch
.end method

.method public c()Lcom/facebook/imagepipeline/memory/e;
    .locals 5

    .line 1
    iget-object v0, p0, LG1/F;->d:Lcom/facebook/imagepipeline/memory/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/BufferMemoryChunkPool;

    .line 7
    .line 8
    const-class v2, LR0/d;

    .line 9
    .line 10
    const-class v3, LG1/G;

    .line 11
    .line 12
    const-class v4, LG1/H;

    .line 13
    .line 14
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, LG1/F;->a:LG1/D;

    .line 23
    .line 24
    invoke-virtual {v2}, LG1/D;->i()LR0/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, LG1/F;->a:LG1/D;

    .line 29
    .line 30
    invoke-virtual {v3}, LG1/D;->g()LG1/G;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 35
    .line 36
    invoke-virtual {v4}, LG1/D;->h()LG1/H;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/facebook/imagepipeline/memory/e;

    .line 49
    .line 50
    iput-object v1, p0, LG1/F;->d:Lcom/facebook/imagepipeline/memory/e;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    iput-object v0, p0, LG1/F;->d:Lcom/facebook/imagepipeline/memory/e;

    .line 54
    .line 55
    :cond_0
    :goto_0
    iget-object v0, p0, LG1/F;->d:Lcom/facebook/imagepipeline/memory/e;

    .line 56
    .line 57
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, LG1/F;->a:LG1/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LG1/D;->f()LG1/G;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LG1/G;->g:I

    .line 8
    .line 9
    return v0
.end method

.method public f()Lcom/facebook/imagepipeline/memory/e;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "PoolFactory"

    .line 4
    .line 5
    iget-object v2, p0, LG1/F;->e:Lcom/facebook/imagepipeline/memory/e;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    const-class v3, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;

    .line 11
    .line 12
    const-class v4, LR0/d;

    .line 13
    .line 14
    const-class v5, LG1/G;

    .line 15
    .line 16
    const-class v6, LG1/H;

    .line 17
    .line 18
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, LG1/F;->a:LG1/D;

    .line 27
    .line 28
    invoke-virtual {v4}, LG1/D;->i()LR0/d;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, LG1/F;->a:LG1/D;

    .line 33
    .line 34
    invoke-virtual {v5}, LG1/D;->g()LG1/G;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, p0, LG1/F;->a:LG1/D;

    .line 39
    .line 40
    invoke-virtual {v6}, LG1/D;->h()LG1/H;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/facebook/imagepipeline/memory/e;

    .line 53
    .line 54
    iput-object v3, p0, LG1/F;->e:Lcom/facebook/imagepipeline/memory/e;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception v3

    .line 58
    goto :goto_0

    .line 59
    :catch_1
    move-exception v3

    .line 60
    goto :goto_0

    .line 61
    :catch_2
    move-exception v3

    .line 62
    goto :goto_0

    .line 63
    :catch_3
    move-exception v3

    .line 64
    goto :goto_0

    .line 65
    :catch_4
    move-exception v3

    .line 66
    :goto_0
    invoke-static {v1, v0, v3}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    iput-object v2, p0, LG1/F;->e:Lcom/facebook/imagepipeline/memory/e;

    .line 70
    .line 71
    :cond_0
    :goto_1
    iget-object v0, p0, LG1/F;->e:Lcom/facebook/imagepipeline/memory/e;

    .line 72
    .line 73
    return-object v0
.end method

.method public g(I)LR0/i;
    .locals 3

    .line 1
    iget-object v0, p0, LG1/F;->f:LR0/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, LG1/F;->e(I)Lcom/facebook/imagepipeline/memory/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "failed to get pool for chunk type: "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, LO0/l;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    new-instance p1, LG1/z;

    .line 30
    .line 31
    invoke-virtual {p0}, LG1/F;->h()LR0/l;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p1, v0, v1}, LG1/z;-><init>(Lcom/facebook/imagepipeline/memory/e;LR0/l;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LG1/F;->f:LR0/i;

    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, LG1/F;->f:LR0/i;

    .line 41
    .line 42
    return-object p1
.end method

.method public h()LR0/l;
    .locals 2

    .line 1
    iget-object v0, p0, LG1/F;->g:LR0/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR0/l;

    .line 6
    .line 7
    invoke-virtual {p0}, LG1/F;->i()LR0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, LR0/l;-><init>(LR0/a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LG1/F;->g:LR0/l;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LG1/F;->g:LR0/l;

    .line 17
    .line 18
    return-object v0
.end method

.method public i()LR0/a;
    .locals 4

    .line 1
    iget-object v0, p0, LG1/F;->h:LR0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/imagepipeline/memory/d;

    .line 6
    .line 7
    iget-object v1, p0, LG1/F;->a:LG1/D;

    .line 8
    .line 9
    invoke-virtual {v1}, LG1/D;->i()LR0/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LG1/F;->a:LG1/D;

    .line 14
    .line 15
    invoke-virtual {v2}, LG1/D;->j()LG1/G;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, LG1/F;->a:LG1/D;

    .line 20
    .line 21
    invoke-virtual {v3}, LG1/D;->k()LG1/H;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/memory/d;-><init>(LR0/d;LG1/G;LG1/H;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LG1/F;->h:LR0/a;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, LG1/F;->h:LR0/a;

    .line 31
    .line 32
    return-object v0
.end method
