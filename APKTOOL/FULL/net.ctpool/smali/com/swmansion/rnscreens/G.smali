.class public final Lcom/swmansion/rnscreens/G;
.super Lcom/facebook/react/uimanager/v;
.source "SourceFile"


# instance fields
.field private A:Lcom/facebook/react/bridge/ReactContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/v;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/G;->A:Lcom/facebook/react/bridge/ReactContext;

    return-void
.end method

.method public static synthetic x1(Lcom/swmansion/rnscreens/G;Lcom/facebook/react/uimanager/C;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/G;->y1(Lcom/swmansion/rnscreens/G;Lcom/facebook/react/uimanager/C;)V

    return-void
.end method

.method private static final y1(Lcom/swmansion/rnscreens/G;Lcom/facebook/react/uimanager/C;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeViewHierarchyManager"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/V;->r()I

    move-result p0

    invoke-virtual {p1, p0}, Lcom/facebook/react/uimanager/C;->v(I)Landroid/view/View;

    move-result-object p0

    instance-of p1, p0, Lcom/swmansion/rnscreens/n;

    if-eqz p1, :cond_0

    check-cast p0, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/n;->u()V

    :cond_0
    return-void
.end method


# virtual methods
.method public W(Lcom/facebook/react/uimanager/D;)V
    .locals 1

    .line 1
    const-string v0, "nativeViewHierarchyOptimizer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/V;->W(Lcom/facebook/react/uimanager/D;)V

    iget-object p1, p0, Lcom/swmansion/rnscreens/G;->A:Lcom/facebook/react/bridge/ReactContext;

    const-class v0, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/swmansion/rnscreens/F;

    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/F;-><init>(Lcom/swmansion/rnscreens/G;)V

    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/UIManagerModule;->addUIBlock(Lcom/facebook/react/uimanager/i0;)V

    :cond_0
    return-void
.end method
