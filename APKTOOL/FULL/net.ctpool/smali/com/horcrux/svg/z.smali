.class Lcom/horcrux/svg/z;
.super Lcom/horcrux/svg/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/z$a;
    }
.end annotation


# instance fields
.field r:Lcom/horcrux/svg/SVGLength;

.field s:Lcom/horcrux/svg/SVGLength;

.field t:Lcom/horcrux/svg/SVGLength;

.field u:Lcom/horcrux/svg/SVGLength;

.field private v:Lcom/horcrux/svg/a$b;

.field private w:Lcom/horcrux/svg/a$b;

.field x:Lcom/horcrux/svg/z$a;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/horcrux/svg/u;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public B()Lcom/horcrux/svg/z$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/z;->x:Lcom/horcrux/svg/z$a;

    return-object v0
.end method

.method public C(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/z;->u:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public D(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->n:Lcom/horcrux/svg/a$b;

    :goto_0
    iput-object p1, p0, Lcom/horcrux/svg/z;->w:Lcom/horcrux/svg/a$b;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->m:Lcom/horcrux/svg/a$b;

    goto :goto_0

    :goto_1
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
    sget-object p1, Lcom/horcrux/svg/z$a;->n:Lcom/horcrux/svg/z$a;

    :goto_0
    iput-object p1, p0, Lcom/horcrux/svg/z;->x:Lcom/horcrux/svg/z$a;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/horcrux/svg/z$a;->m:Lcom/horcrux/svg/z$a;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public F(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object p1, Lcom/horcrux/svg/a$b;->n:Lcom/horcrux/svg/a$b;

    :goto_0
    iput-object p1, p0, Lcom/horcrux/svg/z;->v:Lcom/horcrux/svg/a$b;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/horcrux/svg/a$b;->m:Lcom/horcrux/svg/a$b;

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public G(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/z;->t:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public H(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/z;->r:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method public I(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    move-result-object p1

    iput-object p1, p0, Lcom/horcrux/svg/z;->s:Lcom/horcrux/svg/SVGLength;

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    return-void
.end method

.method saveDefinition()V
    .locals 2

    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object v0

    iget-object v1, p0, Lcom/horcrux/svg/VirtualView;->mName:Ljava/lang/String;

    invoke-virtual {v0, p0, v1}, Lcom/horcrux/svg/SvgView;->defineMask(Lcom/horcrux/svg/VirtualView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
