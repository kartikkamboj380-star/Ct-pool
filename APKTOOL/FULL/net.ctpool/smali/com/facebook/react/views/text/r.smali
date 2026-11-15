.class public Lcom/facebook/react/views/text/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:Lcom/facebook/react/views/text/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/text/r;->a:Z

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lcom/facebook/react/views/text/r;->b:F

    iput v0, p0, Lcom/facebook/react/views/text/r;->c:F

    iput v0, p0, Lcom/facebook/react/views/text/r;->d:F

    iput v0, p0, Lcom/facebook/react/views/text/r;->e:F

    iput v0, p0, Lcom/facebook/react/views/text/r;->f:F

    sget-object v0, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    iput-object v0, p0, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/views/text/r;)Lcom/facebook/react/views/text/r;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/r;

    invoke-direct {v0}, Lcom/facebook/react/views/text/r;-><init>()V

    iget-boolean v1, p0, Lcom/facebook/react/views/text/r;->a:Z

    iput-boolean v1, v0, Lcom/facebook/react/views/text/r;->a:Z

    iget v1, p1, Lcom/facebook/react/views/text/r;->b:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p1, Lcom/facebook/react/views/text/r;->b:F

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/facebook/react/views/text/r;->b:F

    :goto_0
    iput v1, v0, Lcom/facebook/react/views/text/r;->b:F

    iget v1, p1, Lcom/facebook/react/views/text/r;->c:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p1, Lcom/facebook/react/views/text/r;->c:F

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/facebook/react/views/text/r;->c:F

    :goto_1
    iput v1, v0, Lcom/facebook/react/views/text/r;->c:F

    iget v1, p1, Lcom/facebook/react/views/text/r;->d:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p1, Lcom/facebook/react/views/text/r;->d:F

    goto :goto_2

    :cond_2
    iget v1, p0, Lcom/facebook/react/views/text/r;->d:F

    :goto_2
    iput v1, v0, Lcom/facebook/react/views/text/r;->d:F

    iget v1, p1, Lcom/facebook/react/views/text/r;->e:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    iget v1, p1, Lcom/facebook/react/views/text/r;->e:F

    goto :goto_3

    :cond_3
    iget v1, p0, Lcom/facebook/react/views/text/r;->e:F

    :goto_3
    iput v1, v0, Lcom/facebook/react/views/text/r;->e:F

    iget v1, p1, Lcom/facebook/react/views/text/r;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_4

    iget v1, p1, Lcom/facebook/react/views/text/r;->f:F

    goto :goto_4

    :cond_4
    iget v1, p0, Lcom/facebook/react/views/text/r;->f:F

    :goto_4
    iput v1, v0, Lcom/facebook/react/views/text/r;->f:F

    iget-object p1, p1, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    sget-object v1, Lcom/facebook/react/views/text/t;->q:Lcom/facebook/react/views/text/t;

    if-eq p1, v1, :cond_5

    goto :goto_5

    :cond_5
    iget-object p1, p0, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    :goto_5
    iput-object p1, v0, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/text/r;->a:Z

    return v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/text/r;->b:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41600000    # 14.0f

    :goto_0
    iget-boolean v1, p0, Lcom/facebook/react/views/text/r;->a:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->f()F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->g(FF)F

    move-result v0

    :goto_1
    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    goto :goto_2

    :cond_1
    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    goto :goto_1

    :goto_2
    return v0
.end method

.method public d()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->d:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/r;->a:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/facebook/react/views/text/r;->d:F

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->f()F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->g(FF)F

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/r;->d:F

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->c()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public e()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->c:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/text/r;->a:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/facebook/react/views/text/r;->c:F

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->f()F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->g(FF)F

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/facebook/react/views/text/r;->c:F

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v0

    :goto_0
    iget v1, p0, Lcom/facebook/react/views/text/r;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/facebook/react/views/text/r;->f:F

    cmpl-float v2, v1, v0

    if-lez v2, :cond_2

    move v0, v1

    :cond_2
    return v0
.end method

.method public f()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->e:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/text/r;->e:F

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->b:F

    return v0
.end method

.method public h()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->f:F

    return v0
.end method

.method public i()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->d:F

    return v0
.end method

.method public j()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->c:F

    return v0
.end method

.method public k()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/r;->e:F

    return v0
.end method

.method public l()Lcom/facebook/react/views/text/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    return-object v0
.end method

.method public m(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/text/r;->a:Z

    return-void
.end method

.method public n(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/r;->b:F

    return-void
.end method

.method public o(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/r;->f:F

    return-void
.end method

.method public p(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/r;->d:F

    return-void
.end method

.method public q(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/text/r;->c:F

    return-void
.end method

.method public r(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    const-string p1, "ReactNative"

    const-string v0, "maxFontSizeMultiplier must be NaN, 0, or >= 1"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lcom/facebook/react/views/text/r;->e:F

    return-void

    :cond_0
    iput p1, p0, Lcom/facebook/react/views/text/r;->e:F

    return-void
.end method

.method public s(Lcom/facebook/react/views/text/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/text/r;->g:Lcom/facebook/react/views/text/t;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextAttributes {\n  getAllowFontScaling(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n  getFontSize(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getEffectiveFontSize(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n  getHeightOfTallestInlineViewOrImage(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getLetterSpacing(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->i()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getEffectiveLetterSpacing(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->d()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getLineHeight(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->j()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getEffectiveLineHeight(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->e()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getTextTransform(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->l()Lcom/facebook/react/views/text/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n  getMaxFontSizeMultiplier(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->k()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n  getEffectiveMaxFontSizeMultiplier(): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/facebook/react/views/text/r;->f()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
