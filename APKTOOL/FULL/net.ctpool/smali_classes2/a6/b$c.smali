.class final La6/b$c;
.super La6/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private p:J

.field private q:Z

.field private final r:LT5/u;

.field final synthetic s:La6/b;


# direct methods
.method public constructor <init>(La6/b;LT5/u;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La6/b$c;->s:La6/b;

    .line 7
    .line 8
    invoke-direct {p0, p1}, La6/b$a;-><init>(La6/b;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, La6/b$c;->r:LT5/u;

    .line 12
    .line 13
    const-wide/16 p1, -0x1

    .line 14
    .line 15
    iput-wide p1, p0, La6/b$c;->p:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, La6/b$c;->q:Z

    .line 19
    .line 20
    return-void
.end method

.method private final e()V
    .locals 7

    .line 1
    iget-wide v0, p0, La6/b$c;->p:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, La6/b$c;->s:La6/b;

    invoke-static {v0}, La6/b;->m(La6/b;)Li6/h;

    move-result-object v0

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    :cond_0
    :try_start_0
    iget-object v0, p0, La6/b$c;->s:La6/b;

    invoke-static {v0}, La6/b;->m(La6/b;)Li6/h;

    move-result-object v0

    invoke-interface {v0}, Li6/h;->c1()J

    move-result-wide v0

    iput-wide v0, p0, La6/b$c;->p:J

    iget-object v0, p0, La6/b$c;->s:La6/b;

    invoke-static {v0}, La6/b;->m(La6/b;)Li6/h;

    move-result-object v0

    invoke-interface {v0}, Li6/h;->C0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, LF5/g;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, La6/b$c;->p:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-ltz v1, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    const-string v1, ";"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v1, v2, v5, v6}, LF5/g;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide v0, p0, La6/b$c;->p:J

    cmp-long v0, v0, v3

    if-nez v0, :cond_2

    iput-boolean v2, p0, La6/b$c;->q:Z

    iget-object v0, p0, La6/b$c;->s:La6/b;

    invoke-static {v0}, La6/b;->k(La6/b;)La6/a;

    move-result-object v1

    invoke-virtual {v1}, La6/a;->a()LT5/t;

    move-result-object v1

    invoke-static {v0, v1}, La6/b;->q(La6/b;LT5/t;)V

    iget-object v0, p0, La6/b$c;->s:La6/b;

    invoke-static {v0}, La6/b;->j(La6/b;)LT5/z;

    move-result-object v0

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LT5/z;->p()LT5/n;

    move-result-object v0

    iget-object v1, p0, La6/b$c;->r:LT5/u;

    iget-object v2, p0, La6/b$c;->s:La6/b;

    invoke-static {v2}, La6/b;->o(La6/b;)LT5/t;

    move-result-object v2

    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, LZ5/e;->f(LT5/n;LT5/u;LT5/t;)V

    invoke-virtual {p0}, La6/b$a;->b()V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected chunk size and optional extensions"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, La6/b$c;->p:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    new-instance v1, Ljava/net/ProtocolException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public L0(Li6/f;J)J
    .locals 7

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v2, p2, v0

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ltz v2, :cond_0

    .line 12
    .line 13
    move v2, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-eqz v2, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0}, La6/b$a;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    xor-int/2addr v2, v3

    .line 23
    if-eqz v2, :cond_5

    .line 24
    .line 25
    iget-boolean v2, p0, La6/b$c;->q:Z

    .line 26
    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    return-wide v3

    .line 32
    :cond_1
    iget-wide v5, p0, La6/b$c;->p:J

    .line 33
    .line 34
    cmp-long v0, v5, v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    cmp-long v0, v5, v3

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    :cond_2
    invoke-direct {p0}, La6/b$c;->e()V

    .line 43
    .line 44
    .line 45
    iget-boolean v0, p0, La6/b$c;->q:Z

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    return-wide v3

    .line 50
    :cond_3
    iget-wide v0, p0, La6/b$c;->p:J

    .line 51
    .line 52
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide p2

    .line 56
    invoke-super {p0, p1, p2, p3}, La6/b$a;->L0(Li6/f;J)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1

    .line 60
    cmp-long p3, p1, v3

    .line 61
    .line 62
    if-eqz p3, :cond_4

    .line 63
    .line 64
    iget-wide v0, p0, La6/b$c;->p:J

    .line 65
    .line 66
    sub-long/2addr v0, p1

    .line 67
    iput-wide v0, p0, La6/b$c;->p:J

    .line 68
    .line 69
    return-wide p1

    .line 70
    :cond_4
    iget-object p1, p0, La6/b$c;->s:La6/b;

    .line 71
    .line 72
    invoke-virtual {p1}, La6/b;->e()LY5/f;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, LY5/f;->z()V

    .line 77
    .line 78
    .line 79
    new-instance p1, Ljava/net/ProtocolException;

    .line 80
    .line 81
    const-string p2, "unexpected end of stream"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, La6/b$a;->b()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string p2, "closed"

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v0, "byteCount < 0: "

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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
.end method

.method public close()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La6/b$a;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, La6/b$c;->q:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x64

    .line 13
    .line 14
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    invoke-static {p0, v0, v1}, LU5/c;->p(Li6/C;ILjava/util/concurrent/TimeUnit;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, La6/b$c;->s:La6/b;

    .line 23
    .line 24
    invoke-virtual {v0}, La6/b;->e()LY5/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, LY5/f;->z()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La6/b$a;->b()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, v0}, La6/b$a;->d(Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
