.class public Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;
.super Lcom/facebook/imagepipeline/memory/e;
.source "SourceFile"


# annotations
.annotation build LO0/d;
.end annotation


# direct methods
.method public constructor <init>(LR0/d;LG1/G;LG1/H;)V
    .locals 0
    .annotation build LO0/d;
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/e;-><init>(LR0/d;LG1/G;LG1/H;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected D(I)Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;-><init>(I)V

    return-object v0
.end method

.method protected bridge synthetic f(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;->D(I)Lcom/facebook/imagepipeline/memory/NativeMemoryChunk;

    move-result-object p1

    return-object p1
.end method
