.class Lcom/facebook/imagepipeline/producers/n0$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/n0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/imagepipeline/producers/n0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/n;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/n0$a;->c:Lcom/facebook/imagepipeline/producers/n0;

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    return-void
.end method


# virtual methods
.method protected i(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    :cond_0
    return-void
.end method
