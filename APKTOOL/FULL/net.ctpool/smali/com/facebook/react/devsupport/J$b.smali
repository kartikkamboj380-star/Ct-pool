.class final Lcom/facebook/react/devsupport/J$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private m:Z

.field private n:I

.field private o:I

.field final synthetic p:Lcom/facebook/react/devsupport/J;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/J;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/J$b;->m:Z

    iget-object v0, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/devsupport/J$b;->m:Z

    return-void
.end method

.method public run()V
    .locals 8

    iget-boolean v0, p0, Lcom/facebook/react/devsupport/J$b;->m:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/facebook/react/devsupport/J$b;->n:I

    iget-object v1, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v1}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/f;->d()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v2}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/react/modules/debug/f;->g()I

    move-result v2

    sub-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/react/devsupport/J$b;->n:I

    iget v0, p0, Lcom/facebook/react/devsupport/J$b;->o:I

    iget-object v1, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v1}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/modules/debug/f;->c()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/react/devsupport/J$b;->o:I

    iget-object v1, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v1}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/f;->e()D

    move-result-wide v2

    iget-object v0, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v0}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/f;->f()D

    move-result-wide v4

    iget v6, p0, Lcom/facebook/react/devsupport/J$b;->n:I

    iget v7, p0, Lcom/facebook/react/devsupport/J$b;->o:I

    invoke-static/range {v1 .. v7}, Lcom/facebook/react/devsupport/J;->b(Lcom/facebook/react/devsupport/J;DDII)V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    invoke-static {v0}, Lcom/facebook/react/devsupport/J;->a(Lcom/facebook/react/devsupport/J;)Lcom/facebook/react/modules/debug/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/modules/debug/f;->j()V

    iget-object v0, p0, Lcom/facebook/react/devsupport/J$b;->p:Lcom/facebook/react/devsupport/J;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
