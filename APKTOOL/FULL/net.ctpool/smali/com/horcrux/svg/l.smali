.class abstract Lcom/horcrux/svg/l;
.super Lcom/horcrux/svg/d;
.source "SourceFile"


# instance fields
.field private m:Ljava/lang/String;

.field public final n:Lcom/horcrux/svg/FilterRegion;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/d;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    new-instance p1, Lcom/horcrux/svg/FilterRegion;

    invoke-direct {p1}, Lcom/horcrux/svg/FilterRegion;-><init>()V

    iput-object p1, p0, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    return-void
.end method

.method protected static s(Ljava/util/HashMap;Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    move-object p1, p0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public abstract q(Ljava/util/HashMap;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/l;->m:Ljava/lang/String;

    return-object v0
.end method

.method saveDefinition()V
    .locals 0

    return-void
.end method

.method public t(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setHeight(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/l;->m:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public v(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setWidth(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public w(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setX(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public x(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/l;->n:Lcom/horcrux/svg/FilterRegion;

    invoke-virtual {v0, p1}, Lcom/horcrux/svg/FilterRegion;->setY(Lcom/facebook/react/bridge/Dynamic;)V

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method
