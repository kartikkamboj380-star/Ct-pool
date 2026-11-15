.class public LT5/D$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT5/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LT5/B;

.field private b:LT5/A;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:LT5/s;

.field private f:LT5/t$a;

.field private g:LT5/E;

.field private h:LT5/D;

.field private i:LT5/D;

.field private j:LT5/D;

.field private k:J

.field private l:J

.field private m:LY5/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LT5/D$a;->c:I

    new-instance v0, LT5/t$a;

    invoke-direct {v0}, LT5/t$a;-><init>()V

    iput-object v0, p0, LT5/D$a;->f:LT5/t$a;

    return-void
.end method

.method public constructor <init>(LT5/D;)V
    .locals 2

    .line 2
    const-string v0, "response"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LT5/D$a;->c:I

    invoke-virtual {p1}, LT5/D;->j0()LT5/B;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->a:LT5/B;

    invoke-virtual {p1}, LT5/D;->a0()LT5/A;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->b:LT5/A;

    invoke-virtual {p1}, LT5/D;->f()I

    move-result v0

    iput v0, p0, LT5/D$a;->c:I

    invoke-virtual {p1}, LT5/D;->B()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, LT5/D;->j()LT5/s;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->e:LT5/s;

    invoke-virtual {p1}, LT5/D;->w()LT5/t;

    move-result-object v0

    invoke-virtual {v0}, LT5/t;->i()LT5/t$a;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->f:LT5/t$a;

    invoke-virtual {p1}, LT5/D;->a()LT5/E;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->g:LT5/E;

    invoke-virtual {p1}, LT5/D;->J()LT5/D;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->h:LT5/D;

    invoke-virtual {p1}, LT5/D;->d()LT5/D;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->i:LT5/D;

    invoke-virtual {p1}, LT5/D;->W()LT5/D;

    move-result-object v0

    iput-object v0, p0, LT5/D$a;->j:LT5/D;

    invoke-virtual {p1}, LT5/D;->n0()J

    move-result-wide v0

    iput-wide v0, p0, LT5/D$a;->k:J

    invoke-virtual {p1}, LT5/D;->h0()J

    move-result-wide v0

    iput-wide v0, p0, LT5/D$a;->l:J

    invoke-virtual {p1}, LT5/D;->g()LY5/c;

    move-result-object p1

    iput-object p1, p0, LT5/D$a;->m:LY5/c;

    return-void
.end method

.method private final e(LT5/D;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, LT5/D;->a()LT5/E;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "priorResponse.body != null"

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_2
    :goto_1
    return-void
.end method

.method private final f(Ljava/lang/String;LT5/D;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    invoke-virtual {p2}, LT5/D;->a()LT5/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_7

    .line 15
    .line 16
    invoke-virtual {p2}, LT5/D;->J()LT5/D;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_1
    if-eqz v0, :cond_6

    .line 26
    .line 27
    invoke-virtual {p2}, LT5/D;->d()LT5/D;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    move v0, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v0, v1

    .line 36
    :goto_2
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-virtual {p2}, LT5/D;->W()LT5/D;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez p2, :cond_3

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_3
    if-eqz v1, :cond_4

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p1, ".priorResponse != null"

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p2

    .line 75
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p1, ".cacheResponse != null"

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p2

    .line 102
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p1, ".networkResponse != null"

    .line 111
    .line 112
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p1, ".body != null"

    .line 138
    .line 139
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p2

    .line 156
    :cond_8
    :goto_3
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LT5/D$a;->f:LT5/t$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, LT5/t$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/t$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b(LT5/E;)LT5/D$a;
    .locals 0

    .line 1
    iput-object p1, p0, LT5/D$a;->g:LT5/E;

    .line 2
    .line 3
    return-object p0
.end method

.method public c()LT5/D;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget v5, v0, LT5/D$a;->c:I

    if-ltz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v2, v0, LT5/D$a;->a:LT5/B;

    if-eqz v2, :cond_3

    iget-object v3, v0, LT5/D$a;->b:LT5/A;

    if-eqz v3, :cond_2

    iget-object v4, v0, LT5/D$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v6, v0, LT5/D$a;->e:LT5/s;

    iget-object v1, v0, LT5/D$a;->f:LT5/t$a;

    invoke-virtual {v1}, LT5/t$a;->e()LT5/t;

    move-result-object v7

    iget-object v8, v0, LT5/D$a;->g:LT5/E;

    iget-object v9, v0, LT5/D$a;->h:LT5/D;

    iget-object v10, v0, LT5/D$a;->i:LT5/D;

    iget-object v11, v0, LT5/D$a;->j:LT5/D;

    iget-wide v12, v0, LT5/D$a;->k:J

    iget-wide v14, v0, LT5/D$a;->l:J

    iget-object v1, v0, LT5/D$a;->m:LY5/c;

    new-instance v17, LT5/D;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, LT5/D;-><init>(LT5/B;LT5/A;Ljava/lang/String;ILT5/s;LT5/t;LT5/E;LT5/D;LT5/D;LT5/D;JJLY5/c;)V

    return-object v17

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, LT5/D$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public d(LT5/D;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "cacheResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, LT5/D$a;->f(Ljava/lang/String;LT5/D;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->i:LT5/D;

    .line 7
    .line 8
    return-object p0
.end method

.method public g(I)LT5/D$a;
    .locals 0

    .line 1
    iput p1, p0, LT5/D$a;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, LT5/D$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public i(LT5/s;)LT5/D$a;
    .locals 0

    .line 1
    iput-object p1, p0, LT5/D$a;->e:LT5/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LT5/D$a;->f:LT5/t$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, LT5/t$a;->i(Ljava/lang/String;Ljava/lang/String;)LT5/t$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public k(LT5/t;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LT5/t;->i()LT5/t$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LT5/D$a;->f:LT5/t$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final l(LY5/c;)V
    .locals 1

    .line 1
    const-string v0, "deferredTrailers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->m:LY5/c;

    .line 7
    .line 8
    return-void
.end method

.method public m(Ljava/lang/String;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public n(LT5/D;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "networkResponse"

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, LT5/D$a;->f(Ljava/lang/String;LT5/D;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->h:LT5/D;

    .line 7
    .line 8
    return-object p0
.end method

.method public o(LT5/D;)LT5/D$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LT5/D$a;->e(LT5/D;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/D$a;->j:LT5/D;

    .line 5
    .line 6
    return-object p0
.end method

.method public p(LT5/A;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "protocol"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->b:LT5/A;

    .line 7
    .line 8
    return-object p0
.end method

.method public q(J)LT5/D$a;
    .locals 0

    .line 1
    iput-wide p1, p0, LT5/D$a;->l:J

    .line 2
    .line 3
    return-object p0
.end method

.method public r(LT5/B;)LT5/D$a;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LT5/D$a;->a:LT5/B;

    .line 7
    .line 8
    return-object p0
.end method

.method public s(J)LT5/D$a;
    .locals 0

    .line 1
    iput-wide p1, p0, LT5/D$a;->k:J

    .line 2
    .line 3
    return-object p0
.end method
