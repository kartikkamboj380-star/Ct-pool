.class Lcom/horcrux/svg/D;
.super Lcom/horcrux/svg/u;
.source "SourceFile"


# static fields
.field private static final E:[F


# instance fields
.field private A:F

.field B:Ljava/lang/String;

.field C:I

.field private D:Landroid/graphics/Matrix;

.field private r:Lcom/horcrux/svg/SVGLength;

.field private s:Lcom/horcrux/svg/SVGLength;

.field private t:Lcom/horcrux/svg/SVGLength;

.field private u:Lcom/horcrux/svg/SVGLength;

.field private v:Lcom/horcrux/svg/a$b;

.field private w:Lcom/horcrux/svg/a$b;

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/horcrux/svg/D;->E:[F

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/u;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public B(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/D;->u:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public C(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->n:Lcom/horcrux/svg/a$b;

    :goto_0
    iput-object p1, p0, Lcom/horcrux/svg/D;->w:Lcom/horcrux/svg/a$b;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->m:Lcom/horcrux/svg/a$b;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public D(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    sget-object v0, Lcom/horcrux/svg/D;->E:[F

    iget v1, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    invoke-static {p1, v0, v1}, Lcom/horcrux/svg/F;->c(Lcom/facebook/react/bridge/ReadableArray;[FF)I

    move-result p1

    const/4 v1, 0x6

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    if-nez p1, :cond_0

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    const-string p1, "ReactNative"

    const-string v0, "RNSVG: Transform matrices must be of size 6"

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public E(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->n:Lcom/horcrux/svg/a$b;

    :goto_0
    iput-object p1, p0, Lcom/horcrux/svg/D;->v:Lcom/horcrux/svg/a$b;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->m:Lcom/horcrux/svg/a$b;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public F(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/D;->t:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public G(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/D;->r:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public H(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/D;->s:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method getViewBox()Landroid/graphics/RectF;
    .locals 7

    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lcom/horcrux/svg/D;->x:F

    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    mul-float v3, v1, v2

    iget v4, p0, Lcom/horcrux/svg/D;->y:F

    mul-float v5, v4, v2

    iget v6, p0, Lcom/horcrux/svg/D;->z:F

    add-float/2addr v1, v6

    mul-float/2addr v1, v2

    iget v6, p0, Lcom/horcrux/svg/D;->A:F

    add-float/2addr v4, v6

    mul-float/2addr v4, v2

    invoke-direct {v0, v3, v5, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method saveDefinition()V
    .locals 4

    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/horcrux/svg/D;->r:Lcom/horcrux/svg/SVGLength;

    iget-object v1, p0, Lcom/horcrux/svg/D;->s:Lcom/horcrux/svg/SVGLength;

    iget-object v2, p0, Lcom/horcrux/svg/D;->t:Lcom/horcrux/svg/SVGLength;

    iget-object v3, p0, Lcom/horcrux/svg/D;->u:Lcom/horcrux/svg/SVGLength;

    filled-new-array {v0, v1, v2, v3}, [Lcom/horcrux/svg/SVGLength;

    move-result-object v0

    new-instance v1, Lcom/horcrux/svg/a;

    sget-object v2, Lcom/horcrux/svg/a$a;->o:Lcom/horcrux/svg/a$a;

    iget-object v3, p0, Lcom/horcrux/svg/D;->v:Lcom/horcrux/svg/a$b;

    invoke-direct {v1, v2, v0, v3}, Lcom/horcrux/svg/a;-><init>(Lcom/horcrux/svg/a$a;[Lcom/horcrux/svg/SVGLength;Lcom/horcrux/svg/a$b;)V

    iget-object v0, p0, Lcom/horcrux/svg/D;->w:Lcom/horcrux/svg/a$b;

    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->d(Lcom/horcrux/svg/a$b;)V

    invoke-virtual {v1, p0}, Lcom/horcrux/svg/a;->g(Lcom/horcrux/svg/D;)V

    iget-object v0, p0, Lcom/horcrux/svg/D;->D:Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Lcom/horcrux/svg/a;->f(Landroid/graphics/Matrix;)V

    :cond_0
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    iget-object v2, p0, Lcom/horcrux/svg/D;->v:Lcom/horcrux/svg/a$b;

    sget-object v3, Lcom/horcrux/svg/a$b;->n:Lcom/horcrux/svg/a$b;

    if-eq v2, v3, :cond_1

    iget-object v2, p0, Lcom/horcrux/svg/D;->w:Lcom/horcrux/svg/a$b;

    if-ne v2, v3, :cond_2

    :cond_1
    invoke-virtual {v0}, Lcom/horcrux/svg/SvgView;->getCanvasBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/horcrux/svg/a;->h(Landroid/graphics/Rect;)V

    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/horcrux/svg/SvgView;->defineBrush(Lcom/horcrux/svg/a;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public setAlign(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/horcrux/svg/D;->B:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public setMeetOrSlice(I)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/D;->C:I

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public setMinX(F)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/D;->x:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public setMinY(F)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/D;->y:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public setVbHeight(F)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/D;->A:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public setVbWidth(F)V
    .locals 0

    iput p1, p0, Lcom/horcrux/svg/D;->z:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method
