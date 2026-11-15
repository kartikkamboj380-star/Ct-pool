.class public final Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/th3rdwave/safeareacontext/f;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNCSafeAreaProvider"
.end annotation


# static fields
.field public static final Companion:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNCSafeAreaProvider"


# instance fields
.field private final mDelegate:LF2/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF2/k;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->Companion:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/k;

    invoke-direct {v0, p0}, LF2/k;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->mDelegate:LF2/k;

    return-void
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/th3rdwave/safeareacontext/f;

    invoke-virtual {p0, p1, p2}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/th3rdwave/safeareacontext/f;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/th3rdwave/safeareacontext/f;)V
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/ViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V

    sget-object p1, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;->v:Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$b;

    invoke-virtual {p2, p1}, Lcom/th3rdwave/safeareacontext/f;->setOnInsetsChangeHandler(Lv5/q;)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/th3rdwave/safeareacontext/f;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/th3rdwave/safeareacontext/f;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/th3rdwave/safeareacontext/f;

    invoke-direct {v0, p1}, Lcom/th3rdwave/safeareacontext/f;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method protected getDelegate()LF2/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LF2/k;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->mDelegate:LF2/k;

    return-object v0
.end method

.method public bridge synthetic getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;->getDelegate()LF2/k;

    move-result-object v0

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "registrationName"

    const-string v1, "onInsetsChange"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    filled-new-array {v0}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->j([Li5/l;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "topInsetsChange"

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

    const-string v0, "RNCSafeAreaProvider"

    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method
