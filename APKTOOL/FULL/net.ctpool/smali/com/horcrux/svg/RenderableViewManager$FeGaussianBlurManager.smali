.class Lcom/horcrux/svg/RenderableViewManager$FeGaussianBlurManager;
.super Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;
.source "SourceFile"

# interfaces
.implements LF2/G;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FeGaussianBlurManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager<",
        "Lcom/horcrux/svg/i;",
        ">;",
        "LF2/G;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFeGaussianBlur"


# direct methods
.method constructor <init>()V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFeGaussianBlur:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-direct {p0, v0}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    new-instance v0, LF2/F;

    invoke-direct {v0, p0}, LF2/F;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/horcrux/svg/VirtualViewManager;->mDelegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method


# virtual methods
.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setEdgeMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "values"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/i;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeGaussianBlurManager;->setEdgeMode(Lcom/horcrux/svg/i;Ljava/lang/String;)V

    return-void
.end method

.method public setEdgeMode(Lcom/horcrux/svg/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "values"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/i;->z(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "height"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/l;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setHeight(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setIn1(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "in1"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/i;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeGaussianBlurManager;->setIn1(Lcom/horcrux/svg/i;Ljava/lang/String;)V

    return-void
.end method

.method public setIn1(Lcom/horcrux/svg/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "in1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/i;->A(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setResult(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "result"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/l;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setResult(Lcom/horcrux/svg/l;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setStdDeviationX(Landroid/view/View;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "stdDeviationX"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/i;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeGaussianBlurManager;->setStdDeviationX(Lcom/horcrux/svg/i;F)V

    return-void
.end method

.method public setStdDeviationX(Lcom/horcrux/svg/i;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "stdDeviationX"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/i;->B(F)V

    return-void
.end method

.method public bridge synthetic setStdDeviationY(Landroid/view/View;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "stdDeviationY"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/i;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeGaussianBlurManager;->setStdDeviationY(Lcom/horcrux/svg/i;F)V

    return-void
.end method

.method public setStdDeviationY(Lcom/horcrux/svg/i;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "stdDeviationY"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/i;->C(F)V

    return-void
.end method

.method public bridge synthetic setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "width"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/l;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setWidth(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "x"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/l;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setX(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "y"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/l;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;->setY(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
