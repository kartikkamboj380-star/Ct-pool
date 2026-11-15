.class Lcom/horcrux/svg/RenderableViewManager$FeColorMatrixManager;
.super Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;
.source "SourceFile"

# interfaces
.implements LF2/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/RenderableViewManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FeColorMatrixManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager<",
        "Lcom/horcrux/svg/h;",
        ">;",
        "LF2/E;"
    }
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RNSVGFeColorMatrix"


# direct methods
.method constructor <init>()V
    .locals 1

    sget-object v0, Lcom/horcrux/svg/VirtualViewManager$SVGClass;->RNSVGFeColorMatrix:Lcom/horcrux/svg/VirtualViewManager$SVGClass;

    invoke-direct {p0, v0}, Lcom/horcrux/svg/RenderableViewManager$FilterPrimitiveManager;-><init>(Lcom/horcrux/svg/VirtualViewManager$SVGClass;)V

    new-instance v0, LF2/D;

    invoke-direct {v0, p0}, LF2/D;-><init>(Lcom/facebook/react/uimanager/g;)V

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
    check-cast p1, Lcom/horcrux/svg/h;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeColorMatrixManager;->setIn1(Lcom/horcrux/svg/h;Ljava/lang/String;)V

    return-void
.end method

.method public setIn1(Lcom/horcrux/svg/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "in1"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h;->y(Ljava/lang/String;)V

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

.method public bridge synthetic setType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "type"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/h;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeColorMatrixManager;->setType(Lcom/horcrux/svg/h;Ljava/lang/String;)V

    return-void
.end method

.method public setType(Lcom/horcrux/svg/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "type"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h;->z(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setValues(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "values"
    .end annotation

    .line 1
    check-cast p1, Lcom/horcrux/svg/h;

    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/RenderableViewManager$FeColorMatrixManager;->setValues(Lcom/horcrux/svg/h;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setValues(Lcom/horcrux/svg/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "values"
    .end annotation

    .line 2
    invoke-virtual {p1, p2}, Lcom/horcrux/svg/h;->A(Lcom/facebook/react/bridge/ReadableArray;)V

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
