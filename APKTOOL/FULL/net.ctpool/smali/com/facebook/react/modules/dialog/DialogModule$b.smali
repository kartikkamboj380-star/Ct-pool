.class Lcom/facebook/react/modules/dialog/DialogModule$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/dialog/DialogModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final m:Lcom/facebook/react/bridge/Callback;

.field private n:Z

.field final synthetic o:Lcom/facebook/react/modules/dialog/DialogModule;


# direct methods
.method public constructor <init>(Lcom/facebook/react/modules/dialog/DialogModule;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->o:Lcom/facebook/react/modules/dialog/DialogModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->n:Z

    iput-object p2, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->m:Lcom/facebook/react/bridge/Callback;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-boolean p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->n:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->o:Lcom/facebook/react/modules/dialog/DialogModule;

    invoke-static {p1}, Lcom/facebook/react/modules/dialog/DialogModule;->access$000(Lcom/facebook/react/modules/dialog/DialogModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->m:Lcom/facebook/react/bridge/Callback;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "buttonClicked"

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->n:Z

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-boolean p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->n:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->o:Lcom/facebook/react/modules/dialog/DialogModule;

    invoke-static {p1}, Lcom/facebook/react/modules/dialog/DialogModule;->access$100(Lcom/facebook/react/modules/dialog/DialogModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->m:Lcom/facebook/react/bridge/Callback;

    const-string v0, "dismissed"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$b;->n:Z

    :cond_0
    return-void
.end method
