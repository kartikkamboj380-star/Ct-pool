.class public abstract Lcom/facebook/react/fabric/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field private final a:Lcom/facebook/react/bridge/JSExceptionHandler;


# direct methods
.method protected constructor <init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 1

    .line 1
    const-string v0, "exceptionHandler"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/fabric/i;->a:Lcom/facebook/react/bridge/JSExceptionHandler;

    return-void
.end method

.method protected constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;

    move-result-object p1

    const-string v0, "getExceptionHandler(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/i;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    return-void
.end method


# virtual methods
.method protected abstract a(J)V
.end method

.method public doFrame(J)V
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/fabric/i;->a(J)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/facebook/react/fabric/i;->a:Lcom/facebook/react/bridge/JSExceptionHandler;

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
