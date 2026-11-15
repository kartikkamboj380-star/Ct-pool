.class public Lcom/facebook/react/views/view/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/g$a;
    }
.end annotation


# instance fields
.field private a:LA2/a;

.field private b:Landroid/view/View;

.field private c:I

.field private d:Lcom/facebook/react/views/view/g$a;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/views/view/g;->c:I

    sget-object v0, Lcom/facebook/react/views/view/g$a;->m:Lcom/facebook/react/views/view/g$a;

    iput-object v0, p0, Lcom/facebook/react/views/view/g;->d:Lcom/facebook/react/views/view/g$a;

    iput-object p1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    return-void
.end method

.method private c()LA2/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, LA2/a;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, LA2/a;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v2}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    .line 35
    .line 36
    :goto_0
    invoke-static {v0, v1}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    .line 43
    .line 44
    const/4 v3, 0x2

    .line 45
    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    aput-object v2, v3, v4

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    aput-object v0, v3, v2

    .line 52
    .line 53
    invoke-direct {v1, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    .line 60
    .line 61
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/H;->t0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    iput-object v1, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/g;->c:I

    return v0
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->d:Lcom/facebook/react/views/view/g$a;

    sget-object v1, Lcom/facebook/react/views/view/g$a;->m:Lcom/facebook/react/views/view/g$a;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v1, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    return-void

    :cond_1
    invoke-virtual {v1}, LA2/a;->l()Landroid/graphics/Path;

    move-result-object v2

    if-eqz v2, :cond_2

    iget v1, v0, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->offset(FF)V

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LA2/a;->m()Landroid/graphics/RectF;

    move-result-object v1

    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/RectF;->offset(FF)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/view/g;->a:LA2/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->w(I)V

    :goto_0
    return-void
.end method

.method public f(IFF)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LA2/a;->r(IFF)V

    return-void
.end method

.method public g(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->y(F)V

    return-void
.end method

.method public h(FI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LA2/a;->z(FI)V

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LA2/a;->u(Ljava/lang/String;)V

    return-void
.end method

.method public j(IF)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/g;->c()LA2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LA2/a;->v(IF)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/g;->d:Lcom/facebook/react/views/view/g$a;

    const-string v1, "hidden"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/facebook/react/views/view/g$a;->n:Lcom/facebook/react/views/view/g$a;

    :goto_0
    iput-object p1, p0, Lcom/facebook/react/views/view/g;->d:Lcom/facebook/react/views/view/g$a;

    goto :goto_1

    :cond_0
    const-string v1, "scroll"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/facebook/react/views/view/g$a;->o:Lcom/facebook/react/views/view/g$a;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/facebook/react/views/view/g$a;->m:Lcom/facebook/react/views/view/g$a;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/facebook/react/views/view/g;->d:Lcom/facebook/react/views/view/g$a;

    if-eq v0, p1, :cond_2

    iget-object p1, p0, Lcom/facebook/react/views/view/g;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method
