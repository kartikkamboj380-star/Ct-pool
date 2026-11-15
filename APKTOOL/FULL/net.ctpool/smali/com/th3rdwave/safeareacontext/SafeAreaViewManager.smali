.class public final Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;
.super Lcom/facebook/react/views/view/ReactViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/view/ReactViewManager;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNCSafeAreaView"
.end annotation


# static fields
.field public static final Companion:Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNCSafeAreaView"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->Companion:Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->createShadowNodeInstance()Lcom/th3rdwave/safeareacontext/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->createShadowNodeInstance()Lcom/th3rdwave/safeareacontext/p;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/th3rdwave/safeareacontext/p;
    .locals 1

    .line 3
    new-instance v0, Lcom/th3rdwave/safeareacontext/p;

    invoke-direct {v0}, Lcom/th3rdwave/safeareacontext/p;-><init>()V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/th3rdwave/safeareacontext/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/view/i;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/th3rdwave/safeareacontext/k;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/th3rdwave/safeareacontext/k;
    .locals 1

    .line 3
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/th3rdwave/safeareacontext/k;

    invoke-direct {v0, p1}, Lcom/th3rdwave/safeareacontext/k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNCSafeAreaView"

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/th3rdwave/safeareacontext/p;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/th3rdwave/safeareacontext/p;

    return-object v0
.end method

.method public bridge synthetic setEdges(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/th3rdwave/safeareacontext/k;

    invoke-virtual {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->setEdges(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setEdges(Lcom/th3rdwave/safeareacontext/k;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 5
    .annotation runtime Lx2/a;
        name = "edges"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_8

    const-string v0, "top"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    if-eqz v0, :cond_0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/th3rdwave/safeareacontext/l;->valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/l;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    :cond_1
    const-string v2, "right"

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/th3rdwave/safeareacontext/l;->valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/l;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_2
    sget-object v2, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    :cond_3
    const-string v3, "bottom"

    invoke-interface {p2, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/th3rdwave/safeareacontext/l;->valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/l;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_4
    sget-object v3, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    :cond_5
    const-string v4, "left"

    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/th3rdwave/safeareacontext/l;->valueOf(Ljava/lang/String;)Lcom/th3rdwave/safeareacontext/l;

    move-result-object p2

    if-nez p2, :cond_7

    :cond_6
    sget-object p2, Lcom/th3rdwave/safeareacontext/l;->m:Lcom/th3rdwave/safeareacontext/l;

    :cond_7
    new-instance v1, Lcom/th3rdwave/safeareacontext/m;

    invoke-direct {v1, v0, v2, v3, p2}, Lcom/th3rdwave/safeareacontext/m;-><init>(Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;Lcom/th3rdwave/safeareacontext/l;)V

    invoke-virtual {p1, v1}, Lcom/th3rdwave/safeareacontext/k;->setEdges(Lcom/th3rdwave/safeareacontext/m;)V

    :cond_8
    return-void
.end method

.method public bridge synthetic setMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/th3rdwave/safeareacontext/k;

    invoke-virtual {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->setMode(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V

    return-void
.end method

.method public setMode(Lcom/th3rdwave/safeareacontext/k;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "mode"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/th3rdwave/safeareacontext/o;->m:Lcom/th3rdwave/safeareacontext/o;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/th3rdwave/safeareacontext/k;->setMode(Lcom/th3rdwave/safeareacontext/o;)V

    goto :goto_1

    :cond_0
    const-string v0, "margin"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/th3rdwave/safeareacontext/o;->n:Lcom/th3rdwave/safeareacontext/o;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;->updateState(Lcom/facebook/react/views/view/i;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/view/i;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/th3rdwave/safeareacontext/k;

    invoke-virtual {p1, p3}, Lcom/th3rdwave/safeareacontext/k;->setStateWrapper(Lcom/facebook/react/uimanager/d0;)V

    const/4 p1, 0x0

    return-object p1
.end method
