.class public final Lcom/facebook/react/uimanager/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/z$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/uimanager/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/z;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/z;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/z;->a:Lcom/facebook/react/uimanager/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a([DD)V
    .locals 2

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    int-to-double v0, v0

    div-double/2addr v0, p1

    const/16 p1, 0xb

    aput-wide v0, p0, p1

    return-void
.end method

.method public static final b([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    neg-double v0, v0

    const/16 v2, 0x9

    aput-wide v0, p0, v2

    const/16 v0, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final c([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    neg-double v0, v0

    const/4 v2, 0x2

    aput-wide v0, p0, v2

    const/16 v0, 0x8

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    const/16 v0, 0xa

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final d([DD)V
    .locals 3

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    const/4 v0, 0x1

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    aput-wide v1, p0, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    neg-double v0, v0

    const/4 v2, 0x4

    aput-wide v0, p0, v2

    const/4 v0, 0x5

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final e([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final f([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final g([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final h([DD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    move-result-wide p1

    aput-wide p1, p0, v0

    return-void
.end method

.method public static final i([DDD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    aput-wide p1, p0, v0

    const/16 p1, 0xd

    aput-wide p3, p0, p1

    return-void
.end method

.method public static final j([DDDD)V
    .locals 1

    .line 1
    const-string v0, "m"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    aput-wide p1, p0, v0

    const/16 p1, 0xd

    aput-wide p3, p0, p1

    const/16 p1, 0xe

    aput-wide p5, p0, p1

    return-void
.end method

.method public static final k([DLcom/facebook/react/uimanager/z$a;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x4

    const-string v5, "transformMatrix"

    invoke-static {v0, v5}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "ctx"

    invoke-static {v1, v5}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x10

    if-ne v5, v8, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    invoke-static {v5}, LO1/a;->a(Z)V

    iget-object v5, v1, Lcom/facebook/react/uimanager/z$a;->a:[D

    iget-object v9, v1, Lcom/facebook/react/uimanager/z$a;->b:[D

    iget-object v10, v1, Lcom/facebook/react/uimanager/z$a;->c:[D

    iget-object v11, v1, Lcom/facebook/react/uimanager/z$a;->d:[D

    iget-object v1, v1, Lcom/facebook/react/uimanager/z$a;->e:[D

    sget-object v12, Lcom/facebook/react/uimanager/z;->a:Lcom/facebook/react/uimanager/z;

    const/16 v13, 0xf

    aget-wide v14, v0, v13

    invoke-direct {v12, v14, v15}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v12

    if-eqz v12, :cond_1

    return-void

    :cond_1
    new-array v12, v4, [[D

    move v14, v6

    :goto_1
    if-ge v14, v4, :cond_2

    new-array v15, v4, [D

    aput-object v15, v12, v14

    add-int/2addr v14, v7

    goto :goto_1

    :cond_2
    new-array v8, v8, [D

    move v14, v6

    :goto_2
    if-ge v14, v4, :cond_5

    move v15, v6

    :goto_3
    if-ge v15, v4, :cond_4

    mul-int/lit8 v16, v14, 0x4

    add-int v16, v16, v15

    aget-wide v17, v0, v16

    aget-wide v19, v0, v13

    div-double v17, v17, v19

    aget-object v19, v12, v14

    aput-wide v17, v19, v15

    if-ne v15, v3, :cond_3

    const-wide/16 v17, 0x0

    :cond_3
    aput-wide v17, v8, v16

    add-int/2addr v15, v7

    goto :goto_3

    :cond_4
    add-int/2addr v14, v7

    goto :goto_2

    :cond_5
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    aput-wide v14, v8, v13

    sget-object v0, Lcom/facebook/react/uimanager/z;->a:Lcom/facebook/react/uimanager/z;

    invoke-static {v8}, Lcom/facebook/react/uimanager/z;->m([D)D

    move-result-wide v14

    invoke-direct {v0, v14, v15}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v13

    if-eqz v13, :cond_6

    return-void

    :cond_6
    aget-object v13, v12, v6

    aget-wide v14, v13, v3

    invoke-direct {v0, v14, v15}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v13

    if-eqz v13, :cond_8

    aget-object v13, v12, v7

    aget-wide v14, v13, v3

    invoke-direct {v0, v14, v15}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v13

    if-eqz v13, :cond_8

    aget-object v13, v12, v2

    aget-wide v14, v13, v3

    invoke-direct {v0, v14, v15}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    const-wide/16 v13, 0x0

    aput-wide v13, v5, v2

    aput-wide v13, v5, v7

    aput-wide v13, v5, v6

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    aput-wide v13, v5, v3

    goto :goto_5

    :cond_8
    :goto_4
    aget-object v0, v12, v6

    aget-wide v13, v0, v3

    aget-object v0, v12, v7

    aget-wide v15, v0, v3

    aget-object v0, v12, v2

    aget-wide v17, v0, v3

    aget-object v0, v12, v3

    aget-wide v19, v0, v3

    new-array v0, v4, [D

    aput-wide v13, v0, v6

    aput-wide v15, v0, v7

    aput-wide v17, v0, v2

    aput-wide v19, v0, v3

    invoke-static {v8}, Lcom/facebook/react/uimanager/z;->n([D)[D

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->t([D)[D

    move-result-object v4

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/z;->q([D[D[D)V

    :goto_5
    move v0, v6

    :goto_6
    if-ge v0, v3, :cond_9

    aget-object v4, v12, v3

    aget-wide v13, v4, v0

    aput-wide v13, v11, v0

    add-int/2addr v0, v7

    goto :goto_6

    :cond_9
    new-array v0, v3, [[D

    move v4, v6

    :goto_7
    if-ge v4, v3, :cond_a

    new-array v5, v3, [D

    aput-object v5, v0, v4

    add-int/2addr v4, v7

    goto :goto_7

    :cond_a
    move v4, v6

    :goto_8
    if-ge v4, v3, :cond_b

    aget-object v5, v0, v4

    aget-object v8, v12, v4

    aget-wide v13, v8, v6

    aput-wide v13, v5, v6

    aget-wide v13, v8, v7

    aput-wide v13, v5, v7

    aget-wide v13, v8, v2

    aput-wide v13, v5, v2

    add-int/2addr v4, v7

    goto :goto_8

    :cond_b
    aget-object v4, v0, v6

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v4

    aput-wide v4, v9, v6

    aget-object v8, v0, v6

    invoke-static {v8, v4, v5}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v4

    aput-object v4, v0, v6

    aget-object v5, v0, v7

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v4

    aput-wide v4, v10, v6

    aget-object v11, v0, v7

    aget-object v12, v0, v6

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    neg-double v4, v4

    move-wide v15, v4

    invoke-static/range {v11 .. v16}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v4

    aput-object v4, v0, v7

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v4

    aput-wide v4, v9, v7

    aget-object v8, v0, v7

    invoke-static {v8, v4, v5}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v4

    aput-object v4, v0, v7

    aget-wide v4, v10, v6

    aget-wide v11, v9, v7

    div-double/2addr v4, v11

    aput-wide v4, v10, v6

    aget-object v4, v0, v6

    aget-object v5, v0, v2

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v4

    aput-wide v4, v10, v7

    aget-object v11, v0, v2

    aget-object v12, v0, v6

    neg-double v4, v4

    move-wide v15, v4

    invoke-static/range {v11 .. v16}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v4

    aput-object v4, v0, v2

    aget-object v5, v0, v7

    invoke-static {v5, v4}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v4

    aput-wide v4, v10, v2

    aget-object v11, v0, v2

    aget-object v12, v0, v7

    neg-double v4, v4

    move-wide v15, v4

    invoke-static/range {v11 .. v16}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v4

    aput-object v4, v0, v2

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v4

    aput-wide v4, v9, v2

    aget-object v8, v0, v2

    invoke-static {v8, v4, v5}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v4

    aput-object v4, v0, v2

    aget-wide v11, v10, v7

    aget-wide v13, v9, v2

    div-double/2addr v11, v13

    aput-wide v11, v10, v7

    aget-wide v11, v10, v2

    div-double/2addr v11, v13

    aput-wide v11, v10, v2

    aget-object v5, v0, v7

    invoke-static {v5, v4}, Lcom/facebook/react/uimanager/z;->v([D[D)[D

    move-result-object v4

    aget-object v5, v0, v6

    invoke-static {v5, v4}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v4

    const-wide/16 v10, 0x0

    cmpg-double v4, v4, v10

    if-gez v4, :cond_c

    move v4, v6

    :goto_9
    if-ge v4, v3, :cond_c

    aget-wide v10, v9, v4

    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    mul-double/2addr v10, v12

    aput-wide v10, v9, v4

    aget-object v5, v0, v4

    aget-wide v10, v5, v6

    mul-double/2addr v10, v12

    aput-wide v10, v5, v6

    aget-wide v10, v5, v7

    mul-double/2addr v10, v12

    aput-wide v10, v5, v7

    aget-wide v10, v5, v2

    mul-double/2addr v10, v12

    aput-wide v10, v5, v2

    add-int/2addr v4, v7

    goto :goto_9

    :cond_c
    aget-object v3, v0, v2

    aget-wide v4, v3, v7

    aget-wide v8, v3, v2

    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    neg-double v3, v3

    const-wide v8, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v3, v8

    invoke-static {v3, v4}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v3

    aput-wide v3, v1, v6

    aget-object v3, v0, v2

    aget-wide v4, v3, v6

    neg-double v4, v4

    aget-wide v10, v3, v7

    mul-double/2addr v10, v10

    aget-wide v12, v3, v2

    mul-double/2addr v12, v12

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    neg-double v3, v3

    mul-double/2addr v3, v8

    invoke-static {v3, v4}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v3

    aput-wide v3, v1, v7

    aget-object v3, v0, v7

    aget-wide v4, v3, v6

    aget-object v0, v0, v6

    aget-wide v6, v0, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    neg-double v3, v3

    mul-double/2addr v3, v8

    invoke-static {v3, v4}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v3

    aput-wide v3, v1, v2

    return-void
.end method

.method public static final l(D)D
    .locals 2

    .line 1
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr p0, v0

    const/16 v0, 0xb4

    int-to-double v0, v0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static final m([D)D
    .locals 49

    .line 1
    move-object/from16 v0, p0

    const-string v1, "matrix"

    invoke-static {v0, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aget-wide v1, v0, v1

    const/4 v3, 0x1

    aget-wide v3, v0, v3

    const/4 v5, 0x2

    aget-wide v5, v0, v5

    const/4 v7, 0x3

    aget-wide v7, v0, v7

    const/4 v9, 0x4

    aget-wide v9, v0, v9

    const/4 v11, 0x5

    aget-wide v11, v0, v11

    const/4 v13, 0x6

    aget-wide v13, v0, v13

    const/4 v15, 0x7

    aget-wide v15, v0, v15

    const/16 v17, 0x8

    aget-wide v17, v0, v17

    const/16 v19, 0x9

    aget-wide v19, v0, v19

    const/16 v21, 0xa

    aget-wide v21, v0, v21

    const/16 v23, 0xb

    aget-wide v23, v0, v23

    const/16 v25, 0xc

    aget-wide v25, v0, v25

    const/16 v27, 0xd

    aget-wide v27, v0, v27

    const/16 v29, 0xe

    aget-wide v29, v0, v29

    const/16 v31, 0xf

    aget-wide v31, v0, v31

    mul-double v33, v7, v13

    mul-double v35, v33, v19

    mul-double v35, v35, v25

    mul-double v37, v5, v15

    mul-double v39, v37, v19

    mul-double v39, v39, v25

    sub-double v35, v35, v39

    mul-double v39, v7, v11

    mul-double v41, v39, v21

    mul-double v41, v41, v25

    sub-double v35, v35, v41

    mul-double v41, v3, v15

    mul-double v43, v41, v21

    mul-double v43, v43, v25

    add-double v35, v35, v43

    mul-double v43, v5, v11

    mul-double v45, v43, v23

    mul-double v45, v45, v25

    add-double v35, v35, v45

    mul-double v45, v3, v13

    mul-double v47, v45, v23

    mul-double v47, v47, v25

    sub-double v35, v35, v47

    mul-double v33, v33, v17

    mul-double v33, v33, v27

    sub-double v35, v35, v33

    mul-double v37, v37, v17

    mul-double v37, v37, v27

    add-double v35, v35, v37

    mul-double/2addr v7, v9

    mul-double v25, v7, v21

    mul-double v25, v25, v27

    add-double v35, v35, v25

    mul-double/2addr v15, v1

    mul-double v25, v15, v21

    mul-double v25, v25, v27

    sub-double v35, v35, v25

    mul-double/2addr v5, v9

    mul-double v25, v5, v23

    mul-double v25, v25, v27

    sub-double v35, v35, v25

    mul-double/2addr v13, v1

    mul-double v25, v13, v23

    mul-double v25, v25, v27

    add-double v35, v35, v25

    mul-double v39, v39, v17

    mul-double v39, v39, v29

    add-double v35, v35, v39

    mul-double v41, v41, v17

    mul-double v41, v41, v29

    sub-double v35, v35, v41

    mul-double v7, v7, v19

    mul-double v7, v7, v29

    sub-double v35, v35, v7

    mul-double v15, v15, v19

    mul-double v15, v15, v29

    add-double v35, v35, v15

    mul-double/2addr v3, v9

    mul-double v7, v3, v23

    mul-double v7, v7, v29

    add-double v35, v35, v7

    mul-double/2addr v1, v11

    mul-double v23, v23, v1

    mul-double v23, v23, v29

    sub-double v35, v35, v23

    mul-double v43, v43, v17

    mul-double v43, v43, v31

    sub-double v35, v35, v43

    mul-double v45, v45, v17

    mul-double v45, v45, v31

    add-double v35, v35, v45

    mul-double v5, v5, v19

    mul-double v5, v5, v31

    add-double v35, v35, v5

    mul-double v13, v13, v19

    mul-double v13, v13, v31

    sub-double v35, v35, v13

    mul-double v3, v3, v21

    mul-double v3, v3, v31

    sub-double v35, v35, v3

    mul-double v1, v1, v21

    mul-double v1, v1, v31

    add-double v35, v35, v1

    return-wide v35
.end method

.method public static final n([D)[D
    .locals 110

    .line 1
    move-object/from16 v0, p0

    const/16 v4, 0xc

    const/16 v5, 0xb

    const/16 v6, 0xa

    const/16 v7, 0x9

    const/16 v8, 0x8

    const/4 v9, 0x7

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v14, 0x2

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-string v1, "matrix"

    invoke-static {v0, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lcom/facebook/react/uimanager/z;->m([D)D

    move-result-wide v2

    sget-object v1, Lcom/facebook/react/uimanager/z;->a:Lcom/facebook/react/uimanager/z;

    invoke-direct {v1, v2, v3}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    aget-wide v18, v0, v16

    aget-wide v20, v0, v15

    aget-wide v22, v0, v14

    aget-wide v24, v0, v13

    aget-wide v26, v0, v12

    aget-wide v28, v0, v11

    aget-wide v30, v0, v10

    aget-wide v32, v0, v9

    aget-wide v34, v0, v8

    aget-wide v36, v0, v7

    aget-wide v38, v0, v6

    aget-wide v40, v0, v5

    aget-wide v42, v0, v4

    const/16 v1, 0xd

    aget-wide v44, v0, v1

    const/16 v1, 0xe

    aget-wide v46, v0, v1

    const/16 v17, 0xf

    aget-wide v48, v0, v17

    mul-double v50, v30, v40

    mul-double v52, v50, v44

    mul-double v54, v32, v38

    mul-double v56, v54, v44

    sub-double v52, v52, v56

    mul-double v56, v32, v36

    mul-double v58, v56, v46

    add-double v52, v52, v58

    mul-double v58, v28, v40

    mul-double v60, v58, v46

    sub-double v52, v52, v60

    mul-double v60, v30, v36

    mul-double v62, v60, v48

    sub-double v52, v52, v62

    mul-double v62, v28, v38

    mul-double v64, v62, v48

    add-double v52, v52, v64

    div-double v52, v52, v2

    mul-double v64, v24, v38

    mul-double v66, v64, v44

    mul-double v68, v22, v40

    mul-double v70, v68, v44

    sub-double v66, v66, v70

    mul-double v70, v24, v36

    mul-double v72, v70, v46

    sub-double v66, v66, v72

    mul-double v72, v20, v40

    mul-double v74, v72, v46

    add-double v66, v66, v74

    mul-double v74, v22, v36

    mul-double v76, v74, v48

    add-double v66, v66, v76

    mul-double v76, v20, v38

    mul-double v78, v76, v48

    sub-double v66, v66, v78

    div-double v66, v66, v2

    mul-double v78, v22, v32

    mul-double v80, v78, v44

    mul-double v82, v24, v30

    mul-double v84, v82, v44

    sub-double v80, v80, v84

    mul-double v84, v24, v28

    mul-double v86, v84, v46

    add-double v80, v80, v86

    mul-double v86, v20, v32

    mul-double v88, v86, v46

    sub-double v80, v80, v88

    mul-double v88, v22, v28

    mul-double v90, v88, v48

    sub-double v80, v80, v90

    mul-double v90, v20, v30

    mul-double v92, v90, v48

    add-double v80, v80, v92

    div-double v80, v80, v2

    mul-double v92, v82, v36

    mul-double v94, v78, v36

    sub-double v92, v92, v94

    mul-double v94, v84, v38

    sub-double v92, v92, v94

    mul-double v94, v86, v38

    add-double v92, v92, v94

    mul-double v94, v88, v40

    add-double v92, v92, v94

    mul-double v94, v90, v40

    sub-double v92, v92, v94

    div-double v92, v92, v2

    mul-double v54, v54, v42

    mul-double v50, v50, v42

    sub-double v54, v54, v50

    mul-double v50, v32, v34

    mul-double v94, v50, v46

    sub-double v54, v54, v94

    mul-double v94, v26, v40

    mul-double v96, v94, v46

    add-double v54, v54, v96

    mul-double v96, v30, v34

    mul-double v98, v96, v48

    add-double v54, v54, v98

    mul-double v98, v26, v38

    mul-double v100, v98, v48

    sub-double v54, v54, v100

    div-double v54, v54, v2

    mul-double v68, v68, v42

    mul-double v64, v64, v42

    sub-double v68, v68, v64

    mul-double v64, v24, v34

    mul-double v100, v64, v46

    add-double v68, v68, v100

    mul-double v100, v18, v40

    mul-double v102, v100, v46

    sub-double v68, v68, v102

    mul-double v102, v22, v34

    mul-double v104, v102, v48

    sub-double v68, v68, v104

    mul-double v104, v18, v38

    mul-double v106, v104, v48

    add-double v68, v68, v106

    div-double v68, v68, v2

    mul-double v106, v82, v42

    mul-double v108, v78, v42

    sub-double v106, v106, v108

    mul-double v24, v24, v26

    mul-double v108, v24, v46

    sub-double v106, v106, v108

    mul-double v32, v32, v18

    mul-double v108, v32, v46

    add-double v106, v106, v108

    mul-double v22, v22, v26

    mul-double v108, v22, v48

    add-double v106, v106, v108

    mul-double v30, v30, v18

    mul-double v108, v30, v48

    sub-double v106, v106, v108

    div-double v106, v106, v2

    mul-double v78, v78, v34

    mul-double v82, v82, v34

    sub-double v78, v78, v82

    mul-double v82, v24, v38

    add-double v78, v78, v82

    mul-double v82, v32, v38

    sub-double v78, v78, v82

    mul-double v82, v22, v40

    sub-double v78, v78, v82

    mul-double v82, v30, v40

    add-double v78, v78, v82

    div-double v78, v78, v2

    mul-double v58, v58, v42

    mul-double v56, v56, v42

    sub-double v58, v58, v56

    mul-double v50, v50, v44

    add-double v58, v58, v50

    mul-double v94, v94, v44

    sub-double v58, v58, v94

    mul-double v50, v28, v34

    mul-double v56, v50, v48

    sub-double v58, v58, v56

    mul-double v56, v26, v36

    mul-double v82, v56, v48

    add-double v58, v58, v82

    div-double v58, v58, v2

    mul-double v70, v70, v42

    mul-double v72, v72, v42

    sub-double v70, v70, v72

    mul-double v64, v64, v44

    sub-double v70, v70, v64

    mul-double v100, v100, v44

    add-double v70, v70, v100

    mul-double v64, v20, v34

    mul-double v72, v64, v48

    add-double v70, v70, v72

    mul-double v72, v18, v36

    mul-double v82, v72, v48

    sub-double v70, v70, v82

    div-double v70, v70, v2

    mul-double v82, v86, v42

    mul-double v94, v84, v42

    sub-double v82, v82, v94

    mul-double v94, v24, v44

    add-double v82, v82, v94

    mul-double v94, v32, v44

    sub-double v82, v82, v94

    mul-double v20, v20, v26

    mul-double v26, v20, v48

    sub-double v82, v82, v26

    mul-double v18, v18, v28

    mul-double v48, v48, v18

    add-double v82, v82, v48

    div-double v82, v82, v2

    mul-double v84, v84, v34

    mul-double v86, v86, v34

    sub-double v84, v84, v86

    mul-double v24, v24, v36

    sub-double v84, v84, v24

    mul-double v32, v32, v36

    add-double v84, v84, v32

    mul-double v24, v20, v40

    add-double v84, v84, v24

    mul-double v40, v40, v18

    sub-double v84, v84, v40

    div-double v84, v84, v2

    mul-double v60, v60, v42

    mul-double v62, v62, v42

    sub-double v60, v60, v62

    mul-double v96, v96, v44

    sub-double v60, v60, v96

    mul-double v98, v98, v44

    add-double v60, v60, v98

    mul-double v50, v50, v46

    add-double v60, v60, v50

    mul-double v56, v56, v46

    sub-double v60, v60, v56

    div-double v60, v60, v2

    mul-double v76, v76, v42

    mul-double v74, v74, v42

    sub-double v76, v76, v74

    mul-double v102, v102, v44

    add-double v76, v76, v102

    mul-double v104, v104, v44

    sub-double v76, v76, v104

    mul-double v64, v64, v46

    sub-double v76, v76, v64

    mul-double v72, v72, v46

    add-double v76, v76, v72

    div-double v76, v76, v2

    mul-double v24, v88, v42

    mul-double v42, v42, v90

    sub-double v24, v24, v42

    mul-double v26, v22, v44

    sub-double v24, v24, v26

    mul-double v44, v44, v30

    add-double v24, v24, v44

    mul-double v26, v20, v46

    add-double v24, v24, v26

    mul-double v46, v46, v18

    sub-double v24, v24, v46

    div-double v24, v24, v2

    mul-double v90, v90, v34

    mul-double v88, v88, v34

    sub-double v90, v90, v88

    mul-double v22, v22, v36

    add-double v90, v90, v22

    mul-double v30, v30, v36

    sub-double v90, v90, v30

    mul-double v20, v20, v38

    sub-double v90, v90, v20

    mul-double v18, v18, v38

    add-double v90, v90, v18

    div-double v90, v90, v2

    const/16 v0, 0x10

    new-array v0, v0, [D

    aput-wide v52, v0, v16

    aput-wide v66, v0, v15

    aput-wide v80, v0, v14

    aput-wide v92, v0, v13

    aput-wide v54, v0, v12

    aput-wide v68, v0, v11

    aput-wide v106, v0, v10

    aput-wide v78, v0, v9

    aput-wide v58, v0, v8

    aput-wide v70, v0, v7

    aput-wide v82, v0, v6

    aput-wide v84, v0, v5

    aput-wide v60, v0, v4

    const/16 v2, 0xd

    aput-wide v76, v0, v2

    const/16 v1, 0xe

    aput-wide v24, v0, v1

    const/16 v1, 0xf

    aput-wide v90, v0, v1

    return-object v0
.end method

.method private final o(D)Z
    .locals 4

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double p1, p1, v2

    if-gez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public static final p([D[D[D)V
    .locals 63

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "out"

    invoke-static {v0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "a"

    invoke-static {v1, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "b"

    invoke-static {v2, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aget-wide v4, v1, v3

    const/4 v6, 0x1

    aget-wide v7, v1, v6

    const/4 v9, 0x2

    aget-wide v10, v1, v9

    const/4 v12, 0x3

    aget-wide v13, v1, v12

    const/4 v15, 0x4

    aget-wide v16, v1, v15

    const/16 v18, 0x5

    aget-wide v19, v1, v18

    const/16 v21, 0x6

    aget-wide v22, v1, v21

    const/16 v24, 0x7

    aget-wide v25, v1, v24

    const/16 v27, 0x8

    aget-wide v28, v1, v27

    const/16 v30, 0x9

    aget-wide v31, v1, v30

    const/16 v33, 0xa

    aget-wide v34, v1, v33

    const/16 v36, 0xb

    aget-wide v37, v1, v36

    const/16 v39, 0xc

    aget-wide v40, v1, v39

    const/16 v42, 0xd

    aget-wide v43, v1, v42

    const/16 v45, 0xe

    aget-wide v46, v1, v45

    const/16 v48, 0xf

    aget-wide v49, v1, v48

    aget-wide v51, v2, v3

    aget-wide v53, v2, v6

    aget-wide v55, v2, v9

    aget-wide v57, v2, v12

    mul-double v59, v51, v4

    mul-double v61, v53, v16

    add-double v59, v59, v61

    mul-double v61, v55, v28

    add-double v59, v59, v61

    mul-double v61, v57, v40

    add-double v59, v59, v61

    aput-wide v59, v0, v3

    mul-double v59, v51, v7

    mul-double v61, v53, v19

    add-double v59, v59, v61

    mul-double v61, v55, v31

    add-double v59, v59, v61

    mul-double v61, v57, v43

    add-double v59, v59, v61

    aput-wide v59, v0, v6

    mul-double v59, v51, v10

    mul-double v61, v53, v22

    add-double v59, v59, v61

    mul-double v61, v55, v34

    add-double v59, v59, v61

    mul-double v61, v57, v46

    add-double v59, v59, v61

    aput-wide v59, v0, v9

    mul-double v51, v51, v13

    mul-double v53, v53, v25

    add-double v51, v51, v53

    mul-double v55, v55, v37

    add-double v51, v51, v55

    mul-double v57, v57, v49

    add-double v51, v51, v57

    aput-wide v51, v0, v12

    aget-wide v51, v2, v15

    aget-wide v53, v2, v18

    aget-wide v55, v2, v21

    aget-wide v57, v2, v24

    mul-double v59, v51, v4

    mul-double v61, v53, v16

    add-double v59, v59, v61

    mul-double v61, v55, v28

    add-double v59, v59, v61

    mul-double v61, v57, v40

    add-double v59, v59, v61

    aput-wide v59, v0, v15

    mul-double v59, v51, v7

    mul-double v61, v53, v19

    add-double v59, v59, v61

    mul-double v61, v55, v31

    add-double v59, v59, v61

    mul-double v61, v57, v43

    add-double v59, v59, v61

    aput-wide v59, v0, v18

    mul-double v59, v51, v10

    mul-double v61, v53, v22

    add-double v59, v59, v61

    mul-double v61, v55, v34

    add-double v59, v59, v61

    mul-double v61, v57, v46

    add-double v59, v59, v61

    aput-wide v59, v0, v21

    mul-double v51, v51, v13

    mul-double v53, v53, v25

    add-double v51, v51, v53

    mul-double v55, v55, v37

    add-double v51, v51, v55

    mul-double v57, v57, v49

    add-double v51, v51, v57

    aput-wide v51, v0, v24

    aget-wide v51, v2, v27

    aget-wide v53, v2, v30

    aget-wide v55, v2, v33

    aget-wide v57, v2, v36

    mul-double v59, v51, v4

    mul-double v61, v53, v16

    add-double v59, v59, v61

    mul-double v61, v55, v28

    add-double v59, v59, v61

    mul-double v61, v57, v40

    add-double v59, v59, v61

    aput-wide v59, v0, v27

    mul-double v59, v51, v7

    mul-double v61, v53, v19

    add-double v59, v59, v61

    mul-double v61, v55, v31

    add-double v59, v59, v61

    mul-double v61, v57, v43

    add-double v59, v59, v61

    aput-wide v59, v0, v30

    mul-double v59, v51, v10

    mul-double v61, v53, v22

    add-double v59, v59, v61

    mul-double v61, v55, v34

    add-double v59, v59, v61

    mul-double v61, v57, v46

    add-double v59, v59, v61

    aput-wide v59, v0, v33

    mul-double v51, v51, v13

    mul-double v53, v53, v25

    add-double v51, v51, v53

    mul-double v55, v55, v37

    add-double v51, v51, v55

    mul-double v57, v57, v49

    add-double v51, v51, v57

    aput-wide v51, v0, v36

    aget-wide v51, v2, v39

    aget-wide v53, v2, v42

    aget-wide v55, v2, v45

    aget-wide v1, v2, v48

    mul-double v4, v4, v51

    mul-double v16, v16, v53

    add-double v4, v4, v16

    mul-double v28, v28, v55

    add-double v4, v4, v28

    mul-double v40, v40, v1

    add-double v4, v4, v40

    aput-wide v4, v0, v39

    mul-double v7, v7, v51

    mul-double v19, v19, v53

    add-double v7, v7, v19

    mul-double v31, v31, v55

    add-double v7, v7, v31

    mul-double v43, v43, v1

    add-double v7, v7, v43

    aput-wide v7, v0, v42

    mul-double v10, v10, v51

    mul-double v22, v22, v53

    add-double v10, v10, v22

    mul-double v34, v34, v55

    add-double v10, v10, v34

    mul-double v46, v46, v1

    add-double v10, v10, v46

    aput-wide v10, v0, v45

    mul-double v51, v51, v13

    mul-double v53, v53, v25

    add-double v51, v51, v53

    mul-double v55, v55, v37

    add-double v51, v51, v55

    mul-double v1, v1, v49

    add-double v51, v51, v1

    aput-wide v51, v0, v48

    return-void
.end method

.method public static final q([D[D[D)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "v"

    invoke-static {v0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "m"

    invoke-static {v1, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "result"

    invoke-static {v2, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aget-wide v4, v0, v3

    const/4 v6, 0x1

    aget-wide v7, v0, v6

    const/4 v9, 0x2

    aget-wide v10, v0, v9

    const/4 v12, 0x3

    aget-wide v13, v0, v12

    aget-wide v15, v1, v3

    mul-double/2addr v15, v4

    const/4 v0, 0x4

    aget-wide v17, v1, v0

    mul-double v17, v17, v7

    add-double v15, v15, v17

    const/16 v0, 0x8

    aget-wide v17, v1, v0

    mul-double v17, v17, v10

    add-double v15, v15, v17

    const/16 v0, 0xc

    aget-wide v17, v1, v0

    mul-double v17, v17, v13

    add-double v15, v15, v17

    aput-wide v15, v2, v3

    aget-wide v15, v1, v6

    mul-double/2addr v15, v4

    const/4 v0, 0x5

    aget-wide v17, v1, v0

    mul-double v17, v17, v7

    add-double v15, v15, v17

    const/16 v0, 0x9

    aget-wide v17, v1, v0

    mul-double v17, v17, v10

    add-double v15, v15, v17

    const/16 v0, 0xd

    aget-wide v17, v1, v0

    mul-double v17, v17, v13

    add-double v15, v15, v17

    aput-wide v15, v2, v6

    aget-wide v15, v1, v9

    mul-double/2addr v15, v4

    const/4 v0, 0x6

    aget-wide v17, v1, v0

    mul-double v17, v17, v7

    add-double v15, v15, v17

    const/16 v0, 0xa

    aget-wide v17, v1, v0

    mul-double v17, v17, v10

    add-double v15, v15, v17

    const/16 v0, 0xe

    aget-wide v17, v1, v0

    mul-double v17, v17, v13

    add-double v15, v15, v17

    aput-wide v15, v2, v9

    aget-wide v15, v1, v12

    mul-double/2addr v4, v15

    const/4 v0, 0x7

    aget-wide v15, v1, v0

    mul-double/2addr v7, v15

    add-double/2addr v4, v7

    const/16 v0, 0xb

    aget-wide v6, v1, v0

    mul-double/2addr v10, v6

    add-double/2addr v4, v10

    const/16 v0, 0xf

    aget-wide v0, v1, v0

    mul-double/2addr v13, v0

    add-double/2addr v4, v13

    aput-wide v4, v2, v12

    return-void
.end method

.method public static final r([D)V
    .locals 3

    .line 1
    const-string v0, "matrix"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xe

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/16 v0, 0xd

    aput-wide v1, p0, v0

    const/16 v0, 0xc

    aput-wide v1, p0, v0

    const/16 v0, 0xb

    aput-wide v1, p0, v0

    const/16 v0, 0x9

    aput-wide v1, p0, v0

    const/16 v0, 0x8

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aput-wide v1, p0, v0

    const/4 v0, 0x4

    aput-wide v1, p0, v0

    const/4 v0, 0x3

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aput-wide v1, p0, v0

    const/4 v0, 0x1

    aput-wide v1, p0, v0

    const/16 v0, 0xf

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    aput-wide v1, p0, v0

    const/16 v0, 0xa

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aput-wide v1, p0, v0

    const/4 v0, 0x0

    aput-wide v1, p0, v0

    return-void
.end method

.method public static final s(D)D
    .locals 2

    .line 1
    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-double p0, p0

    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static final t([D)[D
    .locals 49

    .line 1
    move-object/from16 v0, p0

    const-string v1, "m"

    invoke-static {v0, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    const/4 v4, 0x4

    aget-wide v5, v0, v4

    const/16 v7, 0x8

    aget-wide v8, v0, v7

    const/16 v10, 0xc

    aget-wide v11, v0, v10

    const/4 v13, 0x1

    aget-wide v14, v0, v13

    const/16 v16, 0x5

    aget-wide v17, v0, v16

    const/16 v19, 0x9

    aget-wide v20, v0, v19

    const/16 v22, 0xd

    aget-wide v23, v0, v22

    const/16 v25, 0x2

    aget-wide v26, v0, v25

    const/16 v28, 0x6

    aget-wide v29, v0, v28

    const/16 v31, 0xa

    aget-wide v32, v0, v31

    const/16 v34, 0xe

    aget-wide v35, v0, v34

    const/16 v37, 0x3

    aget-wide v38, v0, v37

    const/16 v40, 0x7

    aget-wide v41, v0, v40

    const/16 v43, 0xb

    aget-wide v44, v0, v43

    const/16 v46, 0xf

    aget-wide v47, v0, v46

    const/16 v0, 0x10

    new-array v0, v0, [D

    aput-wide v2, v0, v1

    aput-wide v5, v0, v13

    aput-wide v8, v0, v25

    aput-wide v11, v0, v37

    aput-wide v14, v0, v4

    aput-wide v17, v0, v16

    aput-wide v20, v0, v28

    aput-wide v23, v0, v40

    aput-wide v26, v0, v7

    aput-wide v29, v0, v19

    aput-wide v32, v0, v31

    aput-wide v35, v0, v43

    aput-wide v38, v0, v10

    aput-wide v41, v0, v22

    aput-wide v44, v0, v34

    aput-wide v47, v0, v46

    return-object v0
.end method

.method public static final u([D[DDD)[D
    .locals 9

    .line 1
    const-string v0, "a"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    mul-double/2addr v1, p2

    aget-wide v3, p1, v0

    mul-double/2addr v3, p4

    add-double/2addr v1, v3

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    mul-double/2addr v4, p2

    aget-wide v6, p1, v3

    mul-double/2addr v6, p4

    add-double/2addr v4, v6

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    mul-double/2addr p2, v7

    aget-wide p0, p1, v6

    mul-double/2addr p4, p0

    add-double/2addr p2, p4

    const/4 p0, 0x3

    new-array p0, p0, [D

    aput-wide v1, p0, v0

    aput-wide v4, p0, v3

    aput-wide p2, p0, v6

    return-object p0
.end method

.method public static final v([D[D)[D
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "a"

    invoke-static {v0, v2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "b"

    invoke-static {v1, v2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    aget-wide v3, v0, v2

    const/4 v5, 0x2

    aget-wide v6, v1, v5

    mul-double v8, v3, v6

    aget-wide v10, v0, v5

    aget-wide v12, v1, v2

    mul-double v14, v10, v12

    sub-double/2addr v8, v14

    const/4 v14, 0x0

    aget-wide v15, v1, v14

    mul-double/2addr v10, v15

    aget-wide v17, v0, v14

    mul-double v6, v6, v17

    sub-double/2addr v10, v6

    mul-double v17, v17, v12

    mul-double/2addr v3, v15

    sub-double v17, v17, v3

    const/4 v0, 0x3

    new-array v0, v0, [D

    aput-wide v8, v0, v14

    aput-wide v10, v0, v2

    aput-wide v17, v0, v5

    return-object v0
.end method

.method public static final w([D[D)D
    .locals 7

    .line 1
    const-string v0, "a"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    mul-double/2addr v1, v3

    const/4 v0, 0x1

    aget-wide v3, p0, v0

    aget-wide v5, p1, v0

    mul-double/2addr v3, v5

    add-double/2addr v1, v3

    const/4 v0, 0x2

    aget-wide v3, p0, v0

    aget-wide p0, p1, v0

    mul-double/2addr v3, p0

    add-double/2addr v1, v3

    return-wide v1
.end method

.method public static final x([D)D
    .locals 4

    .line 1
    const-string v0, "a"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-wide v0, p0, v0

    mul-double/2addr v0, v0

    const/4 v2, 0x1

    aget-wide v2, p0, v2

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    const/4 v2, 0x2

    aget-wide v2, p0, v2

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static final y([DD)[D
    .locals 9

    .line 1
    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "vector"

    invoke-static {p0, v2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    int-to-double v3, v2

    sget-object v5, Lcom/facebook/react/uimanager/z;->a:Lcom/facebook/react/uimanager/z;

    invoke-direct {v5, p1, p2}, Lcom/facebook/react/uimanager/z;->o(D)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {p0}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide p1

    :cond_0
    div-double/2addr v3, p1

    aget-wide p1, p0, v1

    mul-double/2addr p1, v3

    aget-wide v5, p0, v2

    mul-double/2addr v5, v3

    aget-wide v7, p0, v0

    mul-double/2addr v7, v3

    const/4 p0, 0x3

    new-array p0, p0, [D

    aput-wide p1, p0, v1

    aput-wide v5, p0, v2

    aput-wide v7, p0, v0

    return-object p0
.end method
