.class public Lcom/facebook/react/runtime/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/a;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:Ljava/util/concurrent/atomic/AtomicReference;

.field private final c:Lc2/b;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    new-instance v0, Lcom/facebook/react/fabric/SurfaceHandlerBinding;

    invoke-direct {v0, p2}, Lcom/facebook/react/fabric/SurfaceHandlerBinding;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/e0;-><init>(Lc2/b;Landroid/content/Context;)V

    if-nez p3, :cond_0

    new-instance p2, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {p2}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/bridge/NativeMap;

    :goto_0
    iget-object p3, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    invoke-interface {p3, p2}, Lc2/b;->b(Lcom/facebook/react/bridge/NativeMap;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    iget p3, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v1, -0x80000000

    invoke-static {p3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    iget p2, p2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {p1}, Lcom/facebook/react/runtime/e0;->g(Landroid/content/Context;)Z

    move-result v5

    invoke-static {p1}, Lcom/facebook/react/runtime/e0;->p(Landroid/content/Context;)Z

    move-result v6

    invoke-static {p1}, Lcom/facebook/react/runtime/e0;->k(Landroid/content/Context;)F

    move-result v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v1, p3

    invoke-interface/range {v0 .. v7}, Lc2/b;->e(IIIIZZF)V

    return-void
.end method

.method constructor <init>(Lc2/b;Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/react/runtime/e0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    iput-object p2, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/runtime/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/e0;->r()V

    return-void
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/facebook/react/runtime/e0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/e0;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/runtime/e0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance p1, Lcom/facebook/react/runtime/f0;

    invoke-direct {p1, p0, v0}, Lcom/facebook/react/runtime/f0;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/e0;)V

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/e0;->d(Lcom/facebook/react/runtime/f0;)V

    return-object v0
.end method

.method private static g(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/modules/i18nmanager/a;->d(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static k(Landroid/content/Context;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    return p0
.end method

.method private static p(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private synthetic r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/e0;->a()Landroid/view/ViewGroup;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/runtime/f0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public c(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/facebook/jni/a;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This surface is already attached to a host!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lcom/facebook/react/runtime/f0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lcom/facebook/jni/a;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Trying to call ReactSurface.attachView(), but the view is already attached."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/d0;

    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/d0;-><init>(Lcom/facebook/react/runtime/e0;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    return-object v0
.end method

.method i()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostImpl;->k0()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    invoke-interface {v0}, Lc2/b;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method l()Lcom/facebook/react/runtime/ReactHostImpl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl;

    return-object v0
.end method

.method m()Lc2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    invoke-interface {v0}, Lc2/b;->getSurfaceId()I

    move-result v0

    return v0
.end method

.method o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    invoke-interface {v0}, Lc2/b;->isRunning()Z

    move-result v0

    return v0
.end method

.method declared-synchronized s(IIII)V
    .locals 8

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->c:Lc2/b;

    iget-object v1, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/facebook/react/runtime/e0;->g(Landroid/content/Context;)Z

    move-result v5

    iget-object v1, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/facebook/react/runtime/e0;->p(Landroid/content/Context;)Z

    move-result v6

    iget-object v1, p0, Lcom/facebook/react/runtime/e0;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/facebook/react/runtime/e0;->k(Landroid/content/Context;)F

    move-result v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v7}, Lc2/b;->e(IIIIZZF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public start()Lb2/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "Trying to call ReactSurface.start(), but view is not created."

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-static {v0}, Lu2/f;->l(Ljava/lang/Exception;)Lu2/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "Trying to call ReactSurface.start(), but no ReactHost is attached."

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/ReactHostImpl;->E1(Lcom/facebook/react/runtime/e0;)Lb2/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public stop()Lb2/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/e0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "Trying to call ReactSurface.stop(), but no ReactHost is attached."

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lu2/f;->l(Ljava/lang/Exception;)Lu2/f;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/ReactHostImpl;->G1(Lcom/facebook/react/runtime/e0;)Lb2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
