.class public Lcom/horcrux/svg/FilterRegion;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mH:Lcom/horcrux/svg/SVGLength;

.field mW:Lcom/horcrux/svg/SVGLength;

.field mX:Lcom/horcrux/svg/SVGLength;

.field mY:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCropRect(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/o;Landroid/graphics/RectF;)Landroid/graphics/Rect;
    .locals 12

    sget-object v0, Lcom/horcrux/svg/o;->o:Lcom/horcrux/svg/o;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p3

    invoke-virtual {p3}, Lcom/horcrux/svg/SvgView;->getCanvasWidth()F

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide p2

    iget-object v0, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/horcrux/svg/SvgView;->getCanvasHeight()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v0

    iget-object v2, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/horcrux/svg/SvgView;->getCanvasWidth()F

    move-result v3

    invoke-virtual {p1, v2, v3}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v2

    iget-object v4, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v5

    invoke-virtual {v5}, Lcom/horcrux/svg/SvgView;->getCanvasHeight()F

    move-result v5

    invoke-virtual {p1, v4, v5}, Lcom/horcrux/svg/VirtualView;->relativeOn(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v4

    new-instance p1, Landroid/graphics/Rect;

    double-to-int v6, p2

    double-to-int v7, v0

    add-double/2addr p2, v2

    double-to-int p2, p2

    add-double/2addr v0, v4

    double-to-int p3, v0

    invoke-direct {p1, v6, v7, p2, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1, p2, v0}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v0

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-virtual {p1, p2, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v2

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-virtual {p1, p2, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide v4

    iget-object p2, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    move-result v6

    invoke-virtual {p1, p2, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnFraction(Lcom/horcrux/svg/SVGLength;F)D

    move-result-wide p1

    new-instance v6, Landroid/graphics/Rect;

    iget v7, p3, Landroid/graphics/RectF;->left:F

    float-to-double v8, v7

    add-double/2addr v8, v0

    double-to-int v8, v8

    iget p3, p3, Landroid/graphics/RectF;->top:F

    float-to-double v9, p3

    add-double/2addr v9, v2

    double-to-int v9, v9

    float-to-double v10, v7

    add-double/2addr v10, v0

    add-double/2addr v10, v4

    double-to-int v0, v10

    float-to-double v4, p3

    add-double/2addr v4, v2

    add-double/2addr v4, p1

    double-to-int p1, v4

    invoke-direct {v6, v8, v9, v0, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v6
.end method

.method public setHeight(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mH:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setWidth(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mW:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setX(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mX:Lcom/horcrux/svg/SVGLength;

    return-void
.end method

.method public setY(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/FilterRegion;->mY:Lcom/horcrux/svg/SVGLength;

    return-void
.end method
