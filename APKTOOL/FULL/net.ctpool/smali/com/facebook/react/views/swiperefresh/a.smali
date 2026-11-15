.class public Lcom/facebook/react/views/swiperefresh/a;
.super Landroidx/swiperefreshlayout/widget/c;
.source "SourceFile"


# instance fields
.field private g0:Z

.field private h0:Z

.field private i0:F

.field private j0:I

.field private k0:F

.field private l0:Z

.field private m0:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    invoke-direct {p0, p1}, Landroidx/swiperefreshlayout/widget/c;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->g0:Z

    iput-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->h0:Z

    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/react/views/swiperefresh/a;->i0:F

    iput-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->m0:Z

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/swiperefresh/a;->j0:I

    return-void
.end method

.method private B(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/swiperefresh/a;->k0:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->l0:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/facebook/react/views/swiperefresh/a;->j0:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    :cond_1
    iput-boolean v2, p0, Lcom/facebook/react/views/swiperefresh/a;->l0:Z

    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/swiperefresh/a;->k0:F

    iput-boolean v1, p0, Lcom/facebook/react/views/swiperefresh/a;->l0:Z

    :cond_3
    :goto_0
    return v2
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/react/views/swiperefresh/a;->B(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroidx/swiperefreshlayout/widget/c;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->b(Landroid/view/View;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/swiperefresh/a;->m0:Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroidx/swiperefreshlayout/widget/c;->onLayout(ZIIII)V

    iget-boolean p1, p0, Lcom/facebook/react/views/swiperefresh/a;->g0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/swiperefresh/a;->g0:Z

    iget p1, p0, Lcom/facebook/react/views/swiperefresh/a;->i0:F

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/swiperefresh/a;->setProgressViewOffset(F)V

    iget-boolean p1, p0, Lcom/facebook/react/views/swiperefresh/a;->h0:Z

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/swiperefresh/a;->setRefreshing(Z)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->m0:Z

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->m0:Z

    :cond_0
    invoke-super {p0, p1}, Landroidx/swiperefreshlayout/widget/c;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public setProgressViewOffset(F)V
    .locals 3

    iput p1, p0, Lcom/facebook/react/views/swiperefresh/a;->i0:F

    iget-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->g0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/c;->getProgressCircleDiameter()I

    move-result v0

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sub-int/2addr v1, v0

    const/high16 v2, 0x42800000    # 64.0f

    add-float/2addr p1, v2

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1, p1}, Landroidx/swiperefreshlayout/widget/c;->s(ZII)V

    :cond_0
    return-void
.end method

.method public setRefreshing(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/facebook/react/views/swiperefresh/a;->h0:Z

    iget-boolean v0, p0, Lcom/facebook/react/views/swiperefresh/a;->g0:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    :cond_0
    return-void
.end method
