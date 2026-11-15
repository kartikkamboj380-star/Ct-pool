.class public Lcom/facebook/react/uimanager/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/Object;

.field protected final b:Lcom/facebook/react/uimanager/events/e;

.field protected final c:Lcom/facebook/react/bridge/ReactApplicationContext;

.field protected final d:Lcom/facebook/react/uimanager/b0;

.field private final e:Lcom/facebook/react/uimanager/G0;

.field private final f:Lcom/facebook/react/uimanager/p0;

.field private final g:Lcom/facebook/react/uimanager/D;

.field private final h:[I

.field private i:J

.field private volatile j:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/events/e;I)V
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/p0;

    new-instance v1, Lcom/facebook/react/uimanager/C;

    invoke-direct {v1, p2}, Lcom/facebook/react/uimanager/C;-><init>(Lcom/facebook/react/uimanager/G0;)V

    invoke-direct {v0, p1, v1, p4}, Lcom/facebook/react/uimanager/p0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/C;I)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/react/uimanager/j0;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/events/e;)V

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/uimanager/G0;Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/events/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    new-instance v0, Lcom/facebook/react/uimanager/b0;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/b0;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    const/4 v1, 0x4

    new-array v1, v1, [I

    iput-object v1, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/facebook/react/uimanager/j0;->i:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    iput-object p1, p0, Lcom/facebook/react/uimanager/j0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    iput-object p2, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    iput-object p3, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    new-instance p1, Lcom/facebook/react/uimanager/D;

    invoke-direct {p1, p3, v0}, Lcom/facebook/react/uimanager/D;-><init>(Lcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/b0;)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    iput-object p4, p0, Lcom/facebook/react/uimanager/j0;->b:Lcom/facebook/react/uimanager/events/e;

    return-void
.end method

.method private A(Lcom/facebook/react/uimanager/U;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->m()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->b()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/U;->a(I)Lcom/facebook/react/uimanager/U;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/j0;->A(Lcom/facebook/react/uimanager/U;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/U;->W(Lcom/facebook/react/uimanager/D;)V

    return-void
.end method

.method private L(Lcom/facebook/react/uimanager/U;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/D;->j(Lcom/facebook/react/uimanager/U;)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/b0;->g(I)V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/U;->a(I)Lcom/facebook/react/uimanager/U;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/j0;->L(Lcom/facebook/react/uimanager/U;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->q()V

    return-void
.end method

.method private c(Lcom/facebook/react/uimanager/U;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->N()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/G0;->c(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/ViewManager;

    instance-of v1, v0, Lcom/facebook/react/uimanager/r;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/facebook/react/uimanager/r;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/uimanager/r;->needsCustomLayoutForChildren()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it\'s children ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->N()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "). Use measure instead."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Lcom/facebook/react/uimanager/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to use view "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->N()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a parent, but its Manager doesn\'t extends ViewGroupManager"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(ILjava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to execute operation "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " on view with tag: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", since the view does not exist"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method private n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/facebook/react/uimanager/j0;->m(I)V

    :cond_0
    return-void
.end method

.method private y(II[I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v1, p2}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v1

    const-string v2, "Tag "

    if-eqz v0, :cond_3

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    if-eq v0, v1, :cond_2

    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->getParent()Lcom/facebook/react/uimanager/U;

    move-result-object v3

    :goto_0
    if-eq v3, v1, :cond_2

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/facebook/react/uimanager/U;->getParent()Lcom/facebook/react/uimanager/U;

    move-result-object v3

    goto :goto_0

    :cond_1
    new-instance p3, Lcom/facebook/react/uimanager/s;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is not an ancestor of tag "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_2
    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/react/uimanager/j0;->z(Lcom/facebook/react/uimanager/U;Lcom/facebook/react/uimanager/U;[I)V

    return-void

    :cond_3
    :goto_1
    new-instance p3, Lcom/facebook/react/uimanager/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move p1, p2

    :goto_2
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " does not exist"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw p3
.end method

.method private z(Lcom/facebook/react/uimanager/U;Lcom/facebook/react/uimanager/U;[I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    if-eq p1, p2, :cond_1

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->u()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->U()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->Q()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->getParent()Lcom/facebook/react/uimanager/U;

    move-result-object v3

    :goto_0
    if-eq v3, p2, :cond_0

    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v3}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/U;)V

    invoke-interface {v3}, Lcom/facebook/react/uimanager/U;->U()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-int/2addr v1, v4

    invoke-interface {v3}, Lcom/facebook/react/uimanager/U;->Q()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-int/2addr v2, v4

    invoke-interface {v3}, Lcom/facebook/react/uimanager/U;->getParent()Lcom/facebook/react/uimanager/U;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/j0;->c(Lcom/facebook/react/uimanager/U;)V

    goto :goto_1

    :cond_1
    move v1, v0

    move v2, v1

    :goto_1
    aput v1, p3, v0

    const/4 p2, 0x1

    aput v2, p3, p2

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->C()I

    move-result p2

    const/4 v0, 0x2

    aput p2, p3, v0

    const/4 p2, 0x3

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->d()I

    move-result p1

    aput p1, p3, p2

    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/G0;->f()V

    return-void
.end method

.method public C()V
    .locals 0

    .line 1
    return-void
.end method

.method public D()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->V()V

    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->Y()V

    return-void
.end method

.method public F(Lcom/facebook/react/uimanager/i0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->W(Lcom/facebook/react/uimanager/i0;)V

    return-void
.end method

.method public G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->X()V

    return-void
.end method

.method public H(Landroid/view/View;ILcom/facebook/react/uimanager/e0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/j0;->h()Lcom/facebook/react/uimanager/U;

    move-result-object v1

    invoke-interface {v1, p2}, Lcom/facebook/react/uimanager/U;->P(I)V

    invoke-interface {v1, p3}, Lcom/facebook/react/uimanager/U;->A(Lcom/facebook/react/uimanager/e0;)V

    new-instance v2, Lcom/facebook/react/uimanager/j0$a;

    invoke-direct {v2, p0, v1}, Lcom/facebook/react/uimanager/j0$a;-><init>(Lcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/U;)V

    invoke-virtual {p3, v2}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    iget-object p3, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {p3, p2, p1}, Lcom/facebook/react/uimanager/p0;->y(ILandroid/view/View;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public I(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/b0;->h(I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public J(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/j0;->I(I)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->J(I)V

    return-void
.end method

.method protected final K(Lcom/facebook/react/uimanager/U;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/j0;->L(Lcom/facebook/react/uimanager/U;)V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->c()V

    return-void
.end method

.method public M(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/react/uimanager/j0;->N(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->I()I

    move-result p1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Warning : attempted to resolve a non-existent react shadow node. reactTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ReactNative"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final N(I)Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object p1

    return-object p1
.end method

.method protected final O(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/G0;->e(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p1

    return-object p1
.end method

.method public P(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->K(II)V

    return-void
.end method

.method public Q(ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v2, v1}, Lcom/facebook/react/uimanager/U;->J(Lcom/facebook/react/uimanager/U;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/facebook/react/uimanager/s;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to add unknown view tag: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-virtual {v1, p1, p2}, Lcom/facebook/react/uimanager/D;->k(Lcom/facebook/react/uimanager/U;Lcom/facebook/react/bridge/ReadableArray;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public R(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->H()Lcom/facebook/react/uimanager/B;

    move-result-object v1

    sget-object v2, Lcom/facebook/react/uimanager/B;->o:Lcom/facebook/react/uimanager/B;

    if-ne v1, v2, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->getParent()Lcom/facebook/react/uimanager/U;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v0

    invoke-virtual {v1, v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->L(IIZ)V

    return-void
.end method

.method public S(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->M(Z)V

    return-void
.end method

.method public T(Lz2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->Z(Lz2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public U(ILjava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Attempt to set local data for view with unknown tag: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p2}, Lcom/facebook/react/uimanager/U;->F(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/j0;->n()V

    return-void
.end method

.method public V(ILcom/facebook/react/uimanager/W;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->S()Lcom/facebook/react/uimanager/C;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/C;->C(ILcom/facebook/react/uimanager/W;)V

    return-void
.end method

.method public W(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Tried to update size of non-existent tag: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    int-to-float p1, p2

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/U;->B(F)V

    int-to-float p1, p3

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/U;->g(F)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/j0;->n()V

    return-void
.end method

.method public X(III)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Tried to update non-existent root tag: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, v0, p2, p3}, Lcom/facebook/react/uimanager/j0;->Y(Lcom/facebook/react/uimanager/U;II)V

    return-void
.end method

.method public Y(Lcom/facebook/react/uimanager/U;II)V
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/uimanager/U;->h(II)V

    return-void
.end method

.method public Z(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/G0;->c(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    new-instance p1, Lcom/facebook/react/uimanager/W;

    invoke-direct {p1, p3}, Lcom/facebook/react/uimanager/W;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/U;->b0(Lcom/facebook/react/uimanager/W;)V

    invoke-virtual {p0, v0, p2, p1}, Lcom/facebook/react/uimanager/j0;->t(Lcom/facebook/react/uimanager/U;Ljava/lang/String;Lcom/facebook/react/uimanager/W;)V

    :cond_1
    return-void

    :cond_2
    new-instance p2, Lcom/facebook/react/uimanager/s;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Trying to update non-existent view with tag "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Lcom/facebook/react/uimanager/s;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Got unknown view type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/facebook/react/uimanager/i0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/p0;->N(Lcom/facebook/react/uimanager/i0;)V

    return-void
.end method

.method protected a0()V
    .locals 13

    .line 1
    const-string v0, "rootTag"

    const-string v1, "UIImplementation.updateViewHierarchy"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v1}, LP2/a;->c(JLjava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget-object v4, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v4}, Lcom/facebook/react/uimanager/b0;->d()I

    move-result v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v4, v1}, Lcom/facebook/react/uimanager/b0;->e(I)I

    move-result v4

    iget-object v5, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v5, v4}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v4

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->getWidthMeasureSpec()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->getHeightMeasureSpec()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    const-string v5, "UIImplementation.notifyOnBeforeLayoutRecursive"

    invoke-static {v2, v3, v5}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v5

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v6

    invoke-virtual {v5, v0, v6}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v5

    invoke-virtual {v5}, LP2/b$a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-direct {p0, v4}, Lcom/facebook/react/uimanager/j0;->A(Lcom/facebook/react/uimanager/U;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-static {v2, v3}, LP2/a;->g(J)V

    invoke-virtual {p0, v4}, Lcom/facebook/react/uimanager/j0;->d(Lcom/facebook/react/uimanager/U;)V

    const-string v5, "UIImplementation.applyUpdatesRecursive"

    invoke-static {v2, v3, v5}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v5

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v6

    invoke-virtual {v5, v0, v6}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v5

    invoke-virtual {v5}, LP2/b$a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {p0, v4, v6, v6, v5}, Lcom/facebook/react/uimanager/j0;->b(Lcom/facebook/react/uimanager/U;FFLjava/util/List;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/react/uimanager/U;

    iget-object v6, p0, Lcom/facebook/react/uimanager/j0;->b:Lcom/facebook/react/uimanager/events/e;

    invoke-interface {v5}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v8

    invoke-interface {v5}, Lcom/facebook/react/uimanager/U;->S()I

    move-result v9

    invoke-interface {v5}, Lcom/facebook/react/uimanager/U;->E()I

    move-result v10

    invoke-interface {v5}, Lcom/facebook/react/uimanager/U;->C()I

    move-result v11

    invoke-interface {v5}, Lcom/facebook/react/uimanager/U;->d()I

    move-result v12

    const/4 v7, -0x1

    invoke-static/range {v7 .. v12}, Lcom/facebook/react/uimanager/F;->c(IIIIII)Lcom/facebook/react/uimanager/F;

    move-result-object v5

    invoke-interface {v6, v5}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :try_start_4
    invoke-static {v2, v3}, LP2/a;->g(J)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :goto_2
    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw v0

    :catchall_2
    move-exception v0

    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_1
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    invoke-static {v2, v3}, LP2/a;->g(J)V

    return-void

    :goto_4
    invoke-static {v2, v3}, LP2/a;->g(J)V

    throw v0
.end method

.method protected b(Lcom/facebook/react/uimanager/U;FFLjava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->m()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p2, p3}, Lcom/facebook/react/uimanager/U;->K(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/b0;->f(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->o()Ljava/lang/Iterable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/U;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->U()F

    move-result v2

    add-float/2addr v2, p2

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->Q()F

    move-result v3

    add-float/2addr v3, p3

    invoke-virtual {p0, v1, v2, v3, p4}, Lcom/facebook/react/uimanager/j0;->b(Lcom/facebook/react/uimanager/U;FFLjava/util/List;)V

    goto :goto_0

    :cond_2
    iget-object p4, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-interface {p1, p2, p3, p4, v0}, Lcom/facebook/react/uimanager/U;->p(FFLcom/facebook/react/uimanager/p0;Lcom/facebook/react/uimanager/D;)V

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->e()V

    iget-object p2, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-virtual {p2, p1}, Lcom/facebook/react/uimanager/D;->p(Lcom/facebook/react/uimanager/U;)V

    return-void
.end method

.method public b0(IILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object p2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/U;->Y(Lcom/facebook/react/uimanager/U;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method protected d(Lcom/facebook/react/uimanager/U;)V
    .locals 8

    .line 1
    const-string v0, "cssRoot.calculateLayout"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v3

    const-string v4, "rootTag"

    invoke-virtual {v0, v4, v3}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    :try_start_0
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->getWidthMeasureSpec()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->getHeightMeasureSpec()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    const/high16 v7, 0x7fc00000    # Float.NaN

    if-nez v6, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    int-to-float v0, v0

    :goto_0
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    int-to-float v7, v5

    :goto_1
    invoke-interface {p1, v0, v7}, Lcom/facebook/react/uimanager/U;->R(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v3

    iput-wide v0, p0, Lcom/facebook/react/uimanager/j0;->i:J

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, LP2/a;->g(J)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v3

    iput-wide v0, p0, Lcom/facebook/react/uimanager/j0;->i:J

    throw p1
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->A()V

    return-void
.end method

.method public g(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->B(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method protected h()Lcom/facebook/react/uimanager/U;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/V;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/V;-><init>()V

    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/uimanager/j0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v1, v2}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/facebook/yoga/h;->p:Lcom/facebook/yoga/h;

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/U;->k(Lcom/facebook/yoga/h;)V

    :cond_0
    const-string v1, "Root"

    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/U;->j(Ljava/lang/String;)V

    return-object v0
.end method

.method protected i(Ljava/lang/String;)Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->e:Lcom/facebook/react/uimanager/G0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/G0;->c(Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->c:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/ViewManager;->createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/U;

    move-result-object p1

    return-object p1
.end method

.method public j(ILjava/lang/String;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p2}, Lcom/facebook/react/uimanager/j0;->i(Ljava/lang/String;)Lcom/facebook/react/uimanager/U;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v2, p3}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Root node with tag "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " doesn\'t exist"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LO1/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/U;->P(I)V

    invoke-interface {v1, p2}, Lcom/facebook/react/uimanager/U;->j(Ljava/lang/String;)V

    invoke-interface {v2}, Lcom/facebook/react/uimanager/U;->r()I

    move-result p1

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/U;->z(I)V

    invoke-interface {v2}, Lcom/facebook/react/uimanager/U;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/U;->A(Lcom/facebook/react/uimanager/e0;)V

    iget-object p1, p0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {p1, v1}, Lcom/facebook/react/uimanager/b0;->a(Lcom/facebook/react/uimanager/U;)V

    if-eqz p4, :cond_1

    new-instance p1, Lcom/facebook/react/uimanager/W;

    invoke-direct {p1, p4}, Lcom/facebook/react/uimanager/W;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/U;->b0(Lcom/facebook/react/uimanager/W;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v1, p3, p1}, Lcom/facebook/react/uimanager/j0;->s(Lcom/facebook/react/uimanager/U;ILcom/facebook/react/uimanager/W;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public k(IILcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dispatchViewManagerCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/j0;->e(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/p0;->D(IILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public l(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dispatchViewManagerCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/j0;->e(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/p0;->E(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public m(I)V
    .locals 9

    .line 1
    const-string v0, "UIImplementation.dispatchViewUpdates"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, LP2/b;->a(JLjava/lang/String;)LP2/b$a;

    move-result-object v0

    const-string v3, "batchId"

    invoke-virtual {v0, v3, p1}, LP2/b$a;->a(Ljava/lang/String;I)LP2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LP2/b$a;->c()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/j0;->a0()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/D;->o()V

    iget-object v3, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    iget-wide v7, p0, Lcom/facebook/react/uimanager/j0;->i:J

    move v4, p1

    invoke-virtual/range {v3 .. v8}, Lcom/facebook/react/uimanager/p0;->z(IJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, LP2/a;->g(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v1, v2}, LP2/a;->g(J)V

    throw p1
.end method

.method public o(IFFLcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/uimanager/p0;->F(IFFLcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public p()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->T()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/p0;->S()Lcom/facebook/react/uimanager/C;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/C;->p()I

    move-result v0

    return v0
.end method

.method r()Lcom/facebook/react/uimanager/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    return-object v0
.end method

.method protected s(Lcom/facebook/react/uimanager/U;ILcom/facebook/react/uimanager/W;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->u()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->G()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lcom/facebook/react/uimanager/D;->g(Lcom/facebook/react/uimanager/U;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/uimanager/W;)V

    :cond_0
    return-void
.end method

.method protected t(Lcom/facebook/react/uimanager/U;Ljava/lang/String;Lcom/facebook/react/uimanager/W;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/facebook/react/uimanager/U;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/uimanager/D;->m(Lcom/facebook/react/uimanager/U;Ljava/lang/String;Lcom/facebook/react/uimanager/W;)V

    :cond_0
    return-void
.end method

.method public u(ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    iget-boolean v7, v1, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v7, :cond_0

    return-void

    :cond_0
    iget-object v7, v1, Lcom/facebook/react/uimanager/j0;->a:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    iget-object v8, v1, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    invoke-virtual {v8, v0}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v8

    if-nez v2, :cond_1

    const/4 v10, 0x0

    goto :goto_0

    :cond_1
    invoke-interface/range {p2 .. p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v10

    :goto_0
    if-nez v4, :cond_2

    const/4 v11, 0x0

    goto :goto_1

    :cond_2
    invoke-interface/range {p4 .. p4}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v11

    :goto_1
    if-nez v6, :cond_3

    const/4 v12, 0x0

    goto :goto_2

    :cond_3
    invoke-interface/range {p6 .. p6}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v12

    :goto_2
    if-eqz v10, :cond_5

    if-eqz v3, :cond_4

    invoke-interface/range {p3 .. p3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v13

    if-ne v10, v13, :cond_4

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_4
    new-instance v0, Lcom/facebook/react/uimanager/s;

    const-string v2, "Size of moveFrom != size of moveTo!"

    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    if-eqz v11, :cond_7

    if-eqz v5, :cond_6

    invoke-interface/range {p5 .. p5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v13

    if-ne v11, v13, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/facebook/react/uimanager/s;

    const-string v2, "Size of addChildTags != size of addAtIndices!"

    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    add-int v13, v10, v11

    new-array v14, v13, [Lcom/facebook/react/uimanager/y0;

    add-int v15, v10, v12

    new-array v9, v15, [I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-array v1, v15, [I

    move/from16 v16, v13

    new-array v13, v12, [I

    if-lez v10, :cond_8

    invoke-static/range {p2 .. p2}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v10, :cond_8

    move/from16 v17, v15

    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v15

    invoke-interface {v8, v15}, Lcom/facebook/react/uimanager/U;->a(I)Lcom/facebook/react/uimanager/U;

    move-result-object v18

    invoke-interface/range {v18 .. v18}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v2

    move-object/from16 v18, v13

    new-instance v13, Lcom/facebook/react/uimanager/y0;

    move-object/from16 v19, v8

    invoke-interface {v3, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v8

    invoke-direct {v13, v2, v8}, Lcom/facebook/react/uimanager/y0;-><init>(II)V

    aput-object v13, v14, v0

    aput v15, v9, v0

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v2, p2

    move/from16 v15, v17

    move-object/from16 v13, v18

    move-object/from16 v8, v19

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_b

    :cond_8
    move-object/from16 v19, v8

    move-object/from16 v18, v13

    move/from16 v17, v15

    if-lez v11, :cond_9

    invoke-static/range {p4 .. p4}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_6
    if-ge v0, v11, :cond_9

    invoke-interface {v4, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    invoke-interface {v5, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    add-int v8, v10, v0

    new-instance v13, Lcom/facebook/react/uimanager/y0;

    invoke-direct {v13, v2, v3}, Lcom/facebook/react/uimanager/y0;-><init>(II)V

    aput-object v13, v14, v8

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    if-lez v12, :cond_a

    invoke-static/range {p6 .. p6}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_7
    if-ge v0, v12, :cond_a

    invoke-interface {v6, v0}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v2

    move-object/from16 v3, v19

    invoke-interface {v3, v2}, Lcom/facebook/react/uimanager/U;->a(I)Lcom/facebook/react/uimanager/U;

    move-result-object v4

    invoke-interface {v4}, Lcom/facebook/react/uimanager/U;->r()I

    move-result v4

    add-int v5, v10, v0

    aput v2, v9, v5

    aput v4, v1, v5

    aput v4, v18, v0

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v19, v3

    goto :goto_7

    :cond_a
    move-object/from16 v3, v19

    sget-object v0, Lcom/facebook/react/uimanager/y0;->c:Ljava/util/Comparator;

    invoke-static {v14, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {v9}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v15, v17, -0x1

    const/4 v0, -0x1

    :goto_8
    if-ltz v15, :cond_c

    aget v2, v9, v15

    if-eq v2, v0, :cond_b

    invoke-interface {v3, v2}, Lcom/facebook/react/uimanager/U;->f(I)Lcom/facebook/react/uimanager/U;

    aget v0, v9, v15

    add-int/lit8 v15, v15, -0x1

    goto :goto_8

    :cond_b
    new-instance v0, Lcom/facebook/react/uimanager/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Repeated indices in Removal list for view tag: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    move/from16 v10, v16

    const/4 v0, 0x0

    :goto_9
    if-ge v0, v10, :cond_e

    aget-object v2, v14, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, v1

    move-object/from16 v1, p0

    :try_start_2
    iget-object v5, v1, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    iget v6, v2, Lcom/facebook/react/uimanager/y0;->a:I

    invoke-virtual {v5, v6}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v5

    if-eqz v5, :cond_d

    iget v2, v2, Lcom/facebook/react/uimanager/y0;->b:I

    invoke-interface {v3, v5, v2}, Lcom/facebook/react/uimanager/U;->J(Lcom/facebook/react/uimanager/U;I)V

    add-int/lit8 v0, v0, 0x1

    move-object v1, v4

    goto :goto_9

    :cond_d
    new-instance v0, Lcom/facebook/react/uimanager/s;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trying to add unknown view tag: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v2, Lcom/facebook/react/uimanager/y0;->a:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/react/uimanager/s;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object v4, v1

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/facebook/react/uimanager/j0;->g:Lcom/facebook/react/uimanager/D;

    move-object/from16 p1, v0

    move-object/from16 p2, v3

    move-object/from16 p3, v9

    move-object/from16 p4, v4

    move-object/from16 p5, v14

    move-object/from16 p6, v18

    invoke-virtual/range {p1 .. p6}, Lcom/facebook/react/uimanager/D;->i(Lcom/facebook/react/uimanager/U;[I[I[Lcom/facebook/react/uimanager/y0;[I)V

    const/4 v9, 0x0

    :goto_a
    if-ge v9, v12, :cond_f

    iget-object v0, v1, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    aget v2, v18, v9

    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/b0;->c(I)Lcom/facebook/react/uimanager/U;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/react/uimanager/j0;->K(Lcom/facebook/react/uimanager/U;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_f
    monitor-exit v7

    return-void

    :goto_b
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public v(ILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->H(ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public w(ILcom/facebook/react/bridge/Callback;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->f:Lcom/facebook/react/uimanager/p0;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/p0;->I(ILcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public x(IILcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/j0;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/uimanager/j0;->y(II[I)V

    iget-object p1, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    const/4 p2, 0x0

    aget p1, p1, p2

    int-to-float p1, p1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    const/4 v0, 0x1

    aget p2, p2, v0

    int-to-float p2, p2

    invoke-static {p2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p2

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    int-to-float v0, v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/j0;->h:[I

    const/4 v2, 0x3

    aget v1, v1, v2

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {p1, p2, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/facebook/react/uimanager/s; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
