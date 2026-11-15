.class public LB1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private final h:LR0/a;


# direct methods
.method public constructor <init>(LR0/a;)V
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
    check-cast p1, LR0/a;

    .line 9
    .line 10
    iput-object p1, p0, LB1/f;->h:LR0/a;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput p1, p0, LB1/f;->c:I

    .line 14
    .line 15
    iput p1, p0, LB1/f;->b:I

    .line 16
    .line 17
    iput p1, p0, LB1/f;->d:I

    .line 18
    .line 19
    iput p1, p0, LB1/f;->f:I

    .line 20
    .line 21
    iput p1, p0, LB1/f;->e:I

    .line 22
    .line 23
    iput p1, p0, LB1/f;->a:I

    .line 24
    .line 25
    return-void
.end method

.method private a(Ljava/io/InputStream;)Z
    .locals 11

    .line 1
    iget v0, p0, LB1/f;->e:I

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x6

    .line 6
    :try_start_0
    iget v4, p0, LB1/f;->a:I

    .line 7
    .line 8
    if-eq v4, v3, :cond_e

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, -0x1

    .line 15
    if-eq v4, v5, :cond_e

    .line 16
    .line 17
    iget v5, p0, LB1/f;->c:I

    .line 18
    .line 19
    add-int/lit8 v6, v5, 0x1

    .line 20
    .line 21
    iput v6, p0, LB1/f;->c:I

    .line 22
    .line 23
    iget-boolean v6, p0, LB1/f;->g:Z

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    iput v3, p0, LB1/f;->a:I

    .line 28
    .line 29
    iput-boolean v1, p0, LB1/f;->g:Z

    .line 30
    .line 31
    return v1

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    iget v6, p0, LB1/f;->a:I

    .line 36
    .line 37
    const/16 v7, 0xff

    .line 38
    .line 39
    if-eqz v6, :cond_c

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    if-eq v6, v2, :cond_a

    .line 43
    .line 44
    const/4 v9, 0x3

    .line 45
    if-eq v6, v8, :cond_9

    .line 46
    .line 47
    const/4 v10, 0x4

    .line 48
    if-eq v6, v9, :cond_4

    .line 49
    .line 50
    const/4 v5, 0x5

    .line 51
    if-eq v6, v10, :cond_3

    .line 52
    .line 53
    if-eq v6, v5, :cond_1

    .line 54
    .line 55
    invoke-static {v1}, LO0/l;->i(Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_1
    iget v5, p0, LB1/f;->b:I

    .line 60
    .line 61
    shl-int/lit8 v5, v5, 0x8

    .line 62
    .line 63
    add-int/2addr v5, v4

    .line 64
    sub-int/2addr v5, v8

    .line 65
    int-to-long v6, v5

    .line 66
    invoke-static {p1, v6, v7}, LW0/d;->a(Ljava/io/InputStream;J)J

    .line 67
    .line 68
    .line 69
    iget v6, p0, LB1/f;->c:I

    .line 70
    .line 71
    add-int/2addr v6, v5

    .line 72
    iput v6, p0, LB1/f;->c:I

    .line 73
    .line 74
    :cond_2
    :goto_1
    iput v8, p0, LB1/f;->a:I

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    iput v5, p0, LB1/f;->a:I

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    if-ne v4, v7, :cond_5

    .line 81
    .line 82
    :goto_2
    iput v9, p0, LB1/f;->a:I

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    if-nez v4, :cond_6

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    const/16 v6, 0xd9

    .line 89
    .line 90
    if-ne v4, v6, :cond_7

    .line 91
    .line 92
    iput-boolean v2, p0, LB1/f;->g:Z

    .line 93
    .line 94
    add-int/lit8 v5, v5, -0x1

    .line 95
    .line 96
    invoke-direct {p0, v5}, LB1/f;->f(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    const/16 v6, 0xda

    .line 101
    .line 102
    if-ne v4, v6, :cond_8

    .line 103
    .line 104
    add-int/lit8 v5, v5, -0x1

    .line 105
    .line 106
    invoke-direct {p0, v5}, LB1/f;->f(I)V

    .line 107
    .line 108
    .line 109
    :cond_8
    invoke-static {v4}, LB1/f;->b(I)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_2

    .line 114
    .line 115
    iput v10, p0, LB1/f;->a:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_9
    if-ne v4, v7, :cond_d

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_a
    const/16 v5, 0xd8

    .line 122
    .line 123
    if-ne v4, v5, :cond_b

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_b
    iput v3, p0, LB1/f;->a:I

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_c
    if-ne v4, v7, :cond_b

    .line 130
    .line 131
    iput v2, p0, LB1/f;->a:I

    .line 132
    .line 133
    :cond_d
    :goto_3
    iput v4, p0, LB1/f;->b:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :goto_4
    invoke-static {p1}, LO0/q;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 138
    .line 139
    .line 140
    :cond_e
    iget p1, p0, LB1/f;->a:I

    .line 141
    .line 142
    if-eq p1, v3, :cond_f

    .line 143
    .line 144
    iget p1, p0, LB1/f;->e:I

    .line 145
    .line 146
    if-eq p1, v0, :cond_f

    .line 147
    .line 148
    move v1, v2

    .line 149
    :cond_f
    return v1
.end method

.method private static b(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p0, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/16 v2, 0xd0

    .line 7
    .line 8
    if-lt p0, v2, :cond_1

    .line 9
    .line 10
    const/16 v2, 0xd7

    .line 11
    .line 12
    if-gt p0, v2, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/16 v2, 0xd9

    .line 16
    .line 17
    if-eq p0, v2, :cond_2

    .line 18
    .line 19
    const/16 v2, 0xd8

    .line 20
    .line 21
    if-eq p0, v2, :cond_2

    .line 22
    .line 23
    move v0, v1

    .line 24
    :cond_2
    return v0
.end method

.method private f(I)V
    .locals 1

    .line 1
    iget v0, p0, LB1/f;->d:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, LB1/f;->f:I

    .line 6
    .line 7
    :cond_0
    add-int/lit8 p1, v0, 0x1

    .line 8
    .line 9
    iput p1, p0, LB1/f;->d:I

    .line 10
    .line 11
    iput v0, p0, LB1/f;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LB1/f;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LB1/f;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB1/f;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public g(LD1/g;)Z
    .locals 5

    .line 1
    iget v0, p0, LB1/f;->a:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    invoke-virtual {p1}, LD1/g;->B()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, LB1/f;->c:I

    .line 13
    .line 14
    if-gt v0, v1, :cond_1

    .line 15
    .line 16
    return v2

    .line 17
    :cond_1
    new-instance v0, LR0/g;

    .line 18
    .line 19
    invoke-virtual {p1}, LD1/g;->w()Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, LB1/f;->h:LR0/a;

    .line 24
    .line 25
    const/16 v3, 0x4000

    .line 26
    .line 27
    invoke-interface {v1, v3}, LR0/f;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, [B

    .line 32
    .line 33
    iget-object v3, p0, LB1/f;->h:LR0/a;

    .line 34
    .line 35
    invoke-direct {v0, p1, v1, v3}, LR0/g;-><init>(Ljava/io/InputStream;[BLS0/g;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    iget p1, p0, LB1/f;->c:I

    .line 39
    .line 40
    int-to-long v3, p1

    .line 41
    invoke-static {v0, v3, v4}, LW0/d;->a(Ljava/io/InputStream;J)J

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v0}, LB1/f;->a(Ljava/io/InputStream;)Z

    .line 45
    .line 46
    .line 47
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-static {v0}, LO0/b;->b(Ljava/io/InputStream;)V

    .line 49
    .line 50
    .line 51
    return p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    :try_start_1
    invoke-static {p1}, LO0/q;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, LO0/b;->b(Ljava/io/InputStream;)V

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :goto_0
    invoke-static {v0}, LO0/b;->b(Ljava/io/InputStream;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method
