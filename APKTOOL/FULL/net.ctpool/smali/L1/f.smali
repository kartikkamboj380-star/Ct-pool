.class public final LL1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL1/d;


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:LL1/d;

.field private final d:Ljava/lang/Integer;

.field private final e:Z


# direct methods
.method public constructor <init>(IZLL1/d;Ljava/lang/Integer;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LL1/f;->a:I

    .line 5
    .line 6
    iput-boolean p2, p0, LL1/f;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LL1/f;->c:LL1/d;

    .line 9
    .line 10
    iput-object p4, p0, LL1/f;->d:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-boolean p5, p0, LL1/f;->e:Z

    .line 13
    .line 14
    return-void
.end method

.method private final a(Ls1/c;Z)LL1/c;
    .locals 1

    .line 1
    iget-object v0, p0, LL1/f;->c:LL1/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LL1/d;->createImageTranscoder(Ls1/c;Z)LL1/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    return-object p1
.end method

.method private final b(Ls1/c;Z)LL1/c;
    .locals 2

    .line 1
    iget-object v0, p0, LL1/f;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, LL1/f;->d(Ls1/c;Z)LL1/c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p2, "Invalid ImageTranscoderType"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_2
    invoke-direct {p0, p1, p2}, LL1/f;->c(Ls1/c;Z)LL1/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    return-object p1
.end method

.method private final c(Ls1/c;Z)LL1/c;
    .locals 3

    .line 1
    iget v0, p0, LL1/f;->a:I

    .line 2
    .line 3
    iget-boolean v1, p0, LL1/f;->b:Z

    .line 4
    .line 5
    iget-boolean v2, p0, LL1/f;->e:Z

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/imagepipeline/nativecode/f;->a(IZZ)LL1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1, p2}, LL1/d;->createImageTranscoder(Ls1/c;Z)LL1/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private final d(Ls1/c;Z)LL1/c;
    .locals 2

    .line 1
    new-instance v0, LL1/h;

    .line 2
    .line 3
    iget v1, p0, LL1/f;->a:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, LL1/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, LL1/h;->createImageTranscoder(Ls1/c;Z)LL1/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "SimpleImageTranscoderFac\u2026ormat, isResizingEnabled)"

    .line 13
    .line 14
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method


# virtual methods
.method public createImageTranscoder(Ls1/c;Z)LL1/c;
    .locals 2

    .line 1
    const-string v0, "imageFormat"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LL1/f;->a(Ls1/c;Z)LL1/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, p1, p2}, LL1/f;->b(Ls1/c;Z)LL1/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-static {}, Ly1/p;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1, p2}, LL1/f;->c(Ls1/c;Z)LL1/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, LL1/f;->d(Ls1/c;Z)LL1/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_2
    return-object v0
.end method
