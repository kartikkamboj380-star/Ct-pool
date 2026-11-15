.class public abstract Lcom/facebook/react/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Application;

.field private b:Lcom/facebook/react/H;


# direct methods
.method protected constructor <init>(Landroid/app/Application;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/L;->a:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method protected a()Lcom/facebook/react/H;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_REACT_INSTANCE_MANAGER_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-virtual {p0}, Lcom/facebook/react/L;->b()Lcom/facebook/react/K;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/bridge/ReactMarkerConstants;->BUILD_REACT_INSTANCE_MANAGER_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-virtual {v0}, Lcom/facebook/react/K;->b()Lcom/facebook/react/H;

    move-result-object v0

    return-object v0
.end method

.method protected b()Lcom/facebook/react/K;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/H;->t()Lcom/facebook/react/K;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/L;->a:Landroid/app/Application;

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->d(Landroid/app/Application;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->n(Ljava/lang/String;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->w(Z)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->f()Lcom/facebook/react/devsupport/F;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->h(Lcom/facebook/react/devsupport/F;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->e()LX1/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->g(LX1/c;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->r()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->t(Z)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->s()LS1/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->u(LS1/j;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->i()Lcom/facebook/react/bridge/JSExceptionHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->m(Lcom/facebook/react/bridge/JSExceptionHandler;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->p(Z)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->q()LX1/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->s(LX1/i;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->k()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->o(Lcom/facebook/react/bridge/JavaScriptExecutorFactory;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->t()Lcom/facebook/react/bridge/UIManagerProvider;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->v(Lcom/facebook/react/bridge/UIManagerProvider;)Lcom/facebook/react/K;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->i(Lcom/facebook/react/common/LifecycleState;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->p()Lcom/facebook/react/T$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->r(Lcom/facebook/react/T$a;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->h()Lcom/facebook/react/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->l(Lcom/facebook/react/i;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->d()Ld2/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->f(Ld2/b;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->n()LX1/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->q(LX1/h;)Lcom/facebook/react/K;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/L;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/M;

    invoke-virtual {v0, v2}, Lcom/facebook/react/K;->a(Lcom/facebook/react/M;)Lcom/facebook/react/K;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/L;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->j(Ljava/lang/String;)Lcom/facebook/react/K;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/L;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/react/K;->e(Ljava/lang/String;)Lcom/facebook/react/K;

    :goto_1
    return-object v0
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "index.android.bundle"

    return-object v0
.end method

.method protected d()Ld2/b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected e()LX1/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method protected f()Lcom/facebook/react/devsupport/F;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected g()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract h()Lcom/facebook/react/i;
.end method

.method protected i()Lcom/facebook/react/bridge/JSExceptionHandler;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract j()Ljava/lang/String;
.end method

.method protected k()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract m()Ljava/util/List;
.end method

.method protected n()LX1/h;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public o()Lcom/facebook/react/H;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/L;->b:Lcom/facebook/react/H;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->INIT_REACT_RUNTIME_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_REACT_INSTANCE_MANAGER_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    invoke-virtual {p0}, Lcom/facebook/react/L;->a()Lcom/facebook/react/H;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/L;->b:Lcom/facebook/react/H;

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->GET_REACT_INSTANCE_MANAGER_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/L;->b:Lcom/facebook/react/H;

    return-object v0
.end method

.method protected abstract p()Lcom/facebook/react/T$a;
.end method

.method protected q()LX1/i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public r()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public s()LS1/j;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/L$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/L$a;-><init>(Lcom/facebook/react/L;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected abstract t()Lcom/facebook/react/bridge/UIManagerProvider;
.end method

.method public abstract u()Z
.end method

.method public v()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/L;->b:Lcom/facebook/react/H;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
