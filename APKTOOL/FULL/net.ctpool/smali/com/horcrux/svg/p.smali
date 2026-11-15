.class Lcom/horcrux/svg/p;
.super Lcom/horcrux/svg/d;
.source "SourceFile"


# instance fields
.field private final m:Ljava/util/HashMap;

.field private n:Lcom/horcrux/svg/o;

.field private o:Lcom/horcrux/svg/o;

.field private final p:Lcom/horcrux/svg/FilterRegion;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/d;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    new-instance p1, Lcom/horcrux/svg/FilterRegion;

    invoke-direct {p1}, Lcom/horcrux/svg/FilterRegion;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    return-void
.end method


# virtual methods
.method public q(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/RectF;)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    const-string v1, "SourceGraphic"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    const-string v1, "SourceAlpha"

    invoke-static {p1}, Lcom/horcrux/svg/FilterUtils;->applySourceAlphaFilter(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    const-string v1, "BackgroundImage"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    const-string v1, "BackgroundAlpha"

    invoke-static {p2}, Lcom/horcrux/svg/FilterUtils;->applySourceAlphaFilter(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-static {p2, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v5, v3, Lcom/horcrux/svg/l;

    if-eqz v5, :cond_0

    check-cast v3, Lcom/horcrux/svg/l;

    invoke-virtual {p2, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v5, v3, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    iget-object v6, p0, Lcom/horcrux/svg/p;->o:Lcom/horcrux/svg/o;

    invoke-virtual {v5, v3, v6, p3}, Lcom/horcrux/svg/FilterRegion;->getCropRect(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/o;Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object v5

    iget-object v6, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    invoke-virtual {v3, v6, p1}, Lcom/horcrux/svg/l;->q(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v4, 0x1

    invoke-virtual {p2, p1, v4}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v3}, Lcom/horcrux/svg/l;->r()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/horcrux/svg/p;->m:Ljava/util/HashMap;

    invoke-virtual {v4, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    const-string v3, "RNSVG"

    const-string v4, "Invalid `Filter` child: Filter children can only be `Fe...` components"

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v1, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    iget-object v2, p0, Lcom/horcrux/svg/p;->n:Lcom/horcrux/svg/o;

    invoke-virtual {v1, p0, v2, p3}, Lcom/horcrux/svg/FilterRegion;->getCropRect(Lcom/horcrux/svg/VirtualView;Lcom/horcrux/svg/o;Landroid/graphics/RectF;)Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {v0, p1, p3, p3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-object p2
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/o;->h(Ljava/lang/String;)Lcom/horcrux/svg/o;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/p;->n:Lcom/horcrux/svg/o;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public s(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setHeight(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method saveDefinition()V
    .locals 2

    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lcom/horcrux/svg/SvgView;->defineFilter(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/o;->h(Ljava/lang/String;)Lcom/horcrux/svg/o;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/p;->o:Lcom/horcrux/svg/o;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public u(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setWidth(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public v(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setX(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public w(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/p;->p:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setY(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method
