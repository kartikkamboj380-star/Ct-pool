.class Lcom/facebook/imagepipeline/producers/D$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/D;->i(Lcom/facebook/imagepipeline/producers/D$c;Lcom/facebook/imagepipeline/producers/X$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/imagepipeline/producers/D$c;

.field final synthetic n:Lcom/facebook/imagepipeline/producers/X$a;

.field final synthetic o:Lcom/facebook/imagepipeline/producers/D;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/D;Lcom/facebook/imagepipeline/producers/D$c;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/D$a;->o:Lcom/facebook/imagepipeline/producers/D;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/D$a;->m:Lcom/facebook/imagepipeline/producers/D$c;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/D$a;->n:Lcom/facebook/imagepipeline/producers/X$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/D$a;->o:Lcom/facebook/imagepipeline/producers/D;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/D$a;->m:Lcom/facebook/imagepipeline/producers/D$c;

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/D$a;->n:Lcom/facebook/imagepipeline/producers/X$a;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/D;->j(Lcom/facebook/imagepipeline/producers/D$c;Lcom/facebook/imagepipeline/producers/X$a;)V

    return-void
.end method
