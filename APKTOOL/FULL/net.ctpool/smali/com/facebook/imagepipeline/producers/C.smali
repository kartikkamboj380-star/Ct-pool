.class public abstract Lcom/facebook/imagepipeline/producers/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/n;

.field private final b:Lcom/facebook/imagepipeline/producers/e0;

.field private c:J

.field private d:I

.field private e:Lx1/a;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/C;->a:Lcom/facebook/imagepipeline/producers/n;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/imagepipeline/producers/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->a:Lcom/facebook/imagepipeline/producers/n;

    return-object v0
.end method

.method public b()Lcom/facebook/imagepipeline/producers/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    return-wide v0
.end method

.method public d()Lcom/facebook/imagepipeline/producers/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/producers/C;->d:I

    return v0
.end method

.method public f()Lx1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->e:Lx1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/C;->b:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/C;->c:J

    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/imagepipeline/producers/C;->d:I

    return-void
.end method

.method public j(Lx1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/C;->e:Lx1/a;

    .line 2
    .line 3
    return-void
.end method
