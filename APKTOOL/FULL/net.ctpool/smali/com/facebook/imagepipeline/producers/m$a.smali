.class Lcom/facebook/imagepipeline/producers/m$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private c:Lcom/facebook/imagepipeline/producers/e0;

.field final synthetic d:Lcom/facebook/imagepipeline/producers/m;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/m$a;->d:Lcom/facebook/imagepipeline/producers/m;

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/m$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/l;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/producers/m$a;-><init>(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method


# virtual methods
.method protected h(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$a;->d:Lcom/facebook/imagepipeline/producers/m;

    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/m;->c(Lcom/facebook/imagepipeline/producers/m;)Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/m$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {p1, v0, v1}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method

.method protected bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/m$a;->q(LD1/g;I)V

    return-void
.end method

.method protected q(LD1/g;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, LJ1/b;->q()Lx1/f;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1, v2}, Lcom/facebook/imagepipeline/producers/v0;->c(LD1/g;Lx1/f;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, LJ1/b;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    :cond_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v3, 0x1

    .line 42
    invoke-static {p2, v3}, Lcom/facebook/imagepipeline/producers/c;->o(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 48
    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, LJ1/b;->h()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, LD1/g;->d(LD1/g;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/m$a;->d:Lcom/facebook/imagepipeline/producers/m;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/m;->c(Lcom/facebook/imagepipeline/producers/m;)Lcom/facebook/imagepipeline/producers/d0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/m$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 71
    .line 72
    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
.end method
