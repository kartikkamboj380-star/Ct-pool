.class Lcom/google/android/material/textfield/d;
.super LN3/g;
.source "SourceFile"


# instance fields
.field private final L:Landroid/graphics/Paint;

.field private final M:Landroid/graphics/RectF;


# direct methods
.method constructor <init>(LN3/k;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, LN3/k;

    .line 5
    .line 6
    invoke-direct {p1}, LN3/k;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-direct {p0, p1}, LN3/g;-><init>(LN3/k;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/material/textfield/d;->L:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/google/android/material/textfield/d;->k0()V

    .line 21
    .line 22
    .line 23
    new-instance p1, Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    .line 29
    .line 30
    return-void
.end method

.method private k0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/d;->L:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/d;->L:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/d;->L:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method


# virtual methods
.method g0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method h0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, v0}, Lcom/google/android/material/textfield/d;->i0(FFFF)V

    return-void
.end method

.method i0(FFFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->top:F

    cmpl-float v1, p2, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v1, p3, v1

    if-nez v1, :cond_0

    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    cmpl-float v1, p4, v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, LN3/g;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method j0(Landroid/graphics/RectF;)V
    .locals 3

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/google/android/material/textfield/d;->i0(FFFF)V

    return-void
.end method

.method protected r(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LN3/g;->r(Landroid/graphics/Canvas;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    invoke-static {p1, v0}, Lcom/google/android/material/textfield/c;->a(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/d;->M:Landroid/graphics/RectF;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    :goto_0
    invoke-super {p0, p1}, LN3/g;->r(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :goto_1
    return-void
.end method
