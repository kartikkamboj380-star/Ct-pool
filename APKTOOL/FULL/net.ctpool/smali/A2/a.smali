.class public LA2/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA2/a$b;
    }
.end annotation


# instance fields
.field private final A:Landroid/content/Context;

.field private B:I

.field private a:Lcom/facebook/react/uimanager/c0;

.field private b:Lcom/facebook/react/uimanager/c0;

.field private c:Lcom/facebook/react/uimanager/c0;

.field private d:LA2/a$b;

.field private e:Landroid/graphics/Path;

.field private f:Landroid/graphics/Path;

.field private g:Landroid/graphics/Path;

.field private h:Landroid/graphics/Path;

.field private i:Landroid/graphics/Path;

.field private final j:Landroid/graphics/Path;

.field private k:Landroid/graphics/Path;

.field private l:Landroid/graphics/RectF;

.field private m:Landroid/graphics/RectF;

.field private n:Landroid/graphics/RectF;

.field private o:Landroid/graphics/RectF;

.field private p:Landroid/graphics/PointF;

.field private q:Landroid/graphics/PointF;

.field private r:Landroid/graphics/PointF;

.field private s:Landroid/graphics/PointF;

.field private t:Z

.field private final u:Landroid/graphics/Paint;

.field private v:I

.field private w:I

.field private final x:F

.field private y:LC2/b;

.field private z:LC2/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LA2/a;->j:Landroid/graphics/Path;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, LA2/a;->t:Z

    .line 13
    .line 14
    new-instance v1, Landroid/graphics/Paint;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LA2/a;->u:Landroid/graphics/Paint;

    .line 21
    .line 22
    iput v0, p0, LA2/a;->v:I

    .line 23
    .line 24
    const/16 v0, 0xff

    .line 25
    .line 26
    iput v0, p0, LA2/a;->w:I

    .line 27
    .line 28
    const v0, 0x3f4ccccd    # 0.8f

    .line 29
    .line 30
    .line 31
    iput v0, p0, LA2/a;->x:F

    .line 32
    .line 33
    new-instance v0, LC2/b;

    .line 34
    .line 35
    invoke-direct {v0}, LC2/b;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, LA2/a;->y:LC2/b;

    .line 39
    .line 40
    new-instance v0, LC2/c;

    .line 41
    .line 42
    invoke-direct {v0}, LC2/c;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, LA2/a;->z:LC2/c;

    .line 46
    .line 47
    const/4 v0, -0x1

    .line 48
    iput v0, p0, LA2/a;->B:I

    .line 49
    .line 50
    iput-object p1, p0, LA2/a;->A:Landroid/content/Context;

    .line 51
    .line 52
    return-void
.end method

