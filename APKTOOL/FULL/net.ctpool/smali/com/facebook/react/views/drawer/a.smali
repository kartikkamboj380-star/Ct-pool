.class Lcom/facebook/react/views/drawer/a;
.super LH/a;
.source "SourceFile"


# instance fields
.field private f0:I

.field private g0:I

.field private h0:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, LH/a;-><init>(Landroid/content/Context;)V

    const p1, 0x800003

    iput p1, p0, Lcom/facebook/react/views/drawer/a;->f0:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/drawer/a;->g0:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/drawer/a;->h0:Z

    new-instance p1, Lcom/facebook/react/views/drawer/a$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/drawer/a$a;-><init>(Lcom/facebook/react/views/drawer/a;)V

    invoke-static {p0, p1}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method


# virtual methods
.method W()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/drawer/a;->f0:I

    invoke-virtual {p0, v0}, LH/a;->d(I)V

    return-void
.end method

.method X()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/drawer/a;->f0:I

    invoke-virtual {p0, v0}, LH/a;->I(I)V

    return-void
.end method

.method Y(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/drawer/a;->f0:I

    invoke-virtual {p0}, Lcom/facebook/react/views/drawer/a;->Z()V

    return-void
.end method

.method Z()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, LH/a$f;

    iget v3, p0, Lcom/facebook/react/views/drawer/a;->f0:I

    iput v3, v2, LH/a$f;->a:I

    iget v3, p0, Lcom/facebook/react/views/drawer/a;->g0:I

    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    :cond_0
    return-void
.end method

.method a0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/drawer/a;->g0:I

    invoke-virtual {p0}, Lcom/facebook/react/views/drawer/a;->Z()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    :try_start_0
    invoke-super {p0, p1}, LH/a;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->b(Landroid/view/View;Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/drawer/a;->h0:Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v0, "ReactNative"

    const-string v1, "Error intercepting touch event."

    invoke-static {v0, v1, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/views/drawer/a;->h0:Z

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/drawer/a;->h0:Z

    :cond_0
    invoke-super {p0, p1}, LH/a;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
