.class Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;
.super Lcom/horcrux/svg/VirtualViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FilterPrimitiveManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/horcrux/svg/l;",
        ">",
        "Lcom/horcrux/svg/VirtualViewManager<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/VirtualViewManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public setHeight(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "height"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->t(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setResult(Lcom/horcrux/svg/l;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "result"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->u(Ljava/lang/String;)V

    return-void
.end method

.method public setWidth(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "width"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->v(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "x"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->w(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY(Lcom/horcrux/svg/l;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/facebook/react/bridge/Dynamic;",
            ")V"
        }
    .end annotation

    .annotation runtime Lx2/a;
        name = "y"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/horcrux/svg/l;->x(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
