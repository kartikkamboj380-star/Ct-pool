.class public final Li6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/h;


# instance fields
.field public final m:Li6/f;

.field public n:Z

.field public final o:Li6/C;


# direct methods
.method public constructor <init>(Li6/C;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li6/w;->o:Li6/C;

    .line 10
    .line 11
    new-instance p1, Li6/f;

    .line 12
    .line 13
    invoke-direct {p1}, Li6/f;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Li6/w;->m:Li6/f;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public C0()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Li6/w;->Z(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public F()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->F()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public G0(J)[B
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Li6/w;->W0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li6/f;->G0(J)[B

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public J0()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 2
    .line 3
    iget-object v1, p0, Li6/w;->o:Li6/C;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li6/f;->x(Li6/C;)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Li6/f;->J0()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public K()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->K()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public L0(Li6/f;J)J
    .locals 4

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
    if-eqz v2, :cond_3

    .line 17
    .line 18
    iget-boolean v2, p0, Li6/w;->n:Z

    .line 19
    .line 20
    xor-int/2addr v2, v3

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 24
    .line 25
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v0, v2, v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 34
    .line 35
    iget-object v1, p0, Li6/w;->m:Li6/f;

    .line 36
    .line 37
    const/16 v2, 0x2000

    .line 38
    .line 39
    int-to-long v2, v2

    .line 40
    invoke-interface {v0, v1, v2, v3}, Li6/C;->L0(Li6/f;J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    const-wide/16 v2, -0x1

    .line 45
    .line 46
    cmp-long v0, v0, v2

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 52
    .line 53
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide p2

    .line 61
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 62
    .line 63
    invoke-virtual {v0, p1, p2, p3}, Li6/f;->L0(Li6/f;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    :goto_1
    return-wide v2

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string p2, "closed"

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v0, "byteCount < 0: "

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p2
.end method

.method public M()[B
    .locals 2

    .line 1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 2
    .line 3
    iget-object v1, p0, Li6/w;->o:Li6/C;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li6/f;->x(Li6/C;)J

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Li6/f;->M()[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public O()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Li6/f;->O()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 16
    .line 17
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 18
    .line 19
    const/16 v3, 0x2000

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    invoke-interface {v0, v2, v3, v4}, Li6/C;->L0(Li6/f;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/16 v4, -0x1

    .line 27
    .line 28
    cmp-long v0, v2, v4

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x0

    .line 34
    :goto_0
    return v1

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v1, "closed"

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public O0()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->O0()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public R(Li6/t;)I
    .locals 8

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    xor-int/2addr v0, v1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 13
    .line 14
    invoke-static {v0, p1, v1}, Lj6/a;->d(Li6/f;Li6/t;Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, -0x2

    .line 19
    const/4 v3, -0x1

    .line 20
    if-eq v0, v2, :cond_2

    .line 21
    .line 22
    if-eq v0, v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Li6/t;->k()[Li6/i;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    aget-object p1, p1, v0

    .line 29
    .line 30
    invoke-virtual {p1}, Li6/i;->C()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object v1, p0, Li6/w;->m:Li6/f;

    .line 35
    .line 36
    int-to-long v2, p1

    .line 37
    invoke-virtual {v1, v2, v3}, Li6/f;->y0(J)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    move v0, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 44
    .line 45
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 46
    .line 47
    const/16 v4, 0x2000

    .line 48
    .line 49
    int-to-long v4, v4

    .line 50
    invoke-interface {v0, v2, v4, v5}, Li6/C;->L0(Li6/f;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    const-wide/16 v6, -0x1

    .line 55
    .line 56
    cmp-long v0, v4, v6

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    return v0

    .line 62
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "closed"

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method

.method public W0(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Li6/w;->f(J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public Y()J
    .locals 10

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    move-wide v4, v2

    .line 9
    :goto_0
    add-long v6, v4, v0

    .line 10
    .line 11
    invoke-virtual {p0, v6, v7}, Li6/w;->f(J)Z

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    if-eqz v8, :cond_4

    .line 16
    .line 17
    iget-object v8, p0, Li6/w;->m:Li6/f;

    .line 18
    .line 19
    invoke-virtual {v8, v4, v5}, Li6/f;->z(J)B

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    const/16 v9, 0x30

    .line 24
    .line 25
    int-to-byte v9, v9

    .line 26
    if-lt v8, v9, :cond_0

    .line 27
    .line 28
    const/16 v9, 0x39

    .line 29
    .line 30
    int-to-byte v9, v9

    .line 31
    if-le v8, v9, :cond_1

    .line 32
    .line 33
    :cond_0
    cmp-long v4, v4, v2

    .line 34
    .line 35
    if-nez v4, :cond_2

    .line 36
    .line 37
    const/16 v5, 0x2d

    .line 38
    .line 39
    int-to-byte v5, v5

    .line 40
    if-eq v8, v5, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-wide v4, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    if-eqz v4, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v2, "Expected leading [0-9] or \'-\' character but was 0x"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 v2, 0x10

    .line 61
    .line 62
    invoke-static {v2}, LF5/a;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-static {v2}, LF5/a;->a(I)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v8, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    .line 75
    .line 76
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_4
    :goto_2
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 91
    .line 92
    invoke-virtual {v0}, Li6/f;->Y()J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    return-wide v0
.end method

.method public Z(J)Ljava/lang/String;
    .locals 13

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_1

    move-wide v5, v0

    goto :goto_1

    :cond_1
    add-long v5, p1, v3

    :goto_1
    const/16 v2, 0xa

    int-to-byte v2, v2

    const-wide/16 v9, 0x0

    move-object v7, p0

    move v8, v2

    move-wide v11, v5

    .line 1
    invoke-virtual/range {v7 .. v12}, Li6/w;->b(BJJ)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v9, v7, v9

    if-eqz v9, :cond_2

    iget-object p1, p0, Li6/w;->m:Li6/f;

    invoke-static {p1, v7, v8}, Lj6/a;->c(Li6/f;J)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    cmp-long v0, v5, v0

    if-gez v0, :cond_3

    invoke-virtual {p0, v5, v6}, Li6/w;->f(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li6/w;->m:Li6/f;

    sub-long v7, v5, v3

    invoke-virtual {v0, v7, v8}, Li6/f;->z(J)B

    move-result v0

    const/16 v1, 0xd

    int-to-byte v1, v1

    if-ne v0, v1, :cond_3

    add-long/2addr v3, v5

    invoke-virtual {p0, v3, v4}, Li6/w;->f(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li6/w;->m:Li6/f;

    invoke-virtual {v0, v5, v6}, Li6/f;->z(J)B

    move-result v0

    if-ne v0, v2, :cond_3

    iget-object p1, p0, Li6/w;->m:Li6/f;

    invoke-static {p1, v5, v6}, Lj6/a;->c(Li6/f;J)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_3
    new-instance v6, Li6/f;

    invoke-direct {v6}, Li6/f;-><init>()V

    iget-object v0, p0, Li6/w;->m:Li6/f;

    invoke-virtual {v0}, Li6/f;->m1()J

    move-result-wide v1

    const/16 v3, 0x20

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const-wide/16 v2, 0x0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Li6/f;->g(Li6/f;JJ)Li6/f;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: limit="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Li6/w;->m:Li6/f;

    invoke-virtual {v2}, Li6/f;->m1()J

    move-result-wide v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Li6/f;->f1()Li6/i;

    move-result-object p1

    invoke-virtual {p1}, Li6/i;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u2026"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "limit < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(B)J
    .locals 6

    .line 1
    const-wide/16 v2, 0x0

    .line 2
    .line 3
    const-wide v4, 0x7fffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move v1, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Li6/w;->b(BJJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public b(BJJ)J
    .locals 10

    .line 1
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v2, p2

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    cmp-long v0, p4, p2

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 20
    :goto_1
    if-eqz v1, :cond_5

    .line 21
    .line 22
    :goto_2
    cmp-long v0, p2, p4

    .line 23
    .line 24
    const-wide/16 v8, -0x1

    .line 25
    .line 26
    if-gez v0, :cond_4

    .line 27
    .line 28
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 29
    .line 30
    move v3, p1

    .line 31
    move-wide v4, p2

    .line 32
    move-wide v6, p4

    .line 33
    invoke-virtual/range {v2 .. v7}, Li6/f;->B(BJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    cmp-long v2, v0, v8

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move-wide v8, v0

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 44
    .line 45
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    cmp-long v2, v0, p4

    .line 50
    .line 51
    if-gez v2, :cond_4

    .line 52
    .line 53
    iget-object v2, p0, Li6/w;->o:Li6/C;

    .line 54
    .line 55
    iget-object v3, p0, Li6/w;->m:Li6/f;

    .line 56
    .line 57
    const/16 v4, 0x2000

    .line 58
    .line 59
    int-to-long v4, v4

    .line 60
    invoke-interface {v2, v3, v4, v5}, Li6/C;->L0(Li6/f;J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    cmp-long v2, v2, v8

    .line 65
    .line 66
    if-nez v2, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide p2

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_3
    return-wide v8

    .line 75
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "fromIndex="

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p2, " toIndex="

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p2

    .line 110
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string p2, "closed"

    .line 113
    .line 114
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method

.method public c1()J
    .locals 5

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    int-to-long v2, v1

    .line 10
    invoke-virtual {p0, v2, v3}, Li6/w;->f(J)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_5

    .line 15
    .line 16
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 17
    .line 18
    int-to-long v3, v0

    .line 19
    invoke-virtual {v2, v3, v4}, Li6/f;->z(J)B

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0x30

    .line 24
    .line 25
    int-to-byte v3, v3

    .line 26
    if-lt v2, v3, :cond_0

    .line 27
    .line 28
    const/16 v3, 0x39

    .line 29
    .line 30
    int-to-byte v3, v3

    .line 31
    if-le v2, v3, :cond_2

    .line 32
    .line 33
    :cond_0
    const/16 v3, 0x61

    .line 34
    .line 35
    int-to-byte v3, v3

    .line 36
    if-lt v2, v3, :cond_1

    .line 37
    .line 38
    const/16 v3, 0x66

    .line 39
    .line 40
    int-to-byte v3, v3

    .line 41
    if-le v2, v3, :cond_2

    .line 42
    .line 43
    :cond_1
    const/16 v3, 0x41

    .line 44
    .line 45
    int-to-byte v3, v3

    .line 46
    if-lt v2, v3, :cond_3

    .line 47
    .line 48
    const/16 v3, 0x46

    .line 49
    .line 50
    int-to-byte v3, v3

    .line 51
    if-le v2, v3, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v0, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 60
    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const/16 v3, 0x10

    .line 72
    .line 73
    invoke-static {v3}, LF5/a;->a(I)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-static {v3}, LF5/a;->a(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v2, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const-string v3, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    .line 86
    .line 87
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_5
    :goto_2
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 102
    .line 103
    invoke-virtual {v0}, Li6/f;->c1()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    return-wide v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Li6/w;->n:Z

    .line 8
    .line 9
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 10
    .line 11
    invoke-interface {v0}, Li6/C;->close()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 15
    .line 16
    invoke-virtual {v0}, Li6/f;->a()V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public d()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->h1()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public d1(Li6/A;)J
    .locals 8

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
    move-wide v2, v0

    .line 9
    :cond_0
    :goto_0
    iget-object v4, p0, Li6/w;->o:Li6/C;

    .line 10
    .line 11
    iget-object v5, p0, Li6/w;->m:Li6/f;

    .line 12
    .line 13
    const/16 v6, 0x2000

    .line 14
    .line 15
    int-to-long v6, v6

    .line 16
    invoke-interface {v4, v5, v6, v7}, Li6/C;->L0(Li6/f;J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, -0x1

    .line 21
    .line 22
    cmp-long v4, v4, v6

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, Li6/w;->m:Li6/f;

    .line 27
    .line 28
    invoke-virtual {v4}, Li6/f;->d()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    cmp-long v6, v4, v0

    .line 33
    .line 34
    if-lez v6, :cond_0

    .line 35
    .line 36
    add-long/2addr v2, v4

    .line 37
    iget-object v6, p0, Li6/w;->m:Li6/f;

    .line 38
    .line 39
    invoke-interface {p1, v6, v4, v5}, Li6/A;->w0(Li6/f;J)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v4, p0, Li6/w;->m:Li6/f;

    .line 44
    .line 45
    invoke-virtual {v4}, Li6/f;->m1()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    cmp-long v0, v4, v0

    .line 50
    .line 51
    if-lez v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 54
    .line 55
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    add-long/2addr v2, v0

    .line 60
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 61
    .line 62
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    invoke-interface {p1, v0, v4, v5}, Li6/A;->w0(Li6/f;J)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-wide v2
.end method

.method public e()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->i1()S

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public e1()Ljava/io/InputStream;
    .locals 1

    .line 1
    new-instance v0, Li6/w$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li6/w$a;-><init>(Li6/w;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public f(J)Z
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 15
    .line 16
    xor-int/2addr v0, v2

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    cmp-long v0, v3, p1

    .line 26
    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 30
    .line 31
    iget-object v3, p0, Li6/w;->m:Li6/f;

    .line 32
    .line 33
    const/16 v4, 0x2000

    .line 34
    .line 35
    int-to-long v4, v4

    .line 36
    invoke-interface {v0, v3, v4, v5}, Li6/C;->L0(Li6/f;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    const-wide/16 v5, -0x1

    .line 41
    .line 42
    cmp-long v0, v3, v5

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v1, v2

    .line 48
    :goto_1
    return v1

    .line 49
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "closed"

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v1, "byteCount < 0: "

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p2
.end method

.method public h()Li6/f;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 2
    .line 3
    invoke-interface {v0}, Li6/C;->i()Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public m0(Li6/f;J)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, p2, p3}, Li6/w;->W0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Li6/f;->m0(Li6/f;J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p2

    .line 16
    iget-object p3, p0, Li6/w;->m:Li6/f;

    .line 17
    .line 18
    invoke-virtual {p1, p3}, Li6/f;->x(Li6/C;)J

    .line 19
    .line 20
    .line 21
    throw p2
.end method

.method public p0(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "charset"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    iget-object v1, p0, Li6/w;->o:Li6/C;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li6/f;->x(Li6/C;)J

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Li6/f;->p0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public q0()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->q0()B

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 4

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 19
    .line 20
    iget-object v1, p0, Li6/w;->m:Li6/f;

    .line 21
    .line 22
    const/16 v2, 0x2000

    .line 23
    .line 24
    int-to-long v2, v2

    .line 25
    invoke-interface {v0, v1, v2, v3}, Li6/C;->L0(Li6/f;J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const-wide/16 v2, -0x1

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const/4 p1, -0x1

    .line 36
    return p1

    .line 37
    :cond_0
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Li6/f;->read(Ljava/nio/ByteBuffer;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
.end method

.method public t(J)Li6/i;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Li6/w;->W0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li6/f;->t(J)Li6/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "buffer("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Li6/w;->o:Li6/C;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x29

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public u0([B)V
    .locals 6

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    array-length v0, p1

    .line 7
    int-to-long v0, v0

    .line 8
    invoke-virtual {p0, v0, v1}, Li6/w;->W0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Li6/f;->u0([B)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 20
    .line 21
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    const-wide/16 v4, 0x0

    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 32
    .line 33
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    long-to-int v3, v3

    .line 38
    invoke-virtual {v2, p1, v1, v3}, Li6/f;->M0([BII)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, -0x1

    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    add-int/2addr v1, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    throw v0
.end method

.method public y0(J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Li6/w;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    :goto_0
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    cmp-long v2, p1, v0

    .line 10
    .line 11
    if-lez v2, :cond_2

    .line 12
    .line 13
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 14
    .line 15
    invoke-virtual {v2}, Li6/f;->m1()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long v0, v2, v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Li6/w;->o:Li6/C;

    .line 24
    .line 25
    iget-object v1, p0, Li6/w;->m:Li6/f;

    .line 26
    .line 27
    const/16 v2, 0x2000

    .line 28
    .line 29
    int-to-long v2, v2

    .line 30
    invoke-interface {v0, v1, v2, v3}, Li6/C;->L0(Li6/f;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide/16 v2, -0x1

    .line 35
    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    :goto_1
    iget-object v0, p0, Li6/w;->m:Li6/f;

    .line 48
    .line 49
    invoke-virtual {v0}, Li6/f;->m1()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iget-object v2, p0, Li6/w;->m:Li6/f;

    .line 58
    .line 59
    invoke-virtual {v2, v0, v1}, Li6/f;->y0(J)V

    .line 60
    .line 61
    .line 62
    sub-long/2addr p1, v0

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string p2, "closed"

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
