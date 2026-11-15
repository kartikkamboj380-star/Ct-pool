.class Lcom/facebook/react/uimanager/G0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/G0;->onTrimMemory(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/util/List;

.field final synthetic n:Lcom/facebook/react/uimanager/G0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/G0;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/G0$a;->n:Lcom/facebook/react/uimanager/G0;

    iput-object p2, p0, Lcom/facebook/react/uimanager/G0$a;->m:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/G0$a;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/ViewManager;

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/ViewManager;->trimMemory()V

    goto :goto_0

    :cond_0
    return-void
.end method
