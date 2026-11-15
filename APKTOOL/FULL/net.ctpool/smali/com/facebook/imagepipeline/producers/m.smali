.class public Lcom/facebook/imagepipeline/producers/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/m$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Lcom/facebook/imagepipeline/producers/d0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->a:Lcom/facebook/imagepipeline/producers/d0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/m;->b:Lcom/facebook/imagepipeline/producers/d0;

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/m;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/m;->b:Lcom/facebook/imagepipeline/producers/d0;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/facebook/imagepipeline/producers/m$a;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/l;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
