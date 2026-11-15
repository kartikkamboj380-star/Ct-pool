.class public final Lcom/facebook/react/runtime/f0;
.super Lcom/facebook/react/X;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/f0$a;
    }
.end annotation


# static fields
.field private static final L:Lcom/facebook/react/runtime/f0$a;


# instance fields
.field private final F:Lcom/facebook/react/runtime/e0;

.field private final G:Lcom/facebook/react/uimanager/u;

.field private H:Lcom/facebook/react/uimanager/t;

.field private I:Z

.field private J:I

.field private K:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/runtime/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/runtime/f0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/runtime/f0;->L:Lcom/facebook/react/runtime/f0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/runtime/e0;)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/X;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    new-instance p1, Lcom/facebook/react/uimanager/u;

    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/u;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/facebook/react/runtime/f0;->G:Lcom/facebook/react/uimanager/u;

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    if-eqz p1, :cond_0

    new-instance p1, Lcom/facebook/react/uimanager/t;

    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/t;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/facebook/react/runtime/f0;->H:Lcom/facebook/react/uimanager/t;

    :cond_0
    return-void
.end method

.method private final getViewportOffset()Landroid/graphics/Point;
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    const/4 v2, 0x0

    aget v3, v0, v2

    iget v4, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v4

    aput v3, v0, v2

    const/4 v3, 0x1

    aget v4, v0, v3

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v4, v1

    aput v4, v0, v3

    new-instance v1, Landroid/graphics/Point;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-direct {v1, v2, v0}, Landroid/graphics/Point;-><init>(II)V

    return-object v1
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "ev"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->i()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/runtime/f0;->G:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v1, p2, v0}, Lcom/facebook/react/uimanager/u;->e(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/runtime/f0;->H:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, p2, v0}, Lcom/facebook/react/uimanager/t;->p(Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    :cond_1
    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-string v0, "t"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->l()Lcom/facebook/react/runtime/ReactHostImpl;

    move-result-object v0

    const-string v1, "getReactHost(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/uimanager/s;

    invoke-static {v1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-direct {v2, v1, p0, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;Landroid/view/View;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lcom/facebook/react/runtime/ReactHostImpl;->B0(Ljava/lang/Exception;)V

    return-void
.end method

.method public d(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "childView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ev"

    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->i()Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->G:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v0, p2, p1}, Lcom/facebook/react/uimanager/u;->d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    iget-object p1, p0, Lcom/facebook/react/runtime/f0;->H:Lcom/facebook/react/uimanager/t;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/t;->o()V

    :cond_1
    return-void
.end method

.method protected g(Landroid/view/MotionEvent;Z)V
    .locals 2

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->H:Lcom/facebook/react/uimanager/t;

    const-string v1, "ReactSurfaceView"

    if-nez v0, :cond_1

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string p1, "Unable to dispatch pointer events to JS before the dispatcher is available"

    invoke-static {v1, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->i()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/facebook/react/runtime/f0;->H:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1, v0, p2}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    goto :goto_0

    :cond_2
    const-string p1, "Unable to dispatch pointer events to JS as the React instance has not been attached"

    invoke-static {v1, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->l()Lcom/facebook/react/runtime/ReactHostImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getJSModuleName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<get-moduleName>(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getUIManagerType()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method protected h(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->i()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/runtime/f0;->G:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/react/uimanager/u;->c(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    goto :goto_0

    :cond_0
    const-string p1, "ReactSurfaceView"

    const-string v0, "Unable to dispatch touch events to JS as the React instance has not been attached"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->l()Lcom/facebook/react/runtime/ReactHostImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->l()Lcom/facebook/react/runtime/ReactHostImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/e0;->o()Z

    move-result v0

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    iget-boolean p2, p0, Lcom/facebook/react/runtime/f0;->I:Z

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/runtime/f0;->getViewportOffset()Landroid/graphics/Point;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    iget p3, p0, Lcom/facebook/react/runtime/f0;->J:I

    iget p4, p0, Lcom/facebook/react/runtime/f0;->K:I

    iget p5, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p2, p3, p4, p5, p1}, Lcom/facebook/react/runtime/e0;->s(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 10

    const-string v0, "ReactSurfaceView.onMeasure"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/a;->c(JLjava/lang/String;)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v3, -0x80000000

    const/4 v4, 0x0

    if-eq v0, v3, :cond_0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v6, v0, :cond_1

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v8

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    add-int/2addr v8, v9

    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v8, v7

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move v0, v5

    :goto_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    if-eq v5, v3, :cond_2

    if-eqz v5, :cond_2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v5, v4

    :goto_2
    if-ge v4, v3, :cond_3

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v6}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v6}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v7, v6

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    move v3, v5

    :goto_3
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/runtime/f0;->I:Z

    iput p1, p0, Lcom/facebook/react/runtime/f0;->J:I

    iput p2, p0, Lcom/facebook/react/runtime/f0;->K:I

    invoke-direct {p0}, Lcom/facebook/react/runtime/f0;->getViewportOffset()Landroid/graphics/Point;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/react/runtime/f0;->F:Lcom/facebook/react/runtime/e0;

    iget v4, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {v3, p1, p2, v4, v0}, Lcom/facebook/react/runtime/e0;->s(IIII)V

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public setIsFabric(Z)V
    .locals 0

    const/4 p1, 0x1

    invoke-super {p0, p1}, Lcom/facebook/react/X;->setIsFabric(Z)V

    return-void
.end method
