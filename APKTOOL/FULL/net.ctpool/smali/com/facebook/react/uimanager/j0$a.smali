.class Lcom/facebook/react/uimanager/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/j0;->H(Landroid/view/View;ILcom/facebook/react/uimanager/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/uimanager/U;

.field final synthetic n:Lcom/facebook/react/uimanager/j0;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/j0;Lcom/facebook/react/uimanager/U;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/j0$a;->n:Lcom/facebook/react/uimanager/j0;

    iput-object p2, p0, Lcom/facebook/react/uimanager/j0$a;->m:Lcom/facebook/react/uimanager/U;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/uimanager/j0$a;->n:Lcom/facebook/react/uimanager/j0;

    iget-object v0, v0, Lcom/facebook/react/uimanager/j0;->d:Lcom/facebook/react/uimanager/b0;

    iget-object v1, p0, Lcom/facebook/react/uimanager/j0$a;->m:Lcom/facebook/react/uimanager/U;

    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/b0;->b(Lcom/facebook/react/uimanager/U;)V

    return-void
.end method
