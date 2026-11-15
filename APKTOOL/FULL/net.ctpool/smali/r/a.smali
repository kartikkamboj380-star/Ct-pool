.class public Lr/a;
.super Lr/i;
.source "SourceFile"


# instance fields
.field private A0:I

.field private y0:I

.field private z0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lr/i;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lr/a;->y0:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lr/a;->z0:Z

    .line 9
    .line 10
    iput v0, p0, Lr/a;->A0:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public G0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/a;->z0:Z

    .line 2
    .line 3
    return v0
.end method

.method public H0()I
    .locals 1

    .line 1
    iget v0, p0, Lr/a;->y0:I

    .line 2
    .line 3
    return v0
.end method

.method public I0()I
    .locals 1

    .line 1
    iget v0, p0, Lr/a;->A0:I

    .line 2
    .line 3
    return v0
.end method

.method protected J0()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lr/i;->x0:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_4

    .line 6
    .line 7
    iget-object v2, p0, Lr/i;->w0:[Lr/e;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    iget v3, p0, Lr/a;->y0:I

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 v5, 0x2

    .line 20
    if-eq v3, v5, :cond_1

    .line 21
    .line 22
    const/4 v5, 0x3

    .line 23
    if-ne v3, v5, :cond_3

    .line 24
    .line 25
    :cond_1
    invoke-virtual {v2, v4, v4}, Lr/e;->l0(IZ)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    invoke-virtual {v2, v0, v4}, Lr/e;->l0(IZ)V

    .line 30
    .line 31
    .line 32
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_4
    return-void
.end method

.method public K0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/a;->z0:Z

    .line 2
    .line 3
    return-void
.end method

.method public L0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/a;->y0:I

    .line 2
    .line 3
    return-void
.end method

.method public M0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr/a;->A0:I

    .line 2
    .line 3
    return-void
.end method

.method public f(Lq/d;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lr/e;->J:[Lr/d;

    iget-object v1, p0, Lr/e;->B:Lr/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lr/e;->C:Lr/d;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    iget-object v1, p0, Lr/e;->D:Lr/d;

    const/4 v4, 0x1

    aput-object v1, v0, v4

    iget-object v1, p0, Lr/e;->E:Lr/d;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    move v0, v2

    :goto_0
    iget-object v1, p0, Lr/e;->J:[Lr/d;

    array-length v6, v1

    if-ge v0, v6, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v6

    iput-object v6, v1, Lr/d;->g:Lq/i;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lr/a;->y0:I

    if-ltz v0, :cond_19

    const/4 v6, 0x4

    if-ge v0, v6, :cond_19

    aget-object v0, v1, v0

    move v1, v2

    :goto_1
    iget v7, p0, Lr/i;->x0:I

    if-ge v1, v7, :cond_6

    iget-object v7, p0, Lr/i;->w0:[Lr/e;

    aget-object v7, v7, v1

    iget-boolean v8, p0, Lr/a;->z0:Z

    if-nez v8, :cond_1

    invoke-virtual {v7}, Lr/e;->g()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    iget v8, p0, Lr/a;->y0:I

    if-eqz v8, :cond_2

    if-ne v8, v4, :cond_3

    :cond_2
    invoke-virtual {v7}, Lr/e;->w()Lr/e$b;

    move-result-object v8

    sget-object v9, Lr/e$b;->o:Lr/e$b;

    if-ne v8, v9, :cond_3

    iget-object v8, v7, Lr/e;->B:Lr/d;

    iget-object v8, v8, Lr/d;->d:Lr/d;

    if-eqz v8, :cond_3

    iget-object v8, v7, Lr/e;->D:Lr/d;

    iget-object v8, v8, Lr/d;->d:Lr/d;

    if-eqz v8, :cond_3

    :goto_2
    move v1, v4

    goto :goto_4

    :cond_3
    iget v8, p0, Lr/a;->y0:I

    if-eq v8, v3, :cond_4

    if-ne v8, v5, :cond_5

    :cond_4
    invoke-virtual {v7}, Lr/e;->K()Lr/e$b;

    move-result-object v8

    sget-object v9, Lr/e$b;->o:Lr/e$b;

    if-ne v8, v9, :cond_5

    iget-object v8, v7, Lr/e;->C:Lr/d;

    iget-object v8, v8, Lr/d;->d:Lr/d;

    if-eqz v8, :cond_5

    iget-object v7, v7, Lr/e;->E:Lr/d;

    iget-object v7, v7, Lr/d;->d:Lr/d;

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_4
    iget-object v7, p0, Lr/e;->B:Lr/d;

    invoke-virtual {v7}, Lr/d;->h()Z

    move-result v7

    if-nez v7, :cond_8

    iget-object v7, p0, Lr/e;->D:Lr/d;

    invoke-virtual {v7}, Lr/d;->h()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_5

    :cond_7
    move v7, v2

    goto :goto_6

    :cond_8
    :goto_5
    move v7, v4

    :goto_6
    iget-object v8, p0, Lr/e;->C:Lr/d;

    invoke-virtual {v8}, Lr/d;->h()Z

    move-result v8

    if-nez v8, :cond_a

    iget-object v8, p0, Lr/e;->E:Lr/d;

    invoke-virtual {v8}, Lr/d;->h()Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_7

    :cond_9
    move v8, v2

    goto :goto_8

    :cond_a
    :goto_7
    move v8, v4

    :goto_8
    if-nez v1, :cond_f

    iget v9, p0, Lr/a;->y0:I

    if-nez v9, :cond_b

    if-nez v7, :cond_e

    :cond_b
    if-ne v9, v3, :cond_c

    if-nez v8, :cond_e

    :cond_c
    if-ne v9, v4, :cond_d

    if-nez v7, :cond_e

    :cond_d
    if-ne v9, v5, :cond_f

    if-eqz v8, :cond_f

    :cond_e
    move v7, v4

    goto :goto_9

    :cond_f
    move v7, v2

    :goto_9
    if-nez v7, :cond_10

    move v7, v6

    goto :goto_a

    :cond_10
    const/4 v7, 0x5

    :goto_a
    move v8, v2

    :goto_b
    iget v9, p0, Lr/i;->x0:I

    if-ge v8, v9, :cond_15

    iget-object v9, p0, Lr/i;->w0:[Lr/e;

    aget-object v9, v9, v8

    iget-boolean v10, p0, Lr/a;->z0:Z

    if-nez v10, :cond_11

    invoke-virtual {v9}, Lr/e;->g()Z

    move-result v10

    if-nez v10, :cond_11

    goto :goto_f

    :cond_11
    iget-object v10, v9, Lr/e;->J:[Lr/d;

    iget v11, p0, Lr/a;->y0:I

    aget-object v10, v10, v11

    invoke-virtual {p1, v10}, Lq/d;->q(Ljava/lang/Object;)Lq/i;

    move-result-object v10

    iget-object v9, v9, Lr/e;->J:[Lr/d;

    iget v11, p0, Lr/a;->y0:I

    aget-object v9, v9, v11

    iput-object v10, v9, Lr/d;->g:Lq/i;

    iget-object v12, v9, Lr/d;->d:Lr/d;

    if-eqz v12, :cond_12

    iget-object v12, v12, Lr/d;->b:Lr/e;

    if-ne v12, p0, :cond_12

    iget v9, v9, Lr/d;->e:I

    goto :goto_c

    :cond_12
    move v9, v2

    :goto_c
    if-eqz v11, :cond_14

    if-ne v11, v3, :cond_13

    goto :goto_d

    :cond_13
    iget-object v11, v0, Lr/d;->g:Lq/i;

    iget v12, p0, Lr/a;->A0:I

    add-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v1}, Lq/d;->g(Lq/i;Lq/i;IZ)V

    goto :goto_e

    :cond_14
    :goto_d
    iget-object v11, v0, Lr/d;->g:Lq/i;

    iget v12, p0, Lr/a;->A0:I

    sub-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v1}, Lq/d;->i(Lq/i;Lq/i;IZ)V

    :goto_e
    iget-object v11, v0, Lr/d;->g:Lq/i;

    iget v12, p0, Lr/a;->A0:I

    add-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v7}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    :goto_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_15
    iget v0, p0, Lr/a;->y0:I

    const/16 v1, 0x8

    if-nez v0, :cond_16

    iget-object v0, p0, Lr/e;->D:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v3, p0, Lr/e;->B:Lr/d;

    iget-object v3, v3, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v3, v2, v1}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->B:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->D:Lr/d;

    iget-object v1, v1, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v1, v2, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->B:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->B:Lr/d;

    :goto_10
    iget-object v1, v1, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v1, v2, v2}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    goto :goto_11

    :cond_16
    if-ne v0, v4, :cond_17

    iget-object v0, p0, Lr/e;->B:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v3, p0, Lr/e;->D:Lr/d;

    iget-object v3, v3, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v3, v2, v1}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->B:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->B:Lr/d;

    iget-object v1, v1, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v1, v2, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->B:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->D:Lr/d;

    goto :goto_10

    :cond_17
    if-ne v0, v3, :cond_18

    iget-object v0, p0, Lr/e;->E:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v3, p0, Lr/e;->C:Lr/d;

    iget-object v3, v3, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v3, v2, v1}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->C:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->E:Lr/d;

    iget-object v1, v1, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v1, v2, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->C:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->C:Lr/d;

    goto :goto_10

    :cond_18
    if-ne v0, v5, :cond_19

    iget-object v0, p0, Lr/e;->C:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v3, p0, Lr/e;->E:Lr/d;

    iget-object v3, v3, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v3, v2, v1}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->C:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->C:Lr/d;

    iget-object v1, v1, Lr/d;->g:Lq/i;

    invoke-virtual {p1, v0, v1, v2, v6}, Lq/d;->e(Lq/i;Lq/i;II)Lq/b;

    iget-object v0, p0, Lr/e;->C:Lr/d;

    iget-object v0, v0, Lr/d;->g:Lq/i;

    iget-object v1, p0, Lr/e;->N:Lr/e;

    iget-object v1, v1, Lr/e;->E:Lr/d;

    goto :goto_10

    :cond_19
    :goto_11
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[Barrier] "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lr/e;->p()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " {"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    iget v2, p0, Lr/i;->x0:I

    .line 29
    .line 30
    if-ge v1, v2, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lr/i;->w0:[Lr/e;

    .line 33
    .line 34
    aget-object v2, v2, v1

    .line 35
    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ", "

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lr/e;->p()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, "}"

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    return-object v0
.end method
