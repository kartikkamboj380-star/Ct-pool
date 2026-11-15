.class Lcom/facebook/imagepipeline/producers/k0$a$b;
.super Lcom/facebook/imagepipeline/producers/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/k0$a;-><init>(Lcom/facebook/imagepipeline/producers/k0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZLL1/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/k0;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/n;

.field final synthetic c:Lcom/facebook/imagepipeline/producers/k0$a;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/k0$a;Lcom/facebook/imagepipeline/producers/k0;Lcom/facebook/imagepipeline/producers/n;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->c:Lcom/facebook/imagepipeline/producers/k0$a;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->a:Lcom/facebook/imagepipeline/producers/k0;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->b:Lcom/facebook/imagepipeline/producers/n;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->c:Lcom/facebook/imagepipeline/producers/k0$a;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/k0$a;->s(Lcom/facebook/imagepipeline/producers/k0$a;)Lcom/facebook/imagepipeline/producers/G;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/G;->c()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->c:Lcom/facebook/imagepipeline/producers/k0$a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/producers/k0$a;->u(Lcom/facebook/imagepipeline/producers/k0$a;Z)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->b:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/n;->b()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->c:Lcom/facebook/imagepipeline/producers/k0$a;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/k0$a;->t(Lcom/facebook/imagepipeline/producers/k0$a;)Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$b;->c:Lcom/facebook/imagepipeline/producers/k0$a;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/k0$a;->s(Lcom/facebook/imagepipeline/producers/k0$a;)Lcom/facebook/imagepipeline/producers/G;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/G;->h()Z

    :cond_0
    return-void
.end method
