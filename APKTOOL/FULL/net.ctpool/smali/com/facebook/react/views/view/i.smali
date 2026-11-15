.class public Lcom/facebook/react/views/view/i;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lw2/d;
.implements Lcom/facebook/react/uimanager/K;
.implements Lcom/facebook/react/uimanager/Q;
.implements Lw2/c;
.implements Lcom/facebook/react/uimanager/Y;
.implements Lcom/facebook/react/uimanager/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/i$a;
    }
.end annotation


# static fields
.field private static final ARRAY_CAPACITY_INCREMENT:I = 0xc

.field private static final DEFAULT_BACKGROUND_COLOR:I

.field private static final sDefaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

.field private static final sHelperRect:Landroid/graphics/Rect;


# instance fields
.field private mAllChildren:[Landroid/view/View;

.field private mAllChildrenCount:I

.field private mBackfaceOpacity:F

.field private mBackfaceVisibility:Ljava/lang/String;

.field private mCSSBackgroundDrawable:LA2/a;

.field private mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

.field private mClippingRect:Landroid/graphics/Rect;

.field private mDrawingOrderHelper:Lcom/facebook/react/uimanager/z0;

.field private mHitSlopRect:Landroid/graphics/Rect;

.field private mNeedsOffscreenAlphaCompositing:Z

.field private mOnInterceptTouchEventListener:Lw2/b;

.field private mOverflow:Ljava/lang/String;

.field private final mOverflowInset:Landroid/graphics/Rect;

.field private mPath:Landroid/graphics/Path;

.field private mPointerEvents:Lcom/facebook/react/uimanager/H;

.field private mRemoveClippedSubviews:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/facebook/react/views/view/i;->sDefaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lcom/facebook/react/views/view/i;->sHelperRect:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mOverflowInset:Landroid/graphics/Rect;

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->l()V

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/react/views/view/i;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->p(Landroid/view/View;)V

    return-void
.end method

.method private e(Landroid/view/View;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/view/View;

    iget v1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    array-length v2, v0

    const/4 v3, 0x0

    if-ne p2, v1, :cond_1

    if-ne v2, v1, :cond_0

    add-int/lit8 p2, v2, 0xc

    new-array p2, p2, [Landroid/view/View;

    iput-object p2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0, v3, p2, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    :cond_0
    iget p2, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    aput-object p1, v0, p2

    goto :goto_1

    :cond_1
    if-ge p2, v1, :cond_3

    if-ne v2, v1, :cond_2

    add-int/lit8 v2, v2, 0xc

    new-array v2, v2, [Landroid/view/View;

    iput-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0, v3, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    add-int/lit8 v3, p2, 0x1

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    goto :goto_0

    :cond_2
    add-int/lit8 v2, p2, 0x1

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    aput-object p1, v0, p2

    iget p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    :goto_1
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " count="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private f()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ly2/a;->a(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private g(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v5, v0, Lcom/facebook/react/views/view/i;->mOverflow:Ljava/lang/String;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v7, "visible"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_1
    const-string v7, "scroll"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_2
    const-string v7, "hidden"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    iget-object v1, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    iget-object v7, v0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    invoke-virtual {v7}, LA2/a;->i()Landroid/graphics/RectF;

    move-result-object v7

    iget v9, v7, Landroid/graphics/RectF;->top:F

    cmpl-float v10, v9, v8

    if-gtz v10, :cond_4

    iget v10, v7, Landroid/graphics/RectF;->left:F

    cmpl-float v10, v10, v8

    if-gtz v10, :cond_4

    iget v10, v7, Landroid/graphics/RectF;->bottom:F

    cmpl-float v10, v10, v8

    if-gtz v10, :cond_4

    iget v10, v7, Landroid/graphics/RectF;->right:F

    cmpl-float v10, v10, v8

    if-lez v10, :cond_3

    goto :goto_1

    :cond_3
    move v9, v8

    move v10, v9

    goto :goto_2

    :cond_4
    :goto_1
    iget v10, v7, Landroid/graphics/RectF;->left:F

    add-float/2addr v10, v8

    add-float/2addr v9, v8

    iget v11, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v5, v11

    iget v11, v7, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v6, v11

    :goto_2
    iget-object v11, v0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    invoke-virtual {v11}, LA2/a;->h()LC2/c;

    move-result-object v11

    invoke-virtual {v11}, LC2/c;->e()Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v12, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    if-nez v12, :cond_5

    new-instance v12, Landroid/graphics/Path;

    invoke-direct {v12}, Landroid/graphics/Path;-><init>()V

    iput-object v12, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    :cond_5
    iget-object v12, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    invoke-virtual {v12}, Landroid/graphics/Path;->rewind()V

    iget-object v12, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    new-instance v13, Landroid/graphics/RectF;

    invoke-direct {v13, v10, v9, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v11}, LC2/c;->c()F

    move-result v14

    iget v15, v7, Landroid/graphics/RectF;->left:F

    sub-float/2addr v14, v15

    invoke-static {v14, v8}, Ljava/lang/Math;->max(FF)F

    move-result v14

    invoke-virtual {v11}, LC2/c;->c()F

    move-result v15

    iget v2, v7, Landroid/graphics/RectF;->top:F

    sub-float/2addr v15, v2

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-virtual {v11}, LC2/c;->d()F

    move-result v15

    iget v3, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v15, v3

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v11}, LC2/c;->d()F

    move-result v15

    iget v4, v7, Landroid/graphics/RectF;->top:F

    sub-float/2addr v15, v4

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-virtual {v11}, LC2/c;->b()F

    move-result v15

    move/from16 v16, v5

    iget v5, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v15, v5

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-virtual {v11}, LC2/c;->b()F

    move-result v15

    move/from16 v17, v6

    iget v6, v7, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v15, v6

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-virtual {v11}, LC2/c;->a()F

    move-result v15

    move/from16 v18, v9

    iget v9, v7, Landroid/graphics/RectF;->left:F

    sub-float/2addr v15, v9

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-virtual {v11}, LC2/c;->a()F

    move-result v11

    iget v7, v7, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v11, v7

    invoke-static {v11, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    const/16 v8, 0x8

    new-array v8, v8, [F

    const/4 v11, 0x0

    aput v14, v8, v11

    const/4 v11, 0x1

    aput v2, v8, v11

    const/4 v2, 0x2

    aput v3, v8, v2

    const/4 v2, 0x3

    aput v4, v8, v2

    const/4 v2, 0x4

    aput v5, v8, v2

    const/4 v2, 0x5

    aput v6, v8, v2

    const/4 v2, 0x6

    aput v9, v8, v2

    const/4 v2, 0x7

    aput v7, v8, v2

    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v12, v13, v8, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    iget-object v2, v0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    move v8, v10

    move v3, v11

    move/from16 v5, v16

    move/from16 v6, v17

    :goto_3
    move/from16 v2, v18

    goto :goto_4

    :cond_6
    move/from16 v16, v5

    move/from16 v17, v6

    move/from16 v18, v9

    const/4 v11, 0x0

    move v8, v10

    move v3, v11

    goto :goto_3

    :cond_7
    const/4 v11, 0x0

    move v2, v8

    move v3, v11

    :goto_4
    if-nez v3, :cond_8

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v8, v2, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    :cond_8
    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x48916256 -> :sswitch_2
        -0x361a1933 -> :sswitch_1
        0x1bd1f072 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mDrawingOrderHelper:Lcom/facebook/react/uimanager/z0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/z0;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/z0;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/react/views/view/i;->mDrawingOrderHelper:Lcom/facebook/react/uimanager/z0;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mDrawingOrderHelper:Lcom/facebook/react/uimanager/z0;

    return-object v0
.end method

.method private h(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/z0;->b(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/z0;->d()Z

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method private i(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/z0;->c(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/z0;->d()Z

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method private j(II)V
    .locals 1

    .line 1
    add-int/2addr p2, p1

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/i;->i(Landroid/view/View;)V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private k(Landroid/view/View;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/view/View;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    if-ne v3, p1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private l()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    iput-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    iput v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mHitSlopRect:Landroid/graphics/Rect;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mOverflow:Ljava/lang/String;

    sget-object v2, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    iput-object v2, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mOnInterceptTouchEventListener:Lw2/b;

    iput-boolean v0, p0, Lcom/facebook/react/views/view/i;->mNeedsOffscreenAlphaCompositing:Z

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mDrawingOrderHelper:Lcom/facebook/react/uimanager/z0;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mPath:Landroid/graphics/Path;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/facebook/react/views/view/i;->mBackfaceOpacity:F

    const-string v0, "visible"

    iput-object v0, p0, Lcom/facebook/react/views/view/i;->mBackfaceVisibility:Ljava/lang/String;

    return-void
.end method

.method private m(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/view/View;

    iget v1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x0

    if-ne p1, v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    aput-object v3, v0, v1

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    if-ge p1, v1, :cond_1

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    aput-object v3, v0, p1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method private n(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge v0, v2, :cond_1

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/view/i;->o(Landroid/graphics/Rect;II)V

    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private o(Landroid/graphics/Rect;II)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/view/View;

    aget-object v0, v0, p2

    sget-object v1, Lcom/facebook/react/views/view/i;->sHelperRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->top:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_1

    if-nez v1, :cond_1

    sub-int/2addr p2, p3

    invoke-virtual {p0, p2, v2}, Lcom/facebook/react/views/view/i;->removeViewsInLayout(II)V

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_2

    sub-int/2addr p2, p3

    sget-object p1, Lcom/facebook/react/views/view/i;->sDefaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, p2, p1, v2}, Lcom/facebook/react/views/view/i;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    :goto_1
    instance-of p1, v0, Lcom/facebook/react/uimanager/K;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/facebook/react/uimanager/K;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/K;->getRemoveClippedSubviews()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v0}, Lcom/facebook/react/uimanager/K;->updateClippingRect()V

    :cond_3
    return-void
.end method

.method private p(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/facebook/react/views/view/i;->sHelperRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eq v0, v1, :cond_4

    move v0, v2

    :goto_1
    iget v1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge v2, v1, :cond_4

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v1, v1, v2

    if-ne v1, p1, :cond_2

    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1, v2, v0}, Lcom/facebook/react/views/view/i;->o(Landroid/graphics/Rect;II)V

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->h(Landroid/view/View;)V

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->h(Landroid/view/View;)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    move-result p1

    return p1
.end method

.method addViewWithSubviewClippingEnabled(Landroid/view/View;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/view/i;->sDefaultLayoutParam:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/views/view/i;->addViewWithSubviewClippingEnabled(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method addViewWithSubviewClippingEnabled(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 2
    iget-boolean p3, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    invoke-static {p3}, LO1/a;->a(Z)V

    iget-object p3, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/i;->e(Landroid/view/View;I)V

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    if-ge p3, p2, :cond_1

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v1, v1, p3

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-direct {p0, p3, p2, v0}, Lcom/facebook/react/views/view/i;->o(Landroid/graphics/Rect;II)V

    iget-object p2, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->g(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/a0;->a(Landroid/view/View;)Lcom/facebook/react/uimanager/Z;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/Z;->b(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/react/bridge/ReactContext;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    new-instance v1, Lcom/facebook/react/uimanager/s;

    const-string v2, "StackOverflowException"

    invoke-direct {v1, v2, p0, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;Landroid/view/View;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :cond_1
    throw p1
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->j(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    :try_start_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ReactNative"

    const-string v1, "NullPointerException when executing dispatchProvideStructure"

    invoke-static {v0, v1, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method protected dispatchSetPressed(Z)V
    .locals 0

    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 3

    invoke-virtual {p2}, Landroid/view/View;->getElevation()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1, v2}, Lcom/facebook/react/views/view/c;->a(Landroid/graphics/Canvas;Z)V

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p2

    if-eqz v0, :cond_2

    invoke-static {p1, v1}, Lcom/facebook/react/views/view/c;->a(Landroid/graphics/Canvas;Z)V

    :cond_2
    return p2
.end method

.method getAllChildrenCount()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method getChildAtWithSubviewClippingEnabled(I)Landroid/view/View;
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/view/View;

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected getChildDrawingOrder(II)I
    .locals 1

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/z0;->a(II)I

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p1

    return p1
.end method

.method public getClippingRect(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public getHitSlopRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mHitSlopRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method getOrCreateReactViewBackground()LA2/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LA2/a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, LA2/a;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v2, v3, v4

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    aput-object v0, v3, v2

    .line 44
    .line 45
    invoke-direct {v1, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-static {}, Le2/a;->d()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 58
    .line 59
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {v0, v1}, LA2/a;->x(I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    .line 75
    .line 76
    return-object v0
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mOverflow:Ljava/lang/String;

    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mOverflowInset:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/H;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    return v0
.end method

.method public getZIndexMappedChildIndex(I)I
    .locals 2

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/z0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/uimanager/z0;->a(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mNeedsOffscreenAlphaCompositing:Z

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mOnInterceptTouchEventListener:Lw2/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lw2/b;->a(Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->j(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/A;->a(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-boolean p1, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    invoke-static {p1}, Lcom/facebook/react/uimanager/H;->h(Lcom/facebook/react/uimanager/H;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method recycleView()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->l()V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mOverflowInset:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    sget-object v0, Lcom/facebook/react/views/view/i;->sHelperRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->resetPointerEvents()V

    return-void
.end method

.method removeAllViewsWithSubviewClippingEnabled()V
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    invoke-static {v0}, LO1/a;->a(Z)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    iput v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->i(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/i;->i(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method

.method public removeViewInLayout(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->i(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method removeViewWithSubviewClippingEnabled(Landroid/view/View;)V
    .locals 3

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    invoke-static {v0}, LO1/a;->a(Z)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->k(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sub-int v0, p1, v1

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/view/i;->removeViewsInLayout(II)V

    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->m(I)V

    return-void
.end method

.method public removeViews(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/i;->j(II)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeViews(II)V

    return-void
.end method

.method public removeViewsInLayout(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/i;->j(II)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeViewsInLayout(II)V

    return-void
.end method

.method public requestLayout()V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    return-void
.end method

.method resetPointerEvents()V
    .locals 1

    sget-object v0, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    iput-object v0, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    return-void
.end method

.method public setBackfaceVisibility(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mBackfaceVisibility:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->setBackfaceVisibilityDependantOpacity()V

    return-void
.end method

.method public setBackfaceVisibilityDependantOpacity()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mBackfaceVisibility:Ljava/lang/String;

    const-string v1, "visible"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    iget v0, p0, Lcom/facebook/react/views/view/i;->mBackfaceOpacity:F

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRotationX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getRotationY()F

    move-result v1

    const/high16 v2, -0x3d4c0000    # -90.0f

    cmpl-float v3, v0, v2

    if-ltz v3, :cond_1

    const/high16 v3, 0x42b40000    # 90.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    cmpl-float v0, v1, v2

    if-ltz v0, :cond_1

    cmpg-float v0, v1, v3

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This method is not supported for ReactViewGroup instances"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setBackgroundColor(I)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->w(I)V

    :goto_0
    return-void
.end method

.method public setBorderColor(IFF)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LA2/a;->r(IFF)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->y(F)V

    return-void
.end method

.method public setBorderRadius(FI)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LA2/a;->z(FI)V

    return-void
.end method

.method public setBorderRadius(LC2/a;Lcom/facebook/react/uimanager/x;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LA2/a;->t(LC2/a;Lcom/facebook/react/uimanager/x;)V

    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->u(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderWidth(IF)V
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->getOrCreateReactViewBackground()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LA2/a;->v(IF)V

    return-void
.end method

.method public setHitSlopRect(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mHitSlopRect:Landroid/graphics/Rect;

    return-void
.end method

.method public setNeedsOffscreenAlphaCompositing(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/view/i;->mNeedsOffscreenAlphaCompositing:Z

    return-void
.end method

.method public setOnInterceptTouchEventListener(Lw2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mOnInterceptTouchEventListener:Lw2/b;

    .line 2
    .line 3
    return-void
.end method

.method public setOpacityIfPossible(F)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/view/i;->mBackfaceOpacity:F

    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->setBackfaceVisibilityDependantOpacity()V

    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mOverflow:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mOverflowInset:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method setPointerEvents(Lcom/facebook/react/uimanager/H;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mPointerEvents:Lcom/facebook/react/uimanager/H;

    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/L;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    const/16 v2, 0xc

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [Landroid/view/View;

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    new-instance p1, Lcom/facebook/react/views/view/i$a;

    invoke-direct {p1, p0, v1}, Lcom/facebook/react/views/view/i$a;-><init>(Lcom/facebook/react/views/view/i;Lcom/facebook/react/views/view/h;)V

    iput-object p1, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    :goto_0
    iget p1, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge v0, p1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aput-object p1, v1, v0

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-virtual {p1, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/view/i;->updateClippingRect()V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-static {p1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move p1, v0

    :goto_1
    iget v2, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    if-ge p1, v2, :cond_3

    iget-object v2, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    aget-object v2, v2, p1

    iget-object v3, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    invoke-virtual {v2, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/i;->n(Landroid/graphics/Rect;)V

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    iput v0, p0, Lcom/facebook/react/views/view/i;->mAllChildrenCount:I

    iput-object v1, p0, Lcom/facebook/react/views/view/i;->mChildrenLayoutChangeListener:Lcom/facebook/react/views/view/i$a;

    :goto_2
    return-void
.end method

.method public setTranslucentBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    iget-object v1, p0, Lcom/facebook/react/views/view/i;->mCSSBackgroundDrawable:LA2/a;

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p1, v2, v1

    invoke-direct {v0, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/view/i;->updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method updateBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public updateClippingRect()V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/view/i;->mRemoveClippedSubviews:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mAllChildren:[Landroid/view/View;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/L;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/facebook/react/views/view/i;->mClippingRect:Landroid/graphics/Rect;

    invoke-direct {p0, v0}, Lcom/facebook/react/views/view/i;->n(Landroid/graphics/Rect;)V

    return-void
.end method

.method public updateDrawingOrder()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/z0;->e()V

    invoke-direct {p0}, Lcom/facebook/react/views/view/i;->getDrawingOrderHelper()Lcom/facebook/react/uimanager/z0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/z0;->d()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
