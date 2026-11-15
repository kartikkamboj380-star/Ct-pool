.class public Lr/f;
.super Lr/k;
.source "SourceFile"


# instance fields
.field private A0:Z

.field protected B0:Lq/d;

.field C0:I

.field D0:I

.field E0:I

.field F0:I

.field G0:I

.field H0:I

.field I0:[Lr/c;

.field J0:[Lr/c;

.field public K0:Z

.field public L0:Z

.field public M0:Z

.field public N0:I

.field public O0:I

.field private P0:I

.field public Q0:Z

.field private R0:Z

.field private S0:Z

.field T0:I

.field x0:Ls/b;

.field public y0:Ls/e;

.field protected z0:Ls/b$b;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lr/k;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls/b;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Ls/b;-><init>(Lr/f;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr/f;->x0:Ls/b;

    .line 10
    .line 11
    new-instance v0, Ls/e;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ls/e;-><init>(Lr/f;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr/f;->y0:Ls/e;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lr/f;->z0:Ls/b$b;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lr/f;->A0:Z

    .line 23
    .line 24
    new-instance v1, Lq/d;

    .line 25
    .line 26
    invoke-direct {v1}, Lq/d;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lr/f;->B0:Lq/d;

    .line 30
    .line 31
    iput v0, p0, Lr/f;->G0:I

    .line 32
    .line 33
    iput v0, p0, Lr/f;->H0:I

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    new-array v2, v1, [Lr/c;

    .line 37
    .line 38
    iput-object v2, p0, Lr/f;->I0:[Lr/c;

    .line 39
    .line 40
    new-array v1, v1, [Lr/c;

    .line 41
    .line 42
    iput-object v1, p0, Lr/f;->J0:[Lr/c;

    .line 43
    .line 44
    iput-boolean v0, p0, Lr/f;->K0:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lr/f;->L0:Z

    .line 47
    .line 48
    iput-boolean v0, p0, Lr/f;->M0:Z

    .line 49
    .line 50
    iput v0, p0, Lr/f;->N0:I

    .line 51
    .line 52
    iput v0, p0, Lr/f;->O0:I

    .line 53
    .line 54
    const/16 v1, 0x107

    .line 55
    .line 56
    iput v1, p0, Lr/f;->P0:I

    .line 57
    .line 58
    iput-boolean v0, p0, Lr/f;->Q0:Z

    .line 59
    .line 60
    iput-boolean v0, p0, Lr/f;->R0:Z

    .line 61
    .line 62
    iput-boolean v0, p0, Lr/f;->S0:Z

    .line 63
    .line 64
    iput v0, p0, Lr/f;->T0:I

    .line 65
    .line 66
    return-void
.end method

.method private L0(Lr/e;)V
    .locals 5

    .line 1
    iget v0, p0, Lr/f;->G0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lr/f;->J0:[Lr/c;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-lt v0, v2, :cond_0

    .line 9
    .line 10
    array-length v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [Lr/c;

    .line 18
    .line 19
    iput-object v0, p0, Lr/f;->J0:[Lr/c;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lr/f;->J0:[Lr/c;

    .line 22
    .line 23
    iget v1, p0, Lr/f;->G0:I

    .line 24
    .line 25
    new-instance v2, Lr/c;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {p0}, Lr/f;->V0()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {v2, p1, v3, v4}, Lr/c;-><init>(Lr/e;IZ)V

    .line 33
    .line 34
    .line 35
    aput-object v2, v0, v1

    .line 36
    .line 37
    iget p1, p0, Lr/f;->G0:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    iput p1, p0, Lr/f;->G0:I

    .line 42
    .line 43
    return-void
.end method

.method private M0(Lr/e;)V
    .locals 5

    .line 1
    iget v0, p0, Lr/f;->H0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget-object v2, p0, Lr/f;->I0:[Lr/c;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-lt v0, v3, :cond_0

    .line 9
    .line 10
    array-length v0, v2

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [Lr/c;

    .line 18
    .line 19
    iput-object v0, p0, Lr/f;->I0:[Lr/c;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lr/f;->I0:[Lr/c;

    .line 22
    .line 23
    iget v2, p0, Lr/f;->H0:I

    .line 24
    .line 25
    new-instance v3, Lr/c;

    .line 26
    .line 27
    invoke-virtual {p0}, Lr/f;->V0()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-direct {v3, p1, v1, v4}, Lr/c;-><init>(Lr/e;IZ)V

    .line 32
    .line 33
    .line 34
    aput-object v3, v0, v2

    .line 35
    .line 36
    iget p1, p0, Lr/f;->H0:I

    .line 37
    .line 38
    add-int/2addr p1, v1

    .line 39
    iput p1, p0, Lr/f;->H0:I

    .line 40
    .line 41
    return-void
.end method

.method private Z0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lr/f;->G0:I

    .line 3
    .line 4
    iput v0, p0, Lr/f;->H0:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public E0(ZZ)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lr/e;->E0(ZZ)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lr/e;

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2}, Lr/e;->E0(ZZ)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public G0()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    .line 1
    iput v2, v1, Lr/e;->S:I

    iput v2, v1, Lr/e;->T:I

    invoke-virtual/range {p0 .. p0}, Lr/e;->N()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lr/e;->t()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput-boolean v2, v1, Lr/f;->R0:Z

    iput-boolean v2, v1, Lr/f;->S0:Z

    const/16 v0, 0x40

    invoke-virtual {v1, v0}, Lr/f;->Y0(I)Z

    move-result v0

    const/4 v5, 0x1

    if-nez v0, :cond_1

    const/16 v0, 0x80

    invoke-virtual {v1, v0}, Lr/f;->Y0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v5

    :goto_1
    iget-object v6, v1, Lr/f;->B0:Lq/d;

    iput-boolean v2, v6, Lq/d;->g:Z

    iput-boolean v2, v6, Lq/d;->h:Z

    iget v7, v1, Lr/f;->P0:I

    if-eqz v7, :cond_2

    if-eqz v0, :cond_2

    iput-boolean v5, v6, Lq/d;->h:Z

    :cond_2
    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    aget-object v6, v0, v5

    aget-object v7, v0, v2

    iget-object v8, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lr/e;->w()Lr/e$b;

    move-result-object v0

    sget-object v9, Lr/e$b;->n:Lr/e$b;

    if-eq v0, v9, :cond_4

    invoke-virtual/range {p0 .. p0}, Lr/e;->K()Lr/e$b;

    move-result-object v0

    if-ne v0, v9, :cond_3

    goto :goto_2

    :cond_3
    move v9, v2

    goto :goto_3

    :cond_4
    :goto_2
    move v9, v5

    :goto_3
    invoke-direct/range {p0 .. p0}, Lr/f;->Z0()V

    iget-object v0, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v0, v2

    :goto_4
    if-ge v0, v10, :cond_6

    iget-object v11, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lr/e;

    instance-of v12, v11, Lr/k;

    if-eqz v12, :cond_5

    check-cast v11, Lr/k;

    invoke-virtual {v11}, Lr/k;->G0()V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_6
    move v0, v2

    move v12, v0

    move v11, v5

    :goto_5
    if-eqz v11, :cond_13

    add-int/lit8 v13, v0, 0x1

    :try_start_0
    iget-object v0, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v0}, Lq/d;->D()V

    invoke-direct/range {p0 .. p0}, Lr/f;->Z0()V

    iget-object v0, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v1, v0}, Lr/e;->j(Lq/d;)V

    move v0, v2

    :goto_6
    if-ge v0, v10, :cond_7

    iget-object v14, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/e;

    iget-object v15, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v14, v15}, Lr/e;->j(Lq/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_7
    iget-object v0, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v1, v0}, Lr/f;->K0(Lq/d;)Z

    move-result v11

    if-eqz v11, :cond_8

    iget-object v0, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v0}, Lq/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v14, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "EXCEPTION : "

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_8
    :goto_8
    iget-object v0, v1, Lr/f;->B0:Lq/d;

    if-eqz v11, :cond_9

    sget-object v5, Lr/j;->a:[Z

    invoke-virtual {v1, v0, v5}, Lr/f;->d1(Lq/d;[Z)V

    goto :goto_a

    :cond_9
    invoke-virtual {v1, v0}, Lr/e;->F0(Lq/d;)V

    move v0, v2

    :goto_9
    if-ge v0, v10, :cond_a

    iget-object v5, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr/e;

    iget-object v11, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v5, v11}, Lr/e;->F0(Lq/d;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_a
    :goto_a
    if-eqz v9, :cond_d

    const/16 v0, 0x8

    if-ge v13, v0, :cond_d

    sget-object v0, Lr/j;->a:[Z

    const/4 v5, 0x2

    aget-boolean v0, v0, v5

    if-eqz v0, :cond_d

    move v0, v2

    move v5, v0

    move v11, v5

    :goto_b
    if-ge v0, v10, :cond_b

    iget-object v14, v1, Lr/k;->w0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr/e;

    iget v15, v14, Lr/e;->S:I

    invoke-virtual {v14}, Lr/e;->N()I

    move-result v16

    add-int v15, v15, v16

    invoke-static {v5, v15}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget v15, v14, Lr/e;->T:I

    invoke-virtual {v14}, Lr/e;->t()I

    move-result v14

    add-int/2addr v15, v14

    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    move-result v11

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_b
    iget v0, v1, Lr/e;->Z:I

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v5, v1, Lr/e;->a0:I

    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    move-result v5

    sget-object v11, Lr/e$b;->n:Lr/e$b;

    if-ne v7, v11, :cond_c

    invoke-virtual/range {p0 .. p0}, Lr/e;->N()I

    move-result v14

    if-ge v14, v0, :cond_c

    invoke-virtual {v1, v0}, Lr/e;->A0(I)V

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    aput-object v11, v0, v2

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_c

    :cond_c
    move v0, v2

    :goto_c
    if-ne v6, v11, :cond_e

    invoke-virtual/range {p0 .. p0}, Lr/e;->t()I

    move-result v14

    if-ge v14, v5, :cond_e

    invoke-virtual {v1, v5}, Lr/e;->e0(I)V

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    const/4 v5, 0x1

    aput-object v11, v0, v5

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_d

    :cond_d
    move v0, v2

    :cond_e
    :goto_d
    iget v5, v1, Lr/e;->Z:I

    invoke-virtual/range {p0 .. p0}, Lr/e;->N()I

    move-result v11

    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lr/e;->N()I

    move-result v11

    if-le v5, v11, :cond_f

    invoke-virtual {v1, v5}, Lr/e;->A0(I)V

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    sget-object v5, Lr/e$b;->m:Lr/e$b;

    aput-object v5, v0, v2

    const/4 v0, 0x1

    const/4 v12, 0x1

    :cond_f
    iget v5, v1, Lr/e;->a0:I

    invoke-virtual/range {p0 .. p0}, Lr/e;->t()I

    move-result v11

    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lr/e;->t()I

    move-result v11

    if-le v5, v11, :cond_10

    invoke-virtual {v1, v5}, Lr/e;->e0(I)V

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    sget-object v5, Lr/e$b;->m:Lr/e$b;

    const/4 v11, 0x1

    aput-object v5, v0, v11

    move v0, v11

    move v5, v0

    goto :goto_e

    :cond_10
    const/4 v11, 0x1

    move v5, v12

    :goto_e
    if-nez v5, :cond_12

    iget-object v12, v1, Lr/e;->M:[Lr/e$b;

    aget-object v12, v12, v2

    sget-object v14, Lr/e$b;->n:Lr/e$b;

    if-ne v12, v14, :cond_11

    if-lez v3, :cond_11

    invoke-virtual/range {p0 .. p0}, Lr/e;->N()I

    move-result v12

    if-le v12, v3, :cond_11

    iput-boolean v11, v1, Lr/f;->R0:Z

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    sget-object v5, Lr/e$b;->m:Lr/e$b;

    aput-object v5, v0, v2

    invoke-virtual {v1, v3}, Lr/e;->A0(I)V

    move v0, v11

    move v5, v0

    :cond_11
    iget-object v12, v1, Lr/e;->M:[Lr/e$b;

    aget-object v12, v12, v11

    if-ne v12, v14, :cond_12

    if-lez v4, :cond_12

    invoke-virtual/range {p0 .. p0}, Lr/e;->t()I

    move-result v12

    if-le v12, v4, :cond_12

    iput-boolean v11, v1, Lr/f;->S0:Z

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    sget-object v5, Lr/e$b;->m:Lr/e$b;

    aput-object v5, v0, v11

    invoke-virtual {v1, v4}, Lr/e;->e0(I)V

    const/4 v11, 0x1

    const/4 v12, 0x1

    goto :goto_f

    :cond_12
    move v11, v0

    move v12, v5

    :goto_f
    move v0, v13

    const/4 v5, 0x1

    goto/16 :goto_5

    :cond_13
    iput-object v8, v1, Lr/k;->w0:Ljava/util/ArrayList;

    if-eqz v12, :cond_14

    iget-object v0, v1, Lr/e;->M:[Lr/e$b;

    aput-object v7, v0, v2

    const/4 v2, 0x1

    aput-object v6, v0, v2

    :cond_14
    iget-object v0, v1, Lr/f;->B0:Lq/d;

    invoke-virtual {v0}, Lq/d;->v()Lq/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lr/k;->X(Lq/c;)V

    return-void
.end method

.method J0(Lr/e;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lr/f;->L0(Lr/e;)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lr/f;->M0(Lr/e;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    return-void
.end method

.method public K0(Lq/d;)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lr/e;->f(Lq/d;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    move v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x1

    .line 14
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    iget-object v5, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lr/e;

    .line 23
    .line 24
    invoke-virtual {v5, v1, v1}, Lr/e;->l0(IZ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v4, v1}, Lr/e;->l0(IZ)V

    .line 28
    .line 29
    .line 30
    instance-of v5, v5, Lr/a;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    move v3, v4

    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    if-eqz v3, :cond_3

    .line 39
    .line 40
    move v2, v1

    .line 41
    :goto_1
    if-ge v2, v0, :cond_3

    .line 42
    .line 43
    iget-object v3, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lr/e;

    .line 50
    .line 51
    instance-of v5, v3, Lr/a;

    .line 52
    .line 53
    if-eqz v5, :cond_2

    .line 54
    .line 55
    check-cast v3, Lr/a;

    .line 56
    .line 57
    invoke-virtual {v3}, Lr/a;->J0()V

    .line 58
    .line 59
    .line 60
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move v2, v1

    .line 64
    :goto_2
    if-ge v2, v0, :cond_5

    .line 65
    .line 66
    iget-object v3, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lr/e;

    .line 73
    .line 74
    invoke-virtual {v3}, Lr/e;->e()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    invoke-virtual {v3, p1}, Lr/e;->f(Lq/d;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    move v2, v1

    .line 87
    :goto_3
    if-ge v2, v0, :cond_b

    .line 88
    .line 89
    iget-object v3, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lr/e;

    .line 96
    .line 97
    instance-of v5, v3, Lr/f;

    .line 98
    .line 99
    if-eqz v5, :cond_9

    .line 100
    .line 101
    iget-object v5, v3, Lr/e;->M:[Lr/e$b;

    .line 102
    .line 103
    aget-object v6, v5, v1

    .line 104
    .line 105
    aget-object v5, v5, v4

    .line 106
    .line 107
    sget-object v7, Lr/e$b;->n:Lr/e$b;

    .line 108
    .line 109
    if-ne v6, v7, :cond_6

    .line 110
    .line 111
    sget-object v8, Lr/e$b;->m:Lr/e$b;

    .line 112
    .line 113
    invoke-virtual {v3, v8}, Lr/e;->i0(Lr/e$b;)V

    .line 114
    .line 115
    .line 116
    :cond_6
    if-ne v5, v7, :cond_7

    .line 117
    .line 118
    sget-object v8, Lr/e$b;->m:Lr/e$b;

    .line 119
    .line 120
    invoke-virtual {v3, v8}, Lr/e;->w0(Lr/e$b;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {v3, p1}, Lr/e;->f(Lq/d;)V

    .line 124
    .line 125
    .line 126
    if-ne v6, v7, :cond_8

    .line 127
    .line 128
    invoke-virtual {v3, v6}, Lr/e;->i0(Lr/e$b;)V

    .line 129
    .line 130
    .line 131
    :cond_8
    if-ne v5, v7, :cond_a

    .line 132
    .line 133
    invoke-virtual {v3, v5}, Lr/e;->w0(Lr/e$b;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    invoke-static {p0, p1, v3}, Lr/j;->a(Lr/f;Lq/d;Lr/e;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Lr/e;->e()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-nez v5, :cond_a

    .line 145
    .line 146
    invoke-virtual {v3, p1}, Lr/e;->f(Lq/d;)V

    .line 147
    .line 148
    .line 149
    :cond_a
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_b
    iget v0, p0, Lr/f;->G0:I

    .line 153
    .line 154
    if-lez v0, :cond_c

    .line 155
    .line 156
    invoke-static {p0, p1, v1}, Lr/b;->a(Lr/f;Lq/d;I)V

    .line 157
    .line 158
    .line 159
    :cond_c
    iget v0, p0, Lr/f;->H0:I

    .line 160
    .line 161
    if-lez v0, :cond_d

    .line 162
    .line 163
    invoke-static {p0, p1, v4}, Lr/b;->a(Lr/f;Lq/d;I)V

    .line 164
    .line 165
    .line 166
    :cond_d
    return v4
.end method

.method public N0(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls/e;->f(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public O0(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls/e;->g(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public P0(ZI)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ls/e;->h(ZI)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public Q0()Ls/b$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->z0:Ls/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public R0()I
    .locals 1

    .line 1
    iget v0, p0, Lr/f;->P0:I

    .line 2
    .line 3
    return v0
.end method

.method public S0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls/e;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public T0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls/e;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public U0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/f;->S0:Z

    .line 2
    .line 3
    return v0
.end method

.method public V0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/f;->A0:Z

    .line 2
    .line 3
    return v0
.end method

.method public W()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->B0:Lq/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq/d;->D()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lr/f;->C0:I

    .line 8
    .line 9
    iput v0, p0, Lr/f;->E0:I

    .line 10
    .line 11
    iput v0, p0, Lr/f;->D0:I

    .line 12
    .line 13
    iput v0, p0, Lr/f;->F0:I

    .line 14
    .line 15
    iput-boolean v0, p0, Lr/f;->Q0:Z

    .line 16
    .line 17
    invoke-super {p0}, Lr/k;->W()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public W0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr/f;->R0:Z

    .line 2
    .line 3
    return v0
.end method

.method public X0(IIIIIIIII)J
    .locals 12

    .line 1
    move-object v11, p0

    .line 2
    move/from16 v3, p8

    .line 3
    .line 4
    iput v3, v11, Lr/f;->C0:I

    .line 5
    .line 6
    move/from16 v4, p9

    .line 7
    .line 8
    iput v4, v11, Lr/f;->D0:I

    .line 9
    .line 10
    iget-object v0, v11, Lr/f;->x0:Ls/b;

    .line 11
    .line 12
    move-object v1, p0

    .line 13
    move v2, p1

    .line 14
    move v5, p2

    .line 15
    move v6, p3

    .line 16
    move/from16 v7, p4

    .line 17
    .line 18
    move/from16 v8, p5

    .line 19
    .line 20
    move/from16 v9, p6

    .line 21
    .line 22
    move/from16 v10, p7

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v10}, Ls/b;->d(Lr/f;IIIIIIIII)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0
.end method

.method public Y0(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lr/f;->P0:I

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    return p1
.end method

.method public a1(Ls/b$b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lr/f;->z0:Ls/b$b;

    .line 2
    .line 3
    iget-object v0, p0, Lr/f;->y0:Ls/e;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls/e;->n(Ls/b$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b1(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr/f;->P0:I

    .line 2
    .line 3
    const/16 v0, 0x100

    .line 4
    .line 5
    invoke-static {p1, v0}, Lr/j;->b(II)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sput-boolean p1, Lq/d;->r:Z

    .line 10
    .line 11
    return-void
.end method

.method public c1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr/f;->A0:Z

    .line 2
    .line 3
    return-void
.end method

.method public d1(Lq/d;[Z)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    aput-boolean v1, p2, v0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr/e;->F0(Lq/d;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    :goto_0
    if-ge v1, p2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lr/k;->w0:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lr/e;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lr/e;->F0(Lq/d;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public e1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/f;->x0:Ls/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ls/b;->e(Lr/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
