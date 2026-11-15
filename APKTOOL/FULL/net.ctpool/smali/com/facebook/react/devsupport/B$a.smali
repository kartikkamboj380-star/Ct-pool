.class Lcom/facebook/react/devsupport/B$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/a0;Ljava/lang/String;ZLX1/i;LX1/b;ILjava/util/Map;LS1/j;LX1/c;LX1/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/B;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/B;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$a;->a:Lcom/facebook/react/devsupport/B;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/devsupport/B;->h0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "jsproxy"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/devsupport/B$a;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {p1}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Ln2/a;->f(Z)V

    iget-object p1, p0, Lcom/facebook/react/devsupport/B$a;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {p1}, Lcom/facebook/react/devsupport/B;->b0(Lcom/facebook/react/devsupport/B;)Lcom/facebook/react/devsupport/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/devsupport/g;->x()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/B$a;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {p1}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object p1

    invoke-interface {p1, v0}, Ln2/a;->f(Z)V

    :goto_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/B$a;->a:Lcom/facebook/react/devsupport/B;

    invoke-interface {p1}, LX1/e;->q()V

    :cond_1
    return-void
.end method
