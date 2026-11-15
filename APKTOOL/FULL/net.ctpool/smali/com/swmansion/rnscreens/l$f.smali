.class public final Lcom/swmansion/rnscreens/l$f;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/rnscreens/l;->m(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/facebook/react/bridge/ReactContext;

.field final synthetic n:Lcom/swmansion/rnscreens/l;

.field final synthetic o:I

.field final synthetic p:I


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReactContext;Lcom/swmansion/rnscreens/l;IILcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/l$f;->m:Lcom/facebook/react/bridge/ReactContext;

    iput-object p2, p0, Lcom/swmansion/rnscreens/l$f;->n:Lcom/swmansion/rnscreens/l;

    iput p3, p0, Lcom/swmansion/rnscreens/l$f;->o:I

    iput p4, p0, Lcom/swmansion/rnscreens/l$f;->p:I

    invoke-direct {p0, p5}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 4

    iget-object v0, p0, Lcom/swmansion/rnscreens/l$f;->m:Lcom/facebook/react/bridge/ReactContext;

    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/UIManagerModule;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/swmansion/rnscreens/l$f;->n:Lcom/swmansion/rnscreens/l;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    iget v2, p0, Lcom/swmansion/rnscreens/l$f;->o:I

    iget v3, p0, Lcom/swmansion/rnscreens/l$f;->p:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/UIManagerModule;->updateNodeSize(III)V

    :cond_0
    return-void
.end method
