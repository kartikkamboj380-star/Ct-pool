.class Lcom/horcrux/svg/RenderableViewManager$FilterManager;
.super Lcom/horcrux/svg/VirtualViewManager;
.source "SourceFile"

# interfaces
.implements LF2/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FilterManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/VirtualViewManager<",
        "Lcom/horcrux/svg/p;",
        ">;",
        "LF2/M;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFilter"


# direct methods
.method constructor <init>()V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFilter:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-direct {p0, v0}, Lcom/horcrux/svg/VirtualViewManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    new-instance v0, LF2/L;

    invoke-direct {v0, p0}, LF2/L;-><init>(Lcom/facebook/react/uimanager/g;)V

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

.method public bridge synthetic setFilterUnits(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "filterUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setFilterUnits(Lcom/horcrux/svg/p;Ljava/lang/String;)V

    return-void
.end method

.method public setFilterUnits(Lcom/horcrux/svg/p;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "filterUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->r(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "height"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setHeight(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setHeight(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "height"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->s(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setName(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "name"
    .end annotation

    check-cast p1, Lcom/horcrux/svg/VirtualView;

    invoke-super {p0, p1, p2}, Lcom/horcrux/svg/VirtualViewManager;->setName(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPrimitiveUnits(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "primitiveUnits"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setPrimitiveUnits(Lcom/horcrux/svg/p;Ljava/lang/String;)V

    return-void
.end method

.method public setPrimitiveUnits(Lcom/horcrux/svg/p;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "primitiveUnits"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->t(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "width"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setWidth(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setWidth(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "width"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->u(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setX(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "x"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setX(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setX(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "x"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->v(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public bridge synthetic setY(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "y"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/p;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FilterManager;->setY(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setY(Lcom/horcrux/svg/p;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "y"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/p;->w(Lcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method
