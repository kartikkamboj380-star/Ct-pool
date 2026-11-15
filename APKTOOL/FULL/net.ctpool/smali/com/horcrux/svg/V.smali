.class Lcom/horcrux/svg/V;
.super Lcom/horcrux/svg/h0;
.source "SourceFile"


# instance fields
.field private C:Ljava/lang/String;

.field private D:Lcom/horcrux/svg/f0;

.field private E:Lcom/horcrux/svg/e0;

.field private F:Lcom/horcrux/svg/SVGLength;

.field private G:Lcom/horcrux/svg/d0;

.field private H:Lcom/horcrux/svg/g0;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/h0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    sget-object p1, Lcom/horcrux/svg/d0;->m:Lcom/horcrux/svg/d0;

    iput-object p1, p0, Lcom/horcrux/svg/V;->G:Lcom/horcrux/svg/d0;

    sget-object p1, Lcom/horcrux/svg/g0;->n:Lcom/horcrux/svg/g0;

    iput-object p1, p0, Lcom/horcrux/svg/V;->H:Lcom/horcrux/svg/g0;

    return-void
.end method


# virtual methods
.method public M(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/d0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/d0;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/V;->G:Lcom/horcrux/svg/d0;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method S()Lcom/horcrux/svg/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/V;->E:Lcom/horcrux/svg/e0;

    return-object v0
.end method

.method T()Lcom/horcrux/svg/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/V;->D:Lcom/horcrux/svg/f0;

    return-object v0
.end method

.method U()Lcom/horcrux/svg/SVGLength;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/V;->F:Lcom/horcrux/svg/SVGLength;

    return-object v0
.end method

.method V(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    iget-object v1, p0, Lcom/horcrux/svg/V;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->getDefinedTemplate(Ljava/lang/String;)Lcom/horcrux/svg/VirtualView;

    move-result-object v0

    instance-of v1, v0, Lcom/horcrux/svg/RenderableView;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast v0, Lcom/horcrux/svg/RenderableView;

    invoke-virtual {v0, p1, p2}, Lcom/horcrux/svg/RenderableView;->getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method public W(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/V;->C:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method public X(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/e0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/e0;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/V;->E:Lcom/horcrux/svg/e0;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method public Y(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/f0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/f0;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/V;->D:Lcom/horcrux/svg/f0;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method public Z(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/g0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/g0;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/V;->H:Lcom/horcrux/svg/g0;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method public a0(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/V;->F:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/h0;->invalidate()V

    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/u;->q(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/h0;->D(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method v()V
    .locals 0

    .line 1
    return-void
.end method

.method w()V
    .locals 0

    .line 1
    return-void
.end method
