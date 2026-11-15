.class public final Lcom/google/android/gms/internal/base/k;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field private A:I

.field private m:I

.field private n:J

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Lcom/google/android/gms/internal/base/j;

.field private v:Landroid/graphics/drawable/Drawable;

.field private w:Landroid/graphics/drawable/Drawable;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/base/k;-><init>(Lcom/google/android/gms/internal/base/j;)V

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/base/i;->a()Lcom/google/android/gms/internal/base/i;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    iget v1, v0, Lcom/google/android/gms/internal/base/j;->b:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result p1

    or-int/2addr p1, v1

    iput p1, v0, Lcom/google/android/gms/internal/base/j;->b:I

    if-nez p2, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/base/i;->a()Lcom/google/android/gms/internal/base/i;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    iget v0, p1, Lcom/google/android/gms/internal/base/j;->b:I

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result p2

    or-int/2addr p2, v0

    iput p2, p1, Lcom/google/android/gms/internal/base/j;->b:I

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/base/j;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/base/k;->m:I

    const/16 v1, 0xff

    iput v1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    iput v0, p0, Lcom/google/android/gms/internal/base/k;->r:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->s:Z

    new-instance v0, Lcom/google/android/gms/internal/base/j;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/base/j;-><init>(Lcom/google/android/gms/internal/base/j;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    iput p1, p0, Lcom/google/android/gms/internal/base/k;->o:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/base/k;->r:I

    const/16 p1, 0xfa

    iput p1, p0, Lcom/google/android/gms/internal/base/k;->q:I

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/base/k;->m:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/base/k;->y:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/base/k;->x:Z

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->y:Z

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    iget v0, p0, Lcom/google/android/gms/internal/base/k;->m:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_4

    if-eq v0, v1, :cond_1

    :cond_0
    move v4, v3

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Lcom/google/android/gms/internal/base/k;->n:J

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-ltz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/google/android/gms/internal/base/k;->n:J

    sub-long/2addr v0, v4

    iget v4, p0, Lcom/google/android/gms/internal/base/k;->q:I

    int-to-float v4, v4

    long-to-float v0, v0

    div-float/2addr v0, v4

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v4, v0, v1

    if-ltz v4, :cond_2

    move v4, v3

    goto :goto_0

    :cond_2
    move v4, v2

    :goto_0
    if-eqz v4, :cond_3

    iput v2, p0, Lcom/google/android/gms/internal/base/k;->m:I

    :cond_3
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/base/k;->o:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    const/4 v0, 0x0

    add-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/base/k;->r:I

    goto :goto_1

    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/google/android/gms/internal/base/k;->n:J

    iput v1, p0, Lcom/google/android/gms/internal/base/k;->m:I

    move v4, v2

    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/base/k;->r:I

    iget-boolean v1, p0, Lcom/google/android/gms/internal/base/k;->s:Z

    iget-object v5, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_8

    if-eqz v1, :cond_5

    if-nez v0, :cond_6

    goto :goto_2

    :cond_5
    move v2, v0

    :goto_2
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    move v0, v2

    :cond_6
    iget v1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    if-ne v0, v1, :cond_7

    invoke-virtual {v6, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_7
    return-void

    :cond_8
    if-eqz v1, :cond_9

    iget v1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    sub-int/2addr v1, v0

    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    move v2, v3

    :cond_9
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    if-eqz v2, :cond_a

    iget v1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    invoke-virtual {v5, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_a
    if-lez v0, :cond_b

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget p1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    invoke-virtual {v6, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_b
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final getChangingConfigurations()I
    .locals 3

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    iget v2, v1, Lcom/google/android/gms/internal/base/j;->a:I

    or-int/2addr v0, v2

    iget v1, v1, Lcom/google/android/gms/internal/base/j;->b:I

    or-int/2addr v0, v1

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/base/k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/base/k;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/base/j;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->u:Lcom/google/android/gms/internal/base/j;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v1

    invoke-static {v0, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/base/k;->A:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->z:Z

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/base/k;->A:I

    return v0
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->t:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/base/k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/base/k;->t:Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-object p0
.end method

.method protected final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final setAlpha(I)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/base/k;->r:I

    iget v1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    if-ne v0, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/base/k;->r:I

    :cond_0
    iput p1, p0, Lcom/google/android/gms/internal/base/k;->p:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->v:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/base/k;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
