.class Lcom/facebook/react/H$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H;->F()Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H;


# direct methods
.method constructor <init>(Lcom/facebook/react/H;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/H$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/H$e;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    move-result-object v0

    invoke-interface {v0}, LX1/e;->q()V

    return-void
.end method


# virtual methods
.method public onReload()V
    .locals 1

    new-instance v0, Lcom/facebook/react/J;

    invoke-direct {v0, p0}, Lcom/facebook/react/J;-><init>(Lcom/facebook/react/H$e;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onSetPausedInDebuggerMessage(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-static {p1}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    move-result-object p1

    invoke-interface {p1}, LX1/e;->g()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->i(Lcom/facebook/react/H;)LX1/e;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/H$e$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/H$e$a;-><init>(Lcom/facebook/react/H$e;)V

    invoke-interface {v0, p1, v1}, LX1/e;->i(Ljava/lang/String;LX1/e$a;)V

    :goto_0
    return-void
.end method
