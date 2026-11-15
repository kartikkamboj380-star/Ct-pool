.class public abstract Lcom/facebook/imagepipeline/producers/t;
.super Lcom/facebook/imagepipeline/producers/c;
.source "SourceFile"


# instance fields
.field private final b:Lcom/facebook/imagepipeline/producers/n;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;)V
    .locals 1

    const-string v0, "consumer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/c;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/t;->b:Lcom/facebook/imagepipeline/producers/n;

    return-void
.end method


# virtual methods
.method protected g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t;->b:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/n;->b()V

    return-void
.end method

.method protected h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "t"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t;->b:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected j(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t;->b:Lcom/facebook/imagepipeline/producers/n;

    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    return-void
.end method

.method public final p()Lcom/facebook/imagepipeline/producers/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t;->b:Lcom/facebook/imagepipeline/producers/n;

    return-object v0
.end method
