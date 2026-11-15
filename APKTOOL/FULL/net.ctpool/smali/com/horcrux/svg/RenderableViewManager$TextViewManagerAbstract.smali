.class Lcom/horcrux/svg/RenderableViewManager$TextViewManagerAbstract;
.super Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TextViewManagerAbstract"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Lcom/horcrux/svg/h0;",
        ">",
        "Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract<",
        "TK;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableViewManager$GroupViewManagerAbstract;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public setAlignmentBaseline(Lcom/horcrux/svg/h0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->M(Ljava/lang/String;)V

    return-void
.end method

.method public setBaselineShift(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "baselineShift"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->H(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDx(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "dx"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->I(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setDy(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "dy"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->J(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setFont(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "font"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/u;->y(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setFont(Lcom/horcrux/svg/u;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "font"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/h0;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$TextViewManagerAbstract;->setFont(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setInlineSize(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "inlineSize"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->K(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setLengthAdjust(Lcom/horcrux/svg/h0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "lengthAdjust"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->L(Ljava/lang/String;)V

    return-void
.end method

.method public setMethod(Lcom/horcrux/svg/h0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "alignmentBaseline"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->M(Ljava/lang/String;)V

    return-void
.end method

.method public setRotate(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "rotate"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->P(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setTextLength(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "textLength"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->Q(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setVerticalAlign(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "verticalAlign"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->R(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "x"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->N(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY(Lcom/horcrux/svg/h0;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "y"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h0;->O(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
