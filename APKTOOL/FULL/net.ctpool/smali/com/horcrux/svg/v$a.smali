.class Lcom/horcrux/svg/v$a;
.super Lz1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/v;->u(Ly1/k;LJ1/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/horcrux/svg/v;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/v;)V
    .locals 0

    iput-object p1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    invoke-direct {p0}, Lz1/b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(LY0/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/v;->q(Lcom/horcrux/svg/v;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, LY0/c;->c()Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "RNSVG: fetchDecodedImage failed!"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "ReactNative"

    .line 20
    .line 21
    invoke-static {v2, p1, v0, v1}, LP0/a;->J(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public g(Landroid/graphics/Bitmap;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    iget-object v1, v0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v1, v0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    new-instance v8, Lcom/horcrux/svg/events/SvgLoadEvent;

    iget-object v1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    invoke-static {v1}, Lcom/facebook/react/uimanager/k0;->f(Landroid/view/View;)I

    move-result v2

    iget-object v1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v3

    iget-object v1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    iget-object v4, v1, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v1}, Lcom/horcrux/svg/v;->r(Lcom/horcrux/svg/v;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v6, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float v7, p1

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/horcrux/svg/events/SvgLoadEvent;-><init>(IILcom/facebook/react/bridge/ReactContext;Ljava/lang/String;FF)V

    invoke-interface {v0, v8}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    iget-object p1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    invoke-static {p1}, Lcom/horcrux/svg/v;->q(Lcom/horcrux/svg/v;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lcom/horcrux/svg/v$a;->a:Lcom/horcrux/svg/v;

    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->invalidate()V

    :cond_0
    return-void
.end method
