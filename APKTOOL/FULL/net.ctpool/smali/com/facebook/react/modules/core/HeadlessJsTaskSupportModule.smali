.class public Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;
.super Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;
.source "SourceFile"


# annotations
.annotation runtime Li2/a;
    name = "HeadlessJsTaskSupport"
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method


# virtual methods
.method public notifyTaskFinished(D)V
    .locals 1

    double-to-int p1, p1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p2

    invoke-static {p2}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lh2/c;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lh2/c;->e(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-class p2, Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;

    const-string v0, "Tried to finish non-active task with id %d. Did it time out?"

    invoke-static {p2, v0, p1}, LP0/a;->E(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public notifyTaskRetry(DLcom/facebook/react/bridge/Promise;)V
    .locals 1

    double-to-int p1, p1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p2

    invoke-static {p2}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lh2/c;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Lh2/c;->l(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_0
    invoke-interface {p3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-class p2, Lcom/facebook/react/modules/core/HeadlessJsTaskSupportModule;

    const-string v0, "Tried to retry non-active task with id %d. Did it time out?"

    invoke-static {p2, v0, p1}, LP0/a;->E(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :goto_1
    return-void
.end method
