.class Lcom/facebook/react/views/switchview/a;
.super Landroidx/appcompat/widget/c0;
.source "SourceFile"


# instance fields
.field private j0:Z

.field private k0:Ljava/lang/Integer;

.field private l0:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/c0;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/switchview/a;->j0:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    iput-object p1, p0, Lcom/facebook/react/views/switchview/a;->l0:Ljava/lang/Integer;

    return-void
.end method

.method private r(Ljava/lang/Integer;)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/res/ColorStateList;

    const v1, 0x10100a7

    filled-new-array {v1}, [I

    move-result-object v1

    filled-new-array {v1}, [[I

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0
.end method

.method private w(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/switchview/a;->l0:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/switchview/a;->v(Ljava/lang/Integer;)V

    :cond_2
    return-void
.end method


# virtual methods
.method s(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 3

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/react/views/switchview/a;->r(Ljava/lang/Integer;)Landroid/content/res/ColorStateList;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/switchview/a;->j0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/views/switchview/a;->j0:Z

    invoke-super {p0, p1}, Landroidx/appcompat/widget/c0;->setChecked(Z)V

    invoke-direct {p0, p1}, Lcom/facebook/react/views/switchview/a;->w(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-super {p0, p1}, Landroidx/appcompat/widget/c0;->setChecked(Z)V

    :goto_0
    return-void
.end method

.method t(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/c0;->setChecked(Z)V

    invoke-direct {p0, p1}, Lcom/facebook/react/views/switchview/a;->w(Z)V

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/switchview/a;->j0:Z

    return-void
.end method

.method public u(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/c0;->getThumbDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/switchview/a;->s(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V

    if-eqz p1, :cond_0

    invoke-super {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/switchview/a;->r(Ljava/lang/Integer;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-super {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public v(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/c0;->getTrackDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/switchview/a;->s(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V

    return-void
.end method

.method public x(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/switchview/a;->k0:Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/switchview/a;->v(Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method

.method public y(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/switchview/a;->l0:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/switchview/a;->l0:Ljava/lang/Integer;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/switchview/a;->l0:Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/switchview/a;->v(Ljava/lang/Integer;)V

    :cond_1
    return-void
.end method
