.class Lcom/facebook/react/devsupport/B$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/B;->C()V
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

    iput-object p1, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object v0

    invoke-interface {v0}, Ln2/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object v0

    invoke-interface {v0}, Ln2/a;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->X(Lcom/facebook/react/devsupport/B;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v1}, Lcom/facebook/react/devsupport/B;->X(Lcom/facebook/react/devsupport/B;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/react/q;->h:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-static {v0}, Lcom/facebook/react/devsupport/B;->c0(Lcom/facebook/react/devsupport/B;)Ln2/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ln2/a;->b(Z)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/B$b;->a:Lcom/facebook/react/devsupport/B;

    invoke-interface {v0}, LX1/e;->q()V

    return-void
.end method
