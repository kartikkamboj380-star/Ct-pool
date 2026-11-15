.class public abstract Lcom/facebook/react/uimanager/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/f0$b;,
        Lcom/facebook/react/uimanager/f0$a;
    }
.end annotation


# static fields
.field private static final a:[F

.field private static final b:Landroid/graphics/PointF;

.field private static final c:[F

.field private static final d:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [F

    sput-object v1, Lcom/facebook/react/uimanager/f0;->a:[F

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    sput-object v1, Lcom/facebook/react/uimanager/f0;->b:Landroid/graphics/PointF;

    new-array v0, v0, [F

    sput-object v0, Lcom/facebook/react/uimanager/f0;->c:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/f0;->d:Landroid/graphics/Matrix;

    return-void
.end method

.method private static a(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static b(FFLandroid/view/ViewGroup;[F)Ljava/util/List;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    const/4 v0, 0x0

    aput p0, p3, v0

    const/4 p0, 0x1

    aput p1, p3, p0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p3, p2, p1}, Lcom/facebook/react/uimanager/f0;->f([FLandroid/view/View;Ljava/util/List;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_2

    move v1, v0

    :goto_0
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v2

    if-gtz v2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    :cond_1
    aget v1, p3, v0

    aget p0, p3, p0

    invoke-static {p2, v1, p0}, Lcom/facebook/react/uimanager/f0;->h(Landroid/view/View;FF)I

    move-result p0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    if-eq p0, p2, :cond_2

    new-instance p2, Lcom/facebook/react/uimanager/f0$b;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3, p3}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_2
    return-object p1
.end method

.method public static c(FFLandroid/view/ViewGroup;[F[I)I
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x0

    aput p0, p3, v1

    const/4 p0, 0x1

    aput p1, p3, p0

    const/4 p1, 0x0

    invoke-static {p3, p2, p1}, Lcom/facebook/react/uimanager/f0;->f([FLandroid/view/View;Ljava/util/List;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/facebook/react/uimanager/f0;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p4, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    aput p2, p4, v1

    :cond_0
    aget p2, p3, v1

    aget p0, p3, p0

    invoke-static {p1, p2, p0}, Lcom/facebook/react/uimanager/f0;->h(Landroid/view/View;FF)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static d(FFLandroid/view/ViewGroup;)I
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/f0;->a:[F

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/f0;->c(FFLandroid/view/ViewGroup;[F[I)I

    move-result p0

    return p0
.end method

.method private static e([FLandroid/view/View;Ljava/util/EnumSet;Ljava/util/List;)Landroid/view/View;
    .locals 11

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->n:Lcom/facebook/react/uimanager/f0$a;

    invoke-virtual {p2, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    aget v4, p0, v2

    aget v5, p0, v3

    invoke-static {v4, v5, p1}, Lcom/facebook/react/uimanager/f0;->i(FFLandroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_3

    instance-of v4, p1, Lcom/facebook/react/uimanager/P;

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ly2/a;->a(I)I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    aget v4, p0, v2

    aget v5, p0, v3

    invoke-static {v4, v5, p1}, Lcom/facebook/react/uimanager/f0;->j(FFLandroid/view/View;)Z

    move-result v4

    if-nez v4, :cond_0

    return-object v1

    :cond_0
    move-object v4, p1

    check-cast v4, Lcom/facebook/react/uimanager/P;

    invoke-interface {v4}, Lcom/facebook/react/uimanager/O;->getOverflow()Ljava/lang/String;

    move-result-object v4

    const-string v5, "hidden"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "scroll"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    return-object v1

    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getClipChildren()Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    instance-of v5, v0, Lcom/facebook/react/uimanager/Y;

    if-eqz v5, :cond_4

    move-object v5, v0

    check-cast v5, Lcom/facebook/react/uimanager/Y;

    goto :goto_0

    :cond_4
    move-object v5, v1

    :goto_0
    sub-int/2addr v4, v3

    :goto_1
    if-ltz v4, :cond_7

    if-eqz v5, :cond_5

    invoke-interface {v5, v4}, Lcom/facebook/react/uimanager/Y;->getZIndexMappedChildIndex(I)I

    move-result v6

    goto :goto_2

    :cond_5
    move v6, v4

    :goto_2
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/uimanager/f0;->b:Landroid/graphics/PointF;

    aget v8, p0, v2

    aget v9, p0, v3

    invoke-static {v8, v9, v0, v6, v7}, Lcom/facebook/react/uimanager/f0;->g(FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V

    aget v8, p0, v2

    aget v9, p0, v3

    iget v10, v7, Landroid/graphics/PointF;->x:F

    aput v10, p0, v2

    iget v7, v7, Landroid/graphics/PointF;->y:F

    aput v7, p0, v3

    invoke-static {p0, v6, p3}, Lcom/facebook/react/uimanager/f0;->f([FLandroid/view/View;Ljava/util/List;)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_6

    return-object v6

    :cond_6
    aput v8, p0, v2

    aput v9, p0, v3

    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_7
    sget-object p3, Lcom/facebook/react/uimanager/f0$a;->m:Lcom/facebook/react/uimanager/f0$a;

    invoke-virtual {p2, p3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    aget p2, p0, v2

    aget p0, p0, v3

    invoke-static {p2, p0, p1}, Lcom/facebook/react/uimanager/f0;->i(FFLandroid/view/View;)Z

    move-result p0

    if-eqz p0, :cond_8

    return-object p1

    :cond_8
    return-object v1
.end method

.method private static f([FLandroid/view/View;Ljava/util/List;)Landroid/view/View;
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/facebook/react/uimanager/Q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/facebook/react/uimanager/Q;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/Q;->getPointerEvents()Lcom/facebook/react/uimanager/H;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/facebook/react/uimanager/H;->o:Lcom/facebook/react/uimanager/H;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/facebook/react/uimanager/H;->p:Lcom/facebook/react/uimanager/H;

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/facebook/react/uimanager/H;->n:Lcom/facebook/react/uimanager/H;

    :cond_2
    :goto_1
    sget-object v1, Lcom/facebook/react/uimanager/H;->n:Lcom/facebook/react/uimanager/H;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    return-object v2

    :cond_3
    sget-object v1, Lcom/facebook/react/uimanager/H;->p:Lcom/facebook/react/uimanager/H;

    if-ne v0, v1, :cond_5

    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->m:Lcom/facebook/react/uimanager/f0$a;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lcom/facebook/react/uimanager/f0;->e([FLandroid/view/View;Ljava/util/EnumSet;Ljava/util/List;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_4

    if-eqz p2, :cond_4

    new-instance v0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-direct {v0, v1, p1, v2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object p0

    :cond_5
    sget-object v1, Lcom/facebook/react/uimanager/H;->o:Lcom/facebook/react/uimanager/H;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v1, :cond_a

    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->n:Lcom/facebook/react/uimanager/f0$a;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lcom/facebook/react/uimanager/f0;->e([FLandroid/view/View;Ljava/util/EnumSet;Ljava/util/List;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_7

    if-eqz p2, :cond_6

    new-instance p0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-direct {p0, v1, p1, v2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v0

    :cond_7
    instance-of v0, p1, Lcom/facebook/react/uimanager/M;

    if-eqz v0, :cond_9

    aget v0, p0, v4

    aget v1, p0, v3

    invoke-static {v0, v1, p1}, Lcom/facebook/react/uimanager/f0;->i(FFLandroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Lcom/facebook/react/uimanager/M;

    aget v1, p0, v4

    aget p0, p0, v3

    invoke-interface {v0, v1, p0}, Lcom/facebook/react/uimanager/M;->reactTagForTouch(FF)I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    if-eq p0, v0, :cond_9

    if-eqz p2, :cond_8

    new-instance p0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {p0, v0, p1, v2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    return-object p1

    :cond_9
    return-object v2

    :cond_a
    sget-object v1, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    if-eq v0, v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unknown pointer event type: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    instance-of v0, p1, Lcom/facebook/react/uimanager/N;

    if-eqz v0, :cond_d

    aget v0, p0, v4

    aget v1, p0, v3

    invoke-static {v0, v1, p1}, Lcom/facebook/react/uimanager/f0;->i(FFLandroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/facebook/react/uimanager/N;

    aget v1, p0, v4

    aget v3, p0, v3

    invoke-interface {v0, v1, v3}, Lcom/facebook/react/uimanager/N;->interceptsTouchEvent(FF)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz p2, :cond_c

    new-instance p0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-direct {p0, v0, p1, v2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    return-object p1

    :cond_d
    sget-object v0, Lcom/facebook/react/uimanager/f0$a;->m:Lcom/facebook/react/uimanager/f0$a;

    sget-object v1, Lcom/facebook/react/uimanager/f0$a;->n:Lcom/facebook/react/uimanager/f0$a;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lcom/facebook/react/uimanager/f0;->e([FLandroid/view/View;Ljava/util/EnumSet;Ljava/util/List;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_e

    if-eqz p2, :cond_e

    new-instance v0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-direct {v0, v1, p1, v2}, Lcom/facebook/react/uimanager/f0$b;-><init>(ILandroid/view/View;Lcom/facebook/react/uimanager/g0;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    return-object p0
.end method

.method private static g(FFLandroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/PointF;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p0, v0

    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p0, v0

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p1, p2

    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p2

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-virtual {p3}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result p3

    if-nez p3, :cond_0

    sget-object p3, Lcom/facebook/react/uimanager/f0;->c:[F

    const/4 v0, 0x0

    aput p0, p3, v0

    const/4 p0, 0x1

    aput p1, p3, p0

    sget-object p1, Lcom/facebook/react/uimanager/f0;->d:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    invoke-virtual {p1, p3}, Landroid/graphics/Matrix;->mapPoints([F)V

    aget p1, p3, v0

    aget p0, p3, p0

    move v1, p1

    move p1, p0

    move p0, v1

    :cond_0
    invoke-virtual {p4, p0, p1}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method private static h(Landroid/view/View;FF)I
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/facebook/react/uimanager/M;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/facebook/react/uimanager/M;

    invoke-interface {p0, p1, p2}, Lcom/facebook/react/uimanager/M;->reactTagForTouch(FF)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0
.end method

.method private static i(FFLandroid/view/View;)Z
    .locals 5

    .line 1
    instance-of v0, p2, Lw2/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lw2/c;

    invoke-interface {v0}, Lw2/c;->getHitSlopRect()Landroid/graphics/Rect;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Lw2/c;->getHitSlopRect()Landroid/graphics/Rect;

    move-result-object v0

    iget v3, v0, Landroid/graphics/Rect;->left:I

    neg-int v3, v3

    int-to-float v3, v3

    cmpl-float v3, p0, v3

    if-ltz v3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    cmpg-float p0, p0, v3

    if-gez p0, :cond_0

    iget p0, v0, Landroid/graphics/Rect;->top:I

    neg-int p0, p0

    int-to-float p0, p0

    cmpl-float p0, p1, p0

    if-ltz p0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p0

    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p0, p2

    int-to-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    cmpl-float v3, p0, v0

    if-ltz v3, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpg-float p0, p0, v3

    if-gez p0, :cond_2

    cmpl-float p0, p1, v0

    if-ltz p0, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method private static j(FFLandroid/view/View;)Z
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/facebook/react/uimanager/P;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p2

    check-cast v0, Lcom/facebook/react/uimanager/P;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/P;->getOverflowInset()Landroid/graphics/Rect;

    move-result-object v0

    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    cmpl-float v2, p0, v2

    if-ltz v2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    cmpg-float p0, p0, v2

    if-gez p0, :cond_1

    iget p0, v0, Landroid/graphics/Rect;->top:I

    int-to-float p0, p0

    cmpl-float p0, p1, p0

    if-ltz p0, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p0

    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p0, p2

    int-to-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
