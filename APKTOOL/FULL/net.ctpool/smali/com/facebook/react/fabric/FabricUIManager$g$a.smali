.class Lcom/facebook/react/fabric/FabricUIManager$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/fabric/FabricUIManager$g;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/fabric/FabricUIManager$g;


# direct methods
.method constructor <init>(Lcom/facebook/react/fabric/FabricUIManager$g;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    iget-object v0, v0, Lcom/facebook/react/fabric/FabricUIManager$g;->a:Lcom/facebook/react/fabric/FabricUIManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/fabric/FabricUIManager;->k(Lcom/facebook/react/fabric/FabricUIManager;Z)V

    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    iget-object v0, v0, Lcom/facebook/react/fabric/FabricUIManager$g;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->b(Lcom/facebook/react/fabric/FabricUIManager;)Lcom/facebook/react/fabric/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    iget-object v1, v1, Lcom/facebook/react/fabric/FabricUIManager$g;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v1}, Lcom/facebook/react/fabric/FabricUIManager;->c(Lcom/facebook/react/fabric/FabricUIManager;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    iget-object v1, v1, Lcom/facebook/react/fabric/FabricUIManager$g;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v1}, Lcom/facebook/react/fabric/FabricUIManager;->i(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v0, v2}, Lcom/facebook/react/fabric/a;->reportMount(I)V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/react/fabric/FabricUIManager$g$a;->m:Lcom/facebook/react/fabric/FabricUIManager$g;

    iget-object v0, v0, Lcom/facebook/react/fabric/FabricUIManager$g;->a:Lcom/facebook/react/fabric/FabricUIManager;

    invoke-static {v0}, Lcom/facebook/react/fabric/FabricUIManager;->i(Lcom/facebook/react/fabric/FabricUIManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