.method private A()V
    .locals 49

    move-object/from16 v0, p0

    const/16 v5, 0x8

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 1
    iget-boolean v10, v0, LA2/a;->t:Z

    if-nez v10, :cond_0

    return-void

    :cond_0
    iput-boolean v9, v0, LA2/a;->t:Z

    iget-object v10, v0, LA2/a;->e:Landroid/graphics/Path;

    if-nez v10, :cond_1

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iput-object v10, v0, LA2/a;->e:Landroid/graphics/Path;

    :cond_1
    iget-object v10, v0, LA2/a;->f:Landroid/graphics/Path;

    if-nez v10, :cond_2

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iput-object v10, v0, LA2/a;->f:Landroid/graphics/Path;

    :cond_2
    iget-object v10, v0, LA2/a;->g:Landroid/graphics/Path;

    if-nez v10, :cond_3

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iput-object v10, v0, LA2/a;->g:Landroid/graphics/Path;

    :cond_3
    iget-object v10, v0, LA2/a;->h:Landroid/graphics/Path;

    if-nez v10, :cond_4

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iput-object v10, v0, LA2/a;->h:Landroid/graphics/Path;

    :cond_4
    iget-object v10, v0, LA2/a;->k:Landroid/graphics/Path;

    if-nez v10, :cond_5

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iput-object v10, v0, LA2/a;->k:Landroid/graphics/Path;

    :cond_5
    iget-object v10, v0, LA2/a;->l:Landroid/graphics/RectF;

    if-nez v10, :cond_6

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v0, LA2/a;->l:Landroid/graphics/RectF;

    :cond_6
    iget-object v10, v0, LA2/a;->m:Landroid/graphics/RectF;

    if-nez v10, :cond_7

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v0, LA2/a;->m:Landroid/graphics/RectF;

    :cond_7
    iget-object v10, v0, LA2/a;->n:Landroid/graphics/RectF;

    if-nez v10, :cond_8

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v0, LA2/a;->n:Landroid/graphics/RectF;

    :cond_8
    iget-object v10, v0, LA2/a;->o:Landroid/graphics/RectF;

    if-nez v10, :cond_9

    new-instance v10, Landroid/graphics/RectF;

    invoke-direct {v10}, Landroid/graphics/RectF;-><init>()V

    iput-object v10, v0, LA2/a;->o:Landroid/graphics/RectF;

    :cond_9
    iget-object v10, v0, LA2/a;->e:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, LA2/a;->f:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, LA2/a;->g:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, LA2/a;->h:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, LA2/a;->k:Landroid/graphics/Path;

    invoke-virtual {v10}, Landroid/graphics/Path;->reset()V

    iget-object v10, v0, LA2/a;->l:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v10, v0, LA2/a;->m:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v10, v0, LA2/a;->n:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v10, v0, LA2/a;->o:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual/range {p0 .. p0}, LA2/a;->i()Landroid/graphics/RectF;

    move-result-object v10

    invoke-virtual {v0, v9}, LA2/a;->f(I)I

    move-result v11

    invoke-virtual {v0, v8}, LA2/a;->f(I)I

    move-result v12

    invoke-virtual {v0, v7}, LA2/a;->f(I)I

    move-result v13

    invoke-virtual {v0, v6}, LA2/a;->f(I)I

    move-result v14

    invoke-virtual {v0, v5}, LA2/a;->f(I)I

    move-result v15

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, LA2/a;->f(I)I

    move-result v17

    const/16 v2, 0xb

    invoke-virtual {v0, v2}, LA2/a;->f(I)I

    move-result v19

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, LA2/a;->f(I)I

    move-result v21

    invoke-direct {v0, v1}, LA2/a;->o(I)Z

    move-result v1

    if-eqz v1, :cond_a

    move/from16 v12, v17

    move v14, v12

    :cond_a
    invoke-direct {v0, v3}, LA2/a;->o(I)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_0

    :cond_b
    move/from16 v21, v14

    :goto_0
    invoke-direct {v0, v2}, LA2/a;->o(I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_1

    :cond_c
    move/from16 v19, v12

    :goto_1
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_d

    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_d

    invoke-static/range {v21 .. v21}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v15}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v3, v1, Landroid/graphics/RectF;->top:F

    iget v11, v10, Landroid/graphics/RectF;->top:F

    add-float/2addr v3, v11

    iput v3, v1, Landroid/graphics/RectF;->top:F

    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    iget v11, v10, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v3, v11

    iput v3, v1, Landroid/graphics/RectF;->bottom:F

    iget v3, v1, Landroid/graphics/RectF;->left:F

    iget v11, v10, Landroid/graphics/RectF;->left:F

    add-float/2addr v3, v11

    iput v3, v1, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->right:F

    iget v11, v10, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v11

    iput v3, v1, Landroid/graphics/RectF;->right:F

    const v1, 0x3f4ccccd    # 0.8f

    goto :goto_2

    :cond_d
    move v1, v2

    :goto_2
    iget-object v3, v0, LA2/a;->o:Landroid/graphics/RectF;

    iget v11, v3, Landroid/graphics/RectF;->top:F

    iget v12, v10, Landroid/graphics/RectF;->top:F

    const/high16 v13, 0x3f000000    # 0.5f

    mul-float/2addr v12, v13

    add-float/2addr v11, v12

    iput v11, v3, Landroid/graphics/RectF;->top:F

    iget v11, v3, Landroid/graphics/RectF;->bottom:F

    iget v12, v10, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v12, v13

    sub-float/2addr v11, v12

    iput v11, v3, Landroid/graphics/RectF;->bottom:F

    iget v11, v3, Landroid/graphics/RectF;->left:F

    iget v12, v10, Landroid/graphics/RectF;->left:F

    mul-float/2addr v12, v13

    add-float/2addr v11, v12

    iput v11, v3, Landroid/graphics/RectF;->left:F

    iget v11, v3, Landroid/graphics/RectF;->right:F

    iget v12, v10, Landroid/graphics/RectF;->right:F

    mul-float/2addr v12, v13

    sub-float/2addr v11, v12

    iput v11, v3, Landroid/graphics/RectF;->right:F

    iget-object v3, v0, LA2/a;->y:LC2/b;

    invoke-virtual/range {p0 .. p0}, LA2/a;->getLayoutDirection()I

    move-result v11

    iget-object v12, v0, LA2/a;->A:Landroid/content/Context;

    iget-object v14, v0, LA2/a;->m:Landroid/graphics/RectF;

    invoke-virtual {v14}, Landroid/graphics/RectF;->width()F

    move-result v14

    iget-object v15, v0, LA2/a;->m:Landroid/graphics/RectF;

    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    move-result v15

    invoke-virtual {v3, v11, v12, v14, v15}, LC2/b;->c(ILandroid/content/Context;FF)LC2/c;

    move-result-object v3

    iput-object v3, v0, LA2/a;->z:LC2/c;

    invoke-virtual {v3}, LC2/c;->c()F

    move-result v3

    iget-object v11, v0, LA2/a;->z:LC2/c;

    invoke-virtual {v11}, LC2/c;->d()F

    move-result v11

    iget-object v12, v0, LA2/a;->z:LC2/c;

    invoke-virtual {v12}, LC2/c;->a()F

    move-result v12

    iget-object v14, v0, LA2/a;->z:LC2/c;

    invoke-virtual {v14}, LC2/c;->b()F

    move-result v14

    iget v15, v10, Landroid/graphics/RectF;->left:F

    sub-float v15, v3, v15

    invoke-static {v15, v2}, Ljava/lang/Math;->max(FF)F

    move-result v15

    iget v13, v10, Landroid/graphics/RectF;->top:F

    sub-float v13, v3, v13

    invoke-static {v13, v2}, Ljava/lang/Math;->max(FF)F

    move-result v13

    iget v4, v10, Landroid/graphics/RectF;->right:F

    sub-float v4, v11, v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget v6, v10, Landroid/graphics/RectF;->top:F

    sub-float v6, v11, v6

    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v7, v10, Landroid/graphics/RectF;->right:F

    sub-float v7, v14, v7

    invoke-static {v7, v2}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iget v8, v10, Landroid/graphics/RectF;->bottom:F

    sub-float v8, v14, v8

    invoke-static {v8, v2}, Ljava/lang/Math;->max(FF)F

    move-result v8

    iget v9, v10, Landroid/graphics/RectF;->left:F

    sub-float v9, v12, v9

    invoke-static {v9, v2}, Ljava/lang/Math;->max(FF)F

    move-result v9

    iget v5, v10, Landroid/graphics/RectF;->bottom:F

    sub-float v5, v12, v5

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v5

    iget-object v2, v0, LA2/a;->e:Landroid/graphics/Path;

    move-object/from16 v24, v10

    iget-object v10, v0, LA2/a;->l:Landroid/graphics/RectF;

    move/from16 v25, v12

    move/from16 v26, v14

    const/16 v12, 0x8

    new-array v14, v12, [F

    const/4 v12, 0x0

    aput v15, v14, v12

    const/4 v12, 0x1

    aput v13, v14, v12

    const/4 v12, 0x2

    aput v4, v14, v12

    const/4 v12, 0x3

    aput v6, v14, v12

    const/4 v12, 0x4

    aput v7, v14, v12

    const/4 v12, 0x5

    aput v8, v14, v12

    const/4 v12, 0x6

    aput v9, v14, v12

    const/4 v12, 0x7

    aput v5, v14, v12

    sget-object v12, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v2, v10, v14, v12}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v2, v0, LA2/a;->f:Landroid/graphics/Path;

    iget-object v10, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v14, v10, Landroid/graphics/RectF;->left:F

    sub-float v28, v14, v1

    iget v14, v10, Landroid/graphics/RectF;->top:F

    sub-float v29, v14, v1

    iget v14, v10, Landroid/graphics/RectF;->right:F

    add-float v30, v14, v1

    iget v10, v10, Landroid/graphics/RectF;->bottom:F

    add-float v31, v10, v1

    const/16 v1, 0x8

    new-array v10, v1, [F

    const/4 v1, 0x0

    aput v15, v10, v1

    const/4 v1, 0x1

    aput v13, v10, v1

    const/4 v1, 0x2

    aput v4, v10, v1

    const/4 v1, 0x3

    aput v6, v10, v1

    const/4 v1, 0x4

    aput v7, v10, v1

    const/4 v1, 0x5

    aput v8, v10, v1

    const/4 v1, 0x6

    aput v9, v10, v1

    const/4 v1, 0x7

    aput v5, v10, v1

    move-object/from16 v27, v2

    move-object/from16 v32, v10

    move-object/from16 v33, v12

    invoke-virtual/range {v27 .. v33}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    iget-object v1, v0, LA2/a;->g:Landroid/graphics/Path;

    iget-object v2, v0, LA2/a;->m:Landroid/graphics/RectF;

    const/16 v10, 0x8

    new-array v14, v10, [F

    const/4 v10, 0x0

    aput v3, v14, v10

    const/4 v10, 0x1

    aput v3, v14, v10

    const/4 v10, 0x2

    aput v11, v14, v10

    const/4 v10, 0x3

    aput v11, v14, v10

    const/4 v10, 0x4

    aput v26, v14, v10

    const/4 v10, 0x5

    aput v26, v14, v10

    const/4 v10, 0x6

    aput v25, v14, v10

    const/4 v10, 0x7

    aput v25, v14, v10

    invoke-virtual {v1, v2, v14, v12}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v1, v0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    const/high16 v2, 0x40000000    # 2.0f

    const/16 v10, 0x8

    if-eqz v1, :cond_e

    invoke-virtual {v1, v10}, Lcom/facebook/react/uimanager/c0;->a(I)F

    move-result v1

    div-float/2addr v1, v2

    goto :goto_3

    :cond_e
    const/4 v1, 0x0

    :goto_3
    iget-object v14, v0, LA2/a;->h:Landroid/graphics/Path;

    iget-object v2, v0, LA2/a;->n:Landroid/graphics/RectF;

    add-float v28, v3, v1

    add-float v29, v11, v1

    add-float v30, v26, v1

    add-float v1, v25, v1

    move/from16 v31, v8

    new-array v8, v10, [F

    const/4 v10, 0x0

    aput v28, v8, v10

    const/4 v10, 0x1

    aput v28, v8, v10

    const/4 v10, 0x2

    aput v29, v8, v10

    const/4 v10, 0x3

    aput v29, v8, v10

    const/4 v10, 0x4

    aput v30, v8, v10

    const/4 v10, 0x5

    aput v30, v8, v10

    const/4 v10, 0x6

    aput v1, v8, v10

    const/4 v10, 0x7

    aput v1, v8, v10

    invoke-virtual {v14, v2, v8, v12}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v1, v0, LA2/a;->k:Landroid/graphics/Path;

    iget-object v2, v0, LA2/a;->o:Landroid/graphics/RectF;

    move-object/from16 v8, v24

    iget v10, v8, Landroid/graphics/RectF;->left:F

    const/high16 v14, 0x3f000000    # 0.5f

    mul-float v17, v10, v14

    sub-float v14, v3, v17

    const/16 v17, 0x0

    cmpl-float v23, v10, v17

    if-lez v23, :cond_f

    div-float v10, v3, v10

    goto :goto_4

    :cond_f
    move/from16 v10, v17

    :goto_4
    invoke-static {v14, v10}, Ljava/lang/Math;->max(FF)F

    move-result v10

    iget v14, v8, Landroid/graphics/RectF;->top:F

    const/high16 v23, 0x3f000000    # 0.5f

    mul-float v24, v14, v23

    move/from16 v28, v7

    sub-float v7, v3, v24

    cmpl-float v24, v14, v17

    if-lez v24, :cond_10

    div-float/2addr v3, v14

    goto :goto_5

    :cond_10
    move/from16 v3, v17

    :goto_5
    invoke-static {v7, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iget v7, v8, Landroid/graphics/RectF;->right:F

    mul-float v14, v7, v23

    sub-float v14, v11, v14

    cmpl-float v24, v7, v17

    if-lez v24, :cond_11

    div-float v7, v11, v7

    goto :goto_6

    :cond_11
    move/from16 v7, v17

    :goto_6
    invoke-static {v14, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iget v14, v8, Landroid/graphics/RectF;->top:F

    mul-float v24, v14, v23

    move/from16 v29, v6

    sub-float v6, v11, v24

    cmpl-float v24, v14, v17

    if-lez v24, :cond_12

    div-float/2addr v11, v14

    goto :goto_7

    :cond_12
    move/from16 v11, v17

    :goto_7
    invoke-static {v6, v11}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v11, v8, Landroid/graphics/RectF;->right:F

    mul-float v14, v11, v23

    sub-float v14, v26, v14

    cmpl-float v24, v11, v17

    if-lez v24, :cond_13

    div-float v11, v26, v11

    goto :goto_8

    :cond_13
    move/from16 v11, v17

    :goto_8
    invoke-static {v14, v11}, Ljava/lang/Math;->max(FF)F

    move-result v11

    iget v14, v8, Landroid/graphics/RectF;->bottom:F

    mul-float v24, v14, v23

    move/from16 v30, v4

    sub-float v4, v26, v24

    cmpl-float v24, v14, v17

    if-lez v24, :cond_14

    div-float v14, v26, v14

    goto :goto_9

    :cond_14
    move/from16 v14, v17

    :goto_9
    invoke-static {v4, v14}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iget v14, v8, Landroid/graphics/RectF;->left:F

    mul-float v24, v14, v23

    move/from16 v26, v9

    sub-float v9, v25, v24

    cmpl-float v24, v14, v17

    if-lez v24, :cond_15

    div-float v14, v25, v14

    goto :goto_a

    :cond_15
    move/from16 v14, v17

    :goto_a
    invoke-static {v9, v14}, Ljava/lang/Math;->max(FF)F

    move-result v9

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    mul-float v14, v8, v23

    sub-float v14, v25, v14

    cmpl-float v23, v8, v17

    if-lez v23, :cond_16

    div-float v8, v25, v8

    goto :goto_b

    :cond_16
    move/from16 v8, v17

    :goto_b
    invoke-static {v14, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    const/16 v14, 0x8

    new-array v14, v14, [F

    const/16 v17, 0x0

    aput v10, v14, v17

    const/4 v10, 0x1

    aput v3, v14, v10

    const/4 v3, 0x2

    aput v7, v14, v3

    const/4 v3, 0x3

    aput v6, v14, v3

    const/4 v3, 0x4

    aput v11, v14, v3

    const/4 v3, 0x5

    aput v4, v14, v3

    const/4 v3, 0x6

    aput v9, v14, v3

    const/4 v3, 0x7

    aput v8, v14, v3

    invoke-virtual {v1, v2, v14, v12}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v1, v0, LA2/a;->p:Landroid/graphics/PointF;

    if-nez v1, :cond_17

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, LA2/a;->p:Landroid/graphics/PointF;

    :cond_17
    iget-object v1, v0, LA2/a;->p:Landroid/graphics/PointF;

    move-object/from16 v48, v1

    iget-object v2, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iput v3, v1, Landroid/graphics/PointF;->x:F

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iput v2, v1, Landroid/graphics/PointF;->y:F

    float-to-double v6, v3

    move-wide/from16 v32, v6

    float-to-double v6, v2

    move-wide/from16 v34, v6

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v15, v1

    add-float/2addr v15, v3

    float-to-double v6, v15

    move-wide/from16 v36, v6

    mul-float/2addr v13, v1

    add-float/2addr v13, v2

    float-to-double v6, v13

    move-wide/from16 v38, v6

    iget-object v1, v0, LA2/a;->m:Landroid/graphics/RectF;

    iget v4, v1, Landroid/graphics/RectF;->left:F

    float-to-double v6, v4

    move-wide/from16 v40, v6

    iget v1, v1, Landroid/graphics/RectF;->top:F

    float-to-double v6, v1

    move-wide/from16 v42, v6

    float-to-double v3, v3

    move-wide/from16 v44, v3

    float-to-double v1, v2

    move-wide/from16 v46, v1

    invoke-static/range {v32 .. v48}, LA2/a;->j(DDDDDDDDLandroid/graphics/PointF;)V

    iget-object v1, v0, LA2/a;->s:Landroid/graphics/PointF;

    if-nez v1, :cond_18

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, LA2/a;->s:Landroid/graphics/PointF;

    :cond_18
    iget-object v1, v0, LA2/a;->s:Landroid/graphics/PointF;

    move-object/from16 v22, v1

    iget-object v2, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iput v3, v1, Landroid/graphics/PointF;->x:F

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    iput v2, v1, Landroid/graphics/PointF;->y:F

    float-to-double v6, v3

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v5, v1

    sub-float v4, v2, v5

    float-to-double v8, v4

    mul-float v4, v26, v1

    add-float/2addr v4, v3

    float-to-double v10, v4

    float-to-double v12, v2

    iget-object v1, v0, LA2/a;->m:Landroid/graphics/RectF;

    iget v4, v1, Landroid/graphics/RectF;->left:F

    float-to-double v14, v4

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v4, v1

    move-wide/from16 v16, v4

    float-to-double v3, v3

    move-wide/from16 v18, v3

    float-to-double v1, v2

    move-wide/from16 v20, v1

    invoke-static/range {v6 .. v22}, LA2/a;->j(DDDDDDDDLandroid/graphics/PointF;)V

    iget-object v1, v0, LA2/a;->q:Landroid/graphics/PointF;

    if-nez v1, :cond_19

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, LA2/a;->q:Landroid/graphics/PointF;

    :cond_19
    iget-object v1, v0, LA2/a;->q:Landroid/graphics/PointF;

    move-object/from16 v18, v1

    iget-object v2, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v14, v2, Landroid/graphics/RectF;->right:F

    iput v14, v1, Landroid/graphics/PointF;->x:F

    iget v15, v2, Landroid/graphics/RectF;->top:F

    iput v15, v1, Landroid/graphics/PointF;->y:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v4, v30, v1

    sub-float v2, v14, v4

    float-to-double v2, v2

    float-to-double v4, v15

    float-to-double v6, v14

    mul-float v8, v29, v1

    add-float/2addr v8, v15

    float-to-double v8, v8

    iget-object v1, v0, LA2/a;->m:Landroid/graphics/RectF;

    iget v10, v1, Landroid/graphics/RectF;->right:F

    float-to-double v10, v10

    iget v1, v1, Landroid/graphics/RectF;->top:F

    float-to-double v12, v1

    move v1, v15

    float-to-double v14, v14

    float-to-double v0, v1

    move-wide/from16 v16, v0

    invoke-static/range {v2 .. v18}, LA2/a;->j(DDDDDDDDLandroid/graphics/PointF;)V

    move-object/from16 v0, p0

    iget-object v1, v0, LA2/a;->r:Landroid/graphics/PointF;

    if-nez v1, :cond_1a

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, LA2/a;->r:Landroid/graphics/PointF;

    :cond_1a
    iget-object v1, v0, LA2/a;->r:Landroid/graphics/PointF;

    move-object/from16 v18, v1

    iget-object v2, v0, LA2/a;->l:Landroid/graphics/RectF;

    iget v14, v2, Landroid/graphics/RectF;->right:F

    iput v14, v1, Landroid/graphics/PointF;->x:F

    iget v15, v2, Landroid/graphics/RectF;->bottom:F

    iput v15, v1, Landroid/graphics/PointF;->y:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v7, v28, v1

    sub-float v2, v14, v7

    float-to-double v2, v2

    mul-float v8, v31, v1

    sub-float v1, v15, v8

    float-to-double v4, v1

    float-to-double v6, v14

    float-to-double v8, v15

    iget-object v1, v0, LA2/a;->m:Landroid/graphics/RectF;

    iget v10, v1, Landroid/graphics/RectF;->right:F

    float-to-double v10, v10

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v12, v1

    float-to-double v0, v14

    move-wide/from16 v19, v2

    move v2, v15

    move-wide v14, v0

    float-to-double v0, v2

    move-wide/from16 v16, v0

    move-wide/from16 v2, v19

    invoke-static/range {v2 .. v18}, LA2/a;->j(DDDDDDDDLandroid/graphics/PointF;)V

    return-void
.end method

.method private B()V
    .locals 2

    .line 1
    iget-object v0, p0, LA2/a;->d:LA2/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA2/a;->k()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v1}, LA2/a$b;->h(LA2/a$b;F)Landroid/graphics/PathEffect;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, LA2/a;->u:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private C(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->d:LA2/a$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, LA2/a$b;->h(LA2/a$b;F)Landroid/graphics/PathEffect;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-object v0, p0, LA2/a;->u:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static a(FF)I
    .locals 1

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    float-to-int p1, p1

    .line 5
    and-int/2addr p1, v0

    .line 6
    float-to-int p0, p0

    .line 7
    shl-int/lit8 p0, p0, 0x18

    .line 8
    .line 9
    const/high16 v0, -0x1000000

    .line 10
    .line 11
    and-int/2addr p0, v0

    .line 12
    or-int/2addr p0, p1

    .line 13
    return p0
.end method

.method private b(Landroid/graphics/Canvas;IFFFFFFFF)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, LA2/a;->u:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-virtual {p2, p5, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 36
    .line 37
    invoke-virtual {p2, p7, p8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 41
    .line 42
    invoke-virtual {p2, p9, p10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 46
    .line 47
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, LA2/a;->i:Landroid/graphics/Path;

    .line 51
    .line 52
    iget-object p3, p0, LA2/a;->u:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 25

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    .line 1
    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v0, v11, LA2/a;->v:I

    iget v1, v11, LA2/a;->w:I

    invoke-static {v0, v1}, LA2/a;->p(II)I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, LA2/a;->i()Landroid/graphics/RectF;

    move-result-object v0

    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v13

    iget v1, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v14

    iget v1, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v15

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v16

    if-gtz v13, :cond_1

    if-gtz v15, :cond_1

    if-gtz v14, :cond_1

    if-lez v16, :cond_19

    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    const/4 v10, 0x0

    invoke-virtual {v11, v10}, LA2/a;->f(I)I

    move-result v2

    const/4 v9, 0x1

    invoke-virtual {v11, v9}, LA2/a;->f(I)I

    move-result v3

    const/4 v8, 0x2

    invoke-virtual {v11, v8}, LA2/a;->f(I)I

    move-result v4

    const/4 v5, 0x3

    invoke-virtual {v11, v5}, LA2/a;->f(I)I

    move-result v5

    const/16 v6, 0x9

    invoke-virtual {v11, v6}, LA2/a;->f(I)I

    move-result v7

    const/16 v8, 0xb

    invoke-virtual {v11, v8}, LA2/a;->f(I)I

    move-result v18

    const/16 v10, 0xa

    invoke-virtual {v11, v10}, LA2/a;->f(I)I

    move-result v20

    invoke-direct {v11, v6}, LA2/a;->o(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move v3, v7

    move v5, v3

    :cond_2
    invoke-direct {v11, v10}, LA2/a;->o(I)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    move/from16 v20, v5

    :goto_0
    invoke-direct {v11, v8}, LA2/a;->o(I)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    move/from16 v18, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, LA2/a;->getLayoutDirection()I

    move-result v3

    if-ne v3, v9, :cond_5

    move v3, v9

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    const/4 v5, 0x4

    invoke-virtual {v11, v5}, LA2/a;->f(I)I

    move-result v6

    const/4 v7, 0x5

    invoke-virtual {v11, v7}, LA2/a;->f(I)I

    move-result v8

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v10

    iget-object v9, v11, LA2/a;->A:Landroid/content/Context;

    invoke-virtual {v10, v9}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-direct {v11, v5}, LA2/a;->o(I)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    move v2, v6

    :goto_3
    invoke-direct {v11, v7}, LA2/a;->o(I)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    move v4, v8

    :goto_4
    if-eqz v3, :cond_8

    move v5, v4

    goto :goto_5

    :cond_8
    move v5, v2

    :goto_5
    if-eqz v3, :cond_9

    goto :goto_6

    :cond_9
    move v2, v4

    :goto_6
    move/from16 v22, v2

    move v10, v5

    goto :goto_b

    :cond_a
    if-eqz v3, :cond_b

    move v9, v8

    goto :goto_7

    :cond_b
    move v9, v6

    :goto_7
    if-eqz v3, :cond_c

    goto :goto_8

    :cond_c
    move v6, v8

    :goto_8
    invoke-direct {v11, v5}, LA2/a;->o(I)Z

    move-result v5

    invoke-direct {v11, v7}, LA2/a;->o(I)Z

    move-result v7

    if-eqz v3, :cond_d

    move v8, v7

    goto :goto_9

    :cond_d
    move v8, v5

    :goto_9
    if-eqz v3, :cond_e

    goto :goto_a

    :cond_e
    move v5, v7

    :goto_a
    if-eqz v8, :cond_f

    move v2, v9

    :cond_f
    move v10, v2

    if-eqz v5, :cond_10

    move/from16 v22, v6

    goto :goto_b

    :cond_10
    move/from16 v22, v4

    :goto_b
    iget v9, v1, Landroid/graphics/Rect;->left:I

    iget v8, v1, Landroid/graphics/Rect;->top:I

    move v2, v13

    move v3, v14

    move v4, v15

    move/from16 v5, v16

    move v6, v10

    move/from16 v7, v18

    move/from16 v23, v10

    const/16 v17, 0x2

    move v10, v8

    move/from16 v8, v22

    move/from16 v21, v15

    move v15, v9

    move/from16 v9, v20

    invoke-static/range {v2 .. v9}, LA2/a;->e(IIIIIIII)I

    move-result v2

    if-eqz v2, :cond_14

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_19

    iget v3, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v11, LA2/a;->u:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    if-lez v13, :cond_11

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {v11, v2}, LA2/a;->C(I)V

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    int-to-float v5, v2

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    div-int/lit8 v2, v2, 0x2

    add-int v9, v15, v2

    int-to-float v2, v9

    int-to-float v5, v10

    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v5, v1

    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_11
    if-lez v14, :cond_12

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {v11, v2}, LA2/a;->C(I)V

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    int-to-float v5, v2

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v5, v15

    div-int/lit8 v2, v2, 0x2

    add-int v8, v10, v2

    int-to-float v2, v8

    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v5, v3

    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_12
    if-lez v21, :cond_13

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget v2, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {v11, v2}, LA2/a;->C(I)V

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    int-to-float v5, v2

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    div-int/lit8 v2, v2, 0x2

    sub-int v2, v3, v2

    int-to-float v2, v2

    int-to-float v5, v10

    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v4, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v5, v1

    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    iget-object v4, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_13
    if-lez v16, :cond_19

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v11, v0}, LA2/a;->C(I)V

    iget-object v2, v11, LA2/a;->u:Landroid/graphics/Paint;

    int-to-float v4, v0

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v4, v15

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v1, v0

    int-to-float v0, v1

    invoke-virtual {v2, v4, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v1, v11, LA2/a;->j:Landroid/graphics/Path;

    int-to-float v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, v11, LA2/a;->j:Landroid/graphics/Path;

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_d

    :cond_14
    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v17

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v19

    if-lez v13, :cond_15

    int-to-float v9, v15

    int-to-float v4, v10

    add-int v0, v15, v13

    int-to-float v7, v0

    add-int v8, v10, v14

    int-to-float v6, v8

    add-int v8, v10, v19

    sub-int v0, v8, v16

    int-to-float v5, v0

    int-to-float v8, v8

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v23

    move v3, v9

    move/from16 v23, v5

    move v5, v7

    move/from16 v24, v8

    move/from16 v8, v23

    move v12, v10

    move/from16 v10, v24

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    goto :goto_c

    :cond_15
    move v12, v10

    :goto_c
    if-lez v14, :cond_16

    int-to-float v3, v15

    int-to-float v10, v12

    add-int v9, v15, v13

    int-to-float v5, v9

    add-int v8, v12, v14

    int-to-float v8, v8

    add-int v9, v15, v17

    sub-int v0, v9, v21

    int-to-float v7, v0

    int-to-float v9, v9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v18

    move v4, v10

    move v6, v8

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_16
    if-lez v21, :cond_17

    add-int v9, v15, v17

    int-to-float v5, v9

    int-to-float v4, v12

    add-int v8, v12, v19

    int-to-float v6, v8

    sub-int v9, v9, v21

    int-to-float v9, v9

    sub-int v8, v8, v16

    int-to-float v8, v8

    add-int v0, v12, v14

    int-to-float v10, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v22

    move v3, v5

    move v7, v9

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_17
    if-lez v16, :cond_18

    int-to-float v3, v15

    add-int v8, v12, v19

    int-to-float v6, v8

    add-int v9, v15, v17

    int-to-float v5, v9

    sub-int v9, v9, v21

    int-to-float v7, v9

    sub-int v8, v8, v16

    int-to-float v10, v8

    add-int v9, v15, v13

    int-to-float v9, v9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v20

    move v4, v6

    move v8, v10

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_18
    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    :cond_19
    :goto_d
    return-void
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 26

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    .line 1
    invoke-direct/range {p0 .. p0}, LA2/a;->A()V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, v11, LA2/a;->g:Landroid/graphics/Path;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    iget v0, v11, LA2/a;->v:I

    invoke-virtual/range {p0 .. p0}, LA2/a;->getOpacity()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/core/graphics/a;->k(II)I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, v11, LA2/a;->f:Landroid/graphics/Path;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, LA2/a;->i()Landroid/graphics/RectF;

    move-result-object v13

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, LA2/a;->f(I)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, LA2/a;->f(I)I

    move-result v3

    const/4 v4, 0x2

    invoke-virtual {v11, v4}, LA2/a;->f(I)I

    move-result v4

    const/4 v5, 0x3

    invoke-virtual {v11, v5}, LA2/a;->f(I)I

    move-result v5

    const/16 v6, 0x9

    invoke-virtual {v11, v6}, LA2/a;->f(I)I

    move-result v7

    const/16 v8, 0xb

    invoke-virtual {v11, v8}, LA2/a;->f(I)I

    move-result v9

    const/16 v10, 0xa

    invoke-virtual {v11, v10}, LA2/a;->f(I)I

    move-result v14

    invoke-direct {v11, v6}, LA2/a;->o(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move v3, v7

    move v5, v3

    :cond_1
    invoke-direct {v11, v10}, LA2/a;->o(I)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    move v14, v5

    :goto_0
    invoke-direct {v11, v8}, LA2/a;->o(I)Z

    move-result v5

    if-eqz v5, :cond_3

    move v15, v9

    goto :goto_1

    :cond_3
    move v15, v3

    :goto_1
    iget v3, v13, Landroid/graphics/RectF;->top:F

    const/16 v16, 0x0

    cmpl-float v3, v3, v16

    if-gtz v3, :cond_4

    iget v3, v13, Landroid/graphics/RectF;->bottom:F

    cmpl-float v3, v3, v16

    if-gtz v3, :cond_4

    iget v3, v13, Landroid/graphics/RectF;->left:F

    cmpl-float v3, v3, v16

    if-gtz v3, :cond_4

    iget v3, v13, Landroid/graphics/RectF;->right:F

    cmpl-float v3, v3, v16

    if-lez v3, :cond_15

    :cond_4
    invoke-virtual/range {p0 .. p0}, LA2/a;->k()F

    move-result v3

    const/16 v5, 0x8

    invoke-virtual {v11, v5}, LA2/a;->f(I)I

    move-result v5

    iget v6, v13, Landroid/graphics/RectF;->top:F

    cmpl-float v6, v6, v3

    if-nez v6, :cond_5

    iget v6, v13, Landroid/graphics/RectF;->bottom:F

    cmpl-float v6, v6, v3

    if-nez v6, :cond_5

    iget v6, v13, Landroid/graphics/RectF;->left:F

    cmpl-float v6, v6, v3

    if-nez v6, :cond_5

    iget v6, v13, Landroid/graphics/RectF;->right:F

    cmpl-float v6, v6, v3

    if-nez v6, :cond_5

    if-ne v1, v5, :cond_5

    if-ne v15, v5, :cond_5

    if-ne v4, v5, :cond_5

    if-ne v14, v5, :cond_5

    cmpl-float v0, v3, v16

    if-lez v0, :cond_15

    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    iget v1, v11, LA2/a;->w:I

    invoke-static {v5, v1}, LA2/a;->p(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, v11, LA2/a;->k:Landroid/graphics/Path;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    iget-object v1, v11, LA2/a;->u:Landroid/graphics/Paint;

    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_c

    :cond_5
    iget-object v3, v11, LA2/a;->u:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v3, v11, LA2/a;->e:Landroid/graphics/Path;

    invoke-static {v3}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    sget-object v5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v12, v3, v5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    invoke-virtual/range {p0 .. p0}, LA2/a;->getLayoutDirection()I

    move-result v3

    if-ne v3, v2, :cond_6

    move v0, v2

    :cond_6
    const/4 v2, 0x4

    invoke-virtual {v11, v2}, LA2/a;->f(I)I

    move-result v3

    const/4 v5, 0x5

    invoke-virtual {v11, v5}, LA2/a;->f(I)I

    move-result v6

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v7

    iget-object v8, v11, LA2/a;->A:Landroid/content/Context;

    invoke-virtual {v7, v8}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-direct {v11, v2}, LA2/a;->o(I)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    move v1, v3

    :goto_2
    invoke-direct {v11, v5}, LA2/a;->o(I)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    move v4, v6

    :goto_3
    if-eqz v0, :cond_9

    move v2, v4

    goto :goto_4

    :cond_9
    move v2, v1

    :goto_4
    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    move v1, v4

    :goto_5
    move/from16 v17, v1

    goto :goto_a

    :cond_b
    if-eqz v0, :cond_c

    move v7, v6

    goto :goto_6

    :cond_c
    move v7, v3

    :goto_6
    if-eqz v0, :cond_d

    goto :goto_7

    :cond_d
    move v3, v6

    :goto_7
    invoke-direct {v11, v2}, LA2/a;->o(I)Z

    move-result v2

    invoke-direct {v11, v5}, LA2/a;->o(I)Z

    move-result v5

    if-eqz v0, :cond_e

    move v6, v5

    goto :goto_8

    :cond_e
    move v6, v2

    :goto_8
    if-eqz v0, :cond_f

    goto :goto_9

    :cond_f
    move v2, v5

    :goto_9
    if-eqz v6, :cond_10

    move v1, v7

    :cond_10
    if-eqz v2, :cond_11

    move v2, v1

    move/from16 v17, v3

    goto :goto_a

    :cond_11
    move v2, v1

    move/from16 v17, v4

    :goto_a
    iget-object v0, v11, LA2/a;->m:Landroid/graphics/RectF;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    iget v10, v0, Landroid/graphics/RectF;->left:F

    iget v9, v0, Landroid/graphics/RectF;->right:F

    iget v8, v0, Landroid/graphics/RectF;->top:F

    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v0, v11, LA2/a;->p:Landroid/graphics/PointF;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/graphics/PointF;

    iget-object v0, v11, LA2/a;->q:Landroid/graphics/PointF;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/PointF;

    iget-object v0, v11, LA2/a;->s:Landroid/graphics/PointF;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/graphics/PointF;

    iget-object v0, v11, LA2/a;->r:Landroid/graphics/PointF;

    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/PointF;

    iget v0, v13, Landroid/graphics/RectF;->left:F

    cmpl-float v0, v0, v16

    const v18, 0x3f4ccccd    # 0.8f

    if-lez v0, :cond_12

    sub-float v19, v8, v18

    iget v1, v6, Landroid/graphics/PointF;->x:F

    iget v0, v6, Landroid/graphics/PointF;->y:F

    sub-float v20, v0, v18

    iget v0, v4, Landroid/graphics/PointF;->x:F

    move/from16 v21, v0

    iget v0, v4, Landroid/graphics/PointF;->y:F

    add-float v22, v0, v18

    add-float v23, v7, v18

    move-object/from16 v0, p0

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object v11, v3

    move v3, v10

    move-object v12, v4

    move/from16 v4, v19

    move/from16 v19, v14

    move-object v14, v5

    move/from16 v5, v24

    move-object/from16 v24, v12

    move-object v12, v6

    move/from16 v6, v20

    move/from16 v20, v7

    move/from16 v7, v21

    move/from16 v21, v8

    move/from16 v8, v22

    move/from16 v22, v9

    move v9, v10

    move/from16 v25, v10

    move/from16 v10, v23

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    goto :goto_b

    :cond_12
    move-object v11, v3

    move-object/from16 v24, v4

    move-object v12, v6

    move/from16 v20, v7

    move/from16 v21, v8

    move/from16 v22, v9

    move/from16 v25, v10

    move/from16 v19, v14

    move-object v14, v5

    :goto_b
    iget v0, v13, Landroid/graphics/RectF;->top:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_13

    sub-float v3, v25, v18

    iget v0, v12, Landroid/graphics/PointF;->x:F

    sub-float v5, v0, v18

    iget v6, v12, Landroid/graphics/PointF;->y:F

    iget v0, v14, Landroid/graphics/PointF;->x:F

    add-float v7, v0, v18

    iget v8, v14, Landroid/graphics/PointF;->y:F

    add-float v9, v22, v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v4, v21

    move/from16 v10, v21

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_13
    iget v0, v13, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_14

    sub-float v4, v21, v18

    iget v5, v14, Landroid/graphics/PointF;->x:F

    iget v0, v14, Landroid/graphics/PointF;->y:F

    sub-float v6, v0, v18

    iget v7, v11, Landroid/graphics/PointF;->x:F

    iget v0, v11, Landroid/graphics/PointF;->y:F

    add-float v8, v0, v18

    add-float v10, v20, v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move/from16 v3, v22

    move/from16 v9, v22

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_14
    iget v0, v13, Landroid/graphics/RectF;->bottom:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_15

    sub-float v3, v25, v18

    move-object/from16 v0, v24

    iget v1, v0, Landroid/graphics/PointF;->x:F

    sub-float v5, v1, v18

    iget v6, v0, Landroid/graphics/PointF;->y:F

    iget v0, v11, Landroid/graphics/PointF;->x:F

    add-float v7, v0, v18

    iget v8, v11, Landroid/graphics/PointF;->y:F

    add-float v9, v22, v18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move/from16 v4, v20

    move/from16 v10, v20

    invoke-direct/range {v0 .. v10}, LA2/a;->b(Landroid/graphics/Canvas;IFFFFFFFF)V

    :cond_15
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private static e(IIIIIIII)I
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-lez p0, :cond_0

    .line 3
    .line 4
    move v1, p4

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    if-lez p1, :cond_1

    .line 8
    .line 9
    move v2, p5

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    move v2, v0

    .line 12
    :goto_1
    and-int/2addr v1, v2

    .line 13
    if-lez p2, :cond_2

    .line 14
    .line 15
    move v2, p6

    .line 16
    goto :goto_2

    .line 17
    :cond_2
    move v2, v0

    .line 18
    :goto_2
    and-int/2addr v1, v2

    .line 19
    if-lez p3, :cond_3

    .line 20
    .line 21
    move v0, p7

    .line 22
    :cond_3
    and-int/2addr v0, v1

    .line 23
    const/4 v1, 0x0

    .line 24
    if-lez p0, :cond_4

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_4
    move p4, v1

    .line 28
    :goto_3
    if-lez p1, :cond_5

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_5
    move p5, v1

    .line 32
    :goto_4
    or-int p0, p4, p5

    .line 33
    .line 34
    if-lez p2, :cond_6

    .line 35
    .line 36
    goto :goto_5

    .line 37
    :cond_6
    move p6, v1

    .line 38
    :goto_5
    or-int/2addr p0, p6

    .line 39
    if-lez p3, :cond_7

    .line 40
    .line 41
    goto :goto_6

    .line 42
    :cond_7
    move p7, v1

    .line 43
    :goto_6
    or-int/2addr p0, p7

    .line 44
    if-ne v0, p0, :cond_8

    .line 45
    .line 46
    goto :goto_7

    .line 47
    :cond_8
    move v0, v1

    .line 48
    :goto_7
    return v0
.end method

.method private static j(DDDDDDDDLandroid/graphics/PointF;)V
    .locals 21

    .line 1
    move-object/from16 v0, p16

    .line 2
    .line 3
    add-double v1, p0, p4

    .line 4
    .line 5
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 6
    .line 7
    div-double/2addr v1, v3

    .line 8
    add-double v5, p2, p6

    .line 9
    .line 10
    div-double/2addr v5, v3

    .line 11
    sub-double v7, p8, v1

    .line 12
    .line 13
    sub-double v9, p10, v5

    .line 14
    .line 15
    sub-double v11, p12, v1

    .line 16
    .line 17
    sub-double v13, p14, v5

    .line 18
    .line 19
    sub-double v15, p4, p0

    .line 20
    .line 21
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v15

    .line 25
    div-double/2addr v15, v3

    .line 26
    sub-double v17, p6, p2

    .line 27
    .line 28
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v17

    .line 32
    div-double v17, v17, v3

    .line 33
    .line 34
    sub-double/2addr v13, v9

    .line 35
    sub-double/2addr v11, v7

    .line 36
    div-double/2addr v13, v11

    .line 37
    mul-double/2addr v7, v13

    .line 38
    sub-double/2addr v9, v7

    .line 39
    mul-double v17, v17, v17

    .line 40
    .line 41
    mul-double v7, v15, v15

    .line 42
    .line 43
    mul-double v11, v7, v13

    .line 44
    .line 45
    mul-double/2addr v11, v13

    .line 46
    add-double v11, v17, v11

    .line 47
    .line 48
    mul-double v19, v15, v3

    .line 49
    .line 50
    mul-double v19, v19, v15

    .line 51
    .line 52
    mul-double v19, v19, v9

    .line 53
    .line 54
    mul-double v3, v19, v13

    .line 55
    .line 56
    mul-double v19, v9, v9

    .line 57
    .line 58
    sub-double v19, v19, v17

    .line 59
    .line 60
    mul-double v7, v7, v19

    .line 61
    .line 62
    neg-double v7, v7

    .line 63
    div-double/2addr v7, v11

    .line 64
    move-wide/from16 v17, v5

    .line 65
    .line 66
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 67
    .line 68
    mul-double/2addr v11, v5

    .line 69
    move-wide v15, v1

    .line 70
    div-double v0, v3, v11

    .line 71
    .line 72
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    add-double/2addr v7, v0

    .line 77
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    neg-double v2, v3

    .line 82
    div-double/2addr v2, v11

    .line 83
    sub-double/2addr v2, v0

    .line 84
    mul-double/2addr v13, v2

    .line 85
    add-double/2addr v13, v9

    .line 86
    add-double/2addr v2, v15

    .line 87
    add-double v13, v13, v17

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_0

    .line 94
    .line 95
    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_0

    .line 100
    .line 101
    double-to-float v0, v2

    .line 102
    move-object/from16 v1, p16

    .line 103
    .line 104
    iput v0, v1, Landroid/graphics/PointF;->x:F

    .line 105
    .line 106
    double-to-float v0, v13

    .line 107
    iput v0, v1, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    :cond_0
    return-void
.end method

.method private o(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/c0;->a(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    iget-object v2, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lcom/facebook/react/uimanager/c0;->a(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_1
    return p1
.end method

.method private static p(II)I
    .locals 2

    .line 1
    const/16 v0, 0xff

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const v0, 0xffffff

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    and-int/2addr p0, v0

    .line 12
    return p0

    .line 13
    :cond_1
    shr-int/lit8 v1, p1, 0x7

    .line 14
    .line 15
    add-int/2addr p1, v1

    .line 16
    ushr-int/lit8 v1, p0, 0x18

    .line 17
    .line 18
    mul-int/2addr v1, p1

    .line 19
    shr-int/lit8 p1, v1, 0x8

    .line 20
    .line 21
    shl-int/lit8 p1, p1, 0x18

    .line 22
    .line 23
    and-int/2addr p0, v0

    .line 24
    or-int/2addr p0, p1

    .line 25
    return p0
.end method

.method private q(IF)V
    .locals 2

    .line 1
    iget-object v0, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/c0;

    .line 6
    .line 7
    const/high16 v1, 0x437f0000    # 255.0f

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/c0;-><init>(F)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/c0;->c(IF)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method private s(IF)V
    .locals 2

    .line 1
    iget-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/c0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/c0;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/c0;->c(IF)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LA2/a;->B()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA2/a;->n()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, LA2/a;->c(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, LA2/a;->d(Landroid/graphics/Canvas;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
.end method

.method public f(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LA2/a;->b:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/c0;->a(I)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, LA2/a;->c:Lcom/facebook/react/uimanager/c0;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/c0;->a(I)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/high16 p1, 0x437f0000    # 255.0f

    .line 21
    .line 22
    :goto_1
    invoke-static {p1, v0}, LA2/a;->a(FF)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public g(FI)F
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    return p2
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, LA2/a;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public getLayoutDirection()I
    .locals 2

    .line 1
    iget v0, p0, LA2/a;->B:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :cond_0
    return v0
.end method

.method public getOpacity()I
    .locals 2

    .line 1
    iget v0, p0, LA2/a;->v:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LA2/a;->w:I

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    shr-int/lit8 v0, v0, 0x8

    .line 11
    .line 12
    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LA2/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LA2/a;->A()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LA2/a;->h:Landroid/graphics/Path;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/graphics/Path;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setRect(Landroid/graphics/Rect;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
.end method

.method public h()LC2/c;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->z:LC2/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Landroid/graphics/RectF;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, LA2/a;->g(FI)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, LA2/a;->g(FI)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-virtual {p0, v0, v3}, LA2/a;->g(FI)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {p0, v0, v4}, LA2/a;->g(FI)F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-virtual {p0, v0, v6}, LA2/a;->g(FI)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v6, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 29
    .line 30
    if-eqz v6, :cond_9

    .line 31
    .line 32
    invoke-virtual {p0}, LA2/a;->getLayoutDirection()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-ne v6, v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v4

    .line 40
    :goto_0
    iget-object v4, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    invoke-virtual {v4, v6}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v6, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 48
    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget-object v8, p0, LA2/a;->A:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v7, v8}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_5

    .line 65
    .line 66
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v5, v4

    .line 74
    :goto_1
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v0, v6

    .line 82
    :goto_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    move v4, v0

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move v4, v5

    .line 87
    :goto_3
    if-eqz v1, :cond_4

    .line 88
    .line 89
    move v0, v5

    .line 90
    :cond_4
    move v5, v4

    .line 91
    goto :goto_6

    .line 92
    :cond_5
    if-eqz v1, :cond_6

    .line 93
    .line 94
    move v7, v6

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move v7, v4

    .line 97
    :goto_4
    if-eqz v1, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move v4, v6

    .line 101
    :goto_5
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_8

    .line 106
    .line 107
    move v5, v7

    .line 108
    :cond_8
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_9

    .line 113
    .line 114
    move v0, v4

    .line 115
    :cond_9
    :goto_6
    new-instance v1, Landroid/graphics/RectF;

    .line 116
    .line 117
    invoke-direct {v1, v5, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 118
    .line 119
    .line 120
    return-object v1
.end method

.method public k()F
    .locals 2

    .line 1
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
.end method

.method public l()Landroid/graphics/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, LA2/a;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, LA2/a;->A()V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/graphics/Path;

    .line 11
    .line 12
    iget-object v1, p0, LA2/a;->e:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-static {v1}, Landroidx/core/util/f;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/graphics/Path;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public m()Landroid/graphics/RectF;
    .locals 6

    .line 1
    invoke-virtual {p0}, LA2/a;->i()Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    new-instance v1, Landroid/graphics/RectF;

    .line 33
    .line 34
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    iget v5, v0, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    sub-float/2addr v4, v5

    .line 50
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    int-to-float v5, v5

    .line 59
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 60
    .line 61
    sub-float/2addr v5, v0

    .line 62
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->y:LC2/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LC2/b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LA2/a;->t:Z

    .line 6
    .line 7
    return-void
.end method

.method public r(IFF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LA2/a;->s(IF)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p3}, LA2/a;->q(IF)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, LA2/a;->t:Z

    .line 9
    .line 10
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, LA2/a;->w:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, LA2/a;->w:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t(LC2/a;Lcom/facebook/react/uimanager/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->y:LC2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LC2/b;->a(LC2/a;)Lcom/facebook/react/uimanager/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LA2/a;->y:LC2/b;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, LC2/b;->d(LC2/a;Lcom/facebook/react/uimanager/x;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, LA2/a;->t:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, LA2/a$b;->valueOf(Ljava/lang/String;)LA2/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iget-object v0, p0, LA2/a;->d:LA2/a$b;

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    iput-object p1, p0, LA2/a;->d:LA2/a$b;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LA2/a;->t:Z

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public v(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/c0;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/facebook/react/uimanager/c0;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/c0;->b(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LA2/a;->a:Lcom/facebook/react/uimanager/c0;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/c0;->c(IF)Z

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    if-eq p1, p2, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    if-eq p1, v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-eq p1, v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    if-eq p1, v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    const/16 v0, 0x8

    .line 47
    .line 48
    if-eq p1, v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput-boolean p2, p0, LA2/a;->t:Z

    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public w(I)V
    .locals 0

    .line 1
    iput p1, p0, LA2/a;->v:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    iget v0, p0, LA2/a;->B:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, LA2/a;->B:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public y(F)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object p1, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    sget-object p1, LC2/a;->m:LC2/a;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v1}, LA2/a;->t(LC2/a;Lcom/facebook/react/uimanager/x;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    sget-object v0, LC2/a;->m:LC2/a;

    .line 23
    .line 24
    new-instance v1, Lcom/facebook/react/uimanager/x;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    sget-object v2, Lcom/facebook/react/uimanager/y;->m:Lcom/facebook/react/uimanager/y;

    .line 31
    .line 32
    invoke-direct {v1, p1, v2}, Lcom/facebook/react/uimanager/x;-><init>(FLcom/facebook/react/uimanager/y;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, LA2/a;->t(LC2/a;Lcom/facebook/react/uimanager/x;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    return-void
.end method

.method public z(FI)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object p1, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, LA2/a;->y:LC2/b;

    .line 17
    .line 18
    invoke-static {}, LC2/a;->values()[LC2/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    aget-object p2, v0, p2

    .line 23
    .line 24
    invoke-virtual {p1, p2, v1}, LC2/b;->d(LC2/a;Lcom/facebook/react/uimanager/x;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {}, LC2/a;->values()[LC2/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    aget-object p2, v0, p2

    .line 33
    .line 34
    new-instance v0, Lcom/facebook/react/uimanager/x;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    sget-object v1, Lcom/facebook/react/uimanager/y;->m:Lcom/facebook/react/uimanager/y;

    .line 41
    .line 42
    invoke-direct {v0, p1, v1}, Lcom/facebook/react/uimanager/x;-><init>(FLcom/facebook/react/uimanager/y;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p2, v0}, LA2/a;->t(LC2/a;Lcom/facebook/react/uimanager/x;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    return-void
.end method
