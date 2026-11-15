.class Lcom/horcrux/svg/g;
.super Lcom/horcrux/svg/RenderableView;
.source "SourceFile"


# instance fields
.field private m:Lcom/horcrux/svg/SVGLength;

.field private n:Lcom/horcrux/svg/SVGLength;

.field private o:Lcom/horcrux/svg/SVGLength;

.field private p:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 20

    move-object/from16 v0, p0

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iget-object v2, v0, Lcom/horcrux/svg/g;->m:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v2

    iget-object v4, v0, Lcom/horcrux/svg/g;->n:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v4

    iget-object v6, v0, Lcom/horcrux/svg/g;->o:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v6

    iget-object v8, v0, Lcom/horcrux/svg/g;->p:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {v0, v8}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    move-result-wide v8

    new-instance v10, Landroid/graphics/RectF;

    sub-double v11, v2, v6

    double-to-float v13, v11

    sub-double v14, v4, v8

    move-wide/from16 p1, v11

    double-to-float v11, v14

    add-double/2addr v6, v2

    double-to-float v12, v6

    add-double/2addr v8, v4

    move-wide/from16 v16, v4

    double-to-float v4, v8

    invoke-direct {v10, v13, v11, v12, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v1, v10, v4}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    new-instance v5, Lcom/horcrux/svg/A;

    sget-object v10, Lcom/horcrux/svg/f;->o:Lcom/horcrux/svg/f;

    new-instance v11, Lcom/horcrux/svg/E;

    invoke-direct {v11, v2, v3, v14, v15}, Lcom/horcrux/svg/E;-><init>(DD)V

    filled-new-array {v11}, [Lcom/horcrux/svg/E;

    move-result-object v11

    invoke-direct {v5, v10, v11}, Lcom/horcrux/svg/A;-><init>(Lcom/horcrux/svg/f;[Lcom/horcrux/svg/E;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    new-instance v5, Lcom/horcrux/svg/A;

    sget-object v10, Lcom/horcrux/svg/f;->p:Lcom/horcrux/svg/f;

    new-instance v11, Lcom/horcrux/svg/E;

    invoke-direct {v11, v2, v3, v14, v15}, Lcom/horcrux/svg/E;-><init>(DD)V

    new-instance v12, Lcom/horcrux/svg/E;

    move-wide/from16 v18, v14

    move-wide/from16 v13, v16

    invoke-direct {v12, v6, v7, v13, v14}, Lcom/horcrux/svg/E;-><init>(DD)V

    filled-new-array {v11, v12}, [Lcom/horcrux/svg/E;

    move-result-object v11

    invoke-direct {v5, v10, v11}, Lcom/horcrux/svg/A;-><init>(Lcom/horcrux/svg/f;[Lcom/horcrux/svg/E;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    new-instance v5, Lcom/horcrux/svg/A;

    new-instance v11, Lcom/horcrux/svg/E;

    invoke-direct {v11, v6, v7, v13, v14}, Lcom/horcrux/svg/E;-><init>(DD)V

    new-instance v6, Lcom/horcrux/svg/E;

    invoke-direct {v6, v2, v3, v8, v9}, Lcom/horcrux/svg/E;-><init>(DD)V

    filled-new-array {v11, v6}, [Lcom/horcrux/svg/E;

    move-result-object v6

    invoke-direct {v5, v10, v6}, Lcom/horcrux/svg/A;-><init>(Lcom/horcrux/svg/f;[Lcom/horcrux/svg/E;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    new-instance v5, Lcom/horcrux/svg/A;

    new-instance v6, Lcom/horcrux/svg/E;

    invoke-direct {v6, v2, v3, v8, v9}, Lcom/horcrux/svg/E;-><init>(DD)V

    new-instance v7, Lcom/horcrux/svg/E;

    move-wide/from16 v8, p1

    invoke-direct {v7, v8, v9, v13, v14}, Lcom/horcrux/svg/E;-><init>(DD)V

    filled-new-array {v6, v7}, [Lcom/horcrux/svg/E;

    move-result-object v6

    invoke-direct {v5, v10, v6}, Lcom/horcrux/svg/A;-><init>(Lcom/horcrux/svg/f;[Lcom/horcrux/svg/E;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    new-instance v5, Lcom/horcrux/svg/A;

    new-instance v6, Lcom/horcrux/svg/E;

    invoke-direct {v6, v8, v9, v13, v14}, Lcom/horcrux/svg/E;-><init>(DD)V

    new-instance v7, Lcom/horcrux/svg/E;

    move-wide/from16 v8, v18

    invoke-direct {v7, v2, v3, v8, v9}, Lcom/horcrux/svg/E;-><init>(DD)V

    filled-new-array {v6, v7}, [Lcom/horcrux/svg/E;

    move-result-object v2

    invoke-direct {v5, v10, v2}, Lcom/horcrux/svg/A;-><init>(Lcom/horcrux/svg/f;[Lcom/horcrux/svg/E;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public q(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/g;->m:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public r(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/g;->n:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public s(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/g;->o:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public t(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/g;->p:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method
