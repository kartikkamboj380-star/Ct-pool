.class Lcom/horcrux/svg/VirtualViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/VirtualViewManager$SVGClass;,
        Lcom/horcrux/svg/VirtualViewManager$d;,
        Lcom/horcrux/svg/VirtualViewManager$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Lcom/horcrux/svg/VirtualView;",
        ">",
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/horcrux/svg/VirtualView;",
        ">;"
    }
.end annotation


# static fields
.field private static final CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER:F = 5.0f

.field private static final EPSILON:D = 1.0E-5

.field private static final PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX:I = 0x2

.field private static final mTagToRenderableView:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/horcrux/svg/RenderableView;",
            ">;"
        }
    .end annotation
.end field

.field private static final mTagToRunnable:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sMatrixDecompositionContext:Lcom/horcrux/svg/VirtualViewManager$c;

.field private static final sTransformDecompositionArray:[D


# instance fields
.field protected final mClassName:Ljava/lang/String;

.field protected mDelegate:Lcom/facebook/react/uimanager/A0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation
.end field

.field protected final svgClass:Lcom/horcrux/svg/VirtualViewManager$SVGClass;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/horcrux/svg/VirtualViewManager$c;

    invoke-direct {v0}, Lcom/horcrux/svg/VirtualViewManager$c;-><init>()V

    sput-object v0, Lcom/horcrux/svg/VirtualViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/VirtualViewManager$c;

    const/16 v0, 0x10

    new-array v0, v0, [D

    sput-object v0, Lcom/horcrux/svg/VirtualViewManager;->sTransformDecompositionArray:[D

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRunnable:Landroid/util/SparseArray;

    return-void
.end method

.method protected constructor <init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/VirtualViewManager;->svgClass:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/VirtualViewManager;->mClassName:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic a(Lcom/horcrux/svg/VirtualViewManager;Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;->invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method private static decomposeMatrix()V
    .locals 23

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x1

    sget-object v5, Lcom/horcrux/svg/VirtualViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/VirtualViewManager$c;

    iget-object v6, v5, Lcom/horcrux/svg/VirtualViewManager$c;->g:[D

    iget-object v7, v5, Lcom/horcrux/svg/VirtualViewManager$c;->h:[D

    iget-object v8, v5, Lcom/horcrux/svg/VirtualViewManager$c;->i:[D

    iget-object v9, v5, Lcom/horcrux/svg/VirtualViewManager$c;->j:[D

    iget-object v5, v5, Lcom/horcrux/svg/VirtualViewManager$c;->k:[D

    sget-object v10, Lcom/horcrux/svg/VirtualViewManager;->sTransformDecompositionArray:[D

    const/16 v11, 0xf

    aget-wide v12, v10, v11

    invoke-static {v12, v13}, Lcom/horcrux/svg/VirtualViewManager;->isZero(D)Z

    move-result v10

    if-eqz v10, :cond_0

    return-void

    :cond_0
    new-array v10, v2, [I

    aput v3, v10, v4

    aput v3, v10, v1

    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [[D

    const/16 v12, 0x10

    new-array v12, v12, [D

    move v13, v1

    :goto_0
    if-ge v13, v3, :cond_3

    move v14, v1

    :goto_1
    if-ge v14, v3, :cond_2

    sget-object v15, Lcom/horcrux/svg/VirtualViewManager;->sTransformDecompositionArray:[D

    mul-int/lit8 v17, v13, 0x4

    add-int v17, v17, v14

    aget-wide v18, v15, v17

    aget-wide v20, v15, v11

    div-double v18, v18, v20

    aget-object v15, v10, v13

    aput-wide v18, v15, v14

    if-ne v14, v0, :cond_1

    const-wide/16 v18, 0x0

    :cond_1
    aput-wide v18, v12, v17

    add-int/2addr v14, v4

    goto :goto_1

    :cond_2
    add-int/2addr v13, v4

    goto :goto_0

    :cond_3
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    aput-wide v13, v12, v11

    invoke-static {v12}, Lcom/facebook/react/uimanager/z;->m([D)D

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/VirtualViewManager;->isZero(D)Z

    move-result v11

    if-eqz v11, :cond_4

    return-void

    :cond_4
    aget-object v11, v10, v1

    aget-wide v17, v11, v0

    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/VirtualViewManager;->isZero(D)Z

    move-result v11

    if-eqz v11, :cond_6

    aget-object v11, v10, v4

    aget-wide v17, v11, v0

    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/VirtualViewManager;->isZero(D)Z

    move-result v11

    if-eqz v11, :cond_6

    aget-object v11, v10, v2

    aget-wide v17, v11, v0

    invoke-static/range {v17 .. v18}, Lcom/horcrux/svg/VirtualViewManager;->isZero(D)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_2

    :cond_5
    const-wide/16 v15, 0x0

    aput-wide v15, v6, v2

    aput-wide v15, v6, v4

    aput-wide v15, v6, v1

    aput-wide v13, v6, v0

    goto :goto_3

    :cond_6
    :goto_2
    aget-object v11, v10, v1

    aget-wide v13, v11, v0

    aget-object v11, v10, v4

    aget-wide v17, v11, v0

    aget-object v11, v10, v2

    aget-wide v19, v11, v0

    aget-object v11, v10, v0

    aget-wide v21, v11, v0

    new-array v3, v3, [D

    aput-wide v13, v3, v1

    aput-wide v17, v3, v4

    aput-wide v19, v3, v2

    aput-wide v21, v3, v0

    invoke-static {v12}, Lcom/facebook/react/uimanager/z;->n([D)[D

    move-result-object v11

    invoke-static {v11}, Lcom/facebook/react/uimanager/z;->t([D)[D

    move-result-object v11

    invoke-static {v3, v11, v6}, Lcom/facebook/react/uimanager/z;->q([D[D[D)V

    :goto_3
    aget-object v3, v10, v0

    invoke-static {v3, v1, v9, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v3, v2, [I

    aput v0, v3, v4

    aput v0, v3, v1

    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[D

    move v6, v1

    :goto_4
    if-ge v6, v0, :cond_7

    aget-object v9, v3, v6

    aget-object v11, v10, v6

    aget-wide v12, v11, v1

    aput-wide v12, v9, v1

    aget-wide v12, v11, v4

    aput-wide v12, v9, v4

    aget-wide v12, v11, v2

    aput-wide v12, v9, v2

    add-int/2addr v6, v4

    goto :goto_4

    :cond_7
    aget-object v6, v3, v1

    invoke-static {v6}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v9

    aput-wide v9, v7, v1

    aget-object v6, v3, v1

    invoke-static {v6, v9, v10}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v6

    aput-object v6, v3, v1

    aget-object v9, v3, v4

    invoke-static {v6, v9}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v9

    aput-wide v9, v8, v1

    aget-object v17, v3, v4

    aget-object v18, v3, v1

    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    neg-double v9, v9

    move-wide/from16 v21, v9

    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v6

    aput-object v6, v3, v4

    aget-object v9, v3, v1

    invoke-static {v9, v6}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v9

    aput-wide v9, v8, v1

    aget-object v17, v3, v4

    aget-object v18, v3, v1

    neg-double v9, v9

    move-wide/from16 v21, v9

    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v6

    aput-object v6, v3, v4

    invoke-static {v6}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v9

    aput-wide v9, v7, v4

    aget-object v6, v3, v4

    invoke-static {v6, v9, v10}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v6

    aput-object v6, v3, v4

    aget-wide v9, v8, v1

    aget-wide v11, v7, v4

    div-double/2addr v9, v11

    aput-wide v9, v8, v1

    aget-object v6, v3, v1

    aget-object v9, v3, v2

    invoke-static {v6, v9}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v9

    aput-wide v9, v8, v4

    aget-object v17, v3, v2

    aget-object v18, v3, v1

    neg-double v9, v9

    move-wide/from16 v21, v9

    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v6

    aput-object v6, v3, v2

    aget-object v9, v3, v4

    invoke-static {v9, v6}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v9

    aput-wide v9, v8, v2

    aget-object v17, v3, v2

    aget-object v18, v3, v4

    neg-double v9, v9

    move-wide/from16 v21, v9

    invoke-static/range {v17 .. v22}, Lcom/facebook/react/uimanager/z;->u([D[DDD)[D

    move-result-object v6

    aput-object v6, v3, v2

    invoke-static {v6}, Lcom/facebook/react/uimanager/z;->x([D)D

    move-result-wide v9

    aput-wide v9, v7, v2

    aget-object v6, v3, v2

    invoke-static {v6, v9, v10}, Lcom/facebook/react/uimanager/z;->y([DD)[D

    move-result-object v6

    aput-object v6, v3, v2

    aget-wide v9, v8, v4

    aget-wide v11, v7, v2

    div-double/2addr v9, v11

    aput-wide v9, v8, v4

    aget-wide v9, v8, v2

    div-double/2addr v9, v11

    aput-wide v9, v8, v2

    aget-object v8, v3, v4

    invoke-static {v8, v6}, Lcom/facebook/react/uimanager/z;->v([D[D)[D

    move-result-object v6

    aget-object v8, v3, v1

    invoke-static {v8, v6}, Lcom/facebook/react/uimanager/z;->w([D[D)D

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmpg-double v6, v8, v10

    if-gez v6, :cond_8

    move v6, v1

    :goto_5
    if-ge v6, v0, :cond_8

    aget-wide v8, v7, v6

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    mul-double/2addr v8, v10

    aput-wide v8, v7, v6

    aget-object v8, v3, v6

    aget-wide v12, v8, v1

    mul-double/2addr v12, v10

    aput-wide v12, v8, v1

    aget-wide v12, v8, v4

    mul-double/2addr v12, v10

    aput-wide v12, v8, v4

    aget-wide v12, v8, v2

    mul-double/2addr v12, v10

    aput-wide v12, v8, v2

    add-int/2addr v6, v4

    goto :goto_5

    :cond_8
    aget-object v0, v3, v2

    aget-wide v6, v0, v4

    aget-wide v8, v0, v2

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    neg-double v6, v6

    const-wide v8, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v6

    aput-wide v6, v5, v1

    aget-object v0, v3, v2

    aget-wide v6, v0, v1

    neg-double v6, v6

    aget-wide v10, v0, v4

    mul-double/2addr v10, v10

    aget-wide v12, v0, v2

    mul-double/2addr v12, v12

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    neg-double v6, v6

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v6

    aput-wide v6, v5, v4

    aget-object v0, v3, v4

    aget-wide v6, v0, v1

    aget-object v0, v3, v1

    aget-wide v3, v0, v1

    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    neg-double v0, v0

    mul-double/2addr v0, v8

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/z;->s(D)D

    move-result-wide v0

    aput-wide v0, v5, v2

    return-void
.end method

.method static getRenderableViewByTag(I)Lcom/horcrux/svg/RenderableView;
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/horcrux/svg/RenderableView;

    return-object p0
.end method

.method private invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->invalidate()V

    :cond_0
    instance-of v0, p1, Lcom/horcrux/svg/h0;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/horcrux/svg/h0;

    invoke-virtual {p1}, Lcom/horcrux/svg/h0;->G()Lcom/horcrux/svg/h0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->clearChildCache()V

    :cond_1
    return-void
.end method

.method private static isZero(D)Z
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    const-wide v0, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static resetTransformProperty(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method static runWhenViewIsAvailable(ILjava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRunnable:Landroid/util/SparseArray;

    invoke-virtual {v0, p0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method static setRenderableView(ILcom/horcrux/svg/RenderableView;)V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    invoke-virtual {v0, p0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-object p1, Lcom/horcrux/svg/VirtualViewManager;->mTagToRunnable:Landroid/util/SparseArray;

    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->delete(I)V

    :cond_0
    return-void
.end method

.method private static setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 6

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager;->sTransformDecompositionArray:[D

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/h0;->d(Lcom/facebook/react/bridge/ReadableArray;[D)V

    invoke-static {}, Lcom/horcrux/svg/VirtualViewManager;->decomposeMatrix()V

    sget-object p1, Lcom/horcrux/svg/VirtualViewManager;->sMatrixDecompositionContext:Lcom/horcrux/svg/VirtualViewManager$c;

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->j:[D

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    double-to-float v0, v2

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->j:[D

    const/4 v2, 0x1

    aget-wide v3, v0, v2

    double-to-float v0, v3

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->k:[D

    const/4 v3, 0x2

    aget-wide v4, v0, v3

    double-to-float v0, v4

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotation(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->k:[D

    aget-wide v4, v0, v1

    double-to-float v0, v4

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationX(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->k:[D

    aget-wide v4, v0, v2

    double-to-float v0, v4

    invoke-virtual {p0, v0}, Landroid/view/View;->setRotationY(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->h:[D

    aget-wide v4, v0, v1

    double-to-float v0, v4

    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p1, Lcom/horcrux/svg/VirtualViewManager$c;->h:[D

    aget-wide v1, v0, v2

    double-to-float v0, v1

    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    iget-object p1, p1, Lcom/horcrux/svg/VirtualViewManager$c;->g:[D

    array-length v0, p1

    if-le v0, v3, :cond_1

    aget-wide v0, p1, v3

    double-to-float p1, v0

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const p1, 0x3a4ccccd

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    div-float/2addr v0, p1

    invoke-static {}, Lcom/facebook/react/uimanager/h;->c()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p1

    mul-float/2addr p1, v0

    const/high16 v0, 0x40a00000    # 5.0f

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    :cond_1
    return-void
.end method


# virtual methods
.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/ViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V

    new-instance p1, Lcom/horcrux/svg/VirtualViewManager$a;

    invoke-direct {p1, p0}, Lcom/horcrux/svg/VirtualViewManager$a;-><init>(Lcom/horcrux/svg/VirtualViewManager;)V

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    return-void
.end method

.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualViewManager;->createShadowNodeInstance()Lcom/facebook/react/uimanager/v;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/uimanager/v;
    .locals 1

    .line 1
    new-instance v0, Lcom/horcrux/svg/VirtualViewManager$d;

    invoke-direct {v0}, Lcom/horcrux/svg/VirtualViewManager$d;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/horcrux/svg/VirtualView;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/horcrux/svg/VirtualView;
    .locals 2

    .line 2
    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$b;->a:[I

    iget-object v1, p0, Lcom/horcrux/svg/VirtualViewManager;->svgClass:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/horcrux/svg/VirtualViewManager;->svgClass:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance v0, Lcom/horcrux/svg/r;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/r;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/horcrux/svg/y;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/y;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lcom/horcrux/svg/k;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/k;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/horcrux/svg/j;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/j;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/horcrux/svg/i;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/i;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/horcrux/svg/h;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/h;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lcom/horcrux/svg/p;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/p;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_7
    new-instance v0, Lcom/horcrux/svg/z;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/z;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_8
    new-instance v0, Lcom/horcrux/svg/D;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/D;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_9
    new-instance v0, Lcom/horcrux/svg/I;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/I;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_a
    new-instance v0, Lcom/horcrux/svg/x;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/x;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_b
    new-instance v0, Lcom/horcrux/svg/L;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/L;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_c
    new-instance v0, Lcom/horcrux/svg/i0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/i0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_d
    new-instance v0, Lcom/horcrux/svg/e;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_e
    new-instance v0, Lcom/horcrux/svg/c;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/c;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_f
    new-instance v0, Lcom/horcrux/svg/v;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/v;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_10
    new-instance v0, Lcom/horcrux/svg/V;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/V;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_11
    new-instance v0, Lcom/horcrux/svg/U;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/U;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_12
    new-instance v0, Lcom/horcrux/svg/h0;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/h0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_13
    new-instance v0, Lcom/horcrux/svg/J;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/J;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_14
    new-instance v0, Lcom/horcrux/svg/w;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/w;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_15
    new-instance v0, Lcom/horcrux/svg/g;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/g;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_16
    new-instance v0, Lcom/horcrux/svg/b;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/b;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_17
    new-instance v0, Lcom/horcrux/svg/C;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/C;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_18
    new-instance v0, Lcom/horcrux/svg/u;

    invoke-direct {v0, p1}, Lcom/horcrux/svg/u;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/VirtualViewManager;->mDelegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/horcrux/svg/VirtualViewManager;->mClassName:Ljava/lang/String;

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/uimanager/v;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/horcrux/svg/VirtualViewManager$d;

    return-object v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;->onAfterUpdateTransaction(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/horcrux/svg/VirtualView;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;->invalidateSvgView(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;->onDropViewInstance(Lcom/horcrux/svg/VirtualView;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/horcrux/svg/VirtualView;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager;->mTagToRenderableView:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public setClipPath(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "clipPath"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setClipPath(Ljava/lang/String;)V

    return-void
.end method

.method public setClipRule(Lcom/horcrux/svg/VirtualView;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;I)V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "clipRule"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setClipRule(I)V

    return-void
.end method

.method public setDisplay(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "display"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setDisplay(Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerEnd(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "markerEnd"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerEnd(Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerMid(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "markerMid"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerMid(Ljava/lang/String;)V

    return-void
.end method

.method public setMarkerStart(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "markerStart"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMarkerStart(Ljava/lang/String;)V

    return-void
.end method

.method public setMask(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "mask"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMask(Ljava/lang/String;)V

    return-void
.end method

.method public setMatrix(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "matrix"
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMatrix(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setMatrix(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setMatrix(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setName(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "name"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setName(Ljava/lang/String;)V

    return-void
.end method

.method public setOpacity(Lcom/horcrux/svg/VirtualView;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;F)V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        defaultFloat = 1.0f
        name = "opacity"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setOpacity(F)V

    return-void
.end method

.method public setPointerEvents(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "pointerEvents"
    .end annotation

    if-nez p2, :cond_0

    sget-object p2, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setPointerEvents(Lcom/facebook/react/uimanager/H;)V

    goto :goto_1

    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "-"

    const-string v1, "_"

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/uimanager/H;->valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/H;

    move-result-object p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setResponsible(Lcom/horcrux/svg/VirtualView;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;Z)V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "responsible"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/VirtualView;->setResponsible(Z)V

    return-void
.end method

.method public bridge synthetic setTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setTransform(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setTransform(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "transform"
    .end annotation

    .line 2
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Array:Lcom/facebook/react/bridge/ReadableType;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asArray()Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setTransform(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setTransform(Lcom/horcrux/svg/VirtualView;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 3
    if-nez p2, :cond_0

    invoke-static {p1}, Lcom/horcrux/svg/VirtualViewManager;->resetTransformProperty(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    iput-object p2, p1, Lcom/horcrux/svg/VirtualView;->mTransform:Landroid/graphics/Matrix;

    iget-object v0, p1, Lcom/horcrux/svg/VirtualView;->mInvTransform:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result p2

    iput-boolean p2, p1, Lcom/horcrux/svg/VirtualView;->mTransformInvertible:Z

    return-void
.end method
