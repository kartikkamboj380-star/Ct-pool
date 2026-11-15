.class Lcom/facebook/imagepipeline/producers/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/G;-><init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/G$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/imagepipeline/producers/G;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/G;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/G$a;->m:Lcom/facebook/imagepipeline/producers/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/G$a;->m:Lcom/facebook/imagepipeline/producers/G;

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/G;->a(Lcom/facebook/imagepipeline/producers/G;)V

    return-void
.end method
