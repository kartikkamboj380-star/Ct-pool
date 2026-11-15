.class Lcom/horcrux/svg/i;
.super Lcom/horcrux/svg/l;
.source "SourceFile"


# instance fields
.field o:Ljava/lang/String;

.field p:F

.field q:F

.field r:Lcom/horcrux/svg/m;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/l;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method

.method private y(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    iget v0, p0, Lcom/horcrux/svg/i;->p:F

    iget v1, p0, Lcom/horcrux/svg/i;->q:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gtz v1, :cond_0

    return-object p2

    :cond_0
    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p1

    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v2

    invoke-static {p1, p2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object v3

    invoke-static {p1, v1}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object v4

    invoke-virtual {v2, v0}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    invoke-virtual {v2, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    invoke-virtual {v2, v4}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    invoke-virtual {v4, v1}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    invoke-virtual {v3}, Landroid/renderscript/Allocation;->destroy()V

    invoke-virtual {v4}, Landroid/renderscript/Allocation;->destroy()V

    invoke-virtual {p1}, Landroid/renderscript/RenderScript;->destroy()V

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    const/4 v0, 0x0

    invoke-static {v1, p1, p2, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/i;->o:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public B(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/i;->p:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public C(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/horcrux/svg/i;->q:F

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public q(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/i;->o:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lcom/horcrux/svg/l;->s(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/horcrux/svg/i;->y(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/m;->h(Ljava/lang/String;)Lcom/horcrux/svg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/i;->r:Lcom/horcrux/svg/m;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method
