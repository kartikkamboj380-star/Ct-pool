.class public Lcom/reactnativegooglesignin/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/facebook/react/bridge/Promise;

.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativegooglesignin/c;->c:Ljava/lang/String;

    return-void
.end method

.method private e(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Warning: previous promise did not settle and was overwritten. You\'ve called \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" while \""

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/reactnativegooglesignin/c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" was already in progress and has not completed yet."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ASYNC_OP_IN_PROGRESS"

    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private f()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/reactnativegooglesignin/c;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    iget-object v1, p0, Lcom/reactnativegooglesignin/c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/reactnativegooglesignin/c;->c:Ljava/lang/String;

    const-string v0, "cannot reject promise because it\'s null"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    new-instance v2, Lcom/reactnativegooglesignin/a;

    invoke-direct {v2, p1, v1}, Lcom/reactnativegooglesignin/a;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/reactnativegooglesignin/c;->f()V

    invoke-virtual {v2}, Lcom/reactnativegooglesignin/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/reactnativegooglesignin/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lcom/reactnativegooglesignin/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/reactnativegooglesignin/c;->c:Ljava/lang/String;

    const-string p2, "cannot reject promise because it\'s null"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/reactnativegooglesignin/c;->f()V

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/reactnativegooglesignin/c;->c:Ljava/lang/String;

    const-string v0, "cannot resolve promise because it\'s null"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/reactnativegooglesignin/c;->f()V

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    return-void
.end method

.method public h(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, p2}, Lcom/reactnativegooglesignin/c;->e(Lcom/facebook/react/bridge/Promise;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, Lcom/reactnativegooglesignin/c;->a:Lcom/facebook/react/bridge/Promise;

    iput-object p2, p0, Lcom/reactnativegooglesignin/c;->b:Ljava/lang/String;

    return-void
.end method
