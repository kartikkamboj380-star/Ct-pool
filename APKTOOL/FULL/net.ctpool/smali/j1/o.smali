.class public Lj1/o;
.super Lj1/g;
.source "SourceFile"


# instance fields
.field q:Lj1/p$b;

.field r:Ljava/lang/Object;

.field s:Landroid/graphics/PointF;

.field t:I

.field u:I

.field v:Landroid/graphics/Matrix;

.field private w:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lj1/p$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lj1/g;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lj1/o;->t:I

    .line 9
    .line 10
    iput p1, p0, Lj1/o;->u:I

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Matrix;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lj1/o;->w:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iput-object p2, p0, Lj1/o;->q:Lj1/p$b;

    .line 20
    .line 21
    return-void
.end method

.method private y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj1/g;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v1, p0, Lj1/o;->t:I

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ne v1, v2, :cond_1

    .line 15
    .line 16
    iget v1, p0, Lj1/o;->u:I

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eq v1, v0, :cond_2

    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Lj1/o;->x()V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method


# virtual methods
.method public A()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/o;->q:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public B(Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-static {v0, p1}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/PointF;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 26
    .line 27
    :cond_2
    iget-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0}, Lj1/o;->x()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public C(Lj1/p$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/o;->q:Lj1/p$b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lj1/o;->q:Lj1/p$b;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lj1/o;->r:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0}, Lj1/o;->x()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lj1/o;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    invoke-super {p0, p1}, Lj1/g;->draw(Landroid/graphics/Canvas;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lj1/g;->draw(Landroid/graphics/Canvas;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void
.end method

.method public f(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lj1/g;->u(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lj1/o;->y()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lj1/o;->x()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public v(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj1/g;->v(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lj1/o;->x()V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method x()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lj1/g;->getCurrent()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput v1, p0, Lj1/o;->u:I

    .line 10
    .line 11
    iput v1, p0, Lj1/o;->t:I

    .line 12
    .line 13
    iput-object v2, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    iput v6, p0, Lj1/o;->t:I

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    iput v7, p0, Lj1/o;->u:I

    .line 39
    .line 40
    if-lez v6, :cond_6

    .line 41
    .line 42
    if-gtz v7, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    if-ne v6, v3, :cond_2

    .line 46
    .line 47
    if-ne v7, v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object v3, p0, Lj1/o;->q:Lj1/p$b;

    .line 56
    .line 57
    sget-object v4, Lj1/p$b;->a:Lj1/p$b;

    .line 58
    .line 59
    if-ne v3, v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    invoke-virtual {v0, v1, v1, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, Lj1/o;->q:Lj1/p$b;

    .line 71
    .line 72
    iget-object v4, p0, Lj1/o;->w:Landroid/graphics/Matrix;

    .line 73
    .line 74
    iget-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 75
    .line 76
    const/high16 v1, 0x3f000000    # 0.5f

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 81
    .line 82
    move v8, v2

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    move v8, v1

    .line 85
    :goto_0
    if-eqz v0, :cond_5

    .line 86
    .line 87
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    move v9, v0

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move v9, v1

    .line 92
    :goto_1
    invoke-interface/range {v3 .. v9}, Lj1/p$b;->a(Landroid/graphics/Matrix;Landroid/graphics/Rect;IIFF)Landroid/graphics/Matrix;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lj1/o;->w:Landroid/graphics/Matrix;

    .line 96
    .line 97
    iput-object v0, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_6
    :goto_2
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    iput-object v2, p0, Lj1/o;->v:Landroid/graphics/Matrix;

    .line 104
    .line 105
    return-void
.end method

.method public z()Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/o;->s:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method
