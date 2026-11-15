.class public final Lcom/facebook/react/views/modal/f$b;
.super Lcom/facebook/react/views/view/i;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/Z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/modal/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private m:Lcom/facebook/react/uimanager/d0;

.field private n:Z

.field private o:I

.field private p:I

.field private final q:Lcom/facebook/react/uimanager/u;

.field private r:Lcom/facebook/react/uimanager/t;

.field private s:Lcom/facebook/react/uimanager/events/e;

.field final synthetic t:Lcom/facebook/react/views/modal/f;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/modal/f;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$b;->t:Lcom/facebook/react/views/modal/f;

    invoke-direct {p0, p2}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/facebook/react/uimanager/u;

    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/u;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$b;->q:Lcom/facebook/react/uimanager/u;

    sget-boolean p1, Lcom/facebook/react/config/ReactFeatureFlags;->dispatchPointerEvents:Z

    if-eqz p1, :cond_0

    new-instance p1, Lcom/facebook/react/uimanager/t;

    invoke-direct {p1, p0}, Lcom/facebook/react/uimanager/t;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    :cond_0
    return-void
.end method

.method private final getReactContext()Lcom/facebook/react/uimanager/e0;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/uimanager/e0;

    return-object v0
.end method

.method public static final synthetic q(Lcom/facebook/react/views/modal/f$b;)Lcom/facebook/react/uimanager/e0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/modal/f$b;->getReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/facebook/react/views/modal/f$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/views/modal/f$b;->p:I

    return p0
.end method

.method public static final synthetic s(Lcom/facebook/react/views/modal/f$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/views/modal/f$b;->o:I

    return p0
.end method

.method private final t()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/modal/f$b;->n:Z

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->m:Lcom/facebook/react/uimanager/d0;

    if-eqz v1, :cond_0

    iget v0, p0, Lcom/facebook/react/views/modal/f$b;->o:I

    iget v1, p0, Lcom/facebook/react/views/modal/f$b;->p:I

    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/modal/f$b;->u(II)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/modal/f$b;->getReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v1

    new-instance v2, Lcom/facebook/react/views/modal/f$b$a;

    invoke-direct {v2, v1, p0, v0}, Lcom/facebook/react/views/modal/f$b$a;-><init>(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/views/modal/f$b;I)V

    invoke-virtual {v1, v2}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/modal/f$b;->n:Z

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "childView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ev"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->q:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v1, p2, v0}, Lcom/facebook/react/uimanager/u;->e(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, v0}, Lcom/facebook/react/uimanager/t;->p(Landroid/view/View;Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    :cond_0
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/views/view/i;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-boolean p1, p0, Lcom/facebook/react/views/modal/f$b;->n:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f$b;->t()V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "t"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f$b;->getReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->handleException(Ljava/lang/Exception;)V

    return-void
.end method

.method public d(Landroid/view/View;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "childView"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ev"

    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->q:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v0, p2, p1}, Lcom/facebook/react/uimanager/u;->d(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/t;->o()V

    :cond_1
    return-void
.end method

.method public final getEventDispatcher$ReactAndroid_release()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    return-object v0
.end method

.method public final getStateWrapper$ReactAndroid_release()Lcom/facebook/react/uimanager/d0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->m:Lcom/facebook/react/uimanager/d0;

    return-object v0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onInterceptHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->q:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/react/uimanager/u;->c(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/i;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/i;->onSizeChanged(IIII)V

    iput p1, p0, Lcom/facebook/react/views/modal/f$b;->o:I

    iput p2, p0, Lcom/facebook/react/views/modal/f$b;->p:I

    invoke-direct {p0}, Lcom/facebook/react/views/modal/f$b;->t()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->q:Lcom/facebook/react/uimanager/u;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/react/uimanager/u;->c(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;)V

    iget-object v1, p0, Lcom/facebook/react/views/modal/f$b;->r:Lcom/facebook/react/uimanager/t;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/facebook/react/uimanager/t;->k(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/e;Z)V

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/react/views/view/i;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    return-void
.end method

.method public final setEventDispatcher$ReactAndroid_release(Lcom/facebook/react/uimanager/events/e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$b;->s:Lcom/facebook/react/uimanager/events/e;

    return-void
.end method

.method public final setStateWrapper$ReactAndroid_release(Lcom/facebook/react/uimanager/d0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/modal/f$b;->m:Lcom/facebook/react/uimanager/d0;

    return-void
.end method

.method public final u(II)V
    .locals 8

    .line 1
    int-to-float p1, p1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p2

    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->m:Lcom/facebook/react/uimanager/d0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/uimanager/d0;->b()Lcom/facebook/react/bridge/ReadableNativeMap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "screenWidth"

    const-string v2, "screenHeight"

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    double-to-float v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    double-to-float v4, v4

    :cond_2
    sub-float/2addr v4, p1

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const v0, 0x3f666666    # 0.9f

    float-to-double v6, v0

    cmpg-double v0, v4, v6

    if-gez v0, :cond_3

    sub-float/2addr v3, p2

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    cmpg-double v0, v3, v6

    if-gez v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/modal/f$b;->m:Lcom/facebook/react/uimanager/d0;

    if-eqz v0, :cond_4

    new-instance v3, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v3}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    float-to-double v4, p1

    invoke-interface {v3, v1, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    float-to-double p1, p2

    invoke-interface {v3, v2, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-interface {v0, v3}, Lcom/facebook/react/uimanager/d0;->a(Lcom/facebook/react/bridge/WritableMap;)V

    :cond_4
    return-void
.end method
