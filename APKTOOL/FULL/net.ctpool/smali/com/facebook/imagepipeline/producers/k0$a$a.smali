.class Lcom/facebook/imagepipeline/producers/k0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/G$d;


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

.field final synthetic b:Lcom/facebook/imagepipeline/producers/k0$a;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/k0$a;Lcom/facebook/imagepipeline/producers/k0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a$a;->b:Lcom/facebook/imagepipeline/producers/k0$a;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/k0$a$a;->a:Lcom/facebook/imagepipeline/producers/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LD1/g;I)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k0$a$a;->b:Lcom/facebook/imagepipeline/producers/k0$a;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/k0$a;->q(Lcom/facebook/imagepipeline/producers/k0$a;)LL1/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/k0$a$a;->b:Lcom/facebook/imagepipeline/producers/k0$a;

    .line 14
    .line 15
    invoke-static {v3}, Lcom/facebook/imagepipeline/producers/k0$a;->r(Lcom/facebook/imagepipeline/producers/k0$a;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-interface {v1, v2, v3}, LL1/d;->createImageTranscoder(Ls1/c;Z)LL1/c;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, LL1/c;

    .line 28
    .line 29
    invoke-static {v0, p1, p2, v1}, Lcom/facebook/imagepipeline/producers/k0$a;->v(Lcom/facebook/imagepipeline/producers/k0$a;LD1/g;ILL1/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/k0$a$a;->b:Lcom/facebook/imagepipeline/producers/k0$a;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-void
.end method
