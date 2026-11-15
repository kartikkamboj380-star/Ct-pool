.class Lcom/facebook/react/runtime/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/facebook/react/common/LifecycleState;

.field private final b:Lcom/facebook/react/runtime/d;


# direct methods
.method constructor <init>(Lcom/facebook/react/runtime/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    iput-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    iput-object p1, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/react/common/LifecycleState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    return-object v0
.end method

.method public b(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    const-string v2, "ReactContext.onHostDestroy()"

    if-ne v0, v1, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    invoke-virtual {v0, v2}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostDestroy()V

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    const-string v1, "ReactContext.onHostPause()"

    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    goto :goto_0

    :cond_1
    :goto_1
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    iput-object p1, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    return-void
.end method

.method public c(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    const-string v2, "ReactContext.onHostPause()"

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    const-string v1, "ReactContext.onHostResume()"

    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    :goto_0
    iget-object p2, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    invoke-virtual {p2, v2}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    goto :goto_1

    :cond_0
    sget-object p2, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object p1, Lcom/facebook/react/common/LifecycleState;->n:Lcom/facebook/react/common/LifecycleState;

    iput-object p1, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    return-void
.end method

.method public d(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    const-string v2, "ReactContext.onHostResume()"

    invoke-virtual {v0, v2}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    :cond_1
    iput-object v1, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    return-void
.end method

.method public e(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->a:Lcom/facebook/react/common/LifecycleState;

    sget-object v1, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/c0;->b:Lcom/facebook/react/runtime/d;

    const-string v1, "ReactContext.onHostResume()"

    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->onHostResume(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method
