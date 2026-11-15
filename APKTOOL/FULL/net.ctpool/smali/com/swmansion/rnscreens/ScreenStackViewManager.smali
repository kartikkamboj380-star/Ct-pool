.class public final Lcom/swmansion/rnscreens/ScreenStackViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenStackViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/t;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSScreenStack"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenStackViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreenStack"


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/A0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenStackViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenStackViewManager;->Companion:Lcom/swmansion/rnscreens/ScreenStackViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/s;

    invoke-direct {v0, p0}, LF2/s;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method

.method private final prepareOutTransition(Lcom/swmansion/rnscreens/l;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/l;->k()V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->addView(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->addView(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/swmansion/rnscreens/t;Landroid/view/View;I)V
    .locals 2

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/swmansion/rnscreens/l;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/h;->a:Lcom/swmansion/rnscreens/h$a;

    check-cast p2, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p2}, Lcom/swmansion/rnscreens/h$a;->a(ILcom/swmansion/rnscreens/l;)V

    invoke-virtual {p1, p2, p3}, Lcom/swmansion/rnscreens/n;->d(Lcom/swmansion/rnscreens/l;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Attempt attach child that is not of type RNScreen"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/U;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;

    move-result-object p1

    return-object p1
.end method

.method public createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/G;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/G;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/t;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/t;
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/t;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/t;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->getChildAt(Lcom/swmansion/rnscreens/t;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->getChildAt(Lcom/swmansion/rnscreens/t;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/swmansion/rnscreens/t;I)Landroid/view/View;
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/n;->l(I)Lcom/swmansion/rnscreens/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/View;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->getChildCount(Lcom/swmansion/rnscreens/t;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->getChildCount(Lcom/swmansion/rnscreens/t;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/swmansion/rnscreens/t;)I
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->getScreenCount()I

    move-result p1

    return p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "registrationName"

    const-string v1, "onFinishTransitioning"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {v0}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->j([Li5/l;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "topFinishTransitioning"

    invoke-static {v1, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {v0}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->j([Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreenStack"

    return-object v0
.end method

.method public invalidate()V
    .locals 1

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->invalidate()V

    sget-object v0, Lcom/swmansion/rnscreens/h;->a:Lcom/swmansion/rnscreens/h$a;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/h$a;->b()V

    return-void
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->removeViewAt(Lcom/swmansion/rnscreens/t;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->removeViewAt(Lcom/swmansion/rnscreens/t;I)V

    return-void
.end method

.method public removeViewAt(Lcom/swmansion/rnscreens/t;I)V
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/n;->l(I)Lcom/swmansion/rnscreens/l;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/ScreenStackViewManager;->prepareOutTransition(Lcom/swmansion/rnscreens/l;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/t;->y(I)V

    sget-object p1, Lcom/swmansion/rnscreens/h;->a:Lcom/swmansion/rnscreens/h$a;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/h$a;->c(I)V

    return-void
.end method
