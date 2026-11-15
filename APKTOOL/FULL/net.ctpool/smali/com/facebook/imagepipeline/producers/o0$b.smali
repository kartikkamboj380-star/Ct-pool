.class public final Lcom/facebook/imagepipeline/producers/o0$b;
.super Lcom/facebook/imagepipeline/producers/f;
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
.field final synthetic a:Lcom/facebook/imagepipeline/producers/m0;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/o0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/m0;Lcom/facebook/imagepipeline/producers/o0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/o0$b;->a:Lcom/facebook/imagepipeline/producers/m0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/o0$b;->b:Lcom/facebook/imagepipeline/producers/o0;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$b;->a:Lcom/facebook/imagepipeline/producers/m0;

    invoke-virtual {v0}, LM0/e;->a()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0$b;->b:Lcom/facebook/imagepipeline/producers/o0;

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/o0;->d()Lcom/facebook/imagepipeline/producers/p0;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/o0$b;->a:Lcom/facebook/imagepipeline/producers/m0;

    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/p0;->a(Ljava/lang/Runnable;)V

    return-void
.end method
