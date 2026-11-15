.class public Lcom/facebook/react/uimanager/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final j:[I


# instance fields
.field private a:Ljava/util/Map;

.field private b:Ljava/util/Map;

.field private c:Ljava/util/Map;

.field private d:Ljava/util/Set;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private final i:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0}, [I

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/t;->j:[I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/react/uimanager/t;->e:I

    iput v0, p0, Lcom/facebook/react/uimanager/t;->f:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/uimanager/t;->g:I

    iput v0, p0, Lcom/facebook/react/uimanager/t;->h:I

    iput-object p1, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/uimanager/t;->c:Ljava/util/Map;

    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    .locals 3

    .line 1
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    const/4 v2, 0x0

    aget v2, v0, v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    const/4 v2, 0x1

    aget v0, v0, v2

    int-to-float v0, v0

    sub-float/2addr p2, v0

    invoke-virtual {p1, v1, p2}, Landroid/view/MotionEvent;->setLocation(FF)V

    return-object p1
.end method

.method private b(ILandroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n$b;
    .locals 13

    .line 1
    const/4 v0, 0x2

    const/4 v1, 0x1

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v4

    if-ge v3, v4, :cond_0

    new-array v4, v0, [F

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    new-array v11, v0, [F

    aput v5, v11, v2

    aput v6, v11, v1

    aget v5, v11, v2

    aget v6, v11, v1

    iget-object v12, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    invoke-static {v5, v6, v12, v4}, Lcom/facebook/react/uimanager/f0;->b(FFLandroid/view/ViewGroup;[F)Ljava/util/List;

    move-result-object v5

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v9, v4, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v11}, Lcom/facebook/react/uimanager/t;->e([F)[F

    move-result-object v5

    invoke-interface {v10, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v3, v1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    invoke-static {p2}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v6

    new-instance p2, Lcom/facebook/react/uimanager/events/n$b;

    iget v3, p0, Lcom/facebook/react/uimanager/t;->f:I

    iget v5, p0, Lcom/facebook/react/uimanager/t;->h:I

    iget-object v11, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    move-object v2, p2

    move v4, p1

    invoke-direct/range {v2 .. v11}, Lcom/facebook/react/uimanager/events/n$b;-><init>(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V

    return-object p2
.end method

.method private c(Landroid/view/View;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/t;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v4, "Expected to not have already sent a cancel for this gesture"

    invoke-static {v0, v4}, LO1/a;->b(ZLjava/lang/String;)V

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v0

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    if-eqz p1, :cond_2

    sget-object v4, Lcom/facebook/react/uimanager/events/o$b;->m:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v5, Lcom/facebook/react/uimanager/events/o$b;->n:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v0, v4, v5}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v0

    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/t;->h(Landroid/view/View;)[I

    move-result-object p1

    aget v2, p1, v2

    int-to-float v2, v2

    aget p1, p1, v1

    int-to-float p1, p1

    invoke-direct {p0, p2, v2, p1}, Lcom/facebook/react/uimanager/t;->n(Lcom/facebook/react/uimanager/events/n$b;FF)Lcom/facebook/react/uimanager/events/n$b;

    move-result-object p1

    invoke-static {p4}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/uimanager/events/e;

    const-string p4, "topPointerCancel"

    invoke-static {p4, v0, p1, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/t;->l()V

    iput v3, p0, Lcom/facebook/react/uimanager/t;->f:I

    :cond_2
    return-void
.end method

.method private static d(Ljava/lang/String;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Ljava/util/List;Lcom/facebook/react/uimanager/events/e;)V
    .locals 1

    .line 1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v0

    invoke-static {p0, v0, p1, p2}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object v0

    invoke-interface {p4, v0}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private e([F)[F
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    sget-object v1, Lcom/facebook/react/uimanager/t;->j:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v0, 0x0

    aget v2, p1, v0

    aget v3, v1, v0

    int-to-float v3, v3

    add-float/2addr v2, v3

    const/4 v3, 0x1

    aget p1, p1, v3

    aget v1, v1, v3

    int-to-float v1, v1

    add-float/2addr p1, v1

    const/4 v1, 0x2

    new-array v1, v1, [F

    aput v2, v1, v0

    aput p1, v1, v3

    return-object v1
.end method

.method private static f(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;Z)Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p3

    const/4 v1, 0x1

    sub-int/2addr p3, v1

    const/4 v2, 0x0

    :goto_0
    if-ltz p3, :cond_3

    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v3

    if-nez v2, :cond_1

    invoke-static {v3, p2}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v3, p1}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0, p3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    invoke-static {v3, p2}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v2, v1

    :cond_2
    :goto_1
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private static g(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/f0$b;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method private h(Landroid/view/View;)[I
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v1, p0, Lcom/facebook/react/uimanager/t;->i:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->left:I

    filled-new-array {p1, v0}, [I

    move-result-object p1

    return-object p1
.end method

.method private i()S
    .locals 2

    .line 1
    const v0, 0xffff

    iget v1, p0, Lcom/facebook/react/uimanager/t;->g:I

    and-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method private j(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iget-object v3, p0, Lcom/facebook/react/uimanager/t;->a:Ljava/util/Map;

    if-eqz v3, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/facebook/react/uimanager/t;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move v7, v6

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ge v5, v8, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    sub-int/2addr v8, v5

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/react/uimanager/f0$b;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v9

    sub-int/2addr v10, v5

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/facebook/react/uimanager/f0$b;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v9

    sub-int/2addr v8, v5

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v8}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v8

    if-nez v6, :cond_2

    sget-object v10, Lcom/facebook/react/uimanager/events/o$b;->t:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v8, v10}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v10

    if-eqz v10, :cond_2

    move v6, v9

    :cond_2
    if-nez v7, :cond_3

    sget-object v10, Lcom/facebook/react/uimanager/events/o$b;->v:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v8, v10}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v7, v9

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    if-ge v5, v8, :cond_8

    invoke-direct {p0}, Lcom/facebook/react/uimanager/t;->l()V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    if-lez v8, :cond_6

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v8}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v8

    sget-object v9, Lcom/facebook/react/uimanager/events/o$b;->A:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v10, Lcom/facebook/react/uimanager/events/o$b;->B:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v3, v9, v10}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v9

    if-eqz v9, :cond_5

    const-string v9, "topPointerOut"

    invoke-static {v9, v8, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object v8

    invoke-interface {p4, v8}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v8, v5

    invoke-interface {v3, v4, v8}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    sget-object v8, Lcom/facebook/react/uimanager/events/o$b;->u:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v9, Lcom/facebook/react/uimanager/events/o$b;->v:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v3, v8, v9, v7}, Lcom/facebook/react/uimanager/t;->f(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;Z)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_6

    const-string v7, "topPointerLeave"

    invoke-static {v7, p2, p3, v3, p4}, Lcom/facebook/react/uimanager/t;->d(Ljava/lang/String;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Ljava/util/List;Lcom/facebook/react/uimanager/events/e;)V

    :cond_6
    sget-object v3, Lcom/facebook/react/uimanager/events/o$b;->C:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v7, Lcom/facebook/react/uimanager/events/o$b;->D:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v2, v3, v7}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "topPointerOver"

    invoke-static {v3, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object v3

    invoke-interface {p4, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-interface {v2, v4, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    sget-object v3, Lcom/facebook/react/uimanager/events/o$b;->s:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v4, Lcom/facebook/react/uimanager/events/o$b;->t:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v2, v3, v4, v6}, Lcom/facebook/react/uimanager/t;->f(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;Z)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_8

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    const-string v3, "topPointerEnter"

    invoke-static {v3, p2, p3, v2, p4}, Lcom/facebook/react/uimanager/t;->d(Ljava/lang/String;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Ljava/util/List;Lcom/facebook/react/uimanager/events/e;)V

    :cond_8
    new-instance p3, Ljava/util/HashMap;

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    if-ne p1, v1, :cond_9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iput-object p3, p0, Lcom/facebook/react/uimanager/t;->a:Ljava/util/Map;

    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/t;->g:I

    add-int/lit8 v0, v0, 0x1

    const v1, 0x7fffffff

    rem-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/react/uimanager/t;->g:I

    return-void
.end method

.method private static m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/events/o;->h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private n(Lcom/facebook/react/uimanager/events/n$b;FF)Lcom/facebook/react/uimanager/events/n$b;
    .locals 10

    .line 1
    new-instance v5, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->h()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v7, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->c()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v8, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->j()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const/4 v0, 0x2

    new-array v1, v0, [F

    const/4 v2, 0x0

    aput p2, v1, v2

    const/4 p2, 0x1

    aput p3, v1, p2

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3, v1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-array p2, v0, [F

    fill-array-data p2, :array_0

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0, p2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/t;->e([F)[F

    move-result-object p2

    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0, p2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    new-instance p2, Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->i()I

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->g()I

    move-result v3

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->k()I

    move-result v4

    new-instance v6, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object p3

    invoke-direct {v6, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v9, Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/n$b;->f()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v9, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v0, p2

    invoke-direct/range {v0 .. v9}, Lcom/facebook/react/uimanager/events/n$b;-><init>(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V

    return-object p2

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method private q(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0}, Lcom/facebook/react/uimanager/t;->l()V

    iget-object v1, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/facebook/react/uimanager/events/o$b;->C:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->D:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "topPointerOver"

    invoke-static {v1, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object v1

    invoke-interface {p4, v1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    sget-object v1, Lcom/facebook/react/uimanager/events/o$b;->s:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->t:Lcom/facebook/react/uimanager/events/o$b;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/t;->f(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;Z)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    const-string v2, "topPointerEnter"

    invoke-static {v2, p2, p3, v1, p4}, Lcom/facebook/react/uimanager/t;->d(Ljava/lang/String;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Ljava/util/List;Lcom/facebook/react/uimanager/events/e;)V

    :cond_1
    sget-object v1, Lcom/facebook/react/uimanager/events/o$b;->o:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->p:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/react/uimanager/t;->c:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Lcom/facebook/react/uimanager/events/o$b;->q:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->r:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "topPointerDown"

    invoke-static {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_3
    return-void
.end method

.method private r(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v0

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v1, Lcom/facebook/react/uimanager/events/o$b;->w:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->x:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v0, v1, v2}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "topPointerMove"

    invoke-direct {p0}, Lcom/facebook/react/uimanager/t;->i()S

    move-result v1

    invoke-static {v0, p1, p2, p3, v1}, Lcom/facebook/react/uimanager/events/n;->j(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/n;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method private s(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v0

    invoke-virtual {p2}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->y:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v3, Lcom/facebook/react/uimanager/events/o$b;->z:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v1, v2, v3}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "topPointerUp"

    invoke-static {v2, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object v2

    invoke-interface {p4, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    iget-object v2, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->A:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v4, Lcom/facebook/react/uimanager/events/o$b;->B:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v1, v2, v4}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "topPointerOut"

    invoke-static {v2, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_1
    sget-object p1, Lcom/facebook/react/uimanager/events/o$b;->u:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->v:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v1, p1, v2, v3}, Lcom/facebook/react/uimanager/t;->f(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;Z)Ljava/util/List;

    move-result-object p1

    const-string v2, "topPointerLeave"

    invoke-static {v2, p2, p3, p1, p4}, Lcom/facebook/react/uimanager/t;->d(Ljava/lang/String;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Ljava/util/List;Lcom/facebook/react/uimanager/events/e;)V

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/uimanager/t;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_3

    sget-object v2, Lcom/facebook/react/uimanager/events/o$b;->o:Lcom/facebook/react/uimanager/events/o$b;

    sget-object v4, Lcom/facebook/react/uimanager/events/o$b;->p:Lcom/facebook/react/uimanager/events/o$b;

    invoke-static {v1, v2, v4}, Lcom/facebook/react/uimanager/t;->m(Ljava/util/List;Lcom/facebook/react/uimanager/events/o$b;Lcom/facebook/react/uimanager/events/o$b;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {p1, v1}, Lcom/facebook/react/uimanager/t;->g(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/f0$b;

    const-string v1, "topClick"

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result p1

    invoke-static {v1, p1, p2, p3}, Lcom/facebook/react/uimanager/events/n;->i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_3
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/uimanager/t;->f:I

    :cond_4
    iget-object p1, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private static t([F[F)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    aget v1, p1, v0

    aget v2, p0, v0

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3dcccccd    # 0.1f

    cmpl-float v1, v1, v2

    const/4 v3, 0x1

    if-gtz v1, :cond_0

    aget p1, p1, v3

    aget p0, p0, v3

    sub-float/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpl-float p0, p0, v2

    if-lez p0, :cond_1

    :cond_0
    move v0, v3

    :cond_1
    return v0
.end method


# virtual methods
.method public k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/t;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, p0, Lcom/facebook/react/uimanager/t;->f:I

    goto :goto_0

    :cond_1
    const/4 v4, 0x7

    if-ne v0, v4, :cond_2

    iget-object v4, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    invoke-direct {p0, v2, p1}, Lcom/facebook/react/uimanager/t;->b(ILandroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n$b;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p3

    const/16 v6, 0xa

    if-ne p3, v6, :cond_3

    move p3, v5

    goto :goto_1

    :cond_3
    move p3, v3

    :goto_1
    if-eqz p3, :cond_7

    iget-object v6, p0, Lcom/facebook/react/uimanager/t;->a:Ljava/util/Map;

    if-eqz v6, :cond_4

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/n$b;->b()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v5

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v7

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v6

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    :goto_3
    return-void

    :cond_7
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/n$b;->d()Ljava/util/Map;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_c

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    goto/16 :goto_7

    :cond_8
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/uimanager/f0$b;

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/f0$b;->b()I

    move-result v7

    invoke-virtual {v6}, Lcom/facebook/react/uimanager/f0$b;->a()Landroid/view/View;

    move-result-object v6

    :goto_4
    invoke-direct {p0, v7, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->j(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Motion Event was ignored. Action="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " Target="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_1
    if-eqz p3, :cond_b

    :cond_9
    :pswitch_2
    invoke-direct {p0, v7, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->r(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    goto :goto_6

    :pswitch_3
    return-void

    :pswitch_4
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/n$b;->c()Ljava/util/Map;

    move-result-object p3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [F

    iget-object v0, p0, Lcom/facebook/react/uimanager/t;->b:Ljava/util/Map;

    if-eqz v0, :cond_a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/facebook/react/uimanager/t;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    goto :goto_5

    :cond_a
    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput v1, v0, v3

    aput v1, v0, v5

    :goto_5
    invoke-static {p3, v0}, Lcom/facebook/react/uimanager/t;->t([F[F)Z

    move-result p3

    if-nez p3, :cond_9

    return-void

    :pswitch_5
    invoke-direct {p0, v6, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->c(Landroid/view/View;Lcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    invoke-direct {p0, v1, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->j(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    goto :goto_6

    :pswitch_6
    invoke-direct {p0}, Lcom/facebook/react/uimanager/t;->l()V

    invoke-direct {p0, v7, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->s(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    goto :goto_6

    :pswitch_7
    invoke-direct {p0, v7, v4, p1, p2}, Lcom/facebook/react/uimanager/t;->q(ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    :cond_b
    :goto_6
    new-instance p2, Ljava/util/HashMap;

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/n$b;->c()Ljava/util/Map;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/facebook/react/uimanager/t;->b:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/uimanager/t;->h:I

    iget-object p1, p0, Lcom/facebook/react/uimanager/t;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/react/uimanager/t;->d:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    :cond_c
    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/react/uimanager/t;->e:I

    return-void
.end method

.method public p(Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/t;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/t;->a(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p2

    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->setAction(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p3, v0}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/uimanager/t;->e:I

    :cond_1
    :goto_0
    return-void
.end method
