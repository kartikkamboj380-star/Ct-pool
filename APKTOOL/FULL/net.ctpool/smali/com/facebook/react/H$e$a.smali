.class Lcom/facebook/react/H$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/H$e;->onSetPausedInDebuggerMessage(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/H$e;


# direct methods
.method constructor <init>(Lcom/facebook/react/H$e;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/H$e$a;->a:Lcom/facebook/react/H$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/H$e$a;->a:Lcom/facebook/react/H$e;

    iget-object v0, v0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->j(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/H$e$a;->a:Lcom/facebook/react/H$e;

    iget-object v0, v0, Lcom/facebook/react/H$e;->a:Lcom/facebook/react/H;

    invoke-static {v0}, Lcom/facebook/react/H;->j(Lcom/facebook/react/H;)Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;->sendDebuggerResumeCommand()V

    :cond_0
    return-void
.end method
