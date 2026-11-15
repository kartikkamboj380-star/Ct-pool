.class public final Lcom/swmansion/rnscreens/ScreenContainerViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/n;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSScreenContainer"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreenContainer"


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

    new-instance v0, Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->Companion:Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/l;

    invoke-direct {v0, p0}, LF2/l;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->addView(Lcom/swmansion/rnscreens/n;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->addView(Lcom/swmansion/rnscreens/n;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/swmansion/rnscreens/n;Landroid/view/View;I)V
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/swmansion/rnscreens/l;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p1, p2, p3}, Lcom/swmansion/rnscreens/n;->d(Lcom/swmansion/rnscreens/l;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Attempt attach child that is not of type RNScreens"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/U;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->createShadowNodeInstance(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/v;

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
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/n;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/n;
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/n;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/n;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->getChildAt(Lcom/swmansion/rnscreens/n;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->getChildAt(Lcom/swmansion/rnscreens/n;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/swmansion/rnscreens/n;I)Landroid/view/View;
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
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->getChildCount(Lcom/swmansion/rnscreens/n;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->getChildCount(Lcom/swmansion/rnscreens/n;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/swmansion/rnscreens/n;)I
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

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreenContainer"

    return-object v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->removeAllViews(Lcom/swmansion/rnscreens/n;)V

    return-void
.end method

.method public removeAllViews(Lcom/swmansion/rnscreens/n;)V
    .locals 1

    .line 2
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->w()V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->removeViewAt(Lcom/swmansion/rnscreens/n;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/n;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;->removeViewAt(Lcom/swmansion/rnscreens/n;I)V

    return-void
.end method

.method public removeViewAt(Lcom/swmansion/rnscreens/n;I)V
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/n;->y(I)V

    return-void
.end method
