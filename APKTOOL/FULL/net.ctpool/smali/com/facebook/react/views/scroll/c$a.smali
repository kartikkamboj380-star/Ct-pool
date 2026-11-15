.class Lcom/facebook/react/views/scroll/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/c;->v(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private m:Z

.field private n:I

.field final synthetic o:Lcom/facebook/react/views/scroll/c;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/scroll/c;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c$a;->m:Z

    iput p1, p0, Lcom/facebook/react/views/scroll/c$a;->n:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/c;->d(Lcom/facebook/react/views/scroll/c;)Z

    move-result v0

    const-wide/16 v1, 0x14

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/c;->g(Lcom/facebook/react/views/scroll/c;Z)V

    iput v3, p0, Lcom/facebook/react/views/scroll/c$a;->n:I

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0, p0, v1, v2}, Landroidx/core/view/H;->i0(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    iget v0, p0, Lcom/facebook/react/views/scroll/c$a;->n:I

    const/4 v4, 0x1

    add-int/2addr v0, v4

    iput v0, p0, Lcom/facebook/react/views/scroll/c$a;->n:I

    const/4 v5, 0x3

    if-lt v0, v5, :cond_3

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/views/scroll/c;->h(Lcom/facebook/react/views/scroll/c;Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/c;->f(Lcom/facebook/react/views/scroll/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/f;->h(Landroid/view/ViewGroup;)V

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/c;->i(Lcom/facebook/react/views/scroll/c;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0}, Lcom/facebook/react/views/scroll/c;->e(Lcom/facebook/react/views/scroll/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c$a;->m:Z

    if-nez v0, :cond_0

    iput-boolean v4, p0, Lcom/facebook/react/views/scroll/c$a;->m:Z

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c$a;->o:Lcom/facebook/react/views/scroll/c;

    invoke-static {v0, v3}, Lcom/facebook/react/views/scroll/c;->j(Lcom/facebook/react/views/scroll/c;I)V

    goto :goto_0

    :goto_1
    return-void
.end method
