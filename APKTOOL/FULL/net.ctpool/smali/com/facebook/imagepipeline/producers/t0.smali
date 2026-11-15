.class public Lcom/facebook/imagepipeline/producers/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/t0$a;
    }
.end annotation


# instance fields
.field private final a:[Lcom/facebook/imagepipeline/producers/u0;


# direct methods
.method public varargs constructor <init>([Lcom/facebook/imagepipeline/producers/u0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/facebook/imagepipeline/producers/u0;

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/t0;->a:[Lcom/facebook/imagepipeline/producers/u0;

    const/4 v0, 0x0

    array-length p1, p1

    invoke-static {v0, p1}, LO0/l;->e(II)I

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/t0;ILcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/t0;->e(ILcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z

    move-result p0

    return p0
.end method

.method private d(ILx1/f;)I
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t0;->a:[Lcom/facebook/imagepipeline/producers/u0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge p1, v1, :cond_1

    .line 5
    .line 6
    aget-object v0, v0, p1

    .line 7
    .line 8
    invoke-interface {v0, p2}, Lcom/facebook/imagepipeline/producers/u0;->b(Lx1/f;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, -0x1

    .line 19
    return p1
.end method

.method private e(ILcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z
    .locals 2

    .line 1
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b;->q()Lx1/f;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/imagepipeline/producers/t0;->d(ILx1/f;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/t0;->a:[Lcom/facebook/imagepipeline/producers/u0;

    aget-object v0, v0, p1

    new-instance v1, Lcom/facebook/imagepipeline/producers/t0$a;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/facebook/imagepipeline/producers/t0$a;-><init>(Lcom/facebook/imagepipeline/producers/t0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;I)V

    invoke-interface {v0, v1, p3}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 3

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b;->q()Lx1/f;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    :goto_0
    invoke-interface {p1, v2, v1}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/imagepipeline/producers/t0;->e(ILcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
