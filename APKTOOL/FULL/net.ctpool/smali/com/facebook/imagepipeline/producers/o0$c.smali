.class public final Lcom/facebook/imagepipeline/producers/o0$c;
.super Lcom/facebook/imagepipeline/producers/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/o0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic r:Lcom/facebook/imagepipeline/producers/n;

.field final synthetic s:Lcom/facebook/imagepipeline/producers/g0;

.field final synthetic t:Lcom/facebook/imagepipeline/producers/e0;

.field final synthetic u:Lcom/facebook/imagepipeline/producers/o0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/o0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->r:Lcom/facebook/imagepipeline/producers/n;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/o0$c;->s:Lcom/facebook/imagepipeline/producers/g0;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/o0$c;->t:Lcom/facebook/imagepipeline/producers/e0;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/o0$c;->u:Lcom/facebook/imagepipeline/producers/o0;

    const-string p4, "BackgroundThreadHandoffProducer"

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/m0;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method protected c()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected f(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->s:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$c;->t:Lcom/facebook/imagepipeline/producers/e0;

    const-string v1, "BackgroundThreadHandoffProducer"

    const/4 v2, 0x0

    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->u:Lcom/facebook/imagepipeline/producers/o0;

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/o0;->c()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$c;->r:Lcom/facebook/imagepipeline/producers/n;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$c;->t:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
