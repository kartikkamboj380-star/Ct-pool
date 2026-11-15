.class public final Lcom/facebook/react/views/scroll/f$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private final a:I

.field private final b:Landroid/graphics/Point;

.field private c:I

.field private final d:Landroid/graphics/Point;

.field private e:Z

.field private f:Z

.field private g:F


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/views/scroll/f$g;->a:I

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/f$g;->b:Landroid/graphics/Point;

    new-instance p1, Landroid/graphics/Point;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/f$g;->d:Landroid/graphics/Point;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/f$g;->f:Z

    const p1, 0x3f7c28f6    # 0.985f

    iput p1, p0, Lcom/facebook/react/views/scroll/f$g;->g:F

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/f$g;->g:F

    return v0
.end method

.method public final b()Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/f$g;->b:Landroid/graphics/Point;

    return-object v0
.end method

.method public final c()Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/f$g;->d:Landroid/graphics/Point;

    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/f$g;->a:I

    return v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/scroll/f$g;->c:I

    return v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/f$g;->e:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/f$g;->f:Z

    return v0
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/f$g;->e:Z

    return-void
.end method

.method public final i(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/f$g;->g:F

    return-void
.end method

.method public final j(II)Lcom/facebook/react/views/scroll/f$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/f$g;->b:Landroid/graphics/Point;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    return-object p0
.end method

.method public final k(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/f$g;->f:Z

    return-void
.end method

.method public final l(II)Lcom/facebook/react/views/scroll/f$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/f$g;->d:Landroid/graphics/Point;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Point;->set(II)V

    return-object p0
.end method

.method public final m(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/scroll/f$g;->c:I

    return-void
.end method
