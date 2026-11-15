.class Lcom/horcrux/svg/r;
.super Lcom/horcrux/svg/u;
.source "SourceFile"


# instance fields
.field r:Lcom/horcrux/svg/SVGLength;

.field s:Lcom/horcrux/svg/SVGLength;

.field t:Lcom/horcrux/svg/SVGLength;

.field u:Lcom/horcrux/svg/SVGLength;

.field v:Landroid/graphics/Bitmap;

.field w:Landroid/graphics/Canvas;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/horcrux/svg/u;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    const/4 p1, 0x1

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/r;->v:Landroid/graphics/Bitmap;

    new-instance p1, Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/horcrux/svg/r;->v:Landroid/graphics/Bitmap;

    invoke-direct {p1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object p1, p0, Lcom/horcrux/svg/r;->w:Landroid/graphics/Canvas;

    return-void
.end method


# virtual methods
.method public B(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/r;->u:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public C(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/r;->t:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public D(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/r;->r:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public E(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/r;->s:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    iget-object p1, p0, Lcom/horcrux/svg/r;->w:Landroid/graphics/Canvas;

    invoke-super {p0, p1}, Lcom/facebook/react/views/view/i;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 5

    iget-object v0, p0, Lcom/horcrux/svg/r;->r:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0, v0}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lcom/horcrux/svg/r;->s:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, p0, Lcom/horcrux/svg/r;->t:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v2

    double-to-float v2, v2

    iget-object v3, p0, Lcom/horcrux/svg/r;->u:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0, v3}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v2, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-super {p0, p1, p2, p3}, Lcom/horcrux/svg/u;->draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    iget-object p1, p0, Lcom/horcrux/svg/r;->w:Landroid/graphics/Canvas;

    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/react/views/view/i;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method q(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/u;->w()V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_8

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Lcom/horcrux/svg/z;

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    instance-of v4, v3, Lcom/horcrux/svg/VirtualView;

    if-eqz v4, :cond_5

    check-cast v3, Lcom/horcrux/svg/VirtualView;

    iget-object v4, v3, Lcom/horcrux/svg/VirtualView;->mDisplay:Ljava/lang/String;

    const-string v5, "none"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    instance-of v4, v3, Lcom/horcrux/svg/RenderableView;

    if-eqz v4, :cond_2

    move-object v5, v3

    check-cast v5, Lcom/horcrux/svg/RenderableView;

    invoke-virtual {v5, p0}, Lcom/horcrux/svg/RenderableView;->mergeProperties(Lcom/horcrux/svg/RenderableView;)V

    :cond_2
    iget-object v5, p0, Lcom/horcrux/svg/VirtualView;->mCTM:Landroid/graphics/Matrix;

    invoke-virtual {v3, p1, v5}, Lcom/horcrux/svg/VirtualView;->saveAndSetupCanvas(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)I

    move-result v5

    iget v6, p0, Lcom/horcrux/svg/VirtualView;->mOpacity:F

    mul-float/2addr v6, p3

    invoke-virtual {v3, p1, p2, v6}, Lcom/horcrux/svg/VirtualView;->render(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    invoke-virtual {v3}, Lcom/horcrux/svg/VirtualView;->getClientRect()Landroid/graphics/RectF;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v1, v6}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    :cond_3
    invoke-virtual {v3, p1, v5}, Lcom/horcrux/svg/VirtualView;->restoreCanvas(Landroid/graphics/Canvas;I)V

    if-eqz v4, :cond_4

    move-object v4, v3

    check-cast v4, Lcom/horcrux/svg/RenderableView;

    invoke-virtual {v4}, Lcom/horcrux/svg/RenderableView;->resetProperties()V

    :cond_4
    invoke-virtual {v3}, Lcom/horcrux/svg/VirtualView;->isResponsible()Z

    move-result v3

    if-eqz v3, :cond_7

    :goto_1
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->enableTouchEvents()V

    goto :goto_2

    :cond_5
    instance-of v4, v3, Lcom/horcrux/svg/SvgView;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/horcrux/svg/SvgView;

    invoke-virtual {v3, p1}, Lcom/horcrux/svg/SvgView;->drawChildren(Landroid/graphics/Canvas;)V

    invoke-virtual {v3}, Lcom/horcrux/svg/SvgView;->isResponsible()Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    :cond_6
    invoke-virtual {v3, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    invoke-virtual {p0, v1}, Lcom/horcrux/svg/VirtualView;->setClientRect(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/u;->v()V

    return-void
.end method
