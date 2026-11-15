.class public Lcom/facebook/imagepipeline/producers/a0$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final c:LI0/d;

.field private final d:Z

.field private final e:Lw1/x;

.field private final f:Z


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;LI0/d;ZLw1/x;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/a0$a;->c:LI0/d;

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/facebook/imagepipeline/producers/a0$a;->d:Z

    .line 7
    .line 8
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/a0$a;->e:Lw1/x;

    .line 9
    .line 10
    iput-boolean p5, p0, Lcom/facebook/imagepipeline/producers/a0$a;->f:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method protected bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LS0/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/a0$a;->q(LS0/a;I)V

    return-void
.end method

.method protected q(LS0/a;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_1

    .line 3
    .line 4
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/producers/a0$a;->d:Z

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget-boolean v1, p0, Lcom/facebook/imagepipeline/producers/a0$a;->f:Z

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/a0$a;->e:Lw1/x;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/a0$a;->c:LI0/d;

    .line 36
    .line 37
    invoke-interface {v0, v1, p1}, Lw1/x;->d(Ljava/lang/Object;LS0/a;)LS0/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/high16 v2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-interface {v1, v2}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :cond_4
    invoke-interface {v1, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method
