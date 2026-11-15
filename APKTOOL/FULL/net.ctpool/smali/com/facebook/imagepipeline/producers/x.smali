.class public Lcom/facebook/imagepipeline/producers/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/x$a;
    }
.end annotation


# instance fields
.field private final a:Lw1/j;

.field private final b:Lw1/j;

.field private final c:Ljava/util/Map;

.field private final d:Lw1/k;

.field private final e:Lcom/facebook/imagepipeline/producers/d0;


# direct methods
.method public constructor <init>(Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/x;->a:Lw1/j;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/x;->b:Lw1/j;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/x;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/x;->d:Lw1/k;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/x;->e:Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-void
.end method

.method private c(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 9

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b$c;->h()I

    move-result v0

    sget-object v1, LJ1/b$c;->o:LJ1/b$c;

    invoke-virtual {v1}, LJ1/b$c;->h()I

    move-result v1

    if-lt v0, v1, :cond_0

    const-string v0, "disk"

    const-string v1, "nil-result_write"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, LJ1/b;->x(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/facebook/imagepipeline/producers/x$a;

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/x;->a:Lw1/j;

    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/x;->b:Lw1/j;

    iget-object v6, p0, Lcom/facebook/imagepipeline/producers/x;->c:Ljava/util/Map;

    iget-object v7, p0, Lcom/facebook/imagepipeline/producers/x;->d:Lw1/k;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/facebook/imagepipeline/producers/x$a;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/w;)V

    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/x;->e:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/x;->c(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
